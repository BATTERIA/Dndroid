package master.flame.danmaku.danmaku.model.android;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.util.DanmakuUtils;

/**
 * Created by ch on 15-7-16.
 */
public class SimpleTextCacheStuffer extends BaseCacheStuffer {

    private final static Map<Float, Pair<Float, Float>> sTextHeightCache = new HashMap<>();

    protected Pair<Float, Float> getCacheHeight(BaseDanmaku danmaku, Paint paint, float spacingMult) {
        Float textSize = paint.getTextSize();
        Pair<Float, Float> textHeightAndBottomPadding = sTextHeightCache.get(textSize);
        if (textHeightAndBottomPadding == null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            Float textHeight = fontMetrics.bottom - fontMetrics.top + fontMetrics.leading + paint.getStrokeWidth();
            Float bottomPadding = 0f;
            if (spacingMult != 0f) {
                bottomPadding = textHeight * spacingMult;
                if (-bottomPadding < -fontMetrics.top) {
                    textHeight += bottomPadding;
                } else {
                    bottomPadding = 0f;
                }
            }
            textHeightAndBottomPadding = new Pair<>(textHeight, bottomPadding);
            sTextHeightCache.put(textSize, textHeightAndBottomPadding);
        }
        return textHeightAndBottomPadding;
    }

    @Override
    public void measure(IDisplayer displayer, BaseDanmaku danmaku, TextPaint paint, boolean fromWorkerThread) {
        float w = 0;
        Float textHeight = 0f;
        if (danmaku.lines == null) {
            if (danmaku.text == null) {
                w = 0;
            } else {
                w = paint.measureText(danmaku.text.toString());
                Pair<Float, Float> textHeightAndBottomPadding = getCacheHeight(danmaku, paint, displayer.getFontSpacingMult());
                textHeight = textHeightAndBottomPadding.first;
            }
            danmaku.paintWidth = w;
            danmaku.paintHeight = textHeight;
        } else {
            Pair<Float, Float> textHeightAndBottomPadding  = getCacheHeight(danmaku, paint, displayer.getFontSpacingMult());
            textHeight = textHeightAndBottomPadding.first;
            for (String tempStr : danmaku.lines) {
                if (tempStr.length() > 0) {
                    float tr = paint.measureText(tempStr);
                    w = Math.max(tr, w);
                }
            }
            danmaku.paintWidth = w;
            danmaku.paintHeight = danmaku.lines.length * textHeight;
        }
    }

    protected void drawStroke(BaseDanmaku danmaku, String lineText, Canvas canvas, float left, float top, Paint paint, boolean fromWorkerThread) {
        if (lineText != null) {
            canvas.drawText(lineText, left, top, paint);
        } else {
            canvas.drawText(danmaku.text.toString(), left, top, paint);
        }
    }

    protected void drawText(IDisplayer displayer, AndroidDisplayer.DisplayerConfig displayerConfig, BaseDanmaku danmaku, String lineText, Canvas canvas, float left, float top, TextPaint paint, boolean fromWorkerThread) {
//        LinearGradient mLinearGradient = new LinearGradient(0, 0, 6, 0,
//                new int[]{0xFFAC97EB, 0xFF99CCFF, 0xFF8DFF86, 0xFFFFD986, 0xFFCF80FF, 0xffBF8BF9},
//                null, Shader.TileMode.REPEAT);
//        ==== test code =================================
//        danmaku.shader = new BaseDanmaku.LinearGradientShader(90,
//                new int[]{0xFFAC97EB, 0xFF99CCFF, 0xff8DFF86, 0xffFFD986, 0xffCF80FF, 0xffBF8BF9},
//                new float[]{0f, 0.2f, 0.4f, 0.6f, 0.81f, 1f});
//        danmaku.borderColor = 0xffff0000;
        if (danmaku.shader != null) {
            float bottomPadding = 0f;
            Pair<Float, Float> textHeightAndBottomPadding = sTextHeightCache.get(paint.getTextSize());
            if (textHeightAndBottomPadding != null) {
                bottomPadding = textHeightAndBottomPadding.second;
            }
            float padding = 2 * danmaku.padding;
            LinearGradient linearGradientShader = DanmakuUtils.convertToLinearGradient(danmaku.shader, danmaku.paintWidth - padding, danmaku.paintHeight - bottomPadding - padding);
            paint.setShader(linearGradientShader);
        }
        if (fromWorkerThread) {
            paint.setAlpha(255);  // 缓存的字体全部使用drawBitmap的透明度paint
        }
        if (lineText != null) {
            canvas.drawText(lineText, left, top, paint);
        } else {
            canvas.drawText(danmaku.text.toString(), left, top, paint);
        }
        if (danmaku.shader != null) {
            paint.setShader(null);
        }
    }

    @Override
    public void clearCaches() {
        sTextHeightCache.clear();
    }

    protected void drawBackground(BaseDanmaku danmaku, Canvas canvas, float left, float top) {

    }

    @Override
    public void drawDanmaku(IDisplayer displayer, BaseDanmaku danmaku, Canvas canvas, float left, float top, boolean fromWorkerThread, AndroidDisplayer.DisplayerConfig displayerConfig) {
        float _left = left;
        float _top = top;
        left += danmaku.padding;
        top += danmaku.padding;
        if (displayerConfig.hasStroke(danmaku) && !(danmaku.text instanceof SpannableString)) {
            top += displayerConfig.getStrokeWidth();
        }
        if (danmaku.borderColor != 0) {
            left += displayerConfig.BORDER_WIDTH;
            top += displayerConfig.BORDER_WIDTH;
        }

        displayerConfig.definePaintParams(fromWorkerThread);
        TextPaint paint = displayerConfig.getPaint(danmaku, fromWorkerThread);
        drawBackground(danmaku, canvas, _left, _top);
        if (danmaku.lines != null) {
            String[] lines = danmaku.lines;
            if (lines.length == 1) {
                if (displayerConfig.hasStroke(danmaku)) {
                    displayerConfig.applyPaintConfig(danmaku, paint, true);
                    float strokeLeft = left;
                    float strokeTop = top - paint.getFontMetrics().top;
                    if (displayerConfig.HAS_PROJECTION) {
                        strokeLeft += displayerConfig.sProjectionOffsetX;
                        strokeTop += displayerConfig.sProjectionOffsetY;
                    }
                    drawStroke(danmaku, lines[0], canvas, strokeLeft, strokeTop, paint, fromWorkerThread);
                }
                displayerConfig.applyPaintConfig(danmaku, paint, false);
                drawText(displayer, displayerConfig, danmaku, lines[0], canvas, left, top - paint.getFontMetrics().top, paint, fromWorkerThread);
            } else {
                float textHeight = (danmaku.paintHeight - 2 * danmaku.padding) / lines.length;
                for (int t = 0; t < lines.length; t++) {
                    if (lines[t] == null || lines[t].length() == 0) {
                        continue;
                    }
                    if (displayerConfig.hasStroke(danmaku)) {
                        displayerConfig.applyPaintConfig(danmaku, paint, true);
                        float strokeLeft = left;
                        float strokeTop = t * textHeight + top - paint.getFontMetrics().top;
                        if (displayerConfig.HAS_PROJECTION) {
                            strokeLeft += displayerConfig.sProjectionOffsetX;
                            strokeTop += displayerConfig.sProjectionOffsetY;
                        }
                        drawStroke(danmaku, lines[t], canvas, strokeLeft, strokeTop, paint, fromWorkerThread);
                    }
                    displayerConfig.applyPaintConfig(danmaku, paint, false);
                    drawText(displayer, displayerConfig, danmaku, lines[t], canvas, left, t * textHeight + top - paint.getFontMetrics().top, paint, fromWorkerThread);
                }
            }
        } else {
            if (displayerConfig.hasStroke(danmaku)) {
                displayerConfig.applyPaintConfig(danmaku, paint, true);
                float strokeLeft = left;
                float strokeTop = top - paint.getFontMetrics().top;

                if (displayerConfig.HAS_PROJECTION) {
                    strokeLeft += displayerConfig.sProjectionOffsetX;
                    strokeTop += displayerConfig.sProjectionOffsetY;
                }
                drawStroke(danmaku, null, canvas, strokeLeft, strokeTop, paint, fromWorkerThread);
            }

            displayerConfig.applyPaintConfig(danmaku, paint, false);
            drawText(displayer, displayerConfig, danmaku, null, canvas, left, top - paint.getFontMetrics().top, paint, fromWorkerThread);
        }

        // draw underline
        if (danmaku.underlineColor != 0) {
            Paint linePaint = displayerConfig.getUnderlinePaint(danmaku);
            float bottom = _top + danmaku.paintHeight - displayerConfig.UNDERLINE_HEIGHT;
            if (danmaku.sentFromMe && danmaku.hasTailIcon()) {
                bottom = top - paint.getFontMetrics().top + paint.getFontMetrics().bottom;
                float textWidth = paint.measureText(danmaku.text, 0, danmaku.text.length());
                canvas.drawLine(_left, bottom, _left + textWidth, bottom, linePaint);
            } else {
                canvas.drawLine(_left, bottom, _left + danmaku.paintWidth, bottom, linePaint);
            }
        }

        //draw border
        if (danmaku.borderColor != 0) {
            Paint borderPaint = displayerConfig.getBorderPaint(danmaku);
            canvas.drawRect(_left, _top, _left + danmaku.paintWidth, _top + danmaku.paintHeight,
                    borderPaint);
        }

    }

}

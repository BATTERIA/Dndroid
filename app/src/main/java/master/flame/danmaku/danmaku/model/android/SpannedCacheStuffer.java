package master.flame.danmaku.danmaku.model.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;

import java.lang.ref.SoftReference;

import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.IDrawingCache;

/**
 * Created by ch on 15-7-16.
 */
public class SpannedCacheStuffer extends SimpleTextCacheStuffer {

    private static final int TAG_KEY_IDENTITY = 2200000;
    public static final int TAG_KEY_LINE_BOUNDS_ARRAY = TAG_KEY_IDENTITY + 1;

    @Override
    public void measure(IDisplayer displayer, BaseDanmaku danmaku, TextPaint paint, boolean fromWorkerThread) {
        CharSequence text = danmaku.text;
        if (text instanceof Spanned) {
            // 每次measure都要重建Static Layout
            StaticLayout staticLayout = obtainStaticLayout(displayer, danmaku, paint, text);
            setDanmakuProps(staticLayout, danmaku);
            return;
        }
        super.measure(displayer, danmaku, paint, fromWorkerThread);
    }

    private void setDanmakuProps(StaticLayout staticLayout, BaseDanmaku danmaku) {
        danmaku.paintWidth = staticLayout.getWidth();
        danmaku.paintHeight = staticLayout.getHeight();
        danmaku.obj = new SoftReference<>(staticLayout);
        int lineCount = staticLayout.getLineCount();
        RectF[] lineBoundsArray = null;
        if (lineCount > 0) {
            lineBoundsArray = new RectF[lineCount];
            for (int i = 0; i < lineCount; i++) {
                RectF rect = new RectF(staticLayout.getLineLeft(i), staticLayout.getLineTop(i), staticLayout.getLineRight(i), staticLayout.getLineBottom(i));
                lineBoundsArray[i] = rect;
            }
        }
        danmaku.setTag(TAG_KEY_LINE_BOUNDS_ARRAY, lineBoundsArray);
    }

    private static StaticLayout obtainStaticLayout(BaseDanmaku danmaku) {
        SoftReference<StaticLayout> reference = (SoftReference<StaticLayout>) danmaku.obj;
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override
    public boolean drawCache(BaseDanmaku danmaku, Canvas canvas, float left, float top, Paint alphaPaint, TextPaint paint) {
        if (clearUnfitCache(danmaku)) {
            return false;
        }
        return super.drawCache(danmaku, canvas, left, top, alphaPaint, paint);
    }

    protected boolean clearUnfitCache(BaseDanmaku danmaku) {
        if (danmaku.text instanceof Spanned) {
            IDrawingCache<?> cache = danmaku.getDrawingCache();
            if (cache != null) {
                DrawingCacheHolder holder = (DrawingCacheHolder) cache.get();
                if (holder != null && (holder.width != Math.ceil(danmaku.paintWidth) || holder.height != Math.ceil(danmaku.paintHeight))) {  // measure大小与cache大小不符，销毁缓存重建
                    if (cache.hasReferences()) {
                        cache.decreaseReference();
                    } else {
                        cache.destroy();
                    }
                    danmaku.cache = null;
                    return true;
                }
            }
        }
        return false;
    }

    private StaticLayout obtainStaticLayout(IDisplayer displayer, BaseDanmaku danmaku, TextPaint paint, CharSequence text) {
        clearUnfitCache(danmaku);
        return createStaticLayout(displayer, danmaku, paint, text);
    }

    protected StaticLayout createStaticLayout(IDisplayer displayer, BaseDanmaku danmaku, TextPaint paint, CharSequence text) {
        return new StaticLayout(text, paint, (int) Math.ceil(StaticLayout.getDesiredWidth(text, paint)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override
    public void drawStroke(BaseDanmaku danmaku, String lineText, Canvas canvas, float left, float top, Paint paint, boolean fromWorkerThread) {
        if (danmaku.obj == null) {
            super.drawStroke(danmaku, lineText, canvas, left, top, paint, fromWorkerThread);
        }
    }

    @Override
    public void drawText(IDisplayer displayer, AndroidDisplayer.DisplayerConfig displayerConfig, BaseDanmaku danmaku, String lineText, Canvas canvas, float left, float top, TextPaint paint, boolean fromWorkerThread) {
        if (danmaku.obj == null) {
            super.drawText(displayer, displayerConfig, danmaku, lineText, canvas, left, top, paint, fromWorkerThread);
            return;
        }
        StaticLayout staticLayout = obtainStaticLayout(danmaku);
        boolean requestRemeasure = 0 != (danmaku.requestFlags & BaseDanmaku.FLAG_REQUEST_REMEASURE);
        boolean requestInvalidate = 0 != (danmaku.requestFlags & BaseDanmaku.FLAG_REQUEST_INVALIDATE);

        if (requestInvalidate || staticLayout == null) {
            if (requestInvalidate) {
                danmaku.requestFlags &= ~BaseDanmaku.FLAG_REQUEST_INVALIDATE;
            }
            CharSequence text = danmaku.text;
            if (text instanceof Spanned) {
                staticLayout = obtainStaticLayout(displayer, danmaku, paint, text);
                setDanmakuProps(staticLayout, danmaku);
                if (requestRemeasure) {
                    danmaku.requestFlags &= ~BaseDanmaku.FLAG_REQUEST_REMEASURE;
                }
            } else {
                return;
            }
        }
        boolean needRestore = false;
        if (left != 0 || top != 0) {
            canvas.save();
            canvas.translate(left, top + paint.ascent());
            needRestore = true;
        }
        staticLayout.draw(canvas);
        if (needRestore) {
            canvas.restore();
        }
    }

    @Override
    public void clearCaches() {
        super.clearCaches();
        System.gc();
    }

    @Override
    public void clearCache(BaseDanmaku danmaku) {
        super.clearCache(danmaku);
        if (danmaku.obj instanceof SoftReference<?>) {
            ((SoftReference<?>) danmaku.obj).clear();
        }
    }

    @Override
    public void releaseResource(BaseDanmaku danmaku) {
        clearCache(danmaku);
        super.releaseResource(danmaku);
    }
}

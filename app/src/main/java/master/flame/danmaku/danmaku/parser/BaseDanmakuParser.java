/*
 * Copyright (C) 2013 Chen Hui <calmer91@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package master.flame.danmaku.danmaku.parser;

import android.graphics.Color;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;

import master.flame.danmaku.danmaku.model.AlphaValue;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.Duration;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.SpecialDanmaku;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.DanmakuFactory;
import master.flame.danmaku.danmaku.util.DanmakuUtils;


/**
 *
 */
public abstract class BaseDanmakuParser {
    private static final String TAG = "BaseDanmukuParser";
    public interface Listener {
        void onDanmakuAdd(BaseDanmaku danmaku);
    }

    protected IDataSource<?> mDataSource;

    protected DanmakuTimer mTimer;
    protected int mDispWidth;
    protected int mDispHeight;
    protected float mDispScaleX;
    protected float mDispScaleY;
    protected float mDispDensity;
    protected float mScaledDensity;

    private IDanmakus mDanmakus;

    protected IDisplayer mDisp;
    protected DanmakuContext mContext;
    protected Listener mListener;

    public BaseDanmakuParser setDisplayer(IDisplayer disp) {
        mDisp = disp;
        mDispWidth = disp.getWidth();
        mDispHeight = disp.getHeight();
        mDispScaleX = mDispWidth / DanmakuFactory.BILI_PLAYER_WIDTH;
        mDispScaleY = mDispHeight / DanmakuFactory.BILI_PLAYER_HEIGHT;
        mDispDensity = disp.getDensity();
        mScaledDensity = disp.getScaledDensity();
        mContext.mDanmakuFactory.updateViewportState(mDispWidth, mDispHeight, getViewportSizeFactor());
        mContext.mDanmakuFactory.updateMaxDanmakuDuration();
        return this;
    }

    public IDisplayer getDisplayer() {
        return mDisp;
    }

    public BaseDanmakuParser setListener(Listener listener) {
        mListener = listener;
        return this;
    }

    /**
     * decide the speed of scroll-danmakus
     *
     * @return
     */
    protected float getViewportSizeFactor() {
        return 1 / (mDispDensity - 0.6f);
    }

    public BaseDanmakuParser load(IDataSource<?> source) {
        mDataSource = source;
        return this;
    }

    public BaseDanmakuParser setTimer(DanmakuTimer timer) {
        mTimer = timer;
        return this;
    }

    public DanmakuTimer getTimer() {
        return mTimer;
    }

    public IDanmakus getDanmakus() {
        if (mDanmakus != null)
            return mDanmakus;
        if (mContext != null && mContext.mDanmakuFactory != null) {
            mContext.mDanmakuFactory.resetDurationsData();
        }
        mDanmakus = parse();
        releaseDataSource();
        if (mContext != null && mContext.mDanmakuFactory != null) {
            mContext.mDanmakuFactory.updateMaxDanmakuDuration();
        }
        return mDanmakus;
    }

    protected void releaseDataSource() {
        if (mDataSource != null)
            mDataSource.release();
        mDataSource = null;
    }

    protected abstract IDanmakus parse();

    public void release() {
        releaseDataSource();
    }

    public BaseDanmakuParser setConfig(DanmakuContext config) {
        mContext = config;
        return this;
    }

    public int getTextSize(float textSize) {
        return (int) (textSize * mDispDensity);
    }

    protected boolean isPercentageNumber(String number) {
        return number != null && number.contains(".");
    }

    protected float parseFloat(String floatStr) {
        try {
            return Float.parseFloat(floatStr);
        } catch (NumberFormatException ignore) {
        }
        return 0.0f;
    }

    protected int parseInteger(String intStr) {
        try {
            return Integer.parseInt(intStr);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @SuppressWarnings("StringSplitter")
    protected BaseDanmaku initSpecialDanmaku(BaseDanmaku item) {
        String text = String.valueOf(item.text).trim();
        if (item.getType() == BaseDanmaku.TYPE_SPECIAL && text.startsWith("[")
                && text.endsWith("]")) {
            String[] textArr = null;//text.split(",", -1);
            try {
                JSONArray jsonArray = new JSONArray(text);
                textArr = new String[jsonArray.length()];
                for (int i = 0; i < textArr.length; i++) {
                    textArr[i] = jsonArray.getString(i);
                }
            } catch (JSONException e) {

            }

            if (textArr == null || textArr.length < 5 || TextUtils.isEmpty(textArr[4])) {
                return null;
            }
            DanmakuUtils.fillText(item, textArr[4]);
            float beginX = parseFloat(textArr[0]);
            float beginY = parseFloat(textArr[1]);
            float endX = beginX;
            float endY = beginY;
            String[] alphaArr = textArr[2].split("-");
            int beginAlpha = (int) (AlphaValue.MAX * parseFloat(alphaArr[0]));
            int endAlpha = beginAlpha;
            if (alphaArr.length > 1) {
                endAlpha = (int) (AlphaValue.MAX * parseFloat(alphaArr[1]));
            }
            long alphaDuraion = (long) (parseFloat(textArr[3]) * 1000);
            long translationDuration = alphaDuraion;
            long translationStartDelay = 0;
            float rotateY = 0, rotateZ = 0;
            if (textArr.length >= 7) {
                rotateZ = parseFloat(textArr[5]);
                rotateY = parseFloat(textArr[6]);
            }
            if (textArr.length >= 11) {
                endX = parseFloat(textArr[7]);
                endY = parseFloat(textArr[8]);
                if (!"".equals(textArr[9])) {
                    translationDuration = parseInteger(textArr[9]);
                }
                if (!"".equals(textArr[10])) {
                    translationStartDelay = (long) parseFloat(textArr[10]);
                }
            }
            if (isPercentageNumber(textArr[0])) {
                beginX *= DanmakuFactory.BILI_PLAYER_WIDTH;
            }
            if (isPercentageNumber(textArr[1])) {
                beginY *= DanmakuFactory.BILI_PLAYER_HEIGHT;
            }
            if (textArr.length >= 8 && isPercentageNumber(textArr[7])) {
                endX *= DanmakuFactory.BILI_PLAYER_WIDTH;
            }
            if (textArr.length >= 9 && isPercentageNumber(textArr[8])) {
                endY *= DanmakuFactory.BILI_PLAYER_HEIGHT;
            }
            item.duration = new Duration(alphaDuraion);
            item.rotationZ = rotateZ;
            item.rotationY = rotateY;
            mContext.mDanmakuFactory.fillTranslationData(item, beginX,
                    beginY, endX, endY, translationDuration, translationStartDelay, mDispScaleX, mDispScaleY);
            mContext.mDanmakuFactory.fillAlphaData(item, beginAlpha, endAlpha, alphaDuraion);

            if (textArr.length >= 12 && !TextUtils.isEmpty(textArr[11]) && Boolean.TRUE.toString().equalsIgnoreCase(textArr[11])) {
                // 是否有描边
                item.textShadowColor = Color.TRANSPARENT;
            }
            if (textArr.length >= 14) {
                // Linear.easeIn or Quadratic.easeOut
                ((SpecialDanmaku) item).isQuadraticEaseOut = "0".equals(textArr[13]);
            }
            if (textArr.length >= 15 && !"".equals(textArr[14])) {
                // 路径数据
                String motionPathString = textArr[14].substring(1);
                if (!TextUtils.isEmpty(motionPathString)) {
                    String[] pointStrArray = motionPathString.split("L");
                    if (pointStrArray.length > 0) {
                        float[][] points = new float[pointStrArray.length][2];
                        for (int i = 0; i < pointStrArray.length; i++) {
                            String[] pointArray = pointStrArray[i].split(",");
                            if (pointArray.length >= 2) {
                                points[i][0] = parseFloat(pointArray[0]);
                                points[i][1] = parseFloat(pointArray[1]);
                            }
                        }
                        DanmakuFactory.fillLinePathData(item, points, mDispScaleX,
                                mDispScaleY);
                    }
                }
            }
        }
        return item;
    }
}

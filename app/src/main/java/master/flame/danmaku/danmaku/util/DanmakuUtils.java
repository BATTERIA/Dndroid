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

package master.flame.danmaku.danmaku.util;

import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import android.text.TextUtils;

import master.flame.danmaku.danmaku.model.AbsDisplayer;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.DrawingCache;
import master.flame.danmaku.danmaku.model.android.DrawingCacheHolder;

public class DanmakuUtils {

    /**
     * 检测两个弹幕是否会碰撞
     * 允许不同类型弹幕的碰撞
     *
     * @param d1
     * @param d2
     * @return
     */
    public static boolean willHitInDuration(IDisplayer disp, BaseDanmaku d1, BaseDanmaku d2,
                                            long duration, long currTime) {
        final int type1 = d1.getType();
        final int type2 = d2.getType();
        // allow hit if different type
        if (type1 != type2)
            return false;

//        if (d1.isOutside()) {
//            return false;
//        }
        long dTime = d2.getActualTime() - d1.getActualTime();
        if (dTime <= 0)
            return true;
        if (Math.abs(dTime) >= duration || d1.isTimeOut() || d2.isTimeOut()) {
            return false;
        }

        if (type1 == BaseDanmaku.TYPE_FIX_TOP || type1 == BaseDanmaku.TYPE_FIX_BOTTOM) {
            return true;
        }

        return checkHitAtTime(disp, d1, d2, currTime)
                || checkHitAtTime(disp, d1, d2, d1.getActualTime() + d1.getDuration());
    }

    private static boolean checkHitAtTime(IDisplayer disp, BaseDanmaku d1, BaseDanmaku d2, long time) {
        final float[] rectArr1 = d1.getRectAtTime(disp, time);
        final float[] rectArr2 = d2.getRectAtTime(disp, time);
        if (rectArr1 == null || rectArr2 == null)
            return false;
        return checkHit(d1.getType(), d2.getType(), rectArr1, rectArr2);
    }

    private static boolean checkHit(int type1, int type2, float[] rectArr1,
                                    float[] rectArr2) {
//        if(type1 != type2)
//            return false;

        if (type1 == BaseDanmaku.TYPE_SCROLL_RL || type1 == BaseDanmaku.TYPE_SCROLL_RL_IMAGE || type1 == BaseDanmaku.TYPE_FIX_TOP || type1 == BaseDanmaku.TYPE_FIX_BOTTOM) {
            // hit if left2 < right1
            return rectArr2[0] < rectArr1[2];
        }

        if (type1 == BaseDanmaku.TYPE_SCROLL_LR) {
            // hit if right2 > left1
            return rectArr2[2] > rectArr1[0];
        }

        return false;
    }

    public static DrawingCache buildDanmakuDrawingCache(BaseDanmaku danmaku, IDisplayer disp,
                                                        DrawingCache cache, int bitsPerPixel) {
        if (cache == null)
            cache = new DrawingCache();

        cache.build((int) Math.ceil(danmaku.paintWidth), (int) Math.ceil(danmaku.paintHeight), disp.getDensityDpi(), false, bitsPerPixel);
        DrawingCacheHolder holder = cache.get();
        if (holder != null) {
            ((AbsDisplayer) disp).drawDanmaku(danmaku, holder.canvas, 0, 0, true);
            if (disp.isHardwareAccelerated()) {
                if (cache.width() < disp.getMaximumCacheWidth() && cache.height() < disp.getMaximumCacheHeight() && disp.isHardwareBimtapEnabled()) { // api >= 26 use hardwarebitmap
                    try {
                        Bitmap bitmap = holder.bitmap;
                        Bitmap hardwareBitmap = null;
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            hardwareBitmap = bitmap.copy(Bitmap.Config.HARDWARE, false);
                        }
                        if (hardwareBitmap != null) {
                            holder.bitmap = hardwareBitmap;
                            bitmap.recycle();
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                }
                holder.splitWith(disp.isHardwareBimtapEnabled(), disp.getWidth(), disp.getHeight(), disp.getMaximumCacheWidth(),
                        disp.getMaximumCacheHeight());
            }
        }
        return cache;
    }

    public static int getCacheSize(int w, int h, int bytesPerPixel) {
        return (w) * (h) * bytesPerPixel;
    }

    public final static boolean isDuplicate(BaseDanmaku obj1, BaseDanmaku obj2) {
        if (obj1 == obj2) {
            return false;
        }
//        if(obj1.isTimeOut() || obj2.isTimeOut()) {
//            return false;
//        }
//        long dtime = Math.abs(obj1.time - obj2.time);
//        if(dtime > obj1.getDuration()) {
//            return false;
//        }
        if (obj1.text == obj2.text) {
            return true;
        }
        return obj1.text != null && obj1.text.equals(obj2.text);
    }

    public static int compare(BaseDanmaku obj1, BaseDanmaku obj2) {

        if (obj1 == obj2) {
            return 0;
        }

        if (obj1 == null) {
            return -1;
        }

        if (obj2 == null) {
            return 1;
        }

        long val = obj1.getTime() - obj2.getTime();
        if (val > 0) {
            return 1;
        } else if (val < 0) {
            return -1;
        }
        int r = obj1.weight - obj2.weight;
        if (r != 0)
            return r < 0 ? 1 : -1;

        r = obj1.index - obj2.index;
        if (r != 0)
            return r < 0 ? -1 : 1;

        r = Integer.compare(obj1.hashCode(), obj2.hashCode());
        return r;
    }

    public static boolean isOverSize(IDisplayer disp, BaseDanmaku item) {
        return disp.isHardwareAccelerated() && (item.paintWidth > disp.getMaximumCacheWidth() || item.paintHeight > disp.getMaximumCacheHeight());
    }

    public static void fillText(BaseDanmaku danmaku, CharSequence text) {
        danmaku.text = text;
    }

    public static boolean willHitWithRLImage(IDisplayer disp, BaseDanmaku item, BaseDanmaku drawItem, float expectedTopPos) {
        if (item.isTimeOut() || drawItem.isTimeOut()) {
            return false;
        }
        if (Math.abs(item.getActualTime() - drawItem.getActualTime()) > Math.max(item.getDuration(), drawItem.getDuration())) {
            return false;
        }
        if (drawItem.getType() == BaseDanmaku.TYPE_FIX_TOP || drawItem.getType() == BaseDanmaku.TYPE_FIX_BOTTOM) {
            return checkHitAtTime(disp, drawItem, item, drawItem.getActualTime()) ||
                    checkHitAtTime(disp, drawItem, item, drawItem.getActualTime() + drawItem.getDuration());
        }

        if (item.getActualTime() > drawItem.getActualTime()) {
            return checkHitAtTime(disp, drawItem, item, drawItem.getActualTime() + drawItem.getDuration()) ||
                    checkHitAtTime(disp, drawItem, item, item.getActualTime());
        } else {
            return checkHitAtTime(disp, item, drawItem, item.getActualTime() + item.getDuration()) ||
                    checkHitAtTime(disp, drawItem, item, drawItem.getActualTime());
        }
//        return true;
    }

    public static boolean isTimeCross(BaseDanmaku item0, BaseDanmaku item1) {
        return isInRange(item0.getTime(), item1.getTime(), item1.getTime() + item1.getDuration()) || isInRange(item0.getTime() + item0.getDuration(), item1.getTime(), item1.getTime() + item1.getDuration());
    }

    private static boolean isInRange(long time, long min, long max) {
        return time >= min && time <= max;
    }

    /**
     * 求直线外一点到直线上的投影点
     *
     * @param pLine    线上一点
     * @param k        斜率
     * @param pOut     线外一点
     * @param pProject 投影点
     */
    public static void getProjectivePoint(PointF pLine, double k, PointF pOut, PointF pProject) {
        if (k == 0) {//垂线斜率不存在情况
            pProject.x = pOut.x;
            pProject.y = pLine.y;
        } else {
            pProject.x = (float) ((k * pLine.x + pOut.x / k + pOut.y - pLine.y) / (1 / k + k));
            pProject.y = (float) (-1 / k * (pProject.x - pOut.x) + pOut.y);
        }
    }

    /**
     * 求pOut在pLine以及pLine2所连直线上的投影点
     *
     * @param pLine
     * @param pLine2
     * @param pOut
     * @param pProject
     */
    public static void getProjectivePoint(PointF pLine, PointF pLine2, PointF pOut, PointF pProject) {
        double k = 0;
        try {
            k = getSlope(pLine.x, pLine.y, pLine2.x, pLine2.y);
        } catch (Exception e) {
            k = 0;
        }
        getProjectivePoint(pLine, k, pOut, pProject);
    }

    /**
     * 通过两个点坐标计算斜率
     * 已知A(x1,y1),B(x2,y2)
     * 1、若x1=x2,则斜率不存在；
     * 2、若x1≠x2,则斜率k=[y2－y1]/[x2－x1]
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @throws Exception 如果x1==x2,则抛出该异常
     */
    public static double getSlope(double x1, double y1, double x2, double y2) throws Exception {
        if (x1 == x2) {
            throw new Exception("Slope is not existence,and div by zero!");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static LinearGradient convertToLinearGradient(BaseDanmaku.LinearGradientShader shader, float paintWidth, float paintHeight) {
        float x = paintWidth / 2f;
        float y = paintHeight / 2f;
        float dirX = 0, dirY = 0;
        float angle = shader.getAngle() % 360;


        PointF leftTop = new PointF(0, 0);
        PointF rightTop = new PointF(paintWidth, 0);
        PointF rightBottom = new PointF(paintWidth, paintHeight);
        PointF leftBottom = new PointF(0, paintHeight);

        PointF[] outPoints = null;

        if (angle > 0 && angle < 90) {
            dirX = 1;
            dirY = 1;
            outPoints = new PointF[]{leftTop, rightBottom};
        } else if (angle > 90 && angle < 180) {
            dirX = -1;
            dirY = 1;
            outPoints = new PointF[]{rightTop, leftBottom};
        } else if (angle > 180 && angle < 270) {
            dirX = -1;
            dirY = -1;
            outPoints = new PointF[]{rightBottom, leftTop};
        } else if (angle > 270 && angle < 360) {
            dirX = 1;
            dirY = -1;
            outPoints = new PointF[]{leftBottom, rightTop};
        } else if (angle == 0) {
            dirX = 1;
        } else if (angle == 90) {
            dirY = 1;
        } else if (angle == 180) {
            dirX = -1;
        } else if (angle == 270) {
            dirY = -1;
        }
        float legLengthY = (float) Math.abs(x * Math.tan(shader.getAngle() * Math.PI / 180));
        float yPoint = y + dirY * legLengthY;
        float x0 = 0f, y0 = 0f, x1 = 0f, y1 = 0f;
        if (yPoint >= 0 && yPoint <= paintHeight) {
            x1 = x + dirX * x;
            y1 = y + dirY * legLengthY;
            x0 = x - dirX * x;
            y0 = y - dirY * legLengthY;
        } else {
            float legLengthX = (float) Math.abs(y / Math.tan(shader.getAngle() * Math.PI / 180));
            float xPoint = x + dirX * legLengthX;
            if (xPoint >= 0 && xPoint <= paintWidth) {
                x1 = x + dirX * legLengthX;
                y1 = y + dirY * y;
                x0 = x - dirX * legLengthX;
                y0 = y - dirY * y;
            }
        }

        if (outPoints == null) {
            return new LinearGradient(x0, y0, x1, y1, shader.getColors(), shader.getPositions(), Shader.TileMode.CLAMP);
        }

        PointF pLine = new PointF(x0, y0);
        PointF pLine2 = new PointF(x1, y1);


        PointF startingPoint = new PointF();
        getProjectivePoint(pLine, pLine2, outPoints[0], startingPoint);
        PointF endingPoint = new PointF();
        getProjectivePoint(pLine, pLine2, outPoints[1], endingPoint);


        return new LinearGradient(startingPoint.x, startingPoint.y, endingPoint.x, endingPoint.y, shader.getColors(), shader.getPositions(), Shader.TileMode.CLAMP);
    }
}

package master.flame.danmaku.danmaku.util;

import android.util.SparseArray;

import java.util.Arrays;

import master.flame.danmaku.controller.IDrawTask.Layer;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDanmakus.DefaultConsumer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;


public class DanmakuReportParameters {
    private static final String TAG = "DanmakuReportParameter";
    private static final int MAX_LENGTH = 300;
    private volatile boolean isCaculating;
    private int VIEW_WIDTH;
    private int VIEW_HEIGHT;
    private int total;
    private float minBottomDanmakuTop;          //最靠上的底部弹幕的顶边
    private float maxTopDanmakuBottom;          //最靠下的顶部弹幕的底边
    private long currentTime;
    private long maxDmDuration;
    private float danmakuArea;
    private final int[] accumulateEdgeFlags;
    private final float[] xPosList;
    private final float[] segmentTree;
    private final DanmakuEdge[] danmakuEdges;
    private float danmakuDomain;                //弹幕屏占比设置
    private float danmakuAiRecommendLevel;      //云屏蔽等级设置
    private int danmakuExposureCounts;          //同屏弹幕条数
    private float danmakuExposureRatio;         //同屏弹幕面积占比
    private float danmakuBottomExposureRatio;   //底部弹幕高度占比
    private float danmakuTopExposureRatio;      //顶部弹幕高度占比
    private int danmakuScrollExposureCounts;    //滚动弹幕条数
    private int hasAdvancedDanmaku;             //是否出现高级弹幕(0:否,1:是)
    private int hasMaskDanmaku;                 //是否有弹幕蒙版(0:否,1:是)

    public DanmakuReportParameters() {
        isCaculating = false;
        danmakuEdges = new DanmakuEdge[MAX_LENGTH];
        accumulateEdgeFlags = new int[MAX_LENGTH * 4];
        segmentTree = new float[MAX_LENGTH * 4];
        xPosList = new float[MAX_LENGTH];
        for (int i = 0; i < MAX_LENGTH; i++) {
            danmakuEdges[i] = new DanmakuEdge();
        }
    }

    private void reset() {
        minBottomDanmakuTop = 0;
        maxTopDanmakuBottom = 0;
        danmakuDomain = 0;
        danmakuAiRecommendLevel = 0;
        danmakuExposureCounts = 0;
        danmakuExposureRatio = 0;
        danmakuBottomExposureRatio = 0;
        danmakuTopExposureRatio = 0;
        danmakuScrollExposureCounts = 0;
        hasAdvancedDanmaku = 0;
        hasMaskDanmaku = 0;
        for (int i = 0; i < MAX_LENGTH * 4; i++) {
            accumulateEdgeFlags[i] = 0;
            segmentTree[i] = 0;
        }
        for (int i = 0; i < MAX_LENGTH; i++) {
            xPosList[i] = 0;
        }
    }

    private void clear() {
        for (int i = 0; i < MAX_LENGTH; i++) {
            danmakuEdges[i] = null;
        }
    }

    private static class DanmakuEdge implements Comparable<DanmakuEdge> {
        private float left, right;
        private float yPos;
        private int isBottomEdge;

        public DanmakuEdge() {
            left = right = yPos = 0.0f;
            isBottomEdge = 0;
        }

        @Override
        public int compareTo(DanmakuEdge o) {
            return Float.compare(yPos, o.yPos);
        }
    }

    private void pushUp(int i, int l, int r) {
        if (accumulateEdgeFlags[i] > 0) {
            segmentTree[i] = xPosList[r + 1] - xPosList[l];
        } else if (l == r) {
            segmentTree[i] = 0;
        } else {
            segmentTree[i] = segmentTree[i << 1] + segmentTree[i << 1 | 1];
        }
    }

    private void update(int left, int right, int isUpperEdge, int fromIndex, int toIndex, int i) {
        if (left <= fromIndex && toIndex <= right) {
            accumulateEdgeFlags[i] += isUpperEdge;
            pushUp(i, fromIndex, toIndex);
            return;
        }
        int mid = (fromIndex + toIndex) >> 1;
        if (left <= mid) {
            update(left, right, isUpperEdge, fromIndex, mid, i << 1);
        }
        if (mid < right) {
            update(left, right, isUpperEdge, mid + 1, toIndex, i << 1 | 1);
        }
        pushUp(i, fromIndex, toIndex);
    }

    private int lowerBound(float target, int length) {
        int l = 0, r = length - 1, middle;
        while (l < r) {
            middle = (l + r) >> 1;
            if (xPosList[middle] == target) {
                return middle;
            } else if (xPosList[middle] < target) {
                l = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        return -1;
    }

    private synchronized void calculateSomeDanmakusData(BaseDanmaku danmaku) {
        danmakuExposureCounts++;
        if (danmaku.getType() == BaseDanmaku.TYPE_SCROLL_RL || danmaku.getType() == BaseDanmaku.TYPE_SCROLL_LR) {
            danmakuScrollExposureCounts++;
        } else if (hasAdvancedDanmaku == 0 && danmaku.getType() == BaseDanmaku.TYPE_SPECIAL) {
            hasAdvancedDanmaku = 1;
        } else if (danmaku.getType() == BaseDanmaku.TYPE_FIX_BOTTOM) {
            minBottomDanmakuTop = Math.min(danmaku.getTop(), minBottomDanmakuTop);
        } else if (danmaku.getType() == BaseDanmaku.TYPE_FIX_TOP) {
            maxTopDanmakuBottom = Math.max(danmaku.getBottom(), maxTopDanmakuBottom);
        }
    }

    private synchronized float danmakuAreaRatioNotOverlapping(SparseArray<Layer> danmakuLayers) {
        if (VIEW_WIDTH == 0 || VIEW_HEIGHT == 0 || isCaculating) {
            return -1;
        }
        isCaculating = true;
        danmakuArea = 0;
        total = 0;
        long beginTime = SystemClock.uptimeMillis();
        for (int i = 0; i < danmakuLayers.size(); i++) {
            Layer layer;
            if ((layer = danmakuLayers.valueAt(i)) != null) {
                long beginMills = currentTime - maxDmDuration;
                long endMills = currentTime + maxDmDuration;
                if (layer.getId() == BaseDanmaku.TYPE_SUBTITLE) {
                    break;
                }
                if (layer.getId() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                    beginMills -= layer.getMaxDuration();
                    endMills += layer.getMaxDuration();
                }
                IDanmakus danmakus = layer.subNewSet(beginMills, endMills);
                if (danmakus != null) {
                    danmakus.forEachSync(new DefaultConsumer<BaseDanmaku>() {
                        @Override
                        public int accept(BaseDanmaku dm) {
                            if (dm.isLate()) {
                                return ACTION_BREAK;
                            }
                            if (dm.isShown() && !dm.isOutside()) {
                                calculateSomeDanmakusData(dm);
                                float x1 = Math.max(0, dm.getLeft()), x2 = Math.min(VIEW_WIDTH, dm.getRight());
                                danmakuArea += (x2 - x1) * (dm.getBottom() - dm.getTop());
                                total++;
                            }
                            return ACTION_CONTINUE;
                        }
                    });
                }
            }
        }
        float answer = danmakuArea / (VIEW_WIDTH * VIEW_HEIGHT);
        isCaculating = false;
        if (answer < 0.01f) {
            return 0;
        }
        return answer;
    }

    private synchronized float danmakuAreaRatioAllowOverlapping(SparseArray<Layer> danmakuLayers) {
        if (VIEW_WIDTH == 0 || VIEW_HEIGHT == 0 || isCaculating) {
            return -1;
        }
        isCaculating = true;
        total = 0;
        long beginTime = SystemClock.uptimeMillis();
        for (int i = 0; i < danmakuLayers.size(); i++) {
            Layer layer;
            if ((layer = danmakuLayers.valueAt(i)) != null) {
                long beginMills = currentTime - maxDmDuration;
                long endMills = currentTime + maxDmDuration;
                if (layer.getId() == BaseDanmaku.TYPE_SUBTITLE) {
                    break;
                }
                if (layer.getId() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                    beginMills -= layer.getMaxDuration();
                    endMills += layer.getMaxDuration();
                }
                IDanmakus danmakus = layer.subNewSet(beginMills, endMills);
                if (danmakus != null) {
                    danmakus.forEachSync(new DefaultConsumer<BaseDanmaku>() {
                        @Override
                        public int accept(BaseDanmaku dm) {
                            if (dm.isLate()) {
                                return ACTION_BREAK;
                            }
                            if (dm.isShown() && !dm.isOutside() && total + 1 < MAX_LENGTH) {
                                calculateSomeDanmakusData(dm);
                                DanmakuEdge edgeBottom = danmakuEdges[total], edgeUpper = danmakuEdges[total + 1];
                                edgeBottom.left = edgeUpper.left = xPosList[total] = Math.max(0, dm.getLeft());
                                edgeBottom.right = edgeUpper.right = xPosList[total + 1] =
                                        Math.min(VIEW_WIDTH, dm.getRight());
                                // 注意弹幕View绘制原点位于屏幕左上角 故弹幕的Top边实际上是矩形的Bottom边
                                edgeBottom.yPos = dm.getTop();
                                edgeBottom.isBottomEdge = 1;
                                edgeUpper.yPos = dm.getBottom();
                                edgeUpper.isBottomEdge = -1;
                                total += 2;
                            }
                            return ACTION_CONTINUE;
                        }
                    });
                }
            }
        }
        Arrays.sort(danmakuEdges, 0, total);
        Arrays.sort(xPosList, 0, total);
        int k = 1;
        for (int i = 1; i < total; i++) {               //去重
            if (xPosList[i] != xPosList[i - 1]) {
                xPosList[k++] = xPosList[i];
            }
        }
        float answer = 0.0f;
        for (int i = 0; i < total - 1; i++) {
            int l = lowerBound(danmakuEdges[i].left, k);
            int r = lowerBound(danmakuEdges[i].right, k) - 1;
            if (l <= r) {
                update(l, r, danmakuEdges[i].isBottomEdge, 0, k - 1, 1);
            }
            answer += (danmakuEdges[i + 1].yPos - danmakuEdges[i].yPos) * segmentTree[1];
        }
        answer = answer / (VIEW_WIDTH * VIEW_HEIGHT);
        isCaculating = false;
        return answer;
    }

    public boolean calculateDanmakusData(long time, DanmakuContext danmakuContext, SparseArray<Layer> danmakuLayers) {
        if (danmakuContext == null || danmakuLayers == null || danmakuLayers.size() == 0) {
            return false;
        }
        VIEW_WIDTH = danmakuContext.getDisplayer().getWidth();
        VIEW_HEIGHT = danmakuContext.getDisplayer().getHeight();
        if (VIEW_WIDTH == 0 || VIEW_HEIGHT == 0) {
            return false;
        }
        reset();
        currentTime = time;
        danmakuDomain = danmakuContext.screenOccupationRatio;
        this.maxDmDuration = danmakuContext.mDanmakuFactory.MAX_DANMAKU_DURATION;
        minBottomDanmakuTop = VIEW_HEIGHT;
        if (danmakuContext.isPreventOverlappingEnabled()) {
            danmakuExposureRatio = danmakuAreaRatioNotOverlapping(danmakuLayers);
        } else {
            danmakuExposureRatio = danmakuAreaRatioAllowOverlapping(danmakuLayers);
        }
        danmakuBottomExposureRatio = Math.min(1 - minBottomDanmakuTop / VIEW_HEIGHT, 1);
        danmakuTopExposureRatio = Math.min(maxTopDanmakuBottom / VIEW_HEIGHT, 1);
        return true;
    }

    public void setHasMaskDanmaku(boolean enable) {
        hasMaskDanmaku = enable ? 1 : 0;
    }

    public void setDanmakuAiRecommendLevel(int level) {
        danmakuAiRecommendLevel = level;
    }

    public void logInfo() {

    }

    public float getDanmakuDomain() {
        return danmakuDomain;
    }

    public float getDanmakuAiRecommendLevel() {
        return danmakuAiRecommendLevel;
    }

    public int getDanmakuExposureCounts() {
        return danmakuExposureCounts;
    }

    public float getDanmakuExposureRatio() {
        return danmakuExposureRatio;
    }

    public float getDanmakuBottomExposureRatio() {
        return danmakuBottomExposureRatio;
    }

    public float getDanmakuTopExposureRatio() {
        return danmakuTopExposureRatio;
    }

    public int getDanmakuScrollExposureCounts() {
        return danmakuScrollExposureCounts;
    }

    public int getHasAdvancedDanmaku() {
        return hasAdvancedDanmaku;
    }

    public int getHasMaskDanmaku() {
        return hasMaskDanmaku;
    }
}

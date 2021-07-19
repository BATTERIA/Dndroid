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

package master.flame.danmaku.danmaku.renderer.android;

import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.util.DanmakuUtils;

public class DanmakusRetainer {

    private IDanmakusRetainer rldrInstance = null;

    private IDanmakusRetainer rlimagedrInstance = null;

    private IDanmakusRetainer lrdrInstance = null;

    private IDanmakusRetainer ftdrInstance = null;

    private IDanmakusRetainer fbdrInstance = null;

    private IDanmakusRetainer subdrInstance = null;

    public DanmakusRetainer(boolean alignBottom) {
        alignBottom(alignBottom);
    }

    public void alignBottom(boolean alignBottom) {
        rldrInstance = alignBottom ? new AlignBottomRetainer() : new AlignTopRetainer();
        rlimagedrInstance = new YPosTopRetainer();
        rldrInstance.shareExtraRetainer(rlimagedrInstance);
        lrdrInstance = alignBottom ? new AlignBottomRetainer() : new AlignTopRetainer();
        lrdrInstance.shareExtraRetainer(rlimagedrInstance);
        if (ftdrInstance == null) {
            ftdrInstance = new FTDanmakusRetainer();
            ftdrInstance.shareExtraRetainer(rlimagedrInstance);
        }
        if (fbdrInstance == null) {
            fbdrInstance = new AlignBottomRetainer();
            fbdrInstance.shareExtraRetainer(rlimagedrInstance);
        }
        if (subdrInstance == null) {
            subdrInstance = new AlignBottomRetainer();
        }
    }

    public void fix(BaseDanmaku danmaku, IDisplayer disp, Verifier verifier) {

        int type = danmaku.getType();
        switch (type) {
            case BaseDanmaku.TYPE_SCROLL_RL:
                rldrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_SCROLL_LR:
                lrdrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_SCROLL_RL_IMAGE:
                rlimagedrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_FIX_TOP:
                ftdrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_FIX_BOTTOM:
                fbdrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_SUBTITLE:
                subdrInstance.fix(danmaku, disp, verifier);
                break;
            case BaseDanmaku.TYPE_SPECIAL:
                danmaku.layout(disp, 0, 0);
                break;
        }

    }

    public void clear(Integer type) {
        switch (type) {
            case BaseDanmaku.TYPE_SCROLL_RL:
                rldrInstance.clear();
                break;
            case BaseDanmaku.TYPE_SCROLL_LR:
                lrdrInstance.clear();
                break;
            case BaseDanmaku.TYPE_SCROLL_RL_IMAGE:
                rlimagedrInstance.clear();
                break;
            case BaseDanmaku.TYPE_FIX_TOP:
                ftdrInstance.clear();
                break;
            case BaseDanmaku.TYPE_FIX_BOTTOM:
                fbdrInstance.clear();
                break;
            case BaseDanmaku.TYPE_SUBTITLE:
                subdrInstance.clear();
                break;
            case BaseDanmaku.TYPE_SPECIAL:
                break;
        }
    }

    public void clear() {
        if (rldrInstance != null) {
            rldrInstance.clear();
        }
        if (rlimagedrInstance != null) {
            rlimagedrInstance.clear();
        }
        if (lrdrInstance != null) {
            lrdrInstance.clear();
        }
        if (ftdrInstance != null) {
            ftdrInstance.clear();
        }
        if (fbdrInstance != null) {
            fbdrInstance.clear();
        }
        if (subdrInstance != null) {
            subdrInstance.clear();
        }
    }

    public void release(){
        clear();
    }

    public interface Verifier {

        public boolean skipLayout(BaseDanmaku danmaku, float fixedTop, int lines, boolean willHit);

    }

    public interface IDanmakusRetainer {

        public void fix(BaseDanmaku drawItem, IDisplayer disp, Verifier verifier);

        public void clear();

        default void shareExtraRetainer(IDanmakusRetainer retainer) {
        }

        default float getRecommandedTopPos(IDisplayer disp, float expectedTopPos, BaseDanmaku danmaku, boolean alignTop) {
            return 0f;
        }

    }

    private static class RetainerState {
        public int lines = 0;
        public BaseDanmaku insertItem = null, firstItem = null, lastItem = null, minRightRow = null, removeItem = null;
        public boolean overwriteInsert = false;
        public boolean shown = false;
        public boolean willHit = false;
    }

    private static class YPosTopRetainer implements IDanmakusRetainer {

        protected static class RetainerConsumer extends IDanmakus.Consumer<BaseDanmaku, Float> {

            public IDisplayer disp;
            public BaseDanmaku drawItem;
            public float expectedTopPos;
            public boolean alignTop;
            private float recommandedTopPos;

            @Override
            public void before() {
                super.before();
                recommandedTopPos = expectedTopPos;
            }

            private boolean isIn(float pos, float top, float bottom) {
                return pos >= top && pos <= bottom;
            }

            @Override
            public int accept(BaseDanmaku item) {
                if (item.isTimeOut()) {
                    return ACTION_REMOVE;
                }
//                Log.e("DFMR", drawItem.text + " hit at " + expectedTopPos + " - " + (expectedTopPos + drawItem.paintHeight) + "(" + item.getTop() + " - " + item.getBottom() + ")" + item.text + ",size:" + mVisibleDanmakus.size());
                if (isIn(expectedTopPos, item.getTop(), item.getBottom()) || isIn(expectedTopPos + drawItem.paintHeight, item.getTop(), item.getBottom())) {
//                    if(DanmakuUtils.isTimeCross(item, drawItem)) {
                        if (!DanmakuUtils.willHitWithRLImage(disp, item, drawItem, expectedTopPos)) {
//                            Log.e("DFMR", drawItem.text + " not hit");
                            if (expectedTopPos + drawItem.paintHeight <= item.getBottom()) {
                                return ACTION_BREAK;
                            }
                        } else {
//                            Log.e("DFMR", drawItem.text + " hit in recommand: " + item.getBottom());
                            recommandedTopPos = expectedTopPos = (alignTop ? item.getBottom() : item.getTop() - drawItem.paintHeight);
                        }
//                    }
                }

                return ACTION_CONTINUE;
            }

            @Override
            public Float result() {
                return recommandedTopPos;
            }
        }

        protected Danmakus mVisibleDanmakus = new Danmakus(Danmakus.ST_BY_YPOS);
        protected Danmakus mVisibleDanmakusYDesc = new Danmakus(Danmakus.ST_BY_YPOS_DESC);
        protected RetainerConsumer mConsumer = new RetainerConsumer();

        @Override
        public void fix(BaseDanmaku drawItem, IDisplayer disp, Verifier verifier) {
            drawItem.layout(disp, drawItem.getLeft(), 0);
            if (!mVisibleDanmakus.contains(drawItem)) {
//                Log.e("DFMR", "current_time:" + drawItem.getTimer().currMillisecond + ", " +drawItem.getTime() + "");
                mVisibleDanmakus.addItem(drawItem);
            }
            if (!mVisibleDanmakusYDesc.contains(drawItem)) {
                mVisibleDanmakusYDesc.addItem(drawItem);
            }
        }

        @Override
        public void clear() {
//            mVisibleDanmakus.clear();
        }

        @Override
        public float getRecommandedTopPos(IDisplayer disp, float expectedTopPos, BaseDanmaku danmaku, boolean alignTop) {
            Danmakus visibleDanmakus = alignTop ? this.mVisibleDanmakus : this.mVisibleDanmakusYDesc;
            mConsumer.expectedTopPos = expectedTopPos;
            mConsumer.drawItem = danmaku;
            mConsumer.disp = disp;
            mConsumer.alignTop = alignTop;
            visibleDanmakus.forEachSync(mConsumer);
            return mConsumer.result();
        }
    }

    private static class AlignTopRetainer implements IDanmakusRetainer {
        protected class RetainerConsumer extends IDanmakus.Consumer<BaseDanmaku, RetainerState> {
            public IDisplayer disp;
            int lines = 0;
            public BaseDanmaku insertItem = null, firstItem = null, lastItem = null, minRightRow = null, drawItem = null;
            float drawItemTop = 0f;
            boolean overwriteInsert = false;
            boolean shown = false;
            boolean willHit = false;
            boolean wilHitLast = true;

            @Override
            public void before() {
                lines = 0;
                insertItem = firstItem = lastItem = minRightRow = null;
                overwriteInsert = shown = willHit = false;
            }

            @Override
            public int accept(BaseDanmaku item) {
                if (mCancelFixingFlag) {
                    return ACTION_BREAK;
                }

                if(item == drawItem){
                    insertItem = item;
                    lastItem = null;
                    shown = true;
                    willHit = false;
                    return ACTION_BREAK;
                }

                if (firstItem == null)
                    firstItem = item;

                if (drawItem.paintHeight + item.getTop() > disp.getHeight() - disp.getVirtualMargin(drawItem.getType(), IDisplayer.MARGIN_BOTTOM)) {
                    overwriteInsert = true;
                    return ACTION_BREAK;
                }

                if (minRightRow == null) {
                    minRightRow = item;
                } else {
                    if (minRightRow.getRight() >= item.getRight()) {
                        minRightRow = item;
                    }
                }

                // 检查碰撞
                willHit = DanmakuUtils.willHitInDuration(disp, item, drawItem,
                        drawItem.getDuration(), drawItem.getTimer().current());

                if (!willHit && mExtraRetainer != null) {
                    willHit = (mExtraRetainer.getRecommandedTopPos(disp, item.getTop(), drawItem, true) != item.getTop());
                }

                if (!wilHitLast && item.getTop() > drawItemTop + drawItem.paintHeight) {
                    willHit = false;
                    return ACTION_BREAK;
                }
                if (!willHit) {
                    if (wilHitLast) {
                        insertItem = item;
                    }
                } else {
                    lines++;
                    insertItem = null;
                    lastItem = item;
                    drawItemTop = item.getBottom() + disp.getMargin();
                }
                wilHitLast = willHit;
                return ACTION_CONTINUE;
            }

            @Override
            public RetainerState result() {
                RetainerState retainerState = new RetainerState();
                retainerState.lines = this.lines;
                retainerState.firstItem = this.firstItem;
                retainerState.insertItem = this.insertItem;
                retainerState.lastItem = this.lastItem;
                retainerState.minRightRow = this.minRightRow;
                retainerState.overwriteInsert = this.overwriteInsert;
                retainerState.shown = this.shown;
                retainerState.willHit = this.willHit;
                return retainerState;
            }
        }

        protected static class RemoveDmConsumer extends IDanmakus.DefaultConsumer<BaseDanmaku> {
            public float drawItemTop = 0f, drawItemBottom = 0f;

            @Override
            public int accept(BaseDanmaku item) {
                if (item.getBottom() > drawItemBottom) {
                    return ACTION_BREAK;
                } else if (item.getBottom() > drawItemTop && item.getBottom() <= drawItemBottom) {
                    return ACTION_REMOVE;
                }
                return ACTION_CONTINUE;
            }
        }

        protected Danmakus mVisibleDanmakus = new Danmakus(Danmakus.ST_BY_YPOS);
        protected boolean mCancelFixingFlag = false;
        protected RetainerConsumer mConsumer = new RetainerConsumer();
        protected RemoveDmConsumer mRemoveConsumer = new RemoveDmConsumer();
        protected IDanmakusRetainer mExtraRetainer;

        @Override
        public void shareExtraRetainer(IDanmakusRetainer retainer) {
            mExtraRetainer = retainer;
        }

        @Override
        public void fix(BaseDanmaku drawItem, IDisplayer disp, Verifier verifier) {
            if (drawItem.isOutside())
                return;
            int topMargin = disp.getAllMarginTop() + disp.getVirtualMargin(drawItem.getType(), IDisplayer.MARGIN_TOP);
            float topPos = topMargin;
            int lines = 0;
            boolean shown = drawItem.isShown();
            boolean willHit = !shown && !mVisibleDanmakus.isEmpty();
            boolean isOutOfVertialEdge = false;
            int margin = disp.getMargin();
            if (!shown) {
                mCancelFixingFlag = false;
                // 确定弹幕位置
                BaseDanmaku insertItem = null, firstItem = null, lastItem = null, minRightRow = null;
                boolean overwriteInsert = false;
                mConsumer.disp = disp;
                mConsumer.drawItem = drawItem;
                mConsumer.drawItemTop = topMargin;
                mVisibleDanmakus.forEachSync(mConsumer);
                RetainerState retainerState = mConsumer.result();
                if (retainerState != null) {
                    lines = retainerState.lines;
                    insertItem = retainerState.insertItem;
                    firstItem = retainerState.firstItem;
                    lastItem = retainerState.lastItem;
                    minRightRow = retainerState.minRightRow;
                    overwriteInsert = retainerState.overwriteInsert;
                    shown = retainerState.shown;
                    willHit = retainerState.willHit;
                }
                boolean checkEdge = true;
                if (insertItem != null) {
                    if (lastItem != null)
                        topPos = lastItem.getBottom() + margin;
                    else
                        topPos = insertItem.getTop();
                    if (insertItem != drawItem){
                        shown = false;
                    }
                } else if (overwriteInsert && minRightRow != null) {
                    topPos = minRightRow.getTop();
                    checkEdge = false;
                    shown = false;
                } else if (lastItem != null) {
                    topPos = lastItem.getBottom() + margin;
                    willHit = false;
                } else if (firstItem != null) {
                    topPos = firstItem.getTop();
                    shown = false;
                } else {
                    topPos = topMargin;
                }

                if (mExtraRetainer != null) {
                    float recommandedTopPos = (mExtraRetainer.getRecommandedTopPos(disp, topPos, drawItem, true));
                    if (recommandedTopPos != topPos) {
                        topPos = recommandedTopPos;
                        checkEdge = true;
                    }
                }

                if (checkEdge) {
                    isOutOfVertialEdge = isOutVerticalEdge(overwriteInsert, drawItem, disp, topPos, firstItem,
                            lastItem);
                }
                if (isOutOfVertialEdge) {
                    topPos = topMargin;
                    willHit = true;
                    lines = 1;
                }
                if (topPos == topMargin) {
                    shown = false;
                }
            }

            if (verifier != null && verifier.skipLayout(drawItem, topPos, lines, willHit)) {
                return;
            }

            if (isOutOfVertialEdge) {
                clear();
            }

            drawItem.layout(disp, drawItem.getLeft(), topPos);

            if (!shown) {
                mRemoveConsumer.drawItemTop = drawItem.getTop();
                mRemoveConsumer.drawItemBottom = drawItem.getBottom() + margin;
                mVisibleDanmakus.forEachSync(mRemoveConsumer);
                mVisibleDanmakus.addItem(drawItem);
            }

        }

        protected boolean isOutVerticalEdge(boolean overwriteInsert, BaseDanmaku drawItem,
                                            IDisplayer disp, float topPos, BaseDanmaku firstItem, BaseDanmaku lastItem) {
            int topMargin = disp.getVirtualMargin(drawItem.getType(), IDisplayer.MARGIN_TOP);
            int bottomMargin = disp.getVirtualMargin(drawItem.getType(), IDisplayer.MARGIN_BOTTOM);
            if (topPos < disp.getAllMarginTop() + topMargin ||
                    (firstItem != null && firstItem.getTop() > topMargin) || topPos + drawItem.paintHeight > disp.getHeight() - bottomMargin) {
                return true;
            }
            return false;
        }

        @Override
        public void clear() {
            mCancelFixingFlag = true;
            mVisibleDanmakus.clear();
        }

    }

    private static class FTDanmakusRetainer extends AlignTopRetainer {

        @Override
        protected boolean isOutVerticalEdge(boolean overwriteInsert, BaseDanmaku drawItem,
                                            IDisplayer disp, float topPos, BaseDanmaku firstItem, BaseDanmaku lastItem) {
            if (topPos + drawItem.paintHeight > disp.getHeight() - disp.getVirtualMargin(drawItem.getType(), IDisplayer.MARGIN_BOTTOM)) {
                return true;
            }
            return false;
        }

    }

    private static class AlignBottomRetainer extends FTDanmakusRetainer {
        protected class RetainerConsumer extends IDanmakus.Consumer<BaseDanmaku, RetainerState> {
            public IDisplayer disp;
            int lines = 0;
            public BaseDanmaku removeItem = null, firstItem = null, drawItem = null;
            boolean willHit = false;
            float topPos;

            @Override
            public void before() {
                lines = 0;
                removeItem = firstItem = null;
                willHit = false;
            }

            @Override
            public int accept(BaseDanmaku item) {
                if (mCancelFixingFlag) {
                    return ACTION_BREAK;
                }
                lines++;
                if (item == drawItem) {
                    removeItem = null;
                    willHit = false;
                    return ACTION_BREAK;
                }

                if (firstItem == null) {
                    firstItem = item;
                    if (firstItem.getBottom() != disp.getOriginHeight() - disp.getVirtualMargin(item.getType(), IDisplayer.MARGIN_BOTTOM)) {
                        return ACTION_BREAK;
                    }
                }

                if (topPos < getTopEdge(disp, item.getType())) {
                    removeItem = null;
                    return ACTION_BREAK;
                }

                // 检查碰撞
                willHit = DanmakuUtils.willHitInDuration(disp, item, drawItem,
                        drawItem.getDuration(), drawItem.getTimer().current());

                if (!willHit && mExtraRetainer != null) {
                    float expectedTopPos = item.getBottom() - drawItem.paintHeight;
                    willHit = (mExtraRetainer.getRecommandedTopPos(disp, expectedTopPos, drawItem,  false) != expectedTopPos);
                }

                if (!willHit) {
                    removeItem = item;
                    // topPos = item.getBottom() - drawItem.paintHeight;
                    return ACTION_BREAK;
                }

                topPos = item.getTop() - disp.getMargin() - drawItem.paintHeight;
                return ACTION_CONTINUE;
            }

            @Override
            public RetainerState result() {
                RetainerState retainerState = new RetainerState();
                retainerState.lines = this.lines;
                retainerState.firstItem = this.firstItem;
                retainerState.removeItem = this.removeItem;
                retainerState.willHit = this.willHit;
                return retainerState;
            }
        }

        protected RetainerConsumer mConsumer = new RetainerConsumer();
        protected Danmakus mVisibleDanmakus = new Danmakus(Danmakus.ST_BY_YPOS_DESC);

        private int getTopEdge(IDisplayer disp, int type) {
            return disp.getAllMarginTop() + (disp.getOriginHeight() - disp.getHeight()) + disp.getVirtualMargin(type, IDisplayer.MARGIN_TOP);
        }

        @Override
        public void fix(BaseDanmaku drawItem, IDisplayer disp, Verifier verifier) {
            if (drawItem.isOutside())
                return;
            boolean shown = drawItem.isShown();
            int type = drawItem.getType();
            float topPos = shown ? drawItem.getTop() : -1;
            int lines = 0;
            boolean willHit = !shown && !mVisibleDanmakus.isEmpty();
            boolean isOutOfVerticalEdge = false;
            if (topPos < getTopEdge(disp, type)) {
                int virtualMarginBottom = disp.getVirtualMargin(type, IDisplayer.MARGIN_BOTTOM);
                topPos = disp.getOriginHeight() - drawItem.paintHeight - virtualMarginBottom;
            }
            BaseDanmaku removeItem = null, firstItem = null;
            if (!shown) {
                mCancelFixingFlag = false;
                mConsumer.topPos = topPos;
                mConsumer.disp = disp;
                mConsumer.drawItem = drawItem;
                mVisibleDanmakus.forEachSync(mConsumer);
                RetainerState retainerState = mConsumer.result();
                topPos = mConsumer.topPos;
                if (retainerState != null) {
                    lines = retainerState.lines;
                    firstItem = retainerState.firstItem;
                    removeItem = retainerState.removeItem;
                    shown = retainerState.shown;
                    willHit = retainerState.willHit;
                }

                if (mExtraRetainer != null) {
                    float recommandedTopPos = (mExtraRetainer.getRecommandedTopPos(disp, topPos, drawItem, false));
                    if (recommandedTopPos != topPos) {
                        topPos = recommandedTopPos;
                    }
                }

                isOutOfVerticalEdge = isOutVerticalEdge(false, drawItem, disp, topPos, firstItem, null);
                if (isOutOfVerticalEdge) {
                    topPos = disp.getOriginHeight() - drawItem.paintHeight - disp.getVirtualMargin(type, IDisplayer.MARGIN_BOTTOM);;
                    willHit = true;
                    lines = 1;
                } else {
                    if (topPos >= getTopEdge(disp, type)) {
                        willHit = false;
                    }
                    if (removeItem != null) {
                        lines--;
                    }
                }

            }

            if (verifier != null && verifier.skipLayout(drawItem, topPos, lines, willHit)) {
                return;
            }

            if (isOutOfVerticalEdge) {
                clear();
            }

            drawItem.layout(disp, drawItem.getLeft(), topPos);

            if (!shown) {
                mVisibleDanmakus.removeItem(removeItem);
                mVisibleDanmakus.addItem(drawItem);
            }

        }

        protected boolean isOutVerticalEdge(boolean overwriteInsert, BaseDanmaku drawItem,
                                            IDisplayer disp, float topPos, BaseDanmaku firstItem, BaseDanmaku lastItem) {
            if (topPos < getTopEdge(disp, drawItem.getType())) {
                return true;
            }
            return false;
        }

        @Override
        public void clear() {
            mCancelFixingFlag = true;
            mVisibleDanmakus.clear();
        }

    }

}

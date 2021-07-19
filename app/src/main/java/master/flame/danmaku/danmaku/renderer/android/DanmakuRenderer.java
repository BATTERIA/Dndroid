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
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.ICacheManager;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.renderer.IRenderer;
import master.flame.danmaku.danmaku.renderer.Renderer;


public class DanmakuRenderer extends Renderer {

    private class Consumer extends IDanmakus.DefaultConsumer<BaseDanmaku> {
        private BaseDanmaku lastItem;
        public IDisplayer disp;
        public RenderingState renderingState;
        public long startRenderTime;

        @Override
        public int accept(BaseDanmaku drawItem) {


            if (mOnDanmakuShownListener != null
                    && drawItem.firstLoadedFlag != mContext.mGlobalFlagValues.FIRST_LOADED_RESET_FLAG) {
                renderingState.addLoadedCount(drawItem.getType());
                drawItem.firstLoadedFlag = mContext.mGlobalFlagValues.FIRST_LOADED_RESET_FLAG;
            }

            lastItem = drawItem;
            if (drawItem.isTimeOut()) {
                disp.recycle(drawItem);
                if (mCacheManager != null) {
                    mCacheManager.requestClearTimeout();
                }
                return renderingState.isRunningDanmakus ? ACTION_REMOVE : ACTION_CONTINUE;
            }

            if (!renderingState.isRunningDanmakus && drawItem.isOffset()) {
                return ACTION_CONTINUE;
            }

            if (drawItem.getActualTime() < startRenderTime) {
                renderingState.addTotalCount(1);
                return ACTION_CONTINUE;
            }
            if (!drawItem.hasPassedFilter()) {
                mContext.mDanmakuFilters.filter(drawItem, renderingState.indexInScreen, renderingState.totalSizeInScreen, renderingState.timer, false, mContext);
            }
            if (drawItem.isFiltered()) {
                return ACTION_CONTINUE;
            }

            if (drawItem.isLate()) {
                if (drawItem.getType() != BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                    return ACTION_BREAK;
                }
            }

            if (drawItem.priority == 0) {
                switch (drawItem.getType()) {
                    case BaseDanmaku.TYPE_SCROLL_RL:
                        if (!mContext.getR2LDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        // 同屏弹幕密度只对滚动弹幕有效
                        renderingState.indexInScreen++;
                        break;
                    case BaseDanmaku.TYPE_SCROLL_LR:
                        if (!mContext.getL2RDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                    case BaseDanmaku.TYPE_SCROLL_RL_IMAGE:
                        if (!mContext.getR2LImageDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                    case BaseDanmaku.TYPE_FIX_TOP:
                        if (!mContext.getFTDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                    case BaseDanmaku.TYPE_FIX_BOTTOM:
                        if (!mContext.getFBDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                    case BaseDanmaku.TYPE_SUBTITLE:
                        if (!mContext.getSubtitleDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                    case BaseDanmaku.TYPE_SPECIAL:
                        if (!mContext.getSpecialDanmakuVisibility()) {
                            return ACTION_CONTINUE;
                        }
                        break;
                }
            }

            // measure
            if (!drawItem.isMeasured()) {
                drawItem.measure(disp, false);
            }

            // notify prepare drawing
            if (!drawItem.isPrepared()) {
                drawItem.prepare(disp, false);
            }

            // layout
            mDanmakusRetainer.fix(drawItem, disp, mVerifier);

            // draw
            if (drawItem.isShown()) {
                if (drawItem.lines == null && drawItem.getBottom() - drawItem.paintWidth > disp.getOriginHeight()) {
                    return ACTION_CONTINUE;    // skip bottom outside danmaku
                }
                int renderingType = drawItem.draw(disp);
                if (renderingType == IRenderer.CACHE_RENDERING) {
                    renderingState.cacheHitCount++;
                } else if (renderingType == IRenderer.TEXT_RENDERING) {
                    renderingState.cacheMissCount++;
                    if (mCacheManager != null) {
                        mCacheManager.addDanmaku(drawItem);
                    }
                }
                renderingState.addCount(drawItem.getType(), 1);
                renderingState.addTotalCount(1);
                if (drawItem.getType() != BaseDanmaku.TYPE_SUBTITLE) {
                    renderingState.appendToRunningDanmakus(drawItem);
                }

                if (mOnDanmakuShownListener != null
                        && drawItem.firstShownFlag != mContext.mGlobalFlagValues.FIRST_SHOWN_RESET_FLAG) {
                    renderingState.addShownCount(drawItem.getType());
                    drawItem.firstShownFlag = mContext.mGlobalFlagValues.FIRST_SHOWN_RESET_FLAG;
                    mOnDanmakuShownListener.onDanmakuShown(drawItem);
                }

                if (mOnDanmakuShownListener != null
                        && drawItem.isTimeOut(drawItem.getTimer().current() + 200)
                        && drawItem.willDismissFlag != mContext.mGlobalFlagValues.WILL_DISMISS_RESET_FLAG) {
                    drawItem.willDismissFlag = mContext.mGlobalFlagValues.WILL_DISMISS_RESET_FLAG;
                    mOnDanmakuShownListener.onDanmakuWillDismiss(drawItem);
                }
            }
            return ACTION_CONTINUE;
        }

        @Override
        public void after() {
            if (renderingState.lastDanmaku == null || (lastItem != null && renderingState.lastDanmaku.getTime() > lastItem.getTime())) {
                renderingState.lastDanmaku = lastItem;
            }
            super.after();
        }
    }

    private DanmakuTimer mStartTimer;
    private final DanmakuContext mContext;
    private DanmakusRetainer.Verifier mVerifier;
    private final DanmakusRetainer.Verifier verifier = new DanmakusRetainer.Verifier() {
        @Override
        public boolean skipLayout(BaseDanmaku danmaku, float fixedTop, int lines, boolean willHit) {
            if (danmaku.priority == 0 && mContext.mDanmakuFilters.filterSecondary(danmaku, lines, 0, mStartTimer, willHit, mContext)) {
                danmaku.setVisibility(false);
                return true;
            }
            return false;
        }
    };
    private final DanmakusRetainer mDanmakusRetainer;
    private ICacheManager mCacheManager;
    private OnDanmakuShownListener mOnDanmakuShownListener;
    private Consumer mConsumer = new Consumer();

    public DanmakuRenderer(DanmakuContext config) {
        mContext = config;
        mDanmakusRetainer = new DanmakusRetainer(config.isAlignBottom());
    }

    @Override
    public void clear() {
        clearRetainer();
        mContext.mDanmakuFilters.clear();
    }

    @Override
    public void clearRetainer(Integer type) {
        mDanmakusRetainer.clear(type);
    }

    @Override
    public void clearRetainer() {
        mDanmakusRetainer.clear();
    }

    @Override
    public void release() {
        mDanmakusRetainer.release();
        mContext.mDanmakuFilters.clear();
    }

    @Override
    public void setVerifierEnabled(boolean enabled) {
        mVerifier = (enabled ? verifier : null);
    }

    @Override
    public void draw(final IDisplayer disp, IDanmakus danmakus, long startRenderTime, final RenderingState renderingState) {
        mStartTimer = renderingState.timer;
        mConsumer.disp = disp;
        mConsumer.renderingState = renderingState;
        mConsumer.startRenderTime = startRenderTime;
        danmakus.forEachSync(mConsumer);
    }

    public void setCacheManager(ICacheManager cacheManager) {
        mCacheManager = cacheManager;
    }

    @Override
    public void setOnDanmakuShownListener(OnDanmakuShownListener onDanmakuShownListener) {
        mOnDanmakuShownListener = onDanmakuShownListener;
    }

    @Override
    public void removeOnDanmakuShownListener() {
        mOnDanmakuShownListener = null;
    }

    public void alignBottom(boolean enable) {
        if (mDanmakusRetainer != null) {
            mDanmakusRetainer.alignBottom(enable);
        }
    }
}

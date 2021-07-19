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

package master.flame.danmaku.controller;

import android.graphics.Canvas;
import android.util.SparseArray;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import master.flame.danmaku.danmaku.model.AbsDisplayer;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.DanmakuContext.ConfigChangedCallback;
import master.flame.danmaku.danmaku.model.android.DanmakuContext.DanmakuConfigTag;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.renderer.IRenderer;
import master.flame.danmaku.danmaku.renderer.IRenderer.RenderingState;
import master.flame.danmaku.danmaku.renderer.android.DanmakuRenderer;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;
import master.flame.danmaku.danmaku.util.SystemClock;

public class DrawTask implements IDrawTask {

    protected final DanmakuContext mContext;

    protected final AbsDisplayer mDisp;

    protected IDanmakus danmakuList;

    protected BaseDanmakuParser mParser;

    TaskListener mTaskListener;

    final IRenderer mRenderer;

    DanmakuTimer mTimer;

    protected boolean clearRetainerFlag;

    private Map<Integer, Boolean> clearRetainerFlags = new ConcurrentHashMap<>();

    private long mStartRenderTime = 0;

    private final RenderingState mRenderingState = new RenderingState();

    protected boolean mReadyState;

    protected int mPlayState;

    private boolean mIsHidden;

    private BaseDanmaku mLastDanmaku;

    private Danmakus mLiveDanmakus = new Danmakus(Danmakus.ST_BY_LIST);

    private IDanmakus[] mRunningDanmakusArray;

    private boolean mRequestRender;

    private boolean mRequestSeek;

    private final SparseArray<Layer> mLayers = new SparseArray<>();

    private final DanmakuReportParameters mDanmakuReportParameters = new DanmakuReportParameters();

    private ConfigChangedCallback mConfigChangedCallback = new ConfigChangedCallback() {
        @Override
        public boolean onDanmakuConfigChanged(DanmakuContext config, DanmakuConfigTag tag, Object... values) {
            return DrawTask.this.onDanmakuConfigChanged(config, tag, values);
        }
    };

    public DrawTask(DanmakuTimer timer, DanmakuContext context,
                    TaskListener taskListener) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        mContext = context;
        context.registerConfigChangedCallback(mConfigChangedCallback);
        mDisp = context.getDisplayer();
        mTaskListener = taskListener;
        mRenderer = new DanmakuRenderer(context);
        mRenderer.setOnDanmakuShownListener(new IRenderer.OnDanmakuShownListener() {

            @Override
            public void onDanmakuShown(BaseDanmaku danmaku) {
                if (mTaskListener != null) {
                    mTaskListener.onDanmakuShown(danmaku);
                }
            }

            @Override
            public void onDanmakuWillDismiss(BaseDanmaku danmaku) {
                mTaskListener.onDanmakuWillDismiss(danmaku);
            }
        });
        mRenderer.setVerifierEnabled(mContext.isPreventOverlappingEnabled() || mContext.isMaxLinesLimited());
        initTimer(timer);
        Boolean enable = mContext.isDuplicateMergingEnabled();
        if (enable != null) {
            if (enable) {
                mContext.mDanmakuFilters.registerFilter(DanmakuFilters.TAG_DUPLICATE_FILTER);
            } else {
                mContext.mDanmakuFilters.unregisterFilter(DanmakuFilters.TAG_DUPLICATE_FILTER);
            }
        }

        mLayers.put(0, new Layer(0, mContext.getBaseComparator()));
        mLayers.put(BaseDanmaku.TYPE_SPECIAL, new Layer(BaseDanmaku.TYPE_SPECIAL, mContext.getBaseComparator()));
        mLayers.put(BaseDanmaku.TYPE_SCROLL_RL_IMAGE, new Layer(BaseDanmaku.TYPE_SCROLL_RL_IMAGE, mContext.getBaseComparator()));
        mLayers.put(BaseDanmaku.TYPE_SUBTITLE, new Layer(BaseDanmaku.TYPE_SUBTITLE, mContext.getBaseComparator()));
        mLayers.put(BaseDanmaku.TYPE_HIGH_LIKED, new Layer(BaseDanmaku.TYPE_HIGH_LIKED, mContext.getBaseComparator()));
    }

    protected void initTimer(DanmakuTimer timer) {
        mTimer = timer;
    }

    @Override
    public synchronized void addDanmaku(BaseDanmaku item) {
        if (danmakuList == null) {
            return;
        }
        if (item.isLive) {
            mLiveDanmakus.addItem(item);
            removeUnusedLiveDanmakusIn(10);
        }
        item.index = danmakuList.size();
        synchronized (danmakuList) {
            danmakuList.addItem(item);
        }
        boolean added;
        if (item.getType() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
            added = mLayers.get(BaseDanmaku.TYPE_SCROLL_RL_IMAGE).addDanmaku(item);
        } else if (item.getType() == BaseDanmaku.TYPE_SUBTITLE) {
            added = mLayers.get(BaseDanmaku.TYPE_SUBTITLE).addDanmaku(item);
        } else if (item.getType() == BaseDanmaku.TYPE_SPECIAL) {
            added = mLayers.get(BaseDanmaku.TYPE_SPECIAL).addDanmaku(item);
        } else if (item.isHighLikedLiked()) {
            added = mLayers.get(BaseDanmaku.TYPE_HIGH_LIKED).addDanmaku(item);
        } else {
            added = mLayers.get(0).addDanmaku(item);
        }
        if (added && mTaskListener != null) {
            mTaskListener.onDanmakuAdd(item);
        }
        mLastDanmaku = danmakuList.last();
    }

    @Override
    public void invalidateDanmaku(BaseDanmaku item, boolean remeasure) {
        mContext.getDisplayer().getCacheStuffer().clearCache(item);
        item.requestFlags |= BaseDanmaku.FLAG_REQUEST_INVALIDATE;
        if (remeasure) {
            item.paintWidth = -1;
            item.paintHeight = -1;
            item.requestFlags |= BaseDanmaku.FLAG_REQUEST_REMEASURE;
            item.measureResetFlag++;
        }
    }

    @Override
    public synchronized void removeDanmakusByType(int type) {
        Layer layer = mLayers.get(type);
        if (layer != null) {
            layer.removeAllDanmakus(true);
        }
        IDanmakus danmakuList = this.danmakuList;
        if (danmakuList != null) {
            danmakuList.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                @Override
                public int accept(BaseDanmaku danmaku) {
                    if (danmaku.getType() == type) {
                        return ACTION_REMOVE;
                    }
                    return ACTION_CONTINUE;
                }
            });
        }
        requestClearRetainer(type);
        if (mTaskListener != null) {
            mTaskListener.onDanmakuConfigChanged();
        }
    }

    @Override
    public long getCurrentCachingTimeMills() {
        return 0;
    }

    @Override
    public long getCurrentCachingBeginTimeMills() {
        return 0;
    }

    @Override
    public synchronized void removeAllDanmakus(boolean isClearDanmakusOnScreen) {
        if (isClearDanmakusOnScreen) {
            IDanmakus[] runningDanmakusArray = this.mRunningDanmakusArray;
            if (runningDanmakusArray != null) {
                for (IDanmakus danmakus : runningDanmakusArray) {
                    if (danmakus != null) {
                        danmakus.clear();
                    }
                }
            }
            for (int i = 0; i < mLayers.size(); i++) {
                Layer layer = mLayers.valueAt(i);
                if (layer != null) {
                    layer.removeAllDanmakus(true);
                }
            }
        }
        danmakuList.clear();
    }

    protected void onDanmakuRemoved(BaseDanmaku danmaku) {
        // override by CacheManagingDrawTask
    }

    @Override
    public synchronized void removeAllLiveDanmakus() {
        removeUnusedLiveDanmakusIn(-1);
    }

    protected synchronized void removeUnusedLiveDanmakusIn(final int msec) {
        if (danmakuList == null || danmakuList.isEmpty() || mLiveDanmakus.isEmpty())
            return;
        mLiveDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
            long startTime = SystemClock.uptimeMillis();

            @Override
            public int accept(BaseDanmaku danmaku) {
                boolean isTimeout = danmaku.isTimeOut();
                if (msec != -1 && SystemClock.uptimeMillis() - startTime > msec) {
                    return ACTION_BREAK;
                }
                if (isTimeout) {
                    Layer layer = mLayers.get(danmaku.getType());
                    if (layer == null) {
                        layer = mLayers.get(0);
                    }
                    layer.removeItem(danmaku);
                    danmakuList.removeItem(danmaku);
                    onDanmakuRemoved(danmaku);
                    return ACTION_REMOVE;
                } else {
                    return ACTION_BREAK;
                }

            }
        });
    }

    @Override
    public IDanmakus getVisibleDanmakusOnTime(long time) {
        final IDanmakus visibleDanmakus = new Danmakus();
        int i = 0;
        while (i++ < 3) {
            try {
                for (int j = 0; j < mLayers.size(); j++) {
                    Layer layer;
                    if ((layer = mLayers.valueAt(j)) != null) {
                        long beginMills = time - mContext.mDanmakuFactory.MAX_DANMAKU_DURATION - 100;
                        long endMills = time + mContext.mDanmakuFactory.MAX_DANMAKU_DURATION;
                        if (layer.getId() == BaseDanmaku.TYPE_SUBTITLE) {
                            endMills += layer.getMaxDuration();
                        }
                        if (layer.getId() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                            beginMills -= layer.getMaxDuration();
                            endMills += layer.getMaxDuration();
                        }
                        IDanmakus danmakus = layer.subnew(beginMills, endMills);
                        if (danmakus != null) {
                            danmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                                @Override
                                public int accept(BaseDanmaku danmaku) {
                                    if (danmaku.isLate()) {
                                        return ACTION_BREAK;
                                    }
                                    if (danmaku.isShown() && !danmaku.isOutside()) {
                                        visibleDanmakus.addItem(danmaku);
                                    }
                                    return ACTION_CONTINUE;
                                }
                            });
                        }
                        layer.stoppedDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                            @Override
                            public int accept(BaseDanmaku danmaku) {
                                if (danmaku.isShown() && !danmaku.isTimeOut() && !danmaku.isOutside()) {
                                    visibleDanmakus.addItem(danmaku);
                                }
                                return ACTION_CONTINUE;
                            }
                        });
                    }
                }
                break;
            } catch (Exception e) { //avoid ConcurrentModificationException
                e.printStackTrace();
            }
        }
        return visibleDanmakus;
    }

    @Override
    public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled) {
        IDanmakus subDanmakus = new Danmakus(IDanmakus.ST_BY_TIME, isDuplicateMergingEnabled);
        try {
            for (int j = 0; j < mLayers.size(); j++) {
                Layer layer;
                if ((layer = mLayers.valueAt(j)) != null) {
                    IDanmakus danmakus = layer.subnew(beginMills, endMills);
                    if (danmakus != null) {
                        danmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                            @Override
                            public int accept(BaseDanmaku danmaku) {
                                subDanmakus.addItem(danmaku);
                                return ACTION_CONTINUE;
                            }
                        });
                    }
                    layer.stoppedDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                        @Override
                        public int accept(BaseDanmaku danmaku) {
                            subDanmakus.addItem(danmaku);
                            return ACTION_CONTINUE;
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subDanmakus;
    }

    @Override
    public void addHoveredDanmaku(BaseDanmaku danmaku) {
        if (danmaku == null || danmaku.isHovered()) {
            return;
        }
        try {
            for (int j = 0; j < mLayers.size(); j++) {
                Layer layer;
                if ((layer = mLayers.valueAt(j)) != null) {
                    if ((!danmaku.isHighLikedLiked() && layer.getId() == 0)
                            || (danmaku.isHighLikedLiked() && layer.getId() == BaseDanmaku.TYPE_HIGH_LIKED)) {
                        danmaku.setDanmakuHovered(true);
                        layer.stoppedDanmakus.addItem(danmaku);
                        layer.resetRange();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeHoveredDanmaku(BaseDanmaku danmaku) {
        if (danmaku == null || !danmaku.isHovered()) {
            return;
        }
        danmaku.setDanmakuHovered(false);
    }

    @Override
    public synchronized RenderingState draw(AbsDisplayer displayer, DrawHelper.Mode mode) {
        return drawDanmakus(displayer, mode, mTimer);
    }

    @Override
    public void reset() {
        for (int i = 0; i < mLayers.size(); i++) {
            Layer layer;
            if ((layer = mLayers.valueAt(i)) != null) {
                layer.reset();
            }
        }
        mRunningDanmakusArray = new IDanmakus[mLayers.size()];
        if (mRenderer != null)
            mRenderer.clear();
    }

    @Override
    public void seek(long mills) {
        reset();
        mContext.mGlobalFlagValues.updateVisibleFlag();
        mContext.mGlobalFlagValues.updateFirstLoadedFlag();
        mContext.mGlobalFlagValues.updateFirstShownFlag();
        mContext.mGlobalFlagValues.updateWillDismissFlag();
        mContext.mGlobalFlagValues.updateSyncOffsetTimeFlag();
        mContext.mGlobalFlagValues.updatePrepareFlag();
        mContext.mGlobalFlagValues.updateFilterFlag();
        mStartRenderTime = mills < 1000 ? 0 : mills;
        mRenderingState.reset();
        mRenderingState.endTime = mStartRenderTime;

        for (int i = 0; i < mLayers.size(); i++) {
            Layer layer;
            if ((layer = mLayers.valueAt(i)) != null) {
                layer.resetRange();
            }
        }

//        if (danmakuList != null) {
//            BaseDanmaku last = danmakuList.last();
//            if (last != null && !last.isTimeOut()) {
//                mLastDanmaku = last;   //TODO 检查有没有必要
//            }
//        }
        requestClearRetainer();
        mRequestSeek = true;
    }

    @Override
    public void clearDanmakusOnScreen(long currMillis) {
        reset();
        mContext.mGlobalFlagValues.updateVisibleFlag();
        mContext.mGlobalFlagValues.updateFirstShownFlag();
        mContext.mGlobalFlagValues.updateWillDismissFlag();
        mStartRenderTime = currMillis;
    }

    @Override
    public void start() {
        mContext.registerConfigChangedCallback(mConfigChangedCallback);
    }

    @Override
    public void quit() {
        mContext.unregisterAllConfigChangedCallbacks();
        if (mRenderer != null)
            mRenderer.release();
    }

    public void prepare() {
        if (mParser == null) {
            return;
        }
        loadDanmakus(mParser);
        for (int i = 0; i < mLayers.size(); i++) {
            Layer layer;
            if ((layer = mLayers.valueAt(i)) != null) {
                layer.resetRange();
            }
        }
        if (mTaskListener != null) {
            mTaskListener.ready();
            mReadyState = true;
        }
    }

    @Override
    public void onPlayStateChanged(int state) {
        mPlayState = state;
    }

    protected void loadDanmakus(BaseDanmakuParser parser) {
        danmakuList = parser.setConfig(mContext).setDisplayer(mDisp).setTimer(mTimer).setListener(new BaseDanmakuParser.Listener() {
            @Override
            public void onDanmakuAdd(BaseDanmaku item) {
                if (item.getType() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                    mLayers.get(BaseDanmaku.TYPE_SCROLL_RL_IMAGE).addDanmaku(item);
                } else if (item.getType() == BaseDanmaku.TYPE_SUBTITLE) {
                    mLayers.get(BaseDanmaku.TYPE_SUBTITLE).addDanmaku(item);
                } else if (item.getType() == BaseDanmaku.TYPE_SPECIAL) {
                    mLayers.get(BaseDanmaku.TYPE_SPECIAL).addDanmaku(item);
                } else if (item.isHighLikedLiked()) {
                    mLayers.get(BaseDanmaku.TYPE_HIGH_LIKED).addDanmaku(item);
                } else {
                    mLayers.get(0).addDanmaku(item);
                }
                if (mTaskListener != null) {
                    mTaskListener.onDanmakuAdd(item);
                }
                BaseDanmaku lastDanmaku = mLastDanmaku;
                if (lastDanmaku != null && item.getTime() > lastDanmaku.getTime()) {
                    mLastDanmaku = item;
                } else if (lastDanmaku == null) {
                    mLastDanmaku = item;
                }
            }
        }).getDanmakus();
        mContext.mGlobalFlagValues.resetAll();
        mLastDanmaku = danmakuList.last();
    }

    public void setParser(BaseDanmakuParser parser) {
        mParser = parser;
        mReadyState = false;
    }

    protected RenderingState drawDanmakus(AbsDisplayer disp, DrawHelper.Mode mode, DanmakuTimer timer) {
        if (clearRetainerFlag) {
            mRenderer.clearRetainer();
            clearRetainerFlag = false;
        }
        for (Integer type : clearRetainerFlags.keySet()) {
            if (Boolean.TRUE.equals(clearRetainerFlags.get(type))) {
                mRenderer.clearRetainer(type);
                clearRetainerFlags.put(type, false);
            }
        }
        Canvas canvas = (Canvas) disp.getExtraData();
        DrawHelper.clearCanvas(canvas, mode);
        if (mIsHidden && !mRequestRender) {
            return mRenderingState;
        }
        mRequestRender = false;
        RenderingState renderingState = mRenderingState;
        // prepare screenDanmakus
        int screenDanmakusSize = 0;

        long minBeginMills = 0, minEndMills = 0;
        for (int i = 0; i < mLayers.size(); i++) {
            Layer layer;
            if ((layer = mLayers.valueAt(i)) != null) {
                long beginMills = timer.current() - mContext.mDanmakuFactory.MAX_DANMAKU_DURATION - 100;
                long endMills = timer.current() + mContext.mDanmakuFactory.MAX_DANMAKU_DURATION;
                boolean noCache = false;
                if (layer.getId() == BaseDanmaku.TYPE_SCROLL_RL_IMAGE) {
                    beginMills -= layer.getMaxDuration();
                    endMills += layer.getMaxDuration();
                    noCache = true;
                }
                layer.prepareDanmakusOnScreen(mContext, beginMills, endMills, timer, noCache, layer.getId() == BaseDanmaku.TYPE_SPECIAL);
                IDanmakus screenDanmakus = layer.currentScreenDanmakus;
                IDanmakus hoverDanmakus = layer.stoppedDanmakus;
                if (screenDanmakus != null) {
                    screenDanmakusSize += screenDanmakus.size();
                }
                if (hoverDanmakus != null) {
                    screenDanmakusSize += hoverDanmakus.size();
                }
                minBeginMills = Math.min(minBeginMills, layer.getLastBeginMills());
                minEndMills = Math.min(minEndMills, layer.getLastEndMillsMills());
            }
        }

        // prepare runningDanmakus to draw (in sync-mode)
        IDanmakus[] runningDanmakusArray = mRunningDanmakusArray;
        if (mRequestSeek) {
            mRunningDanmakusArray = new IDanmakus[mLayers.size()];
            runningDanmakusArray = null;
            mRequestSeek = false;
        }
        int runningDanmakusSize = 0;
        if (runningDanmakusArray != null) {
            for (IDanmakus runningDanmakus :
                    runningDanmakusArray) {
                if (runningDanmakus == null) {
                    continue;
                }
                runningDanmakusSize += runningDanmakus.size();
            }
        }
        beginTracing(renderingState, runningDanmakusSize, screenDanmakusSize);
        if (runningDanmakusArray != null && runningDanmakusSize > 0) {
            renderingState.isRunningDanmakus = true;
            for (IDanmakus runningDanmakus :
                    runningDanmakusArray) {
                if (runningDanmakus == null) {
                    continue;
                }
                int layerId = -1;
                if (runningDanmakus.size() > 0) {
                    BaseDanmaku first = runningDanmakus.first();
                    if (first != null) {
                        layerId = first.getType() < BaseDanmaku.TYPE_SCROLL_RL_IMAGE ? 0 : first.getType();
                    }
                }
                if (mTaskListener != null && layerId > -1) {
                    mTaskListener.onLayerPreUpdate(layerId);
                }
                mRenderer.draw(disp, runningDanmakus, 0, renderingState);
                if (mTaskListener != null && layerId > -1) {
                    mTaskListener.onLayerUpdate(layerId);
                }
            }
        }

        // draw screenDanmakus
        renderingState.isRunningDanmakus = false;
        if (screenDanmakusSize > 0) {
            for (int i = 0; i < mLayers.size(); i++) {
                Layer layer;
                if ((layer = mLayers.valueAt(i)) != null) {
                    if (mTaskListener != null) {
                        mTaskListener.onLayerPreUpdate(layer.getId());
                    }
                    IDanmakus screenDanmakus = layer.currentScreenDanmakus;
                    if (screenDanmakus != null) {
                        mRenderer.draw(mDisp, screenDanmakus, layer.getId() == BaseDanmaku.TYPE_SUBTITLE ? 0 : mStartRenderTime, renderingState);
                    }
                    IDanmakus hoverDanmakus = layer.stoppedDanmakus;
                    if (hoverDanmakus != null && !hoverDanmakus.isEmpty()) {
                        mRenderer.draw(mDisp, hoverDanmakus, layer.getId() == BaseDanmaku.TYPE_SUBTITLE ? 0 : mStartRenderTime, renderingState);
                    }
                    if (mTaskListener != null) {
                        mTaskListener.onLayerUpdate(layer.getId());
                    }
                }
            }
            endTracing(renderingState);
            if (renderingState.nothingRendered) {
                if (mLastDanmaku != null && mLastDanmaku.isTimeOut()) {
                    mLastDanmaku = null;
                    if (mTaskListener != null) {
                        mTaskListener.onDanmakusDrawingFinished();
                    }
                }
                if (renderingState.beginTime == RenderingState.UNKNOWN_TIME) {
                    renderingState.beginTime = minBeginMills;
                }
                if (renderingState.endTime == RenderingState.UNKNOWN_TIME) {
                    renderingState.endTime = minEndMills;
                }
            }
            renderingState.cacheTimeMills = getCurrentCachingTimeMills();
            renderingState.cacheBeginTimeMills = getCurrentCachingBeginTimeMills();
            return renderingState;
        } else {
            renderingState.nothingRendered = true;
            renderingState.beginTime = minBeginMills;
            renderingState.endTime = minEndMills;
            renderingState.cacheTimeMills = getCurrentCachingTimeMills();
            renderingState.cacheBeginTimeMills = getCurrentCachingBeginTimeMills();
            return renderingState;
        }
    }

    @Override
    public void requestClear() {
        for (int i = 0; i < mLayers.size(); i++) {
            Layer layer;
            if ((layer = mLayers.valueAt(i)) != null) {
                layer.resetRange();
            }
        }
        mIsHidden = false;
    }

    @Override
    public DanmakuReportParameters reportDanmakuParameters(long time) {
        boolean result = mDanmakuReportParameters.calculateDanmakusData(time, mContext, mLayers);
        if (result) {
            return mDanmakuReportParameters;
        }
        return null;
    }

    @Override
    public void requestClearRetainer() {
        clearRetainerFlag = true;
    }

    @Override
    public void requestClearRetainer(Integer type) {
        clearRetainerFlags.put(type, true);
    }

    @Override
    public void requestSync(long fromTimeMills, long toTimeMills, final long offsetMills) {
        // obtain the running-danmakus which was drawn on screen
        IDanmakus[] runningDanmakusArray = mRenderingState.obtainRunningDanmakus();
        mRunningDanmakusArray = runningDanmakusArray;
        // set offset time for each running-danmakus
        for (IDanmakus runningDanmakus :
                runningDanmakusArray) {
            if (runningDanmakus == null) {
                continue;
            }
            runningDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                @Override
                public int accept(BaseDanmaku danmaku) {
                    if (danmaku.isOutside()) {
                        return ACTION_REMOVE;
                    }
                    if (danmaku.isHovered()) {
                        danmaku.setHoverTime(danmaku.getHoverTime() + offsetMills);
                    }
                    danmaku.setTimeOffset(offsetMills + danmaku.timeOffset);
                    if (danmaku.timeOffset == 0) {
                        return ACTION_REMOVE;
                    }
                    return ACTION_CONTINUE;
                }
            });
        }
        mStartRenderTime = toTimeMills;
    }

    public boolean onDanmakuConfigChanged(DanmakuContext config, DanmakuConfigTag tag,
                                          Object... values) {
        boolean handled = handleOnDanmakuConfigChanged(config, tag, values);
        if (mTaskListener != null) {
            mTaskListener.onDanmakuConfigChanged();
            if (tag.isVisibilityTag()) {
                mTaskListener.onDanmakuVisibilityChanged();
            }
        }
        return handled;
    }

    protected boolean handleOnDanmakuConfigChanged(DanmakuContext config, DanmakuConfigTag tag, Object[] values) {
        boolean handled = false;
        if (tag == null || DanmakuConfigTag.MAXIMUM_NUMS_IN_SCREEN.equals(tag)) {
            handled = true;
        } else if (DanmakuConfigTag.DUPLICATE_MERGING_ENABLED.equals(tag)) {
            Boolean enable = (Boolean) values[0];
            if (enable != null) {
                if (enable) {
                    mContext.mDanmakuFilters.registerFilter(DanmakuFilters.TAG_DUPLICATE_FILTER);
                } else {
                    mContext.mDanmakuFilters.unregisterFilter(DanmakuFilters.TAG_DUPLICATE_FILTER);
                }
                handled = true;
            }
        } else if (DanmakuConfigTag.SCALE_TEXTSIZE.equals(tag) || DanmakuConfigTag.SCROLL_SPEED_FACTOR.equals(tag) || DanmakuConfigTag.DANMAKU_MARGIN.equals(tag)) {
            requestClearRetainer();
            handled = false;
        } else if (DanmakuConfigTag.MAXIMUN_LINES.equals(tag) || DanmakuConfigTag.OVERLAPPING_ENABLE.equals(tag)) {
            if (mRenderer != null) {
                mRenderer.setVerifierEnabled(mContext.isPreventOverlappingEnabled() || mContext.isMaxLinesLimited());
            }
            handled = true;
        } else if (DanmakuConfigTag.ALIGN_BOTTOM.equals(tag)) {
            Boolean enable = (Boolean) values[0];
            if (enable != null) {
                if (mRenderer != null) {
                    mRenderer.alignBottom(enable);
                }
                handled = true;
            }
        } else if (DanmakuConfigTag.SCREEN_OCCUPATION_RATIO.equals(tag)) {
            Float ratio = (Float) values[0];
            if (ratio != null && mDisp != null) {
                mDisp.setScreenOccupationRatio(ratio);
            }
            handled = true;
        } else if (DanmakuConfigTag.VIRTUAL_MARGINS.equals(tag)) {
            requestClearRetainer((Integer) values[0]);
            handled = true;
        }
        return handled;
    }

    @Override
    public void requestHide() {
        mIsHidden = true;
    }

    @Override
    public void requestRender() {
        this.mRequestRender = true;
    }

    private void beginTracing(RenderingState renderingState, int runningDanmakusSize, int screenDanmakusSize) {
        renderingState.reset();
        renderingState.timer.update(SystemClock.uptimeMillis());
        renderingState.indexInScreen = 0;
        renderingState.totalSizeInScreen = runningDanmakusSize + screenDanmakusSize;
    }

    private void endTracing(RenderingState renderingState) {
        renderingState.nothingRendered = (renderingState.totalDanmakuCount == 0 && mStartRenderTime < mTimer.current());
        if (renderingState.nothingRendered) {
            renderingState.beginTime = RenderingState.UNKNOWN_TIME;
        }
        BaseDanmaku lastDanmaku = renderingState.lastDanmaku;
        renderingState.lastDanmaku = null;
        renderingState.endTime = lastDanmaku != null ? lastDanmaku.getActualTime() : RenderingState.UNKNOWN_TIME;
        renderingState.timer.update();
        renderingState.consumingTime = renderingState.timer.current();
    }
}

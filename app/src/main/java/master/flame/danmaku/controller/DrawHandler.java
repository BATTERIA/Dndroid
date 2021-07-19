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

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.Choreographer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import master.flame.danmaku.danmaku.model.AbsDanmakuSync;
import master.flame.danmaku.danmaku.model.AbsDisplayer;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.renderer.IRenderer.RenderingState;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;
import master.flame.danmaku.danmaku.util.SystemClock;
import tv.cjump.jni.DeviceUtils;

public class DrawHandler extends Handler {

    private DanmakuContext mContext;
    private FrameCallback mFrameCallback;

    public interface Callback {
        void prepared();

        default void updateTimer(DanmakuTimer timer){}

        default void danmakuShown(BaseDanmaku danmaku){}

        default void danmakuWillDismiss(BaseDanmaku danmaku){}

        default void drawingFinished(){}

        default void onLayerPreUpdate(int layer, Canvas extraData, long currentTime){}

        default void onLayerUpdate(int layer, Canvas canvas, long currentMills){}

        default void onFrameUpdate(Canvas canvas, long currentMills){}
    }

    public static final int START = 1;

    public static final int UPDATE = 2;

    public static final int RESUME = 3;

    public static final int SEEK_POS = 4;

    public static final int PREPARE = 5;

    private static final int QUIT = 6;

    private static final int PAUSE = 7;

    private static final int SHOW_DANMAKUS = 8;

    private static final int HIDE_DANMAKUS = 9;

    private static final int NOTIFY_DISP_SIZE_CHANGED = 10;

    private static final int NOTIFY_RENDERING = 11;

    private static final int UPDATE_WHEN_PAUSED = 12;

    private static final int CLEAR_DANMAKUS_ON_SCREEN = 13;

    private static final int FORCE_RENDER = 14;

    private static final int REQUEST_UPDATE_MEASURE = 1;

    private static final int REQUEST_UPDATE_VISIBLE = 2;

    private static final int REQUEST_CLEAR_RETAINER = 4;

    private static final int REQUEST_RELAYOUT = 7;

    private static final long INDEFINITE_TIME = 10000000;

    private boolean quitFlag = true;

    private boolean mReady;

    private Callback mCallback;

    private DanmakuTimer timer = new DanmakuTimer();

    private BaseDanmakuParser mParser;

    public IDrawTask drawTask;

    private IDanmakuViewController mDanmakuView;

    private boolean mDanmakusVisible = true;

    private AbsDisplayer mDisp;

    private final RenderingState mRenderingState = new RenderingState();

    private UpdateThread mThread;

    private boolean mUpdateInSeparateThread;

    @SuppressWarnings("unused")
    private long mThresholdTime;

    private boolean mInSeekingAction;

    private long mDesireSeekingTime;

    private boolean mInSyncAction;

    private boolean mInWaitingState;

    private boolean mIdleSleep;

    private boolean mNonBlockModeEnable;

    public DrawHandler(Looper looper, IDanmakuViewController view, boolean danmakuVisibile) {
        super(looper);
        mIdleSleep = !DeviceUtils.isProblemBoxDevice();
        bindView(view);
        if (danmakuVisibile) {
            showDanmakus(null);
        } else {
            hideDanmakus(false);
        }
        mDanmakusVisible = danmakuVisibile;
    }

    public void bindView(IDanmakuViewController view) {
        this.mDanmakuView = view;
    }

    public void unbindView() {
        this.mDanmakuView = null;
    }

    public void setIdleSleep(boolean enable) {
        mIdleSleep = enable;
    }

    public void enableNonBlockMode(boolean enable) {
        mNonBlockModeEnable = enable;
    }

    public void setConfig(DanmakuContext config) {
        mContext = config;
    }

    public void setParser(BaseDanmakuParser parser) {
        mParser = parser;
        DanmakuTimer timer = parser.getTimer();
        if (timer != null) {
            this.timer = timer;
        }
    }

    public void setCallback(Callback cb) {
        mCallback = cb;
    }

    public void quit() {
        quitFlag = true;
        removeCallbacksAndMessages(null);
        sendEmptyMessage(QUIT);
    }

    public boolean isStop() {
        return quitFlag;
    }

    private long pausedPosition;

    @Override
    public void handleMessage(Message msg) {
        int what = msg.what;
        switch (what) {
            case PREPARE:
                timer.update(0);
                if (mParser == null || !mDanmakuView.isViewReady()) {
                    sendEmptyMessageDelayed(PREPARE, 100);
                } else {
                    prepare(new Runnable() {
                        @Override
                        public void run() {
                            pausedPosition = 0;
                            mReady = true;
                            if (mCallback != null) {
                                mCallback.prepared();
                            }
                        }
                    });
                }
                break;
            case SHOW_DANMAKUS:
                mDanmakusVisible = true;
                Long start = (Long) msg.obj;
                boolean resume = false;
                if (drawTask != null) {
                    if (start == null) {
                        timer.update(getCurrentTime());
                        drawTask.requestClear();
                    } else {
                        drawTask.start();
                        drawTask.seek(start);
                        drawTask.requestClear();
                        resume = true;
                    }
                }
                if (quitFlag && mDanmakuView != null) {
                    mDanmakuView.drawDanmakus();
                }
                notifyRendering();
                if (!resume) {
                    break;
                }
            case START:
                Long startTime = (Long) msg.obj;
                if (startTime != null) {
                    pausedPosition = startTime;
                } else {
                    pausedPosition = 0;
                }
            case SEEK_POS:
                if (what == SEEK_POS) {
                    quitFlag = true;
                    quitUpdateThread();
                    Long position = (Long) msg.obj;
                    timer.update(position);
                    if (mContext != null) {
                        mContext.mGlobalFlagValues.updateMeasureFlag();
                    }
                    if (drawTask != null) {
                        drawTask.seek(position);
                    }
                    pausedPosition = position;
                }
            case RESUME:
                removeMessages(DrawHandler.PAUSE);
                quitFlag = false;
                if (mReady) {
                    mRenderingState.reset();
                    timer.update(pausedPosition);
                    removeMessages(RESUME);
                    sendEmptyMessage(UPDATE);
                    if (drawTask != null) {
                        drawTask.start();
                    }
                    notifyRendering();
                    mInSeekingAction = false;
                    if (drawTask != null) {
                        drawTask.onPlayStateChanged(IDrawTask.PLAY_STATE_PLAYING);
                    }
                } else {
                    sendEmptyMessageDelayed(RESUME, 100);
                }
                break;
            case UPDATE:
                if (mContext != null) {
                    if (mContext.updateMethod == 0) {
                        updateInChoreographer();
                    } else if (mContext.updateMethod == 1) {
                        updateInNewThread();
                    } else if (mContext.updateMethod == 2) {
                        updateInCurrentThread();
                    }
                }
                break;
            case NOTIFY_DISP_SIZE_CHANGED:
                if (mContext != null) {
                    mContext.mDanmakuFactory.notifyDispSizeChanged(mContext);
                    Integer updateFlag = (Integer) msg.obj;
                    if (updateFlag != null) {
                        if ((updateFlag & REQUEST_UPDATE_MEASURE) != 0) {
                            mContext.mGlobalFlagValues.updateMeasureFlag();
                        }
                        if ((updateFlag & REQUEST_UPDATE_VISIBLE) != 0) {
                            mContext.mGlobalFlagValues.updateVisibleFlag();
                        }
                        if ((updateFlag & REQUEST_CLEAR_RETAINER) != 0) {
                            if ((updateFlag & REQUEST_UPDATE_VISIBLE) != 0) {
                                drawTask.requestClearRetainer();
                            } else {
                                drawTask.requestClearRetainer(BaseDanmaku.TYPE_SUBTITLE);
                            }
                        }
                    }
                }
                break;
            case HIDE_DANMAKUS:
                mDanmakusVisible = false;
                if (mDanmakuView != null) {
                    mDanmakuView.clear();
                }
                if(this.drawTask != null) {
                    this.drawTask.requestClear();
                    this.drawTask.requestHide();
                }
                Boolean quitDrawTask = (Boolean) msg.obj;
                if (quitDrawTask && this.drawTask != null) {
                    this.drawTask.quit();
                }
                if (!quitDrawTask) {
                    break;
                }
            case PAUSE:
                removeMessages(DrawHandler.RESUME);
                removeMessages(UPDATE);
                if (drawTask != null) {
                    drawTask.onPlayStateChanged(IDrawTask.PLAY_STATE_PAUSE);
                }
            case QUIT:
                if (what == QUIT) {
                    removeCallbacksAndMessages(null);
                }
                quitFlag = true;
                syncTimerIfNeeded();
                pausedPosition = timer.current();
                if (mUpdateInSeparateThread) {
                    notifyRendering();
                    quitUpdateThread();
                }
                if (mFrameCallback != null) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
                        Choreographer.getInstance().removeFrameCallback(mFrameCallback);
                        try {
                            Method method = Choreographer.class.getMethod("releaseInstance");
                            method.invoke(null);
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
                        Choreographer.getInstance().removeFrameCallback(mFrameCallback);
                        Choreographer old = Choreographer.getInstance();
                        try {
                            Field sThreadInstance = Choreographer.class.getDeclaredField("sThreadInstance");
                            sThreadInstance.setAccessible(true);
                            ThreadLocal<Choreographer> instance = (ThreadLocal<Choreographer>) sThreadInstance.get(null);
                            instance.remove();
                            Field field = Choreographer.class.getDeclaredField("mDisplayEventReceiver");
                            field.setAccessible(true);
                            Object object = field.get(old);
                            Method method = object.getClass().getMethod("dispose");
                            method.invoke(object);
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                        }
                    }
                    Choreographer.getInstance().removeFrameCallback(mFrameCallback);
                }
                if (what == QUIT){
                    if (this.drawTask != null){
                        this.drawTask.quit();
                    }
                    if (mParser != null) {
                        mParser.release();
                    }
                    if (this.getLooper() != Looper.getMainLooper())
                        this.getLooper().quit();
                }
                break;
            case NOTIFY_RENDERING:
                notifyRendering();
                break;
            case UPDATE_WHEN_PAUSED:
                if (quitFlag && mDanmakuView != null && drawTask != null) {
                    drawTask.requestClear();
                    mDanmakuView.drawDanmakus();
                    notifyRendering();
                }
                break;
            case CLEAR_DANMAKUS_ON_SCREEN:
                if (drawTask != null) {
                    drawTask.clearDanmakusOnScreen(getCurrentTime());
                }
                break;
            case FORCE_RENDER:
                if (drawTask != null) {
                    drawTask.requestRender();
                }
                break;
        }
    }

    private synchronized void quitUpdateThread() {
        UpdateThread thread = mThread;
        mThread = null;
        if (thread != null) {
            synchronized (drawTask) {
                drawTask.notifyAll();
            }
            thread.quit();
            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateInCurrentThread() {
        if (quitFlag) {
            return;
        }
        syncTimer();
        if (!mNonBlockModeEnable) {
            removeMessages(UPDATE);
            sendEmptyMessageDelayed(UPDATE, 60);
            return;
        }
        mDanmakuView.drawDanmakus();
        removeMessages(UPDATE);
        if (!mDanmakusVisible) {
            waitRendering(INDEFINITE_TIME);
            return;
        } else if (mRenderingState.nothingRendered && mIdleSleep) {
            long dTime = mRenderingState.endTime - timer.current();
            if (dTime > 500) {
                waitRendering(dTime - 10);
                return;
            }
        }
        sendEmptyMessage(UPDATE);
    }

    private void updateInNewThread() {
        if (mThread != null) {
            return;
        }
        mThread = new UpdateThread("DFM Update") {
            @Override
            public void run() {
                long lastTime = SystemClock.uptimeMillis();
                long dTime = 0;
                while (!isQuited() && !quitFlag) {
                    dTime = SystemClock.uptimeMillis() - lastTime;
                    long diffTime = 60 - dTime;
                    if (diffTime > 1 && !mNonBlockModeEnable) {
                        SystemClock.sleep(1);
                        continue;
                    }
                    syncTimer();
                    if (!mNonBlockModeEnable) {
                        SystemClock.sleep(60);
                        continue;
                    }
                    mDanmakuView.drawDanmakus();
                    if (!mDanmakusVisible) {
                        waitRendering(INDEFINITE_TIME);
                    } else if (mRenderingState.nothingRendered && mIdleSleep) {
                        dTime = mRenderingState.endTime - timer.current();
                        if (dTime > 500) {
                            notifyRendering();
                            waitRendering(dTime - 10);
                        }
                    }
                }
            }
        };
        mThread.start();
    }

    @TargetApi(16)
    private class FrameCallback implements Choreographer.FrameCallback {
        @Override
        public void doFrame(long frameTimeNanos) {
            updateInChoreographer();
        }
    }

    @TargetApi(16)
    private void updateInChoreographer() {
        if (quitFlag) {
            return;
        }
        try {
            Choreographer.getInstance().postFrameCallback(mFrameCallback);
        } catch (RuntimeException ignore) {}
        if (mDanmakuView == null) {
            return;
        }
        syncTimer();
        mDanmakuView.drawDanmakus();
        if (!mDanmakusVisible) {
            waitRendering(INDEFINITE_TIME);
        } else if (mRenderingState.nothingRendered && mIdleSleep) {
            long dTime = mRenderingState.endTime - timer.current();
            if (dTime > 500) {
                waitRendering(dTime - 10);
            }
        }

    }

    private final void syncTimer() {
        if (mInSeekingAction || mInSyncAction) {
            return;
        }
        mInSyncAction = true;
        if (mNonBlockModeEnable) {
            if (mCallback != null) {
                mCallback.updateTimer(timer);
            }
        }
//        else if (!mDanmakusVisible || mRenderingState.nothingRendered || mInWaitingState) {
//            timer.update();
//            if (mCallback != null) {
//                mCallback.updateTimer(timer);
//            }
//        }
        else {
            timer.update();
            if (mCallback != null) {
                mCallback.updateTimer(timer);
            }
        }

        mInSyncAction = false;
    }

    private void syncTimerIfNeeded() {
        if (mInWaitingState) {
            syncTimer();
        }
    }

    private void prepare(final Runnable runnable) {
        if (drawTask == null) {
            drawTask = createDrawTask(mDanmakuView.isDanmakuDrawingCacheEnabled(), timer,
                    mDanmakuView.getContext(), mDanmakuView.getViewWidth(), mDanmakuView.getViewHeight(),
                    mDanmakuView.isHardwareAccelerated(), new IDrawTask.TaskListener() {
                        @Override
                        public void ready() {
                            runnable.run();
                        }

                        @Override
                        public void onDanmakuAdd(BaseDanmaku danmaku) {
                            if (danmaku.isTimeOut()) {
                                return;
                            }
                            long delay = danmaku.getActualTime() - getCurrentTime();
                            if (delay < mContext.mDanmakuFactory.MAX_DANMAKU_DURATION && (mInWaitingState || mRenderingState.nothingRendered)) {
                                notifyRendering();
                            } else if (delay > 0 && delay <= mContext.mDanmakuFactory.MAX_DANMAKU_DURATION) {
                                sendEmptyMessageDelayed(NOTIFY_RENDERING, delay);
                            }
                            if (!danmaku.isOutside()) {
                                redrawIfNeeded();
                            }
                        }

                        @Override
                        public void onDanmakuShown(BaseDanmaku danmaku) {
                            if (mCallback != null) {
                                mCallback.danmakuShown(danmaku);
                            }
                        }

                        @Override
                        public void onDanmakuWillDismiss(BaseDanmaku danmaku) {
                            if (mCallback != null) {
                                mCallback.danmakuWillDismiss(danmaku);
                            }
                        }

                        @Override
                        public void onDanmakusDrawingFinished() {
                            if (mCallback != null) {
                                mCallback.drawingFinished();
                            }
                        }

                        @Override
                        public void onLayerPreUpdate(int layer) {
                            if (mCallback != null) {
                                if (mDisp != null) {
                                    mCallback.onLayerPreUpdate(layer, (Canvas) mDisp.getExtraData(), getCurrentTime());
                                }
                            }
                        }

                        @Override
                        public void onLayerUpdate(int layer) {
                            if (mCallback != null) {
                                if (mDisp != null) {
                                    mCallback.onLayerUpdate(layer, (Canvas) mDisp.getExtraData(), getCurrentTime());
                                }
                            }
                        }

                        @Override
                        public void onDanmakuConfigChanged() {
                            redrawIfNeeded();
                        }

                        @Override
                        public void onDanmakuVisibilityChanged() {
                            removeMessages(NOTIFY_RENDERING);
                            obtainMessage(NOTIFY_RENDERING).sendToTarget();
                        }
                    });
        } else {
            runnable.run();
        }
    }

    public boolean isPrepared() {
        return mReady;
    }

    private IDrawTask createDrawTask(boolean useDrwaingCache, DanmakuTimer timer,
                                     Context context,
                                     int width, int height,
                                     boolean isHardwareAccelerated,
                                     IDrawTask.TaskListener taskListener) {
        mDisp = mContext.getDisplayer();
        mDisp.setSize(width, height);
        mDisp.setScreenOccupationRatio(mContext.screenOccupationRatio);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mDisp.setDensities(displayMetrics.density, displayMetrics.densityDpi,
                displayMetrics.scaledDensity);
        mDisp.resetSlopPixel(mContext.scaleTextSize);
        mDisp.setHardwareAccelerated(isHardwareAccelerated);
        IDrawTask task = useDrwaingCache ?
                new CacheManagingDrawTask(timer, mContext, taskListener)
                : new DrawTask(timer, mContext, taskListener);
        task.setParser(mParser);
        task.prepare();
        obtainMessage(NOTIFY_DISP_SIZE_CHANGED, 0).sendToTarget();
        return task;
    }

    public void seekTo(Long ms) {
        mIdleSleepMills = 0;
        mInSeekingAction = true;
        mDesireSeekingTime = ms;
        removeMessages(DrawHandler.UPDATE);
        removeMessages(DrawHandler.RESUME);
        removeMessages(DrawHandler.SEEK_POS);
        obtainMessage(DrawHandler.SEEK_POS, ms).sendToTarget();
    }

    public void addDanmaku(BaseDanmaku item) {
        if (drawTask != null) {
            item.flags = mContext.mGlobalFlagValues;
            item.setTimer(timer);
            drawTask.addDanmaku(item);
            obtainMessage(NOTIFY_RENDERING).sendToTarget();
        }
    }

    public void addDanmakus(Collection<BaseDanmaku> danmakus) {
        for (BaseDanmaku danmaku : danmakus) {
            addDanmaku(danmaku);
        }
    }

    public void invalidateDanmaku(BaseDanmaku item, boolean remeasure) {
        if (drawTask != null && item != null) {
            drawTask.invalidateDanmaku(item, remeasure);
        }
        redrawIfNeeded();
    }

    public void redrawDanmakuWhenPaused() {
        redrawIfNeeded();
    }

    public void resume() {
        removeMessages(DrawHandler.PAUSE);
        sendEmptyMessage(DrawHandler.RESUME);
    }

    public void prepare() {
        mReady = false;
        if (mContext.updateMethod == 0) {
            mFrameCallback = new FrameCallback();
        }
        mUpdateInSeparateThread = (mContext.updateMethod == 1);
        sendEmptyMessage(DrawHandler.PREPARE);
    }

    public void pause() {
        removeMessages(DrawHandler.RESUME);
        syncTimerIfNeeded();
        sendEmptyMessage(DrawHandler.PAUSE);
    }

    public void showDanmakus(Long position) {
        if (mDanmakusVisible)
            return;
        mDanmakusVisible = true;
        removeMessages(SHOW_DANMAKUS);
        removeMessages(HIDE_DANMAKUS);
        obtainMessage(SHOW_DANMAKUS, position).sendToTarget();
    }

    public long hideDanmakus(boolean quitDrawTask) {
        if (!mDanmakusVisible) {
            return timer.current();
        }
        mDanmakusVisible = false;
        removeMessages(SHOW_DANMAKUS);
        removeMessages(HIDE_DANMAKUS);
        obtainMessage(HIDE_DANMAKUS, quitDrawTask).sendToTarget();
        return timer.current();
    }

    public void forceRender() {
        removeMessages(FORCE_RENDER);
        obtainMessage(FORCE_RENDER).sendToTarget();
    }

    //clearMode为canvas的清除模式，如果是View，使用SRC_OVER,如果是SurfaceView,使用CLEAR
    public RenderingState draw(Canvas canvas, DrawHelper.Mode mode) {
        if (drawTask == null)
            return mRenderingState;

        if (!mInWaitingState) {
            AbsDanmakuSync danmakuSync = mContext.danmakuSync;
            if (danmakuSync != null) {
                do {
                    boolean isSyncPlayingState = danmakuSync.isSyncPlayingState();
                    if (!isSyncPlayingState && quitFlag) {
                        break;
                    }
                    int syncState = danmakuSync.getSyncState();
                    if (syncState == AbsDanmakuSync.SYNC_STATE_PLAYING) {
                        long fromTime = timer.current();
                        long toTime = danmakuSync.getUptimeMillis();
                        long offset = toTime - fromTime;
                        if (Math.abs(offset) > danmakuSync.getThresholdTimeMills()) {
                            if (isSyncPlayingState && quitFlag) {
                                resume();
                            }
                            drawTask.requestSync(fromTime, toTime, offset);
                            timer.update(toTime);
                        }
                    } else if (syncState == AbsDanmakuSync.SYNC_STATE_HALT) {
                        if (isSyncPlayingState && !quitFlag) {
                            pause();
                        }
                    }
                } while (false);
            }
        }
        mDisp.setExtraData(canvas);
        mRenderingState.set(drawTask.draw(mDisp, mode));
        return mRenderingState;
    }

    private void redrawIfNeeded() {
        if (quitFlag && mDanmakusVisible) {
            removeMessages(UPDATE_WHEN_PAUSED);
            sendEmptyMessageDelayed(UPDATE_WHEN_PAUSED, 100);
        }
    }

    long mIdleSleepMills = 0;

    private void notifyRendering() {
        if (!mInWaitingState) {
            return;
        }
        if(drawTask != null) {
            drawTask.requestClear();
        }
        if (mUpdateInSeparateThread) {
            synchronized (drawTask) {
                drawTask.notifyAll();
            }
        } else {
            removeMessages(UPDATE);
            sendEmptyMessage(UPDATE);
        }
        mInWaitingState = false;
        mIdleSleepMills = SystemClock.uptimeMillis() + 1000;
    }

    private void waitRendering(long dTime) {
        if (isStop() || !isPrepared() || mInSeekingAction) {
            return;
        }
        if (SystemClock.uptimeMillis() < mIdleSleepMills) {
            return;
        }
        mIdleSleepMills = 0;
        mRenderingState.sysTime = SystemClock.uptimeMillis();
        mInWaitingState = true;
        if (mUpdateInSeparateThread) {
            if (mThread == null) {
                return;
            }
            try {
                synchronized (drawTask) {
                    if (dTime == INDEFINITE_TIME) {
                        drawTask.wait();
                    } else {
                        drawTask.wait(dTime);
                    }
                    sendEmptyMessage(NOTIFY_RENDERING);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            if (mFrameCallback != null) {
                Choreographer.getInstance().removeFrameCallback(mFrameCallback);
            }
            if (dTime == INDEFINITE_TIME) {
                removeMessages(NOTIFY_RENDERING);
                removeMessages(UPDATE);
            } else {
                removeMessages(NOTIFY_RENDERING);
                removeMessages(UPDATE);
                sendEmptyMessageDelayed(NOTIFY_RENDERING, dTime);
            }
        }
    }

    public IDisplayer getDisplayer(){
        return mDisp;
    }

    public void notifyDispSizeChanged(int width, int height) {
        if (mDisp == null) {
            return;
        }
        int oldWidth = mDisp.getWidth();
        int oldHeight = mDisp.getHeight();
        if (oldWidth == width && oldHeight != height) {
            mDisp.setSize(width, height);
            obtainMessage(NOTIFY_DISP_SIZE_CHANGED, REQUEST_CLEAR_RETAINER).sendToTarget();
        } else if (oldWidth != width || oldHeight != height) {
            mDisp.setSize(width, height);
            obtainMessage(NOTIFY_DISP_SIZE_CHANGED, REQUEST_RELAYOUT).sendToTarget();
        }
        mContext.mGlobalFlagValues.updateMeasureFlag();
    }

    public void removeDanmakusByType(int type) {
        if (drawTask != null) {
            drawTask.removeDanmakusByType(type);
        }
    }

    public void removeAllDanmakus(boolean isClearDanmakusOnScreen) {
        if (drawTask != null) {
            drawTask.removeAllDanmakus(isClearDanmakusOnScreen);
        }
    }

    public void removeAllLiveDanmakus() {
        if (drawTask != null) {
            drawTask.removeAllLiveDanmakus();
        }
    }

    public IDanmakus getCurrentVisibleDanmakus() {
        if (drawTask != null) {
            return drawTask.getVisibleDanmakusOnTime(getCurrentTime());
        }

        return null;
    }

    public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled) {
        if (drawTask != null) {
            return drawTask.getDanmakusInDuration(beginMills, endMills, isDuplicateMergingEnabled);
        }
        return null;
    }

    public void addHoveredDanmaku(BaseDanmaku danmaku) {
        post(() -> {
            if (drawTask != null) {
                drawTask.addHoveredDanmaku(danmaku);
            }
        });
    }

    public void removeHoveredDanmaku(BaseDanmaku danmaku) {
        post(() -> {
            if (drawTask != null) {
                drawTask.removeHoveredDanmaku(danmaku);
            }
        });
    }

    public long getCurrentTime() {
        if (!mReady) {
            return 0;
        }
        if (mInSeekingAction) {
            return mDesireSeekingTime;
        }
        if (quitFlag || !mInWaitingState) {
            return timer.current();
        }
        return timer.naturalCurrent();
    }

    public void clearDanmakusOnScreen() {
        obtainMessage(CLEAR_DANMAKUS_ON_SCREEN).sendToTarget();
    }

    public DanmakuContext getConfig() {
        return mContext;
    }

    public int getLoadedItemCount(int... types) {
        return mRenderingState.getLoadedItemCount(types);
    }

    public int getShownItemCount(int... types) {
        return mRenderingState.getShownItemCount(types);
    }

    public DanmakuReportParameters reportDanmakuParameters() {
        if (drawTask != null) {
            return drawTask.reportDanmakuParameters(getCurrentTime());
        }
        return null;
    }
}

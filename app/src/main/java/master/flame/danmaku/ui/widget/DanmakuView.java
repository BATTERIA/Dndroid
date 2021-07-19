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

package master.flame.danmaku.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;

import master.flame.danmaku.controller.DrawHandler;
import master.flame.danmaku.controller.DrawHandler.Callback;
import master.flame.danmaku.controller.DrawHelper;
import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.controller.IDanmakuViewController;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.renderer.IRenderer.RenderingState;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;
import master.flame.danmaku.danmaku.util.SystemClock;

public class DanmakuView extends View implements IDanmakuView, IDanmakuViewController {

    public static final String TAG = "DanmakuView";

    protected Callback mCallback;

    private volatile HandlerThread mHandlerThread;

    protected volatile DrawHandler handler;

    private boolean isSurfaceCreated;

    private boolean mEnableDanmakuDrwaingCache = true;

    private OnDanmakuClickListener mOnDanmakuClickListener;

    private float mXOff;

    private float mYOff;

    private OnClickListener mOnClickListener;

    private DanmakuTouchHelper mTouchHelper;
    
    private boolean mShowFps;

    protected boolean mDanmakuVisible = true;

    protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;

    private Object mDrawMonitor = new Object();

    private boolean mDrawFinished = false;

    protected boolean mRequestRender = false;

    private long mUiThreadId;

    public DanmakuView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mUiThreadId = Thread.currentThread().getId();
        setBackgroundColor(Color.TRANSPARENT);
        setDrawingCacheBackgroundColor(Color.TRANSPARENT);
        mTouchHelper = DanmakuTouchHelper.instance(this);
    }

    @Override
    public void releaseView() {
        mCallback = null;
        mOnDanmakuClickListener = null;
        handler = null;
        mHandlerThread = null;
        mDrawTimes = null;
    }

    public DanmakuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DanmakuView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    public void addDanmaku(BaseDanmaku item) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.addDanmaku(item);
        }
    }

    @Override
    public void addDanmakus(Collection<BaseDanmaku> danmakus) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.addDanmakus(danmakus);
        }
    }

    @Override
    public void invalidateDanmaku(BaseDanmaku item, boolean remeasure) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.invalidateDanmaku(item, remeasure);
        }
    }

    @Override
    public void removeDanmakusByType(int type) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.removeDanmakusByType(type);
        }
    }

    @Override
    public void removeAllDanmakus(boolean isClearDanmakusOnScreen) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.removeAllDanmakus(isClearDanmakusOnScreen);
        }
    }
    
    @Override
    public void removeAllLiveDanmakus() {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.removeAllLiveDanmakus();
        }
    }

    @Override
    public IDanmakus getCurrentVisibleDanmakus() {
        DrawHandler hd = handler;
        if (hd != null) {
            return hd.getCurrentVisibleDanmakus();
        }

        return null;
    }

    @Override
    public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled) {
        if (handler == null) {
            return null;
        }
        DrawHandler hd = handler;
        return hd.getDanmakusInDuration(beginMills, endMills, isDuplicateMergingEnabled);
    }

    @Override
    public void addHoveredDanmaku(BaseDanmaku danmaku) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.addHoveredDanmaku(danmaku);
        }
    }

    @Override
    public void removeHoveredDanmaku(BaseDanmaku danmaku) {
        DrawHandler hd = handler;
        if (hd != null) {
            hd.removeHoveredDanmaku(danmaku);
        }
    }

    @Override
    public int getLoadedItemCount(int... types) {
        DrawHandler hd = handler;
        if (hd != null) {
            return hd.getLoadedItemCount(types);
        }
        return 0;
    }

    @Override
    public int getShownItemCount(int... types) {
        DrawHandler hd = handler;
        if (hd != null) {
            return hd.getShownItemCount(types);
        }
        return 0;
    }

    public void setCallback(Callback callback) {
        DrawHandler hd = handler;
        mCallback = callback;
        if (hd != null) {
            hd.setCallback(callback);
        }
    }

    @Override
    public void release() {
        stop();
        if(mDrawTimes!= null) mDrawTimes.clear();
    }

    @Override
    public void stop() {
        stopDraw();
    }

    private synchronized void stopDraw() {
        if (this.handler == null) {
            return;
        }
        DrawHandler handler = this.handler;
        this.handler = null;
        unlockCanvasAndPost();
        if (handler != null) {
            handler.quit();
        }
        mHandlerThread = null;
    }

    protected synchronized Looper getLooper(int type) {
        if (mHandlerThread != null) {
            mHandlerThread.quit();
            mHandlerThread = null;
        }

        int priority;
        switch (type) {
            case THREAD_TYPE_MAIN_THREAD:
                return Looper.getMainLooper();
            case THREAD_TYPE_HIGH_PRIORITY:
                priority = android.os.Process.THREAD_PRIORITY_URGENT_DISPLAY;
                break;
            case THREAD_TYPE_LOW_PRIORITY:
                priority = android.os.Process.THREAD_PRIORITY_LOWEST;
                break;
            case THREAD_TYPE_NORMAL_PRIORITY:
            default:
                priority = android.os.Process.THREAD_PRIORITY_DEFAULT;
                break;
        }
        String threadName = "DFM Handler Thread #" + priority;
        mHandlerThread = new HandlerThread(threadName, priority);
        mHandlerThread.start();
        return mHandlerThread.getLooper();
    }

    protected void prepare() {
        if (handler == null)
            handler = new DrawHandler(getLooper(mDrawingThreadType), this, mDanmakuVisible);
    }

    @Override
    public void setDrawHandler(DrawHandler drawHandler) {
        handler = drawHandler;
        if (drawHandler == null) {
            return;
        }
        handler.bindView(this);
    }

    @Override
    public DrawHandler getDrawHandler() {
        return handler;
    }

    @Override
    public void prepare(BaseDanmakuParser parser, DanmakuContext config) {
        prepare();
        DrawHandler hl = handler;
        if (hl == null || parser == null) {
            return;
        }
        hl.setConfig(config);
        hl.setParser(parser);
        hl.setCallback(mCallback);
        hl.prepare();
    }

    @Override
    public boolean isPrepared() {
        DrawHandler hl = handler;
        return hl != null && hl.isPrepared();
    }

    @Override
    public DanmakuContext getConfig() {
        DrawHandler hl = handler;
        if (hl == null) {
            return null;
        }
        return hl.getConfig();
    }

    @Override
    public void notifyViewPortSizeChanged(int width, int height) {
        DrawHandler hl = handler;
        if (hl != null) {
            hl.notifyDispSizeChanged(width, height);
        }
    }

    @Override
    public void showFPS(boolean show){
        mShowFps = show;
    }
    private static final int MAX_RECORD_SIZE = 50;
    private static final int ONE_SECOND = 1000;
    private LinkedList<Long> mDrawTimes;

    protected boolean mClearFlag;
    private float fps() {
        long lastTime = SystemClock.uptimeMillis();
        mDrawTimes.addLast(lastTime);
        Long first = mDrawTimes.peekFirst();
        if (first == null) {
            return 0.0f;
        }
        float dtime = lastTime - first;
        int frames = mDrawTimes.size();
        if (frames > MAX_RECORD_SIZE) {
            mDrawTimes.removeFirst();
        }
        return dtime > 0 ? mDrawTimes.size() * ONE_SECOND / dtime : 0.0f;
    }
    @Override
    public long drawDanmakus() {
        if (!isSurfaceCreated)
            return 0;
        if (!isShown())
            return -1;
        long stime = SystemClock.uptimeMillis();
        lockCanvas();
        return SystemClock.uptimeMillis() - stime;
    }
    
    @SuppressLint("NewApi")
    private void postInvalidateCompat() {
        mRequestRender = true;
        this.postInvalidateOnAnimation();
    }

    protected void lockCanvas() {
        if(mDanmakuVisible == false) {
            return;
        }
        postInvalidateCompat();
        synchronized (mDrawMonitor) {
            while ((!mDrawFinished) && (handler != null)) {
                try {
                    mDrawMonitor.wait(200);
                } catch (InterruptedException e) {
                    if (mDanmakuVisible == false || handler == null || handler.isStop()) {
                        break;
                    } else {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            mDrawFinished = false;
        }
    }
    
    private void lockCanvasAndClear() {
        mClearFlag = true;
        lockCanvas();
    }
    
    private void unlockCanvasAndPost() {
        synchronized (mDrawMonitor) {
            mDrawFinished = true;
            mDrawMonitor.notifyAll();
        }
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        if ((!mDanmakuVisible) && (!mRequestRender)) {
            super.onDraw(canvas);
            return;
        }
        if (mClearFlag) {
            DrawHelper.clearCanvas(canvas, DrawHelper.Mode.COLOR_SRC_OVER);
            mClearFlag = false;
        } else {
            if (handler != null) {
                RenderingState rs = handler.draw(canvas, DrawHelper.Mode.COLOR_SRC_OVER);
                if (mShowFps) {
                    if (mDrawTimes == null)
                        mDrawTimes = new LinkedList<Long>();
                    String fps = String.format(Locale.getDefault(),
                            "fps %.2f,time:%d/[%d-%d] s,cache:%d,miss:%d", fps(), getCurrentTime() / 1000, rs.cacheBeginTimeMills / 1000, rs.cacheTimeMills / 1000,
                            rs.cacheHitCount, rs.cacheMissCount);
                    DrawHelper.drawFPS(canvas, fps);
                }
            }
        }
        mRequestRender = false;

        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onFrameUpdate(canvas, getCurrentTime());
        }
        unlockCanvasAndPost();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (oldw != w || oldh != h) {
            DrawHandler hl = handler;
            if (hl != null) {
                hl.notifyDispSizeChanged(w, h);
            }
            isSurfaceCreated = true;
        }
    }

    public void toggle() {
        if (isSurfaceCreated) {
            if (handler == null)
                start();
            else if (handler.isStop()) {
                resume();
            } else
                pause();
        }
    }

    @Override
    public void pause() {
        DrawHandler hl = handler;
        if (hl != null) {
            hl.removeCallbacks(mResumeRunnable);
            hl.pause();
        }
    }

    private int mResumeTryCount = 0;

    private Runnable mResumeRunnable = new Runnable() {
        @Override
        public void run() {
            DrawHandler drawHandler = handler;
            if (drawHandler == null) {
                return;
            }
            mResumeTryCount++;
            if (mResumeTryCount > 4 || DanmakuView.super.isShown()) {
                drawHandler.resume();
            } else {
                drawHandler.postDelayed(this, 100 * mResumeTryCount);
            }
        }
    };

    @Override
    public void resume() {
        DrawHandler hl = handler;
        if (hl != null && hl.isPrepared()) {
            mResumeTryCount = 0;
            hl.post(mResumeRunnable);
        }  else if (hl == null) {
            restart();
        }
    }
    
    @Override
    public boolean isPaused() {
        DrawHandler hl = handler;
        if(hl != null) {
            return hl.isStop();
        }
        return false;
    }

    public void restart() {
        stop();
        start();
    }

    @Override
    public void start() {
        start(0);
    }

    @Override
    public void start(long position) {
        Handler handler = this.handler;
        if (handler == null) {
            prepare();
            handler = this.handler;
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        if (handler != null) {
            handler.obtainMessage(DrawHandler.START, position).sendToTarget();
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isEventConsumed = mTouchHelper.onTouchEvent(event);
        if (!isEventConsumed) {
            return super.onTouchEvent(event);
        }
        return isEventConsumed;
    }

    public void seekTo(Long ms) {
        DrawHandler hl = handler;
        if(hl != null){
            hl.seekTo(ms);
        }
    }


    public void enableDanmakuDrawingCache(boolean enable) {
        mEnableDanmakuDrwaingCache = enable;
    }

    @Override
    public boolean isDanmakuDrawingCacheEnabled() {
        return mEnableDanmakuDrwaingCache;
    }

    @Override
    public boolean isViewReady() {
        return isSurfaceCreated;
    }

    @Override
    public int getViewWidth() {
        return super.getWidth();
    }

    @Override
    public int getViewHeight() {
        return super.getHeight();
    }

    @Override
    public View getView() {
        return this;
    }
      
    @Override
    public void show() {
        showAndResumeDrawTask(null);
    }
    
    @Override
    public void showAndResumeDrawTask(Long position) {
        mDanmakuVisible = true;
        mClearFlag = false;
        DrawHandler hl = handler;
        if (hl == null) {
            return;
        }
        hl.showDanmakus(position);
    }

    @Override
    public void hide() {
        mDanmakuVisible = false;
        DrawHandler hl = handler;
        if (hl == null) {
            return;
        }
        hl.hideDanmakus(false);
    }
    
    @Override
    public long hideAndPauseDrawTask() {
        mDanmakuVisible = false;
        DrawHandler hl = handler;
        if (hl == null) {
            return 0;
        }
        return hl.hideDanmakus(true);
    }

    @Override
    public void clear() {
        if (!isViewReady()) {
            return;
        }
        if (!mDanmakuVisible || Thread.currentThread().getId() == mUiThreadId) {
            mClearFlag = true;
            postInvalidateCompat();
        } else {
            lockCanvasAndClear();
        }
    }

    @Override
    public boolean isShown() {
        return mDanmakuVisible && super.isShown();
    }

    @Override
    public void setDrawingThreadType(int type) {
        mDrawingThreadType  = type;
    }

    @Override
    public long getCurrentTime() {
        DrawHandler hl = handler;
        if (hl != null) {
            return hl.getCurrentTime();
        }
        return 0;
    }

    @Override
    public boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override
    public void clearDanmakusOnScreen() {
        DrawHandler hl = handler;
        if (hl != null) {
            hl.clearDanmakusOnScreen();
        }
    }

    @Override
    public boolean performDanmakuClick(int type, float x, float y) {
        return mTouchHelper.performDanmakuClick(type, false, x, y);
    }

    @Override
    public void setOnDanmakuClickListener(OnDanmakuClickListener listener) {
        mOnDanmakuClickListener = listener;
    }

    @Override
    public void setOnDanmakuClickListener(OnDanmakuClickListener listener, float xOff, float yOff) {
        mOnDanmakuClickListener = listener;
        mXOff = xOff;
        mYOff = yOff;
    }

    @Override
    public OnDanmakuClickListener getOnDanmakuClickListener() {
        return mOnDanmakuClickListener;
    }

    @Override
    public float getXOff() {
        return mXOff;
    }

    @Override
    public float getYOff() {
        return mYOff;
    }

    @Override
    public LinkedList<Long> getDrawTimes() {
        return mDrawTimes;
    }

    @Override
    public void setDrawTimes(LinkedList<Long> drawTimes) {
        mDrawTimes = drawTimes;
    }

    @Override
    public void setHandlerThread(HandlerThread handlerThread) {
        mHandlerThread = handlerThread;
    }

    @Override
    public HandlerThread getHandlerThread() {
        return mHandlerThread;
    }

    public void forceRender() {
        mRequestRender = true;
        DrawHandler hl = handler;
        if (hl != null) {
            hl.forceRender();
        }
    }

    @Override
    public void updateDanmakuIfPaused() {
        if (handler != null) {
            handler.redrawDanmakuWhenPaused();
        }
    }

    // Only for biliPlayerV2 to solve danmaku single tap event delay 300ms issue
    @Override
    public boolean simulateClickEvent(float x, float y, boolean isLongClick) {
        if (mTouchHelper == null) {
            return false;
        }
        return mTouchHelper.performDanmakuClick(0, isLongClick, x, y);
    }

    @Override
    public void simulateTouchDownEvent(float x, float y, boolean hitMask) {
        if (mTouchHelper == null) {
            return;
        }
        mTouchHelper.performDanmakuTouchDown(0, x, y, hitMask);
    }

    @Override
    public DanmakuReportParameters reportDanmakuParameters() {
        if (handler != null) {
            return handler.reportDanmakuParameters();
        }
        return null;
    }
}

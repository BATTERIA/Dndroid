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
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
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


public class DanmakuSurfaceView extends SurfaceView implements IDanmakuView, IDanmakuViewController, SurfaceHolder.Callback {

    public static final String TAG = "DanmakuSurfaceView";

    private Callback mCallback;

    private SurfaceHolder mSurfaceHolder;

    private HandlerThread mHandlerThread;

    private DrawHandler handler;

    private boolean isSurfaceCreated;

    private boolean mEnableDanmakuDrwaingCache = true;

	private OnDanmakuClickListener mOnDanmakuClickListener;

    private float mXOff;

    private float mYOff;

    private DanmakuTouchHelper mTouchHelper;
    
    private boolean mShowFps;

    private boolean mDanmakuVisible = true;

    protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;

    public DanmakuSurfaceView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setWillNotDraw(true);
        mSurfaceHolder = getHolder();
        mSurfaceHolder.addCallback(this);
        mSurfaceHolder.setFormat(PixelFormat.TRANSPARENT);
		mTouchHelper = DanmakuTouchHelper.instance(this);
    }

    @Override
    public void releaseView() {
        mSurfaceHolder.removeCallback(this);
        mCallback = null;
        mOnDanmakuClickListener = null;
        handler = null;
        mHandlerThread = null;
        mDrawTimes = null;
    }

    public DanmakuSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DanmakuSurfaceView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    public void addDanmaku(BaseDanmaku item) {
        if (handler != null) {
            handler.addDanmaku(item);
        }
    }

    @Override
    public void addDanmakus(Collection<BaseDanmaku> danmakus) {
        if (handler != null) {
            handler.addDanmakus(danmakus);
        }
    }

    @Override
    public void invalidateDanmaku(BaseDanmaku item, boolean remeasure) {
        if (handler != null) {
            handler.invalidateDanmaku(item, remeasure);
        }
    }

    @Override
    public void removeDanmakusByType(int type) {
        if (handler != null) {
            handler.removeDanmakusByType(type);
        }
    }

    @Override
    public void removeAllDanmakus(boolean isClearDanmakusOnScreen) {
        if (handler != null) {
            handler.removeAllDanmakus(isClearDanmakusOnScreen);
        }
    }
    
    @Override
    public void removeAllLiveDanmakus() {
        if (handler != null) {
            handler.removeAllLiveDanmakus();
        }
    }

    @Override
    public IDanmakus getCurrentVisibleDanmakus() {
        if (handler != null) {
            return handler.getCurrentVisibleDanmakus();
        }
        return null;
    }

    @Override
    public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled) {
        if (handler == null) {
            return null;
        }
        return handler.getDanmakusInDuration(beginMills, endMills, isDuplicateMergingEnabled);
    }

    @Override
    public int getLoadedItemCount(int... types) {
        if (handler != null) {
            return handler.getLoadedItemCount(types);
        }
        return 0;
    }

    @Override
    public int getShownItemCount(int... types) {
        if (handler != null) {
            return handler.getShownItemCount(types);
        }
        return 0;
    }
    public void setCallback(Callback callback) {
        mCallback = callback;
        if (handler != null) {
            handler.setCallback(callback);
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        isSurfaceCreated = true;
        Canvas canvas;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            canvas  = mSurfaceHolder.lockHardwareCanvas();
        } else {
            canvas = mSurfaceHolder.lockCanvas();
        }
        if (canvas != null) {
            DrawHelper.clearCanvas(canvas, DrawHelper.Mode.COLOR_CLEAR);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
        if (mDanmakuVisible && handler != null) {

            handler.redrawDanmakuWhenPaused();
        }

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        if (handler != null) {
            handler.notifyDispSizeChanged(width, height);
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        isSurfaceCreated = false;
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
        if (handler != null) {
            handler.quit();
            handler = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        mHandlerThread = null;
        if (handlerThread != null) {
            try {
                handlerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            handlerThread.quit();
        }
    }
    
    protected synchronized Looper getLooper(int type){
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
        String threadName = "DFM Handler Thread #"+priority;
        mHandlerThread = new HandlerThread(threadName, priority);
        mHandlerThread.start();
        return mHandlerThread.getLooper();
    }

    private void prepare() {
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
        handler.setConfig(config);
        handler.setParser(parser);
        handler.setCallback(mCallback);
        handler.prepare();
    }

    @Override
    public boolean isPrepared() {
        return handler != null && handler.isPrepared();
    }

    @Override
    public DanmakuContext getConfig() {
        if (handler == null) {
            return null;
        }
        return handler.getConfig();
    }

    @Override
    public void notifyViewPortSizeChanged(int width, int height) {
        if (handler != null) {
            handler.notifyDispSizeChanged(width, height);
        }
    }

    @Override
    public void showFPS(boolean show){
        mShowFps = show;
    }
    private static final int MAX_RECORD_SIZE = 50;
    private static final int ONE_SECOND = 1000;
    private LinkedList<Long> mDrawTimes;
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
        long dtime = 0;
        Canvas canvas;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            canvas  = mSurfaceHolder.lockHardwareCanvas();
        } else {
            canvas = mSurfaceHolder.lockCanvas();
        }
        if (canvas != null) {
            if (handler != null) {
                RenderingState rs = handler.draw(canvas, DrawHelper.Mode.COLOR_CLEAR);
                if (mShowFps) {
                    if (mDrawTimes == null)
                        mDrawTimes = new LinkedList<Long>();
                    String fps = String.format(Locale.getDefault(),
                            "fps %.2f,time:%d/[%d-%d] s,cache:%d,miss:%d", fps(), getCurrentTime() / 1000, rs.cacheBeginTimeMills / 1000, rs.cacheTimeMills / 1000,
                            rs.cacheHitCount, rs.cacheMissCount);
                    DrawHelper.drawFPS(canvas, fps);
                }
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onFrameUpdate(canvas, getCurrentTime());
                }
            }
            if (isSurfaceCreated)
                mSurfaceHolder.unlockCanvasAndPost(canvas);
        }
        dtime = SystemClock.uptimeMillis() - stime;
        return dtime;
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
        if (handler != null)
            handler.pause();
    }

    @Override
    public void resume() {
        if (handler != null && handler.isPrepared())
            handler.resume();
        else if (handler == null) {
            restart();
        }
    }
    
    @Override
    public boolean isPaused() {
        if(handler != null) {
            return handler.isStop();
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
    public void start(long postion) {
        if (handler == null) {
            prepare();
        }else{
            handler.removeCallbacksAndMessages(null);
        }
        handler.obtainMessage(DrawHandler.START, postion).sendToTarget();
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
        if(handler != null){
            handler.seekTo(ms);
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
        if (handler == null) {
            return;
        }
        handler.showDanmakus(position);
    }

    @Override
    public void hide() {
        mDanmakuVisible = false;
        if (handler == null) {
            return;
        }
        handler.hideDanmakus(false);
    }
    
    @Override
    public long hideAndPauseDrawTask() {
        mDanmakuVisible = false;
        if (handler == null) {
            return 0;
        }
        return handler.hideDanmakus(true);
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
    public void forceRender() {}

    @Override
    public void updateDanmakuIfPaused() {
        if (handler != null) {
            handler.redrawDanmakuWhenPaused();
        }
    }

    @Override
    public void clear() {
        if (!isViewReady()) {
            return;
        }
        Canvas canvas;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           canvas  = mSurfaceHolder.lockHardwareCanvas();
        } else {
            canvas = mSurfaceHolder.lockCanvas();
        }
        if (canvas != null) {
            DrawHelper.clearCanvas(canvas, DrawHelper.Mode.COLOR_CLEAR);
            mSurfaceHolder.unlockCanvasAndPost(canvas);
        }
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
        if (handler != null) {
            return handler.getCurrentTime();
        }
        return 0;
    }

    @Override
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override
    public void clearDanmakusOnScreen() {
        if (handler != null) {
            handler.clearDanmakusOnScreen();
        }
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
    public boolean performDanmakuClick(int type, float x, float y) {
        return mTouchHelper.performDanmakuClick(type, false, x, y);
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

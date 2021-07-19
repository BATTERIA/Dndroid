package master.flame.danmaku.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.View;

import androidx.annotation.RequiresApi;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;

import master.flame.danmaku.controller.DrawHandler;
import master.flame.danmaku.controller.DrawHelper;
import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.controller.IDanmakuViewController;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.renderer.IRenderer;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;
import master.flame.danmaku.danmaku.util.SystemClock;

public class DanmakuVirtualView implements IDanmakuView, IDanmakuViewController {
    private static final int MAX_RECORD_SIZE = 50;
    private static final int ONE_SECOND = 1000;

    private HandlerThread mHandlerThread;

    private DrawHandler.Callback mCallback;

    private DrawHandler handler;

    private boolean mEnableDanmakuDrwaingCache = true;

    private OnDanmakuClickListener mOnDanmakuClickListener;

    private float mXOff;

    private float mYOff;

    private boolean mShowFps;

    private boolean mDanmakuVisible = true;

    protected int mDrawingThreadType = THREAD_TYPE_NORMAL_PRIORITY;

    private LinkedList<Long> mDrawTimes;

    // NEW FEATURE
    private WeakReference<Context> contextWeakReference;
    private SurfaceTexture mSurfaceTexture;
    private Surface mSurface;
    private int surfaceWidth = 0;
    private int surfaceHeight = 0;

    public DanmakuVirtualView(Context context) {
        init(context);
    }

    private void init(Context context) {
        contextWeakReference = new WeakReference<>(context);
        mSurfaceTexture = new SurfaceTexture(0);
        mSurfaceTexture.detachFromGLContext();
        mSurface = new Surface(mSurfaceTexture);
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
    public boolean isPrepared() {
        return handler != null && handler.isPrepared();
    }

    @Override
    public boolean isPaused() {
        if(handler != null) {
            return handler.isStop();
        }
        return false;
    }

    @Override
    public boolean isViewReady() {
        return mSurface.isValid();
    }

    @Override
    public int getViewWidth() {
        return getWidth();
    }

    @Override
    public int getViewHeight() {
        return getHeight();
    }

    @Override
    public Context getContext() {
        if (contextWeakReference == null) {
            return null;
        }
        Context context = contextWeakReference.get();
        return context;
    }

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

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public long drawDanmakus() {
        if (!isViewReady())
            return 0;
        if (!isShown())
            return -1;
        long stime = SystemClock.uptimeMillis();
        long dtime = 0;
        Canvas canvas = mSurface.lockHardwareCanvas();
        if (canvas != null){
            if (handler != null) {
                IRenderer.RenderingState rs = handler.draw(canvas, DrawHelper.Mode.COLOR_CLEAR);
                if (mShowFps) {
                    if (mDrawTimes == null)
                        mDrawTimes = new LinkedList<Long>();
                    dtime = SystemClock.uptimeMillis() - stime;
                    String fps = String.format(Locale.getDefault(),
                            "fps %.2f,time:%d/[%d-%d] s,cache:%d,miss:%d", fps(), getCurrentTime() / 1000, rs.cacheBeginTimeMills / 1000, rs.cacheTimeMills / 1000,
                            rs.cacheHitCount, rs.cacheMissCount);
                    DrawHelper.drawFPS(canvas, fps);
                }
                DrawHandler.Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onFrameUpdate(canvas, getCurrentTime());
                }
            }
            if (isViewReady())
                mSurface.unlockCanvasAndPost(canvas);
        }
        dtime = SystemClock.uptimeMillis() - stime;
        return dtime;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void clear() {
        if (!isViewReady()) {
            return;
        }
        Canvas canvas = mSurface.lockHardwareCanvas();
        if (canvas != null) {
            DrawHelper.clearCanvas(canvas, DrawHelper.Mode.COLOR_CLEAR);
            mSurface.unlockCanvasAndPost(canvas);
        }
    }

    @Override
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override
    public boolean simulateClickEvent(float x, float y, boolean isLongClick) {
        return false;
    }

    @Override
    public void simulateTouchDownEvent(float x, float y, boolean hitMask) {

    }

    @Override
    public DanmakuReportParameters reportDanmakuParameters() {
        if (handler != null) {
            return handler.reportDanmakuParameters();
        }
        return null;
    }

    @Override
    public void setDrawingThreadType(int type) {
        mDrawingThreadType  = type;
    }

    @Override
    public void enableDanmakuDrawingCache(boolean enable) {
        mEnableDanmakuDrwaingCache = enable;
    }

    @Override
    public boolean isDanmakuDrawingCacheEnabled() {
        return mEnableDanmakuDrwaingCache;
    }

    @Override
    public void showFPS(boolean show){
        mShowFps = show;
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
    public void setDrawTimes(LinkedList<Long> drawTimes) {
        mDrawTimes = drawTimes;
    }

    @Override
    public LinkedList<Long> getDrawTimes() {
        return mDrawTimes;
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

    @Override
    public void setCallback(DrawHandler.Callback callback) {
        mCallback = callback;
        if (handler != null) {
            handler.setCallback(callback);
        }
    }

    @Override
    public long getCurrentTime() {
        if (handler != null) {
            return handler.getCurrentTime();
        }
        return 0;
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
    public View getView() {
        return null;
    }

    @Override
    public int getWidth() {
        return surfaceWidth;
    }

    @Override
    public int getHeight() {
        return surfaceHeight;
    }

    @Override
    public void setVisibility(int visibility) {
    }

    @Override
    public boolean isShown() {
        return mDanmakuVisible;
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
    public void seekTo(Long ms) {
        if(handler != null){
            handler.seekTo(ms);
        }
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

    @Override
    public void stop() {
        stopDraw();
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

    public void restart() {
        stop();
        start();
    }

    @Override
    public void release() {
        stop();
        if(mDrawTimes!= null) mDrawTimes.clear();
    }

    @Override
    public void toggle() {
        if (isViewReady()) {
            if (handler == null)
                start();
            else if (handler.isStop()) {
                resume();
            } else {
                pause();
            }
        }
    }

    @Override
    public void show() {
        showAndResumeDrawTask(null);
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
    public void releaseView() {
        mCallback = null;
        mOnDanmakuClickListener = null;
        handler = null;
        mHandlerThread = null;
        mDrawTimes = null;
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
    public long hideAndPauseDrawTask() {
        mDanmakuVisible = false;
        if (handler == null) {
            return 0;
        }
        return handler.hideDanmakus(true);
    }

    @Override
    public void clearDanmakusOnScreen() {
        if (handler != null) {
            handler.clearDanmakusOnScreen();
        }
    }

    @Override
    public void addHoveredDanmaku(BaseDanmaku danmaku) {
        // TODO
    }

    @Override
    public void removeHoveredDanmaku(BaseDanmaku danmaku) {
        // TODO
    }

    @Override
    public boolean performDanmakuClick(int type, float x, float y) {
        return false;
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
    public void forceRender() {

    }

    @Override
    public void updateDanmakuIfPaused() {
        if (handler != null) {
            handler.redrawDanmakuWhenPaused();
        }
    }

    // NEW FEATURE
    public SurfaceTexture getSurfaceTexture() {
        return mSurfaceTexture;
    }

    public void onSurfaceSizeChanged(int width, int height) {
        surfaceWidth = width;
        surfaceHeight = height;
        if (handler != null) {
            handler.notifyDispSizeChanged(width, height);
        }
    }
}

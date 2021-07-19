
package master.flame.danmaku.controller;

import android.os.HandlerThread;
import android.view.View;

import java.util.Collection;
import java.util.LinkedList;

import master.flame.danmaku.controller.DrawHandler.Callback;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;

public interface IDanmakuView {
    
    public final static int THREAD_TYPE_NORMAL_PRIORITY = 0x0;
    public final static int THREAD_TYPE_MAIN_THREAD = 0x1;
    public final static int THREAD_TYPE_HIGH_PRIORITY = 0x2;
    public final static int THREAD_TYPE_LOW_PRIORITY = 0x3;
    

    public boolean isPrepared();
    
    public boolean isPaused();

    public boolean isHardwareAccelerated();

    public boolean simulateClickEvent(float x, float y, boolean isLongClick);

    public void simulateTouchDownEvent(float x, float y, boolean hitMask);

    DanmakuReportParameters reportDanmakuParameters();
    /**
     * 
     * @param type One of THREAD_TYPE_MAIN_THREAD, THREAD_TYPE_HIGH_PRIORITY, THREAD_TYPE_NORMAL_PRIORITY, or THREAD_TYPE_LOW_PRIORITY.
     */
    public void setDrawingThreadType(int type);

    public void enableDanmakuDrawingCache(boolean enable);

    public boolean isDanmakuDrawingCacheEnabled();

    public void showFPS(boolean show);
    
    /**
     * danmaku.isLive == true的情况下,请在非UI线程中使用此方法,避免可能卡住主线程
     * @param item
     */
    public void addDanmaku(BaseDanmaku item);

    public void addDanmakus(Collection<BaseDanmaku> danmakus);

    public void invalidateDanmaku(BaseDanmaku item, boolean remeasure);

    public void removeDanmakusByType(int type);

    public void removeAllDanmakus(boolean isClearDanmakusOnScreen);
    
    public void removeAllLiveDanmakus();

    public IDanmakus getCurrentVisibleDanmakus();

    public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled);

    public void setDrawHandler(DrawHandler drawHandler);

    public DrawHandler getDrawHandler();

    public void setDrawTimes(LinkedList<Long> drawTimes);

    public LinkedList<Long> getDrawTimes();

    public void setHandlerThread(HandlerThread handlerThread);

    public HandlerThread getHandlerThread();

    /**
     *
     * @param types public final static int TYPE_SCROLL_RL = 1;
     *     public final static int TYPE_SCROLL_LR = 6;
     *     public final static int TYPE_FIX_TOP = 5;
     *     public final static int TYPE_FIX_BOTTOM = 4;
     *     public final static int TYPE_SPECIAL = 7;
     *     public final static int TYPE_SCROLL_RL_IMAGE = 100;
     *     public final static int TYPE_SUBTITLE = 101;
     * @return count of item loaded
     */
    public int getLoadedItemCount(int... types);

    /**
     *
     * @param types public final static int TYPE_SCROLL_RL = 1;
     *     public final static int TYPE_SCROLL_LR = 6;
     *     public final static int TYPE_FIX_TOP = 5;
     *     public final static int TYPE_FIX_BOTTOM = 4;
     *     public final static int TYPE_SPECIAL = 7;
     *     public final static int TYPE_SCROLL_RL_IMAGE = 100;
     *     public final static int TYPE_SUBTITLE = 101;
     * @return count of item shown
     */
    public int getShownItemCount(int... types);

    public void setCallback(Callback callback);
    
    /**
     * for getting the accurate play-time. use this method intead of parser.getTimer().currMillisecond
     * @return
     */
    public long getCurrentTime();

    public DanmakuContext getConfig();

    public void notifyViewPortSizeChanged(int width, int height);
    
    // ------------- Android View方法  --------------------
    
    public View getView();

    public int getWidth();

    public int getHeight();

    public void setVisibility(int visibility);
    
    public boolean isShown();
    

    // ------------- 播放控制 -------------------
    
    public void prepare(BaseDanmakuParser parser, DanmakuContext config);

    public void seekTo(Long ms);

    public void start();

    public void start(long postion);

    public void stop();

    public void pause();

    public void resume();

    public void release();
    
    public void toggle();
    
    public void show();
    
    public void hide();

    public void releaseView();
    
    /**
     * show the danmakuview again if you called hideAndPauseDrawTask()
     * @param position The position you want to resume
     * @see #hideAndPauseDrawTask
     */
    public void showAndResumeDrawTask(Long position);
    
    /**
     * hide the danmakuview and pause the drawtask
     * @return the paused position
     * @see #showAndResumeDrawTask
     */
    public long hideAndPauseDrawTask();

    public void clearDanmakusOnScreen();

    void addHoveredDanmaku(BaseDanmaku danmaku);

    void removeHoveredDanmaku(BaseDanmaku danmaku);

    // ------------- Click Listener -------------------
    public interface OnDanmakuClickListener {

        default boolean isInterceptAll() {
            return false;
        }
        /**
         * @param danmakus all to be clicked, this value may be empty;
         *                 danmakus.last() is the latest danmaku which may be null;
         * @return True if the event was handled, false otherwise.
         */
        boolean onDanmakuClick(IDanmakus danmakus, float x, float y);

        default boolean onDanmakuLongClick(IDanmakus danmakus, float x, float y) {
            return false;
        }

        default boolean onViewClick(IDanmakuView view, float x, float y) {
            return false;
        }
    }

    public boolean performDanmakuClick(int type, float x, float y);

    public void setOnDanmakuClickListener(OnDanmakuClickListener listener);

    public void setOnDanmakuClickListener(OnDanmakuClickListener listener, float xOff, float yOff);

    public OnDanmakuClickListener getOnDanmakuClickListener();

    public float getXOff();

    public float getYOff();

    void forceRender();

    public void updateDanmakuIfPaused();
}

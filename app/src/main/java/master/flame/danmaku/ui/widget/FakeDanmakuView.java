package master.flame.danmaku.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;

import master.flame.danmaku.controller.DrawHandler;
import master.flame.danmaku.controller.DrawHelper;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.GlobalFlagValues;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.SpecialDanmaku;
import master.flame.danmaku.danmaku.model.android.AndroidDisplayer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.DanmakuFactory;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;

/**
 * Created by ch on 17/8/18.
 */

public class FakeDanmakuView extends DanmakuView implements DrawHandler.Callback {

    private static class CustomParser extends BaseDanmakuParser {
        private final BaseDanmakuParser mBaseParser;
        private final Object mAddLock = new Object();
        private final long stTime;
        private final long edTime;
        private IDanmakus mDanmakuList;
        private int mViewWidth;

        public CustomParser(BaseDanmakuParser baseParser, long stTime, long edTime) {
            this.mBaseParser = baseParser;
            this.stTime = stTime;
            this.edTime = edTime;
            this.mDanmakuList = null;
        }

        private void setmDanmakuList(IDanmakus danmakuList) {
            this.mDanmakuList = danmakuList;
        }

        @Override
        protected IDanmakus parse() {
            final IDanmakus danmakus = new Danmakus();
            if (mContext == null || mContext.mDanmakuFactory == null) {
                return danmakus;
            }
            IDanmakus subnew = mDanmakuList;
            if (subnew == null) {
                return danmakus;
            }
            subnew.forEach(new IDanmakus.Consumer<BaseDanmaku, Object>() {
                @Override
                public int accept(BaseDanmaku danmaku) {
                    long time = danmaku.getTime();
                    if (time < stTime) {
                        return IDanmakus.Consumer.ACTION_CONTINUE;
                    } else if (time > edTime) {
                        return IDanmakus.Consumer.ACTION_BREAK;
                    }
                    BaseDanmaku item;
                    if (danmaku.getType() == BaseDanmaku.TYPE_SPECIAL) {
                        item = mContext.mDanmakuFactory.copySpecialDanmaku((SpecialDanmaku) danmaku, mContext,
                                mDispScaleX, mDispScaleY);
                    } else {
                        item = mContext.mDanmakuFactory.copyDanmaku(danmaku, mContext);
                    }
                    if (item == null || TextUtils.isEmpty(item.text) || item.duration == null) {
                        return IDanmakus.Consumer.ACTION_CONTINUE;
                    }
                    item.setTimer(mTimer);
                    synchronized (mAddLock) {
                        danmakus.addItem(item);
                        if (mListener != null) {
                            mListener.onDanmakuAdd(item);
                        }
                    }
                    return 0;
                }
            });
            return danmakus;
        }

        @Override
        public BaseDanmakuParser setDisplayer(IDisplayer disp) {
            super.setDisplayer(disp);
            if (mBaseParser == null || mBaseParser.getDisplayer() == null) {
                return this;
            }
            mDispScaleX = mDispWidth / (float) mBaseParser.getDisplayer().getWidth();
            mDispScaleY = mDispHeight / (float) mBaseParser.getDisplayer().getHeight();
            if (mViewWidth <= 1) {
                mViewWidth = disp.getWidth();
            }
            return this;
        }

        @Override
        protected float getViewportSizeFactor() {
            float scale = DanmakuFactory.COMMON_DANMAKU_DURATION * mViewWidth / DanmakuFactory.BILI_PLAYER_WIDTH;
            float factor = 1.1f;
            return mContext.mDanmakuFactory.MAX_DANMAKU_DURATION * factor / scale;
        }
    }

    private static final long DURATION = 10000L;
    private DanmakuTimer mTimer;

    public interface OnFrameAvailableListener {

        void onConfig(DanmakuContext config);

        void onFrameAvailable(long timeMills, Bitmap bitmap);

        void onFramesFinished(long timeMills);

        void onFailed(int errorCode, String msg);
    }

    private boolean mIsRelease;
    private OnFrameAvailableListener mOnFrameAvailableListener;
    private int mWidth = 0;
    private int mHeight = 0;
    private float mScale = 1f;
    private DanmakuTimer mOuterTimer;
    private IDanmakus mDanmakuList;
    private long mBeginTimeMills;
    private long mFrameIntervalMills = 16L;
    private long mEndTimeMills;
    private Bitmap mBufferBitmap;
    private Canvas mBufferCanvas;

    private int mRetryCount = 0;
    private long mExpectBeginMills = 0;

    public FakeDanmakuView(Context context) {
        super(context);
    }

    public FakeDanmakuView(Context context, int width, int height, float scale) {
        super(context);
        mWidth = width;
        mHeight = height;
        mScale = scale;
        initBufferCanvas(width, height);
    }

    public void initBufferCanvas(int width, int height) {
        mBufferBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        mBufferCanvas = new Canvas(mBufferBitmap);
    }

    @Override
    public long drawDanmakus() {
        if (mIsRelease || mOuterTimer == null) {
            return 0;
        }
        Canvas canvas = mBufferCanvas;
        if (canvas == null) {
            return 0;
        }
        Bitmap bufferBitmap = this.mBufferBitmap;
        if (bufferBitmap == null || bufferBitmap.isRecycled()) {
            return 0;
        }
        bufferBitmap.eraseColor(Color.TRANSPARENT);
        if (mClearFlag) {
            DrawHelper.clearCanvas(canvas, DrawHelper.Mode.COLOR_SRC_OVER);
            mClearFlag = false;
        } else {
            if (handler != null) {
                handler.draw(canvas, DrawHelper.Mode.COLOR_SRC_OVER);
            }
        }
        OnFrameAvailableListener onFrameAvailableListener = this.mOnFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            long curr = mOuterTimer.current();
            try {
                if (curr >= mExpectBeginMills - mFrameIntervalMills) {
                    Bitmap bitmap;
                    boolean recycle = false;
                    if (mScale == 1f) {
                        bitmap = bufferBitmap;
                    } else {
                        bitmap = Bitmap.createScaledBitmap(bufferBitmap, (int) (mWidth * mScale), (int) (mHeight * mScale), true);
                        recycle = true;
                    }
                    onFrameAvailableListener.onFrameAvailable(curr, bitmap);
                    if (recycle) {
                        bitmap.recycle();
                    }
                }
            } catch (Exception e) {
                release();
                onFrameAvailableListener.onFailed(101, e.getMessage());
            } finally {
                if (curr >= mEndTimeMills) {
                    release();
                    if (mTimer != null) {
                        mTimer.update(mEndTimeMills);
                    }
                    onFrameAvailableListener.onFramesFinished(curr);
                }
            }
        }
        mRequestRender = false;
        return 2;  // 固定频率
    }

    @Override
    public void release() {
        mIsRelease = true;
        super.release();
        mBufferBitmap = null;
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }

    @Override
    public boolean isShown() {
        return true;
    }

    @Override
    public boolean isViewReady() {
        return true;
    }

    @Override
    public int getViewWidth() {
        return mWidth;
    }

    @Override
    public int getViewHeight() {
        return mHeight;
    }

    @Override
    public void prepare(BaseDanmakuParser parser, DanmakuContext config) {
        CustomParser newParser = new CustomParser(parser, mBeginTimeMills, mEndTimeMills);
        DanmakuContext configCopy = copyConfig(config);
        if (mOnFrameAvailableListener != null) {
            mOnFrameAvailableListener.onConfig(configCopy);
        }
        prepare();
        DrawHandler hl = handler;
        if (hl == null) {
            return;
        }
        hl.setConfig(configCopy);
        hl.setCallback(mCallback);
        hl.setIdleSleep(false);
        hl.enableNonBlockMode(true);
        newParser.setmDanmakuList(mDanmakuList);
        hl.setParser(newParser);
        hl.prepare();
    }

    public void setDanmakuList(IDanmakus danmakuList) {
        mDanmakuList = danmakuList;
    }

    public void setTimeRange(final long beginMills, final long endMills) {
        mExpectBeginMills = beginMills;
        mBeginTimeMills = Math.max(0, beginMills - DURATION);
        mEndTimeMills = endMills;
    }

    public long getBeginTimeMills() {
        return mBeginTimeMills;
    }

    public void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener) {
        mOnFrameAvailableListener = onFrameAvailableListener;
    }

    public void getFrameAtTime(final int frameRate) {
        if (mRetryCount++ > 5) {
            release();
            if (mOnFrameAvailableListener != null) {
                mOnFrameAvailableListener.onFailed(100, "not prepared");
            }
            return;
        }
        if (!isPrepared()) {
            DrawHandler handler = this.handler;
            if (handler == null) {
                return;
            }
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    getFrameAtTime(frameRate);
                }
            }, 1000L);
            return;
        }
        mFrameIntervalMills = 1000 / frameRate;
        setCallback(this);
        long beginMills = Math.max(0, mExpectBeginMills - getConfig().mDanmakuFactory.MAX_DANMAKU_DURATION * 3 / 2);
        mOuterTimer = new DanmakuTimer(beginMills);
        start(beginMills);
    }

    @Override
    public void prepared() {

    }

    @Override
    public void updateTimer(DanmakuTimer timer) {
        mTimer = timer;
        timer.update(mOuterTimer.current() + mFrameIntervalMills);
        mOuterTimer.update(mOuterTimer.current() + mFrameIntervalMills);
    }

    @Override
    public void danmakuShown(BaseDanmaku danmaku) {

    }

    @Override
    public void drawingFinished() {

    }

    @Override
    public void onFrameUpdate(Canvas canvas, long currentMills) {

    }

    private DanmakuContext copyConfig(DanmakuContext target) {
        DanmakuContext context = new DanmakuContext();
        context.mFont = target.mFont;
        context.transparency = target.transparency;
        context.scaleTextSize = target.scaleTextSize;
        context.margin = target.margin;
        context.HitDanmakuWhenTouchDown = target.HitDanmakuWhenTouchDown;
        context.HitDanmakuPadding.set(target.HitDanmakuPadding);
        context.maximumNumsInScreen = target.maximumNumsInScreen;
        context.screenOccupationRatio = target.screenOccupationRatio;
        context.scrollSpeedFactor = target.scrollSpeedFactor;
        context.mDisplayer = new AndroidDisplayer();
        context.mDisplayer.setTransparency(target.transparency);
        context.setCacheStuffer(target.mDisplayer.getCacheStuffer(), null);
        context.setIsPreventOverlappingEnabled(target.isPreventOverlappingEnabled());
        context.setDuplicateMergingEnabled(target.isDuplicateMergingEnabled());
        context.mDanmakuFilters = target.mDanmakuFilters;
        context.mDanmakuFilters.clear();
        if (!mDanmakuVisible) {
            mDanmakuVisible = true;
            context.setFBDanmakuVisibility(true)
                    .setL2RDanmakuVisibility(true)
                    .setFTDanmakuVisibility(true)
                    .setR2LDanmakuVisibility(true)
                    .setR2LImageDanmakuVisibility(true)
                    .setSpecialDanmakuVisibility(true);
        }
        context.mDanmakuFactory = target.mDanmakuFactory;
        context.cachingPolicy = target.cachingPolicy;
        context.cacheMissFilter = target.cacheMissFilter;
        context.updateMethod = 1;
        context.mDanmakuFactory = DanmakuFactory.create();
        context.setDanmakuSync(null);
        context.unregisterAllConfigChangedCallbacks();
        return context;
    }

    public void setDanmakuVisibility(boolean visible) {
        mDanmakuVisible = visible;
    }
}

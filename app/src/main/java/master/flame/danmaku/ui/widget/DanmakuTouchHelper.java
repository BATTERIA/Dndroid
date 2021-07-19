package master.flame.danmaku.ui.widget;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.model.android.SpannedCacheStuffer;

/**
 * Created by kmfish on 2015/1/25.
 */
public class DanmakuTouchHelper {
    private final GestureDetector mTouchDelegate;
    private IDanmakuView danmakuView;
    private RectF mDanmakuBounds;
    private float mXOff;
    private float mYOff;
    private IDanmakus mLastHitDanmakus;
    private IDanmakus mLastTouchDownDanmakus;

    private final android.view.GestureDetector.OnGestureListener mOnGestureListener = new GestureDetector.SimpleOnGestureListener() {
        private float lastTouchDownX, lastTouchDownY;

        @Override
        public boolean onDown(MotionEvent event) {
            lastTouchDownX = event.getX();
            lastTouchDownY = event.getY();
            if (danmakuView != null) {
                IDanmakuView.OnDanmakuClickListener onDanmakuClickListener = danmakuView.getOnDanmakuClickListener();
                if (onDanmakuClickListener != null) {
                    DanmakuContext context = danmakuView.getConfig();
                    if (context == null || context.HitDanmakuWhenTouchDown) {
                        mLastHitDanmakus = touchHitDanmaku(0, lastTouchDownX, lastTouchDownY);
                    }
                    if (!mLastHitDanmakus.isEmpty()) {
                        mXOff = danmakuView.getXOff();
                        mYOff = danmakuView.getYOff();
                        return true;
                    }
                    if (onDanmakuClickListener.isInterceptAll()) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();
            boolean isEventConsumed;
            DanmakuContext context = danmakuView.getConfig();
            if (context == null || context.HitDanmakuWhenTouchDown) {
                isEventConsumed = performDanmakuClick(mLastHitDanmakus, false, x, y);
            } else {
                isEventConsumed = performDanmakuClick(0, false, x, y);
            }
            if (!isEventConsumed) {
                isEventConsumed = performViewClick(x, y);
            }
            return isEventConsumed;
        }

        @Override
        public void onLongPress(MotionEvent event) {
            IDanmakuView.OnDanmakuClickListener onDanmakuClickListener = danmakuView.getOnDanmakuClickListener();
            if (onDanmakuClickListener == null) {
                return;
            }
            mXOff = danmakuView.getXOff();
            mYOff = danmakuView.getYOff();
            float x = lastTouchDownX; //event.getX();
            float y = lastTouchDownY; //event.getY();

            DanmakuContext context = danmakuView.getConfig();
            if (context == null || context.HitDanmakuWhenTouchDown) {
                performDanmakuClick(mLastHitDanmakus, true, x, y);
            } else {
                performDanmakuClick(0, true, x, y);
            }
        }
    };

    private DanmakuTouchHelper(IDanmakuView danmakuView) {
        this.danmakuView = danmakuView;
        this.mDanmakuBounds = new RectF();
        this.mTouchDelegate = new GestureDetector(((View) danmakuView).getContext(), mOnGestureListener);
    }

    public static synchronized DanmakuTouchHelper instance(IDanmakuView danmakuView) {
        return new DanmakuTouchHelper(danmakuView);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return mTouchDelegate.onTouchEvent(event);
    }

    public void performDanmakuTouchDown(int type, float x, float y, boolean hitMask) {
        if (hitMask) {
            mLastTouchDownDanmakus = new Danmakus();
            return;
        }
        mLastTouchDownDanmakus = touchHitDanmaku(type, x, y);
    }

    public boolean performDanmakuClick(int type, boolean isLongClick, float x, float y) {
        IDanmakus danmakus = mLastTouchDownDanmakus == null ? touchHitDanmaku(type, x, y) : mLastTouchDownDanmakus;
        mLastTouchDownDanmakus = null;
        return performDanmakuClick(danmakus, isLongClick, x, y);
    }

    private boolean performDanmakuClick(IDanmakus danmakus, boolean isLongClick, float x, float y) {
        IDanmakuView.OnDanmakuClickListener onDanmakuClickListener = danmakuView.getOnDanmakuClickListener();
        if (onDanmakuClickListener == null) {
            return false;
        }
        IDanmakus hitDanmakus = danmakus == null ? new Danmakus() : danmakus;
        if (isLongClick) {
            return onDanmakuClickListener.onDanmakuLongClick(hitDanmakus, x, y);
        }
        return onDanmakuClickListener.onDanmakuClick(hitDanmakus, x, y);
    }

    private boolean performViewClick(float x, float y) {
        IDanmakuView.OnDanmakuClickListener onDanmakuClickListener = danmakuView.getOnDanmakuClickListener();
        if (onDanmakuClickListener != null) {
            return onDanmakuClickListener.onViewClick(danmakuView, x, y);
        }
        return false;
    }

    private IDanmakus touchHitDanmaku(final int type, final float x, final float y) {
        final IDanmakus hitDanmakus = new Danmakus();
        mDanmakuBounds.setEmpty();

        IDanmakus danmakus = danmakuView.getCurrentVisibleDanmakus();
        if (null != danmakus && !danmakus.isEmpty()) {
            danmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                @Override
                public int accept(BaseDanmaku danmaku) {
                    if (null != danmaku && !danmaku.isFiltered()) {
                        mDanmakuBounds.set(danmaku.getLeft(), danmaku.getTop(), danmaku.getRight(), danmaku.getBottom());
                        DanmakuContext context = danmakuView.getConfig();
                        if (context != null) {
                            Rect rect = context.HitDanmakuPadding;
                            mDanmakuBounds.set(mDanmakuBounds.left - rect.left, mDanmakuBounds.top - rect.top, mDanmakuBounds.right + rect.right, mDanmakuBounds.bottom + rect.bottom);
                        }
                        if (mDanmakuBounds.intersect(x - mXOff, y - mYOff, x + mXOff, y + mYOff)) {
                            if (type == 0 || type == danmaku.getType()) {
                                if (checkLinesBounds(danmaku, x, y)) {
                                    danmaku.setTag(BaseDanmaku.KEY_CLICK_OFFSET_X, x - danmaku.getLeft());
                                    danmaku.setTag(BaseDanmaku.KEY_CLICK_OFFSET_Y, y - danmaku.getTop());
                                    hitDanmakus.addItem(danmaku);
                                }
                            }
                        }
                    }
                    return ACTION_CONTINUE;
                }

                private boolean checkLinesBounds(BaseDanmaku danmaku, float x, float y) {
                    RectF[] lineBoundsArray = (RectF[]) danmaku.getTag(SpannedCacheStuffer.TAG_KEY_LINE_BOUNDS_ARRAY);
                    boolean hit = true;
                    if (lineBoundsArray != null) {
                        for (int i = 0; i < lineBoundsArray.length; i++) {
                            RectF rect = lineBoundsArray[i];
                            mDanmakuBounds.set(danmaku.getLeft() + rect.left, danmaku.getTop() + rect.top, danmaku.getLeft() + rect.right, danmaku.getTop() + rect.bottom);
                            hit = (mDanmakuBounds.intersect(x - mXOff, y - mYOff, x + mXOff, y + mYOff));
                            if (hit) {
                                break;
                            }
                        }
                    }
                    return hit;
                }
            });
        }
        return hitDanmakus;
    }
}

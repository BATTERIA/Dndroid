package com.bilibili.bililive.batteria.danmaku;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class DanmuLinearLayout extends LinearLayout {
    public DanmuLinearLayout(Context context) {
        super(context);
    }

    public DanmuLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DanmuLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        return super.onTouchEvent(event);
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View childAt = getChildAt(i);
            childAt.onTouchEvent(event);
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}

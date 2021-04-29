/*
 * Copyright (c) 2016. BiliBili Inc.
 */

package com.bilibili.bililive.batteria.recycler;

import android.content.Context;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yrom
 */
public class RecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private OnSizeChangedListener mOnSizeChangedListener;

    public RecyclerView(Context context) {
        super(context);
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * The vertical offset of the scrollbar's thumb
     */
    public int getVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    /**
     * The horizontal offset of the scrollbar's thumb
     */
    public int getHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mOnSizeChangedListener != null) {
            mOnSizeChangedListener.onSizeChanged(this, w, h, oldw, oldh);
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener l) {
        mOnSizeChangedListener = l;
    }

    public interface OnSizeChangedListener {
        void onSizeChanged(androidx.recyclerview.widget.RecyclerView view, int w, int h, int ow, int oh);
    }
}


package com.zhpan.bannerview.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import e.j.a.i.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

public class CatchViewPager extends ViewPager {
    public ArrayList<Integer> i0;
    public SparseIntArray j0;
    public boolean k0;
    public a l0;
    public boolean m0;
    public boolean n0;

    public CatchViewPager(Context context) {
        this(context, null);
    }

    public CatchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i0 = new ArrayList<>();
        this.j0 = new SparseIntArray();
        this.k0 = false;
        this.n0 = true;
        try {
            a aVar = new a(getContext());
            this.l0 = aVar;
            aVar.f4963a = 500;
            Field declaredField = ViewPager.class.getDeclaredField("l");
            declaredField.setAccessible(true);
            declaredField.set(this, this.l0);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getChildDrawingOrder(int i, int i2) {
        if (!this.k0) {
            return super.getChildDrawingOrder(i, i2);
        }
        if (i2 == 0 || this.j0.size() != i) {
            this.i0.clear();
            this.j0.clear();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int width = (getWidth() / 2) + iArr[0];
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                int abs = Math.abs(width - ((childAt.getWidth() / 2) + iArr2[0])) + 1;
                this.i0.add(Integer.valueOf(abs));
                this.j0.append(abs, i3);
            }
            Collections.sort(this.i0);
        }
        return this.j0.get(this.i0.get((i - 1) - i2).intValue());
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("Q");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.valueOf(this.n0));
            setCurrentItem(getCurrentItem());
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0 = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.m0) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFirstLayout(boolean z) {
        this.n0 = z;
    }

    public void setOverlapStyle(boolean z) {
        this.k0 = z;
    }

    public void setScrollDuration(int i) {
        this.l0.f4963a = i;
    }
}

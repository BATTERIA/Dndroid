package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d.b.f;
import d.b.j;
import d.b.o.b;
import d.b.o.m0;
import d.g.l.p;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public boolean f2282c;

    /* renamed from: d  reason: collision with root package name */
    public View f2283d;

    /* renamed from: e  reason: collision with root package name */
    public View f2284e;

    /* renamed from: f  reason: collision with root package name */
    public View f2285f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2286g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2287h;
    public Drawable i;
    public boolean j;
    public boolean k;
    public int l;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.a(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f2286g = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.f2287h = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.l = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.j = true;
            this.i = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.j ? !(this.f2286g == null && this.f2287h == null) : this.i != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2286g;
        if (drawable != null && drawable.isStateful()) {
            this.f2286g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2287h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2287h.setState(getDrawableState());
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.i.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f2283d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2286g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2287h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2284e = findViewById(f.action_bar);
        this.f2285f = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2282c || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f2283d;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.j) {
            Drawable drawable3 = this.i;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f2286g != null) {
                if (this.f2284e.getVisibility() == 0) {
                    drawable2 = this.f2286g;
                    left = this.f2284e.getLeft();
                    top = this.f2284e.getTop();
                    right = this.f2284e.getRight();
                    view = this.f2284e;
                } else {
                    View view3 = this.f2285f;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f2286g.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f2286g;
                        left = this.f2285f.getLeft();
                        top = this.f2285f.getTop();
                        right = this.f2285f.getRight();
                        view = this.f2285f;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.k = z4;
            if (!z4 || (drawable = this.f2287h) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2286g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2286g);
        }
        this.f2286g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2284e;
            if (view != null) {
                this.f2286g.setBounds(view.getLeft(), this.f2284e.getTop(), this.f2284e.getRight(), this.f2284e.getBottom());
            }
        }
        boolean z = true;
        if (!this.j ? !(this.f2286g == null && this.f2287h == null) : this.i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.j && (drawable2 = this.i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.j ? this.f2286g == null && this.f2287h == null : this.i == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2287h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2287h);
        }
        this.f2287h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.k && (drawable2 = this.f2287h) != null) {
                drawable2.setBounds(this.f2283d.getLeft(), this.f2283d.getTop(), this.f2283d.getRight(), this.f2283d.getBottom());
            }
        }
        boolean z = true;
        if (!this.j ? !(this.f2286g == null && this.f2287h == null) : this.i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(m0 m0Var) {
        View view = this.f2283d;
        if (view != null) {
            removeView(view);
        }
        this.f2283d = m0Var;
        if (m0Var != null) {
            addView(m0Var);
            ViewGroup.LayoutParams layoutParams = m0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2282c = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f2286g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2287h;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2286g && !this.j) || (drawable == this.f2287h && this.k) || ((drawable == this.i && this.j) || super.verifyDrawable(drawable));
    }
}

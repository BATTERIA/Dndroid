package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.b.f;
import d.b.g;
import d.b.j;
import d.b.o.a1;
import d.b.o.c;
import d.g.l.p;

public class ActionBarContextView extends d.b.o.a {
    public CharSequence k;
    public CharSequence l;
    public View m;
    public View n;
    public LinearLayout o;
    public TextView p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public int u;

    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d.b.n.a f2288c;

        public a(ActionBarContextView actionBarContextView, d.b.n.a aVar) {
            this.f2288c = aVar;
        }

        public void onClick(View view) {
            this.f2288c.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.b.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMode, i, 0);
        int i2 = j.ActionMode_background;
        p.a(this, (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0) ? obtainStyledAttributes.getDrawable(i2) : d.b.l.a.a.c(context, resourceId));
        this.r = obtainStyledAttributes.getResourceId(j.ActionMode_titleTextStyle, 0);
        this.s = obtainStyledAttributes.getResourceId(j.ActionMode_subtitleTextStyle, 0);
        this.f2860g = obtainStyledAttributes.getLayoutDimension(j.ActionMode_height, 0);
        this.u = obtainStyledAttributes.getResourceId(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.o = linearLayout;
            this.p = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.q = (TextView) this.o.findViewById(f.action_bar_subtitle);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.k);
        this.q.setText(this.l);
        boolean z = !TextUtils.isEmpty(this.k);
        boolean z2 = !TextUtils.isEmpty(this.l);
        int i = 0;
        this.q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.o;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(d.b.n.a r7) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.a(d.b.n.a):void");
    }

    public void b() {
        removeAllViews();
        this.n = null;
        this.f2858e = null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // d.b.o.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // d.b.o.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.l;
    }

    public CharSequence getTitle() {
        return this.k;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f2859f;
        if (cVar != null) {
            cVar.c();
            this.f2859f.d();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.k);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a2 = a1.a(this);
        int paddingRight = a2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.m;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            int i5 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a2 ? paddingRight - i5 : paddingRight + i5;
            int a3 = i7 + a(this.m, i7, paddingTop, paddingTop2, a2);
            paddingRight = a2 ? a3 - i6 : a3 + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.o;
        if (!(linearLayout == null || this.n != null || linearLayout.getVisibility() == 8)) {
            i8 += a(this.o, i8, paddingTop, paddingTop2, a2);
        }
        View view2 = this.n;
        if (view2 != null) {
            a(view2, i8, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2858e;
        if (actionMenuView != null) {
            a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f2860g;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.m;
            if (view != null) {
                int a2 = a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2858e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a(this.f2858e, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.o;
            if (linearLayout != null && this.n == null) {
                if (this.t) {
                    this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.o.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.o.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f2860g <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // d.b.o.a
    public void setContentHeight(int i) {
        this.f2860g = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (!(view == null || (linearLayout = this.o) == null)) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.l = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.k = charSequence;
        a();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    @Override // d.b.o.a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

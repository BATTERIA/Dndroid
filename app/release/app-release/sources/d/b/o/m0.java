package d.b.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import d.b.b;
import d.b.d;
import d.b.j;
import d.b.k.a;

public class m0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f2946c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2947d;

    /* renamed from: e  reason: collision with root package name */
    public int f2948e;

    /* renamed from: f  reason: collision with root package name */
    public int f2949f;

    /* renamed from: g  reason: collision with root package name */
    public int f2950g;

    /* renamed from: h  reason: collision with root package name */
    public int f2951h;

    public class a extends LinearLayout {

        /* renamed from: c  reason: collision with root package name */
        public a.c f2952c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m0 f2953d;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f2953d.f2948e > 0 && getMeasuredWidth() > (i3 = this.f2953d.f2948e)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2946c;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.ActionBar, d.b.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f2949f = context.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2946c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((a) view).f2952c.a();
    }

    public void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2947d = z;
    }

    public void setContentHeight(int i) {
        this.f2950g = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2951h = i;
        throw null;
    }
}

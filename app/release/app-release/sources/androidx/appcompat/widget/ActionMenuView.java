package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import d.b.n.i.h;
import d.b.n.i.j;
import d.b.n.i.o;
import d.b.n.i.p;
import d.b.o.a1;
import d.b.o.c;
import d.b.o.f0;

public class ActionMenuView extends f0 implements h.b, p {
    public int A;
    public int B;
    public e C;
    public h r;
    public Context s;
    public int t;
    public boolean u;
    public d.b.o.c v;
    public o.a w;
    public h.a x;
    public boolean y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements o.a {
        @Override // d.b.n.i.o.a
        public void a(h hVar, boolean z) {
        }

        @Override // d.b.n.i.o.a
        public boolean a(h hVar) {
            return false;
        }
    }

    public static class c extends f0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f2298c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f2299d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f2300e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f2301f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f2302g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2303h;

        public c(int i, int i2) {
            super(i, i2);
            this.f2298c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f2298c = cVar.f2298c;
        }
    }

    public class d implements h.a {
        public d() {
        }

        @Override // d.b.n.i.h.a
        public void a(h hVar) {
            h.a aVar = ActionMenuView.this.x;
            if (aVar != null) {
                aVar.a(hVar);
            }
        }

        @Override // d.b.n.i.h.a
        public boolean a(h hVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.C;
            if (eVar == null) {
                return false;
            }
            Toolbar.e eVar2 = Toolbar.this.I;
            return eVar2 != null ? eVar2.onMenuItemClick(menuItem) : false;
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A = (int) (56.0f * f2);
        this.B = (int) (f2 * 4.0f);
        this.s = context;
        this.t = 0;
    }

    public static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.d();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f2298c || !z3) {
            z2 = false;
        }
        cVar.f2301f = z2;
        cVar.f2299d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // d.b.n.i.p
    public void a(h hVar) {
        this.r = hVar;
    }

    @Override // d.b.n.i.h.b
    public boolean a(j jVar) {
        return this.r.a(jVar, (o) null, 0);
    }

    public boolean b(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).b();
    }

    @Override // d.b.o.f0
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // d.b.o.f0, d.b.o.f0
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.b = 16;
        return cVar;
    }

    @Override // d.b.o.f0, d.b.o.f0, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // d.b.o.f0, d.b.o.f0, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.b <= 0) {
            cVar.b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.r == null) {
            Context context = getContext();
            h hVar = new h(context);
            this.r = hVar;
            hVar.f2821e = new d();
            d.b.o.c cVar = new d.b.o.c(context);
            this.v = cVar;
            cVar.n = true;
            cVar.o = true;
            o.a aVar = this.w;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f2785g = aVar;
            this.r.a(this.v, this.s);
            d.b.o.c cVar2 = this.v;
            cVar2.j = this;
            this.r = cVar2.f2783e;
        }
        return this.r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        d.b.o.c cVar = this.v;
        c.d dVar = cVar.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.m) {
            return cVar.l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d.b.o.c cVar = this.v;
        if (cVar != null) {
            cVar.a(false);
            if (this.v.e()) {
                this.v.c();
                this.v.f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d.b.o.c cVar = this.v;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // d.b.o.f0
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.y) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = a1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f2298c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    b(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2298c) {
                    int i17 = width - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2298c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // d.b.o.f0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.v.s = z2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.C = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        d.b.o.c cVar = this.v;
        c.d dVar = cVar.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.m = true;
        cVar.l = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.u = z2;
    }

    public void setPopupTheme(int i) {
        if (this.t != i) {
            this.t = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(d.b.o.c cVar) {
        this.v = cVar;
        cVar.j = this;
        this.r = cVar.f2783e;
    }

    @Override // d.b.o.f0, d.b.o.f0, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public f0.a m84generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}

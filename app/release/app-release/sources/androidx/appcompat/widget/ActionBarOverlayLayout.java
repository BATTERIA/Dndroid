package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import d.b.f;
import d.b.k.u;
import d.b.n.g;
import d.b.n.i.o;
import d.b.o.a0;
import d.b.o.a1;
import d.b.o.z;
import d.g.l.j;
import d.g.l.k;
import d.g.l.p;

public class ActionBarOverlayLayout extends ViewGroup implements z, j {
    public static final int[] D = {d.b.a.actionBarSize, 16842841};
    public final Runnable A;
    public final Runnable B;
    public final k C;

    /* renamed from: c  reason: collision with root package name */
    public int f2289c;

    /* renamed from: d  reason: collision with root package name */
    public int f2290d;

    /* renamed from: e  reason: collision with root package name */
    public ContentFrameLayout f2291e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContainer f2292f;

    /* renamed from: g  reason: collision with root package name */
    public a0 f2293g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2294h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public d w;
    public OverScroller x;
    public ViewPropertyAnimator y;
    public final AnimatorListenerAdapter z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = null;
            actionBarOverlayLayout.m = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = null;
            actionBarOverlayLayout.m = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = actionBarOverlayLayout.f2292f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = actionBarOverlayLayout.f2292f.animate().translationY((float) (-ActionBarOverlayLayout.this.f2292f.getHeight())).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2290d = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.z = new a();
        this.A = new b();
        this.B = new c();
        a(context);
        this.C = new k();
    }

    @Override // d.b.o.z
    public void a(int i2) {
        i();
        if (i2 == 2) {
            this.f2293g.l();
        } else if (i2 == 5) {
            this.f2293g.n();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public final void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(D);
        boolean z2 = false;
        this.f2289c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2294h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.i = z2;
        this.x = new OverScroller(context);
    }

    @Override // d.b.o.z
    public void a(Menu menu, o.a aVar) {
        i();
        this.f2293g.a(menu, aVar);
    }

    @Override // d.b.o.z
    public boolean a() {
        i();
        return this.f2293g.a();
    }

    public final boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i4 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i3 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i3;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i2;
        return true;
    }

    @Override // d.b.o.z
    public boolean b() {
        i();
        return this.f2293g.b();
    }

    @Override // d.b.o.z
    public boolean c() {
        i();
        return this.f2293g.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // d.b.o.z
    public boolean d() {
        i();
        return this.f2293g.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f2294h != null && !this.i) {
            if (this.f2292f.getVisibility() == 0) {
                i2 = (int) (this.f2292f.getTranslationY() + ((float) this.f2292f.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f2294h.setBounds(0, i2, getWidth(), this.f2294h.getIntrinsicHeight() + i2);
            this.f2294h.draw(canvas);
        }
    }

    @Override // d.b.o.z
    public void e() {
        i();
        this.f2293g.e();
    }

    @Override // d.b.o.z
    public boolean f() {
        i();
        return this.f2293g.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        i();
        int l2 = p.l(this) & 256;
        boolean a2 = a(this.f2292f, rect, true, true, false, true);
        this.s.set(rect);
        a1.a(this, this.s, this.p);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            a2 = true;
        }
        if (!this.q.equals(this.p)) {
            this.q.set(this.p);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // d.b.o.z
    public void g() {
        i();
        this.f2293g.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2292f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public CharSequence getTitle() {
        i();
        return this.f2293g.getTitle();
    }

    public void h() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void i() {
        a0 a0Var;
        if (this.f2291e == null) {
            this.f2291e = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f2292f = (ActionBarContainer) findViewById(f.action_bar_container);
            View findViewById = findViewById(f.action_bar);
            if (findViewById instanceof a0) {
                a0Var = (a0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                a0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a2 = e.a.a.a.a.a("Can't make a decor toolbar out of ");
                a2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a2.toString());
            }
            this.f2293g = a0Var;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        p.u(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        i();
        measureChildWithMargins(this.f2292f, i2, 0, i3, 0);
        e eVar = (e) this.f2292f.getLayoutParams();
        int max = Math.max(0, this.f2292f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f2292f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2292f.getMeasuredState());
        boolean z2 = (p.l(this) & 256) != 0;
        if (z2) {
            i4 = this.f2289c;
            if (this.k && this.f2292f.getTabContainer() != null) {
                i4 += this.f2289c;
            }
        } else {
            i4 = this.f2292f.getVisibility() != 8 ? this.f2292f.getMeasuredHeight() : 0;
        }
        this.r.set(this.p);
        this.u.set(this.s);
        Rect rect = (this.j || z2) ? this.u : this.r;
        rect.top += i4;
        rect.bottom += 0;
        a(this.f2291e, this.r, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.f2291e.a(this.u);
        }
        measureChildWithMargins(this.f2291e, i2, 0, i3, 0);
        e eVar2 = (e) this.f2291e.getLayoutParams();
        int max3 = Math.max(max, this.f2291e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f2291e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2291e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // d.g.l.j
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.l || !z2) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.f2292f.getHeight()) {
            z3 = true;
        }
        if (z3) {
            h();
            this.B.run();
        } else {
            h();
            this.A.run();
        }
        this.m = true;
        return true;
    }

    @Override // d.g.l.j
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // d.g.l.j
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // d.g.l.j
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.n + i3;
        this.n = i6;
        setActionBarHideOffset(i6);
    }

    @Override // d.g.l.j
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        u uVar;
        g gVar;
        this.C.f3341a = i2;
        this.n = getActionBarHideOffset();
        h();
        d dVar = this.w;
        if (dVar != null && (gVar = (uVar = (u) dVar).u) != null) {
            gVar.a();
            uVar.u = null;
        }
    }

    @Override // d.g.l.j
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f2292f.getVisibility() != 0) {
            return false;
        }
        return this.l;
    }

    @Override // d.g.l.j
    public void onStopNestedScroll(View view) {
        if (this.l && !this.m) {
            if (this.n <= this.f2292f.getHeight()) {
                h();
                postDelayed(this.A, 600);
            } else {
                h();
                postDelayed(this.B, 600);
            }
        }
        d dVar = this.w;
        if (dVar != null && ((u) dVar) == null) {
            throw null;
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        i();
        int i3 = this.o ^ i2;
        this.o = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.w;
        if (dVar != null) {
            ((u) dVar).p = !z3;
            if (z2 || !z3) {
                u uVar = (u) this.w;
                if (uVar.r) {
                    uVar.r = false;
                    uVar.f(true);
                }
            } else {
                u uVar2 = (u) dVar;
                if (!uVar2.r) {
                    uVar2.r = true;
                    uVar2.f(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.w != null) {
            p.u(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f2290d = i2;
        d dVar = this.w;
        if (dVar != null) {
            ((u) dVar).o = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f2292f.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f2292f.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.w = dVar;
        if (getWindowToken() != null) {
            ((u) this.w).o = this.f2290d;
            int i2 = this.o;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                p.u(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.k = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        i();
        this.f2293g.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        i();
        this.f2293g.setIcon(drawable);
    }

    public void setLogo(int i2) {
        i();
        this.f2293g.b(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.j = z2;
        this.i = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // d.b.o.z
    public void setWindowCallback(Window.Callback callback) {
        i();
        this.f2293g.setWindowCallback(callback);
    }

    @Override // d.b.o.z
    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.f2293g.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

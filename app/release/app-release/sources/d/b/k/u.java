package d.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import d.b.f;
import d.b.j;
import d.b.k.a;
import d.b.n.a;
import d.b.n.g;
import d.b.n.i.h;
import d.b.o.a0;
import d.b.o.m0;
import d.g.l.p;
import d.g.l.v;
import d.g.l.w;
import d.g.l.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class u extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f2701a;
    public Context b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f2702c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f2703d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f2704e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f2705f;

    /* renamed from: g  reason: collision with root package name */
    public View f2706g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2707h;
    public d i;
    public d.b.n.a j;
    public a.AbstractC0090a k;
    public boolean l;
    public ArrayList<a.b> m = new ArrayList<>();
    public boolean n;
    public int o = 0;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t = true;
    public g u;
    public boolean v;
    public boolean w;
    public final v x = new a();
    public final v y = new b();
    public final x z = new c();

    public class a extends w {
        public a() {
        }

        @Override // d.g.l.v
        public void a(View view) {
            View view2;
            u uVar = u.this;
            if (uVar.p && (view2 = uVar.f2706g) != null) {
                view2.setTranslationY(0.0f);
                u.this.f2703d.setTranslationY(0.0f);
            }
            u.this.f2703d.setVisibility(8);
            u.this.f2703d.setTransitioning(false);
            u uVar2 = u.this;
            uVar2.u = null;
            a.AbstractC0090a aVar = uVar2.k;
            if (aVar != null) {
                aVar.a(uVar2.j);
                uVar2.j = null;
                uVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = u.this.f2702c;
            if (actionBarOverlayLayout != null) {
                p.u(actionBarOverlayLayout);
            }
        }
    }

    public class b extends w {
        public b() {
        }

        @Override // d.g.l.v
        public void a(View view) {
            u uVar = u.this;
            uVar.u = null;
            uVar.f2703d.requestLayout();
        }
    }

    public class c implements x {
        public c() {
        }
    }

    public u(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f2706g = decorView.findViewById(16908290);
        }
    }

    public u(Dialog dialog) {
        new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    public final void a(View view) {
        a0 a0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.f2702c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(f.action_bar);
        if (findViewById instanceof a0) {
            a0Var = (a0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            a0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a2 = e.a.a.a.a.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        }
        this.f2704e = a0Var;
        this.f2705f = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f2703d = actionBarContainer;
        a0 a0Var2 = this.f2704e;
        if (a0Var2 == null || this.f2705f == null || actionBarContainer == null) {
            throw new IllegalStateException(u.class.getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f2701a = a0Var2.j();
        boolean z2 = (this.f2704e.h() & 4) != 0;
        if (z2) {
            this.f2707h = true;
        }
        Context context = this.f2701a;
        this.f2704e.a((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        e(context.getResources().getBoolean(d.b.b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2701a.obtainStyledAttributes(null, j.ActionBar, d.b.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2702c;
            if (actionBarOverlayLayout2.j) {
                this.w = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            p.a(this.f2703d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // d.b.k.a
    public void a(CharSequence charSequence) {
        this.f2704e.setWindowTitle(charSequence);
    }

    @Override // d.b.k.a
    public void a(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            int size = this.m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.m.get(i2).a(z2);
            }
        }
    }

    @Override // d.b.k.a
    public boolean a() {
        a0 a0Var = this.f2704e;
        if (a0Var == null || !a0Var.m()) {
            return false;
        }
        this.f2704e.collapseActionView();
        return true;
    }

    @Override // d.b.k.a
    public int b() {
        return this.f2704e.h();
    }

    @Override // d.b.k.a
    public void b(boolean z2) {
        if (!this.f2707h) {
            int i2 = z2 ? 4 : 0;
            int h2 = this.f2704e.h();
            this.f2707h = true;
            this.f2704e.c((i2 & 4) | (h2 & -5));
        }
    }

    @Override // d.b.k.a
    public Context c() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2701a.getTheme().resolveAttribute(d.b.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.f2701a, i2);
            } else {
                this.b = this.f2701a;
            }
        }
        return this.b;
    }

    @Override // d.b.k.a
    public void c(boolean z2) {
        g gVar;
        this.v = z2;
        if (!z2 && (gVar = this.u) != null) {
            gVar.a();
        }
    }

    public void d(boolean z2) {
        d.g.l.u uVar;
        d.g.l.u uVar2;
        if (z2) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2702c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2702c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        if (p.q(this.f2703d)) {
            if (z2) {
                uVar = this.f2704e.a(4, 100);
                uVar2 = this.f2705f.a(0, 200);
            } else {
                uVar2 = this.f2704e.a(0, 200);
                uVar = this.f2705f.a(8, 100);
            }
            g gVar = new g();
            gVar.f2766a.add(uVar);
            View view = uVar.f3355a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = uVar2.f3355a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.f2766a.add(uVar2);
            gVar.b();
        } else if (z2) {
            this.f2704e.a(4);
            this.f2705f.setVisibility(0);
        } else {
            this.f2704e.a(0);
            this.f2705f.setVisibility(8);
        }
    }

    public final void e(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.f2704e.a((m0) null);
            this.f2703d.setTabContainer(null);
        } else {
            this.f2703d.setTabContainer(null);
            this.f2704e.a((m0) null);
        }
        boolean z3 = true;
        boolean z4 = this.f2704e.k() == 2;
        this.f2704e.b(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2702c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void f(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.s || !this.r) {
            if (!this.t) {
                this.t = true;
                g gVar = this.u;
                if (gVar != null) {
                    gVar.a();
                }
                this.f2703d.setVisibility(0);
                if (this.o != 0 || (!this.v && !z2)) {
                    this.f2703d.setAlpha(1.0f);
                    this.f2703d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.f2706g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.y.a(null);
                } else {
                    this.f2703d.setTranslationY(0.0f);
                    float f2 = (float) (-this.f2703d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f2703d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f2703d.setTranslationY(f2);
                    g gVar2 = new g();
                    d.g.l.u a2 = p.a(this.f2703d);
                    a2.b(0.0f);
                    a2.a(this.z);
                    if (!gVar2.f2769e) {
                        gVar2.f2766a.add(a2);
                    }
                    if (this.p && (view3 = this.f2706g) != null) {
                        view3.setTranslationY(f2);
                        d.g.l.u a3 = p.a(this.f2706g);
                        a3.b(0.0f);
                        if (!gVar2.f2769e) {
                            gVar2.f2766a.add(a3);
                        }
                    }
                    Interpolator interpolator = B;
                    if (!gVar2.f2769e) {
                        gVar2.f2767c = interpolator;
                    }
                    if (!gVar2.f2769e) {
                        gVar2.b = 250;
                    }
                    v vVar = this.y;
                    if (!gVar2.f2769e) {
                        gVar2.f2768d = vVar;
                    }
                    this.u = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2702c;
                if (actionBarOverlayLayout != null) {
                    p.u(actionBarOverlayLayout);
                }
            }
        } else if (this.t) {
            this.t = false;
            g gVar3 = this.u;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o != 0 || (!this.v && !z2)) {
                this.x.a(null);
                return;
            }
            this.f2703d.setAlpha(1.0f);
            this.f2703d.setTransitioning(true);
            g gVar4 = new g();
            float f3 = (float) (-this.f2703d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f2703d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            d.g.l.u a4 = p.a(this.f2703d);
            a4.b(f3);
            a4.a(this.z);
            if (!gVar4.f2769e) {
                gVar4.f2766a.add(a4);
            }
            if (this.p && (view = this.f2706g) != null) {
                d.g.l.u a5 = p.a(view);
                a5.b(f3);
                if (!gVar4.f2769e) {
                    gVar4.f2766a.add(a5);
                }
            }
            Interpolator interpolator2 = A;
            if (!gVar4.f2769e) {
                gVar4.f2767c = interpolator2;
            }
            if (!gVar4.f2769e) {
                gVar4.b = 250;
            }
            v vVar2 = this.x;
            if (!gVar4.f2769e) {
                gVar4.f2768d = vVar2;
            }
            this.u = gVar4;
            gVar4.b();
        }
    }

    public class d extends d.b.n.a implements h.a {

        /* renamed from: e  reason: collision with root package name */
        public final Context f2711e;

        /* renamed from: f  reason: collision with root package name */
        public final h f2712f;

        /* renamed from: g  reason: collision with root package name */
        public a.AbstractC0090a f2713g;

        /* renamed from: h  reason: collision with root package name */
        public WeakReference<View> f2714h;

        public d(Context context, a.AbstractC0090a aVar) {
            this.f2711e = context;
            this.f2713g = aVar;
            h hVar = new h(context);
            hVar.l = 1;
            this.f2712f = hVar;
            hVar.f2821e = this;
        }

        @Override // d.b.n.a
        public void a() {
            u uVar = u.this;
            if (uVar.i == this) {
                boolean z = uVar.q;
                boolean z2 = uVar.r;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    u uVar2 = u.this;
                    uVar2.j = this;
                    uVar2.k = this.f2713g;
                } else {
                    this.f2713g.a(this);
                }
                this.f2713g = null;
                u.this.d(false);
                ActionBarContextView actionBarContextView = u.this.f2705f;
                if (actionBarContextView.m == null) {
                    actionBarContextView.b();
                }
                u.this.f2704e.i().sendAccessibilityEvent(32);
                u uVar3 = u.this;
                uVar3.f2702c.setHideOnContentScrollEnabled(uVar3.w);
                u.this.i = null;
            }
        }

        @Override // d.b.n.a
        public void a(View view) {
            u.this.f2705f.setCustomView(view);
            this.f2714h = new WeakReference<>(view);
        }

        @Override // d.b.n.a
        public void a(CharSequence charSequence) {
            u.this.f2705f.setSubtitle(charSequence);
        }

        @Override // d.b.n.i.h.a
        public boolean a(h hVar, MenuItem menuItem) {
            a.AbstractC0090a aVar = this.f2713g;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // d.b.n.a
        public View b() {
            WeakReference<View> weakReference = this.f2714h;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // d.b.n.a
        public void b(int i2) {
            u.this.f2705f.setTitle(u.this.f2701a.getResources().getString(i2));
        }

        @Override // d.b.n.a
        public void b(CharSequence charSequence) {
            u.this.f2705f.setTitle(charSequence);
        }

        @Override // d.b.n.a
        public Menu c() {
            return this.f2712f;
        }

        @Override // d.b.n.a
        public MenuInflater d() {
            return new d.b.n.f(this.f2711e);
        }

        @Override // d.b.n.a
        public CharSequence e() {
            return u.this.f2705f.getSubtitle();
        }

        @Override // d.b.n.a
        public CharSequence f() {
            return u.this.f2705f.getTitle();
        }

        @Override // d.b.n.a
        public void g() {
            if (u.this.i == this) {
                this.f2712f.j();
                try {
                    this.f2713g.a(this, this.f2712f);
                } finally {
                    this.f2712f.i();
                }
            }
        }

        @Override // d.b.n.a
        public boolean h() {
            return u.this.f2705f.t;
        }

        @Override // d.b.n.i.h.a
        public void a(h hVar) {
            if (this.f2713g != null) {
                g();
                d.b.o.c cVar = u.this.f2705f.f2859f;
                if (cVar != null) {
                    cVar.f();
                }
            }
        }

        @Override // d.b.n.a
        public void a(int i2) {
            u.this.f2705f.setSubtitle(u.this.f2701a.getResources().getString(i2));
        }

        @Override // d.b.n.a
        public void a(boolean z) {
            this.f2740d = z;
            u.this.f2705f.setTitleOptional(z);
        }
    }

    @Override // d.b.k.a
    public void a(Configuration configuration) {
        e(this.f2701a.getResources().getBoolean(d.b.b.abc_action_bar_embed_tabs));
    }

    @Override // d.b.k.a
    public boolean a(int i2, KeyEvent keyEvent) {
        h hVar;
        d dVar = this.i;
        if (dVar == null || (hVar = dVar.f2712f) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        hVar.setQwertyMode(z2);
        return hVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // d.b.k.a
    public d.b.n.a a(a.AbstractC0090a aVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a();
        }
        this.f2702c.setHideOnContentScrollEnabled(false);
        this.f2705f.b();
        d dVar2 = new d(this.f2705f.getContext(), aVar);
        dVar2.f2712f.j();
        try {
            if (!dVar2.f2713g.b(dVar2, dVar2.f2712f)) {
                return null;
            }
            this.i = dVar2;
            dVar2.g();
            this.f2705f.a(dVar2);
            d(true);
            this.f2705f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f2712f.i();
        }
    }
}

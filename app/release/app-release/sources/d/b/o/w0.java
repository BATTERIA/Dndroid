package d.b.o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import d.b.h;
import d.b.j;
import d.b.n.i.o;
import d.g.l.p;
import d.g.l.u;
import d.g.l.w;

public class w0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f3010a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public View f3011c;

    /* renamed from: d  reason: collision with root package name */
    public View f3012d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f3013e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f3014f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f3015g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3016h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o = 0;
    public int p = 0;
    public Drawable q;

    public class a extends w {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3017a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // d.g.l.v
        public void a(View view) {
            if (!this.f3017a) {
                w0.this.f3010a.setVisibility(this.b);
            }
        }

        @Override // d.g.l.v, d.g.l.w
        public void b(View view) {
            w0.this.f3010a.setVisibility(0);
        }

        @Override // d.g.l.v, d.g.l.w
        public void c(View view) {
            this.f3017a = true;
        }
    }

    public w0(Toolbar toolbar, boolean z) {
        int i2;
        Drawable drawable;
        int i3 = h.abc_action_bar_up_description;
        this.f3010a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f3016h = this.i != null;
        this.f3015g = toolbar.getNavigationIcon();
        String str = null;
        t0 a2 = t0.a(toolbar.getContext(), null, j.ActionBar, d.b.a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence d2 = a2.d(j.ActionBar_title);
            if (!TextUtils.isEmpty(d2)) {
                this.f3016h = true;
                this.i = d2;
                if ((this.b & 8) != 0) {
                    this.f3010a.setTitle(d2);
                }
            }
            CharSequence d3 = a2.d(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(d3)) {
                this.j = d3;
                if ((this.b & 8) != 0) {
                    this.f3010a.setSubtitle(d3);
                }
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                this.f3014f = b2;
                q();
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                this.f3013e = b3;
                q();
            }
            if (this.f3015g == null && (drawable = this.q) != null) {
                this.f3015g = drawable;
                p();
            }
            c(a2.d(j.ActionBar_displayOptions, 0));
            int f2 = a2.f(j.ActionBar_customNavigationLayout, 0);
            if (f2 != 0) {
                View inflate = LayoutInflater.from(this.f3010a.getContext()).inflate(f2, (ViewGroup) this.f3010a, false);
                View view = this.f3012d;
                if (!(view == null || (this.b & 16) == 0)) {
                    this.f3010a.removeView(view);
                }
                this.f3012d = inflate;
                if (!(inflate == null || (this.b & 16) == 0)) {
                    this.f3010a.addView(inflate);
                }
                c(this.b | 16);
            }
            int e2 = a2.e(j.ActionBar_height, 0);
            if (e2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3010a.getLayoutParams();
                layoutParams.height = e2;
                this.f3010a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                Toolbar toolbar2 = this.f3010a;
                int max = Math.max(b4, 0);
                int max2 = Math.max(b5, 0);
                toolbar2.a();
                toolbar2.v.a(max, max2);
            }
            int f3 = a2.f(j.ActionBar_titleTextStyle, 0);
            if (f3 != 0) {
                Toolbar toolbar3 = this.f3010a;
                Context context = toolbar3.getContext();
                toolbar3.n = f3;
                TextView textView = toolbar3.f2341d;
                if (textView != null) {
                    textView.setTextAppearance(context, f3);
                }
            }
            int f4 = a2.f(j.ActionBar_subtitleTextStyle, 0);
            if (f4 != 0) {
                Toolbar toolbar4 = this.f3010a;
                Context context2 = toolbar4.getContext();
                toolbar4.o = f4;
                TextView textView2 = toolbar4.f2342e;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, f4);
                }
            }
            int f5 = a2.f(j.ActionBar_popupTheme, 0);
            if (f5 != 0) {
                this.f3010a.setPopupTheme(f5);
            }
        } else {
            if (this.f3010a.getNavigationIcon() != null) {
                i2 = 15;
                this.q = this.f3010a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        a2.b.recycle();
        if (i3 != this.p) {
            this.p = i3;
            if (TextUtils.isEmpty(this.f3010a.getNavigationContentDescription())) {
                int i4 = this.p;
                this.k = i4 != 0 ? j().getString(i4) : str;
                o();
            }
        }
        this.k = this.f3010a.getNavigationContentDescription();
        this.f3010a.setNavigationOnClickListener(new v0(this));
    }

    @Override // d.b.o.a0
    public void a(int i2) {
        this.f3010a.setVisibility(i2);
    }

    @Override // d.b.o.a0
    public void a(m0 m0Var) {
        Toolbar toolbar;
        View view = this.f3011c;
        if (view != null && view.getParent() == (toolbar = this.f3010a)) {
            toolbar.removeView(this.f3011c);
        }
        this.f3011c = m0Var;
        if (m0Var != null && this.o == 2) {
            this.f3010a.addView(m0Var, 0);
            Toolbar.d dVar = (Toolbar.d) this.f3011c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) dVar).width = -2;
            ((ViewGroup.MarginLayoutParams) dVar).height = -2;
            dVar.f2648a = 8388691;
            m0Var.setAllowCollapse(true);
        }
    }

    @Override // d.b.o.a0
    public void a(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // d.b.o.a0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f3010a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f2340c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            d.b.o.c r0 = r0.v
            if (r0 == 0) goto L_0x001e
            d.b.o.c$c r3 = r0.y
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.w0.a():boolean");
    }

    @Override // d.b.o.a0
    public void b(int i2) {
        this.f3014f = i2 != 0 ? d.b.l.a.a.c(j(), i2) : null;
        q();
    }

    @Override // d.b.o.a0
    public void b(boolean z) {
        this.f3010a.setCollapsible(z);
    }

    @Override // d.b.o.a0
    public boolean b() {
        return this.f3010a.e();
    }

    @Override // d.b.o.a0
    public void c(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    o();
                }
                p();
            }
            if ((i3 & 3) != 0) {
                q();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f3010a.setTitle(this.i);
                    toolbar = this.f3010a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f3010a.setTitle((CharSequence) null);
                    toolbar = this.f3010a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f3012d) != null) {
                if ((i2 & 16) != 0) {
                    this.f3010a.addView(view);
                } else {
                    this.f3010a.removeView(view);
                }
            }
        }
    }

    @Override // d.b.o.a0
    public boolean c() {
        ActionMenuView actionMenuView = this.f3010a.f2340c;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.v;
        if (cVar != null && cVar.c()) {
            return true;
        }
        return false;
    }

    @Override // d.b.o.a0
    public void collapseActionView() {
        Toolbar.c cVar = this.f3010a.M;
        d.b.n.i.j jVar = cVar == null ? null : cVar.f2349d;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @Override // d.b.o.a0
    public boolean d() {
        return this.f3010a.f();
    }

    @Override // d.b.o.a0
    public void e() {
        this.m = true;
    }

    @Override // d.b.o.a0
    public boolean f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f3010a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f2340c) != null && actionMenuView.u;
    }

    @Override // d.b.o.a0
    public void g() {
        c cVar;
        ActionMenuView actionMenuView = this.f3010a.f2340c;
        if (actionMenuView != null && (cVar = actionMenuView.v) != null) {
            cVar.a();
        }
    }

    @Override // d.b.o.a0
    public CharSequence getTitle() {
        return this.f3010a.getTitle();
    }

    @Override // d.b.o.a0
    public int h() {
        return this.b;
    }

    @Override // d.b.o.a0
    public ViewGroup i() {
        return this.f3010a;
    }

    @Override // d.b.o.a0
    public Context j() {
        return this.f3010a.getContext();
    }

    @Override // d.b.o.a0
    public int k() {
        return this.o;
    }

    @Override // d.b.o.a0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // d.b.o.a0
    public boolean m() {
        Toolbar.c cVar = this.f3010a.M;
        return (cVar == null || cVar.f2349d == null) ? false : true;
    }

    @Override // d.b.o.a0
    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void o() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f3010a.setNavigationContentDescription(this.p);
        } else {
            this.f3010a.setNavigationContentDescription(this.k);
        }
    }

    public final void p() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.f3010a;
            drawable = this.f3015g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f3010a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void q() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f3014f) == null) {
            drawable = this.f3013e;
        }
        this.f3010a.setLogo(drawable);
    }

    @Override // d.b.o.a0
    public void setIcon(int i2) {
        this.f3013e = i2 != 0 ? d.b.l.a.a.c(j(), i2) : null;
        q();
    }

    @Override // d.b.o.a0
    public void setIcon(Drawable drawable) {
        this.f3013e = drawable;
        q();
    }

    @Override // d.b.o.a0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // d.b.o.a0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f3016h) {
            this.i = charSequence;
            if ((this.b & 8) != 0) {
                this.f3010a.setTitle(charSequence);
            }
        }
    }

    @Override // d.b.o.a0
    public void a(Menu menu, o.a aVar) {
        d.b.n.i.j jVar;
        if (this.n == null) {
            this.n = new c(this.f3010a.getContext());
        }
        c cVar = this.n;
        cVar.f2785g = aVar;
        Toolbar toolbar = this.f3010a;
        d.b.n.i.h hVar = (d.b.n.i.h) menu;
        if (hVar != null || toolbar.f2340c != null) {
            toolbar.c();
            d.b.n.i.h hVar2 = toolbar.f2340c.r;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.a(toolbar.L);
                    hVar2.a(toolbar.M);
                }
                if (toolbar.M == null) {
                    toolbar.M = new Toolbar.c();
                }
                cVar.s = true;
                if (hVar != null) {
                    hVar.a(cVar, toolbar.l);
                    hVar.a(toolbar.M, toolbar.l);
                } else {
                    cVar.a(toolbar.l, (d.b.n.i.h) null);
                    Toolbar.c cVar2 = toolbar.M;
                    d.b.n.i.h hVar3 = cVar2.f2348c;
                    if (!(hVar3 == null || (jVar = cVar2.f2349d) == null)) {
                        hVar3.a(jVar);
                    }
                    cVar2.f2348c = null;
                    cVar.a(true);
                    toolbar.M.a(true);
                }
                toolbar.f2340c.setPopupTheme(toolbar.m);
                toolbar.f2340c.setPresenter(cVar);
                toolbar.L = cVar;
            }
        }
    }

    @Override // d.b.o.a0
    public u a(int i2, long j2) {
        u a2 = p.a(this.f3010a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a aVar = new a(i2);
        View view = a2.f3355a.get();
        if (view != null) {
            a2.a(view, aVar);
        }
        return a2;
    }
}

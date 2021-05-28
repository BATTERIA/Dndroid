package d.b.k;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import d.b.j;
import d.b.n.a;
import d.b.n.i.h;
import d.b.n.i.o;
import d.b.o.a1;
import d.b.o.d0;
import d.b.o.z;
import d.g.l.p;
import d.g.l.u;
import d.g.l.v;
import d.g.l.w;
import java.lang.Thread;
import java.util.List;

public class k extends j implements h.a, LayoutInflater.Factory2 {
    public static final boolean T;
    public static final int[] U = {16842836};
    public static boolean V = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public h[] F;
    public h G;
    public boolean H;
    public boolean I;
    public int J = -100;
    public boolean K;
    public f L;
    public boolean M;
    public int N;
    public final Runnable O = new b();
    public boolean P;
    public Rect Q;
    public Rect R;
    public AppCompatViewInflater S;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2660c;

    /* renamed from: d  reason: collision with root package name */
    public final Window f2661d;

    /* renamed from: e  reason: collision with root package name */
    public final Window.Callback f2662e;

    /* renamed from: f  reason: collision with root package name */
    public final Window.Callback f2663f;

    /* renamed from: g  reason: collision with root package name */
    public final i f2664g;

    /* renamed from: h  reason: collision with root package name */
    public a f2665h;
    public MenuInflater i;
    public CharSequence j;
    public z k;
    public c l;
    public i m;
    public d.b.n.a n;
    public ActionBarContextView o;
    public PopupWindow p;
    public Runnable q;
    public u r = null;
    public boolean s = true;
    public boolean t;
    public ViewGroup u;
    public TextView v;
    public View w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f2666a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2666a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f2666a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f2666a.uncaughtException(thread, th);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            k kVar = k.this;
            if ((kVar.N & 1) != 0) {
                kVar.c(0);
            }
            k kVar2 = k.this;
            if ((kVar2.N & 4096) != 0) {
                kVar2.c(j.AppCompatTheme_tooltipForegroundColor);
            }
            k kVar3 = k.this;
            kVar3.M = false;
            kVar3.N = 0;
        }
    }

    public final class c implements o.a {
        public c() {
        }

        @Override // d.b.n.i.o.a
        public void a(d.b.n.i.h hVar, boolean z) {
            k.this.b(hVar);
        }

        @Override // d.b.n.i.o.a
        public boolean a(d.b.n.i.h hVar) {
            Window.Callback g2 = k.this.g();
            if (g2 == null) {
                return true;
            }
            g2.onMenuOpened(j.AppCompatTheme_tooltipForegroundColor, hVar);
            return true;
        }
    }

    public class d implements a.AbstractC0090a {

        /* renamed from: a  reason: collision with root package name */
        public a.AbstractC0090a f2669a;

        public class a extends w {
            public a() {
            }

            @Override // d.g.l.v
            public void a(View view) {
                k.this.o.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.o.getParent() instanceof View) {
                    p.u((View) k.this.o.getParent());
                }
                k.this.o.removeAllViews();
                k.this.r.a((v) null);
                k.this.r = null;
            }
        }

        public d(a.AbstractC0090a aVar) {
            this.f2669a = aVar;
        }

        @Override // d.b.n.a.AbstractC0090a
        public void a(d.b.n.a aVar) {
            this.f2669a.a(aVar);
            k kVar = k.this;
            if (kVar.p != null) {
                kVar.f2661d.getDecorView().removeCallbacks(k.this.q);
            }
            k kVar2 = k.this;
            if (kVar2.o != null) {
                kVar2.d();
                k kVar3 = k.this;
                u a2 = p.a(kVar3.o);
                a2.a(0.0f);
                kVar3.r = a2;
                u uVar = k.this.r;
                a aVar2 = new a();
                View view = uVar.f3355a.get();
                if (view != null) {
                    uVar.a(view, aVar2);
                }
            }
            k kVar4 = k.this;
            i iVar = kVar4.f2664g;
            if (iVar != null) {
                iVar.b(kVar4.n);
            }
            k.this.n = null;
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean a(d.b.n.a aVar, Menu menu) {
            return this.f2669a.a(aVar, menu);
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean a(d.b.n.a aVar, MenuItem menuItem) {
            return this.f2669a.a(aVar, menuItem);
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean b(d.b.n.a aVar, Menu menu) {
            return this.f2669a.b(aVar, menu);
        }
    }

    public final class f {

        /* renamed from: a  reason: collision with root package name */
        public t f2672a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public BroadcastReceiver f2673c;

        /* renamed from: d  reason: collision with root package name */
        public IntentFilter f2674d;

        public f(t tVar) {
            this.f2672a = tVar;
            this.b = tVar.a();
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f2673c;
            if (broadcastReceiver != null) {
                k.this.f2660c.unregisterReceiver(broadcastReceiver);
                this.f2673c = null;
            }
        }
    }

    public class g extends ContentFrameLayout {
        public g(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    k kVar = k.this;
                    kVar.a(kVar.d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(d.b.l.a.a.c(getContext(), i));
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public int f2676a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2677c;

        /* renamed from: d  reason: collision with root package name */
        public int f2678d;

        /* renamed from: e  reason: collision with root package name */
        public int f2679e;

        /* renamed from: f  reason: collision with root package name */
        public int f2680f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f2681g;

        /* renamed from: h  reason: collision with root package name */
        public View f2682h;
        public View i;
        public d.b.n.i.h j;
        public d.b.n.i.f k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public h(int i2) {
            this.f2676a = i2;
        }

        public void a(d.b.n.i.h hVar) {
            d.b.n.i.f fVar;
            d.b.n.i.h hVar2 = this.j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.a(this.k);
                }
                this.j = hVar;
                if (hVar != null && (fVar = this.k) != null) {
                    hVar.a(fVar, hVar.f2818a);
                }
            }
        }
    }

    public final class i implements o.a {
        public i() {
        }

        @Override // d.b.n.i.o.a
        public void a(d.b.n.i.h hVar, boolean z) {
            d.b.n.i.h c2 = hVar.c();
            boolean z2 = c2 != hVar;
            k kVar = k.this;
            if (z2) {
                hVar = c2;
            }
            h a2 = kVar.a((Menu) hVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                k.this.a(a2.f2676a, a2, c2);
                k.this.a(a2, true);
                return;
            }
            k.this.a(a2, z);
        }

        @Override // d.b.n.i.o.a
        public boolean a(d.b.n.i.h hVar) {
            Window.Callback g2;
            if (hVar != null) {
                return true;
            }
            k kVar = k.this;
            if (!kVar.z || (g2 = kVar.g()) == null || k.this.I) {
                return true;
            }
            g2.onMenuOpened(j.AppCompatTheme_tooltipForegroundColor, hVar);
            return true;
        }
    }

    static {
        boolean z2 = Build.VERSION.SDK_INT < 21;
        T = z2;
        if (z2 && !V) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public k(Context context, Window window, i iVar) {
        int resourceId;
        Drawable drawable = null;
        this.f2660c = context;
        this.f2661d = window;
        this.f2664g = iVar;
        Window.Callback callback = window.getCallback();
        this.f2662e = callback;
        if (!(callback instanceof e)) {
            e eVar = new e(callback);
            this.f2663f = eVar;
            this.f2661d.setCallback(eVar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, U);
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = d.b.o.i.a().a(context, resourceId, true);
            }
            if (drawable != null) {
                this.f2661d.setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public h a(Menu menu) {
        h[] hVarArr = this.F;
        int length = hVarArr != null ? hVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            h hVar = hVarArr[i2];
            if (hVar != null && hVar.j == menu) {
                return hVar;
            }
        }
        return null;
    }

    public void a(int i2, h hVar, Menu menu) {
        if (menu == null) {
            if (hVar == null && i2 >= 0) {
                h[] hVarArr = this.F;
                if (i2 < hVarArr.length) {
                    hVar = hVarArr[i2];
                }
            }
            if (hVar != null) {
                menu = hVar.j;
            }
        }
        if ((hVar == null || hVar.o) && !this.I) {
            this.f2662e.onPanelClosed(i2, menu);
        }
    }

    @Override // d.b.k.j
    public void a(View view) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2662e.onContentChanged();
    }

    @Override // d.b.k.j
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2662e.onContentChanged();
    }

    public void a(h hVar, boolean z2) {
        ViewGroup viewGroup;
        z zVar;
        if (!z2 || hVar.f2676a != 0 || (zVar = this.k) == null || !zVar.b()) {
            WindowManager windowManager = (WindowManager) this.f2660c.getSystemService("window");
            if (!(windowManager == null || !hVar.o || (viewGroup = hVar.f2681g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(hVar.f2676a, hVar, null);
                }
            }
            hVar.m = false;
            hVar.n = false;
            hVar.o = false;
            hVar.f2682h = null;
            hVar.q = true;
            if (this.G == hVar) {
                this.G = null;
                return;
            }
            return;
        }
        b(hVar.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if ((r3.getPackageManager().getActivityInfo(new android.content.ComponentName(r11.f2660c, r11.f2660c.getClass()), 0).configChanges & 512) == 0) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    @Override // d.b.k.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.a():boolean");
    }

    public final boolean a(h hVar, int i2, KeyEvent keyEvent, int i3) {
        d.b.n.i.h hVar2;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((hVar.m || b(hVar, keyEvent)) && (hVar2 = hVar.j) != null) {
            z2 = hVar2.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.k == null) {
            a(hVar, true);
        }
        return z2;
    }

    @Override // d.b.n.i.h.a
    public boolean a(d.b.n.i.h hVar, MenuItem menuItem) {
        h a2;
        Window.Callback g2 = g();
        if (g2 == null || this.I || (a2 = a((Menu) hVar.c())) == null) {
            return false;
        }
        return g2.onMenuItemSelected(a2.f2676a, menuItem);
    }

    @Override // d.b.k.j
    public void b() {
        LayoutInflater from = LayoutInflater.from(this.f2660c);
        if (from.getFactory() == null) {
            c.a.a.a.a.b(from, this);
        } else if (!(from.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // d.b.k.j
    public void b(int i2) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2660c).inflate(i2, viewGroup);
        this.f2662e.onContentChanged();
    }

    public void b(d.b.n.i.h hVar) {
        if (!this.E) {
            this.E = true;
            this.k.g();
            Window.Callback g2 = g();
            if (g2 != null && !this.I) {
                g2.onPanelClosed(j.AppCompatTheme_tooltipForegroundColor, hVar);
            }
            this.E = false;
        }
    }

    public final boolean b(h hVar, KeyEvent keyEvent) {
        z zVar;
        z zVar2;
        Resources.Theme theme;
        z zVar3;
        if (this.I) {
            return false;
        }
        if (hVar.m) {
            return true;
        }
        h hVar2 = this.G;
        if (!(hVar2 == null || hVar2 == hVar)) {
            a(hVar2, false);
        }
        Window.Callback g2 = g();
        if (g2 != null) {
            hVar.i = g2.onCreatePanelView(hVar.f2676a);
        }
        int i2 = hVar.f2676a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (zVar3 = this.k) != null) {
            zVar3.e();
        }
        if (hVar.i == null) {
            if (hVar.j == null || hVar.r) {
                if (hVar.j == null) {
                    Context context = this.f2660c;
                    int i3 = hVar.f2676a;
                    if ((i3 == 0 || i3 == 108) && this.k != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(d.b.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(d.b.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(d.b.a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            d.b.n.c cVar = new d.b.n.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    d.b.n.i.h hVar3 = new d.b.n.i.h(context);
                    hVar3.f2821e = this;
                    hVar.a(hVar3);
                    if (hVar.j == null) {
                        return false;
                    }
                }
                if (z2 && this.k != null) {
                    if (this.l == null) {
                        this.l = new c();
                    }
                    this.k.a(hVar.j, this.l);
                }
                hVar.j.j();
                if (!g2.onCreatePanelMenu(hVar.f2676a, hVar.j)) {
                    hVar.a(null);
                    if (z2 && (zVar2 = this.k) != null) {
                        zVar2.a(null, this.l);
                    }
                    return false;
                }
                hVar.r = false;
            }
            hVar.j.j();
            Bundle bundle = hVar.s;
            if (bundle != null) {
                hVar.j.a(bundle);
                hVar.s = null;
            }
            if (!g2.onPreparePanel(0, hVar.i, hVar.j)) {
                if (z2 && (zVar = this.k) != null) {
                    zVar.a(null, this.l);
                }
                hVar.j.i();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            hVar.p = z3;
            hVar.j.setQwertyMode(z3);
            hVar.j.i();
        }
        hVar.m = true;
        hVar.n = false;
        this.G = hVar;
        return true;
    }

    @Override // d.b.k.j
    public void c() {
        h();
        a aVar = this.f2665h;
        e(0);
    }

    public void c(int i2) {
        h d2;
        h d3 = d(i2);
        if (d3.j != null) {
            Bundle bundle = new Bundle();
            d3.j.b(bundle);
            if (bundle.size() > 0) {
                d3.s = bundle;
            }
            d3.j.j();
            d3.j.clear();
        }
        d3.r = true;
        d3.q = true;
        if ((i2 == 108 || i2 == 0) && this.k != null && (d2 = d(0)) != null) {
            d2.m = false;
            b(d2, null);
        }
    }

    public h d(int i2) {
        h[] hVarArr = this.F;
        if (hVarArr == null || hVarArr.length <= i2) {
            h[] hVarArr2 = new h[(i2 + 1)];
            if (hVarArr != null) {
                System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
            }
            this.F = hVarArr2;
            hVarArr = hVarArr2;
        }
        h hVar = hVarArr[i2];
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(i2);
        hVarArr[i2] = hVar2;
        return hVar2;
    }

    public void d() {
        u uVar = this.r;
        if (uVar != null) {
            uVar.a();
        }
    }

    public final void e() {
        if (this.L == null) {
            Context context = this.f2660c;
            if (t.f2697d == null) {
                Context applicationContext = context.getApplicationContext();
                t.f2697d = new t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.L = new f(t.f2697d);
        }
    }

    public final void e(int i2) {
        this.N = (1 << i2) | this.N;
        if (!this.M) {
            p.a(this.f2661d.getDecorView(), this.O);
            this.M = true;
        }
    }

    public int f(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.o;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            boolean z4 = true;
            if (this.o.isShown()) {
                if (this.Q == null) {
                    this.Q = new Rect();
                    this.R = new Rect();
                }
                Rect rect = this.Q;
                Rect rect2 = this.R;
                rect.set(0, i2, 0, 0);
                a1.a(this.u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.w;
                    if (view == null) {
                        View view2 = new View(this.f2660c);
                        this.w = view2;
                        view2.setBackgroundColor(this.f2660c.getResources().getColor(d.b.c.abc_input_method_navigation_guard));
                        this.u.addView(this.w, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.w.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.w == null) {
                    z4 = false;
                }
                if (!this.B && z4) {
                    i2 = 0;
                }
                z4 = z3;
                z2 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.w;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    public final void f() {
        ViewGroup viewGroup;
        if (!this.t) {
            TypedArray obtainStyledAttributes = this.f2660c.obtainStyledAttributes(j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(j.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(j.AppCompatTheme_windowNoTitle, false)) {
                    a(1);
                } else if (obtainStyledAttributes.getBoolean(j.AppCompatTheme_windowActionBar, false)) {
                    a(j.AppCompatTheme_tooltipForegroundColor);
                }
                if (obtainStyledAttributes.getBoolean(j.AppCompatTheme_windowActionBarOverlay, false)) {
                    a(j.AppCompatTheme_tooltipFrameBackground);
                }
                if (obtainStyledAttributes.getBoolean(j.AppCompatTheme_windowActionModeOverlay, false)) {
                    a(10);
                }
                this.C = obtainStyledAttributes.getBoolean(j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                this.f2661d.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f2660c);
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(this.B ? d.b.g.abc_screen_simple_overlay_action_mode : d.b.g.abc_screen_simple, (ViewGroup) null);
                    if (Build.VERSION.SDK_INT >= 21) {
                        p.a(viewGroup, new l(this));
                    } else {
                        ((d0) viewGroup).setOnFitSystemWindowsListener(new m(this));
                    }
                } else if (this.C) {
                    viewGroup = (ViewGroup) from.inflate(d.b.g.abc_dialog_title_material, (ViewGroup) null);
                    this.A = false;
                    this.z = false;
                } else if (this.z) {
                    TypedValue typedValue = new TypedValue();
                    this.f2660c.getTheme().resolveAttribute(d.b.a.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new d.b.n.c(this.f2660c, typedValue.resourceId) : this.f2660c).inflate(d.b.g.abc_screen_toolbar, (ViewGroup) null);
                    z zVar = (z) viewGroup.findViewById(d.b.f.decor_content_parent);
                    this.k = zVar;
                    zVar.setWindowCallback(g());
                    if (this.A) {
                        this.k.a(j.AppCompatTheme_tooltipFrameBackground);
                    }
                    if (this.x) {
                        this.k.a(2);
                    }
                    if (this.y) {
                        this.k.a(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (this.k == null) {
                        this.v = (TextView) viewGroup.findViewById(d.b.f.title);
                    }
                    a1.b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d.b.f.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2661d.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f2661d.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new n(this));
                    this.u = viewGroup;
                    Window.Callback callback = this.f2662e;
                    CharSequence title = callback instanceof Activity ? ((Activity) callback).getTitle() : this.j;
                    if (!TextUtils.isEmpty(title)) {
                        z zVar2 = this.k;
                        if (zVar2 != null) {
                            zVar2.setWindowTitle(title);
                        } else {
                            a aVar = this.f2665h;
                            if (aVar != null) {
                                aVar.a(title);
                            } else {
                                TextView textView = this.v;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u.findViewById(16908290);
                    View decorView = this.f2661d.getDecorView();
                    contentFrameLayout2.i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (p.q(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f2660c.obtainStyledAttributes(j.AppCompatTheme);
                    obtainStyledAttributes2.getValue(j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(j.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(j.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(j.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(j.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.t = true;
                    h d2 = d(0);
                    if (this.I) {
                        return;
                    }
                    if (d2 == null || d2.j == null) {
                        e(j.AppCompatTheme_tooltipForegroundColor);
                        return;
                    }
                    return;
                }
                StringBuilder a2 = e.a.a.a.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a2.append(this.z);
                a2.append(", windowActionBarOverlay: ");
                a2.append(this.A);
                a2.append(", android:windowIsFloating: ");
                a2.append(this.C);
                a2.append(", windowActionModeOverlay: ");
                a2.append(this.B);
                a2.append(", windowNoTitle: ");
                a2.append(this.D);
                a2.append(" }");
                throw new IllegalArgumentException(a2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final Window.Callback g() {
        return this.f2661d.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r3 = this;
            r3.f()
            boolean r0 = r3.z
            if (r0 == 0) goto L_0x0037
            d.b.k.a r0 = r3.f2665h
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            android.view.Window$Callback r0 = r3.f2662e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            d.b.k.u r0 = new d.b.k.u
            android.view.Window$Callback r1 = r3.f2662e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f2665h = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            d.b.k.u r0 = new d.b.k.u
            android.view.Window$Callback r1 = r3.f2662e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            d.b.k.a r0 = r3.f2665h
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.P
            r0.b(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.h():void");
    }

    public final boolean i() {
        ViewGroup viewGroup;
        return this.t && (viewGroup = this.u) != null && p.q(viewGroup);
    }

    public final void j() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.appcompat.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r12).getDepth() > 1) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        if (r0 != r4) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
        // Method dump skipped, instructions count: 690
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public class e extends d.b.n.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
            // Method dump skipped, instructions count: 443
            */
            throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || this.f2773c.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f2773c
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                d.b.k.k r0 = d.b.k.k.this
                int r3 = r6.getKeyCode()
                r0.h()
                d.b.k.a r4 = r0.f2665h
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.a(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = 1
                goto L_0x004d
            L_0x001f:
                d.b.k.k$h r3 = r0.G
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.a(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                d.b.k.k$h r6 = r0.G
                if (r6 == 0) goto L_0x001d
                r6.n = r2
                goto L_0x001d
            L_0x0034:
                d.b.k.k$h r3 = r0.G
                if (r3 != 0) goto L_0x004c
                d.b.k.k$h r3 = r0.d(r1)
                r0.b(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.a(r3, r4, r6, r2)
                r3.m = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = 0
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = 1
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof d.b.n.i.h)) {
                return this.f2773c.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f2773c.onMenuOpened(i, menu);
            k kVar = k.this;
            if (kVar != null) {
                if (i == 108) {
                    kVar.h();
                    a aVar = kVar.f2665h;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                return true;
            }
            throw null;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f2773c.onPanelClosed(i, menu);
            k kVar = k.this;
            if (kVar == null) {
                throw null;
            } else if (i == 108) {
                kVar.h();
                a aVar = kVar.f2665h;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i == 0) {
                h d2 = kVar.d(i);
                if (d2.o) {
                    kVar.a(d2, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            d.b.n.i.h hVar = menu instanceof d.b.n.i.h ? (d.b.n.i.h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.y = true;
            }
            boolean onPreparePanel = this.f2773c.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.y = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            d.b.n.i.h hVar;
            h d2 = k.this.d(0);
            if (d2 == null || (hVar = d2.j) == null) {
                this.f2773c.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                this.f2773c.onProvideKeyboardShortcuts(list, hVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (k.this.s) {
                return a(callback);
            }
            return this.f2773c.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!k.this.s || i != 0) {
                return this.f2773c.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.a(android.view.KeyEvent):boolean");
    }

    @Override // d.b.k.j
    public void a(Bundle bundle) {
        Window.Callback callback = this.f2662e;
        if (callback instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) callback;
                try {
                    str = c.a.a.a.a.b(activity, activity.getComponentName());
                    if (str != null) {
                        a aVar = this.f2665h;
                        if (aVar == null) {
                            this.P = true;
                        } else {
                            aVar.b(true);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (bundle != null && this.J == -100) {
            this.J = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // d.b.n.i.h.a
    public void a(d.b.n.i.h hVar) {
        z zVar = this.k;
        if (zVar == null || !zVar.f() || (ViewConfiguration.get(this.f2660c).hasPermanentMenuKey() && !this.k.a())) {
            h d2 = d(0);
            d2.q = true;
            a(d2, false);
            a(d2, (KeyEvent) null);
            return;
        }
        Window.Callback g2 = g();
        if (this.k.b()) {
            this.k.c();
            if (!this.I) {
                g2.onPanelClosed(j.AppCompatTheme_tooltipForegroundColor, d(0).j);
            }
        } else if (g2 != null && !this.I) {
            if (this.M && (1 & this.N) != 0) {
                this.f2661d.getDecorView().removeCallbacks(this.O);
                this.O.run();
            }
            h d3 = d(0);
            d.b.n.i.h hVar2 = d3.j;
            if (hVar2 != null && !d3.r && g2.onPreparePanel(0, d3.i, hVar2)) {
                g2.onMenuOpened(j.AppCompatTheme_tooltipForegroundColor, d3.j);
                this.k.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        if (r4 != null) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d.b.k.k.h r13, android.view.KeyEvent r14) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.k.a(d.b.k.k$h, android.view.KeyEvent):void");
    }

    @Override // d.b.k.j
    public boolean a(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = j.AppCompatTheme_tooltipForegroundColor;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = j.AppCompatTheme_tooltipFrameBackground;
        }
        if (this.D && i2 == 108) {
            return false;
        }
        if (this.z && i2 == 1) {
            this.z = false;
        }
        if (i2 == 1) {
            j();
            this.D = true;
            return true;
        } else if (i2 == 2) {
            j();
            this.x = true;
            return true;
        } else if (i2 == 5) {
            j();
            this.y = true;
            return true;
        } else if (i2 == 10) {
            j();
            this.B = true;
            return true;
        } else if (i2 == 108) {
            j();
            this.z = true;
            return true;
        } else if (i2 != 109) {
            return this.f2661d.requestFeature(i2);
        } else {
            j();
            this.A = true;
            return true;
        }
    }

    @Override // d.b.k.j
    public final void a(CharSequence charSequence) {
        this.j = charSequence;
        z zVar = this.k;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f2665h;
        if (aVar != null) {
            aVar.a(charSequence);
            return;
        }
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

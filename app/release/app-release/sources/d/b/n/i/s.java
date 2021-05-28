package d.b.n.i;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import d.b.d;
import d.b.g;
import d.b.n.i.o;
import d.b.o.j0;

public final class s extends m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o, View.OnKeyListener {
    public static final int x = g.abc_popup_menu_item_layout;

    /* renamed from: d  reason: collision with root package name */
    public final Context f2849d;

    /* renamed from: e  reason: collision with root package name */
    public final h f2850e;

    /* renamed from: f  reason: collision with root package name */
    public final g f2851f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2852g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2853h;
    public final int i;
    public final int j;
    public final j0 k;
    public final ViewTreeObserver.OnGlobalLayoutListener l = new a();
    public final View.OnAttachStateChangeListener m = new b();
    public PopupWindow.OnDismissListener n;
    public View o;
    public View p;
    public o.a q;
    public ViewTreeObserver r;
    public boolean s;
    public boolean t;
    public int u;
    public int v = 0;
    public boolean w;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (s.this.c()) {
                s sVar = s.this;
                if (!sVar.k.C) {
                    View view = sVar.p;
                    if (view == null || !view.isShown()) {
                        s.this.dismiss();
                    } else {
                        s.this.k.a();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = s.this.r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    s.this.r = view.getViewTreeObserver();
                }
                s sVar = s.this;
                sVar.r.removeGlobalOnLayoutListener(sVar.l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public s(Context context, h hVar, View view, int i2, int i3, boolean z) {
        this.f2849d = context;
        this.f2850e = hVar;
        this.f2852g = z;
        this.f2851f = new g(hVar, LayoutInflater.from(context), this.f2852g, x);
        this.i = i2;
        this.j = i3;
        Resources resources = context.getResources();
        this.f2853h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.o = view;
        this.k = new j0(this.f2849d, null, this.i, this.j);
        hVar.a(this, context);
    }

    @Override // d.b.n.i.m
    public void a(int i2) {
        this.v = i2;
    }

    @Override // d.b.n.i.m
    public void a(View view) {
        this.o = view;
    }

    @Override // d.b.n.i.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    @Override // d.b.n.i.m
    public void a(h hVar) {
    }

    @Override // d.b.n.i.o
    public void a(h hVar, boolean z) {
        if (hVar == this.f2850e) {
            dismiss();
            o.a aVar = this.q;
            if (aVar != null) {
                aVar.a(hVar, z);
            }
        }
    }

    @Override // d.b.n.i.o
    public void a(o.a aVar) {
        this.q = aVar;
    }

    @Override // d.b.n.i.o
    public void a(boolean z) {
        this.t = false;
        g gVar = this.f2851f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    @Override // d.b.n.i.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(d.b.n.i.t r10) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.n.i.s.a(d.b.n.i.t):boolean");
    }

    @Override // d.b.n.i.m
    public void b(boolean z) {
        this.f2851f.f2814e = z;
    }

    @Override // d.b.n.i.o
    public boolean b() {
        return false;
    }

    @Override // d.b.n.i.m
    public void c(int i2) {
        j0 j0Var = this.k;
        j0Var.i = i2;
        j0Var.k = true;
    }

    @Override // d.b.n.i.m
    public void c(boolean z) {
        this.w = z;
    }

    @Override // d.b.n.i.r
    public boolean c() {
        return !this.s && this.k.c();
    }

    @Override // d.b.n.i.r
    public ListView d() {
        return this.k.f2914e;
    }

    @Override // d.b.n.i.r
    public void dismiss() {
        if (c()) {
            this.k.dismiss();
        }
    }

    public void onDismiss() {
        this.s = true;
        this.f2850e.a(true);
        ViewTreeObserver viewTreeObserver = this.r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r = this.p.getViewTreeObserver();
            }
            this.r.removeGlobalOnLayoutListener(this.l);
            this.r = null;
        }
        this.p.removeOnAttachStateChangeListener(this.m);
        PopupWindow.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // d.b.n.i.m
    public void b(int i2) {
        this.k.f2917h = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    @Override // d.b.n.i.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.n.i.s.a():void");
    }
}

package d.b.n.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import d.b.g;
import d.b.n.i.o;
import d.b.o.i0;
import d.b.o.j0;
import d.g.l.p;
import java.util.ArrayList;
import java.util.List;

public final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int D = g.abc_cascading_menu_item_layout;
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* renamed from: d  reason: collision with root package name */
    public final Context f2790d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2791e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2792f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2793g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2794h;
    public final Handler i;
    public final List<h> j = new ArrayList();
    public final List<d> k = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener l = new a();
    public final View.OnAttachStateChangeListener m = new b();
    public final i0 n = new c();
    public int o;
    public int p;
    public View q;
    public View r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public o.a z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (e.this.c() && e.this.k.size() > 0 && !e.this.k.get(0).f2802a.C) {
                View view = e.this.r;
                if (view == null || !view.isShown()) {
                    e.this.dismiss();
                    return;
                }
                for (d dVar : e.this.k) {
                    dVar.f2802a.a();
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
            ViewTreeObserver viewTreeObserver = e.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.A = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.A.removeGlobalOnLayoutListener(eVar.l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements i0 {

        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d f2798c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ MenuItem f2799d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ h f2800e;

            public a(d dVar, MenuItem menuItem, h hVar) {
                this.f2798c = dVar;
                this.f2799d = menuItem;
                this.f2800e = hVar;
            }

            public void run() {
                d dVar = this.f2798c;
                if (dVar != null) {
                    e.this.C = true;
                    dVar.b.a(false);
                    e.this.C = false;
                }
                if (this.f2799d.isEnabled() && this.f2799d.hasSubMenu()) {
                    this.f2800e.a(this.f2799d, 4);
                }
            }
        }

        public c() {
        }

        @Override // d.b.o.i0
        public void a(h hVar, MenuItem menuItem) {
            d dVar = null;
            e.this.i.removeCallbacksAndMessages(null);
            int size = e.this.k.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == e.this.k.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < e.this.k.size()) {
                    dVar = e.this.k.get(i2);
                }
                e.this.i.postAtTime(new a(dVar, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // d.b.o.i0
        public void b(h hVar, MenuItem menuItem) {
            e.this.i.removeCallbacksAndMessages(hVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f2802a;
        public final h b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2803c;

        public d(j0 j0Var, h hVar, int i) {
            this.f2802a = j0Var;
            this.b = hVar;
            this.f2803c = i;
        }
    }

    public e(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.o = 0;
        this.p = 0;
        this.f2790d = context;
        this.q = view;
        this.f2792f = i2;
        this.f2793g = i3;
        this.f2794h = z2;
        this.x = false;
        this.s = p.h(view) != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f2791e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.b.d.abc_config_prefDialogWidth));
        this.i = new Handler();
    }

    @Override // d.b.n.i.r
    public void a() {
        if (!c()) {
            for (h hVar : this.j) {
                c(hVar);
            }
            this.j.clear();
            View view = this.q;
            this.r = view;
            if (view != null) {
                boolean z2 = this.A == null;
                ViewTreeObserver viewTreeObserver = this.r.getViewTreeObserver();
                this.A = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.l);
                }
                this.r.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    @Override // d.b.n.i.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // d.b.n.i.m
    public void a(h hVar) {
        hVar.a(this, this.f2790d);
        if (c()) {
            c(hVar);
        } else {
            this.j.add(hVar);
        }
    }

    @Override // d.b.n.i.o
    public void a(h hVar, boolean z2) {
        int i2;
        int size = this.k.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (hVar == this.k.get(i3).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.k.size()) {
                this.k.get(i4).b.a(false);
            }
            d remove = this.k.remove(i3);
            remove.b.a(this);
            if (this.C) {
                j0 j0Var = remove.f2802a;
                if (j0Var != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        j0Var.D.setExitTransition(null);
                    }
                    remove.f2802a.D.setAnimationStyle(0);
                } else {
                    throw null;
                }
            }
            remove.f2802a.dismiss();
            int size2 = this.k.size();
            if (size2 > 0) {
                i2 = this.k.get(size2 - 1).f2803c;
            } else {
                i2 = p.h(this.q) == 1 ? 0 : 1;
            }
            this.s = i2;
            if (size2 == 0) {
                dismiss();
                o.a aVar = this.z;
                if (aVar != null) {
                    aVar.a(hVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.A.removeGlobalOnLayoutListener(this.l);
                    }
                    this.A = null;
                }
                this.r.removeOnAttachStateChangeListener(this.m);
                this.B.onDismiss();
            } else if (z2) {
                this.k.get(0).b.a(false);
            }
        }
    }

    @Override // d.b.n.i.o
    public void a(o.a aVar) {
        this.z = aVar;
    }

    @Override // d.b.n.i.m
    public void b(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // d.b.n.i.m
    public void b(boolean z2) {
        this.x = z2;
    }

    @Override // d.b.n.i.o
    public boolean b() {
        return false;
    }

    @Override // d.b.n.i.m
    public void c(int i2) {
        this.u = true;
        this.w = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        if ((r11[0] - r4) < 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(d.b.n.i.h r17) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.n.i.e.c(d.b.n.i.h):void");
    }

    @Override // d.b.n.i.m
    public void c(boolean z2) {
        this.y = z2;
    }

    @Override // d.b.n.i.r
    public boolean c() {
        return this.k.size() > 0 && this.k.get(0).f2802a.c();
    }

    @Override // d.b.n.i.r
    public ListView d() {
        if (this.k.isEmpty()) {
            return null;
        }
        List<d> list = this.k;
        return list.get(list.size() - 1).f2802a.f2914e;
    }

    @Override // d.b.n.i.r
    public void dismiss() {
        int size = this.k.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.k.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f2802a.c()) {
                    dVar.f2802a.dismiss();
                }
            }
        }
    }

    @Override // d.b.n.i.m
    public boolean e() {
        return false;
    }

    public void onDismiss() {
        d dVar;
        int size = this.k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.k.get(i2);
            if (!dVar.f2802a.c()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.a(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // d.b.n.i.o
    public boolean a(t tVar) {
        for (d dVar : this.k) {
            if (tVar == dVar.b) {
                dVar.f2802a.f2914e.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        tVar.a(this, this.f2790d);
        if (c()) {
            c(tVar);
        } else {
            this.j.add(tVar);
        }
        o.a aVar = this.z;
        if (aVar != null) {
            aVar.a(tVar);
        }
        return true;
    }

    @Override // d.b.n.i.m
    public void a(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, p.h(view));
        }
    }

    @Override // d.b.n.i.m
    public void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            this.p = Gravity.getAbsoluteGravity(i2, p.h(this.q));
        }
    }

    @Override // d.b.n.i.o
    public void a(boolean z2) {
        for (d dVar : this.k) {
            ListAdapter adapter = dVar.f2802a.f2914e.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }
}

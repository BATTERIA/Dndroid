package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import d.g.l.z.b;
import d.o.c.a;
import d.o.c.a0;
import d.o.c.b;
import d.o.c.b0;
import d.o.c.k;
import d.o.c.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecyclerView extends ViewGroup implements d.g.l.n, d.g.l.d {
    public static final int[] A0 = {16843830};
    public static final int[] B0 = {16842987};
    public static final boolean C0;
    public static final boolean D0 = (Build.VERSION.SDK_INT >= 23);
    public static final boolean E0 = true;
    public static final boolean F0;
    public static final boolean G0 = false;
    public static final boolean H0 = false;
    public static final Class<?>[] I0;
    public static final Interpolator J0 = new c();
    public boolean A;
    public int B;
    public boolean C;
    public final AccessibilityManager D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public i I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public j N;
    public int O;
    public int P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public o W;
    public final int a0;
    public final int b0;

    /* renamed from: c  reason: collision with root package name */
    public final u f2445c;
    public float c0;

    /* renamed from: d  reason: collision with root package name */
    public final s f2446d;
    public float d0;

    /* renamed from: e  reason: collision with root package name */
    public v f2447e;
    public boolean e0;

    /* renamed from: f  reason: collision with root package name */
    public d.o.c.a f2448f;
    public final z f0;

    /* renamed from: g  reason: collision with root package name */
    public d.o.c.b f2449g;
    public d.o.c.m g0;

    /* renamed from: h  reason: collision with root package name */
    public final b0 f2450h;
    public m.b h0;
    public boolean i;
    public final x i0;
    public final Runnable j;
    public q j0;
    public final Rect k;
    public List<q> k0;
    public final Rect l;
    public boolean l0;
    public final RectF m;
    public boolean m0;
    public e n;
    public j.b n0;
    public m o;
    public boolean o0;
    public t p;
    public d.o.c.x p0;
    public final ArrayList<l> q;
    public h q0;
    public final ArrayList<p> r;
    public final int[] r0;
    public p s;
    public d.g.l.g s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final int[] u0;
    public boolean v;
    public final int[] v0;
    public boolean w;
    public final int[] w0;
    public int x;
    public final List<a0> x0;
    public boolean y;
    public Runnable y0;
    public boolean z;
    public final b0.b z0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.z) {
                    recyclerView2.y = true;
                } else {
                    recyclerView2.c();
                }
            }
        }
    }

    public static abstract class a0 {
        public static final List<Object> s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2452a;
        public WeakReference<RecyclerView> b;

        /* renamed from: c  reason: collision with root package name */
        public int f2453c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2454d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2455e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2456f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2457g = -1;

        /* renamed from: h  reason: collision with root package name */
        public a0 f2458h = null;
        public a0 i = null;
        public int j;
        public List<Object> k = null;
        public List<Object> l = null;
        public int m = 0;
        public s n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;
        public RecyclerView r;

        public a0(View view) {
            if (view != null) {
                this.f2452a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void a() {
            this.f2454d = -1;
            this.f2457g = -1;
        }

        public void a(int i2) {
            this.j = i2 | this.j;
        }

        public void a(int i2, int i3) {
            this.j = (i2 & i3) | (this.j & (i3 ^ -1));
        }

        public void a(int i2, boolean z) {
            if (this.f2454d == -1) {
                this.f2454d = this.f2453c;
            }
            if (this.f2457g == -1) {
                this.f2457g = this.f2453c;
            }
            if (z) {
                this.f2457g += i2;
            }
            this.f2453c += i2;
            if (this.f2452a.getLayoutParams() != null) {
                ((n) this.f2452a.getLayoutParams()).f2482c = true;
            }
        }

        public void a(Object obj) {
            if (obj == null) {
                a(1024);
            } else if ((1024 & this.j) == 0) {
                if (this.k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.k = arrayList;
                    this.l = Collections.unmodifiableList(arrayList);
                }
                this.k.add(obj);
            }
        }

        public final void a(boolean z) {
            int i2;
            int i3 = this.m;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.m = i4;
            if (i4 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.j | 16;
            } else if (z && this.m == 0) {
                i2 = this.j & -17;
            } else {
                return;
            }
            this.j = i2;
        }

        public void b() {
            this.j &= -33;
        }

        public boolean b(int i2) {
            return (i2 & this.j) != 0;
        }

        public final int c() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b(this);
        }

        public final int d() {
            int i2 = this.f2457g;
            return i2 == -1 ? this.f2453c : i2;
        }

        public List<Object> e() {
            if ((this.j & 1024) != 0) {
                return s;
            }
            List<Object> list = this.k;
            return (list == null || list.size() == 0) ? s : this.l;
        }

        public boolean f() {
            return (this.j & 1) != 0;
        }

        public boolean g() {
            return (this.j & 4) != 0;
        }

        public final boolean h() {
            return (this.j & 16) == 0 && !d.g.l.p.o(this.f2452a);
        }

        public boolean i() {
            return (this.j & 8) != 0;
        }

        public boolean j() {
            return this.n != null;
        }

        public boolean k() {
            return (this.j & 256) != 0;
        }

        public boolean l() {
            return (this.j & 2) != 0;
        }

        public void m() {
            this.j = 0;
            this.f2453c = -1;
            this.f2454d = -1;
            this.f2455e = -1;
            this.f2457g = -1;
            this.m = 0;
            this.f2458h = null;
            this.i = null;
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.d(this);
        }

        public boolean n() {
            return (this.j & 128) != 0;
        }

        public boolean o() {
            return (this.j & 32) != 0;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("ViewHolder{");
            a2.append(Integer.toHexString(hashCode()));
            a2.append(" position=");
            a2.append(this.f2453c);
            a2.append(" id=");
            a2.append(this.f2455e);
            a2.append(", oldPos=");
            a2.append(this.f2454d);
            a2.append(", pLpos:");
            a2.append(this.f2457g);
            StringBuilder sb = new StringBuilder(a2.toString());
            if (j()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z = false;
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (n()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                StringBuilder a3 = e.a.a.a.a.a(" not recyclable(");
                a3.append(this.m);
                a3.append(")");
                sb.append(a3.toString());
            }
            if ((this.j & 512) != 0 || g()) {
                z = true;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f2452a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j jVar = RecyclerView.this.N;
            if (jVar != null) {
                d.o.c.k kVar = (d.o.c.k) jVar;
                boolean z = !kVar.f3619h.isEmpty();
                boolean z2 = !kVar.j.isEmpty();
                boolean z3 = !kVar.k.isEmpty();
                boolean z4 = !kVar.i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<a0> it = kVar.f3619h.iterator();
                    while (it.hasNext()) {
                        a0 next = it.next();
                        View view = next.f2452a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.q.add(next);
                        animate.setDuration(kVar.f2464d).alpha(0.0f).setListener(new d.o.c.f(kVar, next, animate, view)).start();
                    }
                    kVar.f3619h.clear();
                    if (z2) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.j);
                        kVar.m.add(arrayList);
                        kVar.j.clear();
                        d.o.c.c cVar = new d.o.c.c(kVar, arrayList);
                        if (z) {
                            d.g.l.p.a(arrayList.get(0).f3625a.f2452a, cVar, kVar.f2464d);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.k);
                        kVar.n.add(arrayList2);
                        kVar.k.clear();
                        d.o.c.d dVar = new d.o.c.d(kVar, arrayList2);
                        if (z) {
                            d.g.l.p.a(arrayList2.get(0).f3620a.f2452a, dVar, kVar.f2464d);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<a0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.i);
                        kVar.l.add(arrayList3);
                        kVar.i.clear();
                        d.o.c.e eVar = new d.o.c.e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j = 0;
                            long j2 = z ? kVar.f2464d : 0;
                            long j3 = z2 ? kVar.f2465e : 0;
                            if (z3) {
                                j = kVar.f2466f;
                            }
                            d.g.l.p.a(arrayList3.get(0).f2452a, eVar, Math.max(j3, j) + j2);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.o0 = false;
        }
    }

    public static class c implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class d implements b0.b {
        public d() {
        }

        public void a(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView != null) {
                a0Var.a(false);
                d.o.c.y yVar = (d.o.c.y) recyclerView.N;
                if (yVar != null) {
                    if (cVar == null || (cVar.f2467a == cVar2.f2467a && cVar.b == cVar2.b)) {
                        d.o.c.k kVar = (d.o.c.k) yVar;
                        kVar.e(a0Var);
                        a0Var.f2452a.setAlpha(0.0f);
                        kVar.i.add(a0Var);
                        z = true;
                    } else {
                        z = yVar.a(a0Var, cVar.f2467a, cVar.b, cVar2.f2467a, cVar2.b);
                    }
                    if (z) {
                        recyclerView.q();
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }

        public void b(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            RecyclerView.this.f2446d.b(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.a(a0Var);
            a0Var.a(false);
            d.o.c.y yVar = (d.o.c.y) recyclerView.N;
            if (yVar != null) {
                int i = cVar.f2467a;
                int i2 = cVar.b;
                View view = a0Var.f2452a;
                int left = cVar2 == null ? view.getLeft() : cVar2.f2467a;
                int top = cVar2 == null ? view.getTop() : cVar2.b;
                if (a0Var.i() || (i == left && i2 == top)) {
                    d.o.c.k kVar = (d.o.c.k) yVar;
                    kVar.e(a0Var);
                    kVar.f3619h.add(a0Var);
                    z = true;
                } else {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    z = yVar.a(a0Var, i, i2, left, top);
                }
                if (z) {
                    recyclerView.q();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public static abstract class e<VH extends a0> {

        /* renamed from: a  reason: collision with root package name */
        public final f f2461a = new f();
        public boolean b = false;

        public abstract int a();

        public int a(int i) {
            return 0;
        }

        public abstract VH a(ViewGroup viewGroup, int i);

        public void a(VH vh) {
        }

        public abstract void a(VH vh, int i);

        public void a(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView) {
        }
    }

    public static class f extends Observable<g> {
        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                u uVar = (u) ((g) ((Observable) this).mObservers.get(size));
                RecyclerView.this.a((String) null);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.i0.f2514f = true;
                recyclerView.b(true);
                if (!RecyclerView.this.f2448f.c()) {
                    RecyclerView.this.requestLayout();
                }
            }
        }

        public void a(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                u uVar = (u) ((g) ((Observable) this).mObservers.get(size));
                RecyclerView.this.a((String) null);
                d.o.c.a aVar = RecyclerView.this.f2448f;
                if (aVar != null) {
                    boolean z = false;
                    if (i2 >= 1) {
                        aVar.b.add(aVar.a(1, i, i2, null));
                        aVar.f3580g |= 1;
                        if (aVar.b.size() == 1) {
                            z = true;
                        }
                    }
                    if (z) {
                        if (RecyclerView.E0) {
                            RecyclerView recyclerView = RecyclerView.this;
                            if (recyclerView.u && recyclerView.t) {
                                d.g.l.p.a(recyclerView, recyclerView.j);
                            }
                        }
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.C = true;
                        recyclerView2.requestLayout();
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public static abstract class g {
    }

    public interface h {
        int a(int i, int i2);
    }

    public static class i {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f2462a = null;
        public ArrayList<a> b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f2463c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f2464d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f2465e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f2466f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2467a;
            public int b;
        }

        public static int d(a0 a0Var) {
            int i = a0Var.j & 14;
            if (a0Var.g()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = a0Var.f2454d;
            int c2 = a0Var.c();
            return (i2 == -1 || c2 == -1 || i2 == c2) ? i : i | 2048;
        }

        public final void a() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public boolean a(a0 a0Var, List<Object> list) {
            return !((d.o.c.y) this).f3670g || a0Var.g();
        }

        public abstract void b();

        public abstract void b(a0 a0Var);

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$a0;ILjava/util/List<Ljava/lang/Object;>;)Landroidx/recyclerview/widget/RecyclerView$j$c; */
        public c c(a0 a0Var) {
            c cVar = new c();
            View view = a0Var.f2452a;
            cVar.f2467a = view.getLeft();
            cVar.b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract boolean c();

        public final void a(a0 a0Var) {
            b bVar = this.f2462a;
            if (bVar != null) {
                k kVar = (k) bVar;
                if (kVar != null) {
                    boolean z = true;
                    a0Var.a(true);
                    if (a0Var.f2458h != null && a0Var.i == null) {
                        a0Var.f2458h = null;
                    }
                    a0Var.i = null;
                    if (!((a0Var.j & 16) != 0)) {
                        RecyclerView recyclerView = RecyclerView.this;
                        View view = a0Var.f2452a;
                        recyclerView.u();
                        d.o.c.b bVar2 = recyclerView.f2449g;
                        int indexOfChild = ((d.o.c.v) bVar2.f3589a).f3665a.indexOfChild(view);
                        if (indexOfChild == -1) {
                            bVar2.d(view);
                        } else if (bVar2.b.c(indexOfChild)) {
                            bVar2.b.d(indexOfChild);
                            bVar2.d(view);
                            ((d.o.c.v) bVar2.f3589a).b(indexOfChild);
                        } else {
                            z = false;
                        }
                        if (z) {
                            a0 g2 = RecyclerView.g(view);
                            recyclerView.f2446d.b(g2);
                            recyclerView.f2446d.a(g2);
                        }
                        recyclerView.c(!z);
                        if (!z && a0Var.k()) {
                            RecyclerView.this.removeDetachedView(a0Var.f2452a, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public class k implements j.b {
        public k() {
        }
    }

    public static abstract class l {
        public void a(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, x xVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public d.o.c.b f2469a;
        public RecyclerView b;

        /* renamed from: c  reason: collision with root package name */
        public final a0.b f2470c = new a();

        /* renamed from: d  reason: collision with root package name */
        public final a0.b f2471d = new b();

        /* renamed from: e  reason: collision with root package name */
        public d.o.c.a0 f2472e = new d.o.c.a0(this.f2470c);

        /* renamed from: f  reason: collision with root package name */
        public d.o.c.a0 f2473f = new d.o.c.a0(this.f2471d);

        /* renamed from: g  reason: collision with root package name */
        public w f2474g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2475h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = true;
        public boolean l = true;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        public class a implements a0.b {
            public a() {
            }

            @Override // d.o.c.a0.b
            public int a() {
                m mVar = m.this;
                return mVar.q - mVar.l();
            }

            @Override // d.o.c.a0.b
            public int a(View view) {
                return m.this.g(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }

            @Override // d.o.c.a0.b
            public View a(int i) {
                return m.this.c(i);
            }

            @Override // d.o.c.a0.b
            public int b() {
                return m.this.k();
            }

            @Override // d.o.c.a0.b
            public int b(View view) {
                return m.this.d(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }
        }

        public class b implements a0.b {
            public b() {
            }

            @Override // d.o.c.a0.b
            public int a() {
                m mVar = m.this;
                return mVar.r - mVar.j();
            }

            @Override // d.o.c.a0.b
            public int a(View view) {
                return m.this.c(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }

            @Override // d.o.c.a0.b
            public View a(int i) {
                return m.this.c(i);
            }

            @Override // d.o.c.a0.b
            public int b() {
                return m.this.m();
            }

            @Override // d.o.c.a0.b
            public int b(View view) {
                return m.this.h(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2478a;
            public int b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2479c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2480d;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.a(int, int, int, int, boolean):int");
        }

        public static d a(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.o.b.RecyclerView, i2, i3);
            dVar.f2478a = obtainStyledAttributes.getInt(d.o.b.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(d.o.b.RecyclerView_spanCount, 1);
            dVar.f2479c = obtainStyledAttributes.getBoolean(d.o.b.RecyclerView_reverseLayout, false);
            dVar.f2480d = obtainStyledAttributes.getBoolean(d.o.b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public int a(int i2, s sVar, x xVar) {
            return 0;
        }

        public int a(s sVar, x xVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.n == null || !a()) {
                return 1;
            }
            return this.b.n.a();
        }

        public int a(x xVar) {
            return 0;
        }

        public View a(View view, int i2, s sVar, x xVar) {
            return null;
        }

        public n a(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public n a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public void a(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.D0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.D0) {
                this.r = 0;
            }
        }

        public void a(int i2, int i3, x xVar, c cVar) {
        }

        public void a(int i2, c cVar) {
        }

        public void a(int i2, s sVar) {
            View c2 = c(i2);
            g(i2);
            sVar.a(c2);
        }

        public void a(Parcelable parcelable) {
        }

        public void a(View view) {
            a(view, -1, false);
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public void a(View view, d.g.l.z.b bVar) {
            a0 g2 = RecyclerView.g(view);
            if (g2 != null && !g2.i() && !this.f2469a.c(g2.f2452a)) {
                RecyclerView recyclerView = this.b;
                a(recyclerView.f2446d, recyclerView.i0, view, bVar);
            }
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((n) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.b.m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(s sVar, x xVar, View view, d.g.l.z.b bVar) {
            bVar.a(b.c.a(b() ? i(view) : 0, 1, a() ? i(view) : 0, 1, false, false));
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        }

        public void a(RecyclerView recyclerView, s sVar) {
        }

        public void a(RecyclerView recyclerView, x xVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        public boolean a() {
            return false;
        }

        public boolean a(View view, int i2, int i3, n nVar) {
            return view.isLayoutRequested() || !this.k || !b(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) || !b(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height);
        }

        public boolean a(n nVar) {
            return nVar != null;
        }

        public int b(int i2, s sVar, x xVar) {
            return 0;
        }

        public int b(s sVar, x xVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.n == null || !b()) {
                return 1;
            }
            return this.b.n.a();
        }

        public int b(x xVar) {
            return 0;
        }

        public View b(View view) {
            View b2;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (b2 = recyclerView.b(view)) == null || this.f2469a.f3590c.contains(b2)) {
                return null;
            }
            return b2;
        }

        public void b(s sVar) {
            for (int d2 = d() - 1; d2 >= 0; d2--) {
                if (!RecyclerView.g(c(d2)).n()) {
                    a(d2, sVar);
                }
            }
        }

        public void b(RecyclerView recyclerView) {
            a(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public boolean b() {
            return false;
        }

        public boolean b(View view, int i2, int i3, n nVar) {
            return !this.k || !b(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) || !b(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height);
        }

        public int c(x xVar) {
            return 0;
        }

        public View c(int i2) {
            d.o.c.b bVar = this.f2469a;
            if (bVar == null) {
                return null;
            }
            return ((d.o.c.v) bVar.f3589a).a(bVar.c(i2));
        }

        public abstract n c();

        public void c(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void c(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.b = null;
                this.f2469a = null;
                i2 = 0;
                this.q = 0;
            } else {
                this.b = recyclerView;
                this.f2469a = recyclerView.f2449g;
                this.q = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.r = i2;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public int d() {
            d.o.c.b bVar = this.f2469a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int d(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).b.left;
        }

        public int d(x xVar) {
            return 0;
        }

        public int e(View view) {
            Rect rect = ((n) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int e(x xVar) {
            return 0;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int a2 = recyclerView.f2449g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.f2449g.b(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public boolean e() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.i;
        }

        public int f(View view) {
            Rect rect = ((n) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int f(x xVar) {
            return 0;
        }

        public View f() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2469a.f3590c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void f(int i2) {
        }

        public int g() {
            return d.g.l.p.h(this.b);
        }

        public int g(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).b.right;
        }

        public void g(x xVar) {
        }

        public int h() {
            return d.g.l.p.i(this.b);
        }

        public int h(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).b.top;
        }

        public void h(int i2) {
        }

        public int i() {
            return d.g.l.p.j(this.b);
        }

        public int i(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public int j() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int k() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int l() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int m() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean n() {
            return this.j;
        }

        public Parcelable o() {
            return null;
        }

        public void p() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public boolean q() {
            return false;
        }

        public boolean r() {
            return false;
        }

        public final void a(View view, int i2, boolean z) {
            a0 g2 = RecyclerView.g(view);
            if (z || g2.i()) {
                this.b.f2450h.a(g2);
            } else {
                this.b.f2450h.c(g2);
            }
            n nVar = (n) view.getLayoutParams();
            if (g2.o() || g2.j()) {
                if (g2.j()) {
                    g2.n.b(g2);
                } else {
                    g2.b();
                }
                this.f2469a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int b2 = this.f2469a.b(view);
                if (i2 == -1) {
                    i2 = this.f2469a.a();
                }
                if (b2 == -1) {
                    StringBuilder a2 = e.a.a.a.a.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    a2.append(this.b.indexOfChild(view));
                    throw new IllegalStateException(e.a.a.a.a.a(this.b, a2));
                } else if (b2 != i2) {
                    m mVar = this.b.o;
                    View c2 = mVar.c(b2);
                    if (c2 != null) {
                        mVar.c(b2);
                        mVar.f2469a.a(b2);
                        n nVar2 = (n) c2.getLayoutParams();
                        a0 g3 = RecyclerView.g(c2);
                        if (g3.i()) {
                            mVar.b.f2450h.a(g3);
                        } else {
                            mVar.b.f2450h.c(g3);
                        }
                        mVar.f2469a.a(c2, i2, nVar2, g3.i());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + mVar.b.toString());
                    }
                }
            } else {
                this.f2469a.a(view, i2, false);
                nVar.f2482c = true;
                w wVar = this.f2474g;
                if (wVar != null && wVar.f2500e && wVar.b.c(view) == wVar.f2497a) {
                    wVar.f2501f = view;
                }
            }
            if (nVar.f2483d) {
                g2.f2452a.invalidate();
                nVar.f2483d = false;
            }
        }

        public View b(int i2) {
            int d2 = d();
            for (int i3 = 0; i3 < d2; i3++) {
                View c2 = c(i3);
                a0 g2 = RecyclerView.g(c2);
                if (g2 != null && g2.d() == i2 && !g2.n() && (this.b.i0.f2515g || !g2.i())) {
                    return c2;
                }
            }
            return null;
        }

        public int c(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).b.bottom;
        }

        public void d(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int a2 = recyclerView.f2449g.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.f2449g.b(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void g(int i2) {
            d.o.c.b bVar;
            int c2;
            View a2;
            if (c(i2) != null && (a2 = ((d.o.c.v) bVar.f3589a).a((c2 = (bVar = this.f2469a).c(i2)))) != null) {
                if (bVar.b.d(c2)) {
                    bVar.d(a2);
                }
                ((d.o.c.v) bVar.f3589a).b(c2);
            }
        }

        public void c(s sVar) {
            int size = sVar.f2488a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = sVar.f2488a.get(i2).f2452a;
                a0 g2 = RecyclerView.g(view);
                if (!g2.n()) {
                    g2.a(false);
                    if (g2.k()) {
                        this.b.removeDetachedView(view, false);
                    }
                    j jVar = this.b.N;
                    if (jVar != null) {
                        jVar.b(g2);
                    }
                    g2.a(true);
                    a0 g3 = RecyclerView.g(view);
                    g3.n = null;
                    g3.o = false;
                    g3.b();
                    sVar.a(g3);
                }
            }
            sVar.f2488a.clear();
            ArrayList<a0> arrayList = sVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public void b(int i2, int i3) {
            int d2 = d();
            if (d2 == 0) {
                this.b.b(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < d2; i8++) {
                View c2 = c(i8);
                Rect rect = this.b.k;
                RecyclerView.a(c2, rect);
                int i9 = rect.left;
                if (i9 < i4) {
                    i4 = i9;
                }
                int i10 = rect.right;
                if (i10 > i6) {
                    i6 = i10;
                }
                int i11 = rect.top;
                if (i11 < i5) {
                    i5 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.b.k.set(i4, i5, i6, i7);
            a(this.b.k, i2, i3);
        }

        public void a(s sVar) {
            for (int d2 = d() - 1; d2 >= 0; d2--) {
                View c2 = c(d2);
                a0 g2 = RecyclerView.g(c2);
                if (!g2.n()) {
                    if (!g2.g() || g2.i() || this.b.n.b) {
                        c(d2);
                        this.f2469a.a(d2);
                        sVar.b(c2);
                        this.b.f2450h.c(g2);
                    } else {
                        g(d2);
                        sVar.a(g2);
                    }
                }
            }
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            s sVar = recyclerView.f2446d;
            x xVar = recyclerView.i0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                e eVar = this.b.n;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.a());
                }
            }
        }

        public void a(View view, s sVar) {
            d.o.c.b bVar = this.f2469a;
            int indexOfChild = ((d.o.c.v) bVar.f3589a).f3665a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.b.d(indexOfChild)) {
                    bVar.d(view);
                }
                ((d.o.c.v) bVar.f3589a).b(indexOfChild);
            }
            sVar.a(view);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
            if (r14 == false) goto L_0x00ba;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.a(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void a(Rect rect, int i2, int i3) {
            int l2 = l() + k() + rect.width();
            int j2 = j() + m() + rect.height();
            this.b.setMeasuredDimension(a(i2, l2, i()), a(i3, j2, h()));
        }

        public void a(w wVar) {
            w wVar2 = this.f2474g;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.f2500e)) {
                wVar2.c();
            }
            this.f2474g = wVar;
            RecyclerView recyclerView = this.b;
            if (wVar.f2503h) {
                StringBuilder a2 = e.a.a.a.a.a("An instance of ");
                a2.append(wVar.getClass().getSimpleName());
                a2.append(" was started ");
                a2.append("more than once. Each instance of");
                a2.append(wVar.getClass().getSimpleName());
                a2.append(" ");
                a2.append("is intended to only be used once. You should create a new instance for ");
                a2.append("each use.");
                Log.w("RecyclerView", a2.toString());
            }
            wVar.b = recyclerView;
            wVar.f2498c = this;
            int i2 = wVar.f2497a;
            if (i2 != -1) {
                recyclerView.i0.f2510a = i2;
                wVar.f2500e = true;
                wVar.f2499d = true;
                wVar.f2501f = recyclerView.o.b(i2);
                wVar.a();
                wVar.b.f0.a();
                wVar.f2503h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public a0 f2481a;
        public final Rect b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2482c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2483d = false;

        public n(int i, int i2) {
            super(i, i2);
        }

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
        }

        public int a() {
            return this.f2481a.d();
        }

        public boolean b() {
            return this.f2481a.l();
        }

        public boolean c() {
            return this.f2481a.i();
        }
    }

    public static abstract class o {
    }

    public interface p {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class q {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f2484a = new SparseArray<>();
        public int b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<a0> f2485a = new ArrayList<>();
            public int b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2486c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f2487d = 0;
        }

        public long a(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public final a a(int i) {
            a aVar = this.f2484a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2484a.put(i, aVar2);
            return aVar2;
        }
    }

    public interface t {
        void a(a0 a0Var);
    }

    public class u extends g {
        public u() {
        }
    }

    public static class v extends d.i.a.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public Parcelable f2496e;

        public static class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new v[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2496e = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // d.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3403c, i);
            parcel.writeParcelable(this.f2496e, 0);
        }
    }

    public static class x {

        /* renamed from: a  reason: collision with root package name */
        public int f2510a = -1;
        public int b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2511c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2512d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2513e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2514f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2515g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2516h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;
        public int o;

        public int a() {
            return this.f2515g ? this.b - this.f2511c : this.f2513e;
        }

        public void a(int i2) {
            if ((this.f2512d & i2) == 0) {
                StringBuilder a2 = e.a.a.a.a.a("Layout state should be one of ");
                a2.append(Integer.toBinaryString(i2));
                a2.append(" but it is ");
                a2.append(Integer.toBinaryString(this.f2512d));
                throw new IllegalStateException(a2.toString());
            }
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("State{mTargetPosition=");
            a2.append(this.f2510a);
            a2.append(", mData=");
            a2.append((Object) null);
            a2.append(", mItemCount=");
            a2.append(this.f2513e);
            a2.append(", mIsMeasuring=");
            a2.append(this.i);
            a2.append(", mPreviousLayoutItemCount=");
            a2.append(this.b);
            a2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a2.append(this.f2511c);
            a2.append(", mStructureChanged=");
            a2.append(this.f2514f);
            a2.append(", mInPreLayout=");
            a2.append(this.f2515g);
            a2.append(", mRunSimpleAnimations=");
            a2.append(this.j);
            a2.append(", mRunPredictiveAnimations=");
            a2.append(this.k);
            a2.append('}');
            return a2.toString();
        }
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f2517c;

        /* renamed from: d  reason: collision with root package name */
        public int f2518d;

        /* renamed from: e  reason: collision with root package name */
        public OverScroller f2519e;

        /* renamed from: f  reason: collision with root package name */
        public Interpolator f2520f = RecyclerView.J0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2521g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2522h = false;

        public z() {
            this.f2519e = new OverScroller(RecyclerView.this.getContext(), RecyclerView.J0);
        }

        public final int a(int i2, int i3, int i4, int i5) {
            int i6;
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i5 * i5) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i7;
            float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i6, 2000);
        }

        public void a() {
            if (this.f2521g) {
                this.f2522h = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            d.g.l.p.a(RecyclerView.this, this);
        }

        public void a(int i2, int i3, int i4, Interpolator interpolator) {
            if (this.f2520f != interpolator) {
                this.f2520f = interpolator;
                this.f2519e = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f2518d = 0;
            this.f2517c = 0;
            this.f2519e.startScroll(0, 0, i2, i3, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2519e.computeScrollOffset();
            }
            a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: androidx.recyclerview.widget.RecyclerView$w */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e0, code lost:
            if (r9 > 0) goto L_0x00e4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 473
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.z.run():void");
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        C0 = i2 == 19 || i2 == 20;
        int i3 = Build.VERSION.SDK_INT;
        F0 = i3 >= 21;
        Class<?> cls = Integer.TYPE;
        I0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        char c2;
        StringBuilder sb;
        Object[] objArr;
        Constructor<? extends U> constructor;
        this.f2445c = new u();
        this.f2446d = new s();
        this.f2450h = new b0();
        this.j = new a();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new RectF();
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        this.x = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new i();
        this.N = new d.o.c.k();
        this.O = 0;
        this.P = -1;
        this.c0 = Float.MIN_VALUE;
        this.d0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.e0 = true;
        this.f0 = new z();
        this.h0 = F0 ? new m.b() : null;
        this.i0 = new x();
        this.l0 = false;
        this.m0 = false;
        this.n0 = new k();
        this.o0 = false;
        this.r0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new b();
        this.z0 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B0, i2, 0);
            this.i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.c0 = d.g.l.t.b(viewConfiguration, context);
        this.d0 = Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : d.g.l.t.a(viewConfiguration, context);
        this.a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.f2462a = this.n0;
        this.f2448f = new d.o.c.a(new d.o.c.w(this));
        this.f2449g = new d.o.c.b(new d.o.c.v(this));
        if (d.g.l.p.g(this) == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new d.o.c.x(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.o.b.RecyclerView, i2, 0);
            String string = obtainStyledAttributes2.getString(d.o.b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(d.o.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(d.o.b.RecyclerView_fastScrollEnabled, false);
            this.v = z3;
            if (z3) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(d.o.b.RecyclerView_fastScrollVerticalThumbDrawable);
                Drawable drawable = obtainStyledAttributes2.getDrawable(d.o.b.RecyclerView_fastScrollVerticalTrackDrawable);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(d.o.b.RecyclerView_fastScrollHorizontalThumbDrawable);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(d.o.b.RecyclerView_fastScrollHorizontalTrackDrawable);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException(e.a.a.a.a.a(this, e.a.a.a.a.a("Trying to set fast scroller without both required drawables.")));
                }
                Resources resources = getContext().getResources();
                c2 = 2;
                typedArray = obtainStyledAttributes2;
                new d.o.c.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(d.o.a.fastscroll_default_thickness), resources.getDimensionPixelSize(d.o.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(d.o.a.fastscroll_margin));
            } else {
                typedArray = obtainStyledAttributes2;
                c2 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(trim);
                        trim = sb.toString();
                    } else if (!trim.contains(".")) {
                        sb = new StringBuilder();
                        sb.append(RecyclerView.class.getPackage().getName());
                        sb.append('.');
                        sb.append(trim);
                        trim = sb.toString();
                    }
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(m.class);
                        try {
                            constructor = asSubclass.getConstructor(I0);
                            objArr = new Object[4];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c2] = Integer.valueOf(i2);
                            objArr[3] = 0;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((m) constructor.newInstance(objArr));
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                    } catch (InvocationTargetException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                    } catch (ClassCastException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, A0, i2, 0);
                z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public static void a(View view, Rect rect) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    public static void d(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        a0Var.b = null;
                        return;
                    } else if (view != a0Var.f2452a) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static RecyclerView f(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView f2 = f(viewGroup.getChildAt(i2));
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    public static a0 g(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f2481a;
    }

    private d.g.l.g getScrollingChildHelper() {
        if (this.s0 == null) {
            this.s0 = new d.g.l.g(this);
        }
        return this.s0;
    }

    public a0 a(int i2) {
        a0 a0Var = null;
        if (this.E) {
            return null;
        }
        int b2 = this.f2449g.b();
        for (int i3 = 0; i3 < b2; i3++) {
            a0 g2 = g(this.f2449g.d(i3));
            if (g2 != null && !g2.i() && b(g2) == i2) {
                if (!this.f2449g.c(g2.f2452a)) {
                    return g2;
                }
                a0Var = g2;
            }
        }
        return a0Var;
    }

    public final void a() {
        t();
        setScrollState(0);
    }

    public void a(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.J.onRelease();
            z2 = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            d.g.l.p.t(this);
        }
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.U = y2;
            this.S = y2;
        }
    }

    public void a(View view) {
        a0 g2 = g(view);
        e eVar = this.n;
        if (eVar != null && g2 != null) {
            eVar.a(g2);
        }
    }

    public final void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f2482c) {
                Rect rect = nVar.b;
                Rect rect2 = this.k;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        }
        this.o.a(this, view, this.k, !this.w, view2 == null);
    }

    public final void a(a0 a0Var) {
        View view = a0Var.f2452a;
        boolean z2 = view.getParent() == this;
        this.f2446d.b(d(view));
        if (a0Var.k()) {
            this.f2449g.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        d.o.c.b bVar = this.f2449g;
        if (!z2) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((d.o.c.v) bVar.f3589a).f3665a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.b.e(indexOfChild);
            bVar.a(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void a(q qVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(qVar);
    }

    public final void a(x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f0.f2519e;
            xVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        xVar.o = 0;
    }

    public void a(String str) {
        if (n()) {
            if (str == null) {
                throw new IllegalStateException(e.a.a.a.a.a(this, e.a.a.a.a.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(e.a.a.a.a.a(this, e.a.a.a.a.a(""))));
        }
    }

    public final void a(int[] iArr) {
        int a2 = this.f2449g.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            a0 g2 = g(this.f2449g.b(i4));
            if (!g2.n()) {
                int d2 = g2.d();
                if (d2 < i2) {
                    i2 = d2;
                }
                if (d2 > i3) {
                    i3 = d2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    public boolean a(a0 a0Var, int i2) {
        if (n()) {
            a0Var.q = i2;
            this.x0.add(a0Var);
            return false;
        }
        d.g.l.p.a(a0Var.f2452a, i2);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.o;
        if (mVar == null || mVar != null) {
            super.addFocusables(arrayList, i2, i3);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View b(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b(android.view.View):android.view.View");
    }

    public void b() {
        int b2 = this.f2449g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            a0 g2 = g(this.f2449g.d(i2));
            if (!g2.n()) {
                g2.a();
            }
        }
        s sVar = this.f2446d;
        int size = sVar.f2489c.size();
        for (int i3 = 0; i3 < size; i3++) {
            sVar.f2489c.get(i3).a();
        }
        int size2 = sVar.f2488a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sVar.f2488a.get(i4).a();
        }
        ArrayList<a0> arrayList = sVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                sVar.b.get(i5).a();
            }
        }
    }

    public int c(View view) {
        a0 g2 = g(view);
        if (g2 != null) {
            return g2.d();
        }
        return -1;
    }

    public void c() {
        if (!this.w || this.E) {
            Trace.beginSection("RV FullInvalidate");
            d();
            Trace.endSection();
        } else if (this.f2448f.c()) {
            boolean z2 = false;
            if ((this.f2448f.f3580g & 4) != 0) {
                if (!((this.f2448f.f3580g & 11) != 0)) {
                    Trace.beginSection("RV PartialInvalidate");
                    u();
                    p();
                    this.f2448f.d();
                    if (!this.y) {
                        int a2 = this.f2449g.a();
                        int i2 = 0;
                        while (true) {
                            if (i2 < a2) {
                                a0 g2 = g(this.f2449g.b(i2));
                                if (g2 != null && !g2.n() && g2.l()) {
                                    z2 = true;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                        if (z2) {
                            d();
                        } else {
                            this.f2448f.a();
                        }
                    }
                    c(true);
                    a(true);
                    Trace.endSection();
                }
            }
            if (this.f2448f.c()) {
                Trace.beginSection("RV FullInvalidate");
                d();
                Trace.endSection();
            }
        }
    }

    public void c(int i2) {
        m mVar = this.o;
        if (mVar != null) {
            mVar.h(i2);
            awakenScrollBars();
        }
    }

    public void c(int i2, int i3) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        q qVar = this.j0;
        if (qVar != null) {
            qVar.a(this, i2, i3);
        }
        List<q> list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.k0.get(size).a(this, i2, i3);
            }
        }
        this.H--;
    }

    public void c(boolean z2) {
        if (this.x < 1) {
            this.x = 1;
        }
        if (!z2 && !this.z) {
            this.y = false;
        }
        if (this.x == 1) {
            if (z2 && this.y && !this.z && this.o != null && this.n != null) {
                d();
            }
            if (!this.z) {
                this.y = false;
            }
        }
        this.x--;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.o.a((n) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        m mVar = this.o;
        if (mVar != null && mVar.a()) {
            return this.o.a(this.i0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        m mVar = this.o;
        if (mVar != null && mVar.a()) {
            return this.o.b(this.i0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        m mVar = this.o;
        if (mVar != null && mVar.a()) {
            return this.o.c(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        m mVar = this.o;
        if (mVar != null && mVar.b()) {
            return this.o.d(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        m mVar = this.o;
        if (mVar != null && mVar.b()) {
            return this.o.e(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        m mVar = this.o;
        if (mVar != null && mVar.b()) {
            return this.o.f(this.i0);
        }
        return 0;
    }

    public a0 d(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0327, code lost:
        if (r18.f2449g.c(r1) == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b1, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        // Method dump skipped, instructions count: 1014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d():void");
    }

    public void d(int i2) {
        if (!this.z) {
            v();
            m mVar = this.o;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            mVar.h(i2);
            awakenScrollBars();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.q.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).a(canvas, this, this.i0);
        }
        EdgeEffect edgeEffect = this.J;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.L;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                f3 = (float) (getPaddingRight() + (-getWidth()));
                f2 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f3 = (float) (-getWidth());
                f2 = (float) (-getHeight());
            }
            canvas.translate(f3, f2);
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.N == null || this.q.size() <= 0 || !this.N.c()) {
            z4 = z2;
        }
        if (z4) {
            d.g.l.p.t(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e() {
        int id;
        View b2;
        this.i0.a(1);
        a(this.i0);
        this.i0.i = false;
        u();
        b0 b0Var = this.f2450h;
        b0Var.f3592a.clear();
        b0Var.b.b();
        p();
        r();
        View focusedChild = (!this.e0 || !hasFocus() || this.n == null) ? null : getFocusedChild();
        a0 d2 = (focusedChild == null || (b2 = b(focusedChild)) == null) ? null : d(b2);
        long j2 = -1;
        if (d2 == null) {
            x xVar = this.i0;
            xVar.m = -1;
            xVar.l = -1;
            xVar.n = -1;
        } else {
            x xVar2 = this.i0;
            if (this.n.b) {
                j2 = d2.f2455e;
            }
            xVar2.m = j2;
            this.i0.l = this.E ? -1 : d2.i() ? d2.f2454d : d2.c();
            x xVar3 = this.i0;
            View view = d2.f2452a;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        xVar3.n = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            xVar3.n = id;
        }
        x xVar4 = this.i0;
        xVar4.f2516h = xVar4.j && this.m0;
        this.m0 = false;
        this.l0 = false;
        x xVar5 = this.i0;
        xVar5.f2515g = xVar5.k;
        xVar5.f2513e = this.n.a();
        a(this.r0);
        if (this.i0.j) {
            int a2 = this.f2449g.a();
            for (int i2 = 0; i2 < a2; i2++) {
                a0 g2 = g(this.f2449g.b(i2));
                if (!g2.n() && (!g2.g() || this.n.b)) {
                    j jVar = this.N;
                    j.d(g2);
                    g2.e();
                    this.f2450h.b(g2, jVar.c(g2));
                    if (this.i0.f2516h && g2.l() && !g2.i() && !g2.n() && !g2.g()) {
                        this.f2450h.b.c(c(g2), g2);
                    }
                }
            }
        }
        if (this.i0.k) {
            int b3 = this.f2449g.b();
            for (int i3 = 0; i3 < b3; i3++) {
                a0 g3 = g(this.f2449g.d(i3));
                if (!g3.n() && g3.f2454d == -1) {
                    g3.f2454d = g3.f2453c;
                }
            }
            x xVar6 = this.i0;
            boolean z2 = xVar6.f2514f;
            xVar6.f2514f = false;
            this.o.c(this.f2446d, xVar6);
            this.i0.f2514f = z2;
            for (int i4 = 0; i4 < this.f2449g.a(); i4++) {
                a0 g4 = g(this.f2449g.b(i4));
                if (!g4.n()) {
                    b0.a orDefault = this.f2450h.f3592a.getOrDefault(g4, null);
                    if (!((orDefault == null || (orDefault.f3594a & 4) == 0) ? false : true)) {
                        j.d(g4);
                        boolean b4 = g4.b(8192);
                        j jVar2 = this.N;
                        g4.e();
                        j.c c2 = jVar2.c(g4);
                        if (b4) {
                            a(g4, c2);
                        } else {
                            b0 b0Var2 = this.f2450h;
                            b0.a orDefault2 = b0Var2.f3592a.getOrDefault(g4, null);
                            if (orDefault2 == null) {
                                orDefault2 = b0.a.a();
                                b0Var2.f3592a.put(g4, orDefault2);
                            }
                            orDefault2.f3594a |= 2;
                            orDefault2.b = c2;
                        }
                    }
                }
            }
        }
        b();
        a(true);
        c(false);
        this.i0.f2512d = 2;
    }

    public void e(int i2) {
        if (!this.z) {
            m mVar = this.o;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.a(this, this.i0, i2);
            }
        }
    }

    public final void f() {
        u();
        p();
        this.i0.a(6);
        this.f2448f.b();
        this.i0.f2513e = this.n.a();
        x xVar = this.i0;
        xVar.f2511c = 0;
        xVar.f2515g = false;
        this.o.c(this.f2446d, xVar);
        x xVar2 = this.i0;
        xVar2.f2514f = false;
        this.f2447e = null;
        xVar2.j = xVar2.j && this.N != null;
        this.i0.f2512d = 4;
        a(true);
        c(false);
    }

    public void f(int i2) {
        getScrollingChildHelper().c(i2);
    }

    public boolean f(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0196, code lost:
        if (r10 > 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b0, code lost:
        if (r2 > 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b3, code lost:
        if (r10 < 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b6, code lost:
        if (r2 < 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01bf, code lost:
        if ((r2 * r1) < 0) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c8, code lost:
        if ((r2 * r1) > 0) goto L_0x01cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g() {
        int i2;
        int i3;
        if (this.M == null) {
            EdgeEffect a2 = this.I.a(this);
            this.M = a2;
            if (this.i) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.o;
        if (mVar != null) {
            return mVar.c();
        }
        throw new IllegalStateException(e.a.a.a.a.a(this, e.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.o;
        if (mVar != null) {
            return mVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException(e.a.a.a.a.a(this, e.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.o;
        if (mVar != null) {
            return mVar.a(layoutParams);
        }
        throw new IllegalStateException(e.a.a.a.a.a(this, e.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    public e getAdapter() {
        return this.n;
    }

    public int getBaseline() {
        m mVar = this.o;
        if (mVar == null) {
            return super.getBaseline();
        }
        if (mVar != null) {
            return -1;
        }
        throw null;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        h hVar = this.q0;
        return hVar == null ? super.getChildDrawingOrder(i2, i3) : hVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.i;
    }

    public d.o.c.x getCompatAccessibilityDelegate() {
        return this.p0;
    }

    public i getEdgeEffectFactory() {
        return this.I;
    }

    public j getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public m getLayoutManager() {
        return this.o;
    }

    public int getMaxFlingVelocity() {
        return this.b0;
    }

    public int getMinFlingVelocity() {
        return this.a0;
    }

    public long getNanoTime() {
        if (F0) {
            return System.nanoTime();
        }
        return 0;
    }

    public o getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.e0;
    }

    public r getRecycledViewPool() {
        return this.f2446d.b();
    }

    public int getScrollState() {
        return this.O;
    }

    public void h() {
        int i2;
        int i3;
        if (this.J == null) {
            EdgeEffect a2 = this.I.a(this);
            this.J = a2;
            if (this.i) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().b(0);
    }

    public void i() {
        int i2;
        int i3;
        if (this.L == null) {
            EdgeEffect a2 = this.I.a(this);
            this.L = a2;
            if (this.i) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public boolean isAttachedToWindow() {
        return this.t;
    }

    @Override // d.g.l.f
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3339d;
    }

    public void j() {
        int i2;
        int i3;
        if (this.K == null) {
            EdgeEffect a2 = this.I.a(this);
            this.K = a2;
            if (this.i) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public String k() {
        StringBuilder a2 = e.a.a.a.a.a(" ");
        a2.append(super.toString());
        a2.append(", adapter:");
        a2.append(this.n);
        a2.append(", layout:");
        a2.append(this.o);
        a2.append(", context:");
        a2.append(getContext());
        return a2.toString();
    }

    public boolean l() {
        return !this.w || this.E || this.f2448f.c();
    }

    public void m() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public boolean n() {
        return this.G > 0;
    }

    public void o() {
        int b2 = this.f2449g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((n) this.f2449g.d(i2).getLayoutParams()).f2482c = true;
        }
        s sVar = this.f2446d;
        int size = sVar.f2489c.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) sVar.f2489c.get(i3).f2452a.getLayoutParams();
            if (nVar != null) {
                nVar.f2482c = true;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = 0;
        this.t = true;
        this.w = this.w && !isLayoutRequested();
        m mVar = this.o;
        if (mVar != null) {
            mVar.i = true;
        }
        this.o0 = false;
        if (F0) {
            d.o.c.m mVar2 = d.o.c.m.f3640g.get();
            this.g0 = mVar2;
            if (mVar2 == null) {
                this.g0 = new d.o.c.m();
                Display d2 = d.g.l.p.d(this);
                float f2 = 60.0f;
                if (!isInEditMode() && d2 != null) {
                    float refreshRate = d2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                d.o.c.m mVar3 = this.g0;
                mVar3.f3644e = (long) (1.0E9f / f2);
                d.o.c.m.f3640g.set(mVar3);
            }
            this.g0.f3642c.add(this);
        }
    }

    public void onDetachedFromWindow() {
        d.o.c.m mVar;
        super.onDetachedFromWindow();
        j jVar = this.N;
        if (jVar != null) {
            jVar.b();
        }
        v();
        this.t = false;
        m mVar2 = this.o;
        if (mVar2 != null) {
            s sVar = this.f2446d;
            mVar2.i = false;
            mVar2.a(this, sVar);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        if (this.f2450h != null) {
            do {
            } while (b0.a.f3593d.a() != null);
            if (F0 && (mVar = this.g0) != null) {
                mVar.f3642c.remove(this);
                this.g0 = null;
                return;
            }
            return;
        }
        throw null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.q.get(i2) == null) {
                throw null;
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.o != null && !this.z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.o.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.o.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        a((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.o.b()) {
                        f3 = -axisValue;
                    } else if (this.o.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        a((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.z) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.s = null;
        }
        int size = this.r.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            p pVar = this.r.get(i2);
            if (pVar.a(this, motionEvent) && action != 3) {
                this.s = pVar;
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            a();
            return true;
        }
        m mVar = this.o;
        if (mVar == null) {
            return false;
        }
        boolean a2 = mVar.a();
        boolean b2 = this.o.b();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.U = y2;
            this.S = y2;
            if (this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = a2 ? 1 : 0;
            if (b2) {
                i3 |= 2;
            }
            f(i3, 0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            f(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex < 0) {
                StringBuilder a3 = e.a.a.a.a.a("Error processing scroll; pointer index for id ");
                a3.append(this.P);
                a3.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", a3.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i4 = x3 - this.R;
                int i5 = y3 - this.S;
                if (!a2 || Math.abs(i4) <= this.V) {
                    z3 = false;
                } else {
                    this.T = x3;
                    z3 = true;
                }
                if (b2 && Math.abs(i5) > this.V) {
                    this.U = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            a();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x4;
            this.R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y4;
            this.S = y4;
        } else if (actionMasked == 6) {
            a(motionEvent);
        }
        if (this.O == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        d();
        Trace.endSection();
        this.w = true;
    }

    public void onMeasure(int i2, int i3) {
        m mVar = this.o;
        if (mVar == null) {
            b(i2, i3);
            return;
        }
        boolean z2 = false;
        if (mVar.n()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.o.b.b(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.n != null) {
                if (this.i0.f2512d == 1) {
                    e();
                }
                this.o.a(i2, i3);
                this.i0.i = true;
                f();
                this.o.b(i2, i3);
                if (this.o.q()) {
                    this.o.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.i0.i = true;
                    f();
                    this.o.b(i2, i3);
                }
            }
        } else if (this.u) {
            this.o.b.b(i2, i3);
        } else {
            if (this.C) {
                u();
                p();
                r();
                a(true);
                x xVar = this.i0;
                if (xVar.k) {
                    xVar.f2515g = true;
                } else {
                    this.f2448f.b();
                    this.i0.f2515g = false;
                }
                this.C = false;
                c(false);
            } else if (this.i0.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.n;
            if (eVar != null) {
                this.i0.f2513e = eVar.a();
            } else {
                this.i0.f2513e = 0;
            }
            u();
            this.o.b.b(i2, i3);
            c(false);
            this.i0.f2515g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f2447e = vVar;
        super.onRestoreInstanceState(vVar.f3403c);
        m mVar = this.o;
        if (mVar != null && (parcelable2 = this.f2447e.f2496e) != null) {
            mVar.a(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f2447e;
        if (vVar2 != null) {
            vVar.f2496e = vVar2.f2496e;
        } else {
            m mVar = this.o;
            vVar.f2496e = mVar != null ? mVar.o() : null;
        }
        return vVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != 1) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p() {
        this.G++;
    }

    public void q() {
        if (!this.o0 && this.t) {
            d.g.l.p.a(this, this.y0);
            this.o0 = true;
        }
    }

    public final void r() {
        boolean z2 = false;
        if (this.E) {
            d.o.c.a aVar = this.f2448f;
            aVar.a(aVar.b);
            aVar.a(aVar.f3576c);
            aVar.f3580g = 0;
            if (this.F) {
                this.o.a(this);
            }
        }
        if (this.N != null && this.o.r()) {
            this.f2448f.d();
        } else {
            this.f2448f.b();
        }
        boolean z3 = this.l0 || this.m0;
        this.i0.j = this.w && this.N != null && (this.E || z3 || this.o.f2475h) && (!this.E || this.n.b);
        x xVar = this.i0;
        if (xVar.j && z3 && !this.E) {
            if (this.N != null && this.o.r()) {
                z2 = true;
            }
        }
        xVar.k = z2;
    }

    public void removeDetachedView(View view, boolean z2) {
        a0 g2 = g(view);
        if (g2 != null) {
            if (g2.k()) {
                g2.j &= -257;
            } else if (!g2.n()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(g2);
                throw new IllegalArgumentException(e.a.a.a.a.a(this, sb));
            }
        }
        view.clearAnimation();
        a(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        w wVar = this.o.f2474g;
        boolean z2 = true;
        if (!(wVar != null && wVar.f2500e) && !n()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.o.a(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.x != 0 || this.z) {
            this.y = true;
        } else {
            super.requestLayout();
        }
    }

    public void s() {
        j jVar = this.N;
        if (jVar != null) {
            jVar.b();
        }
        m mVar = this.o;
        if (mVar != null) {
            mVar.b(this.f2446d);
            this.o.c(this.f2446d);
        }
        this.f2446d.a();
    }

    public void scrollBy(int i2, int i3) {
        m mVar = this.o;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            boolean a2 = mVar.a();
            boolean b2 = this.o.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (n()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i2 = contentChangeTypes;
            }
            this.B |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(d.o.c.x xVar) {
        this.p0 = xVar;
        d.g.l.p.a(this, xVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.n;
        if (eVar2 != null) {
            eVar2.f2461a.unregisterObserver(this.f2445c);
            this.n.b(this);
        }
        s();
        d.o.c.a aVar = this.f2448f;
        aVar.a(aVar.b);
        aVar.a(aVar.f3576c);
        aVar.f3580g = 0;
        e eVar3 = this.n;
        this.n = eVar;
        if (eVar != null) {
            eVar.f2461a.registerObserver(this.f2445c);
            eVar.a(this);
        }
        m mVar = this.o;
        s sVar = this.f2446d;
        e eVar4 = this.n;
        sVar.a();
        r b2 = sVar.b();
        if (b2 != null) {
            if (eVar3 != null) {
                b2.b--;
            }
            if (b2.b == 0) {
                for (int i2 = 0; i2 < b2.f2484a.size(); i2++) {
                    b2.f2484a.valueAt(i2).f2485a.clear();
                }
            }
            if (eVar4 != null) {
                b2.b++;
            }
            this.i0.f2514f = true;
            b(false);
            requestLayout();
            return;
        }
        throw null;
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar != this.q0) {
            this.q0 = hVar;
            setChildrenDrawingOrderEnabled(hVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.i) {
            m();
        }
        this.i = z2;
        super.setClipToPadding(z2);
        if (this.w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        if (iVar != null) {
            this.I = iVar;
            m();
            return;
        }
        throw null;
    }

    public void setHasFixedSize(boolean z2) {
        this.u = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.N;
        if (jVar2 != null) {
            jVar2.b();
            this.N.f2462a = null;
        }
        this.N = jVar;
        if (jVar != null) {
            jVar.f2462a = this.n0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        s sVar = this.f2446d;
        sVar.f2491e = i2;
        sVar.d();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.z) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.z = false;
                if (!(!this.y || this.o == null || this.n == null)) {
                    requestLayout();
                }
                this.y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.z = true;
            this.A = true;
            v();
        }
    }

    public void setLayoutManager(m mVar) {
        if (mVar != this.o) {
            v();
            if (this.o != null) {
                j jVar = this.N;
                if (jVar != null) {
                    jVar.b();
                }
                this.o.b(this.f2446d);
                this.o.c(this.f2446d);
                this.f2446d.a();
                if (this.t) {
                    m mVar2 = this.o;
                    s sVar = this.f2446d;
                    mVar2.i = false;
                    mVar2.a(this, sVar);
                }
                this.o.c((RecyclerView) null);
                this.o = null;
            } else {
                this.f2446d.a();
            }
            d.o.c.b bVar = this.f2449g;
            b.a aVar = bVar.b;
            aVar.f3591a = 0;
            b.a aVar2 = aVar.b;
            if (aVar2 != null) {
                aVar2.b();
            }
            int size = bVar.f3590c.size();
            while (true) {
                size--;
                if (size >= 0) {
                    b.AbstractC0113b bVar2 = bVar.f3589a;
                    View view = bVar.f3590c.get(size);
                    d.o.c.v vVar = (d.o.c.v) bVar2;
                    if (vVar != null) {
                        a0 g2 = g(view);
                        if (g2 != null) {
                            vVar.f3665a.a(g2, g2.p);
                            g2.p = 0;
                        }
                        bVar.f3590c.remove(size);
                    } else {
                        throw null;
                    }
                } else {
                    d.o.c.v vVar2 = (d.o.c.v) bVar.f3589a;
                    int a2 = vVar2.a();
                    for (int i2 = 0; i2 < a2; i2++) {
                        View a3 = vVar2.a(i2);
                        vVar2.f3665a.a(a3);
                        a3.clearAnimation();
                    }
                    vVar2.f3665a.removeAllViews();
                    this.o = mVar;
                    if (mVar != null) {
                        if (mVar.b == null) {
                            mVar.c(this);
                            if (this.t) {
                                this.o.i = true;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("LayoutManager ");
                            sb.append(mVar);
                            sb.append(" is already attached to a RecyclerView:");
                            throw new IllegalArgumentException(e.a.a.a.a.a(mVar.b, sb));
                        }
                    }
                    this.f2446d.d();
                    requestLayout();
                    return;
                }
            }
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        d.g.l.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3339d) {
            d.g.l.p.v(scrollingChildHelper.f3338c);
        }
        scrollingChildHelper.f3339d = z2;
    }

    public void setOnFlingListener(o oVar) {
        this.W = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.j0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.e0 = z2;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f2446d;
        r rVar2 = sVar.f2493g;
        if (rVar2 != null) {
            rVar2.b--;
        }
        sVar.f2493g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f2493g.b++;
        }
    }

    public void setRecyclerListener(t tVar) {
        this.p = tVar;
    }

    public void setScrollState(int i2) {
        if (i2 != this.O) {
            this.O = i2;
            if (i2 != 2) {
                w();
            }
            m mVar = this.o;
            if (mVar != null) {
                mVar.f(i2);
            }
            q qVar = this.j0;
            if (qVar != null) {
                qVar.a(this, i2);
            }
            List<q> list = this.k0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.k0.get(size).a(this, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.V = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.V = i3;
    }

    public void setViewCacheExtension(y yVar) {
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().a(i2, 0);
    }

    @Override // d.g.l.f
    public void stopNestedScroll() {
        getScrollingChildHelper().c(0);
    }

    public final void t() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        f(0);
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            d.g.l.p.t(this);
        }
    }

    public void u() {
        int i2 = this.x + 1;
        this.x = i2;
        if (i2 == 1 && !this.z) {
            this.y = false;
        }
    }

    public void v() {
        setScrollState(0);
        w();
    }

    public final void w() {
        w wVar;
        z zVar = this.f0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f2519e.abortAnimation();
        m mVar = this.o;
        if (mVar != null && (wVar = mVar.f2474g) != null) {
            wVar.c();
        }
    }

    public static abstract class w {

        /* renamed from: a  reason: collision with root package name */
        public int f2497a = -1;
        public RecyclerView b;

        /* renamed from: c  reason: collision with root package name */
        public m f2498c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2499d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2500e;

        /* renamed from: f  reason: collision with root package name */
        public View f2501f;

        /* renamed from: g  reason: collision with root package name */
        public final a f2502g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f2503h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2504a;
            public int b;

            /* renamed from: c  reason: collision with root package name */
            public int f2505c;

            /* renamed from: d  reason: collision with root package name */
            public int f2506d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2507e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2508f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f2509g = 0;

            public a(int i, int i2) {
                this.f2504a = i;
                this.b = i2;
                this.f2505c = Integer.MIN_VALUE;
                this.f2507e = null;
            }

            public void a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2504a = i;
                this.b = i2;
                this.f2505c = i3;
                this.f2507e = interpolator;
                this.f2508f = true;
            }

            public void a(RecyclerView recyclerView) {
                int i = this.f2506d;
                if (i >= 0) {
                    this.f2506d = -1;
                    recyclerView.c(i);
                    this.f2508f = false;
                } else if (!this.f2508f) {
                    this.f2509g = 0;
                } else if (this.f2507e == null || this.f2505c >= 1) {
                    int i2 = this.f2505c;
                    if (i2 >= 1) {
                        Interpolator interpolator = this.f2507e;
                        if (interpolator == null) {
                            z zVar = recyclerView.f0;
                            if (i2 == Integer.MIN_VALUE) {
                                int i3 = this.f2504a;
                                int i4 = this.b;
                                zVar.a(i3, i4, zVar.a(i3, i4, 0, 0), RecyclerView.J0);
                            } else {
                                int i5 = this.f2504a;
                                int i6 = this.b;
                                if (zVar != null) {
                                    zVar.a(i5, i6, i2, RecyclerView.J0);
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            recyclerView.f0.a(this.f2504a, this.b, i2, interpolator);
                        }
                        int i7 = this.f2509g + 1;
                        this.f2509g = i7;
                        if (i7 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f2508f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }
        }

        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            m mVar = this.f2498c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i);
            }
            StringBuilder a2 = e.a.a.a.a.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a2.append(b.class.getCanonicalName());
            Log.w("RecyclerView", a2.toString());
            return null;
        }

        public abstract void a();

        public abstract void a(int i, int i2, x xVar, a aVar);

        public void a(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public abstract void a(View view, x xVar, a aVar);

        public abstract void b();

        public final void c() {
            if (this.f2500e) {
                this.f2500e = false;
                b();
                this.b.i0.f2510a = -1;
                this.f2501f = null;
                this.f2497a = -1;
                this.f2499d = false;
                m mVar = this.f2498c;
                if (mVar.f2474g == this) {
                    mVar.f2474g = null;
                }
                this.f2498c = null;
                this.b = null;
            }
        }

        public void a(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (!this.f2500e || this.f2497a == -1 || recyclerView == null) {
                c();
            }
            if (!(!this.f2499d || this.f2501f != null || this.f2498c == null || (a2 = a(this.f2497a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                recyclerView.a((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
            }
            boolean z = false;
            this.f2499d = false;
            View view = this.f2501f;
            if (view != null) {
                if (this.b.c(view) == this.f2497a) {
                    a(this.f2501f, recyclerView.i0, this.f2502g);
                    this.f2502g.a(recyclerView);
                    c();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2501f = null;
                }
            }
            if (this.f2500e) {
                a(i, i2, recyclerView.i0, this.f2502g);
                if (this.f2502g.f2506d >= 0) {
                    z = true;
                }
                this.f2502g.a(recyclerView);
                if (!z) {
                    return;
                }
                if (this.f2500e) {
                    this.f2499d = true;
                    recyclerView.f0.a();
                    return;
                }
                c();
            }
        }
    }

    public void b(int i2, int i3) {
        setMeasuredDimension(m.a(i2, getPaddingRight() + getPaddingLeft(), d.g.l.p.j(this)), m.a(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public int b(a0 a0Var) {
        if (a0Var.b(524) || !a0Var.f()) {
            return -1;
        }
        d.o.c.a aVar = this.f2448f;
        int i2 = a0Var.f2453c;
        int size = aVar.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.b bVar = aVar.b.get(i3);
            int i4 = bVar.f3581a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.b;
                    if (i5 <= i2) {
                        int i6 = bVar.f3583d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.b;
                    if (i7 == i2) {
                        i2 = bVar.f3583d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f3583d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.b <= i2) {
                i2 += bVar.f3583d;
            }
        }
        return i2;
    }

    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<a0> f2488a = new ArrayList<>();
        public ArrayList<a0> b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a0> f2489c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f2490d = Collections.unmodifiableList(this.f2488a);

        /* renamed from: e  reason: collision with root package name */
        public int f2491e = 2;

        /* renamed from: f  reason: collision with root package name */
        public int f2492f = 2;

        /* renamed from: g  reason: collision with root package name */
        public r f2493g;

        public s() {
        }

        public void a() {
            this.f2488a.clear();
            c();
        }

        public final void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void a(a0 a0Var, boolean z) {
            RecyclerView.d(a0Var);
            if (a0Var.b(16384)) {
                a0Var.a(0, 16384);
                d.g.l.p.a(a0Var.f2452a, (d.g.l.a) null);
            }
            if (z) {
                t tVar = RecyclerView.this.p;
                if (tVar != null) {
                    tVar.a(a0Var);
                }
                e eVar = RecyclerView.this.n;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.i0 != null) {
                    recyclerView.f2450h.d(a0Var);
                }
            }
            a0Var.r = null;
            r b2 = b();
            if (b2 != null) {
                int i = a0Var.f2456f;
                ArrayList<a0> arrayList = b2.a(i).f2485a;
                if (b2.f2484a.get(i).b > arrayList.size()) {
                    a0Var.m();
                    arrayList.add(a0Var);
                    return;
                }
                return;
            }
            throw null;
        }

        public r b() {
            if (this.f2493g == null) {
                this.f2493g = new r();
            }
            return this.f2493g;
        }

        public void b(int i) {
            a(this.f2489c.get(i), true);
            this.f2489c.remove(i);
        }

        public void b(View view) {
            ArrayList<a0> arrayList;
            a0 g2 = RecyclerView.g(view);
            if (!g2.b(12) && g2.l()) {
                j jVar = RecyclerView.this.N;
                if (!(jVar == null || jVar.a(g2, g2.e()))) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    g2.n = this;
                    g2.o = true;
                    arrayList = this.b;
                    arrayList.add(g2);
                    return;
                }
            }
            if (!g2.g() || g2.i() || RecyclerView.this.n.b) {
                g2.n = this;
                g2.o = false;
                arrayList = this.f2488a;
                arrayList.add(g2);
                return;
            }
            throw new IllegalArgumentException(e.a.a.a.a.a(RecyclerView.this, e.a.a.a.a.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }

        public void b(a0 a0Var) {
            (a0Var.o ? this.b : this.f2488a).remove(a0Var);
            a0Var.n = null;
            a0Var.o = false;
            a0Var.b();
        }

        public void c() {
            for (int size = this.f2489c.size() - 1; size >= 0; size--) {
                b(size);
            }
            this.f2489c.clear();
            if (RecyclerView.F0) {
                m.b bVar = RecyclerView.this.h0;
                int[] iArr = bVar.f3647c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f3648d = 0;
            }
        }

        public void d() {
            m mVar = RecyclerView.this.o;
            this.f2492f = this.f2491e + (mVar != null ? mVar.m : 0);
            for (int size = this.f2489c.size() - 1; size >= 0 && this.f2489c.size() > this.f2492f; size--) {
                b(size);
            }
        }

        public int a(int i) {
            if (i < 0 || i >= RecyclerView.this.i0.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State ");
                sb.append("item count is ");
                sb.append(RecyclerView.this.i0.a());
                throw new IndexOutOfBoundsException(e.a.a.a.a.a(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.i0.f2515g) {
                return i;
            }
            return recyclerView.f2448f.a(i, 0);
        }

        public void a(View view) {
            a0 g2 = RecyclerView.g(view);
            if (g2.k()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g2.j()) {
                g2.n.b(g2);
            } else if (g2.o()) {
                g2.b();
            }
            a(g2);
        }

        public void a(a0 a0Var) {
            boolean z = false;
            boolean z2 = true;
            if (a0Var.j() || a0Var.f2452a.getParent() != null) {
                StringBuilder a2 = e.a.a.a.a.a("Scrapped or attached views may not be recycled. isScrap:");
                a2.append(a0Var.j());
                a2.append(" isAttached:");
                if (a0Var.f2452a.getParent() != null) {
                    z = true;
                }
                a2.append(z);
                throw new IllegalArgumentException(e.a.a.a.a.a(RecyclerView.this, a2));
            } else if (a0Var.k()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(a0Var);
                throw new IllegalArgumentException(e.a.a.a.a.a(RecyclerView.this, sb));
            } else if (!a0Var.n()) {
                boolean z3 = (a0Var.j & 16) == 0 && d.g.l.p.o(a0Var.f2452a);
                e eVar = RecyclerView.this.n;
                if (eVar == null || !z3 || eVar != null) {
                    if (a0Var.h()) {
                        if (this.f2492f <= 0 || a0Var.b(526)) {
                            z = false;
                        } else {
                            int size = this.f2489c.size();
                            if (size >= this.f2492f && size > 0) {
                                b(0);
                                size--;
                            }
                            if (RecyclerView.F0 && size > 0 && !RecyclerView.this.h0.a(a0Var.f2453c)) {
                                do {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                } while (RecyclerView.this.h0.a(this.f2489c.get(size).f2453c));
                                size++;
                            }
                            this.f2489c.add(size, a0Var);
                            z = true;
                        }
                        if (!z) {
                            a(a0Var, true);
                            RecyclerView.this.f2450h.d(a0Var);
                            if (!z && !z2 && z3) {
                                a0Var.r = null;
                                return;
                            }
                            return;
                        }
                    }
                    z2 = false;
                    RecyclerView.this.f2450h.d(a0Var);
                    if (!z) {
                        return;
                    }
                    return;
                }
                throw null;
            } else {
                throw new IllegalArgumentException(e.a.a.a.a.a(RecyclerView.this, e.a.a.a.a.a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x0431, code lost:
            if (r9.g() == false) goto L_0x0467;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0465, code lost:
            if ((r5 == 0 || r5 + r10 < r20) == false) goto L_0x0467;
         */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x023c  */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x03f9  */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x0423  */
        /* JADX WARNING: Removed duplicated region for block: B:234:0x044e  */
        /* JADX WARNING: Removed duplicated region for block: B:244:0x0470  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x050a  */
        /* JADX WARNING: Removed duplicated region for block: B:276:0x0511  */
        /* JADX WARNING: Removed duplicated region for block: B:287:0x0533  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.a0 a(int r18, boolean r19, long r20) {
            /*
            // Method dump skipped, instructions count: 1383
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }
    }

    public void a(l lVar) {
        m mVar = this.o;
        if (mVar != null) {
            mVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        this.q.add(lVar);
        o();
        requestLayout();
    }

    public boolean b(int i2) {
        return getScrollingChildHelper().a(i2) != null;
    }

    public boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, null);
    }

    public void b(boolean z2) {
        this.F = z2 | this.F;
        this.E = true;
        int b2 = this.f2449g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            a0 g2 = g(this.f2449g.d(i2));
            if (g2 != null && !g2.n()) {
                g2.a(6);
            }
        }
        o();
        s sVar = this.f2446d;
        int size = sVar.f2489c.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = sVar.f2489c.get(i3);
            if (a0Var != null) {
                a0Var.a(6);
                a0Var.a((Object) null);
            }
        }
        e eVar = RecyclerView.this.n;
        if (eVar == null || !eVar.b) {
            sVar.c();
        }
    }

    public void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.f2449g.b();
        for (int i5 = 0; i5 < b2; i5++) {
            a0 g2 = g(this.f2449g.d(i5));
            if (g2 != null && !g2.n()) {
                int i6 = g2.f2453c;
                if (i6 >= i4) {
                    g2.a(-i3, z2);
                } else if (i6 >= i2) {
                    g2.a(8);
                    g2.a(-i3, z2);
                    g2.f2453c = i2 - 1;
                }
                this.i0.f2514f = true;
            }
        }
        s sVar = this.f2446d;
        int size = sVar.f2489c.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = sVar.f2489c.get(size);
                if (a0Var != null) {
                    int i7 = a0Var.f2453c;
                    if (i7 >= i4) {
                        a0Var.a(-i3, z2);
                    } else if (i7 >= i2) {
                        a0Var.a(8);
                        sVar.b(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void a(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.G - 1;
        this.G = i3;
        if (i3 < 1) {
            this.G = 0;
            if (z2) {
                int i4 = this.B;
                this.B = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.D;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.x0.size() - 1; size >= 0; size--) {
                    a0 a0Var = this.x0.get(size);
                    if (a0Var.f2452a.getParent() == this && !a0Var.n() && (i2 = a0Var.q) != -1) {
                        d.g.l.p.a(a0Var.f2452a, i2);
                        a0Var.q = -1;
                    }
                }
                this.x0.clear();
            }
        }
    }

    public long c(a0 a0Var) {
        if (this.n.b) {
            return a0Var.f2455e;
        }
        return (long) a0Var.f2453c;
    }

    public void a(a0 a0Var, j.c cVar) {
        a0Var.a(0, 8192);
        if (this.i0.f2516h && a0Var.l() && !a0Var.i() && !a0Var.n()) {
            this.f2450h.b.c(c(a0Var), a0Var);
        }
        this.f2450h.b(a0Var, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r19, int r20, android.view.MotionEvent r21) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean");
    }

    public void a(int i2, int i3, int[] iArr) {
        a0 a0Var;
        u();
        p();
        Trace.beginSection("RV Scroll");
        a(this.i0);
        int a2 = i2 != 0 ? this.o.a(i2, this.f2446d, this.i0) : 0;
        int b2 = i3 != 0 ? this.o.b(i3, this.f2446d, this.i0) : 0;
        Trace.endSection();
        int a3 = this.f2449g.a();
        for (int i4 = 0; i4 < a3; i4++) {
            View b3 = this.f2449g.b(i4);
            a0 d2 = d(b3);
            if (!(d2 == null || (a0Var = d2.i) == null)) {
                View view = a0Var.f2452a;
                int left = b3.getLeft();
                int top = b3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        a(true);
        c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    public Rect e(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.f2482c) {
            return nVar.b;
        }
        if (this.i0.f2515g && (nVar.b() || nVar.f2481a.g())) {
            return nVar.b;
        }
        Rect rect = nVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.set(0, 0, 0, 0);
            this.q.get(i2).a(this.k, view, this, this.i0);
            int i3 = rect.left;
            Rect rect2 = this.k;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f2482c = false;
        return rect;
    }

    public void e(int i2, int i3) {
        m mVar = this.o;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.z) {
            if (!mVar.a()) {
                i2 = 0;
            }
            if (!this.o.b()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                z zVar = this.f0;
                zVar.a(i2, i3, zVar.a(i2, i3, 0, 0), J0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d(int, int):boolean");
    }
}

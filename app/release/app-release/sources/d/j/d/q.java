package d.j.d;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import d.j.d.g0;
import d.j.d.z;
import d.l.e;
import d.l.h;
import d.l.i;
import d.l.r;
import d.l.s;
import d.l.t;
import d.l.u;
import d.l.v;
import d.m.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class q {
    public ArrayList<Fragment> A;
    public ArrayList<f> B;
    public u C;
    public Runnable D = new d();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f3491a = new ArrayList<>();
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final y f3492c = new y();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f3493d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f3494e;

    /* renamed from: f  reason: collision with root package name */
    public final o f3495f = new o(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f3496g;

    /* renamed from: h  reason: collision with root package name */
    public final d.a.b f3497h = new a(false);
    public final AtomicInteger i = new AtomicInteger();
    public ConcurrentHashMap<Fragment, HashSet<d.g.h.a>> j = new ConcurrentHashMap<>();
    public final g0.a k = new b();
    public final p l = new p(this);
    public int m = -1;
    public n<?> n;
    public j o;
    public Fragment p;
    public Fragment q;
    public m r = null;
    public m s = new c();
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a> y;
    public ArrayList<Boolean> z;

    public class a extends d.a.b {
        public a(boolean z) {
            super(z);
        }
    }

    public class b implements g0.a {
        public b() {
        }

        public void a(Fragment fragment, d.g.h.a aVar) {
            if (!aVar.b()) {
                q qVar = q.this;
                HashSet<d.g.h.a> hashSet = qVar.j.get(fragment);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    qVar.j.remove(fragment);
                    if (fragment.f2391c < 3) {
                        qVar.e(fragment);
                        qVar.a(fragment, fragment.o());
                    }
                }
            }
        }

        public void b(Fragment fragment, d.g.h.a aVar) {
            q qVar = q.this;
            if (qVar.j.get(fragment) == null) {
                qVar.j.put(fragment, new HashSet<>());
            }
            qVar.j.get(fragment).add(aVar);
        }
    }

    public class c extends m {
        public c() {
        }

        @Override // d.j.d.m
        public Fragment a(ClassLoader classLoader, String str) {
            n<?> nVar = q.this.n;
            Context context = nVar.f3481d;
            if (nVar != null) {
                return Fragment.a(context, str, (Bundle) null);
            }
            throw null;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            q.this.d(true);
        }
    }

    public interface e {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public static class f implements Fragment.d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3501a;
        public final a b;

        /* renamed from: c  reason: collision with root package name */
        public int f3502c;

        public f(a aVar, boolean z) {
            this.f3501a = z;
            this.b = aVar;
        }

        public void a() {
            boolean z = this.f3502c > 0;
            for (Fragment fragment : this.b.q.f3492c.c()) {
                fragment.a((Fragment.d) null);
                if (z) {
                    Fragment.b bVar = fragment.L;
                    if (bVar == null ? false : bVar.p) {
                        fragment.z();
                    }
                }
            }
            a aVar = this.b;
            aVar.q.a(aVar, this.f3501a, !z, true);
        }
    }

    public static boolean c(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public Fragment a(String str) {
        return this.f3492c.b(str);
    }

    public final void a() {
        this.b = false;
        this.z.clear();
        this.y.clear();
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        try {
            this.b = true;
            this.f3492c.a(i2);
            a(i2, false);
            this.b = false;
            d(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void a(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        l(fragment);
        if (!fragment.B) {
            this.f3492c.a(fragment);
            fragment.n = false;
            if (fragment.I == null) {
                fragment.N = false;
            }
            if (j(fragment)) {
                this.t = true;
            }
        }
    }

    public void a(Fragment fragment, e.b bVar) {
        if (!fragment.equals(a(fragment.f2395g)) || !(fragment.u == null || fragment.t == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.R = bVar;
    }

    public void a(Fragment fragment, boolean z2) {
        ViewGroup h2 = h(fragment);
        if (h2 != null && (h2 instanceof k)) {
            ((k) h2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void a(d.d.c<Fragment> cVar) {
        int i2 = this.m;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment fragment : this.f3492c.c()) {
                if (fragment.f2391c < min) {
                    a(fragment, min);
                    if (fragment.I != null && !fragment.A && fragment.M) {
                        cVar.add(fragment);
                    }
                }
            }
        }
    }

    public void a(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.a(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            g0.a(this, arrayList, arrayList2, 0, 1, true, this.k);
        }
        if (z4) {
            a(this.m, true);
        }
        Iterator it = ((ArrayList) this.f3492c.b()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.I != null && fragment.M && aVar.b(fragment.y)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.I.setAlpha(f2);
                }
                if (z4) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: d.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(n<?> nVar, j jVar, Fragment fragment) {
        if (this.n == null) {
            this.n = nVar;
            this.o = jVar;
            this.p = fragment;
            if (fragment != null) {
                o();
            }
            if (nVar instanceof d.a.c) {
                d.a.c cVar = (d.a.c) nVar;
                this.f3496g = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                OnBackPressedDispatcher onBackPressedDispatcher = this.f3496g;
                d.a.b bVar = this.f3497h;
                if (onBackPressedDispatcher != null) {
                    d.l.e a2 = fragment2.a();
                    if (((i) a2).b != e.b.DESTROYED) {
                        bVar.b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(a2, bVar));
                    }
                } else {
                    throw null;
                }
            }
            if (fragment != null) {
                u uVar = fragment.t.C;
                u uVar2 = uVar.f3512c.get(fragment.f2395g);
                if (uVar2 == null) {
                    uVar2 = new u(uVar.f3514e);
                    uVar.f3512c.put(fragment.f2395g, uVar2);
                }
                this.C = uVar2;
            } else if (nVar instanceof v) {
                u e2 = ((v) nVar).e();
                r rVar = u.f3511h;
                String canonicalName = u.class.getCanonicalName();
                if (canonicalName != null) {
                    String b2 = e.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    d.l.q qVar = e2.f3568a.get(b2);
                    if (!u.class.isInstance(qVar)) {
                        qVar = rVar instanceof s ? ((s) rVar).a(b2, u.class) : rVar.a(u.class);
                        d.l.q put = e2.f3568a.put(b2, qVar);
                        if (put != null) {
                            put.b();
                        }
                    } else if (rVar instanceof t) {
                        t tVar = (t) rVar;
                    }
                    this.C = (u) qVar;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            } else {
                this.C = new u(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void b() {
        this.u = false;
        this.v = false;
        a(1);
    }

    public void b(Fragment fragment) {
        boolean z2;
        if (!i()) {
            u uVar = this.C;
            if (uVar.b.containsKey(fragment.f2395g)) {
                z2 = false;
            } else {
                uVar.b.put(fragment.f2395g, fragment);
                z2 = true;
            }
            if (z2 && c(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        } else if (c(2)) {
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        }
    }

    public void c() {
        this.w = true;
        d(true);
        f();
        a(-1);
        this.n = null;
        this.o = null;
        this.p = null;
        if (this.f3496g != null) {
            Iterator<d.a.a> it = this.f3497h.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f3496g = null;
        }
    }

    public void c(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (!fragment.m) {
                this.f3492c.a(fragment);
                if (c(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (j(fragment)) {
                    this.t = true;
                }
            }
        }
    }

    public final void c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                a(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).o) {
                        if (i3 != i2) {
                            a(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).o) {
                                i3++;
                            }
                        }
                        a(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    a(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public void d() {
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                fragment.onLowMemory();
                fragment.v.d();
            }
        }
    }

    public final void d(Fragment fragment) {
        HashSet<d.g.h.a> hashSet = this.j.get(fragment);
        if (hashSet != null) {
            Iterator<d.g.h.a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            e(fragment);
            this.j.remove(fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean d(boolean z2) {
        c(z2);
        boolean z3 = false;
        while (b(this.y, this.z)) {
            this.b = true;
            try {
                c(this.y, this.z);
                a();
                z3 = true;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        o();
        e();
        this.f3492c.a();
        return z3;
    }

    public final void e() {
        if (this.x) {
            this.x = false;
            n();
        }
    }

    public final void e(Fragment fragment) {
        fragment.v.a(1);
        if (fragment.I != null) {
            q0 q0Var = fragment.T;
            q0Var.f3503c.a(e.a.ON_DESTROY);
        }
        fragment.f2391c = 1;
        fragment.G = false;
        fragment.u();
        if (fragment.G) {
            b.c cVar = ((d.m.a.b) d.m.a.a.a(fragment)).b;
            int c2 = cVar.b.c();
            for (int i2 = 0; i2 < c2; i2++) {
                h hVar = cVar.b.d(i2).j;
            }
            fragment.r = false;
            this.l.g(fragment, false);
            fragment.H = null;
            fragment.I = null;
            fragment.T = null;
            fragment.U.a((h) null);
            fragment.p = false;
            return;
        }
        throw new r0(e.a.a.a.a.a("Fragment ", fragment, " did not call through to super.onDestroyView()"));
    }

    public final void f() {
        if (!this.j.isEmpty()) {
            for (Fragment fragment : this.j.keySet()) {
                d(fragment);
                a(fragment, fragment.o());
            }
        }
    }

    public void f(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.m) {
                if (c(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3492c.b(fragment);
                if (j(fragment)) {
                    this.t = true;
                }
                r(fragment);
            }
        }
    }

    public final void g() {
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                this.B.remove(0).a();
            }
        }
    }

    public final void g(Fragment fragment) {
        if (fragment != null && fragment.equals(a(fragment.f2395g))) {
            boolean k2 = fragment.t.k(fragment);
            Boolean bool = fragment.l;
            if (bool == null || bool.booleanValue() != k2) {
                fragment.l = Boolean.valueOf(k2);
                q qVar = fragment.v;
                qVar.o();
                qVar.g(qVar.q);
            }
        }
    }

    public final ViewGroup h(Fragment fragment) {
        if (fragment.y > 0 && this.o.d()) {
            View a2 = this.o.a(fragment.y);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    public m h() {
        m mVar = this.r;
        if (mVar != null) {
            return mVar;
        }
        Fragment fragment = this.p;
        return fragment != null ? fragment.t.h() : this.s;
    }

    public void i(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            fragment.N = true ^ fragment.N;
            r(fragment);
        }
    }

    public boolean i() {
        return this.u || this.v;
    }

    public final boolean j(Fragment fragment) {
        boolean z2;
        if (fragment.E && fragment.F) {
            return true;
        }
        q qVar = fragment.v;
        Iterator it = ((ArrayList) qVar.f3492c.b()).iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z3 = qVar.j(fragment2);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    public boolean k(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        q qVar = fragment.t;
        if (!fragment.equals(qVar.q) || !k(qVar.p)) {
            return false;
        }
        return true;
    }

    public void l(Fragment fragment) {
        if (!this.f3492c.a(fragment.f2395g)) {
            x xVar = new x(this.l, fragment);
            xVar.a(this.n.f3481d.getClassLoader());
            this.f3492c.b.put(xVar.b.f2395g, xVar);
            if (fragment.D) {
                if (fragment.C) {
                    b(fragment);
                } else {
                    p(fragment);
                }
                fragment.D = false;
            }
            xVar.f3528c = this.m;
            if (c(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    public void m(Fragment fragment) {
        Animator animator;
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (this.f3492c.a(fragment.f2395g)) {
            a(fragment, this.m);
            View view = fragment.I;
            if (view != null) {
                y yVar = this.f3492c;
                Fragment fragment2 = null;
                if (yVar != null) {
                    ViewGroup viewGroup2 = fragment.H;
                    if (viewGroup2 != null && view != null) {
                        int indexOf = yVar.f3529a.indexOf(fragment);
                        while (true) {
                            indexOf--;
                            if (indexOf < 0) {
                                break;
                            }
                            Fragment fragment3 = yVar.f3529a.get(indexOf);
                            if (fragment3.H == viewGroup2 && fragment3.I != null) {
                                fragment2 = fragment3;
                                break;
                            }
                        }
                    }
                    if (fragment2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.I)) < (indexOfChild = (viewGroup = fragment.H).indexOfChild(fragment2.I))) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.I, indexOfChild);
                    }
                    if (fragment.M && fragment.H != null) {
                        float f2 = fragment.O;
                        if (f2 > 0.0f) {
                            fragment.I.setAlpha(f2);
                        }
                        fragment.O = 0.0f;
                        fragment.M = false;
                        h a2 = c.a.a.a.a.a(this.n.f3481d, this.o, fragment, true);
                        if (a2 != null) {
                            Animation animation = a2.f3454a;
                            if (animation != null) {
                                fragment.I.startAnimation(animation);
                            } else {
                                a2.b.setTarget(fragment.I);
                                a2.b.start();
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            if (fragment.N) {
                if (fragment.I != null) {
                    h a3 = c.a.a.a.a.a(this.n.f3481d, this.o, fragment, !fragment.A);
                    if (a3 == null || (animator = a3.b) == null) {
                        if (a3 != null) {
                            fragment.I.startAnimation(a3.f3454a);
                            a3.f3454a.start();
                        }
                        fragment.I.setVisibility((!fragment.A || fragment.q()) ? 0 : 8);
                        if (fragment.q()) {
                            fragment.a(false);
                        }
                    } else {
                        animator.setTarget(fragment.I);
                        if (!fragment.A) {
                            fragment.I.setVisibility(0);
                        } else if (fragment.q()) {
                            fragment.a(false);
                        } else {
                            ViewGroup viewGroup3 = fragment.H;
                            View view2 = fragment.I;
                            viewGroup3.startViewTransition(view2);
                            a3.b.addListener(new r(this, viewGroup3, view2, fragment));
                        }
                        a3.b.start();
                    }
                }
                if (fragment.m && j(fragment)) {
                    this.t = true;
                }
                fragment.N = false;
            }
        } else if (c(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.m + "since it is not added to " + this);
        }
    }

    public final void n() {
        Iterator it = ((ArrayList) this.f3492c.b()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                n(fragment);
            }
        }
    }

    public void n(Fragment fragment) {
        if (!fragment.J) {
            return;
        }
        if (this.b) {
            this.x = true;
            return;
        }
        fragment.J = false;
        a(fragment, this.m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (k(r4.p) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f2647a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f3497h;
        r1 = r4.f3493d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r4 = this;
            java.util.ArrayList<d.j.d.q$e> r0 = r4.f3491a
            monitor-enter(r0)
            java.util.ArrayList<d.j.d.q$e> r1 = r4.f3491a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            d.a.b r1 = r4.f3497h     // Catch:{ all -> 0x002f }
            r1.f2647a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            d.a.b r0 = r4.f3497h
            java.util.ArrayList<d.j.d.a> r1 = r4.f3493d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.p
            boolean r1 = r4.k(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.f2647a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.q.o():void");
    }

    public void o(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.s);
        }
        boolean z2 = !fragment.r();
        if (!fragment.B || z2) {
            this.f3492c.b(fragment);
            if (j(fragment)) {
                this.t = true;
            }
            fragment.n = true;
            r(fragment);
        }
    }

    public void p(Fragment fragment) {
        if (!i()) {
            if ((this.C.b.remove(fragment.f2395g) != null) && c(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (c(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public void q(Fragment fragment) {
        if (fragment == null || (fragment.equals(a(fragment.f2395g)) && (fragment.u == null || fragment.t == this))) {
            Fragment fragment2 = this.q;
            this.q = fragment;
            g(fragment2);
            g(this.q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void r(Fragment fragment) {
        ViewGroup h2 = h(fragment);
        if (h2 != null) {
            if (h2.getTag(d.j.b.visible_removing_fragment_view_tag) == null) {
                h2.setTag(d.j.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) h2.getTag(d.j.b.visible_removing_fragment_view_tag)).a(fragment.l());
        }
    }

    public void s(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.N = !fragment.N;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.p;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.p;
        } else {
            sb.append(this.n.getClass().getSimpleName());
            sb.append("{");
            obj = this.n;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void j() {
        this.u = false;
        this.v = false;
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                fragment.v.j();
            }
        }
    }

    public boolean b(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                if (!fragment.A && fragment.v.b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.n == null) {
            if (this.w) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.n.f3482e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !i()) {
            if (this.y == null) {
                this.y = new ArrayList<>();
                this.z = new ArrayList<>();
            }
            this.b = true;
            try {
                a((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean k() {
        int size;
        boolean z2 = false;
        d(false);
        c(true);
        Fragment fragment = this.q;
        if (fragment != null && fragment.h().k()) {
            return true;
        }
        ArrayList<a> arrayList = this.y;
        ArrayList<Boolean> arrayList2 = this.z;
        ArrayList<a> arrayList3 = this.f3493d;
        if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
            arrayList.add(this.f3493d.remove(size));
            arrayList2.add(true);
            z2 = true;
        }
        if (z2) {
            this.b = true;
            try {
                c(this.y, this.z);
            } finally {
                a();
            }
        }
        o();
        e();
        this.f3492c.a();
        return z2;
    }

    public void b(boolean z2) {
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                fragment.v.b(z2);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.m < 1) {
            return false;
        }
        boolean z2 = false;
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                if (!fragment.A ? fragment.v.b(menu) | false : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public Fragment b(int i2) {
        y yVar = this.f3492c;
        int size = yVar.f3529a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = yVar.f3529a.get(size);
                if (fragment != null && fragment.x == i2) {
                    return fragment;
                }
            } else {
                for (x xVar : yVar.b.values()) {
                    if (xVar != null) {
                        Fragment fragment2 = xVar.b;
                        if (fragment2.x == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment c(String str) {
        Fragment a2;
        for (x xVar : this.f3492c.b.values()) {
            if (!(xVar == null || (a2 = xVar.b.a(str)) == null)) {
                return a2;
            }
        }
        return null;
    }

    public Fragment b(String str) {
        y yVar = this.f3492c;
        if (yVar != null) {
            if (str != null) {
                int size = yVar.f3529a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment = yVar.f3529a.get(size);
                    if (fragment != null && str.equals(fragment.z)) {
                        return fragment;
                    }
                }
            }
            if (str == null) {
                return null;
            }
            for (x xVar : yVar.b.values()) {
                if (xVar != null) {
                    Fragment fragment2 = xVar.b;
                    if (str.equals(fragment2.z)) {
                        return fragment2;
                    }
                }
            }
            return null;
        }
        throw null;
    }

    public Parcelable l() {
        int i2;
        int size;
        g();
        f();
        d(true);
        this.u = true;
        y yVar = this.f3492c;
        b[] bVarArr = null;
        if (yVar != null) {
            ArrayList<w> arrayList = new ArrayList<>(yVar.b.size());
            Iterator<x> it = yVar.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x next = it.next();
                if (next != null) {
                    Fragment fragment = next.b;
                    w wVar = new w(next.b);
                    if (next.b.f2391c <= -1 || wVar.o != null) {
                        wVar.o = next.b.f2392d;
                    } else {
                        Bundle bundle = new Bundle();
                        Fragment fragment2 = next.b;
                        fragment2.V.b(bundle);
                        Parcelable l2 = fragment2.v.l();
                        if (l2 != null) {
                            bundle.putParcelable("android:support:fragments", l2);
                        }
                        next.f3527a.d(next.b, bundle, false);
                        if (bundle.isEmpty()) {
                            bundle = null;
                        }
                        if (next.b.I != null) {
                            next.a();
                        }
                        if (next.b.f2393e != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", next.b.f2393e);
                        }
                        if (!next.b.K) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", next.b.K);
                        }
                        wVar.o = bundle;
                        if (next.b.j != null) {
                            if (bundle == null) {
                                wVar.o = new Bundle();
                            }
                            wVar.o.putString("android:target_state", next.b.j);
                            int i3 = next.b.k;
                            if (i3 != 0) {
                                wVar.o.putInt("android:target_req_state", i3);
                            }
                        }
                    }
                    arrayList.add(wVar);
                    if (c(2)) {
                        Log.v("FragmentManager", "Saved state of " + fragment + ": " + wVar.o);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (c(2)) {
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                }
                return null;
            }
            ArrayList<String> d2 = this.f3492c.d();
            ArrayList<a> arrayList2 = this.f3493d;
            if (arrayList2 != null && (size = arrayList2.size()) > 0) {
                bVarArr = new b[size];
                for (i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new b(this.f3493d.get(i2));
                    if (c(2)) {
                        StringBuilder a2 = e.a.a.a.a.a("saveAllState: adding back stack #", i2, ": ");
                        a2.append(this.f3493d.get(i2));
                        Log.v("FragmentManager", a2.toString());
                    }
                }
            }
            t tVar = new t();
            tVar.f3506c = arrayList;
            tVar.f3507d = d2;
            tVar.f3508e = bVarArr;
            tVar.f3509f = this.i.get();
            Fragment fragment3 = this.q;
            if (fragment3 != null) {
                tVar.f3510g = fragment3.f2395g;
            }
            return tVar;
        }
        throw null;
    }

    public final boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3491a) {
            if (this.f3491a.isEmpty()) {
                return false;
            }
            int size = this.f3491a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.f3491a.get(i2).a(arrayList, arrayList2);
            }
            this.f3491a.clear();
            this.n.f3482e.removeCallbacks(this.D);
            return z2;
        }
    }

    public void m() {
        synchronized (this.f3491a) {
            boolean z2 = false;
            boolean z3 = this.B != null && !this.B.isEmpty();
            if (this.f3491a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.n.f3482e.removeCallbacks(this.D);
                this.n.f3482e.post(this.D);
                o();
            }
        }
    }

    public void a(Configuration configuration) {
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                fragment.G = true;
                fragment.v.a(configuration);
            }
        }
    }

    public boolean a(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                if (!fragment.A && fragment.v.a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                if (!fragment.A ? fragment.v.a(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                }
            }
        }
        if (this.f3494e != null) {
            for (int i2 = 0; i2 < this.f3494e.size(); i2++) {
                Fragment fragment2 = this.f3494e.get(i2);
                if ((arrayList == null || !arrayList.contains(fragment2)) && fragment2 == null) {
                    throw null;
                }
            }
        }
        this.f3494e = arrayList;
        return z2;
    }

    public void a(boolean z2) {
        for (Fragment fragment : this.f3492c.c()) {
            if (fragment != null) {
                fragment.v.a(z2);
            }
        }
    }

    public void a(Menu menu) {
        if (this.m >= 1) {
            for (Fragment fragment : this.f3492c.c()) {
                if (fragment != null && !fragment.A) {
                    fragment.v.a(menu);
                }
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String b2 = e.a.a.a.a.b(str, "    ");
        y yVar = this.f3492c;
        if (yVar != null) {
            String b3 = e.a.a.a.a.b(str, "    ");
            if (!yVar.b.isEmpty()) {
                printWriter.print(str);
                printWriter.print("Active Fragments:");
                for (x xVar : yVar.b.values()) {
                    printWriter.print(str);
                    if (xVar != null) {
                        Fragment fragment = xVar.b;
                        printWriter.println(fragment);
                        fragment.a(b3, fileDescriptor, printWriter, strArr);
                    } else {
                        printWriter.println("null");
                    }
                }
            }
            int size3 = yVar.f3529a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (int i2 = 0; i2 < size3; i2++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(yVar.f3529a.get(i2).toString());
                }
            }
            ArrayList<Fragment> arrayList = this.f3494e;
            if (arrayList != null && (size2 = arrayList.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size2; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3494e.get(i3).toString());
                }
            }
            ArrayList<a> arrayList2 = this.f3493d;
            if (arrayList2 != null && (size = arrayList2.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size; i4++) {
                    a aVar = this.f3493d.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.a(b2, printWriter, true);
                }
            }
            printWriter.print(str);
            printWriter.println("Back Stack Index: " + this.i.get());
            synchronized (this.f3491a) {
                int size4 = this.f3491a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println((e) this.f3491a.get(i5));
                    }
                }
            }
            printWriter.print(str);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(str);
            printWriter.print("  mHost=");
            printWriter.println(this.n);
            printWriter.print(str);
            printWriter.print("  mContainer=");
            printWriter.println(this.o);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("  mParent=");
                printWriter.println(this.p);
            }
            printWriter.print(str);
            printWriter.print("  mCurState=");
            printWriter.print(this.m);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.u);
            printWriter.print(" mStopped=");
            printWriter.print(this.v);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.w);
            if (this.t) {
                printWriter.print(str);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.t);
                return;
            }
            return;
        }
        throw null;
    }

    public void a(e eVar, boolean z2) {
        if (!z2) {
            if (this.n == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (i()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3491a) {
            if (this.n != null) {
                this.f3491a.add(eVar);
                m();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z3 = arrayList.get(i2).o;
        ArrayList<Fragment> arrayList4 = this.A;
        if (arrayList4 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.A.addAll(this.f3492c.c());
        Fragment fragment = this.q;
        int i8 = i2;
        boolean z4 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i3) {
                a aVar = arrayList.get(i8);
                int i10 = 3;
                if (!arrayList3.get(i8).booleanValue()) {
                    ArrayList<Fragment> arrayList5 = this.A;
                    int i11 = 0;
                    while (i11 < aVar.f3530a.size()) {
                        z.a aVar2 = aVar.f3530a.get(i11);
                        int i12 = aVar2.f3537a;
                        if (i12 != i9) {
                            if (i12 == 2) {
                                Fragment fragment2 = aVar2.b;
                                int i13 = fragment2.y;
                                int size = arrayList5.size() - 1;
                                boolean z5 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList5.get(size);
                                    if (fragment3.y != i13) {
                                        i7 = i13;
                                    } else if (fragment3 == fragment2) {
                                        i7 = i13;
                                        z5 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i7 = i13;
                                            aVar.f3530a.add(i11, new z.a(9, fragment3));
                                            i11++;
                                            fragment = null;
                                        } else {
                                            i7 = i13;
                                        }
                                        z.a aVar3 = new z.a(3, fragment3);
                                        aVar3.f3538c = aVar2.f3538c;
                                        aVar3.f3540e = aVar2.f3540e;
                                        aVar3.f3539d = aVar2.f3539d;
                                        aVar3.f3541f = aVar2.f3541f;
                                        aVar.f3530a.add(i11, aVar3);
                                        arrayList5.remove(fragment3);
                                        i11++;
                                    }
                                    size--;
                                    i13 = i7;
                                }
                                if (z5) {
                                    aVar.f3530a.remove(i11);
                                    i11--;
                                } else {
                                    i6 = 1;
                                    aVar2.f3537a = 1;
                                    arrayList5.add(fragment2);
                                    i11 += i6;
                                    i10 = 3;
                                    i9 = 1;
                                }
                            } else if (i12 == i10 || i12 == 6) {
                                arrayList5.remove(aVar2.b);
                                Fragment fragment4 = aVar2.b;
                                if (fragment4 == fragment) {
                                    aVar.f3530a.add(i11, new z.a(9, fragment4));
                                    i11++;
                                    fragment = null;
                                }
                            } else if (i12 != 7) {
                                if (i12 == 8) {
                                    aVar.f3530a.add(i11, new z.a(9, fragment));
                                    i11++;
                                    fragment = aVar2.b;
                                }
                            }
                            i6 = 1;
                            i11 += i6;
                            i10 = 3;
                            i9 = 1;
                        }
                        i6 = 1;
                        arrayList5.add(aVar2.b);
                        i11 += i6;
                        i10 = 3;
                        i9 = 1;
                    }
                } else {
                    ArrayList<Fragment> arrayList6 = this.A;
                    for (int size2 = aVar.f3530a.size() - 1; size2 >= 0; size2--) {
                        z.a aVar4 = aVar.f3530a.get(size2);
                        int i14 = aVar4.f3537a;
                        if (i14 != 1) {
                            if (i14 != 3) {
                                switch (i14) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.f3543h = aVar4.f3542g;
                                        break;
                                }
                            }
                            arrayList6.add(aVar4.b);
                        }
                        arrayList6.remove(aVar4.b);
                    }
                }
                z4 = z4 || aVar.f3535g;
                i8++;
                arrayList3 = arrayList2;
            } else {
                this.A.clear();
                if (!z3) {
                    g0.a(this, arrayList, arrayList2, i2, i3, false, this.k);
                }
                int i15 = i2;
                while (i15 < i3) {
                    a aVar5 = arrayList.get(i15);
                    if (arrayList2.get(i15).booleanValue()) {
                        aVar5.a(-1);
                        aVar5.a(i15 == i3 + -1);
                    } else {
                        aVar5.a(1);
                        aVar5.c();
                    }
                    i15++;
                }
                if (z3) {
                    d.d.c<Fragment> cVar = new d.d.c<>();
                    a(cVar);
                    i4 = i2;
                    int i16 = i3;
                    for (int i17 = i3 - 1; i17 >= i4; i17--) {
                        a aVar6 = arrayList.get(i17);
                        boolean booleanValue = arrayList2.get(i17).booleanValue();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= aVar6.f3530a.size()) {
                                z2 = false;
                            } else if (a.b(aVar6.f3530a.get(i18))) {
                                z2 = true;
                            } else {
                                i18++;
                            }
                        }
                        if (z2 && !aVar6.a(arrayList, i17 + 1, i3)) {
                            if (this.B == null) {
                                this.B = new ArrayList<>();
                            }
                            f fVar = new f(aVar6, booleanValue);
                            this.B.add(fVar);
                            for (int i19 = 0; i19 < aVar6.f3530a.size(); i19++) {
                                z.a aVar7 = aVar6.f3530a.get(i19);
                                if (a.b(aVar7)) {
                                    aVar7.b.a(fVar);
                                }
                            }
                            if (booleanValue) {
                                aVar6.c();
                            } else {
                                aVar6.a(false);
                            }
                            i16--;
                            if (i17 != i16) {
                                arrayList.remove(i17);
                                arrayList.add(i16, aVar6);
                            }
                            a(cVar);
                        }
                    }
                    int i20 = cVar.f3067e;
                    for (int i21 = 0; i21 < i20; i21++) {
                        Fragment fragment5 = (Fragment) cVar.f3066d[i21];
                        if (!fragment5.m) {
                            View y2 = fragment5.y();
                            fragment5.O = y2.getAlpha();
                            y2.setAlpha(0.0f);
                        }
                    }
                    i5 = i16;
                } else {
                    i4 = i2;
                    i5 = i3;
                }
                if (i5 != i4 && z3) {
                    g0.a(this, arrayList, arrayList2, i2, i5, true, this.k);
                    a(this.m, true);
                }
                while (i4 < i3) {
                    a aVar8 = arrayList.get(i4);
                    if (arrayList2.get(i4).booleanValue() && aVar8.s >= 0) {
                        aVar8.s = -1;
                    }
                    if (aVar8.p != null) {
                        for (int i22 = 0; i22 < aVar8.p.size(); i22++) {
                            aVar8.p.get(i22).run();
                        }
                        aVar8.p = null;
                    }
                    i4++;
                }
                return;
            }
        }
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<f> arrayList3 = this.B;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            f fVar = this.B.get(i2);
            if (arrayList == null || fVar.f3501a || (indexOf2 = arrayList.indexOf(fVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((fVar.f3502c == 0) || (arrayList != null && fVar.b.a(arrayList, 0, arrayList.size()))) {
                    this.B.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || fVar.f3501a || (indexOf = arrayList.indexOf(fVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        fVar.a();
                    }
                }
                i2++;
            } else {
                this.B.remove(i2);
                i2--;
                size--;
            }
            a aVar = fVar.b;
            aVar.q.a(aVar, fVar.f3501a, false, false);
            i2++;
        }
    }

    public void a(int i2, boolean z2) {
        n<?> nVar;
        if (this.n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.m) {
            this.m = i2;
            for (Fragment fragment : this.f3492c.c()) {
                m(fragment);
            }
            Iterator it = ((ArrayList) this.f3492c.b()).iterator();
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null && !fragment2.M) {
                    m(fragment2);
                }
            }
            n();
            if (this.t && (nVar = this.n) != null && this.m == 4) {
                d.this.g();
                this.t = false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: d.j.d.p */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: d.j.d.p */
    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: java.util.HashMap<java.lang.String, d.j.d.x> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [d.j.d.q, android.view.LayoutInflater, androidx.fragment.app.Fragment, d.j.d.n<?>, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r1 != 3) goto L_0x0846;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x060b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020f  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r19, int r20) {
        /*
        // Method dump skipped, instructions count: 2170
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.q.a(androidx.fragment.app.Fragment, int):void");
    }

    public void a(Parcelable parcelable) {
        x xVar;
        if (parcelable != null) {
            t tVar = (t) parcelable;
            if (tVar.f3506c != null) {
                this.f3492c.b.clear();
                Iterator<w> it = tVar.f3506c.iterator();
                while (it.hasNext()) {
                    w next = it.next();
                    if (next != null) {
                        Fragment fragment = this.C.b.get(next.f3522d);
                        if (fragment != null) {
                            if (c(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                            }
                            xVar = new x(this.l, fragment, next);
                        } else {
                            xVar = new x(this.l, this.n.f3481d.getClassLoader(), h(), next);
                        }
                        Fragment fragment2 = xVar.b;
                        fragment2.t = this;
                        if (c(2)) {
                            StringBuilder a2 = e.a.a.a.a.a("restoreSaveState: active (");
                            a2.append(fragment2.f2395g);
                            a2.append("): ");
                            a2.append(fragment2);
                            Log.v("FragmentManager", a2.toString());
                        }
                        xVar.a(this.n.f3481d.getClassLoader());
                        this.f3492c.b.put(xVar.b.f2395g, xVar);
                        xVar.f3528c = this.m;
                    }
                }
                for (Fragment fragment3 : this.C.b.values()) {
                    if (!this.f3492c.a(fragment3.f2395g)) {
                        if (c(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + tVar.f3506c);
                        }
                        a(fragment3, 1);
                        fragment3.n = true;
                        a(fragment3, -1);
                    }
                }
                y yVar = this.f3492c;
                ArrayList<String> arrayList = tVar.f3507d;
                yVar.f3529a.clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        Fragment b2 = yVar.b(str);
                        if (b2 != null) {
                            if (c(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b2);
                            }
                            yVar.a(b2);
                        } else {
                            throw new IllegalStateException(e.a.a.a.a.a("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                if (tVar.f3508e != null) {
                    this.f3493d = new ArrayList<>(tVar.f3508e.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = tVar.f3508e;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i2];
                        if (bVar != null) {
                            a aVar = new a(this);
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < bVar.f3407c.length) {
                                z.a aVar2 = new z.a();
                                int i5 = i3 + 1;
                                aVar2.f3537a = bVar.f3407c[i3];
                                if (c(2)) {
                                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + bVar.f3407c[i5]);
                                }
                                String str2 = bVar.f3408d.get(i4);
                                aVar2.b = str2 != null ? this.f3492c.b(str2) : null;
                                aVar2.f3542g = e.b.values()[bVar.f3409e[i4]];
                                aVar2.f3543h = e.b.values()[bVar.f3410f[i4]];
                                int[] iArr = bVar.f3407c;
                                int i6 = i5 + 1;
                                int i7 = iArr[i5];
                                aVar2.f3538c = i7;
                                int i8 = i6 + 1;
                                int i9 = iArr[i6];
                                aVar2.f3539d = i9;
                                int i10 = i8 + 1;
                                int i11 = iArr[i8];
                                aVar2.f3540e = i11;
                                int i12 = iArr[i10];
                                aVar2.f3541f = i12;
                                aVar.b = i7;
                                aVar.f3531c = i9;
                                aVar.f3532d = i11;
                                aVar.f3533e = i12;
                                aVar.a(aVar2);
                                i4++;
                                i3 = i10 + 1;
                            }
                            aVar.f3534f = bVar.f3411g;
                            aVar.f3536h = bVar.f3412h;
                            aVar.s = bVar.i;
                            aVar.f3535g = true;
                            aVar.i = bVar.j;
                            aVar.j = bVar.k;
                            aVar.k = bVar.l;
                            aVar.l = bVar.m;
                            aVar.m = bVar.n;
                            aVar.n = bVar.o;
                            aVar.o = bVar.p;
                            aVar.a(1);
                            if (c(2)) {
                                StringBuilder a3 = e.a.a.a.a.a("restoreAllState: back stack #", i2, " (index ");
                                a3.append(aVar.s);
                                a3.append("): ");
                                a3.append(aVar);
                                Log.v("FragmentManager", a3.toString());
                                PrintWriter printWriter = new PrintWriter(new d.g.k.a("FragmentManager"));
                                aVar.a("  ", printWriter, false);
                                printWriter.close();
                            }
                            this.f3493d.add(aVar);
                            i2++;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.f3493d = null;
                }
                this.i.set(tVar.f3509f);
                String str3 = tVar.f3510g;
                if (str3 != null) {
                    Fragment b3 = this.f3492c.b(str3);
                    this.q = b3;
                    g(b3);
                }
            }
        }
    }
}

package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.j.d.d;
import d.j.d.n;
import d.j.d.q;
import d.j.d.q0;
import d.j.d.s;
import d.l.e;
import d.l.f;
import d.l.h;
import d.l.i;
import d.l.m;
import d.l.u;
import d.l.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, h, v, d.p.c {
    public static final Object W = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F = true;
    public boolean G;
    public ViewGroup H;
    public View I;
    public boolean J;
    public boolean K = true;
    public b L;
    public boolean M;
    public boolean N;
    public float O;
    public LayoutInflater P;
    public boolean Q;
    public e.b R = e.b.RESUMED;
    public i S;
    public q0 T;
    public m<h> U = new m<>();
    public d.p.b V;

    /* renamed from: c  reason: collision with root package name */
    public int f2391c = -1;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2392d;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<Parcelable> f2393e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f2394f;

    /* renamed from: g  reason: collision with root package name */
    public String f2395g = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    public Bundle f2396h;
    public Fragment i;
    public String j = null;
    public int k;
    public Boolean l = null;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public q t;
    public n<?> u;
    public q v = new s();
    public Fragment w;
    public int x;
    public int y;
    public String z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.d();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f2399a;
        public Animator b;

        /* renamed from: c  reason: collision with root package name */
        public int f2400c;

        /* renamed from: d  reason: collision with root package name */
        public int f2401d;

        /* renamed from: e  reason: collision with root package name */
        public int f2402e;

        /* renamed from: f  reason: collision with root package name */
        public Object f2403f = null;

        /* renamed from: g  reason: collision with root package name */
        public Object f2404g;

        /* renamed from: h  reason: collision with root package name */
        public Object f2405h;
        public Object i;
        public Object j;
        public Object k;
        public Boolean l;
        public Boolean m;
        public d.g.d.c n;
        public d.g.d.c o;
        public boolean p;
        public d q;
        public boolean r;

        public b() {
            Object obj = Fragment.W;
            this.f2404g = obj;
            this.f2405h = null;
            this.i = obj;
            this.j = null;
            this.k = obj;
            this.n = null;
            this.o = null;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public interface d {
    }

    public Fragment() {
        p();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) d.j.d.m.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.c(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new c(e.a.a.a.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (IllegalAccessException e3) {
            throw new c(e.a.a.a.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new c(e.a.a.a.a.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new c(e.a.a.a.a.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Fragment a(String str) {
        return str.equals(this.f2395g) ? this : this.v.c(str);
    }

    @Override // d.l.h
    public e a() {
        return this.S;
    }

    public void a(int i2) {
        if (this.L != null || i2 != 0) {
            f().f2401d = i2;
        }
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(Animator animator) {
        f().b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.G = true;
    }

    public void a(View view) {
        f().f2399a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2391c);
        printWriter.print(" mWho=");
        printWriter.print(this.f2395g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.f2396h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2396h);
        }
        if (this.f2392d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2392d);
        }
        if (this.f2393e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2393e);
        }
        Fragment fragment = this.i;
        if (fragment == null) {
            q qVar = this.t;
            fragment = (qVar == null || (str2 = this.j) == null) ? null : qVar.a(str2);
        }
        if (fragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (l() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(l());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(o());
        }
        if (i() != null) {
            d.m.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.v + ":");
        this.v.a(e.a.a.a.a.b(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void a(boolean z2) {
        f().r = z2;
    }

    public void b(int i2) {
        f().f2400c = i2;
    }

    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.j();
        boolean z2 = true;
        this.r = true;
        this.T = new q0();
        View a2 = a(layoutInflater, viewGroup, bundle);
        this.I = a2;
        if (a2 != null) {
            q0 q0Var = this.T;
            if (q0Var.f3503c == null) {
                q0Var.f3503c = new i(q0Var);
            }
            this.U.a(this.T);
            return;
        }
        if (this.T.f3503c == null) {
            z2 = false;
        }
        if (!z2) {
            this.T = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void b(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
        }
    }

    @Override // d.p.c
    public final d.p.a c() {
        return this.V.b;
    }

    public void d() {
        b bVar = this.L;
        Object obj = null;
        if (bVar != null) {
            bVar.p = false;
            Object obj2 = bVar.q;
            bVar.q = null;
            obj = obj2;
        }
        if (obj != null) {
            q.f fVar = (q.f) obj;
            int i2 = fVar.f3502c - 1;
            fVar.f3502c = i2;
            if (i2 == 0) {
                fVar.b.q.m();
            }
        }
    }

    @Override // d.l.v
    public u e() {
        q qVar = this.t;
        if (qVar != null) {
            d.j.d.u uVar = qVar.C;
            u uVar2 = uVar.f3513d.get(this.f2395g);
            if (uVar2 != null) {
                return uVar2;
            }
            u uVar3 = new u();
            uVar.f3513d.put(this.f2395g, uVar3);
            return uVar3;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final b f() {
        if (this.L == null) {
            this.L = new b();
        }
        return this.L;
    }

    public View g() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.f2399a;
    }

    public final q h() {
        if (this.u != null) {
            return this.v;
        }
        throw new IllegalStateException(e.a.a.a.a.a("Fragment ", this, " has not been attached yet."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Context i() {
        n<?> nVar = this.u;
        if (nVar == null) {
            return null;
        }
        return nVar.f3481d;
    }

    public Object j() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.f2403f;
    }

    public Object k() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.f2405h;
    }

    public int l() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2401d;
    }

    public final q m() {
        q qVar = this.t;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException(e.a.a.a.a.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public Object n() {
        b bVar = this.L;
        if (bVar == null) {
            return null;
        }
        return bVar.j;
    }

    public int o() {
        b bVar = this.L;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2400c;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        d.j.d.d dVar;
        n<?> nVar = this.u;
        if (nVar == null) {
            dVar = null;
        } else {
            dVar = (d.j.d.d) nVar.f3480c;
        }
        if (dVar != null) {
            dVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(e.a.a.a.a.a("Fragment ", this, " not attached to an activity."));
    }

    public void onLowMemory() {
        this.G = true;
    }

    public final void p() {
        this.S = new i(this);
        this.V = new d.p.b(this);
        this.S.a(new f() {
            /* class androidx.fragment.app.Fragment.AnonymousClass2 */

            @Override // d.l.f
            public void a(h hVar, e.a aVar) {
                View view;
                if (aVar == e.a.ON_STOP && (view = Fragment.this.I) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    public boolean q() {
        b bVar = this.L;
        if (bVar == null) {
            return false;
        }
        return bVar.r;
    }

    public final boolean r() {
        return this.s > 0;
    }

    public final boolean s() {
        Fragment fragment = this.w;
        return fragment != null && (fragment.n || fragment.s());
    }

    public void t() {
        this.G = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2395g);
        sb.append(")");
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" ");
            sb.append(this.z);
        }
        sb.append('}');
        return sb.toString();
    }

    public void u() {
        this.G = true;
    }

    public void v() {
        this.G = true;
    }

    public void w() {
        this.G = true;
    }

    public void x() {
        this.G = true;
    }

    public final View y() {
        View view = this.I;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(e.a.a.a.a.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void z() {
        q qVar = this.t;
        if (qVar == null || qVar.n == null) {
            f().p = false;
        } else if (Looper.myLooper() != this.t.n.f3482e.getLooper()) {
            this.t.n.f3482e.postAtFrontOfQueue(new a());
        } else {
            d();
        }
    }

    public void c(Bundle bundle) {
        q qVar = this.t;
        if (qVar != null) {
            if (qVar == null ? false : qVar.i()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2396h = bundle;
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        boolean z2 = true;
        this.G = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.v.a(parcelable);
            this.v.b();
        }
        if (this.v.m < 1) {
            z2 = false;
        }
        if (!z2) {
            this.v.b();
        }
    }

    @Deprecated
    public void c(boolean z2) {
        boolean z3 = false;
        if (!this.K && z2 && this.f2391c < 3 && this.t != null) {
            if ((this.u != null && this.m) && this.Q) {
                this.t.n(this);
            }
        }
        this.K = z2;
        if (this.f2391c < 3 && !z2) {
            z3 = true;
        }
        this.J = z3;
        if (this.f2392d != null) {
            this.f2394f = Boolean.valueOf(z2);
        }
    }

    public LayoutInflater b(Bundle bundle) {
        n<?> nVar = this.u;
        if (nVar != null) {
            d.a aVar = (d.a) nVar;
            LayoutInflater cloneInContext = d.j.d.d.this.getLayoutInflater().cloneInContext(d.j.d.d.this);
            c.a.a.a.a.b(cloneInContext, this.v.f3495f);
            this.P = cloneInContext;
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void a(AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        n<?> nVar = this.u;
        if ((nVar == null ? null : nVar.f3480c) != null) {
            this.G = false;
            this.G = true;
        }
    }

    public void a(d dVar) {
        f();
        d dVar2 = this.L.q;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                b bVar = this.L;
                if (bVar.p) {
                    bVar.q = dVar;
                }
                if (dVar != null) {
                    ((q.f) dVar).f3502c++;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }
}

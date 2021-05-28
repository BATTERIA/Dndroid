package d.j.d;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import d.l.e;
import e.a.a.a.a;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public final p f3527a;
    public final Fragment b;

    /* renamed from: c  reason: collision with root package name */
    public int f3528c = -1;

    public x(p pVar, Fragment fragment) {
        this.f3527a = pVar;
        this.b = fragment;
    }

    public x(p pVar, Fragment fragment, w wVar) {
        this.f3527a = pVar;
        this.b = fragment;
        fragment.f2393e = null;
        fragment.s = 0;
        fragment.p = false;
        fragment.m = false;
        Fragment fragment2 = fragment.i;
        fragment.j = fragment2 != null ? fragment2.f2395g : null;
        Fragment fragment3 = this.b;
        fragment3.i = null;
        Bundle bundle = wVar.o;
        fragment3.f2392d = bundle == null ? new Bundle() : bundle;
    }

    public x(p pVar, ClassLoader classLoader, m mVar, w wVar) {
        this.f3527a = pVar;
        this.b = mVar.a(classLoader, wVar.f3521c);
        Bundle bundle = wVar.l;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.b.c(wVar.l);
        Fragment fragment = this.b;
        fragment.f2395g = wVar.f3522d;
        fragment.o = wVar.f3523e;
        fragment.q = true;
        fragment.x = wVar.f3524f;
        fragment.y = wVar.f3525g;
        fragment.z = wVar.f3526h;
        fragment.C = wVar.i;
        fragment.n = wVar.j;
        fragment.B = wVar.k;
        fragment.A = wVar.m;
        fragment.R = e.b.values()[wVar.n];
        Bundle bundle2 = wVar.o;
        if (bundle2 != null) {
            this.b.f2392d = bundle2;
        } else {
            this.b.f2392d = new Bundle();
        }
        if (q.c(2)) {
            StringBuilder a2 = a.a("Instantiated fragment ");
            a2.append(this.b);
            Log.v("FragmentManager", a2.toString());
        }
    }

    public void a() {
        if (this.b.I != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.b.I.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.b.f2393e = sparseArray;
            }
        }
    }

    public void a(ClassLoader classLoader) {
        Bundle bundle = this.b.f2392d;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.b;
            fragment.f2393e = fragment.f2392d.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.b;
            fragment2.j = fragment2.f2392d.getString("android:target_state");
            Fragment fragment3 = this.b;
            if (fragment3.j != null) {
                fragment3.k = fragment3.f2392d.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.b;
            Boolean bool = fragment4.f2394f;
            if (bool != null) {
                fragment4.K = bool.booleanValue();
                this.b.f2394f = null;
            } else {
                fragment4.K = fragment4.f2392d.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.b;
            if (!fragment5.K) {
                fragment5.J = true;
            }
        }
    }
}

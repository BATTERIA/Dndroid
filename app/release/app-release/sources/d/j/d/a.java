package d.j.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import d.j.d.q;
import d.j.d.z;
import d.l.e;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a extends z implements q.e {
    public final q q;
    public boolean r;
    public int s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(d.j.d.q r3) {
        /*
            r2 = this;
            d.j.d.m r0 = r3.h()
            d.j.d.n<?> r1 = r3.n
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f3481d
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.s = r0
            r2.q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.a.<init>(d.j.d.q):void");
    }

    @Override // d.j.d.z
    public int a() {
        if (!this.r) {
            if (q.c(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new d.g.k.a("FragmentManager"));
                a("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            this.s = this.f3535g ? this.q.i.getAndIncrement() : -1;
            this.q.a((q.e) this, true);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // d.j.d.z
    public z a(Fragment fragment, e.b bVar) {
        if (fragment.t != this.q) {
            StringBuilder a2 = e.a.a.a.a.a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            a2.append(this.q);
            throw new IllegalArgumentException(a2.toString());
        } else if (bVar.a(e.b.CREATED)) {
            super.a(fragment, bVar);
            return this;
        } else {
            StringBuilder a3 = e.a.a.a.a.a("Cannot set maximum Lifecycle below ");
            a3.append(e.b.CREATED);
            throw new IllegalArgumentException(a3.toString());
        }
    }

    public void a(int i) {
        if (this.f3535g) {
            if (q.c(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3530a.size();
            for (int i2 = 0; i2 < size; i2++) {
                z.a aVar = this.f3530a.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.s += i;
                    if (q.c(2)) {
                        StringBuilder a2 = e.a.a.a.a.a("Bump nesting of ");
                        a2.append(aVar.b);
                        a2.append(" to ");
                        a2.append(aVar.b.s);
                        Log.v("FragmentManager", a2.toString());
                    }
                }
            }
        }
    }

    @Override // d.j.d.z
    public void a(int i, Fragment fragment, String str, int i2) {
        super.a(i, fragment, str, i2);
        fragment.t = this.q;
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3536h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f3534f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3534f));
            }
            if (!(this.b == 0 && this.f3531c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3531c));
            }
            if (!(this.f3532d == 0 && this.f3533e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3532d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3533e));
            }
            if (!(this.i == 0 && this.j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (!(this.k == 0 && this.l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (!this.f3530a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3530a.size();
            for (int i = 0; i < size; i++) {
                z.a aVar = this.f3530a.get(i);
                switch (aVar.f3537a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a2 = e.a.a.a.a.a("cmd=");
                        a2.append(aVar.f3537a);
                        str2 = a2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.f3538c == 0 && aVar.f3539d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3538c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3539d));
                    }
                    if (aVar.f3540e != 0 || aVar.f3541f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3540e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3541f));
                    }
                }
            }
        }
    }

    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3530a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3530a.get(i4).b;
            int i5 = fragment != null ? fragment.y : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f3530a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3530a.get(i7).b;
                        if ((fragment2 != null ? fragment2.y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // d.j.d.z
    public void b() {
        if (!this.f3535g) {
            q qVar = this.q;
            if (qVar.n != null && !qVar.w) {
                qVar.c(true);
                if (a(qVar.y, qVar.z)) {
                    qVar.b = true;
                    try {
                        qVar.c(qVar.y, qVar.z);
                    } finally {
                        qVar.a();
                    }
                }
                qVar.o();
                qVar.e();
                qVar.f3492c.a();
                return;
            }
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public boolean b(int i) {
        int size = this.f3530a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3530a.get(i2).b;
            int i3 = fragment != null ? fragment.y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        int size = this.f3530a.size();
        for (int i = 0; i < size; i++) {
            z.a aVar = this.f3530a.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                int i2 = this.f3534f;
                if (!(fragment.L == null && i2 == 0)) {
                    fragment.f();
                    fragment.L.f2402e = i2;
                }
            }
            switch (aVar.f3537a) {
                case 1:
                    fragment.a(aVar.f3538c);
                    this.q.a(fragment, false);
                    this.q.a(fragment);
                    break;
                case 2:
                default:
                    StringBuilder a2 = e.a.a.a.a.a("Unknown cmd: ");
                    a2.append(aVar.f3537a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.a(aVar.f3539d);
                    this.q.o(fragment);
                    break;
                case 4:
                    fragment.a(aVar.f3539d);
                    this.q.i(fragment);
                    break;
                case 5:
                    fragment.a(aVar.f3538c);
                    this.q.a(fragment, false);
                    this.q.s(fragment);
                    break;
                case 6:
                    fragment.a(aVar.f3539d);
                    this.q.f(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f3538c);
                    this.q.a(fragment, false);
                    this.q.c(fragment);
                    break;
                case 8:
                    this.q.q(fragment);
                    break;
                case 9:
                    this.q.q(null);
                    break;
                case 10:
                    this.q.a(fragment, aVar.f3543h);
                    break;
            }
            if (!(this.o || aVar.f3537a == 1 || fragment == null)) {
                this.q.m(fragment);
            }
        }
        if (!this.o) {
            q qVar = this.q;
            qVar.a(qVar.m, true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f3536h != null) {
            sb.append(" ");
            sb.append(this.f3536h);
        }
        sb.append("}");
        return sb.toString();
    }

    public static boolean b(z.a aVar) {
        Fragment fragment = aVar.b;
        if (fragment == null || !fragment.m || fragment.I == null || fragment.B || fragment.A) {
            return false;
        }
        Fragment.b bVar = fragment.L;
        return bVar == null ? false : bVar.p;
    }

    public void a(boolean z) {
        for (int size = this.f3530a.size() - 1; size >= 0; size--) {
            z.a aVar = this.f3530a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                int i = this.f3534f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (!(fragment.L == null && i2 == 0)) {
                    fragment.f();
                    fragment.L.f2402e = i2;
                }
            }
            switch (aVar.f3537a) {
                case 1:
                    fragment.a(aVar.f3541f);
                    this.q.a(fragment, true);
                    this.q.o(fragment);
                    break;
                case 2:
                default:
                    StringBuilder a2 = e.a.a.a.a.a("Unknown cmd: ");
                    a2.append(aVar.f3537a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.a(aVar.f3540e);
                    this.q.a(fragment);
                    break;
                case 4:
                    fragment.a(aVar.f3540e);
                    this.q.s(fragment);
                    break;
                case 5:
                    fragment.a(aVar.f3541f);
                    this.q.a(fragment, true);
                    this.q.i(fragment);
                    break;
                case 6:
                    fragment.a(aVar.f3540e);
                    this.q.c(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f3541f);
                    this.q.a(fragment, true);
                    this.q.f(fragment);
                    break;
                case 8:
                    this.q.q(null);
                    break;
                case 9:
                    this.q.q(fragment);
                    break;
                case 10:
                    this.q.a(fragment, aVar.f3542g);
                    break;
            }
            if (!(this.o || aVar.f3537a == 3 || fragment == null)) {
                this.q.m(fragment);
            }
        }
        if (!this.o && z) {
            q qVar = this.q;
            qVar.a(qVar.m, true);
        }
    }

    @Override // d.j.d.q.e
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (q.c(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f3535g) {
            return true;
        }
        q qVar = this.q;
        if (qVar.f3493d == null) {
            qVar.f3493d = new ArrayList<>();
        }
        qVar.f3493d.add(this);
        return true;
    }
}

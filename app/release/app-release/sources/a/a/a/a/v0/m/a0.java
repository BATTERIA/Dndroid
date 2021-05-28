package a.a.a.a.v0.m;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.s;
import a.w.c.i;
import e.a.a.a.a;

public final class a0 extends y0 {
    public final r0[] b;

    /* renamed from: c  reason: collision with root package name */
    public final v0[] f1813c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1814d;

    public a0(r0[] r0VarArr, v0[] v0VarArr, boolean z) {
        if (r0VarArr == null) {
            i.a("parameters");
            throw null;
        } else if (v0VarArr != null) {
            this.b = r0VarArr;
            this.f1813c = v0VarArr;
            this.f1814d = z;
            boolean z2 = r0VarArr.length <= v0VarArr.length;
            if (s.f2103a && !z2) {
                StringBuilder a2 = a.a("Number of arguments should not be less then number of parameters, but: parameters=");
                a2.append(this.b.length);
                a2.append(", args=");
                a2.append(this.f1813c.length);
                throw new AssertionError(a2.toString());
            }
        } else {
            i.a("arguments");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        if (d0Var != null) {
            h c2 = d0Var.I0().c();
            if (!(c2 instanceof r0)) {
                c2 = null;
            }
            r0 r0Var = (r0) c2;
            if (r0Var != null) {
                int z = r0Var.z();
                r0[] r0VarArr = this.b;
                if (z < r0VarArr.length && i.a(r0VarArr[z].n(), r0Var.n())) {
                    return this.f1813c[z];
                }
            }
            return null;
        }
        i.a("key");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean b() {
        return this.f1814d;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean d() {
        return this.f1813c.length == 0;
    }
}

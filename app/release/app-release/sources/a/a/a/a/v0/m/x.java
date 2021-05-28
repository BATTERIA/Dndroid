package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.i.j;
import a.a.a.a.v0.m.k1.f;
import a.w.c.i;
import java.util.List;

public abstract class x extends f1 implements r0, f {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1956d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f1957e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(k0 k0Var, k0 k0Var2) {
        super(null);
        if (k0Var == null) {
            i.a("lowerBound");
            throw null;
        } else if (k0Var2 != null) {
            this.f1956d = k0Var;
            this.f1957e = k0Var2;
        } else {
            i.a("upperBound");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.d0
    public List<v0> H0() {
        return L0().H0();
    }

    @Override // a.a.a.a.v0.m.d0
    public s0 I0() {
        return L0().I0();
    }

    @Override // a.a.a.a.v0.m.d0
    public boolean J0() {
        return L0().J0();
    }

    public abstract k0 L0();

    @Override // a.a.a.a.v0.m.r0
    public d0 U() {
        return this.f1957e;
    }

    public abstract String a(c cVar, j jVar);

    @Override // a.a.a.a.v0.m.r0
    public boolean b(d0 d0Var) {
        if (d0Var != null) {
            return false;
        }
        i.a("type");
        throw null;
    }

    public String toString() {
        return c.b.a(this);
    }

    @Override // a.a.a.a.v0.m.d0
    public a.a.a.a.v0.j.w.i u() {
        return L0().u();
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        return L0().y();
    }

    @Override // a.a.a.a.v0.m.r0
    public d0 z0() {
        return this.f1956d;
    }
}

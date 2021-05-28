package a.a.a.a.v0.m;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.g;
import a.a.a.a.v0.m.i1.b;
import a.a.a.a.v0.m.i1.h;
import a.a.a.a.v0.m.k1.d;
import a.s;
import a.w.c.f;
import a.w.c.i;
import e.f.a.g;

public final class p extends r implements o, d {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1936d;

    public p(k0 k0Var) {
        this.f1936d = k0Var;
    }

    public /* synthetic */ p(k0 k0Var, f fVar) {
        this.f1936d = k0Var;
    }

    public static final p a(f1 f1Var) {
        if (f1Var == null) {
            i.a("type");
            throw null;
        } else if (f1Var instanceof p) {
            return (p) f1Var;
        } else {
            f1Var.I0();
            boolean z = true;
            if (!((f1Var.I0().c() instanceof r0) || (f1Var instanceof h)) || c.a(new b(false, true, false, null, 12), g.i(f1Var), g.b.C0071b.f1847a)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            if (f1Var instanceof x) {
                x xVar = (x) f1Var;
                boolean a2 = i.a(xVar.f1956d.I0(), xVar.f1957e.I0());
                if (s.f2103a && !a2) {
                    throw new AssertionError("DefinitelyNotNullType for flexible type (" + f1Var + ") can be created only from type variable with the same constructor for bounds");
                }
            }
            return new p(e.f.a.g.i(f1Var), null);
        }
    }

    @Override // a.a.a.a.v0.m.r, a.a.a.a.v0.m.d0
    public boolean J0() {
        return false;
    }

    @Override // a.a.a.a.v0.m.r
    public k0 L0() {
        return this.f1936d;
    }

    @Override // a.a.a.a.v0.m.k0
    public String toString() {
        return this.f1936d + "!!";
    }

    @Override // a.a.a.a.v0.m.o
    public boolean u0() {
        this.f1936d.I0();
        return this.f1936d.I0().c() instanceof r0;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        return z ? this.f1936d.a(z) : this;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public p a(a.a.a.a.v0.b.b1.h hVar) {
        if (hVar != null) {
            return new p(this.f1936d.a(hVar));
        }
        i.a("newAnnotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new p(k0Var);
        }
        i.a("delegate");
        throw null;
    }

    @Override // a.a.a.a.v0.m.o
    public d0 a(d0 d0Var) {
        if (d0Var != null) {
            return n0.a(d0Var.K0());
        }
        i.a("replacement");
        throw null;
    }
}

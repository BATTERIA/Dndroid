package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.l1.a;
import a.a.a.a.v0.m.o;
import a.a.a.a.v0.m.r;
import a.a.a.a.v0.m.x;
import a.w.c.i;
import e.f.a.g;

public final class f extends r implements o {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f701d;

    public f(k0 k0Var) {
        if (k0Var != null) {
            this.f701d = k0Var;
        } else {
            i.a("delegate");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r, a.a.a.a.v0.m.d0
    public boolean J0() {
        return false;
    }

    @Override // a.a.a.a.v0.m.r
    public k0 L0() {
        return this.f701d;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        return z ? this.f701d.a(true) : this;
    }

    public final k0 b(k0 k0Var) {
        k0 a2 = k0Var.a(false);
        return !a.d(k0Var) ? a2 : new f(a2);
    }

    @Override // a.a.a.a.v0.m.o
    public boolean u0() {
        return true;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public f a(h hVar) {
        if (hVar != null) {
            return new f(this.f701d.a(hVar));
        }
        i.a("newAnnotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new f(k0Var);
        }
        i.a("delegate");
        throw null;
    }

    @Override // a.a.a.a.v0.m.o
    public d0 a(d0 d0Var) {
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (!c1.c(K0) && !a.d(K0)) {
                return K0;
            }
            if (K0 instanceof k0) {
                return b((k0) K0);
            }
            if (K0 instanceof x) {
                x xVar = (x) K0;
                return g.b(e0.a(b(xVar.f1956d), b(xVar.f1957e)), g.c((d0) K0));
            }
            throw new IllegalStateException(("Incorrect type: " + K0).toString());
        }
        i.a("replacement");
        throw null;
    }
}

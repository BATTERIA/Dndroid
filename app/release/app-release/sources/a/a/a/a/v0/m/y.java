package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.i.j;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.l1.a;
import a.n;
import a.w.c.i;
import e.f.a.g;

public final class y extends x implements o {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(k0 k0Var, k0 k0Var2) {
        super(k0Var, k0Var2);
        if (k0Var == null) {
            i.a("lowerBound");
            throw null;
        } else if (k0Var2 != null) {
        } else {
            i.a("upperBound");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.x
    public k0 L0() {
        return this.f1956d;
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(boolean z) {
        return e0.a(this.f1956d.a(z), this.f1957e.a(z));
    }

    @Override // a.a.a.a.v0.m.o
    public boolean u0() {
        return (this.f1956d.I0().c() instanceof r0) && i.a(this.f1956d.I0(), this.f1957e.I0());
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public x a(f fVar) {
        if (fVar != null) {
            k0 k0Var = this.f1956d;
            fVar.a(k0Var);
            if (k0Var != null) {
                k0 k0Var2 = k0Var;
                k0 k0Var3 = this.f1957e;
                fVar.a(k0Var3);
                if (k0Var3 != null) {
                    return new y(k0Var2, k0Var3);
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.x
    public String a(c cVar, j jVar) {
        if (cVar == null) {
            i.a("renderer");
            throw null;
        } else if (jVar == null) {
            i.a("options");
            throw null;
        } else if (!jVar.c()) {
            return cVar.a(cVar.a(this.f1956d), cVar.a(this.f1957e), a.c(this));
        } else {
            return '(' + cVar.a(this.f1956d) + ".." + cVar.a(this.f1957e) + ')';
        }
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(h hVar) {
        if (hVar != null) {
            return e0.a(this.f1956d.a(hVar), this.f1957e.a(hVar));
        }
        i.a("newAnnotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.o
    public d0 a(d0 d0Var) {
        f1 f1Var;
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 instanceof x) {
                f1Var = K0;
            } else if (K0 instanceof k0) {
                k0 k0Var = (k0) K0;
                f1Var = e0.a(k0Var, k0Var.a(true));
            } else {
                throw new a.h();
            }
            return g.a(f1Var, K0);
        }
        i.a("replacement");
        throw null;
    }
}

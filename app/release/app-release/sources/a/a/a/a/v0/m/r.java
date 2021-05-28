package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.m.i1.f;
import a.n;
import a.w.c.i;
import java.util.List;

public abstract class r extends k0 {
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

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public k0 a(f fVar) {
        if (fVar != null) {
            k0 L0 = L0();
            fVar.a(L0);
            if (L0 != null) {
                return a(L0);
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    public abstract r a(k0 k0Var);

    @Override // a.a.a.a.v0.m.d0
    public a.a.a.a.v0.j.w.i u() {
        return L0().u();
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        return L0().y();
    }
}

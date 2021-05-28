package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.j.w.i;
import a.n;
import java.util.List;

public abstract class h1 extends d0 {
    public h1() {
        super(null);
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

    @Override // a.a.a.a.v0.m.d0
    public final f1 K0() {
        d0 L0 = L0();
        while (L0 instanceof h1) {
            L0 = ((h1) L0).L0();
        }
        if (L0 != null) {
            return (f1) L0;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    public abstract d0 L0();

    public boolean M0() {
        return true;
    }

    public String toString() {
        return M0() ? L0().toString() : "<Not computed yet>";
    }

    @Override // a.a.a.a.v0.m.d0
    public i u() {
        return L0().u();
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        return L0().y();
    }
}

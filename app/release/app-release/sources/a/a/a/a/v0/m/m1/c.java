package a.a.a.a.v0.m.m1;

import a.a.a.a.v0.j.r.a.b;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.u0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.x0;
import a.w.c.i;

public final class c extends u0 {
    @Override // a.a.a.a.v0.m.u0
    public v0 a(s0 s0Var) {
        if (s0Var != null) {
            if (!(s0Var instanceof b)) {
                s0Var = null;
            }
            b bVar = (b) s0Var;
            if (bVar != null) {
                return bVar.e().b() ? new x0(g1.OUT_VARIANCE, bVar.e().c()) : bVar.e();
            }
            return null;
        }
        i.a("key");
        throw null;
    }
}

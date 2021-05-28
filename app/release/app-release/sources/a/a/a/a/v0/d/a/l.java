package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.j.h;
import a.w.c.i;
import e.f.a.g;

public final class l implements h {
    @Override // a.a.a.a.v0.j.h
    public h.a a() {
        return h.a.BOTH;
    }

    @Override // a.a.a.a.v0.j.h
    public h.b a(a aVar, a aVar2, e eVar) {
        if (aVar == null) {
            i.a("superDescriptor");
            throw null;
        } else if (aVar2 == null) {
            i.a("subDescriptor");
            throw null;
        } else if (!(aVar2 instanceof f0) || !(aVar instanceof f0)) {
            return h.b.UNKNOWN;
        } else {
            f0 f0Var = (f0) aVar2;
            f0 f0Var2 = (f0) aVar;
            if (!i.a(f0Var.d(), f0Var2.d())) {
                return h.b.UNKNOWN;
            }
            if (!g.a(f0Var) || !g.a(f0Var2)) {
                return (g.a(f0Var) || g.a(f0Var2)) ? h.b.INCOMPATIBLE : h.b.UNKNOWN;
            }
            return h.b.OVERRIDABLE;
        }
    }
}

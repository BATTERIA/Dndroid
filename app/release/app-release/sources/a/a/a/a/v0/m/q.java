package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.w.c.i;

public class q extends y0 {
    public final y0 b;

    public q(y0 y0Var) {
        if (y0Var != null) {
            this.b = y0Var;
        } else {
            i.a("substitution");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.y0
    public h a(h hVar) {
        if (hVar != null) {
            return this.b.a(hVar);
        }
        i.a("annotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean a() {
        return this.b.a();
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean d() {
        return this.b.d();
    }

    @Override // a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        if (d0Var != null) {
            return this.b.a(d0Var);
        }
        i.a("key");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public d0 a(d0 d0Var, g1 g1Var) {
        if (d0Var == null) {
            i.a("topLevelType");
            throw null;
        } else if (g1Var != null) {
            return this.b.a(d0Var, g1Var);
        } else {
            i.a("position");
            throw null;
        }
    }
}

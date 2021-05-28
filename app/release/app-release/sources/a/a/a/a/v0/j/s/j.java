package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.i;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;

public final class j extends g<Double> {
    public j(double d2) {
        super(Double.valueOf(d2));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        if (wVar != null) {
            g m = wVar.m();
            if (m != null) {
                k0 b = m.b(i.DOUBLE);
                if (b != null) {
                    a.w.c.i.a((Object) b, "module.builtIns.doubleType");
                    return b;
                }
                g.b(60);
                throw null;
            }
            throw null;
        }
        a.w.c.i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        return this.f1578a.doubleValue() + ".toDouble()";
    }
}

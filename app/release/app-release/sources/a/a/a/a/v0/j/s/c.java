package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.i;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;

public final class c extends g<Boolean> {
    public c(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        if (wVar != null) {
            g m = wVar.m();
            if (m != null) {
                k0 b = m.b(i.BOOLEAN);
                if (b != null) {
                    a.w.c.i.a((Object) b, "module.builtIns.booleanType");
                    return b;
                }
                g.b(62);
                throw null;
            }
            throw null;
        }
        a.w.c.i.a("module");
        throw null;
    }
}

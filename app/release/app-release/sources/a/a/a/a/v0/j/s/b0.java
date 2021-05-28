package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;

public final class b0 extends d0<Long> {
    public b0(long j) {
        super(Long.valueOf(j));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        k0 v;
        if (wVar != null) {
            a aVar = g.k.g0;
            i.a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.uLong");
            e a2 = e.f.a.g.a(wVar, aVar);
            if (a2 != null && (v = a2.v()) != null) {
                return v;
            }
            k0 b = a.a.a.a.v0.m.w.b("Unsigned type ULong not found");
            i.a((Object) b, "ErrorUtils.createErrorTy…ed type ULong not found\")");
            return b;
        }
        i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        return this.f1578a.longValue() + ".toULong()";
    }
}

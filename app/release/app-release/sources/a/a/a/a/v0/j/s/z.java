package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;

public final class z extends d0<Byte> {
    public z(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        k0 v;
        if (wVar != null) {
            a aVar = g.k.d0;
            i.a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.uByte");
            e a2 = e.f.a.g.a(wVar, aVar);
            if (a2 != null && (v = a2.v()) != null) {
                return v;
            }
            k0 b = a.a.a.a.v0.m.w.b("Unsigned type UByte not found");
            i.a((Object) b, "ErrorUtils.createErrorTy…ed type UByte not found\")");
            return b;
        }
        i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        return ((int) this.f1578a.byteValue()) + ".toUByte()";
    }
}

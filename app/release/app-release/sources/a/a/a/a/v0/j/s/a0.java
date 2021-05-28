package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;

public final class a0 extends d0<Integer> {
    public a0(int i) {
        super(Integer.valueOf(i));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        k0 v;
        if (wVar != null) {
            a aVar = g.k.f0;
            i.a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.uInt");
            e a2 = e.f.a.g.a(wVar, aVar);
            if (a2 != null && (v = a2.v()) != null) {
                return v;
            }
            k0 b = a.a.a.a.v0.m.w.b("Unsigned type UInt not found");
            i.a((Object) b, "ErrorUtils.createErrorTy…ned type UInt not found\")");
            return b;
        }
        i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        return this.f1578a.intValue() + ".toUInt()";
    }
}

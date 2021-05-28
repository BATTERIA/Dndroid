package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;

public final class y extends g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(String str) {
        super(str);
        if (str != null) {
        } else {
            i.a("value");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        if (wVar != null) {
            k0 i = wVar.m().i();
            i.a((Object) i, "module.builtIns.stringType");
            return i;
        }
        i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        return '\"' + ((String) this.f1578a) + '\"';
    }
}

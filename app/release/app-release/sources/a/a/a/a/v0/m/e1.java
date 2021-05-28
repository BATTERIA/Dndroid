package a.a.a.a.v0.m;

import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.m.i1.f;
import java.util.List;

public final class e1 extends v {
    public final String i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(String str, s0 s0Var, i iVar, List<? extends v0> list, boolean z) {
        super(s0Var, iVar, list, z, null, 16);
        if (str == null) {
            a.w.c.i.a("presentableName");
            throw null;
        } else if (s0Var == null) {
            a.w.c.i.a("constructor");
            throw null;
        } else if (iVar == null) {
            a.w.c.i.a("memberScope");
            throw null;
        } else if (list != null) {
            this.i = str;
        } else {
            a.w.c.i.a("arguments");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.v
    public String L0() {
        return this.i;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.v, a.a.a.a.v0.m.v, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        return new e1(this.i, this.f1945d, this.f1946e, this.f1947f, z);
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1, a.a.a.a.v0.m.v, a.a.a.a.v0.m.v, a.a.a.a.v0.m.v
    public e1 a(f fVar) {
        if (fVar != null) {
            return this;
        }
        a.w.c.i.a("kotlinTypeRefiner");
        throw null;
    }
}

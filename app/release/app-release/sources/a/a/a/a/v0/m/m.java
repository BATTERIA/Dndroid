package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.w.c.i;

public final class m extends s {

    /* renamed from: e  reason: collision with root package name */
    public final h f1924e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(k0 k0Var, h hVar) {
        super(k0Var);
        if (k0Var == null) {
            i.a("delegate");
            throw null;
        } else if (hVar != null) {
            this.f1924e = hVar;
        } else {
            i.a("annotations");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new m(k0Var, this.f1924e);
        }
        i.a("delegate");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a, a.a.a.a.v0.m.r
    public h y() {
        return this.f1924e;
    }
}

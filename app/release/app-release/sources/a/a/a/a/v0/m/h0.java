package a.a.a.a.v0.m;

import a.w.c.i;

public final class h0 extends s {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var) {
        super(k0Var);
        if (k0Var != null) {
        } else {
            i.a("delegate");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r, a.a.a.a.v0.m.d0
    public boolean J0() {
        return false;
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new h0(k0Var);
        }
        i.a("delegate");
        throw null;
    }
}

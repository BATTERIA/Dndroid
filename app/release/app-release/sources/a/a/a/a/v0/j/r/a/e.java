package a.a.a.a.v0.j.r.a;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.q;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.y0;
import a.w.c.i;
import e.f.a.g;

public final class e extends q {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1576c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(y0 y0Var, boolean z, y0 y0Var2) {
        super(y0Var2);
        this.f1576c = z;
    }

    @Override // a.a.a.a.v0.m.q, a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        r0 r0Var = null;
        if (d0Var != null) {
            v0 a2 = super.a(d0Var);
            if (a2 == null) {
                return null;
            }
            h c2 = d0Var.I0().c();
            if (c2 instanceof r0) {
                r0Var = c2;
            }
            return g.a(a2, r0Var);
        }
        i.a("key");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean b() {
        return this.f1576c;
    }
}

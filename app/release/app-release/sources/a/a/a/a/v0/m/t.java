package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.w.c.f;
import a.w.c.i;

public final class t extends y0 {
    public final y0 b;

    /* renamed from: c  reason: collision with root package name */
    public final y0 f1941c;

    public /* synthetic */ t(y0 y0Var, y0 y0Var2, f fVar) {
        this.b = y0Var;
        this.f1941c = y0Var2;
    }

    public static final y0 a(y0 y0Var, y0 y0Var2) {
        if (y0Var == null) {
            i.a("first");
            throw null;
        } else if (y0Var2 == null) {
            i.a("second");
            throw null;
        } else if (y0Var.d()) {
            return y0Var2;
        } else {
            return y0Var2.d() ? y0Var : new t(y0Var, y0Var2, null);
        }
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean a() {
        return this.b.a() || this.f1941c.a();
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean b() {
        return this.b.b() || this.f1941c.b();
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean d() {
        return false;
    }

    @Override // a.a.a.a.v0.m.y0
    public h a(h hVar) {
        if (hVar != null) {
            return this.f1941c.a(this.b.a(hVar));
        }
        i.a("annotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        if (d0Var != null) {
            v0 a2 = this.b.a(d0Var);
            return a2 != null ? a2 : this.f1941c.a(d0Var);
        }
        i.a("key");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public d0 a(d0 d0Var, g1 g1Var) {
        if (d0Var == null) {
            i.a("topLevelType");
            throw null;
        } else if (g1Var != null) {
            return this.f1941c.a(this.b.a(d0Var, g1Var), g1Var);
        } else {
            i.a("position");
            throw null;
        }
    }
}

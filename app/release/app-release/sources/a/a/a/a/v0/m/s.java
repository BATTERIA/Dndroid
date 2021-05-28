package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.w.c.i;

public abstract class s extends r {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1940d;

    public s(k0 k0Var) {
        if (k0Var != null) {
            this.f1940d = k0Var;
        } else {
            i.a("delegate");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r
    public k0 L0() {
        return this.f1940d;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        if (z == J0()) {
            return this;
        }
        return this.f1940d.a(z).a(y());
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public s a(h hVar) {
        if (hVar != null) {
            return hVar != y() ? new m(this, hVar) : this;
        }
        i.a("newAnnotations");
        throw null;
    }
}

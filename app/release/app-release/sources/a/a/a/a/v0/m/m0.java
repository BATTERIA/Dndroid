package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.m.i1.f;
import a.n;
import a.w.c.i;
import e.f.a.g;

public final class m0 extends r implements d1 {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1925d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f1926e;

    public m0(k0 k0Var, d0 d0Var) {
        if (k0Var == null) {
            i.a("delegate");
            throw null;
        } else if (d0Var != null) {
            this.f1925d = k0Var;
            this.f1926e = d0Var;
        } else {
            i.a("enhancement");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r
    public k0 L0() {
        return this.f1925d;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        f1 b = g.b(this.f1925d.a(z), this.f1926e.K0().a(z));
        if (b != null) {
            return (k0) b;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    @Override // a.a.a.a.v0.m.d1
    public f1 r0() {
        return this.f1925d;
    }

    @Override // a.a.a.a.v0.m.d1
    public d0 w0() {
        return this.f1926e;
    }

    @Override // a.a.a.a.v0.m.r, a.a.a.a.v0.m.r, a.a.a.a.v0.m.r, a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public m0 a(f fVar) {
        if (fVar != null) {
            k0 k0Var = this.f1925d;
            fVar.a(k0Var);
            if (k0Var != null) {
                d0 d0Var = this.f1926e;
                fVar.a(d0Var);
                return new m0(k0Var, d0Var);
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(h hVar) {
        if (hVar != null) {
            f1 b = g.b(this.f1925d.a(hVar), this.f1926e);
            if (b != null) {
                return (k0) b;
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        i.a("newAnnotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new m0(k0Var, this.f1926e);
        }
        i.a("delegate");
        throw null;
    }
}

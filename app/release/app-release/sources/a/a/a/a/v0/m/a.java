package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.m.i1.f;
import a.n;
import a.w.c.i;

public final class a extends r {

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1811d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f1812e;

    public a(k0 k0Var, k0 k0Var2) {
        if (k0Var == null) {
            i.a("delegate");
            throw null;
        } else if (k0Var2 != null) {
            this.f1811d = k0Var;
            this.f1812e = k0Var2;
        } else {
            i.a("abbreviation");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.r
    public k0 L0() {
        return this.f1811d;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public a a(boolean z) {
        return new a(this.f1811d.a(z), this.f1812e.a(z));
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    /* renamed from: a  reason: collision with other method in class */
    public k0 m77a(boolean z) {
        return new a(this.f1811d.a(z), this.f1812e.a(z));
    }

    @Override // a.a.a.a.v0.m.r, a.a.a.a.v0.m.r, a.a.a.a.v0.m.r, a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public a a(f fVar) {
        if (fVar != null) {
            k0 k0Var = this.f1811d;
            fVar.a(k0Var);
            if (k0Var != null) {
                k0 k0Var2 = k0Var;
                k0 k0Var3 = this.f1812e;
                fVar.a(k0Var3);
                if (k0Var3 != null) {
                    return new a(k0Var2, k0Var3);
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public a a(h hVar) {
        if (hVar != null) {
            return new a(this.f1811d.a(hVar), this.f1812e);
        }
        i.a("newAnnotations");
        throw null;
    }

    @Override // a.a.a.a.v0.m.r
    public r a(k0 k0Var) {
        if (k0Var != null) {
            return new a(k0Var, this.f1812e);
        }
        i.a("delegate");
        throw null;
    }
}

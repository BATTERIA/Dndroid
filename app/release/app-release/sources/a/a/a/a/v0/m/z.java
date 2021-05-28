package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.i.j;
import a.a.a.a.v0.m.i1.f;
import a.n;
import a.w.c.i;
import e.f.a.g;

public final class z extends x implements d1 {

    /* renamed from: f  reason: collision with root package name */
    public final x f1960f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f1961g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(x xVar, d0 d0Var) {
        super(xVar.f1956d, xVar.f1957e);
        if (xVar == null) {
            i.a("origin");
            throw null;
        } else if (d0Var != null) {
            this.f1960f = xVar;
            this.f1961g = d0Var;
        } else {
            i.a("enhancement");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.x
    public k0 L0() {
        return this.f1960f.L0();
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(boolean z) {
        return g.b(this.f1960f.a(z), this.f1961g.K0().a(z));
    }

    @Override // a.a.a.a.v0.m.d1
    public f1 r0() {
        return this.f1960f;
    }

    @Override // a.a.a.a.v0.m.d1
    public d0 w0() {
        return this.f1961g;
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public z a(f fVar) {
        if (fVar != null) {
            x xVar = this.f1960f;
            fVar.a(xVar);
            if (xVar != null) {
                d0 d0Var = this.f1961g;
                fVar.a(d0Var);
                return new z(xVar, d0Var);
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.x
    public String a(c cVar, j jVar) {
        if (cVar == null) {
            i.a("renderer");
            throw null;
        } else if (jVar == null) {
            i.a("options");
            throw null;
        } else if (jVar.a()) {
            return cVar.a(this.f1961g);
        } else {
            return this.f1960f.a(cVar, jVar);
        }
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(h hVar) {
        if (hVar != null) {
            return g.b(this.f1960f.a(hVar), this.f1961g);
        }
        i.a("newAnnotations");
        throw null;
    }
}

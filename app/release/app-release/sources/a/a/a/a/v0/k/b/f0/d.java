package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.d1.i;
import a.a.a.a.v0.b.j;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.x0.f;
import a.a.a.a.v0.e.x0.g;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.k.b.f0.h;
import java.util.List;

public final class d extends i implements c {
    public h.a H;
    public final a.a.a.a.v0.e.h I;
    public final c J;
    public final e K;
    public final g L;
    public final g M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a.a.a.a.v0.b.e eVar, j jVar, a.a.a.a.v0.b.b1.h hVar, boolean z, b.a aVar, a.a.a.a.v0.e.h hVar2, c cVar, e eVar2, g gVar, g gVar2, m0 m0Var) {
        super(eVar, jVar, hVar, z, aVar, m0Var != null ? m0Var : m0.f491a);
        if (eVar == null) {
            a.w.c.i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            a.w.c.i.a("annotations");
            throw null;
        } else if (aVar == null) {
            a.w.c.i.a("kind");
            throw null;
        } else if (hVar2 == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar == null) {
            a.w.c.i.a("nameResolver");
            throw null;
        } else if (eVar2 == null) {
            a.w.c.i.a("typeTable");
            throw null;
        } else if (gVar != null) {
            this.I = hVar2;
            this.J = cVar;
            this.K = eVar2;
            this.L = gVar;
            this.M = gVar2;
            this.H = h.a.COMPATIBLE;
        } else {
            a.w.c.i.a("versionRequirementTable");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public c B0() {
        return this.J;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public List<f> F0() {
        return e.f.a.g.a((h) this);
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.d1.s
    public boolean H() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s
    public boolean M() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s
    public boolean Q() {
        return false;
    }

    public d a(k kVar, s sVar, b.a aVar, a.a.a.a.v0.b.b1.h hVar, m0 m0Var) {
        if (kVar == null) {
            a.w.c.i.a("newOwner");
            throw null;
        } else if (aVar == null) {
            a.w.c.i.a("kind");
            throw null;
        } else if (hVar == null) {
            a.w.c.i.a("annotations");
            throw null;
        } else if (m0Var != null) {
            d dVar = new d((a.a.a.a.v0.b.e) kVar, (j) sVar, hVar, this.F, aVar, this.I, this.J, this.K, this.L, this.M, m0Var);
            h.a aVar2 = this.H;
            if (aVar2 != null) {
                dVar.H = aVar2;
                return dVar;
            }
            a.w.c.i.a("<set-?>");
            throw null;
        } else {
            a.w.c.i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public e c0() {
        return this.K;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public q n0() {
        return this.I;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public g t0() {
        return this.L;
    }
}

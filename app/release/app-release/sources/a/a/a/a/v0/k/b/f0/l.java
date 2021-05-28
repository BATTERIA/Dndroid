package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.d1.j0;
import a.a.a.a.v0.b.d1.s;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.x0.f;
import a.a.a.a.v0.e.x0.g;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.k.b.f0.h;
import a.a.a.a.v0.m.d0;
import a.w.c.i;
import java.util.List;
import java.util.Map;

public final class l extends j0 implements c {
    public h.a F;
    public final r G;
    public final c H;
    public final e I;
    public final g J;
    public final g K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(k kVar, l0 l0Var, a.a.a.a.v0.b.b1.h hVar, d dVar, b.a aVar, r rVar, c cVar, e eVar, g gVar, g gVar2, m0 m0Var) {
        super(kVar, l0Var, hVar, dVar, aVar, m0Var != null ? m0Var : m0.f491a);
        if (kVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (rVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (gVar != null) {
            this.G = rVar;
            this.H = cVar;
            this.I = eVar;
            this.J = gVar;
            this.K = gVar2;
            this.F = h.a.COMPATIBLE;
        } else {
            i.a("versionRequirementTable");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public c B0() {
        return this.H;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public List<f> F0() {
        return e.f.a.g.a((h) this);
    }

    @Override // a.a.a.a.v0.b.d1.j0, a.a.a.a.v0.b.d1.s
    public s a(k kVar, a.a.a.a.v0.b.s sVar, b.a aVar, d dVar, a.a.a.a.v0.b.b1.h hVar, m0 m0Var) {
        d dVar2;
        if (kVar == null) {
            i.a("newOwner");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (m0Var != null) {
            l0 l0Var = (l0) sVar;
            if (dVar != null) {
                dVar2 = dVar;
            } else {
                d d2 = d();
                i.a((Object) d2, "name");
                dVar2 = d2;
            }
            l lVar = new l(kVar, l0Var, hVar, dVar2, aVar, this.G, this.H, this.I, this.J, this.K, m0Var);
            lVar.F = this.F;
            return lVar;
        } else {
            i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public e c0() {
        return this.I;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public q n0() {
        return this.G;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public g t0() {
        return this.J;
    }

    public final j0 a(i0 i0Var, i0 i0Var2, List<? extends r0> list, List<? extends w0> list2, d0 d0Var, v vVar, a1 a1Var, Map<? extends a.AbstractC0014a<?>, ?> map, h.a aVar) {
        if (list == null) {
            i.a("typeParameters");
            throw null;
        } else if (list2 == null) {
            i.a("unsubstitutedValueParameters");
            throw null;
        } else if (a1Var == null) {
            i.a("visibility");
            throw null;
        } else if (map == null) {
            i.a("userDataMap");
            throw null;
        } else if (aVar != null) {
            super.a(i0Var, i0Var2, list, list2, d0Var, vVar, a1Var, map);
            this.F = aVar;
            i.a((Object) this, "super.initialize(\n      …easeEnvironment\n        }");
            return this;
        } else {
            i.a("isExperimentalCoroutineInReleaseEnvironment");
            throw null;
        }
    }
}

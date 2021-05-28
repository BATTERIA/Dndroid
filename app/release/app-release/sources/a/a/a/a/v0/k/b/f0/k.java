package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.f0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.x0.f;
import a.a.a.a.v0.e.x0.g;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.k.b.f0.h;
import a.w.c.i;
import e.a.a.a.a;
import java.util.List;

public final class k extends f0 implements c {
    public final z C;
    public final c D;
    public final e E;
    public final g F;
    public final g G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a.a.a.a.v0.b.k kVar, a.a.a.a.v0.b.f0 f0Var, h hVar, v vVar, a1 a1Var, boolean z, d dVar, b.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, z zVar, c cVar, e eVar, g gVar, g gVar2) {
        super(kVar, f0Var, hVar, vVar, a1Var, z, dVar, aVar, m0.f491a, z2, z3, z6, false, z4, z5);
        if (kVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (vVar == null) {
            i.a("modality");
            throw null;
        } else if (a1Var == null) {
            i.a("visibility");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (zVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (gVar != null) {
            this.C = zVar;
            this.D = cVar;
            this.E = eVar;
            this.F = gVar;
            this.G = gVar2;
            h.a aVar2 = h.a.COMPATIBLE;
        } else {
            i.a("versionRequirementTable");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public c B0() {
        return this.D;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public List<f> F0() {
        return e.f.a.g.a((h) this);
    }

    @Override // a.a.a.a.v0.b.d1.f0, a.a.a.a.v0.b.u
    public boolean H() {
        return a.a(a.a.a.a.v0.e.x0.b.z, this.C.f1335f, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }

    @Override // a.a.a.a.v0.b.d1.f0
    public f0 a(a.a.a.a.v0.b.k kVar, v vVar, a1 a1Var, a.a.a.a.v0.b.f0 f0Var, b.a aVar, d dVar, m0 m0Var) {
        if (kVar == null) {
            i.a("newOwner");
            throw null;
        } else if (vVar == null) {
            i.a("newModality");
            throw null;
        } else if (a1Var == null) {
            i.a("newVisibility");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (dVar == null) {
            i.a("newName");
            throw null;
        } else if (m0Var != null) {
            return new k(kVar, f0Var, y(), vVar, a1Var, this.f412h, dVar, aVar, this.o, this.p, H(), this.t, this.q, this.C, this.D, this.E, this.F, this.G);
        } else {
            i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public e c0() {
        return this.E;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public q n0() {
        return this.C;
    }

    @Override // a.a.a.a.v0.k.b.f0.h
    public g t0() {
        return this.F;
    }
}

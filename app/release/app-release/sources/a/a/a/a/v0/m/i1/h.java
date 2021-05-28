package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.k1.b;
import a.a.a.a.v0.m.k1.c;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.w;
import a.t.l;
import a.w.c.i;
import java.util.List;

public final class h extends k0 implements c {

    /* renamed from: d  reason: collision with root package name */
    public final b f1875d;

    /* renamed from: e  reason: collision with root package name */
    public final j f1876e;

    /* renamed from: f  reason: collision with root package name */
    public final f1 f1877f;

    /* renamed from: g  reason: collision with root package name */
    public final a.a.a.a.v0.b.b1.h f1878g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1879h;

    public h(b bVar, j jVar, f1 f1Var, a.a.a.a.v0.b.b1.h hVar, boolean z) {
        if (bVar == null) {
            i.a("captureStatus");
            throw null;
        } else if (jVar == null) {
            i.a("constructor");
            throw null;
        } else if (hVar != null) {
            this.f1875d = bVar;
            this.f1876e = jVar;
            this.f1877f = f1Var;
            this.f1878g = hVar;
            this.f1879h = z;
        } else {
            i.a("annotations");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.d0
    public List<v0> H0() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.m.d0
    public s0 I0() {
        return this.f1876e;
    }

    @Override // a.a.a.a.v0.m.d0
    public boolean J0() {
        return this.f1879h;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    /* renamed from: a  reason: collision with other method in class */
    public k0 m78a(boolean z) {
        return new h(this.f1875d, this.f1876e, this.f1877f, this.f1878g, z);
    }

    @Override // a.a.a.a.v0.m.d0
    public a.a.a.a.v0.j.w.i u() {
        a.a.a.a.v0.j.w.i a2 = w.a("No member resolution should be done on captured type!", true);
        i.a((Object) a2, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return a2;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public a.a.a.a.v0.b.b1.h y() {
        return this.f1878g;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public f1 a(boolean z) {
        return new h(this.f1875d, this.f1876e, this.f1877f, this.f1878g, z);
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public h a(f fVar) {
        f1 f1Var = null;
        if (fVar != null) {
            b bVar = this.f1875d;
            j a2 = this.f1876e.a(fVar);
            f1 f1Var2 = this.f1877f;
            if (f1Var2 != null) {
                fVar.a(f1Var2);
                f1Var = f1Var2.K0();
            }
            return new h(bVar, a2, f1Var, this.f1878g, this.f1879h);
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public h a(a.a.a.a.v0.b.b1.h hVar) {
        if (hVar != null) {
            return new h(this.f1875d, this.f1876e, this.f1877f, hVar, this.f1879h);
        }
        i.a("newAnnotations");
        throw null;
    }
}

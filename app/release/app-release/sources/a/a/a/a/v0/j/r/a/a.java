package a.a.a.a.v0.j.r.a;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.k1.c;
import a.a.a.a.v0.m.r0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.w;
import a.t.l;
import a.w.c.i;
import java.util.List;

public final class a extends k0 implements r0, c {

    /* renamed from: d  reason: collision with root package name */
    public final v0 f1570d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1571e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1572f;

    /* renamed from: g  reason: collision with root package name */
    public final h f1573g;

    public a(v0 v0Var, b bVar, boolean z, h hVar) {
        if (v0Var == null) {
            i.a("typeProjection");
            throw null;
        } else if (bVar == null) {
            i.a("constructor");
            throw null;
        } else if (hVar != null) {
            this.f1570d = v0Var;
            this.f1571e = bVar;
            this.f1572f = z;
            this.f1573g = hVar;
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
        return this.f1571e;
    }

    @Override // a.a.a.a.v0.m.d0
    public boolean J0() {
        return this.f1572f;
    }

    @Override // a.a.a.a.v0.m.r0
    public d0 U() {
        g1 g1Var = g1.IN_VARIANCE;
        d0 f2 = a.a.a.a.v0.m.l1.a.c(this).f();
        i.a((Object) f2, "builtIns.nothingType");
        if (this.f1570d.a() == g1Var) {
            f2 = this.f1570d.c();
        }
        i.a((Object) f2, "if (typeProjection.proje…jection.type else default");
        return f2;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    /* renamed from: a  reason: collision with other method in class */
    public k0 m75a(boolean z) {
        return z == this.f1572f ? this : new a(this.f1570d, this.f1571e, z, this.f1573g);
    }

    @Override // a.a.a.a.v0.m.r0
    public boolean b(d0 d0Var) {
        if (d0Var != null) {
            return this.f1571e == d0Var.I0();
        }
        i.a("type");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k0
    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Captured(");
        a2.append(this.f1570d);
        a2.append(')');
        a2.append(this.f1572f ? "?" : "");
        return a2.toString();
    }

    @Override // a.a.a.a.v0.m.d0
    public a.a.a.a.v0.j.w.i u() {
        a.a.a.a.v0.j.w.i a2 = w.a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        i.a((Object) a2, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return a2;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        return this.f1573g;
    }

    @Override // a.a.a.a.v0.m.r0
    public d0 z0() {
        g1 g1Var = g1.OUT_VARIANCE;
        d0 g2 = a.a.a.a.v0.m.l1.a.c(this).g();
        i.a((Object) g2, "builtIns.nullableAnyType");
        if (this.f1570d.a() == g1Var) {
            g2 = this.f1570d.c();
        }
        i.a((Object) g2, "if (typeProjection.proje…jection.type else default");
        return g2;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public f1 a(boolean z) {
        return z == this.f1572f ? this : new a(this.f1570d, this.f1571e, z, this.f1573g);
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public a a(f fVar) {
        if (fVar != null) {
            v0 a2 = this.f1570d.a(fVar);
            i.a((Object) a2, "typeProjection.refine(kotlinTypeRefiner)");
            return new a(a2, this.f1571e, this.f1572f, this.f1573g);
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public a a(h hVar) {
        if (hVar != null) {
            return new a(this.f1570d, this.f1571e, this.f1572f, hVar);
        }
        i.a("newAnnotations");
        throw null;
    }
}

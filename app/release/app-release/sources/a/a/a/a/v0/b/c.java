package a.a.a.a.v0.b;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.w.c.i;
import java.util.List;

public final class c implements r0 {

    /* renamed from: c  reason: collision with root package name */
    public final r0 f343c;

    /* renamed from: d  reason: collision with root package name */
    public final k f344d;

    /* renamed from: e  reason: collision with root package name */
    public final int f345e;

    public c(r0 r0Var, k kVar, int i) {
        if (r0Var == null) {
            i.a("originalDescriptor");
            throw null;
        } else if (kVar != null) {
            this.f343c = r0Var;
            this.f344d = kVar;
            this.f345e = i;
        } else {
            i.a("declarationDescriptor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.r0
    public g1 F() {
        return this.f343c.F();
    }

    @Override // a.a.a.a.v0.b.r0
    public j O() {
        return this.f343c.O();
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    public r0 a() {
        r0 a2 = this.f343c.a();
        i.a((Object) a2, "originalDescriptor.original");
        return a2;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return (R) this.f343c.a(mVar, d2);
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.k
    public k b() {
        return this.f344d;
    }

    @Override // a.a.a.a.v0.b.k
    public d d() {
        return this.f343c.d();
    }

    @Override // a.a.a.a.v0.b.r0
    public List<d0> getUpperBounds() {
        return this.f343c.getUpperBounds();
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.h
    public s0 n() {
        return this.f343c.n();
    }

    @Override // a.a.a.a.v0.b.r0
    public boolean o0() {
        return true;
    }

    @Override // a.a.a.a.v0.b.r0
    public boolean p0() {
        return this.f343c.p0();
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        return this.f343c.r();
    }

    public String toString() {
        return this.f343c + "[inner-copy]";
    }

    @Override // a.a.a.a.v0.b.h
    public k0 v() {
        return this.f343c.v();
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        return this.f343c.y();
    }

    @Override // a.a.a.a.v0.b.r0
    public int z() {
        return this.f343c.z() + this.f345e;
    }
}

package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.w;
import a.w.b.l;
import e.a.a.a.a;
import java.util.List;

public final class l0 extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final s0 f1919d;

    /* renamed from: e  reason: collision with root package name */
    public final List<v0> f1920e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1921f;

    /* renamed from: g  reason: collision with root package name */
    public final i f1922g;

    /* renamed from: h  reason: collision with root package name */
    public final l<f, k0> f1923h;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends a.a.a.a.v0.m.v0> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: a.w.b.l<? super a.a.a.a.v0.m.i1.f, ? extends a.a.a.a.v0.m.k0> */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(s0 s0Var, List<? extends v0> list, boolean z, i iVar, l<? super f, ? extends k0> lVar) {
        if (s0Var == null) {
            a.w.c.i.a("constructor");
            throw null;
        } else if (list == 0) {
            a.w.c.i.a("arguments");
            throw null;
        } else if (iVar == null) {
            a.w.c.i.a("memberScope");
            throw null;
        } else if (lVar != 0) {
            this.f1919d = s0Var;
            this.f1920e = list;
            this.f1921f = z;
            this.f1922g = iVar;
            this.f1923h = lVar;
            if (iVar instanceof w.d) {
                StringBuilder a2 = a.a("SimpleTypeImpl should not be created for error type: ");
                a2.append(this.f1922g);
                a2.append('\n');
                a2.append(this.f1919d);
                throw new IllegalStateException(a2.toString());
            }
        } else {
            a.w.c.i.a("refinedTypeFactory");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.d0
    public List<v0> H0() {
        return this.f1920e;
    }

    @Override // a.a.a.a.v0.m.d0
    public s0 I0() {
        return this.f1919d;
    }

    @Override // a.a.a.a.v0.m.d0
    public boolean J0() {
        return this.f1921f;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        if (z == this.f1921f) {
            return this;
        }
        return z ? new i0(this) : new h0(this);
    }

    @Override // a.a.a.a.v0.m.d0
    public i u() {
        return this.f1922g;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        if (h.b != null) {
            return h.a.f321a;
        }
        throw null;
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public k0 a(f fVar) {
        if (fVar != null) {
            k0 a2 = this.f1923h.a(fVar);
            return a2 != null ? a2 : this;
        }
        a.w.c.i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(h hVar) {
        if (hVar != null) {
            return hVar.isEmpty() ? this : new m(this, hVar);
        }
        a.w.c.i.a("newAnnotations");
        throw null;
    }
}

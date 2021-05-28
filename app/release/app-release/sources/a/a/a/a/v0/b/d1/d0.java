package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.f.b;
import a.n;
import a.w.c.i;
import e.a.a.a.a;

public abstract class d0 extends n implements y {

    /* renamed from: g  reason: collision with root package name */
    public final b f366g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(w wVar, b bVar) {
        super(wVar, h.a.f321a, bVar.e(), m0.f491a);
        if (wVar == null) {
            i.a("module");
            throw null;
        } else if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (h.b != null) {
            this.f366g = bVar;
        } else {
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        if (mVar != null) {
            return mVar.a(this, d2);
        }
        i.a("visitor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.k, a.a.a.a.v0.b.y
    public w b() {
        k b = super.b();
        if (b != null) {
            return (w) b;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }

    @Override // a.a.a.a.v0.b.y
    public final b e() {
        return this.f366g;
    }

    @Override // a.a.a.a.v0.b.n, a.a.a.a.v0.b.d1.n
    public m0 r() {
        m0 m0Var = m0.f491a;
        i.a((Object) m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }

    @Override // a.a.a.a.v0.b.d1.m
    public String toString() {
        StringBuilder a2 = a.a("package ");
        a2.append(this.f366g);
        return a2.toString();
    }
}

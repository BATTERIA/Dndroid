package a.a.a.a.v0.m;

import a.a.a.a.v0.l.b;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.i1.f;
import a.w.b.a;
import a.w.c.i;

public final class g0 extends h1 {

    /* renamed from: d  reason: collision with root package name */
    public final g<d0> f1850d;

    /* renamed from: e  reason: collision with root package name */
    public final j f1851e;

    /* renamed from: f  reason: collision with root package name */
    public final a<d0> f1852f;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.a<? extends a.a.a.a.v0.m.d0> */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(j jVar, a<? extends d0> aVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (aVar != 0) {
            this.f1851e = jVar;
            this.f1852f = aVar;
            this.f1850d = jVar.a(aVar);
        } else {
            i.a("computation");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.h1
    public d0 L0() {
        return (d0) this.f1850d.a();
    }

    @Override // a.a.a.a.v0.m.h1
    public boolean M0() {
        b.h hVar = (b.h) this.f1850d;
        return (hVar.f1799e == b.n.NOT_COMPUTED || hVar.f1799e == b.n.COMPUTING) ? false : true;
    }

    @Override // a.a.a.a.v0.m.d0
    public d0 a(f fVar) {
        if (fVar != null) {
            return new g0(this.f1851e, new f0(this, fVar));
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }
}

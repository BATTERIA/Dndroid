package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.a0.n.k;
import a.a.a.a.v0.d.a.c0.q;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.t.l;
import a.w.c.i;
import java.util.Collection;
import java.util.List;

public abstract class r extends k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(h hVar) {
        super(hVar, null);
        if (hVar != null) {
        } else {
            i.a("c");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public void a(d dVar, Collection<f0> collection) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (collection == null) {
            i.a("result");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public i0 d() {
        return null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public k.a a(q qVar, List<? extends r0> list, d0 d0Var, List<? extends w0> list2) {
        if (qVar == null) {
            i.a("method");
            throw null;
        } else if (list == null) {
            i.a("methodTypeParameters");
            throw null;
        } else if (d0Var == null) {
            i.a("returnType");
            throw null;
        } else if (list2 != null) {
            return new k.a(d0Var, null, list2, list, false, l.f2119c);
        } else {
            i.a("valueParameters");
            throw null;
        }
    }
}

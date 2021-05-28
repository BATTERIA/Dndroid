package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.d1.c;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.a0.f;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.c0.j;
import a.a.a.a.v0.d.a.c0.w;
import a.a.a.a.v0.d.a.y.l;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s extends c {
    public final f m;
    public final h n;
    public final w o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(h hVar, w wVar, int i, k kVar) {
        super(hVar.f562c.f545a, kVar, wVar.d(), g1.INVARIANT, false, i, m0.f491a, hVar.f562c.m);
        if (hVar == null) {
            i.a("c");
            throw null;
        } else if (wVar == null) {
            i.a("javaTypeParameter");
            throw null;
        } else if (kVar != null) {
            this.n = hVar;
            this.o = wVar;
            this.m = new f(this.n, this.o);
        } else {
            i.a("containingDeclaration");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.g
    public List<d0> U() {
        Collection<j> upperBounds = this.o.getUpperBounds();
        if (upperBounds.isEmpty()) {
            k0 b = this.n.f562c.o.m().b();
            i.a((Object) b, "c.module.builtIns.anyType");
            k0 g2 = this.n.f562c.o.m().g();
            i.a((Object) g2, "c.module.builtIns.nullableAnyType");
            return g.c((Object) e0.a(b, g2));
        }
        ArrayList arrayList = new ArrayList(g.a(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.n.b.a(it.next(), a.a.a.a.v0.d.a.a0.o.g.a(l.COMMON, false, (r0) this, 1)));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.d1.g
    public void a(d0 d0Var) {
        if (d0Var == null) {
            i.a("type");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.a, a.a.a.a.v0.b.b1.b
    public a.a.a.a.v0.b.b1.h y() {
        return this.m;
    }
}

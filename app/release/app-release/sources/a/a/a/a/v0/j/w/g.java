package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.j.w.d;
import a.w.b.l;
import a.w.c.i;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class g extends j {
    public final i b;

    public g(i iVar) {
        if (iVar != null) {
            this.b = iVar;
        } else {
            i.a("workerScope");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public Collection a(d dVar, l lVar) {
        d dVar2 = null;
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            d.a aVar = d.u;
            int i = d.k & dVar.f1618a;
            if (i != 0) {
                dVar2 = new d(i, dVar.b);
            }
            if (dVar2 == null) {
                return a.t.l.f2119c;
            }
            Collection<k> a2 = this.b.a(dVar2, lVar);
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                if (t instanceof a.a.a.a.v0.b.i) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> a() {
        return this.b.a();
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public h b(a.a.a.a.v0.f.d dVar, b bVar) {
        q0 q0Var = null;
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            h b2 = this.b.b(dVar, bVar);
            if (b2 == null) {
                return null;
            }
            e eVar = (e) (!(b2 instanceof e) ? null : b2);
            if (eVar != null) {
                return eVar;
            }
            if (b2 instanceof q0) {
                q0Var = b2;
            }
            return q0Var;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> b() {
        return this.b.b();
    }

    public String toString() {
        StringBuilder a2 = a.a("Classes from ");
        a2.append(this.b);
        return a2.toString();
    }
}

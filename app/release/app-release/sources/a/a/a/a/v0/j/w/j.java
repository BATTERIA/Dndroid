package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.y0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.o.g;
import a.w.b.l;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class j implements i {
    @Override // a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, l<? super d, Boolean> lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            return a.t.l.f2119c;
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.k
    public h b(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return null;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<? extends f0> c(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a.t.l.f2119c;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> b() {
        Collection<k> a2 = a(d.r, g.f1996a);
        ArrayList<y0> arrayList = new ArrayList();
        for (T t : a2) {
            if (t instanceof y0) {
                arrayList.add(t);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (y0 y0Var : arrayList) {
            linkedHashSet.add(y0Var.d());
        }
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<? extends l0> a(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a.t.l.f2119c;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> a() {
        Collection<k> a2 = a(d.q, g.f1996a);
        ArrayList<l0> arrayList = new ArrayList();
        for (T t : a2) {
            if (t instanceof l0) {
                arrayList.add(t);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (l0 l0Var : arrayList) {
            linkedHashSet.add(l0Var.d());
        }
        return linkedHashSet;
    }
}

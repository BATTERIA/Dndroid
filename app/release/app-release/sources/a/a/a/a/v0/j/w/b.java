package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.l1.a;
import a.t.n;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class b implements i {
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final List<i> f1609c;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends a.a.a.a.v0.j.w.i> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, List<? extends i> list) {
        if (str == null) {
            i.a("debugName");
            throw null;
        } else if (list != 0) {
            this.b = str;
            this.f1609c = list;
        } else {
            i.a("scopes");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, l<? super d, Boolean> lVar) {
        Collection<k> collection = null;
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            List<i> list = this.f1609c;
            if (!list.isEmpty()) {
                for (i iVar : list) {
                    collection = a.a((Collection) collection, (Collection) iVar.a(dVar, lVar));
                }
                if (collection != null) {
                    return collection;
                }
            }
            return n.f2121c;
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> a() {
        List<i> list = this.f1609c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.a((Collection) linkedHashSet, (Iterable) it.next().a());
        }
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.j.w.k
    public h b(d dVar, a.a.a.a.v0.c.a.b bVar) {
        h hVar = null;
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            for (i iVar : this.f1609c) {
                h b2 = iVar.b(dVar, bVar);
                if (b2 != null) {
                    if (!(b2 instanceof a.a.a.a.v0.b.i) || !((a.a.a.a.v0.b.i) b2).D()) {
                        return b2;
                    }
                    if (hVar == null) {
                        hVar = b2;
                    }
                }
            }
            return hVar;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> b() {
        List<i> list = this.f1609c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g.a((Collection) linkedHashSet, (Iterable) it.next().b());
        }
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<f0> c(d dVar, a.a.a.a.v0.c.a.b bVar) {
        Collection<f0> collection = null;
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            List<i> list = this.f1609c;
            if (!list.isEmpty()) {
                for (i iVar : list) {
                    collection = a.a((Collection) collection, (Collection) iVar.c(dVar, bVar));
                }
                if (collection != null) {
                    return collection;
                }
            }
            return n.f2121c;
        } else {
            i.a("location");
            throw null;
        }
    }

    public String toString() {
        return this.b;
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<l0> a(d dVar, a.a.a.a.v0.c.a.b bVar) {
        Collection<l0> collection = null;
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            List<i> list = this.f1609c;
            if (!list.isEmpty()) {
                for (i iVar : list) {
                    collection = a.a((Collection) collection, (Collection) iVar.a(dVar, bVar));
                }
                if (collection != null) {
                    return collection;
                }
            }
            return n.f2121c;
        } else {
            i.a("location");
            throw null;
        }
    }
}

package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.j.w.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.g;
import a.a.l;
import a.t.f;
import a.t.n;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class c implements i {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ l[] f579f = {s.a(new p(s.a(c.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public final g f580c;

    /* renamed from: d  reason: collision with root package name */
    public final h f581d;

    /* renamed from: e  reason: collision with root package name */
    public final i f582e;

    public static final class a extends j implements a.w.b.a<List<? extends i>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f583c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f583c = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends i> a() {
            Collection<a.a.a.a.v0.d.b.l> values = this.f583c.f582e.U().values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                c cVar = this.f583c;
                i a2 = cVar.f581d.f562c.f547d.a(cVar.f582e, it.next());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return f.g(arrayList);
        }
    }

    public c(h hVar, t tVar, i iVar) {
        if (hVar == null) {
            a.w.c.i.a("c");
            throw null;
        } else if (tVar == null) {
            a.w.c.i.a("jPackage");
            throw null;
        } else if (iVar != null) {
            this.f581d = hVar;
            this.f582e = iVar;
            this.b = new j(this.f581d, tVar, this.f582e);
            this.f580c = this.f581d.f562c.f545a.a(new a(this));
        } else {
            a.w.c.i.a("packageFragment");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar == null) {
            a.w.c.i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            j jVar = this.b;
            List<i> c2 = c();
            Collection<k> a2 = jVar.a(dVar, lVar);
            for (i iVar : c2) {
                a2 = a.a.a.a.v0.m.l1.a.a((Collection) a2, (Collection) iVar.a(dVar, lVar));
            }
            return a2 != null ? a2 : n.f2121c;
        } else {
            a.w.c.i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> a() {
        List<i> c2 = c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            e.f.a.g.a((Collection) linkedHashSet, (Iterable) it.next().a());
        }
        linkedHashSet.addAll(this.b.a());
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.j.w.k
    public a.a.a.a.v0.b.h b(a.a.a.a.v0.f.d dVar, b bVar) {
        a.a.a.a.v0.b.h hVar = null;
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar != null) {
            d(dVar, bVar);
            e b2 = this.b.b(dVar, bVar);
            if (b2 != null) {
                return b2;
            }
            for (i iVar : c()) {
                a.a.a.a.v0.b.h b3 = iVar.b(dVar, bVar);
                if (b3 != null) {
                    if (!(b3 instanceof a.a.a.a.v0.b.i) || !((a.a.a.a.v0.b.i) b3).D()) {
                        return b3;
                    }
                    if (hVar == null) {
                        hVar = b3;
                    }
                }
            }
            return hVar;
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> b() {
        List<i> c2 = c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            e.f.a.g.a((Collection) linkedHashSet, (Iterable) it.next().b());
        }
        linkedHashSet.addAll(this.b.b());
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<f0> c(a.a.a.a.v0.f.d dVar, b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar != null) {
            d(dVar, bVar);
            j jVar = this.b;
            List<i> c2 = c();
            Collection<? extends f0> c3 = jVar.c(dVar, bVar);
            Collection collection = c3;
            for (i iVar : c2) {
                collection = a.a.a.a.v0.m.l1.a.a(collection, (Collection) iVar.c(dVar, bVar));
            }
            return collection != null ? collection : n.f2121c;
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }

    public final List<i> c() {
        return (List) e.f.a.g.a(this.f580c, f579f[0]);
    }

    public void d(a.a.a.a.v0.f.d dVar, b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar != null) {
            e.f.a.g.a(this.f581d.f562c.n, bVar, this.f582e, dVar);
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<l0> a(a.a.a.a.v0.f.d dVar, b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar != null) {
            d(dVar, bVar);
            j jVar = this.b;
            List<i> c2 = c();
            Collection<? extends l0> a2 = jVar.a(dVar, bVar);
            Collection collection = a2;
            for (i iVar : c2) {
                collection = a.a.a.a.v0.m.l1.a.a(collection, (Collection) iVar.a(dVar, bVar));
            }
            return collection != null ? collection : n.f2121c;
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }
}

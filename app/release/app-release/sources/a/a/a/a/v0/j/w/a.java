package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.f.d;
import a.w.b.l;
import a.w.c.i;
import java.util.Collection;
import java.util.Set;

public abstract class a implements i {
    @Override // a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, l<? super d, Boolean> lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            return c().a(dVar, lVar);
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> a() {
        return c().a();
    }

    @Override // a.a.a.a.v0.j.w.k
    public h b(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return c().b(dVar, bVar);
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> b() {
        return c().b();
    }

    public abstract i c();

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.Collection<? extends a.a.a.a.v0.b.f0>, java.util.Collection<a.a.a.a.v0.b.f0> */
    @Override // a.a.a.a.v0.j.w.i
    public Collection<f0> c(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return c().c(dVar, bVar);
        } else {
            i.a("location");
            throw null;
        }
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.Collection<? extends a.a.a.a.v0.b.l0>, java.util.Collection<a.a.a.a.v0.b.l0> */
    @Override // a.a.a.a.v0.j.w.i
    public Collection<l0> a(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return c().a(dVar, bVar);
        } else {
            i.a("location");
            throw null;
        }
    }
}

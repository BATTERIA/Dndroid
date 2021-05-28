package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.l.j;
import a.a.l;
import a.w.b.a;
import a.w.c.i;
import a.w.c.p;
import a.w.c.s;
import java.util.Iterator;
import java.util.List;

public class b implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ l[] f1678d = {s.a(new p(s.a(b.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: c  reason: collision with root package name */
    public final g f1679c;

    public b(j jVar, a<? extends List<? extends c>> aVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (aVar != null) {
            this.f1679c = jVar.a(aVar);
        } else {
            i.a("compute");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return e.f.a.g.a(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return e.f.a.g.b(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        return ((List) e.f.a.g.a(this.f1679c, f1678d[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return ((List) e.f.a.g.a(this.f1679c, f1678d[0])).iterator();
    }
}

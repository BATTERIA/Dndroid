package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.b1.h;
import a.t.k;
import a.w.c.i;
import e.f.a.g;
import java.util.Iterator;

public final class b implements h {

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.f.b f691c;

    public b(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            this.f691c = bVar;
        } else {
            i.a("fqNameToMatch");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(a.a.a.a.v0.f.b bVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (i.a(bVar, this.f691c)) {
            return a.f690a;
        } else {
            return null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return g.b(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return k.f2118c;
    }
}

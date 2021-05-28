package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.f.b;
import e.f.a.g;
import java.util.Iterator;
import java.util.List;

public final class i implements h {

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f322c;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.b1.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends c> list) {
        if (list != 0) {
            this.f322c = list;
        } else {
            a.w.c.i.a("annotations");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(b bVar) {
        if (bVar != null) {
            return g.a(this, bVar);
        }
        a.w.c.i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(b bVar) {
        if (bVar != null) {
            return g.b(this, bVar);
        }
        a.w.c.i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        return this.f322c.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f322c.iterator();
    }

    public String toString() {
        return this.f322c.toString();
    }
}

package a.t;

import a.w.c.i;
import a.w.c.w.a;
import java.util.Iterator;

public final class p<T> implements Iterable<o<? extends T>>, a {

    /* renamed from: c  reason: collision with root package name */
    public final a.w.b.a<Iterator<T>> f2123c;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.w.b.a<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(a.w.b.a<? extends Iterator<? extends T>> aVar) {
        if (aVar != 0) {
            this.f2123c = aVar;
        } else {
            i.a("iteratorFactory");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<o<T>> iterator() {
        return new q(this.f2123c.a());
    }
}

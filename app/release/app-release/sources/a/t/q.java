package a.t;

import a.w.c.i;
import a.w.c.w.a;
import e.f.a.g;
import java.util.Iterator;

public final class q<T> implements Iterator<o<? extends T>>, a {

    /* renamed from: c  reason: collision with root package name */
    public int f2124c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterator<T> f2125d;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Iterator<? extends T> it) {
        if (it != 0) {
            this.f2125d = it;
        } else {
            i.a("iterator");
            throw null;
        }
    }

    public final boolean hasNext() {
        return this.f2125d.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f2124c;
        this.f2124c = i + 1;
        if (i >= 0) {
            return new o(i, this.f2125d.next());
        }
        g.d();
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

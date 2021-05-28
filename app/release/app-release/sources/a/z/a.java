package a.z;

import a.w.c.i;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<h<T>> f2161a;

    public a(h<? extends T> hVar) {
        if (hVar != null) {
            this.f2161a = new AtomicReference<>(hVar);
        } else {
            i.a("sequence");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        h<T> andSet = this.f2161a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

package a.t;

import a.w.c.e;
import a.w.c.i;
import a.w.c.w.a;
import e.f.a.g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class c<T> implements Collection<T>, a {

    /* renamed from: c  reason: collision with root package name */
    public final T[] f2111c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2112d;

    public c(T[] tArr, boolean z) {
        if (tArr != null) {
            this.f2111c = tArr;
            this.f2112d = z;
            return;
        }
        i.a("values");
        throw null;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return g.a(this.f2111c, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection == null) {
            i.a("elements");
            throw null;
        } else if (collection.isEmpty()) {
            return true;
        } else {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isEmpty() {
        return this.f2111c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return g.e((Object[]) this.f2111c);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f2111c.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f2111c;
        boolean z = this.f2112d;
        if (tArr == null) {
            i.a("$this$copyToArrayOfAny");
            throw null;
        } else if (z && i.a(tArr.getClass(), Object[].class)) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            i.a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
            return copyOf;
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) e.a(this, tArr);
    }
}

package a.w.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, a.w.c.w.a {

    /* renamed from: c  reason: collision with root package name */
    public int f2129c;

    /* renamed from: d  reason: collision with root package name */
    public final T[] f2130d;

    public a(T[] tArr) {
        if (tArr != null) {
            this.f2130d = tArr;
        } else {
            i.a("array");
            throw null;
        }
    }

    public boolean hasNext() {
        return this.f2129c < this.f2130d.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f2130d;
            int i = this.f2129c;
            this.f2129c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f2129c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

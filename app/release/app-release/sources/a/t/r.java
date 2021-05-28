package a.t;

import a.w.c.w.a;
import java.util.Iterator;

public abstract class r implements Iterator<Integer>, a {
    public abstract int a();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public Integer next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

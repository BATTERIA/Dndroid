package a.a.a.a.w0;

import java.util.Iterator;

public final class a<E> implements Iterable<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final a<Object> f2028f = new a<>();

    /* renamed from: c  reason: collision with root package name */
    public final E f2029c;

    /* renamed from: d  reason: collision with root package name */
    public final a<E> f2030d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2031e;

    /* renamed from: a.a.a.a.w0.a$a  reason: collision with other inner class name */
    public static class C0076a<E> implements Iterator<E> {

        /* renamed from: c  reason: collision with root package name */
        public a<E> f2032c;

        public C0076a(a<E> aVar) {
            this.f2032c = aVar;
        }

        public boolean hasNext() {
            return this.f2032c.f2031e > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a<E> aVar = this.f2032c;
            E e2 = aVar.f2029c;
            this.f2032c = aVar.f2030d;
            return e2;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a() {
        this.f2031e = 0;
        this.f2029c = null;
        this.f2030d = null;
    }

    public a(E e2, a<E> aVar) {
        this.f2029c = e2;
        this.f2030d = aVar;
        this.f2031e = aVar.f2031e + 1;
    }

    public final a<E> a(Object obj) {
        if (this.f2031e == 0) {
            return this;
        }
        if (this.f2029c.equals(obj)) {
            return this.f2030d;
        }
        a<E> a2 = this.f2030d.a(obj);
        return a2 == this.f2030d ? this : new a<>(this.f2029c, a2);
    }

    public final a<E> b(int i) {
        if (i >= 0 && i <= this.f2031e) {
            return i == 0 ? this : this.f2030d.b(i - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new C0076a(b(0));
    }
}

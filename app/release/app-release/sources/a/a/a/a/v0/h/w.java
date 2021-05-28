package a.a.a.a.v0.h;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class w extends AbstractList<String> implements RandomAccess, o {

    /* renamed from: c  reason: collision with root package name */
    public final o f1450c;

    public class a implements ListIterator<String> {

        /* renamed from: c  reason: collision with root package name */
        public ListIterator<String> f1451c = w.this.f1450c.listIterator(this.f1452d);

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1452d;

        public a(int i) {
            this.f1452d = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f1451c.hasNext();
        }

        public boolean hasPrevious() {
            return this.f1451c.hasPrevious();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator, java.util.ListIterator
        public String next() {
            return this.f1451c.next();
        }

        public int nextIndex() {
            return this.f1451c.nextIndex();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.ListIterator
        public String previous() {
            return this.f1451c.previous();
        }

        public int previousIndex() {
            return this.f1451c.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: c  reason: collision with root package name */
        public Iterator<String> f1454c = w.this.f1450c.iterator();

        public b() {
        }

        public boolean hasNext() {
            return this.f1454c.hasNext();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public String next() {
            return this.f1454c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(o oVar) {
        this.f1450c = oVar;
    }

    @Override // a.a.a.a.v0.h.o
    public d a(int i) {
        return this.f1450c.a(i);
    }

    @Override // a.a.a.a.v0.h.o
    public void a(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a.a.a.a.v0.h.o
    public o b() {
        return this;
    }

    @Override // a.a.a.a.v0.h.o
    public List<?> f() {
        return this.f1450c.f();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public String get(int i) {
        return (String) this.f1450c.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.List, java.util.AbstractList
    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    public int size() {
        return this.f1450c.size();
    }
}

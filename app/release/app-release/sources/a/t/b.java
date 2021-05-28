package a.t;

import a.g;
import a.w.c.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@g(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mv = {1, 1, 16})
public abstract class b<E> extends a<E> implements List<E>, a.w.c.w.a {

    public class a implements Iterator<E>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public int f2105c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        public boolean hasNext() {
            return this.f2105c < b.this.a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                b bVar = b.this;
                int i = this.f2105c;
                this.f2105c = i + 1;
                return (E) bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a.t.b$b  reason: collision with other inner class name */
    public class C0079b extends b<E>.a implements ListIterator<E>, a.w.c.w.a {
        public C0079b(int i) {
            super();
            int a2 = b.this.a();
            if (i < 0 || i > a2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + a2);
            }
            this.f2105c = i;
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.f2105c > 0;
        }

        public int nextIndex() {
            return this.f2105c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                b bVar = b.this;
                int i = this.f2105c - 1;
                this.f2105c = i;
                return (E) bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f2105c - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c<E> extends b<E> implements RandomAccess {

        /* renamed from: c  reason: collision with root package name */
        public int f2108c;

        /* renamed from: d  reason: collision with root package name */
        public final b<E> f2109d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2110e;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.t.b<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b<? extends E> bVar, int i, int i2) {
            if (bVar != 0) {
                this.f2109d = bVar;
                this.f2110e = i;
                int a2 = bVar.a();
                if (i < 0 || i2 > a2) {
                    throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + a2);
                } else if (i <= i2) {
                    this.f2108c = i2 - this.f2110e;
                } else {
                    throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
                }
            } else {
                i.a("list");
                throw null;
            }
        }

        @Override // a.t.a
        public int a() {
            return this.f2108c;
        }

        @Override // java.util.List, a.t.b
        public E get(int i) {
            int i2 = this.f2108c;
            if (i >= 0 && i < i2) {
                return this.f2109d.get(this.f2110e + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @Override // java.util.List
    public void add(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (collection != null) {
            if (size() != collection.size()) {
                return false;
            }
            Iterator<E> it = collection.iterator();
            for (E e2 : this) {
                if (!i.a((Object) e2, (Object) it.next())) {
                }
            }
            return true;
            return false;
        }
        i.a("other");
        throw null;
    }

    @Override // java.util.List
    public abstract E get(int i);

    public int hashCode() {
        int i = 1;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e2 : this) {
            if (i.a(e2, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (i.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0079b(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C0079b(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new c(this, i, i2);
    }
}

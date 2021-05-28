package a.a.a.a.v0.o;

import a.n;
import a.w.c.f;
import a.w.c.i;
import a.w.c.v;
import e.f.a.g;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public final class m<T> extends AbstractSet<T> {

    /* renamed from: c  reason: collision with root package name */
    public Object f2016c;

    /* renamed from: d  reason: collision with root package name */
    public int f2017d;

    public static final class a<T> implements Iterator<T>, a.w.c.w.c {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2018c;

        public a(T[] tArr) {
            if (tArr != null) {
                this.f2018c = g.e((Object[]) tArr);
            } else {
                i.a("array");
                throw null;
            }
        }

        public boolean hasNext() {
            return this.f2018c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f2018c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b {
        public static final <T> m<T> a() {
            return new m<>(null);
        }
    }

    public static final class c<T> implements Iterator<T>, a.w.c.w.c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2019c = true;

        /* renamed from: d  reason: collision with root package name */
        public final T f2020d;

        public c(T t) {
            this.f2020d = t;
        }

        public boolean hasNext() {
            return this.f2019c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f2019c) {
                this.f2019c = false;
                return this.f2020d;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ m(f fVar) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.util.LinkedHashSet */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        int i = this.f2017d;
        if (i == 0) {
            this.f2016c = t;
        } else if (i == 1) {
            if (i.a(this.f2016c, (Object) t)) {
                return false;
            }
            this.f2016c = new Object[]{this.f2016c, t};
        } else if (i < 5) {
            Object obj = this.f2016c;
            if (obj != null) {
                Object[] objArr2 = (Object[]) obj;
                if (g.a(objArr2, (Object) t)) {
                    return false;
                }
                int i2 = this.f2017d;
                if (i2 == 4) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    if (copyOf != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(g.e(copyOf.length));
                        g.a(copyOf, (Collection) linkedHashSet);
                        linkedHashSet.add(t);
                        objArr = linkedHashSet;
                    } else {
                        i.a("elements");
                        throw null;
                    }
                } else {
                    Object[] copyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                    i.a((Object) copyOf2, "java.util.Arrays.copyOf(this, newSize)");
                    copyOf2[copyOf2.length - 1] = t;
                    objArr = copyOf2;
                }
                this.f2016c = objArr;
            } else {
                throw new n("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            Object obj2 = this.f2016c;
            if (obj2 == null) {
                throw new n("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!v.a(obj2).add(t)) {
                return false;
            }
        }
        this.f2017d++;
        return true;
    }

    public void clear() {
        this.f2016c = null;
        this.f2017d = 0;
    }

    public boolean contains(Object obj) {
        int i = this.f2017d;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return i.a(this.f2016c, obj);
        }
        if (i < 5) {
            Object obj2 = this.f2016c;
            if (obj2 != null) {
                return g.a((Object[]) obj2, obj);
            }
            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.f2016c;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new n("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<T> iterator() {
        Set a2;
        int i = this.f2017d;
        if (i == 0) {
            a2 = Collections.emptySet();
        } else if (i == 1) {
            return new c(this.f2016c);
        } else {
            if (i < 5) {
                Object obj = this.f2016c;
                if (obj != null) {
                    return new a((Object[]) obj);
                }
                throw new n("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Object obj2 = this.f2016c;
            if (obj2 != null) {
                a2 = v.a(obj2);
            } else {
                throw new n("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            }
        }
        return a2.iterator();
    }

    public final int size() {
        return this.f2017d;
    }
}

package d.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f3082a;
    public g<K, V>.c b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f3083c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public final int f3084c;

        /* renamed from: d  reason: collision with root package name */
        public int f3085d;

        /* renamed from: e  reason: collision with root package name */
        public int f3086e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3087f = false;

        public a(int i) {
            this.f3084c = i;
            this.f3085d = g.this.c();
        }

        public boolean hasNext() {
            return this.f3086e < this.f3085d;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) g.this.a(this.f3086e, this.f3084c);
                this.f3086e++;
                this.f3087f = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3087f) {
                int i = this.f3086e - 1;
                this.f3086e = i;
                this.f3085d--;
                this.f3087f = false;
                g.this.a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: d.d.g */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c2 = g.this.c();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                g.this.a(entry.getKey(), entry.getValue());
            }
            return c2 != g.this.c();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = g.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return d.a(g.this.a(a2, 1), entry.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c2 = g.this.c() - 1; c2 >= 0; c2--) {
                Object a2 = g.this.a(c2, 0);
                Object a3 = g.this.a(c2, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.a(obj) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> b = g.this.b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!b.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c2 = g.this.c() - 1; c2 >= 0; c2--) {
                Object a2 = g.this.a(c2, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a2 = g.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            g.this.a(a2);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> b = g.this.b();
            int size = b.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b.remove(it.next());
            }
            return size != b.size();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return g.a((Map) g.this.b(), collection);
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.a(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public int f3091c;

        /* renamed from: d  reason: collision with root package name */
        public int f3092d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3093e = false;

        public d() {
            this.f3091c = g.this.c() - 1;
            this.f3092d = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f3093e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return d.a(entry.getKey(), g.this.a(this.f3092d, 0)) && d.a(entry.getValue(), g.this.a(this.f3092d, 1));
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3093e) {
                return (K) g.this.a(this.f3092d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3093e) {
                return (V) g.this.a(this.f3092d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3092d < this.f3091c;
        }

        public int hashCode() {
            if (this.f3093e) {
                int i = 0;
                Object a2 = g.this.a(this.f3092d, 0);
                Object a3 = g.this.a(this.f3092d, 1);
                int hashCode = a2 == null ? 0 : a2.hashCode();
                if (a3 != null) {
                    i = a3.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.f3092d++;
                this.f3093e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3093e) {
                g.this.a(this.f3092d);
                this.f3092d--;
                this.f3091c--;
                this.f3093e = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f3093e) {
                return (V) g.this.a(this.f3092d, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b = g.this.b(obj);
            if (b < 0) {
                return false;
            }
            g.this.a(b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int c2 = g.this.c();
            int i = 0;
            boolean z = false;
            while (i < c2) {
                if (collection.contains(g.this.a(i, 1))) {
                    g.this.a(i);
                    i--;
                    c2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int c2 = g.this.c();
            int i = 0;
            boolean z = false;
            while (i < c2) {
                if (!collection.contains(g.this.a(i, 1))) {
                    g.this.a(i);
                    i--;
                    c2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract int a(Object obj);

    public abstract Object a(int i, int i2);

    public abstract V a(int i, V v);

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(K k, V v);

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] a(T[] tArr, int i) {
        int c2 = c();
        if (tArr.length < c2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), c2));
        }
        for (int i2 = 0; i2 < c2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > c2) {
            tArr[c2] = null;
        }
        return tArr;
    }

    public abstract int b(Object obj);

    public abstract Map<K, V> b();

    public Object[] b(int i) {
        int c2 = c();
        Object[] objArr = new Object[c2];
        for (int i2 = 0; i2 < c2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public abstract int c();
}

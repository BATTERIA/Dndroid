package a.a.a.a.v0.h;

import a.a.a.a.v0.h.h;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public final int f1436c;

    /* renamed from: d  reason: collision with root package name */
    public List<u<K, V>.c> f1437d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public Map<K, V> f1438e = Collections.emptyMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1439f;

    /* renamed from: g  reason: collision with root package name */
    public volatile u<K, V>.e f1440g;

    public static class a extends u<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // a.a.a.a.v0.h.u
        public void e() {
            if (!this.f1439f) {
                for (int i = 0; i < b(); i++) {
                    Map.Entry<K, V> a2 = a(i);
                    if (((h.a) a2.getKey()).c()) {
                        a2.setValue((V) Collections.unmodifiableList(a2.getValue()));
                    }
                }
                for (Map.Entry<K, V> entry : c()) {
                    if (((h.a) entry.getKey()).c()) {
                        entry.setValue((V) Collections.unmodifiableList(entry.getValue()));
                    }
                }
            }
            u.super.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return u.super.a((h.a) obj, obj2);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f1441a = new a();
        public static final Iterable<Object> b = new C0057b();

        public static class a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: a.a.a.a.v0.h.u$b$b  reason: collision with other inner class name */
        public static class C0057b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f1441a;
            }
        }
    }

    public class c implements Comparable<u<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public final K f1442c;

        /* renamed from: d  reason: collision with root package name */
        public V f1443d;

        public c(K k, V v) {
            this.f1442c = k;
            this.f1443d = v;
        }

        public c(u uVar, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            u.this = uVar;
            this.f1442c = entry.getKey();
            this.f1443d = value;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(u<K, V>.c cVar) {
            return this.f1442c.compareTo(cVar.f1442c);
        }

        public boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f1442c;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f1443d;
                Object value = entry.getValue();
                if (v == null) {
                    z = value == null;
                } else {
                    z = v.equals(value);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f1442c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1443d;
        }

        public int hashCode() {
            K k = this.f1442c;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f1443d;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            u.this.a();
            V v2 = this.f1443d;
            this.f1443d = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f1442c);
            String valueOf2 = String.valueOf(this.f1443d);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    public class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public int f1445c = -1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1446d;

        /* renamed from: e  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f1447e;

        public /* synthetic */ d(a aVar) {
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Iterator<java.util.Map$Entry<K, V>>, java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> */
        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f1447e == null) {
                this.f1447e = u.this.f1438e.entrySet().iterator();
            }
            return (Iterator<Map.Entry<K, V>>) this.f1447e;
        }

        public boolean hasNext() {
            if (this.f1445c + 1 < u.this.f1437d.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.f1446d = true;
            int i = this.f1445c + 1;
            this.f1445c = i;
            return i < u.this.f1437d.size() ? u.this.f1437d.get(this.f1445c) : a().next();
        }

        public void remove() {
            if (this.f1446d) {
                this.f1446d = false;
                u.this.a();
                if (this.f1445c < u.this.f1437d.size()) {
                    u uVar = u.this;
                    int i = this.f1445c;
                    this.f1445c = i - 1;
                    uVar.b(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class e extends AbstractSet<Map.Entry<K, V>> {
        public /* synthetic */ e(a aVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: a.a.a.a.v0.h.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            u.this.a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            u.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return u.this.size();
        }
    }

    public /* synthetic */ u(int i, a aVar) {
        this.f1436c = i;
    }

    public static <FieldDescriptorType extends h.a<FieldDescriptorType>> u<FieldDescriptorType, Object> c(int i) {
        return new a(i);
    }

    public final int a(K k) {
        int size = this.f1437d.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f1437d.get(size).f1442c);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f1437d.get(i2).f1442c);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Map.Entry<K, V> a(int i) {
        return this.f1437d.get(i);
    }

    public final void a() {
        if (this.f1439f) {
            throw new UnsupportedOperationException();
        }
    }

    public int b() {
        return this.f1437d.size();
    }

    public final V b(int i) {
        a();
        V v = this.f1437d.remove(i).f1443d;
        if (!this.f1438e.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = d().entrySet().iterator();
            this.f1437d.add(new c(this, it.next()));
            it.remove();
        }
        return v;
    }

    public Iterable<Map.Entry<K, V>> c() {
        return this.f1438e.isEmpty() ? (Iterable<Map.Entry<K, V>>) b.b : this.f1438e.entrySet();
    }

    public void clear() {
        a();
        if (!this.f1437d.isEmpty()) {
            this.f1437d.clear();
        }
        if (!this.f1438e.isEmpty()) {
            this.f1438e.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.v0.h.u<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1438e.containsKey(comparable);
    }

    public final SortedMap<K, V> d() {
        a();
        if (this.f1438e.isEmpty() && !(this.f1438e instanceof TreeMap)) {
            this.f1438e = new TreeMap();
        }
        return (SortedMap) this.f1438e;
    }

    public void e() {
        if (!this.f1439f) {
            this.f1438e = this.f1438e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1438e);
            this.f1439f = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f1440g == null) {
            this.f1440g = new e(null);
        }
        return this.f1440g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.v0.h.u<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.f1437d.get(a2).f1443d;
        }
        return this.f1438e.get(comparable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.v0.h.u<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) b(a2);
        }
        if (this.f1438e.isEmpty()) {
            return null;
        }
        return this.f1438e.remove(comparable);
    }

    public int size() {
        return this.f1438e.size() + this.f1437d.size();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, K] */
    public V a(K k, V v) {
        a();
        int a2 = a(k);
        if (a2 >= 0) {
            u<K, V>.c cVar = this.f1437d.get(a2);
            u.this.a();
            V v2 = cVar.f1443d;
            cVar.f1443d = v;
            return v2;
        }
        a();
        if (this.f1437d.isEmpty() && !(this.f1437d instanceof ArrayList)) {
            this.f1437d = new ArrayList(this.f1436c);
        }
        int i = -(a2 + 1);
        if (i >= this.f1436c) {
            return d().put(k, v);
        }
        int size = this.f1437d.size();
        int i2 = this.f1436c;
        if (size == i2) {
            u<K, V>.c remove = this.f1437d.remove(i2 - 1);
            d().put(remove.f1442c, remove.f1443d);
        }
        this.f1437d.add(i, new c(k, v));
        return null;
    }
}

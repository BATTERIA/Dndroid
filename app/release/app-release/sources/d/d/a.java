package d.d;

import d.d.g;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> j;

    /* renamed from: d.d.a$a  reason: collision with other inner class name */
    public class C0095a extends g<K, V> {
        public C0095a() {
        }

        @Override // d.d.g
        public int a(Object obj) {
            return a.this.b(obj);
        }

        @Override // d.d.g
        public Object a(int i, int i2) {
            return a.this.f3100d[(i << 1) + i2];
        }

        @Override // d.d.g
        public V a(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = a.this.f3100d;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }

        @Override // d.d.g
        public void a() {
            a.this.clear();
        }

        @Override // d.d.g
        public void a(int i) {
            a.this.c(i);
        }

        @Override // d.d.g
        public void a(K k, V v) {
            a.this.put(k, v);
        }

        @Override // d.d.g
        public int b(Object obj) {
            return a.this.c(obj);
        }

        @Override // d.d.g
        public Map<K, V> b() {
            return a.this;
        }

        @Override // d.d.g
        public int c() {
            return a.this.f3101e;
        }
    }

    public a() {
    }

    public a(int i) {
        super(i);
    }

    public final g<K, V> b() {
        if (this.j == null) {
            this.j = new C0095a();
        }
        return this.j;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> b = b();
        if (b.f3082a == null) {
            b.f3082a = new g.b();
        }
        return b.f3082a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> b = b();
        if (b.b == null) {
            b.b = new g.c();
        }
        return b.b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: d.d.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.f3101e;
        int i = this.f3101e;
        int[] iArr = this.f3099c;
        if (iArr.length < size) {
            Object[] objArr = this.f3100d;
            a(size);
            if (this.f3101e > 0) {
                System.arraycopy(iArr, 0, this.f3099c, 0, i);
                System.arraycopy(objArr, 0, this.f3100d, 0, i << 1);
            }
            h.a(iArr, objArr, i);
        }
        if (this.f3101e == i) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> b = b();
        if (b.f3083c == null) {
            b.f3083c = new g.e();
        }
        return b.f3083c;
    }
}

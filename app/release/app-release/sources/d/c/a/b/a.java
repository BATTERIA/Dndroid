package d.c.a.b;

import d.c.a.b.b;
import java.util.HashMap;

public class a<K, V> extends b<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f3047g = new HashMap<>();

    @Override // d.c.a.b.b
    public b.c<K, V> a(K k) {
        return this.f3047g.get(k);
    }

    @Override // d.c.a.b.b
    public V b(K k, V v) {
        b.c<K, V> cVar = this.f3047g.get(k);
        if (cVar != null) {
            return cVar.f3053d;
        }
        this.f3047g.put(k, a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f3047g.containsKey(k);
    }

    @Override // d.c.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f3047g.remove(k);
        return v;
    }
}

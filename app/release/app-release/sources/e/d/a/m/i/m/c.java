package e.d.a.m.i.m;

import e.d.a.m.i.m.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c<K extends f, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f4009a = new a<>(null);
    public final Map<K, a<K, V>> b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f4010a;
        public List<V> b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f4011c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f4012d;

        public a() {
            this(null);
        }

        public a(K k) {
            this.f4012d = this;
            this.f4011c = this;
            this.f4010a = k;
        }

        public V a() {
            List<V> list = this.b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        a<K, V> aVar2 = aVar.f4012d;
        aVar2.f4011c = aVar.f4011c;
        aVar.f4011c.f4012d = aVar2;
        a<K, V> aVar3 = this.f4009a;
        aVar.f4012d = aVar3;
        a<K, V> aVar4 = aVar3.f4011c;
        aVar.f4011c = aVar4;
        aVar4.f4012d = aVar;
        aVar.f4012d.f4011c = aVar;
        return aVar.a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.f4009a.f4011c; !aVar.equals(this.f4009a); aVar = aVar.f4011c) {
            z = true;
            sb.append('{');
            sb.append((Object) aVar.f4010a);
            sb.append(':');
            List<V> list = aVar.b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public void a(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            a<K, V> aVar2 = aVar.f4012d;
            aVar2.f4011c = aVar.f4011c;
            aVar.f4011c.f4012d = aVar2;
            a<K, V> aVar3 = this.f4009a;
            aVar.f4012d = aVar3.f4012d;
            aVar.f4011c = aVar3;
            aVar3.f4012d = aVar;
            aVar.f4012d.f4011c = aVar;
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        if (aVar.b == null) {
            aVar.b = new ArrayList();
        }
        aVar.b.add(v);
    }

    public V a() {
        a aVar = this.f4009a;
        while (true) {
            aVar = aVar.f4012d;
            if (aVar.equals(this.f4009a)) {
                return null;
            }
            V v = (V) aVar.a();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f4012d;
            aVar2.f4011c = aVar.f4011c;
            aVar.f4011c.f4012d = aVar2;
            this.b.remove(aVar.f4010a);
            aVar.f4010a.a();
        }
    }
}

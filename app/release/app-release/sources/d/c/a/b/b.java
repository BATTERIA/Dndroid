package d.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f3048c;

    /* renamed from: d  reason: collision with root package name */
    public c<K, V> f3049d;

    /* renamed from: e  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f3050e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public int f3051f = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f3055f;
        }

        @Override // d.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3054e;
        }
    }

    /* renamed from: d.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0094b<K, V> extends e<K, V> {
        public C0094b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f3054e;
        }

        @Override // d.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3055f;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public final K f3052c;

        /* renamed from: d  reason: collision with root package name */
        public final V f3053d;

        /* renamed from: e  reason: collision with root package name */
        public c<K, V> f3054e;

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f3055f;

        public c(K k, V v) {
            this.f3052c = k;
            this.f3053d = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3052c.equals(cVar.f3052c) && this.f3053d.equals(cVar.f3053d);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f3052c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3053d;
        }

        public int hashCode() {
            return this.f3052c.hashCode() ^ this.f3053d.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f3052c) + "=" + ((Object) this.f3053d);
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f3056c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3057d = true;

        public d() {
        }

        @Override // d.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f3056c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f3055f;
                this.f3056c = cVar3;
                this.f3057d = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f3057d) {
                return b.this.f3048c != null;
            }
            c<K, V> cVar = this.f3056c;
            return (cVar == null || cVar.f3054e == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f3057d) {
                this.f3057d = false;
                cVar = b.this.f3048c;
            } else {
                c<K, V> cVar2 = this.f3056c;
                cVar = cVar2 != null ? cVar2.f3054e : null;
            }
            this.f3056c = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f3059c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f3060d;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f3059c = cVar2;
            this.f3060d = cVar;
        }

        @Override // d.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f3059c == cVar && cVar == this.f3060d) {
                this.f3060d = null;
                this.f3059c = null;
            }
            c<K, V> cVar3 = this.f3059c;
            if (cVar3 == cVar) {
                this.f3059c = b(cVar3);
            }
            c<K, V> cVar4 = this.f3060d;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f3059c;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f3060d = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f3060d != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f3060d;
            c<K, V> cVar2 = this.f3059c;
            this.f3060d = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f3048c;
        while (cVar != null && !cVar.f3052c.equals(k)) {
            cVar = cVar.f3054e;
        }
        return cVar;
    }

    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f3051f++;
        c<K, V> cVar2 = this.f3049d;
        if (cVar2 == null) {
            this.f3048c = cVar;
        } else {
            cVar2.f3054e = cVar;
            cVar.f3055f = cVar2;
        }
        this.f3049d = cVar;
        return cVar;
    }

    public b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.f3050e.put(dVar, false);
        return dVar;
    }

    public V b(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f3053d;
        }
        a(k, v);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((d.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof d.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d.c.a.b.b r7 = (d.c.a.b.b) r7
            int r1 = r6.f3051f
            int r3 = r7.f3051f
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            d.c.a.b.b$e r3 = (d.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            d.c.a.b.b$e r4 = (d.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            d.c.a.b.b$e r7 = (d.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f3048c, this.f3049d);
        this.f3050e.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.f3051f--;
        if (!this.f3050e.isEmpty()) {
            for (f<K, V> fVar : this.f3050e.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f3055f;
        if (cVar != null) {
            cVar.f3054e = a2.f3054e;
        } else {
            this.f3048c = a2.f3054e;
        }
        c<K, V> cVar2 = a2.f3054e;
        if (cVar2 != null) {
            cVar2.f3055f = a2.f3055f;
        } else {
            this.f3049d = a2.f3055f;
        }
        a2.f3054e = null;
        a2.f3055f = null;
        return a2.f3053d;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a2.append(", ");
                }
            } else {
                a2.append("]");
                return a2.toString();
            }
        }
    }
}

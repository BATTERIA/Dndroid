package e.h.a.f0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class s<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> j = new a();

    /* renamed from: c  reason: collision with root package name */
    public Comparator<? super K> f4722c;

    /* renamed from: d  reason: collision with root package name */
    public e<K, V> f4723d;

    /* renamed from: e  reason: collision with root package name */
    public int f4724e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f4725f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final e<K, V> f4726g = new e<>();

    /* renamed from: h  reason: collision with root package name */
    public s<K, V>.b f4727h;
    public s<K, V>.c i;

    public class a implements Comparator<Comparable> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends s<K, V>.d {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e<K, V> a2;
            if (!(obj instanceof Map.Entry) || (a2 = s.this.a((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.b(a2, true);
            return true;
        }

        public int size() {
            return s.this.f4724e;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends s<K, V>.d {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f4739h;
            }
        }

        public c() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return s.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            s sVar = s.this;
            e<K, V> b = sVar.b(obj);
            if (b != null) {
                sVar.b(b, true);
            }
            return b != null;
        }

        public int size() {
            return s.this.f4724e;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f4730c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f4731d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f4732e;

        public d() {
            s sVar = s.this;
            this.f4730c = sVar.f4726g.f4737f;
            this.f4732e = sVar.f4725f;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f4730c;
            s sVar = s.this;
            if (eVar == sVar.f4726g) {
                throw new NoSuchElementException();
            } else if (sVar.f4725f == this.f4732e) {
                this.f4730c = eVar.f4737f;
                this.f4731d = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4730c != s.this.f4726g;
        }

        public final void remove() {
            e<K, V> eVar = this.f4731d;
            if (eVar != null) {
                s.this.b(eVar, true);
                this.f4731d = null;
                this.f4732e = s.this.f4725f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f4734c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f4735d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f4736e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f4737f;

        /* renamed from: g  reason: collision with root package name */
        public e<K, V> f4738g;

        /* renamed from: h  reason: collision with root package name */
        public final K f4739h;
        public V i;
        public int j;

        public e() {
            this.f4739h = null;
            this.f4738g = this;
            this.f4737f = this;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f4734c = eVar;
            this.f4739h = k;
            this.j = 1;
            this.f4737f = eVar2;
            this.f4738g = eVar3;
            eVar3.f4737f = this;
            eVar2.f4738g = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f4739h
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.i
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.s.e.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4739h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.i;
        }

        public int hashCode() {
            K k = this.f4739h;
            int i2 = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.i;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.i;
            this.i = v;
            return v2;
        }

        public String toString() {
            return ((Object) this.f4739h) + "=" + ((Object) this.i);
        }
    }

    public s() {
        Comparator<Comparable> comparator = j;
        this.f4722c = comparator == null ? j : comparator;
    }

    public e<K, V> a(K k, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f4722c;
        e<K, V> eVar2 = this.f4723d;
        if (eVar2 != null) {
            K k2 = comparator == j ? k : null;
            while (true) {
                K k3 = eVar2.f4739h;
                i2 = k2 != null ? k2.compareTo(k3) : comparator.compare(k, k3);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f4735d : eVar2.f4736e;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f4726g;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f4738g);
            if (i2 < 0) {
                eVar2.f4735d = eVar;
            } else {
                eVar2.f4736e = eVar;
            }
            a((e) eVar2, true);
        } else if (comparator != j || (k instanceof Comparable)) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f4738g);
            this.f4723d = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f4724e++;
        this.f4725f++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.h.a.f0.s.e<K, V> a(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            e.h.a.f0.s$e r0 = r4.b(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.i
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.s.a(java.util.Map$Entry):e.h.a.f0.s$e");
    }

    public final void a(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4735d;
        e<K, V> eVar3 = eVar.f4736e;
        e<K, V> eVar4 = eVar3.f4735d;
        e<K, V> eVar5 = eVar3.f4736e;
        eVar.f4736e = eVar4;
        if (eVar4 != null) {
            eVar4.f4734c = eVar;
        }
        a(eVar, eVar3);
        eVar3.f4735d = eVar;
        eVar.f4734c = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.j : 0, eVar4 != null ? eVar4.j : 0) + 1;
        eVar.j = max;
        if (eVar5 != null) {
            i2 = eVar5.j;
        }
        eVar3.j = Math.max(max, i2) + 1;
    }

    public final void a(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f4734c;
        eVar.f4734c = null;
        if (eVar2 != null) {
            eVar2.f4734c = eVar3;
        }
        if (eVar3 == null) {
            this.f4723d = eVar2;
        } else if (eVar3.f4735d == eVar) {
            eVar3.f4735d = eVar2;
        } else {
            eVar3.f4736e = eVar2;
        }
    }

    public final void a(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f4735d;
            e<K, V> eVar3 = eVar.f4736e;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.j : 0;
            int i4 = eVar3 != null ? eVar3.j : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f4735d;
                e<K, V> eVar5 = eVar3.f4736e;
                int i6 = eVar5 != null ? eVar5.j : 0;
                if (eVar4 != null) {
                    i2 = eVar4.j;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    b((e) eVar3);
                }
                a((e) eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f4735d;
                e<K, V> eVar7 = eVar2.f4736e;
                int i8 = eVar7 != null ? eVar7.j : 0;
                if (eVar6 != null) {
                    i2 = eVar6.j;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    a((e) eVar2);
                }
                b((e) eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.j = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.j = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4734c;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> b(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void b(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4735d;
        e<K, V> eVar3 = eVar.f4736e;
        e<K, V> eVar4 = eVar2.f4735d;
        e<K, V> eVar5 = eVar2.f4736e;
        eVar.f4735d = eVar5;
        if (eVar5 != null) {
            eVar5.f4734c = eVar;
        }
        a(eVar, eVar2);
        eVar2.f4736e = eVar;
        eVar.f4734c = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.j : 0, eVar5 != null ? eVar5.j : 0) + 1;
        eVar.j = max;
        if (eVar4 != null) {
            i2 = eVar4.j;
        }
        eVar2.j = Math.max(max, i2) + 1;
    }

    public void b(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i2;
        if (z) {
            e<K, V> eVar3 = eVar.f4738g;
            eVar3.f4737f = eVar.f4737f;
            eVar.f4737f.f4738g = eVar3;
        }
        e<K, V> eVar4 = eVar.f4735d;
        e<K, V> eVar5 = eVar.f4736e;
        e<K, V> eVar6 = eVar.f4734c;
        int i3 = 0;
        if (eVar4 == null || eVar5 == null) {
            if (eVar4 != null) {
                a(eVar, eVar4);
                eVar.f4735d = null;
            } else if (eVar5 != null) {
                a(eVar, eVar5);
                eVar.f4736e = null;
            } else {
                a(eVar, (e) null);
            }
            a((e) eVar6, false);
            this.f4724e--;
            this.f4725f++;
            return;
        }
        if (eVar4.j > eVar5.j) {
            do {
                eVar2 = eVar4;
                eVar4 = eVar4.f4736e;
            } while (eVar4 != null);
        } else {
            do {
                eVar5 = eVar5.f4735d;
            } while (eVar5 != null);
            eVar2 = eVar5;
        }
        b(eVar2, false);
        e<K, V> eVar7 = eVar.f4735d;
        if (eVar7 != null) {
            i2 = eVar7.j;
            eVar2.f4735d = eVar7;
            eVar7.f4734c = eVar2;
            eVar.f4735d = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar8 = eVar.f4736e;
        if (eVar8 != null) {
            i3 = eVar8.j;
            eVar2.f4736e = eVar8;
            eVar8.f4734c = eVar2;
            eVar.f4736e = null;
        }
        eVar2.j = Math.max(i2, i3) + 1;
        a(eVar, eVar2);
    }

    public void clear() {
        this.f4723d = null;
        this.f4724e = 0;
        this.f4725f++;
        e<K, V> eVar = this.f4726g;
        eVar.f4738g = eVar;
        eVar.f4737f = eVar;
    }

    public boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f4727h;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f4727h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.i = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> a2 = a((Object) k, true);
            V v2 = a2.i;
            a2.i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> b2 = b(obj);
        if (b2 != null) {
            b(b2, true);
        }
        if (b2 != null) {
            return b2.i;
        }
        return null;
    }

    public int size() {
        return this.f4724e;
    }
}

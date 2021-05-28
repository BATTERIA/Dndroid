package a.a.a.a.w0;

import e.a.a.a.a;
import java.util.NoSuchElementException;

public final class b<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public static final b<Object, Object> f2033c = new b<>(d.b, 0);

    /* renamed from: a  reason: collision with root package name */
    public final d<a<e<K, V>>> f2034a;
    public final int b;

    public b(d<a<e<K, V>>> dVar, int i) {
        this.f2034a = dVar;
        this.b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: a.a.a.a.w0.c<V> */
    /* JADX WARN: Multi-variable type inference failed */
    public b<K, V> a(K k, V v) {
        V a2 = this.f2034a.f2040a.a((long) k.hashCode());
        if (a2 == null) {
            a2 = a.f2028f;
        }
        int i = a2.f2031e;
        int i2 = 0;
        a aVar = a2;
        while (true) {
            if (aVar == null || aVar.f2031e <= 0) {
                i2 = -1;
            } else if (aVar.f2029c.f2041c.equals(k)) {
                break;
            } else {
                aVar = aVar.f2030d;
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 > a2.f2031e) {
                throw new IndexOutOfBoundsException();
            }
            try {
                a2 = a2.a(a2.b(i2).f2029c);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(a.a("Index: ", i2));
            }
        }
        e eVar = new e(k, v);
        if (a2 != null) {
            a aVar2 = new a(eVar, a2);
            d<a<e<K, V>>> dVar = this.f2034a;
            c<V> a3 = dVar.f2040a.a((long) k.hashCode(), aVar2);
            if (a3 != dVar.f2040a) {
                dVar = new d<>(a3);
            }
            return new b<>(dVar, (this.b - i) + aVar2.f2031e);
        }
        throw null;
    }
}

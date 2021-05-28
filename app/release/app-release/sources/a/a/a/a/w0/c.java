package a.a.a.a.w0;

public final class c<V> {

    /* renamed from: f  reason: collision with root package name */
    public static final c<Object> f2035f = new c<>();

    /* renamed from: a  reason: collision with root package name */
    public final long f2036a;
    public final V b;

    /* renamed from: c  reason: collision with root package name */
    public final c<V> f2037c;

    /* renamed from: d  reason: collision with root package name */
    public final c<V> f2038d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2039e;

    public c() {
        this.f2039e = 0;
        this.f2036a = 0;
        this.b = null;
        this.f2037c = null;
        this.f2038d = null;
    }

    public c(long j, V v, c<V> cVar, c<V> cVar2) {
        this.f2036a = j;
        this.b = v;
        this.f2037c = cVar;
        this.f2038d = cVar2;
        this.f2039e = cVar.f2039e + 1 + cVar2.f2039e;
    }

    public c<V> a(long j, V v) {
        if (this.f2039e == 0) {
            return new c<>(j, v, this, this);
        }
        long j2 = this.f2036a;
        return j < j2 ? a(this.f2037c.a(j - j2, v), this.f2038d) : j > j2 ? a(this.f2037c, this.f2038d.a(j - j2, v)) : v == this.b ? this : new c<>(j, v, this.f2037c, this.f2038d);
    }

    public final c<V> a(c<V> cVar, c<V> cVar2) {
        if (cVar == this.f2037c && cVar2 == this.f2038d) {
            return this;
        }
        long j = this.f2036a;
        V v = this.b;
        int i = cVar.f2039e;
        int i2 = cVar2.f2039e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                c<V> cVar3 = cVar.f2037c;
                c<V> cVar4 = cVar.f2038d;
                if (cVar4.f2039e < cVar3.f2039e * 2) {
                    long j2 = cVar.f2036a;
                    return new c<>(j2 + j, cVar.b, cVar3, new c(-j2, v, cVar4.b(cVar4.f2036a + j2), cVar2));
                }
                c<V> cVar5 = cVar4.f2037c;
                c<V> cVar6 = cVar4.f2038d;
                long j3 = cVar4.f2036a;
                long j4 = cVar.f2036a + j3 + j;
                V v2 = cVar4.b;
                c cVar7 = new c(-j3, cVar.b, cVar3, cVar5.b(cVar5.f2036a + j3));
                long j5 = cVar.f2036a;
                long j6 = cVar4.f2036a;
                return new c<>(j4, v2, cVar7, new c((-j5) - j6, v, cVar6.b(cVar6.f2036a + j6 + j5), cVar2));
            } else if (i2 >= i * 5) {
                c<V> cVar8 = cVar2.f2037c;
                c<V> cVar9 = cVar2.f2038d;
                if (cVar8.f2039e < cVar9.f2039e * 2) {
                    long j7 = cVar2.f2036a;
                    return new c<>(j7 + j, cVar2.b, new c(-j7, v, cVar, cVar8.b(cVar8.f2036a + j7)), cVar9);
                }
                c<V> cVar10 = cVar8.f2037c;
                c<V> cVar11 = cVar8.f2038d;
                long j8 = cVar8.f2036a;
                long j9 = cVar2.f2036a;
                long j10 = j8 + j9 + j;
                V v3 = cVar8.b;
                c cVar12 = new c((-j9) - j8, v, cVar, cVar10.b(cVar10.f2036a + j8 + j9));
                long j11 = cVar8.f2036a;
                return new c<>(j10, v3, cVar12, new c(-j11, cVar2.b, cVar11.b(cVar11.f2036a + j11), cVar9));
            }
        }
        return new c<>(j, v, cVar, cVar2);
    }

    public V a(long j) {
        c<V> cVar;
        if (this.f2039e == 0) {
            return null;
        }
        long j2 = this.f2036a;
        if (j < j2) {
            cVar = this.f2037c;
        } else if (j <= j2) {
            return this.b;
        } else {
            cVar = this.f2038d;
        }
        return cVar.a(j - j2);
    }

    public final c<V> b(long j) {
        return (this.f2039e == 0 || j == this.f2036a) ? this : new c<>(j, this.b, this.f2037c, this.f2038d);
    }
}

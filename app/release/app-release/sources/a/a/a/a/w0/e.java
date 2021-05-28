package a.a.a.a.w0;

import java.io.Serializable;

public final class e<K, V> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public final K f2041c;

    /* renamed from: d  reason: collision with root package name */
    public final V f2042d;

    public e(K k, V v) {
        this.f2041c = k;
        this.f2042d = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof a.a.a.a.w0.e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            a.a.a.a.w0.e r4 = (a.a.a.a.w0.e) r4
            K r0 = r3.f2041c
            if (r0 != 0) goto L_0x0011
            K r0 = r4.f2041c
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.f2041c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.f2042d
            V r4 = r4.f2042d
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.w0.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k = this.f2041c;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f2042d;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return ((Object) this.f2041c) + "=" + ((Object) this.f2042d);
    }
}

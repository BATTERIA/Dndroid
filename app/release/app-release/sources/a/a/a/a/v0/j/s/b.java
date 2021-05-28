package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.i;
import java.util.List;

public final class b extends g<List<? extends g<?>>> {
    public final l<w, d0> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super a.a.a.a.v0.b.w, ? extends a.a.a.a.v0.m.d0> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(List<? extends g<?>> list, l<? super w, ? extends d0> lVar) {
        super(list);
        if (list == null) {
            i.a("value");
            throw null;
        } else if (lVar != 0) {
            this.b = lVar;
        } else {
            i.a("computeType");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (((r0 == null || a.a.a.a.v0.a.g.a(r0) == null) ? false : true) != false) goto L_0x0027;
     */
    @Override // a.a.a.a.v0.j.s.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.a.a.v0.m.d0 a(a.a.a.a.v0.b.w r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0053
            a.w.b.l<a.a.a.a.v0.b.w, a.a.a.a.v0.m.d0> r0 = r3.b
            java.lang.Object r4 = r0.a(r4)
            a.a.a.a.v0.m.d0 r4 = (a.a.a.a.v0.m.d0) r4
            boolean r0 = a.a.a.a.v0.a.g.c(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            a.a.a.a.v0.m.s0 r0 = r4.I0()
            a.a.a.a.v0.b.h r0 = r0.c()
            if (r0 == 0) goto L_0x0024
            a.a.a.a.v0.a.i r0 = a.a.a.a.v0.a.g.a(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            boolean r0 = a.s.f2103a
            if (r0 == 0) goto L_0x0052
            if (r1 == 0) goto L_0x002f
            goto L_0x0052
        L_0x002f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Type should be an array, but was "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            T r4 = r3.f1578a
            java.util.List r4 = (java.util.List) r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L_0x0052:
            return r4
        L_0x0053:
            java.lang.String r4 = "module"
            a.w.c.i.a(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.s.b.a(a.a.a.a.v0.b.w):a.a.a.a.v0.m.d0");
    }
}

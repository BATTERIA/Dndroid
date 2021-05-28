package d.e.a.h;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f3187a = new boolean[3];

    public static void a(d dVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        c[] cVarArr = dVar.A;
        cVarArr[i3].f3148a.f3191f = dVar.D.s.f3148a;
        cVarArr[i3].f3148a.f3192g = (float) i2;
        cVarArr[i3].f3148a.b = 1;
        cVarArr[i4].f3148a.f3191f = cVarArr[i3].f3148a;
        cVarArr[i4].f3148a.f3192g = (float) dVar.c(i);
        dVar.A[i4].f3148a.b = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(d.e.a.h.d r5, int r6) {
        /*
            d.e.a.h.d$a[] r0 = r5.C
            r1 = r0[r6]
            d.e.a.h.d$a r2 = d.e.a.h.d.a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            d.e.a.h.d$a r6 = d.e.a.h.d.a.MATCH_CONSTRAINT
            return r3
        L_0x001b:
            if (r6 != 0) goto L_0x002b
            int r6 = r5.f3171e
            if (r6 == 0) goto L_0x0022
            return r3
        L_0x0022:
            int r6 = r5.f3174h
            if (r6 != 0) goto L_0x002a
            int r5 = r5.i
            if (r5 == 0) goto L_0x0039
        L_0x002a:
            return r3
        L_0x002b:
            int r6 = r5.f3172f
            if (r6 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r6 = r5.k
            if (r6 != 0) goto L_0x003a
            int r5 = r5.l
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r4
        L_0x003a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.i.a(d.e.a.h.d, int):boolean");
    }
}

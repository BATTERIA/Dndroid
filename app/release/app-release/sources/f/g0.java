package f;

import g.f;

public abstract class g0 {
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f.g0 a(f.a0 r8, java.lang.String r9) {
        /*
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r8 == 0) goto L_0x0029
            java.lang.String r0 = r8.b     // Catch:{ IllegalArgumentException -> 0x000f }
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r8.b     // Catch:{ IllegalArgumentException -> 0x000f }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x0029
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r8 = "; charset=utf-8"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            f.a0 r8 = f.a0.b(r8)
        L_0x0029:
            byte[] r9 = r9.getBytes(r0)
            int r0 = r9.length
            int r1 = r9.length
            long r2 = (long) r1
            r1 = 0
            long r4 = (long) r1
            long r6 = (long) r0
            f.o0.e.a(r2, r4, r6)
            f.f0 r2 = new f.f0
            r2.<init>(r8, r0, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.a(f.a0, java.lang.String):f.g0");
    }

    public abstract long a();

    public abstract void a(f fVar);

    public abstract a0 b();
}

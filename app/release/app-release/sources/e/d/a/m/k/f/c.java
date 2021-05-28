package e.d.a.m.k.f;

import e.d.a.m.e;
import java.io.File;
import java.io.InputStream;

public class c<T> implements e<File, T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4133c = new a();

    /* renamed from: a  reason: collision with root package name */
    public e<InputStream, T> f4134a;
    public final a b;

    public static class a {
    }

    public c(e<InputStream, T> eVar) {
        a aVar = f4133c;
        this.f4134a = eVar;
        this.b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001d A[SYNTHETIC, Splitter:B:16:0x001d] */
    @Override // e.d.a.m.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.d.a.m.i.k a(java.io.File r3, int r4, int r5) {
        /*
            r2 = this;
            java.io.File r3 = (java.io.File) r3
            r0 = 0
            e.d.a.m.k.f.c$a r1 = r2.b     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0019
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x001a }
            r1.<init>(r3)     // Catch:{ all -> 0x001a }
            e.d.a.m.e<java.io.InputStream, T> r3 = r2.f4134a     // Catch:{ all -> 0x0016 }
            e.d.a.m.i.k r3 = r3.a(r1, r4, r5)     // Catch:{ all -> 0x0016 }
            r1.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r3
        L_0x0016:
            r3 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0019:
            throw r0
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.k.f.c.a(java.lang.Object, int, int):e.d.a.m.i.k");
    }

    @Override // e.d.a.m.e
    public String a() {
        return "";
    }
}

package e.d.a.m.j;

import android.os.ParcelFileDescriptor;
import e.d.a.m.h.c;
import java.io.InputStream;

public class e<A> implements k<A, f> {

    /* renamed from: a  reason: collision with root package name */
    public final k<A, InputStream> f4060a;
    public final k<A, ParcelFileDescriptor> b;

    public static class a implements c<f> {

        /* renamed from: a  reason: collision with root package name */
        public final c<InputStream> f4061a;
        public final c<ParcelFileDescriptor> b;

        public a(c<InputStream> cVar, c<ParcelFileDescriptor> cVar2) {
            this.f4061a = cVar;
            this.b = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC, Splitter:B:14:0x0026] */
        @Override // e.d.a.m.h.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e.d.a.m.j.f a(e.d.a.g r6) {
            /*
                r5 = this;
                e.d.a.m.h.c<java.io.InputStream> r0 = r5.f4061a
                r1 = 2
                r2 = 0
                java.lang.String r3 = "IVML"
                if (r0 == 0) goto L_0x0021
                java.lang.Object r0 = r0.a(r6)     // Catch:{ Exception -> 0x000f }
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x000f }
                goto L_0x0022
            L_0x000f:
                r0 = move-exception
                boolean r4 = android.util.Log.isLoggable(r3, r1)
                if (r4 == 0) goto L_0x001b
                java.lang.String r4 = "Exception fetching input stream, trying ParcelFileDescriptor"
                android.util.Log.v(r3, r4, r0)
            L_0x001b:
                e.d.a.m.h.c<android.os.ParcelFileDescriptor> r4 = r5.b
                if (r4 == 0) goto L_0x0020
                goto L_0x0021
            L_0x0020:
                throw r0
            L_0x0021:
                r0 = r2
            L_0x0022:
                e.d.a.m.h.c<android.os.ParcelFileDescriptor> r4 = r5.b
                if (r4 == 0) goto L_0x003e
                java.lang.Object r6 = r4.a(r6)     // Catch:{ Exception -> 0x002e }
                android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6     // Catch:{ Exception -> 0x002e }
                r2 = r6
                goto L_0x003e
            L_0x002e:
                r6 = move-exception
                boolean r1 = android.util.Log.isLoggable(r3, r1)
                if (r1 == 0) goto L_0x003a
                java.lang.String r1 = "Exception fetching ParcelFileDescriptor"
                android.util.Log.v(r3, r1, r6)
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003e
            L_0x003d:
                throw r6
            L_0x003e:
                e.d.a.m.j.f r6 = new e.d.a.m.j.f
                r6.<init>(r0, r2)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.j.e.a.a(e.d.a.g):java.lang.Object");
        }

        @Override // e.d.a.m.h.c
        public String a() {
            c<InputStream> cVar = this.f4061a;
            return cVar != null ? cVar.a() : this.b.a();
        }

        @Override // e.d.a.m.h.c
        public void b() {
            c<InputStream> cVar = this.f4061a;
            if (cVar != null) {
                cVar.b();
            }
            c<ParcelFileDescriptor> cVar2 = this.b;
            if (cVar2 != null) {
                cVar2.b();
            }
        }

        @Override // e.d.a.m.h.c
        public void cancel() {
            c<InputStream> cVar = this.f4061a;
            if (cVar != null) {
                cVar.cancel();
            }
            c<ParcelFileDescriptor> cVar2 = this.b;
            if (cVar2 != null) {
                cVar2.cancel();
            }
        }
    }

    public e(k<A, InputStream> kVar, k<A, ParcelFileDescriptor> kVar2) {
        if (kVar == null && kVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.f4060a = kVar;
        this.b = kVar2;
    }

    @Override // e.d.a.m.j.k
    public c<f> a(A a2, int i, int i2) {
        k<A, InputStream> kVar = this.f4060a;
        c<InputStream> a3 = kVar != null ? kVar.a(a2, i, i2) : null;
        k<A, ParcelFileDescriptor> kVar2 = this.b;
        c<ParcelFileDescriptor> a4 = kVar2 != null ? kVar2.a(a2, i, i2) : null;
        if (a3 == null && a4 == null) {
            return null;
        }
        return new a(a3, a4);
    }
}

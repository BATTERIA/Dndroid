package e.d.a.m.i;

import android.os.SystemClock;
import android.util.Log;
import e.d.a.m.g;
import e.d.a.m.i.c;
import e.d.a.m.i.n.a;
import e.d.a.s.d;
import java.io.File;

public class a<A, T, Z> {
    public static final b m = new b();

    /* renamed from: a  reason: collision with root package name */
    public final f f3951a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3952c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.a.m.h.c<A> f3953d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.a.p.b<A, T> f3954e;

    /* renamed from: f  reason: collision with root package name */
    public final g<T> f3955f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.a.m.k.i.c<T, Z> f3956g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC0120a f3957h;
    public final b i;
    public final e.d.a.g j;
    public final b k;
    public volatile boolean l;

    /* renamed from: e.d.a.m.i.a$a  reason: collision with other inner class name */
    public interface AbstractC0120a {
    }

    public static class b {
    }

    public class c<DataType> implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final e.d.a.m.b<DataType> f3958a;
        public final DataType b;

        public c(e.d.a.m.b<DataType> bVar, DataType datatype) {
            this.f3958a = bVar;
            this.b = datatype;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0031 A[Catch:{ all -> 0x0028 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC, Splitter:B:22:0x0038] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A[SYNTHETIC, Splitter:B:28:0x003f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(java.io.File r5) {
            /*
                r4 = this;
                java.lang.String r0 = "DecodeJob"
                r1 = 0
                e.d.a.m.i.a r2 = e.d.a.m.i.a.this     // Catch:{ FileNotFoundException -> 0x0025 }
                e.d.a.m.i.a$b r2 = r2.k     // Catch:{ FileNotFoundException -> 0x0025 }
                if (r2 == 0) goto L_0x0027
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0025 }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0025 }
                r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0025 }
                r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0025 }
                e.d.a.m.b<DataType> r5 = r4.f3958a     // Catch:{ FileNotFoundException -> 0x0022, all -> 0x001f }
                DataType r1 = r4.b     // Catch:{ FileNotFoundException -> 0x0022, all -> 0x001f }
                boolean r5 = r5.a(r1, r2)     // Catch:{ FileNotFoundException -> 0x0022, all -> 0x001f }
                r2.close()     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x001f:
                r5 = move-exception
                r1 = r2
                goto L_0x003d
            L_0x0022:
                r5 = move-exception
                r1 = r2
                goto L_0x002a
            L_0x0025:
                r5 = move-exception
                goto L_0x002a
            L_0x0027:
                throw r1
            L_0x0028:
                r5 = move-exception
                goto L_0x003d
            L_0x002a:
                r2 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0028 }
                if (r2 == 0) goto L_0x0036
                java.lang.String r2 = "Failed to find file to write to disk cache"
                android.util.Log.d(r0, r2, r5)     // Catch:{ all -> 0x0028 }
            L_0x0036:
                if (r1 == 0) goto L_0x003b
                r1.close()     // Catch:{ IOException -> 0x003b }
            L_0x003b:
                r5 = 0
            L_0x003c:
                return r5
            L_0x003d:
                if (r1 == 0) goto L_0x0042
                r1.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.i.a.c.a(java.io.File):boolean");
        }
    }

    public a(f fVar, int i2, int i3, e.d.a.m.h.c<A> cVar, e.d.a.p.b<A, T> bVar, g<T> gVar, e.d.a.m.k.i.c<T, Z> cVar2, AbstractC0120a aVar, b bVar2, e.d.a.g gVar2) {
        b bVar3 = m;
        this.f3951a = fVar;
        this.b = i2;
        this.f3952c = i3;
        this.f3953d = cVar;
        this.f3954e = bVar;
        this.f3955f = gVar;
        this.f3956g = cVar2;
        this.f3957h = aVar;
        this.i = bVar2;
        this.j = gVar2;
        this.k = bVar3;
    }

    public final k<T> a(e.d.a.m.c cVar) {
        File b2 = ((c.b) this.f3957h).a().b(cVar);
        if (b2 == null) {
            return null;
        }
        try {
            k<T> a2 = this.f3954e.b().a(b2, this.b, this.f3952c);
            if (a2 == null) {
            }
            return a2;
        } finally {
            ((c.b) this.f3957h).a().a(cVar);
        }
    }

    public final k<T> a(A a2) {
        k<T> kVar;
        if (this.i.f3964c) {
            long a3 = d.a();
            ((c.b) this.f3957h).a().a(this.f3951a.a(), new c(this.f3954e.e(), a2));
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Wrote source to cache", a3);
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            kVar = a(this.f3951a.a());
            if (Log.isLoggable("DecodeJob", 2) && kVar != null) {
                a("Decoded source from cache", elapsedRealtimeNanos);
            }
        } else {
            long a4 = d.a();
            kVar = this.f3954e.g().a(a2, this.b, this.f3952c);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded from source", a4);
            }
        }
        return kVar;
    }

    public final void a(String str, long j2) {
        StringBuilder a2 = e.a.a.a.a.a(str, " in ");
        a2.append(d.a(j2));
        a2.append(", key: ");
        a2.append(this.f3951a);
        Log.v("DecodeJob", a2.toString());
    }

    public k<Z> a() {
        k<Z> kVar = null;
        if (!this.i.f3965d) {
            return null;
        }
        long a2 = d.a();
        k<T> a3 = a((e.d.a.m.c) this.f3951a);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Decoded transformed from cache", a2);
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (a3 != null) {
            kVar = this.f3956g.a(a3);
        }
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transcoded transformed from cache", elapsedRealtimeNanos);
        }
        return kVar;
    }

    public final k<Z> a(k<T> kVar) {
        k<T> kVar2;
        long a2 = d.a();
        k<Z> kVar3 = null;
        if (kVar == null) {
            kVar2 = null;
        } else {
            kVar2 = this.f3955f.a(kVar, this.b, this.f3952c);
            if (!kVar.equals(kVar2)) {
                kVar.a();
            }
        }
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transformed resource from source", a2);
        }
        if (kVar2 != null && this.i.f3965d) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            ((c.b) this.f3957h).a().a(this.f3951a, new c(this.f3954e.d(), kVar2));
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Wrote transformed from source to cache", elapsedRealtimeNanos);
            }
        }
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        if (kVar2 != null) {
            kVar3 = this.f3956g.a(kVar2);
        }
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transcoded transformed from source", elapsedRealtimeNanos2);
        }
        return kVar3;
    }
}

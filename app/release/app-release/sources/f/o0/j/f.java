package f.o0.j;

import f.o0.j.l;
import f.o0.j.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f implements Closeable {
    public static final ExecutorService A = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), f.o0.e.a("OkHttp Http2Connection", true));

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5224c;

    /* renamed from: d  reason: collision with root package name */
    public final g f5225d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, m> f5226e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final String f5227f;

    /* renamed from: g  reason: collision with root package name */
    public int f5228g;

    /* renamed from: h  reason: collision with root package name */
    public int f5229h;
    public boolean i;
    public final ScheduledExecutorService j;
    public final ExecutorService k;
    public final p l;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t;
    public q u = new q();
    public final q v = new q();
    public final Socket w;
    public final n x;
    public final i y;
    public final Set<Integer> z = new LinkedHashSet();

    public class a extends f.o0.d {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f5230d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f5231e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, b bVar) {
            super(str, objArr);
            this.f5230d = i;
            this.f5231e = bVar;
        }

        @Override // f.o0.d
        public void a() {
            try {
                f fVar = f.this;
                fVar.x.a(this.f5230d, this.f5231e);
            } catch (IOException e2) {
                f.a(f.this, e2);
            }
        }
    }

    public class b extends f.o0.d {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f5233d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ long f5234e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f5233d = i;
            this.f5234e = j;
        }

        @Override // f.o0.d
        public void a() {
            try {
                f.this.x.a(this.f5233d, this.f5234e);
            } catch (IOException e2) {
                f.a(f.this, e2);
            }
        }
    }

    public class c extends f.o0.d {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // f.o0.d
        public void a() {
            f.this.a(false, 2, 0);
        }
    }

    public class d extends f.o0.d {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f5237d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ List f5238e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f5237d = i;
            this.f5238e = list;
        }

        @Override // f.o0.d
        public void a() {
            f fVar = f.this;
            p pVar = fVar.l;
            int i = this.f5237d;
            if (((p.a) pVar) != null) {
                try {
                    fVar.x.a(i, b.CANCEL);
                    synchronized (f.this) {
                        f.this.z.remove(Integer.valueOf(this.f5237d));
                    }
                } catch (IOException unused) {
                }
            } else {
                throw null;
            }
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Socket f5240a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public g.g f5241c;

        /* renamed from: d  reason: collision with root package name */
        public g.f f5242d;

        /* renamed from: e  reason: collision with root package name */
        public g f5243e = g.f5248a;

        /* renamed from: f  reason: collision with root package name */
        public p f5244f = p.f5319a;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5245g;

        /* renamed from: h  reason: collision with root package name */
        public int f5246h;

        public e(boolean z) {
            this.f5245g = z;
        }
    }

    /* renamed from: f.o0.j.f$f  reason: collision with other inner class name */
    public final class C0152f extends f.o0.d {
        public C0152f() {
            super("OkHttp %s ping", f.this.f5227f);
        }

        @Override // f.o0.d
        public void a() {
            boolean z;
            synchronized (f.this) {
                if (f.this.n < f.this.m) {
                    z = true;
                } else {
                    f.this.m++;
                    z = false;
                }
            }
            f fVar = f.this;
            if (z) {
                f.a(fVar, (IOException) null);
            } else {
                fVar.a(false, 1, 0);
            }
        }
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f5248a = new a();

        public class a extends g {
            @Override // f.o0.j.f.g
            public void a(m mVar) {
                mVar.a(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(f fVar) {
        }

        public abstract void a(m mVar);
    }

    public final class h extends f.o0.d {

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5249d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5250e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5251f;

        public h(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", f.this.f5227f, Integer.valueOf(i), Integer.valueOf(i2));
            this.f5249d = z;
            this.f5250e = i;
            this.f5251f = i2;
        }

        @Override // f.o0.d
        public void a() {
            f.this.a(this.f5249d, this.f5250e, this.f5251f);
        }
    }

    public f(e eVar) {
        this.l = eVar.f5244f;
        boolean z2 = eVar.f5245g;
        this.f5224c = z2;
        this.f5225d = eVar.f5243e;
        int i2 = z2 ? 1 : 2;
        this.f5229h = i2;
        if (eVar.f5245g) {
            this.f5229h = i2 + 2;
        }
        if (eVar.f5245g) {
            this.u.a(7, 16777216);
        }
        this.f5227f = eVar.b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new f.o0.b(f.o0.e.a("OkHttp %s Writer", this.f5227f), false));
        this.j = scheduledThreadPoolExecutor;
        if (eVar.f5246h != 0) {
            C0152f fVar = new C0152f();
            int i3 = eVar.f5246h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(fVar, (long) i3, (long) i3, TimeUnit.MILLISECONDS);
        }
        this.k = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f.o0.b(f.o0.e.a("OkHttp %s Push Observer", this.f5227f), true));
        this.v.a(7, 65535);
        this.v.a(5, 16384);
        this.t = (long) this.v.a();
        this.w = eVar.f5240a;
        this.x = new n(eVar.f5242d, this.f5224c);
        this.y = new i(new l(eVar.f5241c, this.f5224c));
    }

    public static /* synthetic */ void a(f fVar, IOException iOException) {
        if (fVar != null) {
            b bVar = b.PROTOCOL_ERROR;
            fVar.a(bVar, bVar, iOException);
            return;
        }
        throw null;
    }

    public synchronized m a(int i2) {
        return this.f5226e.get(Integer.valueOf(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.o0.j.m a(int r11, java.util.List<f.o0.j.c> r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.j.f.a(int, java.util.List, boolean):f.o0.j.m");
    }

    public void a(int i2, long j2) {
        try {
            this.j.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f5227f, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i2, b bVar) {
        try {
            this.j.execute(new a("OkHttp %s stream %d", new Object[]{this.f5227f, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i2, List<c> list) {
        synchronized (this) {
            if (this.z.contains(Integer.valueOf(i2))) {
                a(i2, b.PROTOCOL_ERROR);
                return;
            }
            this.z.add(Integer.valueOf(i2));
            try {
                a(new d("OkHttp %s Push Request[%s]", new Object[]{this.f5227f, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final synchronized void a(f.o0.d dVar) {
        if (!this.i) {
            this.k.execute(dVar);
        }
    }

    public void a(b bVar) {
        synchronized (this.x) {
            synchronized (this) {
                if (!this.i) {
                    this.i = true;
                    this.x.a(this.f5228g, bVar, f.o0.e.f5083a);
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(f.o0.j.b r4, f.o0.j.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            r3.a(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, f.o0.j.m> r0 = r3.f5226e     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, f.o0.j.m> r4 = r3.f5226e     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, f.o0.j.m> r0 = r3.f5226e     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            f.o0.j.m[] r0 = new f.o0.j.m[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            f.o0.j.m[] r4 = (f.o0.j.m[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, f.o0.j.m> r0 = r3.f5226e     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.a(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            f.o0.j.n r4 = r3.x     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.w     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.j
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.k
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x004e
        L_0x004d:
            throw r4
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.j.f.a(f.o0.j.b, f.o0.j.b, java.io.IOException):void");
    }

    public boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized m c(int i2) {
        m remove;
        remove = this.f5226e.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public synchronized boolean f(long j2) {
        if (this.i) {
            return false;
        }
        return this.p >= this.o || j2 < this.r;
    }

    public void flush() {
        this.x.flush();
    }

    public synchronized void g(long j2) {
        long j3 = this.s + j2;
        this.s = j3;
        if (j3 >= ((long) (this.u.a() / 2))) {
            a(0, this.s);
            this.s = 0;
        }
    }

    public void k() {
        synchronized (this) {
            if (this.p >= this.o) {
                this.o++;
                this.r = System.nanoTime() + 1000000000;
                try {
                    this.j.execute(new c("OkHttp %s ping", this.f5227f));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public synchronized int a() {
        int i2;
        q qVar = this.v;
        i2 = Integer.MAX_VALUE;
        if ((qVar.f5320a & 16) != 0) {
            i2 = qVar.b[4];
        }
        return i2;
    }

    public void a(int i2, boolean z2, g.e eVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.x.a(z2, i2, eVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (this.t <= 0) {
                    try {
                        if (this.f5226e.containsKey(Integer.valueOf(i2))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j2, this.t), this.x.f5311f);
                j3 = (long) min;
                this.t -= j3;
            }
            j2 -= j3;
            this.x.a(z2 && j2 == 0, i2, eVar, min);
        }
    }

    public void a(boolean z2, int i2, int i3) {
        try {
            this.x.a(z2, i2, i3);
        } catch (IOException e2) {
            b bVar = b.PROTOCOL_ERROR;
            a(bVar, bVar, e2);
        }
    }

    public class i extends f.o0.d implements l.b {

        /* renamed from: d  reason: collision with root package name */
        public final l f5253d;

        public class a extends f.o0.d {

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ m f5255d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f5255d = mVar;
            }

            @Override // f.o0.d
            public void a() {
                try {
                    f.this.f5225d.a(this.f5255d);
                } catch (IOException e2) {
                    f.o0.k.f fVar = f.o0.k.f.f5341a;
                    StringBuilder a2 = e.a.a.a.a.a("Http2Connection.Listener failure for ");
                    a2.append(f.this.f5227f);
                    fVar.a(4, a2.toString(), e2);
                    try {
                        this.f5255d.a(b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends f.o0.d {
            public b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // f.o0.d
            public void a() {
                f fVar = f.this;
                fVar.f5225d.a(fVar);
            }
        }

        public i(l lVar) {
            super("OkHttp %s", f.this.f5227f);
            this.f5253d = lVar;
        }

        @Override // f.o0.d
        public void a() {
            Throwable th;
            b bVar;
            b bVar2;
            b bVar3 = b.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                this.f5253d.a(this);
                while (this.f5253d.a(false, (l.b) this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    bVar2 = b.CANCEL;
                } catch (IOException e3) {
                    e2 = e3;
                }
            } catch (IOException e4) {
                e2 = e4;
                bVar = bVar3;
                try {
                    bVar = b.PROTOCOL_ERROR;
                    bVar2 = b.PROTOCOL_ERROR;
                    f.this.a(bVar, bVar2, e2);
                    f.o0.e.a(this.f5253d);
                } catch (Throwable th2) {
                    th = th2;
                    f.this.a(bVar, bVar3, e2);
                    f.o0.e.a(this.f5253d);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar3;
                f.this.a(bVar, bVar3, e2);
                f.o0.e.a(this.f5253d);
                throw th;
            }
            f.this.a(bVar, bVar2, e2);
            f.o0.e.a(this.f5253d);
        }

        public void a(boolean z, q qVar) {
            m[] mVarArr;
            long j;
            synchronized (f.this.x) {
                synchronized (f.this) {
                    int a2 = f.this.v.a();
                    if (z) {
                        q qVar2 = f.this.v;
                        qVar2.f5320a = 0;
                        Arrays.fill(qVar2.b, 0);
                    }
                    q qVar3 = f.this.v;
                    mVarArr = null;
                    if (qVar3 != null) {
                        int i = 0;
                        while (true) {
                            boolean z2 = true;
                            if (i >= 10) {
                                break;
                            }
                            if (((1 << i) & qVar.f5320a) == 0) {
                                z2 = false;
                            }
                            if (z2) {
                                qVar3.a(i, qVar.b[i]);
                            }
                            i++;
                        }
                        int a3 = f.this.v.a();
                        if (a3 == -1 || a3 == a2) {
                            j = 0;
                        } else {
                            j = (long) (a3 - a2);
                            if (!f.this.f5226e.isEmpty()) {
                                mVarArr = (m[]) f.this.f5226e.values().toArray(new m[f.this.f5226e.size()]);
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                try {
                    f.this.x.a(f.this.v);
                } catch (IOException e2) {
                    f.a(f.this, e2);
                }
            }
            if (mVarArr != null) {
                for (m mVar : mVarArr) {
                    synchronized (mVar) {
                        mVar.b += j;
                        if (j > 0) {
                            mVar.notifyAll();
                        }
                    }
                }
            }
            f.A.execute(new b("OkHttp %s settings", f.this.f5227f));
        }

        public void a(int i, b bVar, g.h hVar) {
            m[] mVarArr;
            hVar.h();
            synchronized (f.this) {
                mVarArr = (m[]) f.this.f5226e.values().toArray(new m[f.this.f5226e.size()]);
                f.this.i = true;
            }
            for (m mVar : mVarArr) {
                if (mVar.f5292c > i && mVar.d()) {
                    mVar.b(b.REFUSED_STREAM);
                    f.this.c(mVar.f5292c);
                }
            }
        }

        public void a(boolean z, int i, int i2, List<c> list) {
            if (f.this.b(i)) {
                f fVar = f.this;
                if (fVar != null) {
                    try {
                        fVar.a(new g(fVar, "OkHttp %s Push Headers[%s]", new Object[]{fVar.f5227f, Integer.valueOf(i)}, i, list, z));
                    } catch (RejectedExecutionException unused) {
                    }
                } else {
                    throw null;
                }
            } else {
                synchronized (f.this) {
                    m a2 = f.this.a(i);
                    if (a2 != null) {
                        a2.a(f.o0.e.b(list), z);
                    } else if (!f.this.i) {
                        if (i > f.this.f5228g) {
                            if (i % 2 != f.this.f5229h % 2) {
                                m mVar = new m(i, f.this, false, z, f.o0.e.b(list));
                                f.this.f5228g = i;
                                f.this.f5226e.put(Integer.valueOf(i), mVar);
                                f.A.execute(new a("OkHttp %s stream %d", new Object[]{f.this.f5227f, Integer.valueOf(i)}, mVar));
                            }
                        }
                    }
                }
            }
        }

        public void a(boolean z, int i, int i2) {
            if (z) {
                synchronized (f.this) {
                    if (i == 1) {
                        try {
                            f.this.n++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        f.this.p++;
                    } else if (i == 3) {
                        f.this.q++;
                        f.this.notifyAll();
                    }
                }
                return;
            }
            try {
                f.this.j.execute(new h(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void a(int i, long j) {
            f fVar = f.this;
            if (i == 0) {
                synchronized (fVar) {
                    f.this.t += j;
                    f.this.notifyAll();
                }
                return;
            }
            m a2 = fVar.a(i);
            if (a2 != null) {
                synchronized (a2) {
                    a2.b += j;
                    if (j > 0) {
                        a2.notifyAll();
                    }
                }
            }
        }
    }
}

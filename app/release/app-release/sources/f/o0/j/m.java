package f.o0.j;

import f.x;
import g.e;
import g.g;
import g.w;
import g.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public long f5291a = 0;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5292c;

    /* renamed from: d  reason: collision with root package name */
    public final f f5293d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<x> f5294e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5295f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5296g;

    /* renamed from: h  reason: collision with root package name */
    public final a f5297h;
    public final c i = new c();
    public final c j = new c();
    public b k;
    public IOException l;

    public final class b implements g.x {

        /* renamed from: c  reason: collision with root package name */
        public final e f5302c = new e();

        /* renamed from: d  reason: collision with root package name */
        public final e f5303d = new e();

        /* renamed from: e  reason: collision with root package name */
        public final long f5304e;

        /* renamed from: f  reason: collision with root package name */
        public x f5305f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5306g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5307h;

        public b(long j) {
            this.f5304e = j;
        }

        public void a(g gVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (m.this) {
                    z = this.f5307h;
                    z2 = true;
                    z3 = this.f5303d.f5428d + j > this.f5304e;
                }
                if (z3) {
                    gVar.skip(j);
                    m.this.a(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    gVar.skip(j);
                    return;
                } else {
                    long c2 = gVar.c(this.f5302c, j);
                    if (c2 != -1) {
                        j -= c2;
                        synchronized (m.this) {
                            if (this.f5306g) {
                                j2 = this.f5302c.f5428d;
                                this.f5302c.k();
                            } else {
                                if (this.f5303d.f5428d != 0) {
                                    z2 = false;
                                }
                                this.f5303d.a(this.f5302c);
                                if (z2) {
                                    m.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            f(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // g.x
        public long c(e eVar, long j) {
            Throwable th;
            long c2;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (m.this) {
                        m.this.i.g();
                        try {
                            if (m.this.k != null) {
                                th = m.this.l != null ? m.this.l : new r(m.this.k);
                            }
                            if (this.f5306g) {
                                throw new IOException("stream closed");
                            } else if (this.f5303d.f5428d > 0) {
                                c2 = this.f5303d.c(eVar, Math.min(j, this.f5303d.f5428d));
                                m.this.f5291a += c2;
                                if (th == null && m.this.f5291a >= ((long) (m.this.f5293d.u.a() / 2))) {
                                    m.this.f5293d.a(m.this.f5292c, m.this.f5291a);
                                    m.this.f5291a = 0;
                                }
                            } else if (this.f5307h || th != null) {
                                c2 = -1;
                            } else {
                                m.this.g();
                                m.this.i.k();
                            }
                        } finally {
                            m.this.i.k();
                        }
                    }
                }
                c2 = -1;
                if (c2 != -1) {
                    f(c2);
                    return c2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }

        @Override // g.x
        public y c() {
            return m.this.i;
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            synchronized (m.this) {
                this.f5306g = true;
                j = this.f5303d.f5428d;
                this.f5303d.k();
                m.this.notifyAll();
            }
            if (j > 0) {
                f(j);
            }
            m.this.a();
        }

        public final void f(long j) {
            m.this.f5293d.g(j);
        }
    }

    public class c extends g.c {
        public c() {
        }

        @Override // g.c
        public IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // g.c
        public void i() {
            m.this.a(b.CANCEL);
            m.this.f5293d.k();
        }

        public void k() {
            if (h()) {
                throw a((IOException) null);
            }
        }
    }

    public m(int i2, f fVar, boolean z, boolean z2, x xVar) {
        if (fVar != null) {
            this.f5292c = i2;
            this.f5293d = fVar;
            this.b = (long) fVar.v.a();
            this.f5296g = new b((long) fVar.u.a());
            a aVar = new a();
            this.f5297h = aVar;
            this.f5296g.f5307h = z2;
            aVar.f5300e = z;
            if (xVar != null) {
                this.f5294e.add(xVar);
            }
            if (d() && xVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!d() && xVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public void a() {
        boolean z;
        boolean e2;
        synchronized (this) {
            z = !this.f5296g.f5307h && this.f5296g.f5306g && (this.f5297h.f5300e || this.f5297h.f5299d);
            e2 = e();
        }
        if (z) {
            a(b.CANCEL, (IOException) null);
        } else if (!e2) {
            this.f5293d.c(this.f5292c);
        }
    }

    public void a(b bVar) {
        if (b(bVar, null)) {
            this.f5293d.a(this.f5292c, bVar);
        }
    }

    public void a(b bVar, IOException iOException) {
        if (b(bVar, iOException)) {
            f fVar = this.f5293d;
            fVar.x.a(this.f5292c, bVar);
        }
    }

    public void b() {
        a aVar = this.f5297h;
        if (aVar.f5299d) {
            throw new IOException("stream closed");
        } else if (aVar.f5300e) {
            throw new IOException("stream finished");
        } else if (this.k != null) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            throw new r(this.k);
        }
    }

    public synchronized void b(b bVar) {
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    public final boolean b(b bVar, IOException iOException) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.f5296g.f5307h && this.f5297h.f5300e) {
                return false;
            }
            this.k = bVar;
            this.l = iOException;
            notifyAll();
            this.f5293d.c(this.f5292c);
            return true;
        }
    }

    public w c() {
        synchronized (this) {
            if (!this.f5295f) {
                if (!d()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f5297h;
    }

    public boolean d() {
        return this.f5293d.f5224c == ((this.f5292c & 1) == 1);
    }

    public synchronized boolean e() {
        if (this.k != null) {
            return false;
        }
        return (!this.f5296g.f5307h && !this.f5296g.f5306g) || (!this.f5297h.f5300e && !this.f5297h.f5299d) || !this.f5295f;
    }

    /* JADX INFO: finally extract failed */
    public synchronized x f() {
        this.i.g();
        while (this.f5294e.isEmpty() && this.k == null) {
            try {
                g();
            } catch (Throwable th) {
                this.i.k();
                throw th;
            }
        }
        this.i.k();
        if (!this.f5294e.isEmpty()) {
        } else if (this.l != null) {
            throw this.l;
        } else {
            throw new r(this.k);
        }
        return this.f5294e.removeFirst();
    }

    public void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(f.x r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5295f     // Catch:{ all -> 0x002d }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            if (r4 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            f.o0.j.m$b r0 = r2.f5296g     // Catch:{ all -> 0x002d }
            r0.f5305f = r3     // Catch:{ all -> 0x002d }
            goto L_0x0015
        L_0x000e:
            r2.f5295f = r1     // Catch:{ all -> 0x002d }
            java.util.Deque<f.x> r0 = r2.f5294e     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x0015:
            if (r4 == 0) goto L_0x001b
            f.o0.j.m$b r3 = r2.f5296g     // Catch:{ all -> 0x002d }
            r3.f5307h = r1     // Catch:{ all -> 0x002d }
        L_0x001b:
            boolean r3 = r2.e()     // Catch:{ all -> 0x002d }
            r2.notifyAll()     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002c
            f.o0.j.f r3 = r2.f5293d
            int r4 = r2.f5292c
            r3.c(r4)
        L_0x002c:
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.j.m.a(f.x, boolean):void");
    }

    public final class a implements w {

        /* renamed from: c  reason: collision with root package name */
        public final e f5298c = new e();

        /* renamed from: d  reason: collision with root package name */
        public boolean f5299d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5300e;

        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final void a(boolean z) {
            long min;
            boolean z2;
            synchronized (m.this) {
                m.this.j.g();
                while (m.this.b <= 0 && !this.f5300e && !this.f5299d && m.this.k == null) {
                    try {
                        m.this.g();
                    } catch (Throwable th) {
                        m.this.j.k();
                        throw th;
                    }
                }
                m.this.j.k();
                m.this.b();
                min = Math.min(m.this.b, this.f5298c.f5428d);
                m.this.b -= min;
            }
            m.this.j.g();
            if (z) {
                try {
                    if (min == this.f5298c.f5428d) {
                        z2 = true;
                        m.this.f5293d.a(m.this.f5292c, z2, this.f5298c, min);
                        m.this.j.k();
                    }
                } catch (Throwable th2) {
                    m.this.j.k();
                    throw th2;
                }
            }
            z2 = false;
            m.this.f5293d.a(m.this.f5292c, z2, this.f5298c, min);
            m.this.j.k();
        }

        @Override // g.w
        public y c() {
            return m.this.j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r8.f5298c.f5428d <= 0) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r0 == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r8.f5298c.f5428d <= 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r0 = r8.f5301f;
            r0.f5293d.a(r0.f5292c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            r2 = r8.f5301f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r8.f5299d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            r8.f5301f.f5293d.x.flush();
            r8.f5301f.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f5301f.f5297h.f5300e != false) goto L_0x003b;
         */
        @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                f.o0.j.m r0 = f.o0.j.m.this
                monitor-enter(r0)
                boolean r1 = r8.f5299d     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                f.o0.j.m r0 = f.o0.j.m.this
                f.o0.j.m$a r0 = r0.f5297h
                boolean r0 = r0.f5300e
                r1 = 1
                if (r0 != 0) goto L_0x003b
                g.e r0 = r8.f5298c
                long r2 = r0.f5428d
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x001f
                r0 = 1
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 == 0) goto L_0x002e
            L_0x0022:
                g.e r0 = r8.f5298c
                long r2 = r0.f5428d
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
                r8.a(r1)
                goto L_0x0022
            L_0x002e:
                f.o0.j.m r0 = f.o0.j.m.this
                f.o0.j.f r2 = r0.f5293d
                int r3 = r0.f5292c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x003b:
                f.o0.j.m r2 = f.o0.j.m.this
                monitor-enter(r2)
                r8.f5299d = r1     // Catch:{ all -> 0x0050 }
                monitor-exit(r2)     // Catch:{ all -> 0x0050 }
                f.o0.j.m r0 = f.o0.j.m.this
                f.o0.j.f r0 = r0.f5293d
                f.o0.j.n r0 = r0.x
                r0.flush()
                f.o0.j.m r0 = f.o0.j.m.this
                r0.a()
                return
            L_0x0050:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0053:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x0057
            L_0x0056:
                throw r1
            L_0x0057:
                goto L_0x0056
            */
            throw new UnsupportedOperationException("Method not decompiled: f.o0.j.m.a.close():void");
        }

        @Override // g.w, java.io.Flushable
        public void flush() {
            synchronized (m.this) {
                m.this.b();
            }
            while (this.f5298c.f5428d > 0) {
                a(false);
                m.this.f5293d.flush();
            }
        }

        @Override // g.w
        public void a(e eVar, long j) {
            this.f5298c.a(eVar, j);
            while (this.f5298c.f5428d >= 16384) {
                a(false);
            }
        }
    }
}

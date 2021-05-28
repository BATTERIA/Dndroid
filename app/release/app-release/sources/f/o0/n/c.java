package f.o0.n;

import e.e.a.n.f.d.a;
import f.c0;
import f.d0;
import f.e0;
import f.h0;
import f.j;
import f.m0;
import f.n0;
import f.o0.n.d;
import g.f;
import g.g;
import g.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c implements m0, d.a {
    public static final List<c0> x = Collections.singletonList(c0.HTTP_1_1);

    /* renamed from: a  reason: collision with root package name */
    public final e0 f5347a;
    public final n0 b;

    /* renamed from: c  reason: collision with root package name */
    public final Random f5348c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5349d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5350e;

    /* renamed from: f  reason: collision with root package name */
    public j f5351f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f5352g;

    /* renamed from: h  reason: collision with root package name */
    public d f5353h;
    public e i;
    public ScheduledExecutorService j;
    public e k;
    public final ArrayDeque<h> l = new ArrayDeque<>();
    public final ArrayDeque<Object> m = new ArrayDeque<>();
    public long n;
    public boolean o;
    public ScheduledFuture<?> p;
    public int q = -1;
    public String r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;

    public final class a implements Runnable {
        public a() {
        }

        public void run() {
            ((d0) c.this.f5351f).f4991d.a();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5355a;
        public final h b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5356c;

        public b(int i, h hVar, long j) {
            this.f5355a = i;
            this.b = hVar;
            this.f5356c = j;
        }
    }

    /* renamed from: f.o0.n.c$c  reason: collision with other inner class name */
    public static final class C0154c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5357a;
        public final h b;

        public C0154c(int i, h hVar) {
            this.f5357a = i;
            this.b = hVar;
        }
    }

    public final class d implements Runnable {
        public d() {
        }

        public void run() {
            c.this.e();
        }
    }

    public static abstract class e implements Closeable {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5359c;

        /* renamed from: d  reason: collision with root package name */
        public final g f5360d;

        /* renamed from: e  reason: collision with root package name */
        public final f f5361e;

        public e(boolean z, g gVar, f fVar) {
            this.f5359c = z;
            this.f5360d = gVar;
            this.f5361e = fVar;
        }
    }

    public c(e0 e0Var, n0 n0Var, Random random, long j2) {
        if ("GET".equals(e0Var.b)) {
            this.f5347a = e0Var;
            this.b = n0Var;
            this.f5348c = random;
            this.f5349d = j2;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f5350e = h.a(bArr).a();
            this.f5352g = new a(this);
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Request must be GET: ");
        a2.append(e0Var.b);
        throw new IllegalArgumentException(a2.toString());
    }

    public /* synthetic */ void a() {
        do {
            try {
            } catch (IOException e2) {
                a(e2, (h0) null);
                return;
            }
        } while (d());
    }

    public void a(h0 h0Var, f.o0.g.d dVar) {
        if (h0Var.f5020e == 101) {
            String a2 = h0Var.f5023h.a("Connection");
            String str = null;
            if (a2 == null) {
                a2 = null;
            }
            if ("Upgrade".equalsIgnoreCase(a2)) {
                String a3 = h0Var.f5023h.a("Upgrade");
                if (a3 == null) {
                    a3 = null;
                }
                if ("websocket".equalsIgnoreCase(a3)) {
                    String a4 = h0Var.f5023h.a("Sec-WebSocket-Accept");
                    if (a4 != null) {
                        str = a4;
                    }
                    String a5 = h.c(this.f5350e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").f().a();
                    if (!a5.equals(str)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a5 + "' but was '" + str + "'");
                    } else if (dVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException(e.a.a.a.a.a("Expected 'Upgrade' header value 'websocket' but was '", a3, "'"));
                }
            } else {
                throw new ProtocolException(e.a.a.a.a.a("Expected 'Connection' header value 'Upgrade' but was '", a2, "'"));
            }
        } else {
            StringBuilder a6 = e.a.a.a.a.a("Expected HTTP 101 response but was '");
            a6.append(h0Var.f5020e);
            a6.append(" ");
            throw new ProtocolException(e.a.a.a.a.a(a6, h0Var.f5021f, "'"));
        }
    }

    public synchronized void a(h hVar) {
        if (!this.s) {
            if (!this.o || !this.m.isEmpty()) {
                this.l.add(hVar);
                c();
                this.u++;
            }
        }
    }

    public void a(String str, e eVar) {
        synchronized (this) {
            this.k = eVar;
            this.i = new e(eVar.f5359c, eVar.f5361e, this.f5348c);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f.o0.e.a(str, false));
            this.j = scheduledThreadPoolExecutor;
            if (this.f5349d != 0) {
                scheduledThreadPoolExecutor.scheduleAtFixedRate(new d(), this.f5349d, this.f5349d, TimeUnit.MILLISECONDS);
            }
            if (!this.m.isEmpty()) {
                c();
            }
        }
        this.f5353h = new d(eVar.f5359c, eVar.f5360d, this);
    }

    public void b() {
        while (this.q == -1) {
            d dVar = this.f5353h;
            dVar.b();
            if (dVar.f5368h) {
                dVar.a();
            } else {
                int i2 = dVar.f5365e;
                if (i2 == 1 || i2 == 2) {
                    while (!dVar.f5364d) {
                        long j2 = dVar.f5366f;
                        if (j2 > 0) {
                            dVar.b.b(dVar.j, j2);
                            if (!dVar.f5362a) {
                                dVar.j.a(dVar.l);
                                dVar.l.f(dVar.j.f5428d - dVar.f5366f);
                                a.a.a.a.v0.m.l1.a.a(dVar.l, dVar.k);
                                dVar.l.close();
                            }
                        }
                        if (!dVar.f5367g) {
                            while (!dVar.f5364d) {
                                dVar.b();
                                if (!dVar.f5368h) {
                                    break;
                                }
                                dVar.a();
                            }
                            if (dVar.f5365e != 0) {
                                StringBuilder a2 = e.a.a.a.a.a("Expected continuation opcode. Got: ");
                                a2.append(Integer.toHexString(dVar.f5365e));
                                throw new ProtocolException(a2.toString());
                            }
                        } else if (i2 == 1) {
                            d.a aVar = dVar.f5363c;
                            String n2 = dVar.j.n();
                            e.e.a.n.f.b bVar = ((a.C0134a) ((c) aVar).b).f4368a;
                            if (bVar != null) {
                                bVar.a(n2);
                            }
                        } else {
                            d.a aVar2 = dVar.f5363c;
                            dVar.j.m();
                            if (((c) aVar2).b == null) {
                                throw null;
                            }
                        }
                    }
                    throw new IOException("closed");
                }
                StringBuilder a3 = e.a.a.a.a.a("Unknown opcode: ");
                a3.append(Integer.toHexString(i2));
                throw new ProtocolException(a3.toString());
            }
        }
    }

    public synchronized void b(h hVar) {
        this.v++;
        this.w = false;
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService = this.j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f5352g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r2 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.b(10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if ((r5 instanceof f.o0.n.c.C0154c) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r2 = ((f.o0.n.c.C0154c) r5).b;
        r3 = ((f.o0.n.c.C0154c) r5).f5357a;
        r5 = (long) r2.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r0.f5375h != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        r0.f5375h = true;
        r0 = r0.f5374g;
        r0.f5376c = r3;
        r0.f5377d = r5;
        r0.f5378e = true;
        r0.f5379f = false;
        r0 = g.o.a(r0);
        r1 = (g.r) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r1.f5461e != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r1.f5459c.a(r2);
        r1.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        ((g.r) r0).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r12.n -= (long) r2.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        throw new java.lang.IllegalStateException("closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if ((r5 instanceof f.o0.n.c.b) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r5 = (f.o0.n.c.b) r5;
        r0.a(r5.f5355a, r5.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r4 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        r0 = (e.e.a.n.f.d.a.C0134a) r12.b;
        r1 = e.e.a.n.f.d.a.this;
        r1.f4366a = null;
        r1.f4367c = null;
        r0 = r0.f4368a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        if (r0 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        r0.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        f.o0.e.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dc, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        f.o0.e.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.n.c.d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r2 = e.a.a.a.a.a("sent ping but didn't receive pong within ");
        r2.append(r7.f5349d);
        r2.append("ms (after ");
        r2.append(r1 - 1);
        r2.append(" successful ping/pongs)");
        a(new java.net.SocketTimeoutException(r2.toString()), (f.h0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.b(9, g.h.f5436g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        a(r0, (f.h0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.s     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0051 }
            return
        L_0x0007:
            f.o0.n.e r0 = r7.i     // Catch:{ all -> 0x0051 }
            boolean r1 = r7.w     // Catch:{ all -> 0x0051 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.t     // Catch:{ all -> 0x0051 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.t     // Catch:{ all -> 0x0051 }
            r4 = 1
            int r3 = r3 + r4
            r7.t = r3     // Catch:{ all -> 0x0051 }
            r7.w = r4     // Catch:{ all -> 0x0051 }
            monitor-exit(r7)     // Catch:{ all -> 0x0051 }
            r3 = 0
            if (r1 == r2) goto L_0x0044
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r2 = "sent ping but didn't receive pong within "
            java.lang.StringBuilder r2 = e.a.a.a.a.a(r2)
            long r5 = r7.f5349d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.a(r0, r3)
            return
        L_0x0044:
            g.h r1 = g.h.f5436g     // Catch:{ IOException -> 0x004c }
            r2 = 9
            r0.b(r2, r1)     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            r7.a(r0, r3)
        L_0x0050:
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.n.c.e():void");
    }

    public synchronized boolean a(int i2, String str, long j2) {
        String d2 = a.a.a.a.v0.m.l1.a.d(i2);
        if (d2 == null) {
            h hVar = null;
            if (str != null) {
                hVar = h.c(str);
                if (((long) hVar.f5437c.length) > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: " + str);
                }
            }
            if (!this.s) {
                if (!this.o) {
                    this.o = true;
                    this.m.add(new b(i2, hVar, j2));
                    c();
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException(d2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (e.e.a.n.f.d.a.C0134a) r3.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r1 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r4.printStackTrace();
        r2 = e.e.a.n.f.d.a.this;
        r2.f4366a = null;
        r2.f4367c = null;
        r0 = r1.f4368a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if ((r4 instanceof java.io.EOFException) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0.a(e.e.a.n.f.c.CLOSE_NORMAL.f4365c, "CLOSE_NORMAL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0.b(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        f.o0.e.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Exception r4, f.h0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.s     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            return
        L_0x0007:
            r5 = 1
            r3.s = r5     // Catch:{ all -> 0x0055 }
            f.o0.n.c$e r5 = r3.k     // Catch:{ all -> 0x0055 }
            r0 = 0
            r3.k = r0     // Catch:{ all -> 0x0055 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.p     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.p     // Catch:{ all -> 0x0055 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0055 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.j     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.j     // Catch:{ all -> 0x0055 }
            r1.shutdown()     // Catch:{ all -> 0x0055 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            f.n0 r1 = r3.b     // Catch:{ all -> 0x0050 }
            e.e.a.n.f.d.a$a r1 = (e.e.a.n.f.d.a.C0134a) r1     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004f
            r4.printStackTrace()     // Catch:{ all -> 0x0050 }
            e.e.a.n.f.d.a r2 = e.e.a.n.f.d.a.this     // Catch:{ all -> 0x0050 }
            r2.f4366a = r0     // Catch:{ all -> 0x0050 }
            r2.f4367c = r0     // Catch:{ all -> 0x0050 }
            e.e.a.n.f.b r0 = r1.f4368a     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004b
            boolean r1 = r4 instanceof java.io.EOFException     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0044
            e.e.a.n.f.c r4 = e.e.a.n.f.c.CLOSE_NORMAL     // Catch:{ all -> 0x0050 }
            int r4 = r4.f4365c     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "CLOSE_NORMAL"
            r0.a(r4, r1)     // Catch:{ all -> 0x0050 }
            goto L_0x004b
        L_0x0044:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0050 }
            r0.b(r4)     // Catch:{ all -> 0x0050 }
        L_0x004b:
            f.o0.e.a(r5)
            return
        L_0x004f:
            throw r0
        L_0x0050:
            r4 = move-exception
            f.o0.e.a(r5)
            throw r4
        L_0x0055:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.n.c.a(java.lang.Exception, f.h0):void");
    }

    public void a(int i2, String str) {
        e eVar;
        if (i2 != -1) {
            synchronized (this) {
                if (this.q == -1) {
                    this.q = i2;
                    this.r = str;
                    if (!this.o || !this.m.isEmpty()) {
                        eVar = null;
                    } else {
                        eVar = this.k;
                        this.k = null;
                        if (this.p != null) {
                            this.p.cancel(false);
                        }
                        this.j.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                if (this.b != null) {
                    if (eVar != null) {
                        a.C0134a aVar = (a.C0134a) this.b;
                        e.e.a.n.f.d.a aVar2 = e.e.a.n.f.d.a.this;
                        aVar2.f4366a = null;
                        aVar2.f4367c = null;
                        e.e.a.n.f.b bVar = aVar.f4368a;
                        if (bVar != null) {
                            bVar.a(i2, str);
                        }
                    }
                    return;
                }
                throw null;
            } finally {
                f.o0.e.a(eVar);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized boolean a(h hVar, int i2) {
        if (!this.s) {
            if (!this.o) {
                if (this.n + ((long) hVar.h()) > 16777216) {
                    a(1001, null, 60000);
                    return false;
                }
                this.n += (long) hVar.h();
                this.m.add(new C0154c(i2, hVar));
                c();
                return true;
            }
        }
        return false;
    }
}

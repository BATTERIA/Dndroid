package f.o0.g;

import f.b0;
import f.e0;
import f.j;
import f.n;
import f.o0.e;
import f.o0.h.f;
import f.u;
import f.z;
import g.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f5147a;
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5148c;

    /* renamed from: d  reason: collision with root package name */
    public final u f5149d;

    /* renamed from: e  reason: collision with root package name */
    public final c f5150e = new a();

    /* renamed from: f  reason: collision with root package name */
    public Object f5151f;

    /* renamed from: g  reason: collision with root package name */
    public e0 f5152g;

    /* renamed from: h  reason: collision with root package name */
    public e f5153h;
    public g i;
    public d j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public class a extends c {
        public a() {
        }

        @Override // g.c
        public void i() {
            l.this.a();
        }
    }

    public static final class b extends WeakReference<l> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5154a;

        public b(l lVar, Object obj) {
            super(lVar);
            this.f5154a = obj;
        }
    }

    public l(b0 b0Var, j jVar) {
        this.f5147a = b0Var;
        f.o0.c cVar = f.o0.c.f5081a;
        n nVar = b0Var.u;
        if (((b0.a) cVar) != null) {
            this.b = nVar.f5067a;
            this.f5148c = jVar;
            this.f5149d = b0Var.i.a(jVar);
            this.f5150e.a((long) b0Var.z, TimeUnit.MILLISECONDS);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException a(f.o0.g.d r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            f.o0.g.h r0 = r2.b
            monitor-enter(r0)
            f.o0.g.d r1 = r2.j     // Catch:{ all -> 0x003f }
            if (r3 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r6
        L_0x0009:
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0013
            boolean r4 = r2.k     // Catch:{ all -> 0x003f }
            r4 = r4 ^ r1
            r2.k = r1     // Catch:{ all -> 0x003f }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.l     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r2.l = r1     // Catch:{ all -> 0x003f }
        L_0x001d:
            boolean r5 = r2.k     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            boolean r5 = r2.l     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            f.o0.g.d r4 = r2.j     // Catch:{ all -> 0x003f }
            f.o0.g.g r4 = r4.a()     // Catch:{ all -> 0x003f }
            int r5 = r4.m     // Catch:{ all -> 0x003f }
            int r5 = r5 + r1
            r4.m = r5     // Catch:{ all -> 0x003f }
            r4 = 0
            r2.j = r4     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            java.io.IOException r6 = r2.a(r6, r3)
        L_0x003e:
            return r6
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.l.a(f.o0.g.d, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public IOException a(IOException iOException) {
        synchronized (this.b) {
            this.o = true;
        }
        return a(iOException, false);
    }

    public void a() {
        d dVar;
        g gVar;
        synchronized (this.b) {
            this.m = true;
            dVar = this.j;
            if (this.f5153h == null || this.f5153h.f5122h == null) {
                gVar = this.i;
            } else {
                gVar = this.f5153h.f5122h;
            }
        }
        if (dVar != null) {
            dVar.f5104e.cancel();
        } else if (gVar != null) {
            e.a(gVar.f5125d);
        }
    }

    public void a(g gVar) {
        if (this.i == null) {
            this.i = gVar;
            gVar.p.add(new b(this, this.f5151f));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        synchronized (this.b) {
            if (!this.o) {
                this.j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.j != null;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.m;
        }
        return z;
    }

    public Socket e() {
        int size = this.i.p.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.i.p.get(i2).get() == this) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            g gVar = this.i;
            gVar.p.remove(i2);
            this.i = null;
            if (gVar.p.isEmpty()) {
                gVar.q = System.nanoTime();
                h hVar = this.b;
                if (hVar != null) {
                    if (gVar.k || hVar.f5131a == 0) {
                        hVar.f5133d.remove(gVar);
                        z = true;
                    } else {
                        hVar.notifyAll();
                    }
                    if (z) {
                        return gVar.f5126e;
                    }
                } else {
                    throw null;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public final IOException a(IOException iOException, boolean z) {
        g gVar;
        Socket e2;
        boolean z2;
        boolean z3;
        synchronized (this.b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            gVar = this.i;
            e2 = (this.i == null || this.j != null || (!z && !this.o)) ? null : e();
            if (this.i != null) {
                gVar = null;
            }
            z2 = false;
            z3 = this.o && this.j == null;
        }
        e.a(e2);
        if (gVar == null || this.f5149d != null) {
            if (z3) {
                if (iOException != null) {
                    z2 = true;
                }
                if (!this.n && this.f5150e.h()) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                    if (iOException != null) {
                        interruptedIOException.initCause(iOException);
                    }
                    iOException = interruptedIOException;
                }
                u uVar = this.f5149d;
                if (z2) {
                    if (uVar == null) {
                        throw null;
                    }
                } else if (uVar == null) {
                    throw null;
                }
            }
            return iOException;
        }
        throw null;
    }

    public d a(z.a aVar, boolean z) {
        synchronized (this.b) {
            if (this.o) {
                throw new IllegalStateException("released");
            } else if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        e eVar = this.f5153h;
        b0 b0Var = this.f5147a;
        if (eVar != null) {
            f fVar = (f) aVar;
            try {
                d dVar = new d(this, this.f5148c, this.f5149d, this.f5153h, eVar.a(fVar.f5164g, fVar.f5165h, fVar.i, b0Var.D, b0Var.y, z).a(b0Var, aVar));
                synchronized (this.b) {
                    this.j = dVar;
                    this.k = false;
                    this.l = false;
                }
                return dVar;
            } catch (j e2) {
                eVar.d();
                throw e2;
            } catch (IOException e3) {
                eVar.d();
                throw new j(e3);
            }
        } else {
            throw null;
        }
    }
}

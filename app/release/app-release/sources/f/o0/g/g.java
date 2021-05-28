package f.o0.g;

import e.a.a.a.a;
import f.b0;
import f.c0;
import f.e;
import f.j;
import f.k0;
import f.o0.h.c;
import f.o0.j.b;
import f.o0.j.f;
import f.o0.j.k;
import f.o0.j.m;
import f.o0.m.d;
import f.u;
import f.w;
import f.y;
import f.z;
import g.o;
import g.r;
import g.s;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class g extends f.g {
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final k0 f5124c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f5125d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f5126e;

    /* renamed from: f  reason: collision with root package name */
    public w f5127f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f5128g;

    /* renamed from: h  reason: collision with root package name */
    public f f5129h;
    public g.g i;
    public g.f j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final List<Reference<l>> p = new ArrayList();
    public long q = Long.MAX_VALUE;

    public g(h hVar, k0 k0Var) {
        this.b = hVar;
        this.f5124c = k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0136 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r16, int r17, int r18, int r19, boolean r20, f.j r21, f.u r22) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.g.a(int, int, int, int, boolean, f.j, f.u):void");
    }

    @Override // f.o0.j.f.g
    public void a(f fVar) {
        synchronized (this.b) {
            this.o = fVar.a();
        }
    }

    @Override // f.o0.j.f.g
    public void a(m mVar) {
        mVar.a(b.REFUSED_STREAM, (IOException) null);
    }

    public boolean a() {
        return this.f5129h != null;
    }

    public void b() {
        synchronized (this.b) {
            this.k = true;
        }
    }

    public String toString() {
        StringBuilder a2 = a.a("Connection{");
        a2.append(this.f5124c.f5048a.f4998a.f5405d);
        a2.append(":");
        a2.append(this.f5124c.f5048a.f4998a.f5406e);
        a2.append(", proxy=");
        a2.append(this.f5124c.b);
        a2.append(" hostAddress=");
        a2.append(this.f5124c.f5049c);
        a2.append(" cipherSuite=");
        w wVar = this.f5127f;
        a2.append(wVar != null ? wVar.b : "none");
        a2.append(" protocol=");
        a2.append(this.f5128g);
        a2.append('}');
        return a2.toString();
    }

    public final void a(int i2, int i3, j jVar, u uVar) {
        Socket socket;
        k0 k0Var = this.f5124c;
        Proxy proxy = k0Var.b;
        e eVar = k0Var.f5048a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = eVar.f4999c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f5125d = socket;
        InetSocketAddress inetSocketAddress = this.f5124c.f5049c;
        if (uVar != null) {
            socket.setSoTimeout(i3);
            try {
                f.o0.k.f.f5341a.a(this.f5125d, this.f5124c.f5049c, i2);
                try {
                    this.i = new s(o.b(this.f5125d));
                    this.j = new r(o.a(this.f5125d));
                } catch (NullPointerException e2) {
                    if ("throw with null exception".equals(e2.getMessage())) {
                        throw new IOException(e2);
                    }
                }
            } catch (ConnectException e3) {
                StringBuilder a2 = a.a("Failed to connect to ");
                a2.append(this.f5124c.f5049c);
                ConnectException connectException = new ConnectException(a2.toString());
                connectException.initCause(e3);
                throw connectException;
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [f.o0.g.g, f.b0] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r19, int r20, int r21, f.j r22, f.u r23) {
        /*
        // Method dump skipped, instructions count: 405
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.g.a(int, int, int, f.j, f.u):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0134 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(f.o0.g.c r6, int r7, f.j r8, f.u r9) {
        /*
        // Method dump skipped, instructions count: 322
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.g.a(f.o0.g.c, int, f.j, f.u):void");
    }

    public c a(b0 b0Var, z.a aVar) {
        if (this.f5129h != null) {
            return new k(b0Var, this, aVar, this.f5129h);
        }
        f.o0.h.f fVar = (f.o0.h.f) aVar;
        this.f5126e.setSoTimeout(fVar.f5165h);
        this.i.c().a((long) fVar.f5165h, TimeUnit.MILLISECONDS);
        this.j.c().a((long) fVar.i, TimeUnit.MILLISECONDS);
        return new f.o0.i.a(b0Var, this, this.i, this.j);
    }

    public final void a(int i2) {
        this.f5126e.setSoTimeout(0);
        f.e eVar = new f.e(true);
        Socket socket = this.f5126e;
        String str = this.f5124c.f5048a.f4998a.f5405d;
        g.g gVar = this.i;
        g.f fVar = this.j;
        eVar.f5240a = socket;
        eVar.b = str;
        eVar.f5241c = gVar;
        eVar.f5242d = fVar;
        eVar.f5243e = this;
        eVar.f5246h = i2;
        f fVar2 = new f(eVar);
        this.f5129h = fVar2;
        fVar2.x.a();
        fVar2.x.b(fVar2.u);
        int a2 = fVar2.u.a();
        if (a2 != 65535) {
            fVar2.x.a(0, (long) (a2 - 65535));
        }
        new Thread(fVar2.y).start();
    }

    public boolean a(y yVar) {
        int i2 = yVar.f5406e;
        y yVar2 = this.f5124c.f5048a.f4998a;
        if (i2 != yVar2.f5406e) {
            return false;
        }
        if (yVar.f5405d.equals(yVar2.f5405d)) {
            return true;
        }
        w wVar = this.f5127f;
        if (wVar == null || !d.f5344a.a(yVar.f5405d, (X509Certificate) wVar.f5399c.get(0))) {
            return false;
        }
        return true;
    }

    public void a(IOException iOException) {
        int i2;
        synchronized (this.b) {
            if (iOException instanceof f.o0.j.r) {
                b bVar = ((f.o0.j.r) iOException).f5321c;
                if (bVar == b.REFUSED_STREAM) {
                    int i3 = this.n + 1;
                    this.n = i3;
                    if (i3 > 1) {
                        this.k = true;
                        i2 = this.l;
                    }
                } else if (bVar != b.CANCEL) {
                    this.k = true;
                    i2 = this.l;
                }
            } else if (!a() || (iOException instanceof f.o0.j.a)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        h hVar = this.b;
                        k0 k0Var = this.f5124c;
                        if (hVar != null) {
                            if (k0Var.b.type() != Proxy.Type.DIRECT) {
                                e eVar = k0Var.f5048a;
                                eVar.f5003g.connectFailed(eVar.f4998a.g(), k0Var.b.address(), iOException);
                            }
                            hVar.f5134e.b(k0Var);
                        } else {
                            throw null;
                        }
                    }
                    i2 = this.l;
                }
            }
            this.l = i2 + 1;
        }
    }
}

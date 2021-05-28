package f.o0.g;

import e.a.a.a.a;
import f.b0;
import f.k0;
import f.o0.c;
import f.o0.e;
import f.o0.g.l;
import f.o0.k.f;
import f.o0.m.d;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class h {

    /* renamed from: g  reason: collision with root package name */
    public static final Executor f5130g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    public final int f5131a;
    public final long b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f5132c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    public final Deque<g> f5133d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final i f5134e = new i();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5135f;

    public h(int i, long j, TimeUnit timeUnit) {
        this.f5131a = i;
        this.b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    public long a(long j) {
        synchronized (this) {
            g gVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (g gVar2 : this.f5133d) {
                if (a(gVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - gVar2.q;
                    if (j3 > j2) {
                        gVar = gVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.b) {
                if (i <= this.f5131a) {
                    if (i > 0) {
                        return this.b - j2;
                    } else if (i2 > 0) {
                        return this.b;
                    } else {
                        this.f5135f = false;
                        return -1;
                    }
                }
            }
            this.f5133d.remove(gVar);
            e.a(gVar.f5126e);
            return 0;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.a(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x002a
        L_0x0029:
            throw r0
        L_0x002a:
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.h.a():void");
    }

    public final int a(g gVar, long j) {
        List<Reference<l>> list = gVar.p;
        int i = 0;
        while (i < list.size()) {
            Reference<l> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder a2 = a.a("A connection to ");
                a2.append(gVar.f5124c.f5048a.f4998a);
                a2.append(" was leaked. Did you forget to close a response body?");
                f.f5341a.a(a2.toString(), ((l.b) reference).f5154a);
                list.remove(i);
                gVar.k = true;
                if (list.isEmpty()) {
                    gVar.q = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public boolean a(f.e eVar, l lVar, List<k0> list, boolean z) {
        boolean z2;
        Iterator<g> it = this.f5133d.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                return false;
            }
            g next = it.next();
            if (!z || next.a()) {
                if (next.p.size() < next.o && !next.k) {
                    c cVar = c.f5081a;
                    f.e eVar2 = next.f5124c.f5048a;
                    if (((b0.a) cVar) == null) {
                        throw null;
                    } else if (eVar2.a(eVar)) {
                        if (!eVar.f4998a.f5405d.equals(next.f5124c.f5048a.f4998a.f5405d)) {
                            if (!(next.f5129h == null || list == null)) {
                                int size = list.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        z2 = false;
                                        break;
                                    }
                                    k0 k0Var = list.get(i);
                                    if (k0Var.b.type() == Proxy.Type.DIRECT && next.f5124c.b.type() == Proxy.Type.DIRECT && next.f5124c.f5049c.equals(k0Var.f5049c)) {
                                        z2 = true;
                                        break;
                                    }
                                    i++;
                                }
                                if (z2 && eVar.j == d.f5344a && next.a(eVar.f4998a)) {
                                    try {
                                        eVar.k.a(eVar.f4998a.f5405d, next.f5127f.f5399c);
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                        z3 = true;
                    }
                }
                if (z3) {
                    lVar.a(next);
                    return true;
                }
            }
        }
    }
}

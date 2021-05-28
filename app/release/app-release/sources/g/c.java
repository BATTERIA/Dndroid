package g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends y {

    /* renamed from: h  reason: collision with root package name */
    public static final long f5421h = TimeUnit.SECONDS.toMillis(60);
    public static final long i = TimeUnit.MILLISECONDS.toNanos(f5421h);
    public static c j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5422e;

    /* renamed from: f  reason: collision with root package name */
    public c f5423f;

    /* renamed from: g  reason: collision with root package name */
    public long f5424g;

    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<g.c> r0 = g.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                g.c r1 = g.c.j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                g.c r2 = g.c.j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                g.c.j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.i()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[EDGE_INSN: B:33:0x0052->B:23:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(g.c r6, long r7, boolean r9) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a(g.c, long, boolean):void");
    }

    public static synchronized boolean a(c cVar) {
        boolean z;
        synchronized (c.class) {
            c cVar2 = j;
            while (true) {
                if (cVar2 == null) {
                    z = true;
                    break;
                } else if (cVar2.f5423f == cVar) {
                    cVar2.f5423f = cVar.f5423f;
                    cVar.f5423f = null;
                    z = false;
                    break;
                } else {
                    cVar2 = cVar2.f5423f;
                }
            }
        }
        return z;
    }

    public static c j() {
        c cVar = j.f5423f;
        long nanoTime = System.nanoTime();
        if (cVar == null) {
            c.class.wait(f5421h);
            if (j.f5423f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long j2 = cVar.f5424g - nanoTime;
        if (j2 > 0) {
            long j3 = j2 / 1000000;
            c.class.wait(j3, (int) (j2 - (1000000 * j3)));
            return null;
        }
        j.f5423f = cVar.f5423f;
        cVar.f5423f = null;
        return cVar;
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void a(boolean z) {
        if (h() && z) {
            throw a((IOException) null);
        }
    }

    public final void g() {
        if (!this.f5422e) {
            long j2 = this.f5475c;
            boolean z = this.f5474a;
            if (j2 != 0 || z) {
                this.f5422e = true;
                a(this, j2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean h() {
        if (!this.f5422e) {
            return false;
        }
        this.f5422e = false;
        return a(this);
    }

    public void i() {
    }
}

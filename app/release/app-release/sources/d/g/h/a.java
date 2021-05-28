package d.g.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3282a;
    public AbstractC0100a b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3283c;

    /* renamed from: d.g.h.a$a  reason: collision with other inner class name */
    public interface AbstractC0100a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        ((d.j.d.e) r0).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.f3283c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.f3283c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002a, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f3282a     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            return
        L_0x0007:
            r0 = 1
            r2.f3282a = r0     // Catch:{ all -> 0x002f }
            r2.f3283c = r0     // Catch:{ all -> 0x002f }
            d.g.h.a$a r0 = r2.b     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            d.j.d.e r0 = (d.j.d.e) r0
            r0.a()     // Catch:{ all -> 0x0018 }
            goto L_0x0024
        L_0x0018:
            r0 = move-exception
            monitor-enter(r2)
            r2.f3283c = r1     // Catch:{ all -> 0x0021 }
            r2.notifyAll()     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0024:
            monitor-enter(r2)
            r2.f3283c = r1     // Catch:{ all -> 0x002c }
            r2.notifyAll()     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.h.a.a():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:21:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(d.g.h.a.AbstractC0100a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.f3283c     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            d.g.h.a$a r0 = r1.b
            if (r0 != r2) goto L_0x000f
            monitor-exit(r1)
            return
        L_0x000f:
            r1.b = r2
            boolean r0 = r1.f3282a
            if (r0 == 0) goto L_0x001f
            if (r2 != 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            monitor-exit(r1)
            d.j.d.e r2 = (d.j.d.e) r2
            r2.a()
            return
        L_0x001f:
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x0025
        L_0x0024:
            throw r2
        L_0x0025:
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.h.a.a(d.g.h.a$a):void");
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.f3282a;
        }
        return z;
    }
}

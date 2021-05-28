package d.e.a.h;

import d.e.a.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public j f3148a = new j(this);
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC0096c f3149c;

    /* renamed from: d  reason: collision with root package name */
    public c f3150d;

    /* renamed from: e  reason: collision with root package name */
    public int f3151e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f3152f = -1;

    /* renamed from: g  reason: collision with root package name */
    public b f3153g = b.NONE;

    /* renamed from: h  reason: collision with root package name */
    public int f3154h;
    public g i;

    public enum a {
        RELAXED,
        STRICT
    }

    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: d.e.a.h.c$c  reason: collision with other inner class name */
    public enum EnumC0096c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, EnumC0096c cVar) {
        a aVar = a.RELAXED;
        this.f3154h = 0;
        this.b = dVar;
        this.f3149c = cVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4.b.Q > 0) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r10 != d.e.a.h.c.EnumC0096c.k) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if (r10 != d.e.a.h.c.EnumC0096c.k) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008b, code lost:
        if (r10 != d.e.a.h.c.EnumC0096c.j) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0090 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(d.e.a.h.c r5, int r6, int r7, d.e.a.h.c.b r8, int r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.c.a(d.e.a.h.c, int, int, d.e.a.h.c$b, int, boolean):boolean");
    }

    public boolean b() {
        return this.f3150d != null;
    }

    public void c() {
        this.f3150d = null;
        this.f3151e = 0;
        this.f3152f = -1;
        this.f3153g = b.STRONG;
        this.f3154h = 0;
        a aVar = a.RELAXED;
        this.f3148a.e();
    }

    public void d() {
        g gVar = this.i;
        if (gVar == null) {
            this.i = new g(g.a.UNRESTRICTED);
        } else {
            gVar.a();
        }
    }

    public String toString() {
        return this.b.Z + ":" + this.f3149c.toString();
    }

    public int a() {
        c cVar;
        if (this.b.Y == 8) {
            return 0;
        }
        int i2 = this.f3152f;
        if (i2 <= -1 || (cVar = this.f3150d) == null || cVar.b.Y != 8) {
            return this.f3151e;
        }
        return i2;
    }
}

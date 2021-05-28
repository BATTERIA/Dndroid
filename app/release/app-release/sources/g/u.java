package g;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static t f5471a;
    public static long b;

    public static t a() {
        synchronized (u.class) {
            if (f5471a == null) {
                return new t();
            }
            t tVar = f5471a;
            f5471a = tVar.f5469f;
            tVar.f5469f = null;
            b -= 8192;
            return tVar;
        }
    }

    public static void a(t tVar) {
        if (tVar.f5469f != null || tVar.f5470g != null) {
            throw new IllegalArgumentException();
        } else if (!tVar.f5467d) {
            synchronized (u.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    tVar.f5469f = f5471a;
                    tVar.f5466c = 0;
                    tVar.b = 0;
                    f5471a = tVar;
                }
            }
        }
    }
}

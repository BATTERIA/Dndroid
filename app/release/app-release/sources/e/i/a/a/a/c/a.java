package e.i.a.a.a.c;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4885c = new a(0, false);

    /* renamed from: d  reason: collision with root package name */
    public static final a f4886d = new a(1, true);

    /* renamed from: e  reason: collision with root package name */
    public static final a f4887e = new a(2, false);

    /* renamed from: f  reason: collision with root package name */
    public static final a f4888f = new a(3, true);

    /* renamed from: g  reason: collision with root package name */
    public static final a f4889g = new a(4, false);

    /* renamed from: h  reason: collision with root package name */
    public static final a f4890h = new a(5, true);
    public static final a i = new a(6, false);
    public static final a j = new a(7, true);
    public static final a k = new a(8, false);
    public static final a l = new a(9, true);
    public static final a m = new a(10, false);
    public static final a n;
    public static final a[] o;

    /* renamed from: a  reason: collision with root package name */
    public final int f4891a;
    public final boolean b;

    static {
        a aVar = new a(10, true);
        n = aVar;
        o = new a[]{f4885c, f4886d, f4887e, f4888f, f4889g, f4890h, i, j, k, l, m, aVar};
    }

    public a(int i2, boolean z) {
        this.f4891a = i2;
        this.b = z;
    }

    public boolean a(a aVar) {
        return this.f4891a < aVar.f4891a || ((!this.b || l == this) && this.f4891a == aVar.f4891a);
    }
}

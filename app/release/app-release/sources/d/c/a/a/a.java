package d.c.a.a;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f3043c;

    /* renamed from: a  reason: collision with root package name */
    public c f3044a;
    public c b;

    public a() {
        b bVar = new b();
        this.b = bVar;
        this.f3044a = bVar;
    }

    public static a b() {
        if (f3043c != null) {
            return f3043c;
        }
        synchronized (a.class) {
            if (f3043c == null) {
                f3043c = new a();
            }
        }
        return f3043c;
    }

    @Override // d.c.a.a.c
    public boolean a() {
        return this.f3044a.a();
    }
}

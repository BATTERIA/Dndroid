package d.g.k;

public class c<T> extends b<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f3329c = new Object();

    public c(int i) {
        super(i);
    }

    @Override // d.g.k.b
    public T a() {
        T t;
        synchronized (this.f3329c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // d.g.k.b
    public boolean a(T t) {
        boolean a2;
        synchronized (this.f3329c) {
            a2 = super.a(t);
        }
        return a2;
    }
}

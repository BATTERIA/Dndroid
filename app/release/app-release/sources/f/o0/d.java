package f.o0;

public abstract class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final String f5082c;

    public d(String str, Object... objArr) {
        this.f5082c = e.a(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f5082c);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

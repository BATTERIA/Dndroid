package f;

import f.o0.e;
import g.g;
import java.io.Closeable;

public abstract class j0 implements Closeable {
    public static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.a(l());
    }

    public abstract a0 k();

    public abstract g l();
}

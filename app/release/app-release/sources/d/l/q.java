package d.l;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f3567a = new HashMap();

    public <T> T a(String str) {
        T t;
        Map<String, Object> map = this.f3567a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f3567a.get(str);
        }
        return t;
    }

    public final void a() {
        Map<String, Object> map = this.f3567a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f3567a.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
        }
        b();
    }

    public void b() {
    }
}

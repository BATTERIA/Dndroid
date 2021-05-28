package e.d.a.s;

import java.util.LinkedHashMap;
import java.util.Map;

public class e<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<T, Y> f4274a = new LinkedHashMap<>(100, 0.75f, true);
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f4275c = 0;

    public e(int i) {
        this.b = i;
    }

    public int a(Y y) {
        return 1;
    }

    public void a(int i) {
        while (this.f4275c > i) {
            Map.Entry<T, Y> next = this.f4274a.entrySet().iterator().next();
            Y value = next.getValue();
            this.f4275c -= a(value);
            T key = next.getKey();
            this.f4274a.remove(key);
            a(key, value);
        }
    }

    public void a(T t, Y y) {
    }

    public Y b(T t, Y y) {
        if (a(y) >= this.b) {
            a(t, y);
            return null;
        }
        Y put = this.f4274a.put(t, y);
        if (y != null) {
            this.f4275c = a(y) + this.f4275c;
        }
        if (put != null) {
            this.f4275c -= a(put);
        }
        a(this.b);
        return put;
    }
}

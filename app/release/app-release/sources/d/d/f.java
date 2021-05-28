package d.d;

import java.util.LinkedHashMap;
import java.util.Locale;

public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f3076a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3077c;

    /* renamed from: d  reason: collision with root package name */
    public int f3078d;

    /* renamed from: e  reason: collision with root package name */
    public int f3079e;

    /* renamed from: f  reason: collision with root package name */
    public int f3080f;

    /* renamed from: g  reason: collision with root package name */
    public int f3081g;

    public f(int i) {
        if (i > 0) {
            this.f3077c = i;
            this.f3076a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f3076a.get(k);
                if (v != null) {
                    this.f3080f++;
                    return v;
                }
                this.f3081g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3078d++;
            this.b++;
            put = this.f3076a.put(k, v);
            if (put != null) {
                this.b--;
            }
        }
        a(this.f3077c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r3) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: d.d.f.a(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f3080f + this.f3081g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f3077c), Integer.valueOf(this.f3080f), Integer.valueOf(this.f3081g), Integer.valueOf(i != 0 ? (this.f3080f * 100) / i : 0));
    }
}

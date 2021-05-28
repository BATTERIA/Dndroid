package d.g.k;

public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3328a;
    public int b;

    public b(int i) {
        if (i > 0) {
            this.f3328a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3328a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    public boolean a(T t) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.b) {
                z = false;
                break;
            } else if (this.f3328a[i] == t) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            int i2 = this.b;
            Object[] objArr = this.f3328a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.b = i2 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}

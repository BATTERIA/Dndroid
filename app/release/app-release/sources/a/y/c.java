package a.y;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final c f2159f = new c(1, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final c f2160g = null;

    public c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // a.y.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.f2152c == cVar.f2152c && this.f2153d == cVar.f2153d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.y.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2152c * 31) + this.f2153d;
    }

    @Override // a.y.a
    public boolean isEmpty() {
        return this.f2152c > this.f2153d;
    }

    @Override // a.y.a
    public String toString() {
        return this.f2152c + ".." + this.f2153d;
    }
}

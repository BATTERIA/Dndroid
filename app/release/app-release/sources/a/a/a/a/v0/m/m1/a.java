package a.a.a.a.v0.m.m1;

import a.w.c.i;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f1927a;
    public final T b;

    public a(T t, T t2) {
        this.f1927a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f1927a, aVar.f1927a) && i.a(this.b, aVar.b);
    }

    public int hashCode() {
        T t = this.f1927a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("ApproximationBounds(lower=");
        a2.append((Object) this.f1927a);
        a2.append(", upper=");
        a2.append((Object) this.b);
        a2.append(")");
        return a2.toString();
    }
}

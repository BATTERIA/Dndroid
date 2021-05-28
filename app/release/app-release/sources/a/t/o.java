package a.t;

import a.w.c.i;
import e.a.a.a.a;

public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2122a;
    public final T b;

    public o(int i, T t) {
        this.f2122a = i;
        this.b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2122a == oVar.f2122a && i.a(this.b, oVar.b);
    }

    public int hashCode() {
        int i = this.f2122a * 31;
        T t = this.b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a2 = a.a("IndexedValue(index=");
        a2.append(this.f2122a);
        a2.append(", value=");
        a2.append((Object) this.b);
        a2.append(")");
        return a2.toString();
    }
}

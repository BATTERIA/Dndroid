package a;

import a.w.c.i;
import java.io.Serializable;

public final class j<A, B> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public final A f2088c;

    /* renamed from: d  reason: collision with root package name */
    public final B f2089d;

    public j(A a2, B b) {
        this.f2088c = a2;
        this.f2089d = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.f2088c, jVar.f2088c) && i.a(this.f2089d, jVar.f2089d);
    }

    public int hashCode() {
        A a2 = this.f2088c;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b = this.f2089d;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + ((Object) this.f2088c) + ", " + ((Object) this.f2089d) + ')';
    }
}

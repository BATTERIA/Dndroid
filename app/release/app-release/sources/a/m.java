package a;

import a.w.c.i;
import java.io.Serializable;

public final class m<A, B, C> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public final A f2096c;

    /* renamed from: d  reason: collision with root package name */
    public final B f2097d;

    /* renamed from: e  reason: collision with root package name */
    public final C f2098e;

    public m(A a2, B b, C c2) {
        this.f2096c = a2;
        this.f2097d = b;
        this.f2098e = c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.a(this.f2096c, mVar.f2096c) && i.a(this.f2097d, mVar.f2097d) && i.a(this.f2098e, mVar.f2098e);
    }

    public int hashCode() {
        A a2 = this.f2096c;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b = this.f2097d;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c2 = this.f2098e;
        if (c2 != null) {
            i = c2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + ((Object) this.f2096c) + ", " + ((Object) this.f2097d) + ", " + ((Object) this.f2098e) + ')';
    }
}

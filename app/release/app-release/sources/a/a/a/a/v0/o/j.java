package a.a.a.a.v0.o;

import a.w.c.i;
import e.a.a.a.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f2004a;
    public final int b;

    public j(String str, int i) {
        if (str != null) {
            this.f2004a = str;
            this.b = i;
            return;
        }
        i.a("number");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.f2004a, jVar.f2004a) && this.b == jVar.b;
    }

    public int hashCode() {
        String str = this.f2004a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder a2 = a.a("NumberWithRadix(number=");
        a2.append(this.f2004a);
        a2.append(", radix=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

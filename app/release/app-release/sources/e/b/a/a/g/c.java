package e.b.a.a.g;

import a.w.c.i;
import e.a.a.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3757a;
    public final int b;

    public c(String str, int i) {
        if (str != null) {
            this.f3757a = str;
            this.b = i;
            return;
        }
        i.a("text");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f3757a, cVar.f3757a) && this.b == cVar.b;
    }

    public int hashCode() {
        String str = this.f3757a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder a2 = a.a("Data(text=");
        a2.append(this.f3757a);
        a2.append(", id=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

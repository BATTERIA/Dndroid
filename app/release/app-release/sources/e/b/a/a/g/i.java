package e.b.a.a.g;

import e.a.a.a.a;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f3763a;

    public i(String str) {
        if (str != null) {
            this.f3763a = str;
        } else {
            a.w.c.i.a("title");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && a.w.c.i.a(this.f3763a, ((i) obj).f3763a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3763a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.a(a.a("PagerData(title="), this.f3763a, ")");
    }
}

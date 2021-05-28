package a.w.c;

import a.a.b;
import a.a.f;
import e.a.a.a.a;

public class h extends b implements g, f {
    public h(int i) {
    }

    public h(int i, Object obj) {
        super(obj);
    }

    @Override // a.w.c.b
    public b b() {
        return s.f2149a.a(this);
    }

    @Override // a.w.c.b
    public b e() {
        return (f) super.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c() != null ? c().equals(hVar.c()) : hVar.c() == null) {
                if (!d().equals(hVar.d()) || !f().equals(hVar.f()) || !i.a(this.f2133d, hVar.f2133d)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof f) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return f().hashCode() + ((d().hashCode() + (c() == null ? 0 : c().hashCode() * 31)) * 31);
    }

    public String toString() {
        b a2 = a();
        if (a2 != this) {
            return a2.toString();
        }
        if ("<init>".equals(d())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder a3 = a.a("function ");
        a3.append(d());
        a3.append(" (Kotlin reflection is not available)");
        return a3.toString();
    }
}

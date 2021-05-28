package a.w.c;

import a.a.b;
import a.a.l;
import e.a.a.a.a;

public abstract class q extends b implements l {
    @Override // a.w.c.b
    public l e() {
        return (l) super.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (!c().equals(qVar.c()) || !d().equals(qVar.d()) || !f().equals(qVar.f()) || !i.a(this.f2133d, qVar.f2133d)) {
                return false;
            }
            return true;
        } else if (obj instanceof l) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = d().hashCode();
        return f().hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public String toString() {
        b a2 = a();
        if (a2 != this) {
            return a2.toString();
        }
        StringBuilder a3 = a.a("property ");
        a3.append(d());
        a3.append(" (Kotlin reflection is not available)");
        return a3.toString();
    }
}

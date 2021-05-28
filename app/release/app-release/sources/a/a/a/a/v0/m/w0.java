package a.a.a.a.v0.m;

public abstract class w0 implements v0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return b() == v0Var.b() && a() == v0Var.a() && c().equals(v0Var.c());
    }

    public int hashCode() {
        int hashCode = a().hashCode() * 31;
        if (c1.g(c())) {
            return hashCode + 19;
        }
        return hashCode + (b() ? 17 : c().hashCode());
    }

    public String toString() {
        if (b()) {
            return "*";
        }
        if (a() == g1.INVARIANT) {
            return c().toString();
        }
        return a() + " " + c();
    }
}

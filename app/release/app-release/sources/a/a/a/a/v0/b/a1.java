package a.a.a.a.v0.b;

import a.a.a.a.v0.j.w.o.e;
import a.w.c.i;

public abstract class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f301a;
    public final boolean b;

    public a1(String str, boolean z) {
        if (str != null) {
            this.f301a = str;
            this.b = z;
            return;
        }
        i.a("name");
        throw null;
    }

    public Integer a(a1 a1Var) {
        if (a1Var != null) {
            return z0.b(this, a1Var);
        }
        i.a("visibility");
        throw null;
    }

    public String a() {
        return this.f301a;
    }

    public abstract boolean a(e eVar, o oVar, k kVar);

    public a1 b() {
        return this;
    }

    public final String toString() {
        return a();
    }
}

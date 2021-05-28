package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.a;
import a.a.a.a.v0.m.i1.o;
import a.a.a.a.v0.m.k1.g;
import a.w.c.f;
import a.w.c.i;
import java.util.List;

public abstract class d0 implements a, g {

    /* renamed from: c  reason: collision with root package name */
    public int f1826c;

    public d0() {
    }

    public /* synthetic */ d0(f fVar) {
    }

    public abstract List<v0> H0();

    public abstract s0 I0();

    public abstract boolean J0();

    public abstract f1 K0();

    public abstract d0 a(a.a.a.a.v0.m.i1.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (J0() == d0Var.J0()) {
            f1 K0 = K0();
            f1 K02 = d0Var.K0();
            if (K0 == null) {
                i.a("a");
                throw null;
            } else if (K02 == null) {
                i.a("b");
                throw null;
            } else if (d.a(o.f1893a, K0, K02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f1826c;
        if (i2 != 0) {
            return i2;
        }
        if (e.f.a.g.f(this)) {
            i = super.hashCode();
        } else {
            int hashCode = H0().hashCode();
            i = (J0() ? 1 : 0) + ((hashCode + (I0().hashCode() * 31)) * 31);
        }
        this.f1826c = i;
        return i;
    }

    public abstract a.a.a.a.v0.j.w.i u();
}

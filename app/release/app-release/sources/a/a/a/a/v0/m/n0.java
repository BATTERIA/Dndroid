package a.a.a.a.v0.m;

import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class n0 {
    public static final f1 a(f1 f1Var) {
        if (f1Var != null) {
            f1 a2 = p.a(f1Var);
            if (a2 == null) {
                a2 = a((d0) f1Var);
            }
            return a2 != null ? a2 : f1Var.a(false);
        }
        i.a("$this$makeDefinitelyNotNullOrNotNull");
        throw null;
    }

    public static final k0 a(d0 d0Var) {
        s0 I0 = d0Var.I0();
        if (!(I0 instanceof b0)) {
            I0 = null;
        }
        b0 b0Var = (b0) I0;
        if (b0Var != null) {
            LinkedHashSet<d0> linkedHashSet = b0Var.f1820a;
            ArrayList arrayList = new ArrayList(g.a(linkedHashSet, 10));
            boolean z = false;
            for (T t : linkedHashSet) {
                if (c1.c(t)) {
                    z = true;
                    t = (T) a(t.K0());
                }
                arrayList.add(t);
            }
            b0 b0Var2 = !z ? null : new b0(arrayList);
            if (b0Var2 != null) {
                return b0Var2.f();
            }
        }
        return null;
    }

    public static final k0 a(k0 k0Var, k0 k0Var2) {
        if (k0Var == null) {
            i.a("$this$withAbbreviation");
            throw null;
        } else if (k0Var2 != null) {
            return g.f(k0Var) ? k0Var : new a(k0Var, k0Var2);
        } else {
            i.a("abbreviatedType");
            throw null;
        }
    }
}

package a.a.a.a.v0.e.x0;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.n0;
import a.a.a.a.v0.h.v;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<g0> f1248a;

    public e(n0 n0Var) {
        if (n0Var != null) {
            List<g0> list = n0Var.f1123e;
            int i = 0;
            if ((n0Var.f1122d & 1) == 1) {
                int i2 = n0Var.f1124f;
                List<g0> list2 = n0Var.f1123e;
                i.a((Object) list2, "typeTable.typeList");
                ArrayList arrayList = new ArrayList(g.a((Iterable) list2, 10));
                for (T t : list2) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        T t2 = t;
                        if (i >= i2) {
                            if (t2 != null) {
                                g0.c a2 = g0.a((g0) t2);
                                a2.f1053f |= 2;
                                a2.f1055h = true;
                                t2 = a2.i();
                                if (!t2.g()) {
                                    throw new v();
                                }
                            } else {
                                throw null;
                            }
                        }
                        arrayList.add(t2);
                        i = i3;
                    } else {
                        g.d();
                        throw null;
                    }
                }
                list = arrayList;
            } else {
                i.a((Object) list, "originalTypes");
            }
            this.f1248a = list;
            return;
        }
        i.a("typeTable");
        throw null;
    }

    public final g0 a(int i) {
        return this.f1248a.get(i);
    }
}

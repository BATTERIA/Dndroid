package a.a.a.a.v0.e.x0;

import a.a.a.a.v0.e.r0;
import a.a.a.a.v0.e.t0;
import a.t.l;
import a.w.c.f;
import a.w.c.i;
import java.util.List;

public final class g {
    public static final g b = new g(l.f2119c);

    /* renamed from: c  reason: collision with root package name */
    public static final a f1257c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<r0> f1258a;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }

        public final g a(t0 t0Var) {
            if (t0Var == null) {
                i.a("table");
                throw null;
            } else if (t0Var.f1192d.size() == 0) {
                return g.b;
            } else {
                List<r0> list = t0Var.f1192d;
                i.a((Object) list, "table.requirementList");
                return new g(list, null);
            }
        }
    }

    public g(List<r0> list) {
        this.f1258a = list;
    }

    public /* synthetic */ g(List list, f fVar) {
        this.f1258a = list;
    }
}

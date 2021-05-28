package a.a.a.a.v0.m;

import a.a.a.a.v0.b.r0;
import a.n;
import a.w.c.f;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class u0 extends y0 {
    public static final a b = new a(null);

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }

        public final y0 a(d0 d0Var) {
            if (d0Var != null) {
                return a(d0Var.I0(), d0Var.H0());
            }
            i.a("kotlinType");
            throw null;
        }

        public final y0 a(s0 s0Var, List<? extends v0> list) {
            if (s0Var == null) {
                i.a("typeConstructor");
                throw null;
            } else if (list != null) {
                List<r0> d2 = s0Var.d();
                i.a((Object) d2, "typeConstructor.parameters");
                r0 r0Var = (r0) a.t.f.d((List) d2);
                if (r0Var != null ? r0Var.o0() : false) {
                    List<r0> d3 = s0Var.d();
                    i.a((Object) d3, "typeConstructor.parameters");
                    ArrayList arrayList = new ArrayList(g.a((Iterable) d3, 10));
                    for (T t : d3) {
                        i.a((Object) t, "it");
                        arrayList.add(t.n());
                    }
                    return a(this, a.t.f.h(a.t.f.a((Iterable) arrayList, (Iterable) list)), false, 2);
                }
                Object[] array = d2.toArray(new r0[0]);
                if (array != null) {
                    r0[] r0VarArr = (r0[]) array;
                    Object[] array2 = list.toArray(new v0[0]);
                    if (array2 != null) {
                        return new a0(r0VarArr, (v0[]) array2, false);
                    }
                    throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new n("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                i.a("arguments");
                throw null;
            }
        }

        public static /* synthetic */ u0 a(a aVar, Map map, boolean z, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            if (aVar == null) {
                throw null;
            } else if (map != null) {
                return new t0(map, z);
            } else {
                i.a("map");
                throw null;
            }
        }
    }

    @Override // a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        if (d0Var != null) {
            return a(d0Var.I0());
        }
        i.a("key");
        throw null;
    }

    public abstract v0 a(s0 s0Var);
}

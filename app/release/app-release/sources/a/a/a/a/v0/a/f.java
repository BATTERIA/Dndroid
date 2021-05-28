package a.a.a.a.v0.a;

import a.a.a.a.v0.a.o.a;
import a.a.a.a.v0.a.o.b;
import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.b1.j;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.y;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.l1.a;
import a.a.a.a.v0.m.v0;
import a.s;
import a.t.m;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class f {
    public static final k0 a(g gVar, h hVar, d0 d0Var, List<? extends d0> list, List<d> list2, d0 d0Var2, boolean z) {
        e eVar;
        h hVar2;
        d dVar;
        if (gVar == null) {
            i.a("builtIns");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (list == null) {
            i.a("parameterTypes");
            throw null;
        } else if (d0Var2 != null) {
            int i = 0;
            ArrayList arrayList = new ArrayList(list.size() + (d0Var != null ? 1 : 0) + 1);
            a.a(arrayList, d0Var != null ? a.b(d0Var) : null);
            for (T t : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    T t2 = t;
                    if (list2 == null || (dVar = list2.get(i)) == null || dVar.f1352d) {
                        dVar = null;
                    }
                    if (dVar != null) {
                        b bVar = g.k.x;
                        i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
                        d b = d.b("name");
                        String a2 = dVar.a();
                        i.a((Object) a2, "name.asString()");
                        Map singletonMap = Collections.singletonMap(b, new y(a2));
                        i.a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
                        t2 = a.a((d0) t2, h.b.a(a.t.f.b(t2.y(), new j(gVar, bVar, singletonMap))));
                    }
                    arrayList.add(a.b(t2));
                    i = i2;
                } else {
                    g.d();
                    throw null;
                }
            }
            arrayList.add(a.b(d0Var2));
            int size = list.size();
            if (d0Var != null) {
                size++;
            }
            if (z) {
                eVar = gVar.a(size);
            } else {
                eVar = gVar.a(g.c(size));
            }
            i.a((Object) eVar, "if (suspendFunction) bui…tFunction(parameterCount)");
            if (d0Var != null) {
                b bVar2 = g.k.w;
                i.a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                if (hVar.a(bVar2) == null) {
                    h.a aVar = h.b;
                    b bVar3 = g.k.w;
                    i.a((Object) bVar3, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                    hVar2 = aVar.a(a.t.f.b(hVar, new j(gVar, bVar3, m.f2120c)));
                    return e0.a(hVar2, eVar, arrayList);
                }
            }
            hVar2 = hVar;
            return e0.a(hVar2, eVar, arrayList);
        } else {
            i.a("returnType");
            throw null;
        }
    }

    public static final d0 b(d0 d0Var) {
        if (d0Var != null) {
            boolean e2 = e(d0Var);
            if (s.f2103a && !e2) {
                throw new AssertionError("Not a function type: " + d0Var);
            } else if (g(d0Var)) {
                return ((v0) a.t.f.a((List) d0Var.H0())).c();
            } else {
                return null;
            }
        } else {
            i.a("$this$getReceiverTypeFromFunctionType");
            throw null;
        }
    }

    public static final d0 c(d0 d0Var) {
        if (d0Var != null) {
            boolean e2 = e(d0Var);
            if (!s.f2103a || e2) {
                d0 c2 = ((v0) a.t.f.c((List) d0Var.H0())).c();
                i.a((Object) c2, "arguments.last().type");
                return c2;
            }
            throw new AssertionError("Not a function type: " + d0Var);
        }
        i.a("$this$getReturnTypeFromFunctionType");
        throw null;
    }

    public static final List<v0> d(d0 d0Var) {
        if (d0Var != null) {
            boolean e2 = e(d0Var);
            if (!s.f2103a || e2) {
                List<v0> H0 = d0Var.H0();
                boolean z = false;
                int i = (!e(d0Var) || !g(d0Var)) ? 0 : 1;
                int size = H0.size() - 1;
                if (i <= size) {
                    z = true;
                }
                if (!s.f2103a || z) {
                    return H0.subList(i, size);
                }
                throw new AssertionError("Not an exact function type: " + d0Var);
            }
            throw new AssertionError("Not a function type: " + d0Var);
        }
        i.a("$this$getValueParameterTypesFromFunctionType");
        throw null;
    }

    public static final boolean e(d0 d0Var) {
        b.c cVar = null;
        if (d0Var != null) {
            a.a.a.a.v0.b.h c2 = d0Var.I0().c();
            if (c2 != null) {
                cVar = a(c2);
            }
            return cVar == b.c.Function || cVar == b.c.SuspendFunction;
        }
        i.a("$this$isBuiltinFunctionalType");
        throw null;
    }

    public static final boolean f(d0 d0Var) {
        b.c cVar = null;
        if (d0Var != null) {
            a.a.a.a.v0.b.h c2 = d0Var.I0().c();
            if (c2 != null) {
                cVar = a(c2);
            }
            return cVar == b.c.SuspendFunction;
        }
        i.a("$this$isSuspendFunctionType");
        throw null;
    }

    public static final boolean g(d0 d0Var) {
        h y = d0Var.y();
        a.a.a.a.v0.f.b bVar = g.k.w;
        i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return y.a(bVar) != null;
    }

    public static final d a(d0 d0Var) {
        T t;
        if (d0Var != null) {
            h y = d0Var.y();
            a.a.a.a.v0.f.b bVar = g.k.x;
            i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
            c a2 = y.a(bVar);
            if (a2 != null) {
                Object f2 = a.t.f.f(a2.a().values());
                if (!(f2 instanceof y)) {
                    f2 = null;
                }
                y yVar = (y) f2;
                if (!(yVar == null || (t = yVar.f1578a) == null)) {
                    if (!d.c(t)) {
                        t = null;
                    }
                    if (t != null) {
                        return d.b(t);
                    }
                }
            }
            return null;
        }
        i.a("$this$extractParameterNameFromFunctionTypeArgument");
        throw null;
    }

    public static final b.c a(k kVar) {
        if (kVar == null) {
            i.a("$this$getFunctionalClassKind");
            throw null;
        } else if (!(kVar instanceof e) || !g.e(kVar)) {
            return null;
        } else {
            a.a.a.a.v0.f.c d2 = a.a.a.a.v0.j.u.a.d(kVar);
            if (!d2.d() || d2.c()) {
                return null;
            }
            a.C0012a aVar = a.a.a.a.v0.a.o.a.f233c;
            String a2 = d2.f().a();
            i.a((Object) a2, "shortName().asString()");
            a.a.a.a.v0.f.b c2 = d2.g().c();
            i.a((Object) c2, "toSafe().parent()");
            a.b a3 = aVar.a(a2, c2);
            if (a3 != null) {
                return a3.f235a;
            }
            return null;
        }
    }
}

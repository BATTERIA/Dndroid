package a.a.a.a.v0.a;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.c0;
import a.a.a.a.v0.b.d1.n0;
import a.a.a.a.v0.b.d1.p;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.g;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.l1.a;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.s;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f224a;
    public static final c0 b;

    static {
        w a2 = a.a.a.a.v0.m.w.a();
        i.a((Object) a2, "ErrorUtils.getErrorModule()");
        b bVar = g.f1541d;
        i.a((Object) bVar, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        c0 c0Var = new c0(new p(a2, bVar), f.INTERFACE, false, false, g.f1542e.d(), m0.f491a, a.a.a.a.v0.l.b.f1789e);
        v vVar = v.ABSTRACT;
        if (vVar != null) {
            c0Var.l = vVar;
            a1 a1Var = z0.f515e;
            if (a1Var != null) {
                c0Var.m = a1Var;
                if (h.b != null) {
                    c0Var.a(e.f.a.g.c(n0.a(c0Var, h.a.f321a, false, g1.IN_VARIANCE, d.b("T"), 0, a.a.a.a.v0.l.b.f1789e)));
                    c0Var.U();
                    f224a = c0Var;
                    w a3 = a.a.a.a.v0.m.w.a();
                    i.a((Object) a3, "ErrorUtils.getErrorModule()");
                    b bVar2 = g.f1540c;
                    i.a((Object) bVar2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
                    c0 c0Var2 = new c0(new p(a3, bVar2), f.INTERFACE, false, false, g.f1543f.d(), m0.f491a, a.a.a.a.v0.l.b.f1789e);
                    v vVar2 = v.ABSTRACT;
                    if (vVar2 != null) {
                        c0Var2.l = vVar2;
                        a1 a1Var2 = z0.f515e;
                        if (a1Var2 != null) {
                            c0Var2.m = a1Var2;
                            if (h.b != null) {
                                c0Var2.a(e.f.a.g.c(n0.a(c0Var2, h.a.f321a, false, g1.IN_VARIANCE, d.b("T"), 0, a.a.a.a.v0.l.b.f1789e)));
                                c0Var2.U();
                                b = c0Var2;
                                return;
                            }
                            throw null;
                        }
                        c0.a(9);
                        throw null;
                    }
                    c0.a(6);
                    throw null;
                }
                throw null;
            }
            c0.a(9);
            throw null;
        }
        c0.a(6);
        throw null;
    }

    public static final k0 a(d0 d0Var, boolean z) {
        if (d0Var != null) {
            boolean f2 = f.f(d0Var);
            if (!s.f2103a || f2) {
                g c2 = a.c(d0Var);
                h y = d0Var.y();
                d0 b2 = f.b(d0Var);
                List<v0> d2 = f.d(d0Var);
                ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) d2, 10));
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
                if (h.b != null) {
                    h hVar = h.a.f321a;
                    s0 n = (z ? b : f224a).n();
                    i.a((Object) n, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
                    List a2 = a.t.f.a((Collection) arrayList, (Object) e0.a(hVar, n, e.f.a.g.c(a.b(f.c(d0Var))), false, (a.a.a.a.v0.m.i1.f) null, 16));
                    k0 g2 = a.c(d0Var).g();
                    i.a((Object) g2, "suspendFunType.builtIns.nullableAnyType");
                    return f.a(c2, y, b2, a2, null, g2, false).a(d0Var.J0());
                }
                throw null;
            }
            throw new AssertionError("This type should be suspend function type: " + d0Var);
        }
        i.a("suspendFunType");
        throw null;
    }

    public static final boolean a(b bVar, boolean z) {
        return i.a(bVar, z ? g.f1543f : g.f1542e);
    }
}

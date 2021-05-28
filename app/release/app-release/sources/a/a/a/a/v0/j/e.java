package a.a.a.a.v0.j;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.u;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.j.l;
import a.a.a.a.v0.m.i1.f;
import a.t.f;
import a.w.b.p;
import a.w.c.i;
import java.util.Collection;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1538a = new e();

    public final m0 a(a aVar) {
        while (aVar instanceof b) {
            b bVar = (b) aVar;
            if (bVar.t() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends b> f2 = bVar.f();
            i.a((Object) f2, "overriddenDescriptors");
            aVar = (b) f.f(f2);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.r();
    }

    public final boolean a(k kVar, k kVar2, p<? super k, ? super k, Boolean> pVar, boolean z) {
        k b = kVar.b();
        k b2 = kVar2.b();
        return ((b instanceof b) || (b2 instanceof b)) ? pVar.a(b, b2).booleanValue() : a(b, b2, z);
    }

    public final boolean a(k kVar, k kVar2, boolean z) {
        if ((kVar instanceof a.a.a.a.v0.b.e) && (kVar2 instanceof a.a.a.a.v0.b.e)) {
            return i.a(((a.a.a.a.v0.b.e) kVar).n(), ((a.a.a.a.v0.b.e) kVar2).n());
        }
        if ((kVar instanceof r0) && (kVar2 instanceof r0)) {
            return a((r0) kVar, (r0) kVar2, z, d.f1537c);
        }
        if (!(kVar instanceof a) || !(kVar2 instanceof a)) {
            boolean z2 = kVar instanceof y;
            a.a.a.a.v0.f.b bVar = kVar;
            a.a.a.a.v0.f.b bVar2 = kVar2;
            if (z2) {
                boolean z3 = kVar2 instanceof y;
                bVar = kVar;
                bVar2 = kVar2;
                if (z3) {
                    bVar = ((y) kVar).e();
                    bVar2 = ((y) kVar2).e();
                }
            }
            return i.a(bVar, bVar2);
        }
        a aVar = (a) kVar;
        a aVar2 = (a) kVar2;
        if (aVar == null) {
            i.a("a");
            throw null;
        } else if (aVar2 != null) {
            if (!i.a(aVar, aVar2)) {
                if (!(!i.a(aVar.d(), aVar2.d())) && ((!i.a(aVar.b(), aVar2.b()) || (z && !(!i.a(a(aVar), a(aVar2))) && (!(aVar instanceof u) || !(aVar2 instanceof u) || ((u) aVar).D() == ((u) aVar2).D()))) && !g.n(aVar) && !g.n(aVar2) && a(aVar, aVar2, a.f1533c, z))) {
                    l lVar = new l(new c(z, aVar, aVar2), f.a.f1873a);
                    i.a((Object) lVar, "OverridingUtil.createWit…= a && y == b }\n        }");
                    l.d a2 = lVar.a(aVar, aVar2, (a.a.a.a.v0.b.e) null, true);
                    i.a((Object) a2, "overridingUtil.isOverrid… null, !ignoreReturnType)");
                    if (a2.a() == l.d.a.OVERRIDABLE) {
                        l.d a3 = lVar.a(aVar2, aVar, (a.a.a.a.v0.b.e) null, true);
                        i.a((Object) a3, "overridingUtil.isOverrid… null, !ignoreReturnType)");
                        if (a3.a() == l.d.a.OVERRIDABLE) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        } else {
            i.a("b");
            throw null;
        }
    }

    public final boolean a(r0 r0Var, r0 r0Var2, boolean z, p<? super k, ? super k, Boolean> pVar) {
        if (i.a(r0Var, r0Var2)) {
            return true;
        }
        return !i.a(r0Var.b(), r0Var2.b()) && a(r0Var, r0Var2, pVar, z) && r0Var.z() == r0Var2.z();
    }
}

package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.y.l;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.w;
import a.a.a.a.v0.m.x0;
import a.a.a.a.v0.m.y0;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;

public final class h extends y0 {
    public static final a b = g.a(l.COMMON, false, (r0) null, 3).a(b.FLEXIBLE_LOWER_BOUND);

    /* renamed from: c  reason: collision with root package name */
    public static final a f668c = g.a(l.COMMON, false, (r0) null, 3).a(b.FLEXIBLE_UPPER_BOUND);

    /* renamed from: d  reason: collision with root package name */
    public static final h f669d = new h();

    public static final class a extends j implements a.w.b.l<f, k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e f670c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k0 f671d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f672e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, k0 k0Var, a aVar) {
            super(1);
            this.f670c = eVar;
            this.f671d = k0Var;
            this.f672e = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public k0 a(f fVar) {
            if (fVar != null) {
                e eVar = this.f670c;
                if (!(eVar instanceof e)) {
                    eVar = null;
                }
                if (eVar != null) {
                    a.a.a.a.v0.j.u.a.a((a.a.a.a.v0.b.h) eVar);
                }
                return null;
            }
            i.a("kotlinTypeRefiner");
            throw null;
        }
    }

    public final v0 a(r0 r0Var, a aVar, d0 d0Var) {
        if (r0Var == null) {
            i.a("parameter");
            throw null;
        } else if (aVar == null) {
            i.a("attr");
            throw null;
        } else if (d0Var != null) {
            int ordinal = aVar.b.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (!r0Var.F().f1858d) {
                    return new x0(g1.INVARIANT, a.a.a.a.v0.j.u.a.b(r0Var).f());
                }
                List<r0> d2 = d0Var.I0().d();
                i.a((Object) d2, "erasedUpperBound.constructor.parameters");
                return d2.isEmpty() ^ true ? new x0(g1.OUT_VARIANCE, d0Var) : g.a(r0Var, aVar);
            } else if (ordinal == 2) {
                return new x0(g1.INVARIANT, d0Var);
            } else {
                throw new a.h();
            }
        } else {
            i.a("erasedUpperBound");
            throw null;
        }
    }

    public final d0 b(d0 d0Var) {
        a.a.a.a.v0.b.h c2 = d0Var.I0().c();
        if (c2 instanceof r0) {
            return b(g.a((r0) c2, (r0) null, (a.w.b.a) null, 3));
        }
        if (c2 instanceof e) {
            a.a.a.a.v0.b.h c3 = g.m(d0Var).I0().c();
            if (c3 instanceof e) {
                a.j<k0, Boolean> a2 = a(g.i(d0Var), (e) c2, b);
                A a3 = a2.f2088c;
                boolean booleanValue = a2.f2089d.booleanValue();
                a.j<k0, Boolean> a4 = a(g.m(d0Var), (e) c3, f668c);
                A a5 = a4.f2088c;
                return (booleanValue || a4.f2089d.booleanValue()) ? new i(a3, a5) : e0.a(a3, a5);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class " + "but \"" + c3 + "\" while for lower it's \"" + c2 + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + c2).toString());
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean d() {
        return false;
    }

    public final a.j<k0, Boolean> a(k0 k0Var, e eVar, a aVar) {
        if (k0Var.I0().d().isEmpty()) {
            return new a.j<>(k0Var, false);
        }
        if (a.a.a.a.v0.a.g.c(k0Var)) {
            v0 v0Var = k0Var.H0().get(0);
            g1 a2 = v0Var.a();
            d0 c2 = v0Var.c();
            i.a((Object) c2, "componentTypeProjection.type");
            return new a.j<>(e0.a(k0Var.y(), k0Var.I0(), g.c(new x0(a2, b(c2))), k0Var.J0(), (f) null, 16), false);
        } else if (g.f(k0Var)) {
            StringBuilder a3 = e.a.a.a.a.a("Raw error type: ");
            a3.append(k0Var.I0());
            return new a.j<>(w.b(a3.toString()), false);
        } else {
            a.a.a.a.v0.j.w.i a4 = eVar.a(f669d);
            i.a((Object) a4, "declaration.getMemberScope(RawSubstitution)");
            a.a.a.a.v0.b.b1.h y = k0Var.y();
            s0 n = eVar.n();
            i.a((Object) n, "declaration.typeConstructor");
            s0 n2 = eVar.n();
            i.a((Object) n2, "declaration.typeConstructor");
            List<r0> d2 = n2.d();
            i.a((Object) d2, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(g.a((Iterable) d2, 10));
            for (T t : d2) {
                h hVar = f669d;
                i.a((Object) t, "parameter");
                arrayList.add(hVar.a(t, aVar, g.a(t, (r0) null, (a.w.b.a) null, 3)));
            }
            return new a.j<>(e0.a(y, n, arrayList, k0Var.J0(), a4, new a(eVar, k0Var, aVar)), true);
        }
    }

    @Override // a.a.a.a.v0.m.y0
    public v0 a(d0 d0Var) {
        if (d0Var != null) {
            return new x0(b(d0Var));
        }
        i.a("key");
        throw null;
    }
}

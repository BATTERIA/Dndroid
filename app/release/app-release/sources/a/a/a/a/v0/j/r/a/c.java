package a.a.a.a.v0.j.r.a;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.j;
import a.a.a.a.v0.m.v0;
import a.s;
import a.t.l;
import a.w.c.i;
import e.a.a.a.a;
import e.f.a.g;
import java.util.Collection;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public j f1574a;
    public final v0 b;

    public c(v0 v0Var) {
        if (v0Var != null) {
            this.b = v0Var;
            boolean z = v0Var.a() != g1.INVARIANT;
            if (s.f2103a && !z) {
                StringBuilder a2 = a.a("Only nontrivial projections can be captured, not: ");
                a2.append(this.b);
                throw new AssertionError(a2.toString());
            }
            return;
        }
        i.a("projection");
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public boolean a() {
        return false;
    }

    @Override // a.a.a.a.v0.m.s0
    public Collection<d0> b() {
        d0 c2 = this.b.a() == g1.OUT_VARIANCE ? this.b.c() : m().g();
        i.a((Object) c2, "if (projection.projectio… builtIns.nullableAnyType");
        return g.c((Object) c2);
    }

    @Override // a.a.a.a.v0.m.s0
    public h c() {
        return null;
    }

    @Override // a.a.a.a.v0.m.s0
    public List<r0> d() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.j.r.a.b
    public v0 e() {
        return this.b;
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.a.g m() {
        a.a.a.a.v0.a.g m = this.b.c().I0().m();
        i.a((Object) m, "projection.type.constructor.builtIns");
        return m;
    }

    public String toString() {
        StringBuilder a2 = a.a("CapturedTypeConstructor(");
        a2.append(this.b);
        a2.append(')');
        return a2.toString();
    }
}

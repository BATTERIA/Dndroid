package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.y.l;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.p0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.x0;
import a.n;
import a.t.f;
import a.w.b.a;
import a.w.c.i;
import java.util.List;

public final class g {

    /* renamed from: a */
    public static final b f667a = new b("java.lang.Class");

    public static final d0 a(r0 r0Var, r0 r0Var2, a<? extends d0> aVar) {
        if (r0Var == null) {
            i.a("$this$getErasedUpperBound");
            throw null;
        } else if (aVar == null) {
            i.a("defaultValue");
            throw null;
        } else if (r0Var == r0Var2) {
            return (d0) aVar.a();
        } else {
            List<d0> upperBounds = r0Var.getUpperBounds();
            i.a((Object) upperBounds, "upperBounds");
            d0 d0Var = (d0) f.a((List) upperBounds);
            if (d0Var.I0().c() instanceof e) {
                i.a((Object) d0Var, "firstUpperBound");
                return a.a.a.a.v0.m.l1.a.e(d0Var);
            }
            if (r0Var2 != null) {
                r0Var = r0Var2;
            }
            h c2 = d0Var.I0().c();
            if (c2 != null) {
                do {
                    r0 r0Var3 = (r0) c2;
                    if (!(!i.a(r0Var3, r0Var))) {
                        return (d0) aVar.a();
                    }
                    List<d0> upperBounds2 = r0Var3.getUpperBounds();
                    i.a((Object) upperBounds2, "current.upperBounds");
                    d0 d0Var2 = (d0) f.a((List) upperBounds2);
                    if (d0Var2.I0().c() instanceof e) {
                        i.a((Object) d0Var2, "nextUpperBound");
                        return a.a.a.a.v0.m.l1.a.e(d0Var2);
                    }
                    c2 = d0Var2.I0().c();
                } while (c2 != null);
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    public static /* synthetic */ d0 a(r0 r0Var, r0 r0Var2, a aVar, int i) {
        if ((i & 1) != 0) {
            r0Var2 = null;
        }
        if ((i & 2) != 0) {
            aVar = new f(r0Var);
        }
        return a(r0Var, r0Var2, aVar);
    }

    public static final v0 a(r0 r0Var, a aVar) {
        if (r0Var == null) {
            i.a("typeParameter");
            throw null;
        } else if (aVar != null) {
            return aVar.f654a == l.SUPERTYPE ? new x0(e.f.a.g.a(r0Var)) : new p0(r0Var);
        } else {
            i.a("attr");
            throw null;
        }
    }

    public static /* synthetic */ a a(l lVar, boolean z, r0 r0Var, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            r0Var = null;
        }
        if (lVar != null) {
            return new a(lVar, b.INFLEXIBLE, z, r0Var);
        }
        i.a("$this$toAttributes");
        throw null;
    }
}

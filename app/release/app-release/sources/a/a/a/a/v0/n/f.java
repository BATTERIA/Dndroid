package a.a.a.a.v0.n;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.j;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.j.u.a;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.p0;
import a.a.a.a.v0.m.s0;
import a.w.c.i;
import java.util.List;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final f f1970a = new f();

    @Override // a.a.a.a.v0.n.b
    public String a() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // a.a.a.a.v0.n.b
    public String a(s sVar) {
        if (sVar == null) {
            i.a("functionDescriptor");
            throw null;
        } else if (!b(sVar)) {
            return a();
        } else {
            return null;
        }
    }

    @Override // a.a.a.a.v0.n.b
    public boolean b(s sVar) {
        k0 k0Var = null;
        if (sVar != null) {
            w0 w0Var = sVar.j().get(1);
            j.b bVar = j.f215e;
            i.a((Object) w0Var, "secondParameter");
            w e2 = a.e(w0Var);
            if (bVar == null) {
                throw null;
            } else if (e2 != null) {
                a.a.a.a.v0.f.a aVar = g.k.Y;
                i.a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.kProperty");
                e a2 = e.f.a.g.a(e2, aVar);
                if (a2 != null) {
                    if (h.b != null) {
                        h hVar = h.a.f321a;
                        s0 n = a2.n();
                        i.a((Object) n, "kPropertyClass.typeConstructor");
                        List<r0> d2 = n.d();
                        i.a((Object) d2, "kPropertyClass.typeConstructor.parameters");
                        Object e3 = a.t.f.e((List) d2);
                        i.a(e3, "kPropertyClass.typeConstructor.parameters.single()");
                        k0Var = e0.a(hVar, a2, e.f.a.g.c(new p0((r0) e3)));
                    } else {
                        throw null;
                    }
                }
                if (k0Var == null) {
                    return false;
                }
                d0 c2 = w0Var.c();
                i.a((Object) c2, "secondParameter.type");
                d0 e4 = c1.e(c2);
                i.a((Object) e4, "TypeUtils.makeNotNullable(this)");
                return a.a.a.a.v0.m.l1.a.a(k0Var, e4);
            } else {
                i.a("module");
                throw null;
            }
        } else {
            i.a("functionDescriptor");
            throw null;
        }
    }
}

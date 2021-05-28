package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.s0;
import a.w.c.i;
import java.util.Collection;

public abstract class f {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1873a = new a();

        @Override // a.a.a.a.v0.m.i1.f
        public h a(k kVar) {
            if (kVar != null) {
                return null;
            }
            i.a("descriptor");
            throw null;
        }

        @Override // a.a.a.a.v0.m.i1.f
        public Collection<d0> a(e eVar) {
            if (eVar != null) {
                s0 n = eVar.n();
                i.a((Object) n, "classDescriptor.typeConstructor");
                Collection<d0> b = n.b();
                i.a((Object) b, "classDescriptor.typeConstructor.supertypes");
                return b;
            }
            i.a("classDescriptor");
            throw null;
        }

        @Override // a.a.a.a.v0.m.i1.f
        public d0 a(d0 d0Var) {
            if (d0Var != null) {
                return d0Var;
            }
            i.a("type");
            throw null;
        }
    }

    public abstract h a(k kVar);

    public abstract d0 a(d0 d0Var);

    public abstract Collection<d0> a(e eVar);
}

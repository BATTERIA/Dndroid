package a.a.a.a.v0.d.b;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.k.b.q;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.w;
import a.w.c.i;

public final class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final f f909a = new f();

    @Override // a.a.a.a.v0.k.b.q
    public d0 a(g0 g0Var, String str, k0 k0Var, k0 k0Var2) {
        if (g0Var == null) {
            i.a("proto");
            throw null;
        } else if (str == null) {
            i.a("flexibleId");
            throw null;
        } else if (k0Var == null) {
            i.a("lowerBound");
            throw null;
        } else if (k0Var2 == null) {
            i.a("upperBound");
            throw null;
        } else if (!(!i.a((Object) str, (Object) "kotlin.jvm.PlatformType"))) {
            return g0Var.b(a.f1264g) ? new a.a.a.a.v0.d.a.a0.o.i(k0Var, k0Var2) : e0.a(k0Var, k0Var2);
        } else {
            k0 b = w.b("Error java flexible type with id: " + str + ". (" + k0Var + ".." + k0Var2 + ')');
            i.a((Object) b, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return b;
        }
    }
}

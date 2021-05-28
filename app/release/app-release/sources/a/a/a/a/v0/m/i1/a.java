package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k1.h;
import a.n;
import a.w.c.i;

public final class a extends g.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1865a;
    public final /* synthetic */ a1 b;

    public a(c cVar, a1 a1Var) {
        this.f1865a = cVar;
        this.b = a1Var;
    }

    @Override // a.a.a.a.v0.m.g.b
    public h a(g gVar, a.a.a.a.v0.m.k1.g gVar2) {
        if (gVar == null) {
            i.a("context");
            throw null;
        } else if (gVar2 != null) {
            c cVar = this.f1865a;
            a1 a1Var = this.b;
            h b2 = cVar.b(gVar2);
            if (b2 != null) {
                d0 a2 = a1Var.a((d0) b2, g1.INVARIANT);
                i.a((Object) a2, "substitutor.safeSubstitu…ANT\n                    )");
                h a3 = cVar.a(a2);
                if (a3 != null) {
                    return a3;
                }
                i.a();
                throw null;
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        } else {
            i.a("type");
            throw null;
        }
    }
}

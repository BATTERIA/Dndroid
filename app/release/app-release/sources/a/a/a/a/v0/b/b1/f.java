package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class f extends j implements l<w, k0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f316c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f316c = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public k0 a(w wVar) {
        w wVar2 = wVar;
        if (wVar2 != null) {
            k0 a2 = wVar2.m().a(g1.INVARIANT, this.f316c.i());
            i.a((Object) a2, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return a2;
        }
        i.a("module");
        throw null;
    }
}

package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.d.a.a0.c;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.a0.n.e;
import a.a.a.a.v0.d.a.y.g;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;

public final class n extends j implements a<e> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f292c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.a.a.a.v0.b.e f293d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e eVar, a.a.a.a.v0.b.e eVar2) {
        super(0);
        this.f292c = eVar;
        this.f293d = eVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public e a() {
        e eVar = this.f292c;
        g gVar = g.f853a;
        i.a((Object) gVar, "JavaResolverCache.EMPTY");
        a.a.a.a.v0.b.e eVar2 = this.f293d;
        h hVar = eVar.j;
        c cVar = hVar.f562c;
        h hVar2 = new h(new c(cVar.f545a, cVar.b, cVar.f546c, cVar.f547d, cVar.f548e, cVar.f549f, gVar, cVar.f551h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o, cVar.p, cVar.q, cVar.r, cVar.s, cVar.t, cVar.u), hVar.f563d, hVar.f564e);
        k b = eVar.b();
        i.a((Object) b, "containingDeclaration");
        return new e(hVar2, b, eVar.w, eVar2);
    }
}

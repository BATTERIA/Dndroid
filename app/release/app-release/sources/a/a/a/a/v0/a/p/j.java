package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.c.a.c;
import a.a.a.a.v0.d.b.k;
import a.a.a.a.v0.k.b.a;
import a.a.a.a.v0.k.b.d;
import a.a.a.a.v0.k.b.i;
import a.a.a.a.v0.k.b.m;
import a.a.a.a.v0.k.b.p;
import a.a.a.a.v0.k.b.q;
import a.a.a.a.v0.k.b.t;
import a.a.a.a.v0.m.i1.l;
import a.w.c.i;
import e.f.a.g;
import java.util.List;

public final class j extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a.a.a.a.v0.l.j jVar, k kVar, w wVar, x xVar, a.a.a.a.v0.b.c1.a aVar, c cVar, a.a.a.a.v0.k.b.k kVar2, l lVar) {
        super(jVar, kVar, wVar);
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (kVar == null) {
            i.a("finder");
            throw null;
        } else if (wVar == null) {
            i.a("moduleDescriptor");
            throw null;
        } else if (xVar == null) {
            i.a("notFoundClasses");
            throw null;
        } else if (aVar == null) {
            i.a("additionalClassPartsProvider");
            throw null;
        } else if (cVar == null) {
            i.a("platformDependentDeclarationFilter");
            throw null;
        } else if (kVar2 == null) {
            i.a("deserializationConfiguration");
            throw null;
        } else if (lVar != null) {
            m mVar = new m(this);
            d dVar = new d(wVar, xVar, a.a.a.a.v0.k.b.e0.a.m);
            t.a aVar2 = t.a.f1755a;
            p pVar = p.f1750a;
            i.a((Object) pVar, "ErrorReporter.DO_NOTHING");
            c.a aVar3 = c.a.f519a;
            q.a aVar4 = q.a.f1751a;
            List g2 = g.g(new a.a.a.a.v0.a.o.a(jVar, wVar), new e(jVar, wVar, null, 4));
            if (a.a.a.a.v0.k.b.i.f1729a != null) {
                this.f1646a = new a.a.a.a.v0.k.b.j(jVar, wVar, kVar2, mVar, dVar, this, aVar2, pVar, aVar3, aVar4, g2, xVar, i.a.f1730a, aVar, cVar, a.a.a.a.v0.k.b.e0.a.m.f1639a, lVar);
                return;
            }
            throw null;
        } else {
            a.w.c.i.a("kotlinTypeChecker");
            throw null;
        }
    }
}

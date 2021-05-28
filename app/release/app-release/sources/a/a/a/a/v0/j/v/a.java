package a.a.a.a.v0.j.v;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.c.a.d;
import a.a.a.a.v0.d.a.a0.g;
import a.a.a.a.v0.d.a.a0.n.j;
import a.a.a.a.v0.d.a.c0.a0;
import a.a.a.a.v0.d.a.y.g;
import a.a.a.a.v0.f.b;
import a.t.f;
import a.w.c.i;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final g f1601a;
    public final a.a.a.a.v0.d.a.y.g b;

    public a(g gVar, a.a.a.a.v0.d.a.y.g gVar2) {
        if (gVar == null) {
            i.a("packageFragmentProvider");
            throw null;
        } else if (gVar2 != null) {
            this.f1601a = gVar;
            this.b = gVar2;
        } else {
            i.a("javaResolverCache");
            throw null;
        }
    }

    public final e a(a.a.a.a.v0.d.a.c0.g gVar) {
        e eVar = null;
        if (gVar != null) {
            b e2 = gVar.e();
            if (e2 == null || gVar.Q() != a0.SOURCE) {
                a.a.a.a.v0.d.a.c0.g n = gVar.n();
                if (n != null) {
                    e a2 = a(n);
                    a.a.a.a.v0.j.w.i T = a2 != null ? a2.T() : null;
                    h b2 = T != null ? T.b(gVar.d(), d.k) : null;
                    if (b2 instanceof e) {
                        eVar = b2;
                    }
                    return eVar;
                } else if (e2 == null) {
                    return null;
                } else {
                    g gVar2 = this.f1601a;
                    b c2 = e2.c();
                    i.a((Object) c2, "fqName.parent()");
                    a.a.a.a.v0.d.a.a0.n.i iVar = (a.a.a.a.v0.d.a.a0.n.i) f.b((List) gVar2.a(c2));
                    if (iVar == null) {
                        return null;
                    }
                    j jVar = iVar.j.b;
                    if (jVar != null) {
                        return jVar.a(gVar.d(), gVar);
                    }
                    throw null;
                }
            } else if (((g.a) this.b) != null) {
                return null;
            } else {
                throw null;
            }
        } else {
            i.a("javaClass");
            throw null;
        }
    }
}

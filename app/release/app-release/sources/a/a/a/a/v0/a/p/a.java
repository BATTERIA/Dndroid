package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.j0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.e;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.t.l;
import a.w.c.i;
import e.f.a.g;
import java.util.List;

public final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    public static final d f247e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f248f = null;

    static {
        d b = d.b("clone");
        i.a((Object) b, "Name.identifier(\"clone\")");
        f247e = b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(j jVar, a.a.a.a.v0.b.e eVar) {
        super(jVar, eVar);
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (eVar != null) {
        } else {
            i.a("containingClass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.e
    public List<s> c() {
        a.a.a.a.v0.b.e eVar = this.f1621c;
        if (h.b != null) {
            j0 a2 = j0.a(eVar, h.a.f321a, f247e, b.a.DECLARATION, m0.f491a);
            i0 G0 = this.f1621c.G0();
            l lVar = l.f2119c;
            a2.a((i0) null, G0, (List<? extends r0>) lVar, (List<w0>) lVar, (d0) a.a.a.a.v0.j.u.a.b((k) this.f1621c).b(), v.OPEN, z0.f513c);
            return g.c((Object) a2);
        }
        throw null;
    }
}

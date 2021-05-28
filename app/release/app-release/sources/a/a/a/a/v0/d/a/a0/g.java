package a.a.a.a.v0.d.a.a0;

import a.a.a.a.v0.b.z;
import a.a.a.a.v0.d.a.a0.m;
import a.a.a.a.v0.d.a.a0.n.i;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.l.b;
import a.c;
import a.w.b.l;
import a.w.c.j;
import java.util.Collection;
import java.util.List;

public final class g implements z {

    /* renamed from: a  reason: collision with root package name */
    public final h f558a;
    public final a.a.a.a.v0.l.a<b, i> b;

    public static final class a extends j implements a.w.b.a<i> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f559c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ t f560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, t tVar) {
            super(0);
            this.f559c = gVar;
            this.f560d = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public i a() {
            return new i(this.f559c.f558a, this.f560d);
        }
    }

    public g(c cVar) {
        if (cVar != null) {
            h hVar = new h(cVar, m.a.f572a, new c(null));
            this.f558a = hVar;
            this.b = hVar.f562c.f545a.a();
            return;
        }
        a.w.c.i.a("components");
        throw null;
    }

    @Override // a.a.a.a.v0.b.z
    public List<i> a(b bVar) {
        if (bVar != null) {
            return e.f.a.g.d(b(bVar));
        }
        a.w.c.i.a("fqName");
        throw null;
    }

    public final i b(b bVar) {
        t a2 = this.f558a.f562c.b.a(bVar);
        if (a2 == null) {
            return null;
        }
        return (i) ((b.d) this.b).a((Object) bVar, (a.w.b.a) new a(this, a2));
    }

    @Override // a.a.a.a.v0.b.z
    public Collection a(a.a.a.a.v0.f.b bVar, l lVar) {
        List list = null;
        if (bVar == null) {
            a.w.c.i.a("fqName");
            throw null;
        } else if (lVar != null) {
            i b2 = b(bVar);
            if (b2 != null) {
                list = (List) b2.k.a();
            }
            return list != null ? list : a.t.l.f2119c;
        } else {
            a.w.c.i.a("nameFilter");
            throw null;
        }
    }
}

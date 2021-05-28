package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.k.b.e0.c;
import a.a.a.a.v0.l.e;
import a.a.a.a.v0.l.j;
import a.t.n;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

public abstract class a implements z {

    /* renamed from: a  reason: collision with root package name */
    public j f1646a;
    public final e<b, y> b;

    /* renamed from: c  reason: collision with root package name */
    public final j f1647c;

    /* renamed from: d  reason: collision with root package name */
    public final s f1648d;

    /* renamed from: e  reason: collision with root package name */
    public final w f1649e;

    /* renamed from: a.a.a.a.v0.k.b.a$a  reason: collision with other inner class name */
    public static final class C0066a extends a.w.c.j implements l<b, n> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f1650c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0066a(a aVar) {
            super(1);
            this.f1650c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public n a(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                a.a.a.a.v0.a.p.j jVar = (a.a.a.a.v0.a.p.j) this.f1650c;
                InputStream a2 = jVar.f1648d.a(bVar2);
                c a3 = a2 != null ? c.a(bVar2, jVar.f1647c, jVar.f1649e, a2, false) : null;
                if (a3 == null) {
                    return null;
                }
                j jVar2 = this.f1650c.f1646a;
                if (jVar2 != null) {
                    a3.a(jVar2);
                    return a3;
                }
                i.b("components");
                throw null;
            }
            i.a("fqName");
            throw null;
        }
    }

    public a(j jVar, s sVar, w wVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (sVar == null) {
            i.a("finder");
            throw null;
        } else if (wVar != null) {
            this.f1647c = jVar;
            this.f1648d = sVar;
            this.f1649e = wVar;
            this.b = jVar.b(new C0066a(this));
        } else {
            i.a("moduleDescriptor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.z
    public List<y> a(b bVar) {
        if (bVar != null) {
            return g.d(this.b.a(bVar));
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.z
    public Collection<b> a(b bVar, l<? super d, Boolean> lVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (lVar != null) {
            return n.f2121c;
        } else {
            i.a("nameFilter");
            throw null;
        }
    }
}

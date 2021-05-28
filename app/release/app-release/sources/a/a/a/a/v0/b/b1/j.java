package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.e;
import a.f;
import a.w.c.i;
import java.util.Map;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e f323a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final b f324c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<d, a.a.a.a.v0.j.s.g<?>> f325d;

    public static final class a extends a.w.c.j implements a.w.b.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f326c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(0);
            this.f326c = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            j jVar = this.f326c;
            a.a.a.a.v0.b.e a2 = jVar.b.a(jVar.f324c);
            i.a((Object) a2, "builtIns.getBuiltInClassByFqName(fqName)");
            return a2.v();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<a.a.a.a.v0.f.d, ? extends a.a.a.a.v0.j.s.g<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(g gVar, b bVar, Map<d, ? extends a.a.a.a.v0.j.s.g<?>> map) {
        if (gVar == null) {
            i.a("builtIns");
            throw null;
        } else if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (map != 0) {
            this.b = gVar;
            this.f324c = bVar;
            this.f325d = map;
            this.f323a = e.f.a.g.a(f.PUBLICATION, (a.w.b.a) new a(this));
        } else {
            i.a("allValueArguments");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.c
    public Map<d, a.a.a.a.v0.j.s.g<?>> a() {
        return this.f325d;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public d0 c() {
        return (d0) this.f323a.getValue();
    }

    @Override // a.a.a.a.v0.b.b1.c
    public b e() {
        return this.f324c;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public m0 r() {
        m0 m0Var = m0.f491a;
        i.a((Object) m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }
}

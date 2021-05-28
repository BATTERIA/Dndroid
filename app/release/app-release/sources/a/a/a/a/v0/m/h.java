package a.a.a.a.v0.m;

import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.l.g;
import a.q;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.Collection;
import java.util.List;

public abstract class h implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final g<a> f1859a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public List<? extends d0> f1860a;
        public final Collection<d0> b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.m.d0> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends d0> collection) {
            if (collection != 0) {
                this.b = collection;
                this.f1860a = e.f.a.g.c((Object) w.f1951c);
                return;
            }
            i.a("allSupertypes");
            throw null;
        }
    }

    public static final class b extends j implements a.w.b.a<a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f1861c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(0);
            this.f1861c = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public a a() {
            return new a(this.f1861c.f());
        }
    }

    public static final class c extends j implements l<Boolean, a> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f1862c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a a(Boolean bool) {
            bool.booleanValue();
            return new a(e.f.a.g.c((Object) w.f1951c));
        }
    }

    public static final class d extends j implements l<a, q> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f1863c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h hVar) {
            super(1);
            this.f1863c = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public q a(a aVar) {
            a aVar2 = aVar;
            if (aVar2 != null) {
                Collection<d0> a2 = this.f1863c.h().a(this.f1863c, aVar2.b, new k(this), new l(this));
                if (a2.isEmpty()) {
                    d0 g2 = this.f1863c.g();
                    a2 = g2 != null ? e.f.a.g.c((Object) g2) : null;
                    if (a2 == null) {
                        a2 = a.t.l.f2119c;
                    }
                }
                this.f1863c.h().a(this.f1863c, a2, new i(this), new j(this));
                List<? extends d0> list = (List) (!(a2 instanceof List) ? null : a2);
                if (list == null) {
                    list = f.g(a2);
                }
                if (list != null) {
                    aVar2.f1860a = list;
                    return q.f2100a;
                }
                i.a("<set-?>");
                throw null;
            }
            i.a("supertypes");
            throw null;
        }
    }

    public h(a.a.a.a.v0.l.j jVar) {
        if (jVar != null) {
            this.f1859a = jVar.a(new b(this), c.f1862c, new d(this));
        } else {
            i.a("storageManager");
            throw null;
        }
    }

    public static final /* synthetic */ Collection a(h hVar, s0 s0Var, boolean z) {
        h hVar2 = null;
        if (hVar != null) {
            if (s0Var instanceof h) {
                hVar2 = s0Var;
            }
            h hVar3 = hVar2;
            if (hVar3 != null) {
                return f.a((Collection) ((a) hVar3.f1859a.a()).b, (Iterable) hVar3.a(z));
            }
            Collection<d0> b2 = s0Var.b();
            i.a((Object) b2, "supertypes");
            return b2;
        }
        throw null;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends a.a.a.a.v0.m.d0>, java.util.List<a.a.a.a.v0.m.d0> */
    @Override // a.a.a.a.v0.m.s0
    public List<d0> b() {
        return ((a) this.f1859a.a()).f1860a;
    }

    public abstract Collection<d0> f();

    public d0 g() {
        return null;
    }

    public abstract p0 h();

    public Collection<d0> a(boolean z) {
        return a.t.l.f2119c;
    }

    public void a(d0 d0Var) {
        if (d0Var == null) {
            i.a("type");
            throw null;
        }
    }
}

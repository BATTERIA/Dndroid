package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.d.a.a0.n.b;
import a.a.a.a.v0.d.a.c0.a0;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.j.w.d;
import a.a.a.a.v0.l.e;
import a.a.a.a.v0.l.h;
import a.t.n;
import a.w.b.l;
import a.w.c.f;
import a.w.c.i;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public final class j extends r {
    public final h<Set<String>> m;
    public final e<a, a.a.a.a.v0.b.e> n;
    public final t o;
    public final i p;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.f.d f615a;
        public final g b;

        public a(a.a.a.a.v0.f.d dVar, g gVar) {
            if (dVar != null) {
                this.f615a = dVar;
                this.b = gVar;
                return;
            }
            i.a("name");
            throw null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.f615a, ((a) obj).f615a);
        }

        public int hashCode() {
            return this.f615a.hashCode();
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final a.a.a.a.v0.b.e f616a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(a.a.a.a.v0.b.e eVar) {
                super(null);
                if (eVar != null) {
                    this.f616a = eVar;
                    return;
                }
                i.a("descriptor");
                throw null;
            }
        }

        /* renamed from: a.a.a.a.v0.d.a.a0.n.j$b$b  reason: collision with other inner class name */
        public static final class C0026b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0026b f617a = new C0026b();

            public C0026b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f618a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(f fVar) {
        }
    }

    public static final class c extends a.w.c.j implements l<a, a.a.a.a.v0.b.e> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f619c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.d.a.a0.h f620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, a.a.a.a.v0.d.a.a0.h hVar) {
            super(1);
            this.f619c = jVar;
            this.f620d = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
        @Override // a.w.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a.a.a.a.v0.b.e a(a.a.a.a.v0.d.a.a0.n.j.a r8) {
            /*
            // Method dump skipped, instructions count: 377
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.n.j.c.a(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends a.w.c.j implements a.w.b.a<Set<? extends String>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f621c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.d.a.a0.h f622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar, a.a.a.a.v0.d.a.a0.h hVar) {
            super(0);
            this.f621c = jVar;
            this.f622d = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Set<? extends String> a() {
            return this.f622d.f562c.b.b(this.f621c.p.f366g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a.a.a.a.v0.d.a.a0.h hVar, t tVar, i iVar) {
        super(hVar);
        if (hVar == null) {
            i.a("c");
            throw null;
        } else if (tVar == null) {
            i.a("jPackage");
            throw null;
        } else if (iVar != null) {
            this.o = tVar;
            this.p = iVar;
            this.m = hVar.f562c.f545a.c(new d(this, hVar));
            this.n = hVar.f562c.f545a.b(new c(this, hVar));
        } else {
            i.a("ownerDescriptor");
            throw null;
        }
    }

    public final a.a.a.a.v0.b.e a(a.a.a.a.v0.f.d dVar, g gVar) {
        if (!a.a.a.a.v0.f.f.a(dVar)) {
            return null;
        }
        Set set = (Set) this.m.a();
        if (gVar != null || set == null || set.contains(dVar.a())) {
            return this.n.a(new a(dVar, gVar));
        }
        return null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public void a(Collection<l0> collection, a.a.a.a.v0.f.d dVar) {
        if (collection == null) {
            i.a("result");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<a.a.a.a.v0.f.d> b(a.a.a.a.v0.j.w.d dVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar != null) {
            d.a aVar = a.a.a.a.v0.j.w.d.u;
            if (!dVar.a(a.a.a.a.v0.j.w.d.f1613d)) {
                return n.f2121c;
            }
            Set<String> set = (Set) this.m.a();
            if (set != null) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    hashSet.add(a.a.a.a.v0.f.d.b(str));
                }
                return hashSet;
            }
            t tVar = this.o;
            if (lVar == null) {
                lVar = a.a.a.a.v0.o.g.f1996a;
            }
            Collection<g> a2 = tVar.a(lVar);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : a2) {
                a.a.a.a.v0.f.d d2 = t.Q() == a0.SOURCE ? null : t.d();
                if (d2 != null) {
                    linkedHashSet.add(d2);
                }
            }
            return linkedHashSet;
        }
        i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public b c() {
        return b.a.f578a;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<a.a.a.a.v0.f.d> c(a.a.a.a.v0.j.w.d dVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar != null) {
            return n.f2121c;
        }
        i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<a.a.a.a.v0.f.d> d(a.a.a.a.v0.j.w.d dVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar != null) {
            return n.f2121c;
        }
        i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public k e() {
        return this.p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0028 A[SYNTHETIC] */
    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.d.a.a0.n.k, a.a.a.a.v0.j.w.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<a.a.a.a.v0.b.k> a(a.a.a.a.v0.j.w.d r5, a.w.b.l<? super a.a.a.a.v0.f.d, java.lang.Boolean> r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.n.j.a(a.a.a.a.v0.j.w.d, a.w.b.l):java.util.Collection");
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i, a.a.a.a.v0.d.a.a0.n.k
    public Collection<f0> c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a.t.l.f2119c;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public a.a.a.a.v0.b.e b(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a(dVar, (g) null);
        } else {
            i.a("location");
            throw null;
        }
    }
}

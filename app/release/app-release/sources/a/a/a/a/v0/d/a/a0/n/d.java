package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.c0.m;
import a.a.a.a.v0.d.a.c0.o;
import a.a.a.a.v0.d.a.z.i;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.j.s.u;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.l.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.v0;
import a.a.l;
import a.t.f;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements a.a.a.a.v0.b.b1.c, i {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ l[] f584h = {s.a(new p(s.a(d.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), s.a(new p(s.a(d.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), s.a(new p(s.a(d.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a  reason: collision with root package name */
    public final h f585a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.d.a.b0.a f586c;

    /* renamed from: d  reason: collision with root package name */
    public final g f587d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f588e;

    /* renamed from: f  reason: collision with root package name */
    public final a.a.a.a.v0.d.a.a0.h f589f;

    /* renamed from: g  reason: collision with root package name */
    public final a.a.a.a.v0.d.a.c0.a f590g;

    public static final class a extends j implements a.w.b.a<Map<a.a.a.a.v0.f.d, ? extends a.a.a.a.v0.j.s.g<?>>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f591c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(0);
            this.f591c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Map<a.a.a.a.v0.f.d, ? extends a.a.a.a.v0.j.s.g<?>> a() {
            Collection<a.a.a.a.v0.d.a.c0.b> J = this.f591c.f590g.J();
            ArrayList arrayList = new ArrayList();
            for (T t : J) {
                a.a.a.a.v0.f.d d2 = t.d();
                if (d2 == null) {
                    d2 = a.a.a.a.v0.d.a.s.b;
                }
                a.a.a.a.v0.j.s.g<?> a2 = this.f591c.a(t);
                a.j jVar = a2 != null ? new a.j(d2, a2) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return f.h(arrayList);
        }
    }

    public static final class b extends j implements a.w.b.a<a.a.a.a.v0.f.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f592c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.f592c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public a.a.a.a.v0.f.b a() {
            a.a.a.a.v0.f.a a2 = this.f592c.f590g.a();
            if (a2 != null) {
                return a2.a();
            }
            return null;
        }
    }

    public static final class c extends j implements a.w.b.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f593c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f593c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            a.a.a.a.v0.f.b e2 = this.f593c.e();
            if (e2 != null) {
                a.w.c.i.a((Object) e2, "fqName ?: return@createL…fqName: $javaAnnotation\")");
                e eVar = null;
                e a2 = a.a.a.a.v0.a.p.c.a(a.a.a.a.v0.a.p.c.m, e2, this.f593c.f589f.f562c.o.m(), null, 4);
                if (a2 != null) {
                    eVar = a2;
                } else {
                    a.a.a.a.v0.d.a.c0.g m = this.f593c.f590g.m();
                    if (m != null) {
                        eVar = this.f593c.f589f.f562c.k.a(m);
                    }
                }
                if (eVar == null) {
                    d dVar = this.f593c;
                    w wVar = dVar.f589f.f562c.o;
                    a.a.a.a.v0.f.a a3 = a.a.a.a.v0.f.a.a(e2);
                    a.w.c.i.a((Object) a3, "ClassId.topLevel(fqName)");
                    eVar = e.f.a.g.a(wVar, a3, dVar.f589f.f562c.f547d.a().m);
                }
                return eVar.v();
            }
            StringBuilder a4 = e.a.a.a.a.a("No fqName: ");
            a4.append(this.f593c.f590g);
            return a.a.a.a.v0.m.w.b(a4.toString());
        }
    }

    public d(a.a.a.a.v0.d.a.a0.h hVar, a.a.a.a.v0.d.a.c0.a aVar) {
        if (hVar == null) {
            a.w.c.i.a("c");
            throw null;
        } else if (aVar != null) {
            this.f589f = hVar;
            this.f590g = aVar;
            this.f585a = hVar.f562c.f545a.c(new b(this));
            this.b = this.f589f.f562c.f545a.a(new c(this));
            this.f586c = this.f589f.f562c.j.a(this.f590g);
            this.f587d = this.f589f.f562c.f545a.a(new a(this));
            this.f588e = this.f590g.f();
        } else {
            a.w.c.i.a("javaAnnotation");
            throw null;
        }
    }

    public final a.a.a.a.v0.j.s.g<?> a(a.a.a.a.v0.d.a.c0.b bVar) {
        a.a.a.a.v0.j.s.g<?> gVar;
        u uVar;
        d0 d0Var;
        if (bVar instanceof o) {
            return a.a.a.a.v0.j.s.i.a(((o) bVar).getValue());
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            a.a.a.a.v0.f.a c2 = mVar.c();
            a.a.a.a.v0.f.d a2 = mVar.a();
            if (c2 == null || a2 == null) {
                return null;
            }
            return new k(c2, a2);
        }
        if (bVar instanceof a.a.a.a.v0.d.a.c0.e) {
            a.a.a.a.v0.f.d d2 = bVar.d();
            if (d2 == null) {
                d2 = a.a.a.a.v0.d.a.s.b;
                a.w.c.i.a((Object) d2, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            List<a.a.a.a.v0.d.a.c0.b> b2 = ((a.a.a.a.v0.d.a.c0.e) bVar).b();
            k0 k0Var = (k0) e.f.a.g.a(this.b, f584h[1]);
            a.w.c.i.a((Object) k0Var, "type");
            if (e.f.a.g.f(k0Var)) {
                return null;
            }
            e b3 = a.a.a.a.v0.j.u.a.b(this);
            if (b3 != null) {
                w0 a3 = e.f.a.g.a(d2, b3);
                if (a3 == null || (d0Var = a3.c()) == null) {
                    d0Var = this.f589f.f562c.o.m().a(g1.INVARIANT, a.a.a.a.v0.m.w.b("Unknown array element type"));
                }
                a.w.c.i.a((Object) d0Var, "DescriptorResolverUtils.… type\")\n                )");
                ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) b2, 10));
                Iterator<T> it = b2.iterator();
                while (it.hasNext()) {
                    a.a.a.a.v0.j.s.g<?> a4 = a(it.next());
                    if (a4 == null) {
                        a4 = new a.a.a.a.v0.j.s.w();
                    }
                    arrayList.add(a4);
                }
                gVar = new a.a.a.a.v0.j.s.b(arrayList, new a.a.a.a.v0.j.s.h(d0Var));
            } else {
                a.w.c.i.a();
                throw null;
            }
        } else if (bVar instanceof a.a.a.a.v0.d.a.c0.c) {
            return new a.a.a.a.v0.j.s.a(new d(this.f589f, ((a.a.a.a.v0.d.a.c0.c) bVar).e()));
        } else {
            if (!(bVar instanceof a.a.a.a.v0.d.a.c0.h)) {
                return null;
            }
            d0 a5 = this.f589f.b.a(((a.a.a.a.v0.d.a.c0.h) bVar).f(), a.a.a.a.v0.d.a.a0.o.g.a(a.a.a.a.v0.d.a.y.l.COMMON, false, (r0) null, 3));
            if (a5 == null) {
                a.w.c.i.a("argumentType");
                throw null;
            } else if (e.f.a.g.f(a5)) {
                return null;
            } else {
                d0 d0Var2 = a5;
                int i = 0;
                while (a.a.a.a.v0.a.g.c(d0Var2)) {
                    d0Var2 = ((v0) f.e((List) d0Var2.H0())).c();
                    a.w.c.i.a((Object) d0Var2, "type.arguments.single().type");
                    i++;
                }
                a.a.a.a.v0.b.h c3 = d0Var2.I0().c();
                if (c3 instanceof e) {
                    if (a.a.a.a.v0.j.u.a.a(c3) != null) {
                        return uVar;
                    }
                    uVar = new u(new u.a.C0061a(a5));
                    return uVar;
                } else if (!(c3 instanceof r0)) {
                    return null;
                } else {
                    a.a.a.a.v0.f.a a6 = a.a.a.a.v0.f.a.a(a.a.a.a.v0.a.g.k.f198a.g());
                    a.w.c.i.a((Object) a6, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                    gVar = new u(a6, 0);
                }
            }
        }
        return gVar;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public Map<a.a.a.a.v0.f.d, a.a.a.a.v0.j.s.g<?>> a() {
        return (Map) e.f.a.g.a(this.f587d, f584h[2]);
    }

    @Override // a.a.a.a.v0.b.b1.c
    public d0 c() {
        return (k0) e.f.a.g.a(this.b, f584h[1]);
    }

    @Override // a.a.a.a.v0.b.b1.c
    public a.a.a.a.v0.f.b e() {
        h hVar = this.f585a;
        l lVar = f584h[0];
        if (hVar == null) {
            a.w.c.i.a("$this$getValue");
            throw null;
        } else if (lVar != null) {
            return (a.a.a.a.v0.f.b) hVar.a();
        } else {
            a.w.c.i.a("p");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.z.i
    public boolean f() {
        return this.f588e;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public m0 r() {
        return this.f586c;
    }

    public String toString() {
        return a.a.a.a.v0.i.c.a(a.a.a.a.v0.i.c.f1476a, this, null, 2, null);
    }
}

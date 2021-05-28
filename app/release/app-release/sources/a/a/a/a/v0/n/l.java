package a.a.a.a.v0.n;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.i;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.f;
import a.w.c.j;

public abstract class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1985a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final a.w.b.l<g, d0> f1986c;

    public static final class a extends l {

        /* renamed from: d  reason: collision with root package name */
        public static final a f1987d = new a();

        /* renamed from: a.a.a.a.v0.n.l$a$a  reason: collision with other inner class name */
        public static final class C0075a extends j implements a.w.b.l<g, k0> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0075a f1988c = new C0075a();

            public C0075a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public k0 a(g gVar) {
                g gVar2 = gVar;
                if (gVar2 != null) {
                    k0 b = gVar2.b(i.BOOLEAN);
                    if (b != null) {
                        a.w.c.i.a((Object) b, "booleanType");
                        return b;
                    }
                    g.b(62);
                    throw null;
                }
                a.w.c.i.a("$receiver");
                throw null;
            }
        }

        public a() {
            super("Boolean", C0075a.f1988c, null);
        }
    }

    public static final class b extends l {

        /* renamed from: d  reason: collision with root package name */
        public static final b f1989d = new b();

        public static final class a extends j implements a.w.b.l<g, k0> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f1990c = new a();

            public a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public k0 a(g gVar) {
                g gVar2 = gVar;
                if (gVar2 != null) {
                    k0 e2 = gVar2.e();
                    a.w.c.i.a((Object) e2, "intType");
                    return e2;
                }
                a.w.c.i.a("$receiver");
                throw null;
            }
        }

        public b() {
            super("Int", a.f1990c, null);
        }
    }

    public static final class c extends l {

        /* renamed from: d  reason: collision with root package name */
        public static final c f1991d = new c();

        public static final class a extends j implements a.w.b.l<g, k0> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f1992c = new a();

            public a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public k0 a(g gVar) {
                g gVar2 = gVar;
                if (gVar2 != null) {
                    k0 j = gVar2.j();
                    a.w.c.i.a((Object) j, "unitType");
                    return j;
                }
                a.w.c.i.a("$receiver");
                throw null;
            }
        }

        public c() {
            super("Unit", a.f1992c, null);
        }
    }

    public /* synthetic */ l(String str, a.w.b.l lVar, f fVar) {
        this.b = str;
        this.f1986c = lVar;
        StringBuilder a2 = e.a.a.a.a.a("must return ");
        a2.append(this.b);
        this.f1985a = a2.toString();
    }

    @Override // a.a.a.a.v0.n.b
    public String a() {
        return this.f1985a;
    }

    @Override // a.a.a.a.v0.n.b
    public String a(s sVar) {
        if (sVar == null) {
            a.w.c.i.a("functionDescriptor");
            throw null;
        } else if (!b(sVar)) {
            return a();
        } else {
            return null;
        }
    }

    @Override // a.a.a.a.v0.n.b
    public boolean b(s sVar) {
        if (sVar != null) {
            return a.w.c.i.a(sVar.h(), this.f1986c.a(a.a.a.a.v0.j.u.a.b(sVar)));
        }
        a.w.c.i.a("functionDescriptor");
        throw null;
    }
}

package a.a.a.a.v0.m;

import a.a.a.a.v0.m.k1.h;
import a.a.a.a.v0.m.k1.k;
import a.a.a.a.v0.m.k1.n;
import a.a.a.a.v0.o.m;
import a.s;
import a.w.c.f;
import a.w.c.i;
import java.util.ArrayDeque;
import java.util.Set;

public abstract class g implements n {

    /* renamed from: a  reason: collision with root package name */
    public int f1840a;
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayDeque<h> f1841c;

    /* renamed from: d  reason: collision with root package name */
    public Set<h> f1842d;

    public enum a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    public static abstract class b {

        public static abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* renamed from: a.a.a.a.v0.m.g$b$b  reason: collision with other inner class name */
        public static final class C0071b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0071b f1847a = new C0071b();

            public C0071b() {
                super(null);
            }

            @Override // a.a.a.a.v0.m.g.b
            public h a(g gVar, a.a.a.a.v0.m.k1.g gVar2) {
                if (gVar == null) {
                    i.a("context");
                    throw null;
                } else if (gVar2 != null) {
                    return gVar.b(gVar2);
                } else {
                    i.a("type");
                    throw null;
                }
            }
        }

        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f1848a = new c();

            public c() {
                super(null);
            }

            @Override // a.a.a.a.v0.m.g.b
            public h a(g gVar, a.a.a.a.v0.m.k1.g gVar2) {
                if (gVar == null) {
                    i.a("context");
                    throw null;
                } else if (gVar2 != null) {
                    throw new UnsupportedOperationException("Should not be called");
                } else {
                    i.a("type");
                    throw null;
                }
            }
        }

        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f1849a = new d();

            public d() {
                super(null);
            }

            @Override // a.a.a.a.v0.m.g.b
            public h a(g gVar, a.a.a.a.v0.m.k1.g gVar2) {
                if (gVar == null) {
                    i.a("context");
                    throw null;
                } else if (gVar2 != null) {
                    return gVar.e(gVar2);
                } else {
                    i.a("type");
                    throw null;
                }
            }
        }

        public /* synthetic */ b(f fVar) {
        }

        public abstract h a(g gVar, a.a.a.a.v0.m.k1.g gVar2);
    }

    public Boolean a(a.a.a.a.v0.m.k1.g gVar, a.a.a.a.v0.m.k1.g gVar2) {
        if (gVar == null) {
            i.a("subType");
            throw null;
        } else if (gVar2 != null) {
            return null;
        } else {
            i.a("superType");
            throw null;
        }
    }

    public final void a() {
        ArrayDeque<h> arrayDeque = this.f1841c;
        if (arrayDeque != null) {
            arrayDeque.clear();
            Set<h> set = this.f1842d;
            if (set != null) {
                set.clear();
                this.b = false;
                return;
            }
            i.a();
            throw null;
        }
        i.a();
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public abstract h b(a.a.a.a.v0.m.k1.g gVar);

    public final void b() {
        boolean z = !this.b;
        if (!s.f2103a || z) {
            this.b = true;
            if (this.f1841c == null) {
                this.f1841c = new ArrayDeque<>(4);
            }
            if (this.f1842d == null) {
                this.f1842d = m.b.a();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public abstract boolean b(k kVar, k kVar2);

    @Override // a.a.a.a.v0.m.k1.n
    public abstract k c(a.a.a.a.v0.m.k1.g gVar);

    @Override // a.a.a.a.v0.m.k1.n
    public abstract h e(a.a.a.a.v0.m.k1.g gVar);

    public abstract boolean i(h hVar);

    public abstract boolean j(h hVar);

    public abstract boolean m(a.a.a.a.v0.m.k1.g gVar);

    public abstract a.a.a.a.v0.m.k1.g n(a.a.a.a.v0.m.k1.g gVar);

    public abstract a.a.a.a.v0.m.k1.g o(a.a.a.a.v0.m.k1.g gVar);
}

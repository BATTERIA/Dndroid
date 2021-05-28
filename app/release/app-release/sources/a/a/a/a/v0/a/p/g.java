package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.d1.b0;
import a.a.a.a.v0.b.w;
import a.a.l;
import a.t.f;
import a.w.c.i;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;

public final class g extends a.a.a.a.v0.a.g {
    public static final /* synthetic */ l[] p = {s.a(new p(s.a(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    public w m;
    public boolean n;
    public final a.a.a.a.v0.l.g o;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public static final class b extends j implements a.w.b.a<k> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f272c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.l.j f273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, a.a.a.a.v0.l.j jVar) {
            super(0);
            this.f272c = gVar;
            this.f273d = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k a() {
            b0 b0Var = this.f272c.f192a;
            if (b0Var != null) {
                i.a((Object) b0Var, "builtInsModule");
                return new k(b0Var, this.f273d, new h(this), new i(this));
            }
            a.a.a.a.v0.a.g.b(6);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a.a.a.a.v0.l.j jVar, a aVar) {
        super(jVar);
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (aVar != null) {
            this.n = true;
            this.o = jVar.a(new b(this, jVar));
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                a(false);
            } else if (ordinal == 2) {
                a(true);
            }
        } else {
            i.a("kind");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.a.g
    public a.a.a.a.v0.b.c1.a a() {
        return k();
    }

    @Override // a.a.a.a.v0.a.g
    public Iterable c() {
        Iterable<a.a.a.a.v0.b.c1.b> c2 = super.c();
        i.a((Object) c2, "super.getClassDescriptorFactories()");
        a.a.a.a.v0.l.j jVar = this.f194d;
        if (jVar != null) {
            i.a((Object) jVar, "storageManager");
            b0 b0Var = this.f192a;
            if (b0Var != null) {
                i.a((Object) b0Var, "builtInsModule");
                return f.b(c2, new e(jVar, b0Var, null, 4));
            }
            a.a.a.a.v0.a.g.b(6);
            throw null;
        }
        a.a.a.a.v0.a.g.b(5);
        throw null;
    }

    @Override // a.a.a.a.v0.a.g
    public c h() {
        return k();
    }

    public final k k() {
        return (k) e.f.a.g.a(this.o, p[0]);
    }
}

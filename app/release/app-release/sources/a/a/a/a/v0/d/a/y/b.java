package a.a.a.a.v0.d.a.y;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.z.i;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.a.l;
import a.t.f;
import a.t.m;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.Collection;
import java.util.Map;

public class b implements c, i {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ l[] f832f = {s.a(new p(s.a(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a  reason: collision with root package name */
    public final m0 f833a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.d.a.c0.b f834c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f835d;

    /* renamed from: e  reason: collision with root package name */
    public final a.a.a.a.v0.f.b f836e;

    public static final class a extends j implements a.w.b.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f837c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h f838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, h hVar) {
            super(0);
            this.f837c = bVar;
            this.f838d = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            e a2 = this.f838d.f562c.o.m().a(this.f837c.f836e);
            a.w.c.i.a((Object) a2, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
            return a2.v();
        }
    }

    public b(h hVar, a.a.a.a.v0.d.a.c0.a aVar, a.a.a.a.v0.f.b bVar) {
        m0 m0Var;
        Collection<a.a.a.a.v0.d.a.c0.b> J;
        a.a.a.a.v0.d.a.c0.b bVar2 = null;
        if (hVar == null) {
            a.w.c.i.a("c");
            throw null;
        } else if (bVar != null) {
            this.f836e = bVar;
            if (aVar == null || (m0Var = hVar.f562c.j.a(aVar)) == null) {
                m0Var = m0.f491a;
                a.w.c.i.a((Object) m0Var, "SourceElement.NO_SOURCE");
            }
            this.f833a = m0Var;
            this.b = hVar.f562c.f545a.a(new a(this, hVar));
            if (!(aVar == null || (J = aVar.J()) == null)) {
                bVar2 = (a.a.a.a.v0.d.a.c0.b) f.c(J);
            }
            this.f834c = bVar2;
            boolean z = true;
            this.f835d = (aVar == null || !aVar.f()) ? false : z;
        } else {
            a.w.c.i.a("fqName");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.c
    public Map<d, a.a.a.a.v0.j.s.g<?>> a() {
        return m.f2120c;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public d0 c() {
        return (k0) e.f.a.g.a(this.b, f832f[0]);
    }

    @Override // a.a.a.a.v0.b.b1.c
    public a.a.a.a.v0.f.b e() {
        return this.f836e;
    }

    @Override // a.a.a.a.v0.d.a.z.i
    public boolean f() {
        return this.f835d;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public m0 r() {
        return this.f833a;
    }
}

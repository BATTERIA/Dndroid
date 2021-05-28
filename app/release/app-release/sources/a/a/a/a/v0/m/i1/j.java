package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.v0;
import a.e;
import a.f;
import a.n;
import a.t.l;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class j implements a.a.a.a.v0.j.r.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f1881a;
    public final v0 b;

    /* renamed from: c  reason: collision with root package name */
    public a.w.b.a<? extends List<? extends f1>> f1882c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1883d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f1884e;

    public static final class a extends a.w.c.j implements a.w.b.a<List<? extends f1>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f1885c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(0);
            this.f1885c = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends f1> a() {
            a.w.b.a<? extends List<? extends f1>> aVar = this.f1885c.f1882c;
            if (aVar != null) {
                return (List) aVar.a();
            }
            return null;
        }
    }

    public static final class b extends a.w.c.j implements a.w.b.a<List<? extends f1>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f1886c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f f1887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, f fVar) {
            super(0);
            this.f1886c = jVar;
            this.f1887d = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends f1> a() {
            Iterable<f1> iterable = (List) this.f1886c.f1881a.getValue();
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(g.a(iterable, 10));
            for (f1 f1Var : iterable) {
                arrayList.add(f1Var.a(this.f1887d));
            }
            return arrayList;
        }
    }

    public j(v0 v0Var, a.w.b.a<? extends List<? extends f1>> aVar, j jVar, r0 r0Var) {
        if (v0Var != null) {
            this.b = v0Var;
            this.f1882c = aVar;
            this.f1883d = jVar;
            this.f1884e = r0Var;
            this.f1881a = g.a(f.PUBLICATION, (a.w.b.a) new a(this));
            return;
        }
        i.a("projection");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(v0 v0Var, a.w.b.a aVar, j jVar, r0 r0Var, int i) {
        this(v0Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? null : r0Var);
    }

    public j a(f fVar) {
        b bVar = null;
        if (fVar != null) {
            v0 a2 = this.b.a(fVar);
            i.a((Object) a2, "projection.refine(kotlinTypeRefiner)");
            if (this.f1882c != null) {
                bVar = new b(this, fVar);
            }
            j jVar = this.f1883d;
            if (jVar == null) {
                jVar = this;
            }
            return new j(a2, bVar, jVar, this.f1884e);
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public boolean a() {
        return false;
    }

    @Override // a.a.a.a.v0.m.s0
    public Collection b() {
        List list = (List) this.f1881a.getValue();
        return list != null ? list : l.f2119c;
    }

    @Override // a.a.a.a.v0.m.s0
    public h c() {
        return null;
    }

    @Override // a.a.a.a.v0.m.s0
    public List<r0> d() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.j.r.a.b
    public v0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            j jVar = (j) obj;
            j jVar2 = this.f1883d;
            if (jVar2 == null) {
                jVar2 = this;
            }
            j jVar3 = jVar.f1883d;
            if (jVar3 != null) {
                jVar = jVar3;
            }
            return jVar2 == jVar;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
    }

    public int hashCode() {
        j jVar = this.f1883d;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.a.g m() {
        d0 c2 = this.b.c();
        i.a((Object) c2, "projection.type");
        return a.a.a.a.v0.m.l1.a.c(c2);
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("CapturedType(");
        a2.append(this.b);
        a2.append(')');
        return a2.toString();
    }
}

package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b0;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.g;
import a.a.l;
import a.t.f;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class u extends m implements b0 {
    public static final /* synthetic */ l[] i = {s.a(new p(s.a(u.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: e  reason: collision with root package name */
    public final g f427e;

    /* renamed from: f  reason: collision with root package name */
    public final i f428f;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f429g;

    /* renamed from: h  reason: collision with root package name */
    public final a.a.a.a.v0.f.b f430h;

    public static final class a extends j implements a.w.b.a<List<? extends y>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u f431c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(0);
            this.f431c = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends y> a() {
            b0 b0Var = this.f431c.f429g;
            b0Var.U();
            return ((l) b0Var.j.getValue()).a(this.f431c.f430h);
        }
    }

    public static final class b extends j implements a.w.b.a<i> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u f432c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar) {
            super(0);
            this.f432c = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public i a() {
            if (this.f432c.y0().isEmpty()) {
                return i.b.b;
            }
            List<y> y0 = this.f432c.y0();
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) y0, 10));
            Iterator<T> it = y0.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().u());
            }
            u uVar = this.f432c;
            List a2 = f.a((Collection) arrayList, (Object) new k0(uVar.f429g, uVar.f430h));
            StringBuilder a3 = e.a.a.a.a.a("package view scope for ");
            a3.append(this.f432c.f430h);
            a3.append(" in ");
            a3.append(this.f432c.f429g.d());
            return new a.a.a.a.v0.j.w.b(a3.toString(), a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, a.a.a.a.v0.f.b bVar, a.a.a.a.v0.l.j jVar) {
        super(h.a.f321a, bVar.e());
        if (b0Var == null) {
            a.w.c.i.a("module");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("fqName");
            throw null;
        } else if (jVar == null) {
            a.w.c.i.a("storageManager");
            throw null;
        } else if (h.b != null) {
            this.f429g = b0Var;
            this.f430h = bVar;
            this.f427e = jVar.a(new a(this));
            this.f428f = new a.a.a.a.v0.j.w.h(jVar.a(new b(this)));
        } else {
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b0
    public w I() {
        return this.f429g;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        if (mVar != null) {
            return mVar.a(this, d2);
        }
        a.w.c.i.a("visitor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.k
    public k b() {
        if (this.f430h.b()) {
            return null;
        }
        b0 b0Var = this.f429g;
        a.a.a.a.v0.f.b c2 = this.f430h.c();
        a.w.c.i.a((Object) c2, "fqName.parent()");
        return b0Var.a(c2);
    }

    @Override // a.a.a.a.v0.b.b0
    public a.a.a.a.v0.f.b e() {
        return this.f430h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var == null || !a.w.c.i.a(this.f430h, b0Var.e()) || !a.w.c.i.a(this.f429g, b0Var.I())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f430h.hashCode() + (this.f429g.hashCode() * 31);
    }

    @Override // a.a.a.a.v0.b.b0
    public boolean isEmpty() {
        return y0().isEmpty();
    }

    @Override // a.a.a.a.v0.b.b0
    public i u() {
        return this.f428f;
    }

    @Override // a.a.a.a.v0.b.b0
    public List<y> y0() {
        return (List) e.f.a.g.a(this.f427e, i[0]);
    }
}

package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.n;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.k.b.f0.m;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.s0;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.Collection;
import java.util.List;

public abstract class f extends n implements q0 {

    /* renamed from: g  reason: collision with root package name */
    public List<? extends r0> f370g;

    /* renamed from: h  reason: collision with root package name */
    public final b f371h;
    public final a1 i;

    public static final class a extends j implements l<f1, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f372c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f372c = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Boolean a(f1 f1Var) {
            f1 f1Var2 = f1Var;
            i.a((Object) f1Var2, "type");
            boolean z = false;
            if (!g.f(f1Var2)) {
                h c2 = f1Var2.I0().c();
                if ((c2 instanceof r0) && (i.a(((r0) c2).b(), this.f372c) ^ true)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class b implements s0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f373a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(f fVar) {
            this.f373a = fVar;
        }

        @Override // a.a.a.a.v0.m.s0
        public boolean a() {
            return true;
        }

        @Override // a.a.a.a.v0.m.s0
        public Collection<d0> b() {
            Collection<d0> b = this.f373a.N().I0().b();
            i.a((Object) b, "declarationDescriptor.un…pe.constructor.supertypes");
            return b;
        }

        @Override // a.a.a.a.v0.m.s0
        public h c() {
            return this.f373a;
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.util.List<? extends a.a.a.a.v0.b.r0>, java.util.List<a.a.a.a.v0.b.r0> */
        @Override // a.a.a.a.v0.m.s0
        public List<r0> d() {
            List list = ((m) this.f373a).l;
            if (list != null) {
                return list;
            }
            i.b("typeConstructorParameters");
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public a.a.a.a.v0.a.g m() {
            return a.a.a.a.v0.j.u.a.b(this.f373a);
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("[typealias ");
            a2.append(this.f373a.d().a());
            a2.append(']');
            return a2.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(k kVar, a.a.a.a.v0.b.b1.h hVar, d dVar, m0 m0Var, a1 a1Var) {
        super(kVar, hVar, dVar, m0Var);
        if (kVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        } else if (m0Var == null) {
            i.a("sourceElement");
            throw null;
        } else if (a1Var != null) {
            this.i = a1Var;
            this.f371h = new b(this);
        } else {
            i.a("visibilityImpl");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return false;
    }

    @Override // a.a.a.a.v0.b.i
    public boolean E() {
        return c1.a(N(), new a(this));
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return false;
    }

    @Override // a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    public h a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public k m6a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public n m7a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(a.a.a.a.v0.b.m<R, D> mVar, D d2) {
        if (mVar != null) {
            return mVar.a(this, d2);
        }
        i.a("visitor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u
    public a1 g() {
        return this.i;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.h
    public s0 n() {
        return this.f371h;
    }

    @Override // a.a.a.a.v0.b.u
    public v o() {
        return v.FINAL;
    }

    @Override // a.a.a.a.v0.b.d1.m
    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("typealias ");
        a2.append(d().a());
        return a2.toString();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends a.a.a.a.v0.b.r0>, java.util.List<a.a.a.a.v0.b.r0> */
    @Override // a.a.a.a.v0.b.i
    public List<r0> x() {
        List list = this.f370g;
        if (list != null) {
            return list;
        }
        i.b("declaredTypeParametersImpl");
        throw null;
    }
}

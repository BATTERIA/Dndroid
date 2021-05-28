package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.n;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class g extends n implements r0 {

    /* renamed from: g  reason: collision with root package name */
    public final g1 f381g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f382h;
    public final int i;
    public final a.a.a.a.v0.l.g<s0> j;
    public final a.a.a.a.v0.l.g<k0> k;
    public final j l;

    public class a implements a.w.b.a<s0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f383c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p0 f384d;

        public a(j jVar, p0 p0Var) {
            this.f383c = jVar;
            this.f384d = p0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public s0 a() {
            return new c(g.this, this.f383c, this.f384d);
        }
    }

    public class b implements a.w.b.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f386c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f387d;

        public b(j jVar, d dVar) {
            this.f386c = jVar;
            this.f387d = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            if (h.b != null) {
                return e0.a(h.a.f321a, g.this.n(), (List<? extends v0>) Collections.emptyList(), false, (i) new a.a.a.a.v0.j.w.h(this.f386c.a(new h(this))));
            }
            throw null;
        }
    }

    public class c extends a.a.a.a.v0.m.h {
        public final p0 b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f389c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, j jVar, p0 p0Var) {
            super(jVar);
            if (jVar != null) {
                this.f389c = gVar;
                this.b = p0Var;
                return;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.m.h
        public void a(d0 d0Var) {
            if (d0Var != null) {
                this.f389c.a(d0Var);
            } else {
                a(6);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.m.s0
        public boolean a() {
            return true;
        }

        @Override // a.a.a.a.v0.m.s0
        public a.a.a.a.v0.b.h c() {
            g gVar = this.f389c;
            if (gVar != null) {
                return gVar;
            }
            a(3);
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public List<r0> d() {
            List<r0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            a(2);
            throw null;
        }

        @Override // a.a.a.a.v0.m.h
        public Collection<d0> f() {
            List<d0> U = this.f389c.U();
            if (U != null) {
                return U;
            }
            a(1);
            throw null;
        }

        @Override // a.a.a.a.v0.m.h
        public d0 g() {
            return w.b("Cyclic upper bounds");
        }

        @Override // a.a.a.a.v0.m.h
        public p0 h() {
            p0 p0Var = this.b;
            if (p0Var != null) {
                return p0Var;
            }
            a(5);
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public a.a.a.a.v0.a.g m() {
            a.a.a.a.v0.a.g b2 = a.a.a.a.v0.j.u.a.b(this.f389c);
            if (b2 != null) {
                return b2;
            }
            a(4);
            throw null;
        }

        public String toString() {
            return this.f389c.d().f1351c;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(j jVar, k kVar, h hVar, d dVar, g1 g1Var, boolean z, int i2, m0 m0Var, p0 p0Var) {
        super(kVar, hVar, dVar, m0Var);
        if (jVar == null) {
            a(0);
            throw null;
        } else if (kVar == null) {
            a(1);
            throw null;
        } else if (hVar == null) {
            a(2);
            throw null;
        } else if (dVar == null) {
            a(3);
            throw null;
        } else if (g1Var == null) {
            a(4);
            throw null;
        } else if (m0Var == null) {
            a(5);
            throw null;
        } else if (p0Var != null) {
            this.f381g = g1Var;
            this.f382h = z;
            this.i = i2;
            this.j = jVar.a(new a(jVar, p0Var));
            this.k = jVar.a(new b(jVar, dVar));
            this.l = jVar;
        } else {
            a(6);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.r0
    public g1 F() {
        g1 g1Var = this.f381g;
        if (g1Var != null) {
            return g1Var;
        }
        a(7);
        throw null;
    }

    @Override // a.a.a.a.v0.b.r0
    public j O() {
        j jVar = this.l;
        if (jVar != null) {
            return jVar;
        }
        a(12);
        throw null;
    }

    public abstract List<d0> U();

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    public a.a.a.a.v0.b.h a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public k m8a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public n m9a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public r0 m10a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    public abstract void a(d0 d0Var);

    @Override // a.a.a.a.v0.b.r0
    public List<d0> getUpperBounds() {
        List<d0> b2 = ((c) n()).b();
        if (b2 != null) {
            return b2;
        }
        a(8);
        throw null;
    }

    @Override // a.a.a.a.v0.b.r0, a.a.a.a.v0.b.h
    public final s0 n() {
        s0 s0Var = (s0) this.j.a();
        if (s0Var != null) {
            return s0Var;
        }
        a(9);
        throw null;
    }

    @Override // a.a.a.a.v0.b.r0
    public boolean o0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.r0
    public boolean p0() {
        return this.f382h;
    }

    @Override // a.a.a.a.v0.b.h
    public k0 v() {
        k0 k0Var = (k0) this.k.a();
        if (k0Var != null) {
            return k0Var;
        }
        a(10);
        throw null;
    }

    @Override // a.a.a.a.v0.b.r0
    public int z() {
        return this.i;
    }
}

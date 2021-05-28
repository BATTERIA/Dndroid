package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.j.w.m;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.y0;

public abstract class b extends w {

    /* renamed from: c  reason: collision with root package name */
    public final d f354c;

    /* renamed from: d  reason: collision with root package name */
    public final g<k0> f355d;

    /* renamed from: e  reason: collision with root package name */
    public final g<i> f356e;

    /* renamed from: f  reason: collision with root package name */
    public final g<i0> f357f;

    public class a implements a.w.b.a<k0> {
        public a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            b bVar = b.this;
            return c1.a(bVar, bVar.i0(), new a(this));
        }
    }

    /* renamed from: a.a.a.a.v0.b.d1.b$b  reason: collision with other inner class name */
    public class C0017b implements a.w.b.a<i> {
        public C0017b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public i a() {
            return new a.a.a.a.v0.j.w.g(b.this.i0());
        }
    }

    public class c implements a.w.b.a<i0> {
        public c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public i0 a() {
            return new t(b.this);
        }
    }

    public b(j jVar, d dVar) {
        if (jVar == null) {
            a(0);
            throw null;
        } else if (dVar != null) {
            this.f354c = dVar;
            this.f355d = jVar.a(new a());
            this.f356e = jVar.a(new C0017b());
            this.f357f = jVar.a(new c());
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 8 || i == 11 || i == 13 || i == 15) {
            objArr[1] = "getMemberScope";
        } else if (i == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 18) {
            objArr[1] = "substitute";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.e
    public i0 G0() {
        i0 i0Var = (i0) this.f357f.a();
        if (i0Var != null) {
            return i0Var;
        }
        a(5);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public i T() {
        i iVar = (i) this.f356e.a();
        if (iVar != null) {
            return iVar;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    public e a() {
        return this;
    }

    /* Return type fixed from 'a.a.a.a.v0.b.e' to match base method */
    @Override // a.a.a.a.v0.b.o0
    public a.a.a.a.v0.b.i a(a1 a1Var) {
        if (a1Var != null) {
            return a1Var.b() ? this : new v(this, a1Var);
        }
        a(17);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public h m3a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    /* renamed from: a  reason: collision with other method in class */
    public k m4a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.e
    public i a(y0 y0Var) {
        if (y0Var != null) {
            i a2 = a(y0Var, a.a.a.a.v0.j.u.a.a(a.a.a.a.v0.j.g.a((k) this)));
            if (a2 != null) {
                return a2;
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(y0 y0Var, f fVar) {
        if (y0Var == null) {
            a(9);
            throw null;
        } else if (fVar == null) {
            a(10);
            throw null;
        } else if (y0Var.d()) {
            i a2 = a(fVar);
            if (a2 != null) {
                return a2;
            }
            a(11);
            throw null;
        } else {
            return new m(a(fVar), a1.a(y0Var));
        }
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(a.a.a.a.v0.b.m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    @Override // a.a.a.a.v0.b.k
    public d d() {
        d dVar = this.f354c;
        if (dVar != null) {
            return dVar;
        }
        a(2);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public i i0() {
        i a2 = a(a.a.a.a.v0.j.u.a.a(a.a.a.a.v0.j.g.a((k) this)));
        if (a2 != null) {
            return a2;
        }
        a(16);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.h
    public k0 v() {
        k0 k0Var = (k0) this.f355d.a();
        if (k0Var != null) {
            return k0Var;
        }
        a(19);
        throw null;
    }
}

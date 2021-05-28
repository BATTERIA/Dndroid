package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.w.b.l;
import e.a.a.a.a;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;

public class n0 extends g {
    public final l<d0, Void> m;
    public final List<d0> n;
    public boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(k kVar, h hVar, boolean z, g1 g1Var, d dVar, int i, m0 m0Var, l<d0, Void> lVar, p0 p0Var, j jVar) {
        super(jVar, kVar, hVar, dVar, g1Var, z, i, m0Var, p0Var);
        if (kVar == null) {
            a(19);
            throw null;
        } else if (hVar == null) {
            a(20);
            throw null;
        } else if (g1Var == null) {
            a(21);
            throw null;
        } else if (dVar == null) {
            a(22);
            throw null;
        } else if (m0Var == null) {
            a(23);
            throw null;
        } else if (p0Var == null) {
            a(24);
            throw null;
        } else if (jVar != null) {
            this.n = new ArrayList(1);
            this.o = false;
            this.m = lVar;
        } else {
            a(25);
            throw null;
        }
    }

    public static n0 a(k kVar, h hVar, boolean z, g1 g1Var, d dVar, int i, m0 m0Var, j jVar) {
        if (kVar == null) {
            a(6);
            throw null;
        } else if (hVar == null) {
            a(7);
            throw null;
        } else if (g1Var == null) {
            a(8);
            throw null;
        } else if (dVar == null) {
            a(9);
            throw null;
        } else if (m0Var == null) {
            a(10);
            throw null;
        } else if (jVar != null) {
            p0.a aVar = p0.a.f493a;
            if (kVar == null) {
                a(12);
                throw null;
            } else if (hVar == null) {
                a(13);
                throw null;
            } else if (g1Var == null) {
                a(14);
                throw null;
            } else if (dVar == null) {
                a(15);
                throw null;
            } else if (m0Var == null) {
                a(16);
                throw null;
            } else if (jVar != null) {
                return new n0(kVar, hVar, z, g1Var, dVar, i, m0Var, null, aVar, jVar);
            } else {
                a(18);
                throw null;
            }
        } else {
            a(11);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 28) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.d1.g
    public List<d0> U() {
        if (this.o) {
            List<d0> list = this.n;
            if (list != null) {
                return list;
            }
            a(28);
            throw null;
        }
        StringBuilder a2 = a.a("Type parameter descriptor is not initialized: ");
        a2.append(u0());
        throw new IllegalStateException(a2.toString());
    }

    @Override // a.a.a.a.v0.b.d1.g
    public void a(d0 d0Var) {
        if (d0Var != null) {
            l<d0, Void> lVar = this.m;
            if (lVar != null) {
                lVar.a(d0Var);
                return;
            }
            return;
        }
        a(27);
        throw null;
    }

    public void b(d0 d0Var) {
        if (d0Var != null) {
            r0();
            if (!g.f(d0Var)) {
                this.n.add(d0Var);
                return;
            }
            return;
        }
        a(26);
        throw null;
    }

    public final void r0() {
        if (this.o) {
            StringBuilder a2 = a.a("Type parameter descriptor is already initialized: ");
            a2.append(u0());
            throw new IllegalStateException(a2.toString());
        }
    }

    public final String u0() {
        return d() + " declared in " + a.a.a.a.v0.j.g.e(b());
    }

    public static r0 a(k kVar, h hVar, boolean z, g1 g1Var, d dVar, int i, j jVar) {
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (g1Var == null) {
            a(2);
            throw null;
        } else if (dVar == null) {
            a(3);
            throw null;
        } else if (jVar != null) {
            n0 a2 = a(kVar, hVar, z, g1Var, dVar, i, m0.f491a, jVar);
            a2.b(a.a.a.a.v0.j.u.a.b(kVar).d());
            a2.r0();
            a2.o = true;
            return a2;
        } else {
            a(4);
            throw null;
        }
    }
}

package a.a.a.a.v0.d.a.z;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.i;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.j;
import e.f.a.g;
import java.util.List;

public class c extends i implements b {
    public Boolean H;
    public Boolean I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, c cVar, h hVar, boolean z, b.a aVar, m0 m0Var) {
        super(eVar, cVar, hVar, z, aVar, m0Var);
        if (eVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (aVar == null) {
            a(2);
            throw null;
        } else if (m0Var != null) {
            this.H = null;
            this.I = null;
        } else {
            a(3);
            throw null;
        }
    }

    public static c a(e eVar, h hVar, boolean z, m0 m0Var) {
        if (eVar == null) {
            a(4);
            throw null;
        } else if (hVar == null) {
            a(5);
            throw null;
        } else if (m0Var != null) {
            return new c(eVar, null, hVar, z, b.a.DECLARATION, m0Var);
        } else {
            a(6);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 11 || i == 18) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.i, a.a.a.a.v0.b.d1.i
    public c a(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            a(7);
            throw null;
        } else if (aVar == null) {
            a(8);
            throw null;
        } else if (hVar == null) {
            a(9);
            throw null;
        } else if (m0Var == null) {
            a(10);
            throw null;
        } else if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            e eVar = (e) kVar;
            c cVar = (c) sVar;
            if (eVar == null) {
                a(12);
                throw null;
            } else if (aVar == null) {
                a(13);
                throw null;
            } else if (m0Var == null) {
                a(14);
                throw null;
            } else if (hVar != null) {
                c cVar2 = new c(eVar, cVar, hVar, this.F, aVar, m0Var);
                cVar2.a(this.H.booleanValue());
                cVar2.b(s0());
                return cVar2;
            } else {
                a(15);
                throw null;
            }
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        }
    }

    @Override // a.a.a.a.v0.b.d1.s
    public void a(boolean z) {
        this.H = Boolean.valueOf(z);
    }

    @Override // a.a.a.a.v0.b.d1.s
    public void b(boolean z) {
        this.I = Boolean.valueOf(z);
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.a
    public boolean s0() {
        return this.I.booleanValue();
    }

    @Override // a.a.a.a.v0.d.a.z.b
    public b a(d0 d0Var, List list, d0 d0Var2, j jVar) {
        i0 i0Var = null;
        if (list == null) {
            a(16);
            throw null;
        } else if (d0Var2 != null) {
            c a2 = a((k) b(), (s) null, t(), (d) null, y(), r());
            if (d0Var != null) {
                if (h.b != null) {
                    i0Var = g.a(a2, d0Var, h.a.f321a);
                } else {
                    throw null;
                }
            }
            a2.a(i0Var, this.k, k(), g.a(list, j(), a2), d0Var2, o(), g());
            if (jVar != null) {
                a2.a((a.AbstractC0014a) jVar.f2088c, (Object) jVar.f2089d);
            }
            return a2;
        } else {
            a(17);
            throw null;
        }
    }
}

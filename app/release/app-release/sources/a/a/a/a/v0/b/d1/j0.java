package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class j0 extends s implements l0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(k kVar, l0 l0Var, h hVar, d dVar, b.a aVar, m0 m0Var) {
        super(kVar, l0Var, hVar, dVar, aVar, m0Var);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (aVar == null) {
            a(3);
            throw null;
        } else if (m0Var != null) {
        } else {
            a(4);
            throw null;
        }
    }

    public static j0 a(k kVar, h hVar, d dVar, b.a aVar, m0 m0Var) {
        if (kVar == null) {
            a(5);
            throw null;
        } else if (hVar == null) {
            a(6);
            throw null;
        } else if (dVar == null) {
            a(7);
            throw null;
        } else if (aVar == null) {
            a(8);
            throw null;
        } else if (m0Var != null) {
            return new j0(kVar, null, hVar, dVar, aVar, m0Var);
        } else {
            a(9);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = "copy";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.d1.s
    public j0 a(i0 i0Var, i0 i0Var2, List<? extends r0> list, List<w0> list2, d0 d0Var, v vVar, a1 a1Var) {
        if (list == null) {
            a(10);
            throw null;
        } else if (list2 == null) {
            a(11);
            throw null;
        } else if (a1Var != null) {
            j0 a2 = a(i0Var, i0Var2, list, list2, d0Var, vVar, a1Var, null);
            if (a2 != null) {
                return a2;
            }
            a(13);
            throw null;
        } else {
            a(12);
            throw null;
        }
    }

    public j0 a(i0 i0Var, i0 i0Var2, List<? extends r0> list, List<w0> list2, d0 d0Var, v vVar, a1 a1Var, Map<? extends a.AbstractC0014a<?>, ?> map) {
        if (list == null) {
            a(14);
            throw null;
        } else if (list2 == null) {
            a(15);
            throw null;
        } else if (a1Var != null) {
            super.a(i0Var, i0Var2, list, list2, d0Var, vVar, a1Var);
            if (map != null && !map.isEmpty()) {
                this.E = new LinkedHashMap(map);
            }
            return this;
        } else {
            a(16);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.s
    public s a(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            a(19);
            throw null;
        } else if (aVar == null) {
            a(20);
            throw null;
        } else if (hVar == null) {
            a(21);
            throw null;
        } else if (m0Var != null) {
            l0 l0Var = (l0) sVar;
            if (dVar == null) {
                dVar = d();
            }
            return new j0(kVar, l0Var, hVar, dVar, aVar, m0Var);
        } else {
            a(22);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public l0 a() {
        l0 l0Var = (l0) super.a();
        if (l0Var != null) {
            return l0Var;
        }
        a(18);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.b
    public l0 a(k kVar, v vVar, a1 a1Var, b.a aVar, boolean z) {
        l0 l0Var = (l0) super.a(kVar, vVar, a1Var, aVar, z);
        if (l0Var != null) {
            return l0Var;
        }
        a(23);
        throw null;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: a.a.a.a.v0.b.s$a<? extends a.a.a.a.v0.b.s>, a.a.a.a.v0.b.s$a<? extends a.a.a.a.v0.b.l0> */
    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.l0
    public s.a<? extends l0> s() {
        s.a s = super.s();
        if (s != null) {
            return s;
        }
        a(24);
        throw null;
    }
}

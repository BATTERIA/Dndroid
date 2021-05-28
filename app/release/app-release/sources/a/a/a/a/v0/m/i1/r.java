package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import e.f.a.g;
import java.util.List;

public class r {

    /* renamed from: a */
    public final q f1895a;

    public enum a {
        IN,
        OUT,
        INV,
        STAR;

        public static a a(g1 g1Var) {
            if (g1Var != null) {
                int ordinal = g1Var.ordinal();
                if (ordinal == 0) {
                    a aVar = INV;
                    if (aVar != null) {
                        return aVar;
                    }
                    a(1);
                    throw null;
                } else if (ordinal == 1) {
                    a aVar2 = IN;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                    a(2);
                    throw null;
                } else if (ordinal == 2) {
                    a aVar3 = OUT;
                    if (aVar3 != null) {
                        return aVar3;
                    }
                    a(3);
                    throw null;
                } else {
                    throw new IllegalStateException("Unknown variance");
                }
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3) ? 2 : 3)];
            if (i == 1 || i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure$EnrichedProjectionKind";
            } else {
                objArr[0] = "variance";
            }
            if (i == 1 || i == 2 || i == 3) {
                objArr[1] = "fromVariance";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure$EnrichedProjectionKind";
            }
            if (!(i == 1 || i == 2 || i == 3)) {
                objArr[2] = "fromVariance";
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
    }

    public r(q qVar) {
        this.f1895a = qVar;
    }

    public static a a(r0 r0Var, v0 v0Var) {
        if (r0Var == null) {
            a(13);
            throw null;
        } else if (v0Var != null) {
            g1 F = r0Var.F();
            g1 a2 = v0Var.a();
            if (a2 == g1.INVARIANT) {
                a2 = F;
                F = a2;
            }
            return (F == g1.IN_VARIANCE && a2 == g1.OUT_VARIANCE) ? a.STAR : (F == g1.OUT_VARIANCE && a2 == g1.IN_VARIANCE) ? a.STAR : a.a(a2);
        } else {
            a(14);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 7 || i == 10) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 2:
            case 15:
            case 17:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 7 || i == 10) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static d0 b(r0 r0Var, v0 v0Var) {
        if (r0Var == null) {
            a(8);
            throw null;
        } else if (v0Var != null) {
            d0 f2 = v0Var.a() == g1.OUT_VARIANCE || r0Var.F() == g1.OUT_VARIANCE ? a.a.a.a.v0.j.u.a.b(r0Var).f() : v0Var.c();
            if (f2 != null) {
                return f2;
            }
            a(10);
            throw null;
        } else {
            a(9);
            throw null;
        }
    }

    public static d0 c(r0 r0Var, v0 v0Var) {
        if (r0Var == null) {
            a(5);
            throw null;
        } else if (v0Var != null) {
            d0 g2 = v0Var.a() == g1.IN_VARIANCE || r0Var.F() == g1.IN_VARIANCE ? a.a.a.a.v0.j.u.a.b(r0Var).g() : v0Var.c();
            if (g2 != null) {
                return g2;
            }
            a(7);
            throw null;
        } else {
            a(6);
            throw null;
        }
    }

    public boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            a(11);
            throw null;
        } else if (d0Var2 == null) {
            a(12);
            throw null;
        } else if (d0Var == d0Var2) {
            return true;
        } else {
            if (g.g(d0Var)) {
                return g.g(d0Var2) ? !g.f(d0Var) && !g.f(d0Var2) && c(d0Var, d0Var2) && c(d0Var2, d0Var) : b(d0Var2, d0Var);
            }
            if (g.g(d0Var2)) {
                return b(d0Var, d0Var2);
            }
            if (d0Var.J0() != d0Var2.J0()) {
                return false;
            }
            if (d0Var.J0()) {
                return this.f1895a.a(c1.e(d0Var), c1.e(d0Var2), this);
            }
            s0 I0 = d0Var.I0();
            s0 I02 = d0Var2.I0();
            if (!this.f1895a.a(I0, I02)) {
                return false;
            }
            List<v0> H0 = d0Var.H0();
            List<v0> H02 = d0Var2.H0();
            if (H0.size() != H02.size()) {
                return false;
            }
            for (int i = 0; i < H0.size(); i++) {
                v0 v0Var = H0.get(i);
                v0 v0Var2 = H02.get(i);
                if (!v0Var.b() || !v0Var2.b()) {
                    r0 r0Var = I0.d().get(i);
                    a(v0Var, v0Var2, r0Var);
                    if (!(a(r0Var, v0Var) == a(I02.d().get(i), v0Var2) && this.f1895a.a(v0Var.c(), v0Var2.c(), this))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final boolean a(v0 v0Var, v0 v0Var2, r0 r0Var) {
        if (v0Var == null) {
            a(19);
            throw null;
        } else if (v0Var2 == null) {
            a(20);
            throw null;
        } else if (r0Var == null) {
            a(21);
            throw null;
        } else if (r0Var.F() != g1.INVARIANT || v0Var.a() == g1.INVARIANT || v0Var2.a() != g1.INVARIANT) {
            return false;
        } else {
            q qVar = this.f1895a;
            d0 c2 = v0Var2.c();
            if (qVar == null) {
                throw null;
            } else if (c2 != null) {
                return false;
            } else {
                q.a(8);
                throw null;
            }
        }
    }

    public boolean b(d0 d0Var, d0 d0Var2) {
        return c(g.a(d0Var2).f1956d, d0Var) && c(d0Var, g.a(d0Var2).f1957e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(a.a.a.a.v0.m.d0 r11, a.a.a.a.v0.m.d0 r12) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.i1.r.c(a.a.a.a.v0.m.d0, a.a.a.a.v0.m.d0):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.a.a.a.v0.m.d0 a(a.a.a.a.v0.m.d0 r8, a.a.a.a.v0.m.d0 r9, a.a.a.a.v0.m.i1.q r10) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.i1.r.a(a.a.a.a.v0.m.d0, a.a.a.a.v0.m.d0, a.a.a.a.v0.m.i1.q):a.a.a.a.v0.m.d0");
    }
}

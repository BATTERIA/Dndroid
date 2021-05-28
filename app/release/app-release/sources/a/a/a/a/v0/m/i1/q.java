package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.s0;

public class q {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(d0 d0Var, d0 d0Var2, r rVar) {
        if (d0Var == null) {
            a(0);
            throw null;
        } else if (d0Var2 == null) {
            a(1);
            throw null;
        } else if (rVar != null) {
            return rVar.a(d0Var, d0Var2);
        } else {
            a(2);
            throw null;
        }
    }

    public boolean a(s0 s0Var, s0 s0Var2) {
        if (s0Var == null) {
            a(3);
            throw null;
        } else if (s0Var2 != null) {
            return s0Var.equals(s0Var2);
        } else {
            a(4);
            throw null;
        }
    }

    public boolean b(d0 d0Var, d0 d0Var2, r rVar) {
        if (d0Var == null) {
            a(5);
            throw null;
        } else if (d0Var2 == null) {
            a(6);
            throw null;
        } else if (rVar != null) {
            return rVar.c(d0Var, d0Var2);
        } else {
            a(7);
            throw null;
        }
    }
}

package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.i1.d;
import a.a.a.a.v0.m.s0;

public class e implements d {

    /* renamed from: c  reason: collision with root package name */
    public final r f1871c;

    public static class a extends q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.a f1872a;

        public a(d.a aVar) {
            this.f1872a = aVar;
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "constructor1";
            } else {
                objArr[0] = "constructor2";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl$1";
            objArr[2] = "assertEqualTypeConstructors";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.m.i1.q
        public boolean a(s0 s0Var, s0 s0Var2) {
            if (s0Var == null) {
                a(0);
                throw null;
            } else if (s0Var2 != null) {
                return s0Var.equals(s0Var2) || this.f1872a.a(s0Var, s0Var2);
            } else {
                a(1);
                throw null;
            }
        }
    }

    public e(r rVar) {
        if (rVar != null) {
            this.f1871c = rVar;
        } else {
            a(1);
            throw null;
        }
    }

    public static d a(d.a aVar) {
        if (aVar != null) {
            return new e(new r(new a(aVar)));
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "procedure";
        } else if (i == 2) {
            objArr[0] = "subtype";
        } else if (i == 3) {
            objArr[0] = "supertype";
        } else if (i == 4) {
            objArr[0] = "a";
        } else if (i != 5) {
            objArr[0] = "equalityAxioms";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl";
        if (i == 1) {
            objArr[2] = "<init>";
        } else if (i == 2 || i == 3) {
            objArr[2] = "isSubtypeOf";
        } else if (i == 4 || i == 5) {
            objArr[2] = "equalTypes";
        } else {
            objArr[2] = "withAxioms";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.a.a.a.v0.m.i1.d
    public boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            a(4);
            throw null;
        } else if (d0Var2 != null) {
            return this.f1871c.a(d0Var, d0Var2);
        } else {
            a(5);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.i1.d
    public boolean b(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            a(2);
            throw null;
        } else if (d0Var2 != null) {
            return this.f1871c.c(d0Var, d0Var2);
        } else {
            a(3);
            throw null;
        }
    }
}

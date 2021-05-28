package a.a.a.a.v0.m;

import a.a.a.a.v0.m.i1.f;

public class x0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f1958a;
    public final d0 b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x0(d0 d0Var) {
        this(g1.INVARIANT, d0Var);
        if (d0Var != null) {
        } else {
            a(2);
            throw null;
        }
    }

    public x0(g1 g1Var, d0 d0Var) {
        if (g1Var == null) {
            a(0);
            throw null;
        } else if (d0Var != null) {
            this.f1958a = g1Var;
            this.b = d0Var;
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "type";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else if (i != 5) {
            objArr[0] = "projection";
        } else {
            objArr[0] = "kotlinTypeRefiner";
        }
        if (i == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.m.v0
    public g1 a() {
        g1 g1Var = this.f1958a;
        if (g1Var != null) {
            return g1Var;
        }
        a(3);
        throw null;
    }

    @Override // a.a.a.a.v0.m.v0
    public v0 a(f fVar) {
        if (fVar != null) {
            g1 g1Var = this.f1958a;
            d0 d0Var = this.b;
            fVar.a(d0Var);
            return new x0(g1Var, d0Var);
        }
        a(5);
        throw null;
    }

    @Override // a.a.a.a.v0.m.v0
    public boolean b() {
        return false;
    }

    @Override // a.a.a.a.v0.m.v0
    public d0 c() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            return d0Var;
        }
        a(4);
        throw null;
    }
}

package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.g1;

public abstract class c extends g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(j jVar, k kVar, d dVar, g1 g1Var, boolean z, int i, m0 m0Var, p0 p0Var) {
        super(jVar, kVar, h.a.f321a, dVar, g1Var, z, i, m0Var, p0Var);
        if (jVar == null) {
            a(0);
            throw null;
        } else if (kVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (g1Var == null) {
            a(3);
            throw null;
        } else if (m0Var == null) {
            a(4);
            throw null;
        } else if (p0Var == null) {
            a(5);
            throw null;
        } else if (h.b != null) {
        } else {
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = "source";
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.a.a.a.v0.b.d1.m
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.f382h ? "reified " : str;
        if (F() != g1.INVARIANT) {
            str = F() + " ";
        }
        objArr[1] = str;
        objArr[2] = d();
        return String.format("%s%s%s", objArr);
    }
}

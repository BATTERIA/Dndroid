package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.l.h;
import a.a.a.a.v0.m.d0;

public abstract class q0 extends p0 {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f412h;
    public h<g<?>> i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(k kVar, a.a.a.a.v0.b.b1.h hVar, d dVar, d0 d0Var, boolean z, m0 m0Var) {
        super(kVar, hVar, dVar, d0Var, m0Var);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (m0Var != null) {
            this.f412h = z;
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "annotations";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i2 != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.a.a.a.v0.b.y0
    public boolean V() {
        return this.f412h;
    }

    public void a(h<g<?>> hVar) {
        if (hVar != null) {
            this.i = hVar;
        } else {
            a(4);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.y0
    public g<?> j0() {
        h<g<?>> hVar = this.i;
        if (hVar != null) {
            return (g) hVar.a();
        }
        return null;
    }
}

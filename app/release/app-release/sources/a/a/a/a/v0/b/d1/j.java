package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.f.d;

public abstract class j extends b {

    /* renamed from: g  reason: collision with root package name */
    public final k f393g;

    /* renamed from: h  reason: collision with root package name */
    public final m0 f394h;
    public final boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a.a.a.a.v0.l.j jVar, k kVar, d dVar, m0 m0Var, boolean z) {
        super(jVar, dVar);
        if (jVar == null) {
            a(0);
            throw null;
        } else if (kVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (m0Var != null) {
            this.f393g = kVar;
            this.f394h = m0Var;
            this.i = z;
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 4 || i2 == 5) ? 2 : 3)];
        if (i2 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i2 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i2 == 4 || i2 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i2 == 4 || i2 == 5) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return this.i;
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.e, a.a.a.a.v0.b.k
    public k b() {
        k kVar = this.f393g;
        if (kVar != null) {
            return kVar;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        m0 m0Var = this.f394h;
        if (m0Var != null) {
            return m0Var;
        }
        a(5);
        throw null;
    }
}

package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.f.d;

public abstract class n extends m implements l {

    /* renamed from: e  reason: collision with root package name */
    public final k f400e;

    /* renamed from: f  reason: collision with root package name */
    public final m0 f401f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(k kVar, h hVar, d dVar, m0 m0Var) {
        super(hVar, dVar);
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
            this.f400e = kVar;
            this.f401f = m0Var;
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.n a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.k
    public k b() {
        k kVar = this.f400e;
        if (kVar != null) {
            return kVar;
        }
        a(5);
        throw null;
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        m0 m0Var = this.f401f;
        if (m0Var != null) {
            return m0Var;
        }
        a(6);
        throw null;
    }
}

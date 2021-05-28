package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.i.c;

public abstract class m extends b implements k {

    /* renamed from: d  reason: collision with root package name */
    public final d f397d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(h hVar, d dVar) {
        super(hVar);
        if (hVar == null) {
            a(0);
            throw null;
        } else if (dVar != null) {
            this.f397d = dVar;
        } else {
            a(1);
            throw null;
        }
    }

    public static String a(k kVar) {
        if (kVar != null) {
            try {
                String str = c.b.a(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
                if (str != null) {
                    return str;
                }
                a(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = kVar.getClass().getSimpleName() + " " + kVar.d();
                if (str2 != null) {
                    return str2;
                }
                a(6);
                throw null;
            }
        } else {
            a(4);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.k
    public k a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.k
    public d d() {
        d dVar = this.f397d;
        if (dVar != null) {
            return dVar;
        }
        a(2);
        throw null;
    }

    public String toString() {
        return a(this);
    }
}

package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.m.d0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class g0 extends e0 implements a.a.a.a.v0.b.g0 {
    public d0 o;
    public final a.a.a.a.v0.b.g0 p;

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: a.a.a.a.v0.b.g0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(a.a.a.a.v0.b.f0 r13, a.a.a.a.v0.b.b1.h r14, a.a.a.a.v0.b.v r15, a.a.a.a.v0.b.a1 r16, boolean r17, boolean r18, boolean r19, a.a.a.a.v0.b.b.a r20, a.a.a.a.v0.b.g0 r21, a.a.a.a.v0.b.m0 r22) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.d1.g0.<init>(a.a.a.a.v0.b.f0, a.a.a.a.v0.b.b1.h, a.a.a.a.v0.b.v, a.a.a.a.v0.b.a1, boolean, boolean, boolean, a.a.a.a.v0.b.b$a, a.a.a.a.v0.b.g0, a.a.a.a.v0.b.m0):void");
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.g0 a() {
        a.a.a.a.v0.b.g0 g0Var = this.p;
        if (g0Var != null) {
            return g0Var;
        }
        a(8);
        throw null;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return mVar.a((a.a.a.a.v0.b.g0) this, (Object) d2);
    }

    public void a(d0 d0Var) {
        if (d0Var == null) {
            d0Var = a0().c();
        }
        this.o = d0Var;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.a
    public Collection<? extends a.a.a.a.v0.b.g0> f() {
        return super.a(true);
    }

    @Override // a.a.a.a.v0.b.a
    public d0 h() {
        return this.o;
    }

    @Override // a.a.a.a.v0.b.a
    public List<w0> j() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(7);
        throw null;
    }
}

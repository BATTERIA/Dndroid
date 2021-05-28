package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.y0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import java.util.Collections;
import java.util.List;

public abstract class p0 extends n implements y0 {

    /* renamed from: g  reason: collision with root package name */
    public d0 f404g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(k kVar, h hVar, d dVar, d0 d0Var, m0 m0Var) {
        super(kVar, hVar, dVar, m0Var);
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
            this.f404g = d0Var;
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.a
    public i0 J() {
        return null;
    }

    @Override // a.a.a.a.v0.b.y0
    public boolean R() {
        return false;
    }

    @Override // a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        return null;
    }

    @Override // a.a.a.a.v0.b.v0
    public d0 c() {
        d0 d0Var = this.f404g;
        if (d0Var != null) {
            return d0Var;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 g0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.a
    public d0 h() {
        d0 c2 = c();
        if (c2 != null) {
            return c2;
        }
        a(9);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public List<w0> j() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(6);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public List<r0> k() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(8);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public boolean s0() {
        return false;
    }
}

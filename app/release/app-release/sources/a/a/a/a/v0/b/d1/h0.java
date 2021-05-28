package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.u.a;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class h0 extends e0 implements a.a.a.a.v0.b.h0 {
    public w0 o;
    public final a.a.a.a.v0.b.h0 p;

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: a.a.a.a.v0.b.h0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0(a.a.a.a.v0.b.f0 r13, a.a.a.a.v0.b.b1.h r14, a.a.a.a.v0.b.v r15, a.a.a.a.v0.b.a1 r16, boolean r17, boolean r18, boolean r19, a.a.a.a.v0.b.b.a r20, a.a.a.a.v0.b.h0 r21, a.a.a.a.v0.b.m0 r22) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.d1.h0.<init>(a.a.a.a.v0.b.f0, a.a.a.a.v0.b.b1.h, a.a.a.a.v0.b.v, a.a.a.a.v0.b.a1, boolean, boolean, boolean, a.a.a.a.v0.b.b$a, a.a.a.a.v0.b.h0, a.a.a.a.v0.b.m0):void");
    }

    public static o0 a(a.a.a.a.v0.b.h0 h0Var, d0 d0Var, h hVar) {
        if (h0Var == null) {
            a(7);
            throw null;
        } else if (d0Var == null) {
            a(8);
            throw null;
        } else if (hVar != null) {
            return new o0(h0Var, null, 0, hVar, d.d("<set-?>"), d0Var, false, false, false, null, m0.f491a);
        } else {
            a(9);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.d1.e0, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.h0 a() {
        a.a.a.a.v0.b.h0 h0Var = this.p;
        if (h0Var != null) {
            return h0Var;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return mVar.a((a.a.a.a.v0.b.h0) this, (Object) d2);
    }

    public void a(w0 w0Var) {
        if (w0Var != null) {
            this.o = w0Var;
        } else {
            a(6);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.a
    public Collection<? extends a.a.a.a.v0.b.h0> f() {
        return super.a(false);
    }

    @Override // a.a.a.a.v0.b.a
    public d0 h() {
        k0 j = a.b(this).j();
        if (j != null) {
            return j;
        }
        a(12);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public List<w0> j() {
        w0 w0Var = this.o;
        if (w0Var != null) {
            List<w0> singletonList = Collections.singletonList(w0Var);
            if (singletonList != null) {
                return singletonList;
            }
            a(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}

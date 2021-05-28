package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class d extends m implements i0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a.a.a.a.v0.f.d f365e = a.a.a.a.v0.f.d.d("<this>");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(hVar, f365e);
        if (hVar != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.a
    public i0 J() {
        return null;
    }

    @Override // a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public a a() {
        return this;
    }

    /* Return type fixed from 'a.a.a.a.v0.b.i0' to match base method */
    @Override // a.a.a.a.v0.b.o0, a.a.a.a.v0.b.i0
    public a a(a1 a1Var) {
        g1 g1Var;
        d0 d0Var;
        if (a1Var == null) {
            a(1);
            throw null;
        } else if (a1Var.b()) {
            return this;
        } else {
            if (b() instanceof e) {
                d0Var = c();
                g1Var = g1.OUT_VARIANCE;
            } else {
                d0Var = c();
                g1Var = g1.INVARIANT;
            }
            d0 b = a1Var.b(d0Var, g1Var);
            if (b == null) {
                return null;
            }
            return b == c() ? this : new i0(b(), new a.a.a.a.v0.j.w.o.h(b), y());
        }
    }

    @Override // a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    /* renamed from: a  reason: collision with other method in class */
    public k m5a() {
        return this;
    }

    @Override // a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        return null;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    @Override // a.a.a.a.v0.b.v0
    public d0 c() {
        d0 c2 = getValue().c();
        if (c2 != null) {
            return c2;
        }
        a(3);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public Collection<? extends a> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        a(5);
        throw null;
    }

    @Override // a.a.a.a.v0.b.o
    public a.a.a.a.v0.b.a1 g() {
        a.a.a.a.v0.b.a1 a1Var = z0.f516f;
        if (a1Var != null) {
            return a1Var;
        }
        a(6);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 g0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.a
    public d0 h() {
        return c();
    }

    @Override // a.a.a.a.v0.b.a
    public List<w0> j() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public List<r0> k() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(2);
        throw null;
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        return m0.f491a;
    }

    @Override // a.a.a.a.v0.b.a
    public boolean s0() {
        return false;
    }
}

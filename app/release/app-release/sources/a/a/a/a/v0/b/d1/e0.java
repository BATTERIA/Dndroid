package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.f.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class e0 extends n implements a.a.a.a.v0.b.e0 {

    /* renamed from: g  reason: collision with root package name */
    public boolean f368g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f369h;
    public final v i;
    public final f0 j;
    public final boolean k;
    public final b.a l;
    public a1 m;
    public s n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(v vVar, a1 a1Var, f0 f0Var, h hVar, d dVar, boolean z, boolean z2, boolean z3, b.a aVar, m0 m0Var) {
        super(f0Var.b(), hVar, dVar, m0Var);
        if (vVar == null) {
            a(0);
            throw null;
        } else if (a1Var == null) {
            a(1);
            throw null;
        } else if (f0Var == null) {
            a(2);
            throw null;
        } else if (hVar == null) {
            a(3);
            throw null;
        } else if (dVar == null) {
            a(4);
            throw null;
        } else if (m0Var != null) {
            this.n = null;
            this.i = vVar;
            this.m = a1Var;
            this.j = f0Var;
            this.f368g = z;
            this.f369h = z2;
            this.k = z3;
            this.l = aVar;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i3 = 2;
                break;
            case 7:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i2) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s
    public s G() {
        return this.n;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return this.f369h;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 J() {
        return a0().J();
    }

    @Override // a.a.a.a.v0.b.s
    public boolean L() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean M() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean Q() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean S() {
        return false;
    }

    @Override // a.a.a.a.v0.b.b
    public b a(k kVar, v vVar, a1 a1Var, b.a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public abstract a.a.a.a.v0.b.e0 a();

    /* Return type fixed from 'a.a.a.a.v0.b.s' to match base method */
    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.o0
    public a a(a.a.a.a.v0.m.a1 a1Var) {
        if (a1Var == null) {
            a(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        return null;
    }

    public Collection<a.a.a.a.v0.b.e0> a(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (f0 f0Var : a0().f()) {
            Object w = z ? f0Var.w() : f0Var.i();
            if (w != null) {
                arrayList.add(w);
            }
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.b
    public void a(Collection<? extends b> collection) {
        if (collection == null) {
            a(14);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e0
    public f0 a0() {
        f0 f0Var = this.j;
        if (f0Var != null) {
            return f0Var;
        }
        a(12);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e0
    public boolean e0() {
        return this.f368g;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean f0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u
    public a1 g() {
        a1 a1Var = this.m;
        if (a1Var != null) {
            return a1Var;
        }
        a(10);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 g0() {
        return a0().g0();
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

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.u
    public v o() {
        v vVar = this.i;
        if (vVar != null) {
            return vVar;
        }
        a(9);
        throw null;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean p() {
        return this.k;
    }

    @Override // a.a.a.a.v0.b.s
    public s.a<? extends s> s() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // a.a.a.a.v0.b.a
    public boolean s0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.b
    public b.a t() {
        b.a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        a(6);
        throw null;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean x0() {
        return false;
    }
}

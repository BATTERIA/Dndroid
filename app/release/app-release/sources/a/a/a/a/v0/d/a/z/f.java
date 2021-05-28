package a.a.a.a.v0.d.a.z;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.j0;
import a.a.a.a.v0.b.d1.s;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.j;
import e.f.a.g;
import java.util.List;

public class f extends j0 implements b {
    public static final a.AbstractC0014a<w0> G = new a();
    public b F;

    public static class a implements a.AbstractC0014a<w0> {
    }

    public enum b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: c  reason: collision with root package name */
        public final boolean f869c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f870d;

        /* access modifiers changed from: public */
        b(boolean z, boolean z2) {
            this.f869c = z;
            this.f870d = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(k kVar, l0 l0Var, h hVar, d dVar, b.a aVar, m0 m0Var) {
        super(kVar, l0Var, hVar, dVar, aVar, m0Var);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (aVar == null) {
            a(3);
            throw null;
        } else if (m0Var != null) {
            this.F = null;
        } else {
            a(4);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 12 || i == 17 || i == 20) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.d1.j0, a.a.a.a.v0.b.d1.s
    public s a(k kVar, a.a.a.a.v0.b.s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            a(13);
            throw null;
        } else if (aVar == null) {
            a(14);
            throw null;
        } else if (hVar == null) {
            a(15);
            throw null;
        } else if (m0Var != null) {
            l0 l0Var = (l0) sVar;
            if (dVar == null) {
                dVar = d();
            }
            f fVar = new f(kVar, l0Var, hVar, dVar, aVar, m0Var);
            b bVar = this.F;
            fVar.a(bVar.f869c, bVar.f870d);
            return fVar;
        } else {
            a(16);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.a
    public boolean s0() {
        return this.F.f870d;
    }

    @Override // a.a.a.a.v0.d.a.z.b
    public b a(d0 d0Var, List list, d0 d0Var2, j jVar) {
        i0 i0Var;
        if (list == null) {
            a(18);
            throw null;
        } else if (d0Var2 != null) {
            List<w0> a2 = g.a(list, j(), this);
            if (d0Var == null) {
                i0Var = null;
            } else if (h.b != null) {
                i0Var = g.a(this, d0Var, h.a.f321a);
            } else {
                throw null;
            }
            f fVar = (f) s().a(a2).a(d0Var2).b(i0Var).b().c().a();
            if (jVar != null) {
                fVar.a((a.AbstractC0014a) jVar.f2088c, (Object) jVar.f2089d);
            }
            if (fVar != null) {
                return fVar;
            }
            a(20);
            throw null;
        } else {
            a(19);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r3.b.a(r4) == false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005e A[SYNTHETIC] */
    @Override // a.a.a.a.v0.b.d1.j0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.a.a.v0.b.d1.j0 a(a.a.a.a.v0.b.i0 r2, a.a.a.a.v0.b.i0 r3, java.util.List<? extends a.a.a.a.v0.b.r0> r4, java.util.List<a.a.a.a.v0.b.w0> r5, a.a.a.a.v0.m.d0 r6, a.a.a.a.v0.b.v r7, a.a.a.a.v0.b.a1 r8, java.util.Map<? extends a.a.a.a.v0.b.a.AbstractC0014a<?>, ?> r9) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.z.f.a(a.a.a.a.v0.b.i0, a.a.a.a.v0.b.i0, java.util.List, java.util.List, a.a.a.a.v0.m.d0, a.a.a.a.v0.b.v, a.a.a.a.v0.b.a1, java.util.Map):a.a.a.a.v0.b.d1.j0");
    }

    public void a(boolean z, boolean z2) {
        b bVar = z ? z2 ? b.STABLE_SYNTHESIZED : b.STABLE_DECLARED : z2 ? b.NON_STABLE_SYNTHESIZED : b.NON_STABLE_DECLARED;
        if (bVar != null) {
            this.F = bVar;
            return;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
    }
}

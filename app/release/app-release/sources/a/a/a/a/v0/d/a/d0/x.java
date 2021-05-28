package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.d.a.s;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.m.b1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.i1.o;
import a.a.a.a.v0.m.k0;
import a.h;
import a.w.b.l;
import a.w.c.i;
import e.a.a.a.a;
import e.f.a.g;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final b f778a;
    public static final b b;

    static {
        b bVar = s.j;
        i.a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        f778a = new b(bVar);
        b bVar2 = s.k;
        i.a((Object) bVar2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        b = new b(bVar2);
    }

    public static final <T> c<T> a(T t) {
        return new c<>(t, null);
    }

    public static final d0 a(d0 d0Var, l<? super Integer, d> lVar) {
        if (d0Var == null) {
            i.a("$this$enhance");
            throw null;
        } else if (lVar != null) {
            k a2 = a(d0Var.K0(), lVar, 0);
            d0 a3 = a2.a();
            if (a2.f746c) {
                return a3;
            }
            return null;
        } else {
            i.a("qualifiers");
            throw null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x01ce */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.d.a.d0.t a(a.a.a.a.v0.m.k0 r19, a.w.b.l<? super java.lang.Integer, a.a.a.a.v0.d.a.d0.d> r20, int r21, a.a.a.a.v0.d.a.d0.v r22) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.d0.x.a(a.a.a.a.v0.m.k0, a.w.b.l, int, a.a.a.a.v0.d.a.d0.v):a.a.a.a.v0.d.a.d0.t");
    }

    public static final k a(f1 f1Var, l<? super Integer, d> lVar, int i) {
        f1 f1Var2;
        boolean z = false;
        if (g.f(f1Var)) {
            return new k(f1Var, 1, false);
        }
        if (f1Var instanceof a.a.a.a.v0.m.x) {
            a.a.a.a.v0.m.x xVar = (a.a.a.a.v0.m.x) f1Var;
            t a2 = a(xVar.f1956d, lVar, i, v.FLEXIBLE_LOWER);
            t a3 = a(xVar.f1957e, lVar, i, v.FLEXIBLE_UPPER);
            boolean z2 = a2.b == a3.b;
            if (!a.s.f2103a || z2) {
                if (a2.f746c || a3.f746c) {
                    z = true;
                }
                d0 c2 = g.c((d0) a2.f771d);
                if (c2 == null) {
                    c2 = g.c((d0) a3.f771d);
                }
                if (z) {
                    if (f1Var instanceof a.a.a.a.v0.d.a.a0.o.i) {
                        f1Var2 = new a.a.a.a.v0.d.a.a0.o.i(a2.f771d, a3.f771d);
                    } else {
                        f1Var2 = e0.a(a2.f771d, a3.f771d);
                    }
                    f1Var = g.b(f1Var2, c2);
                }
                return new k(f1Var, a2.b, z);
            }
            StringBuilder a4 = a.a("Different tree sizes of bounds: ", "lower = (");
            a4.append(xVar.f1956d);
            a4.append(", ");
            a4.append(a2.b);
            a4.append("), ");
            a4.append("upper = (");
            a4.append(xVar.f1957e);
            a4.append(", ");
            a4.append(a3.b);
            a4.append(')');
            throw new AssertionError(a4.toString());
        } else if (f1Var instanceof k0) {
            return a((k0) f1Var, lVar, i, v.INFLEXIBLE);
        } else {
            throw new h();
        }
    }

    public static final boolean a(d0 d0Var) {
        if (d0Var != null) {
            return a(o.f1893a, d0Var);
        }
        i.a("$this$hasEnhancedNullability");
        throw null;
    }

    public static final boolean a(b1 b1Var, a.a.a.a.v0.m.k1.g gVar) {
        if (b1Var == null) {
            i.a("$this$hasEnhancedNullability");
            throw null;
        } else if (gVar != null) {
            b bVar = s.j;
            i.a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
            return b1Var.a(gVar, bVar);
        } else {
            i.a("type");
            throw null;
        }
    }

    public static final boolean a(v vVar) {
        if (vVar != null) {
            return vVar != v.INFLEXIBLE;
        }
        i.a("$this$shouldEnhance");
        throw null;
    }
}

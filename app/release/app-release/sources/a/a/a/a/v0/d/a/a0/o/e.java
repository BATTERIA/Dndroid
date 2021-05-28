package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.a0.m;
import a.a.a.a.v0.d.a.c0.f;
import a.a.a.a.v0.d.a.c0.j;
import a.a.a.a.v0.d.a.c0.u;
import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.d.a.c0.z;
import a.a.a.a.v0.d.a.y.l;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.w;
import a.w.c.i;
import e.f.a.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final h f665a;
    public final m b;

    public e(h hVar, m mVar) {
        if (hVar == null) {
            i.a("c");
            throw null;
        } else if (mVar != null) {
            this.f665a = hVar;
            this.b = mVar;
        } else {
            i.a("typeParameterResolver");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01cb, code lost:
        if ((!r1.isEmpty()) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0113, code lost:
        if (r10 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        if (r1 != null) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0354 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.m.k0 a(a.a.a.a.v0.d.a.c0.j r19, a.a.a.a.v0.d.a.a0.o.a r20, a.a.a.a.v0.m.k0 r21) {
        /*
        // Method dump skipped, instructions count: 853
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.o.e.a(a.a.a.a.v0.d.a.c0.j, a.a.a.a.v0.d.a.a0.o.a, a.a.a.a.v0.m.k0):a.a.a.a.v0.m.k0");
    }

    public final s0 a(j jVar) {
        a a2 = a.a(new b(jVar.P()));
        i.a((Object) a2, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        s0 n = this.f665a.f562c.f547d.a().m.a(a2, g.c((Object) 0)).n();
        i.a((Object) n, "c.components.deserialize…istOf(0)).typeConstructor");
        return n;
    }

    public final d0 a(f fVar, a aVar, boolean z) {
        if (fVar == null) {
            i.a("arrayType");
            throw null;
        } else if (aVar != null) {
            v u = fVar.u();
            u uVar = (u) (!(u instanceof u) ? null : u);
            a.a.a.a.v0.a.i c2 = uVar != null ? uVar.c() : null;
            if (c2 != null) {
                k0 a2 = this.f665a.f562c.o.m().a(c2);
                i.a((Object) a2, "c.module.builtIns.getPri…KotlinType(primitiveType)");
                return aVar.f655c ? a2 : e0.a(a2, a2.a(true));
            }
            d0 a3 = a(u, g.a(l.COMMON, aVar.f655c, (r0) null, 2));
            if (aVar.f655c) {
                k0 a4 = this.f665a.f562c.o.m().a(z ? g1.OUT_VARIANCE : g1.INVARIANT, a3);
                i.a((Object) a4, "c.module.builtIns.getArr…ctionKind, componentType)");
                return a4;
            }
            k0 a5 = this.f665a.f562c.o.m().a(g1.INVARIANT, a3);
            i.a((Object) a5, "c.module.builtIns.getArr…INVARIANT, componentType)");
            return e0.a(a5, this.f665a.f562c.o.m().a(g1.OUT_VARIANCE, a3).a(true));
        } else {
            i.a("attr");
            throw null;
        }
    }

    public final d0 a(v vVar, a aVar) {
        d0 a2;
        StringBuilder sb;
        k0 k0Var;
        if (aVar == null) {
            i.a("attr");
            throw null;
        } else if (vVar instanceof u) {
            a.a.a.a.v0.a.i c2 = ((u) vVar).c();
            if (c2 != null) {
                k0Var = this.f665a.f562c.o.m().b(c2);
            } else {
                k0Var = this.f665a.f562c.o.m().j();
            }
            i.a((Object) k0Var, "if (primitiveType != nul….module.builtIns.unitType");
            return k0Var;
        } else {
            boolean z = false;
            if (vVar instanceof j) {
                j jVar = (j) vVar;
                if (!aVar.f655c && aVar.f654a != l.SUPERTYPE) {
                    z = true;
                }
                boolean N = jVar.N();
                if (N || z) {
                    k0 a3 = a(jVar, aVar.a(b.FLEXIBLE_LOWER_BOUND), (k0) null);
                    if (a3 != null) {
                        k0 a4 = a(jVar, aVar.a(b.FLEXIBLE_UPPER_BOUND), a3);
                        if (a4 != null) {
                            return N ? new i(a3, a4) : e0.a(a3, a4);
                        }
                        sb = new StringBuilder();
                    } else {
                        sb = new StringBuilder();
                    }
                    sb.append("Unresolved java class ");
                } else {
                    k0 a5 = a(jVar, aVar, (k0) null);
                    if (a5 != null) {
                        return a5;
                    }
                    sb = e.a.a.a.a.a("Unresolved java class ");
                }
                sb.append(jVar.F());
                k0 b2 = w.b(sb.toString());
                i.a((Object) b2, "ErrorUtils.createErrorTy…vaType.presentableText}\")");
                return b2;
            } else if (vVar instanceof f) {
                return a((f) vVar, aVar, false);
            } else {
                if (vVar instanceof z) {
                    v r = ((z) vVar).r();
                    if (!(r == null || (a2 = a(r, aVar)) == null)) {
                        return a2;
                    }
                } else if (vVar != null) {
                    throw new UnsupportedOperationException("Unsupported type: " + vVar);
                }
                k0 d2 = this.f665a.f562c.o.m().d();
                i.a((Object) d2, "c.module.builtIns.defaultBound");
                return d2;
            }
        }
    }
}

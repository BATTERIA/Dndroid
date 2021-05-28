package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.b1.k;
import a.a.a.a.v0.b.b1.l;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.m1.c;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;

public class a1 {
    public static final a1 b = a(y0.f1959a);

    /* renamed from: a  reason: collision with root package name */
    public final y0 f1815a;

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public enum b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public a1(y0 y0Var) {
        if (y0Var != null) {
            this.f1815a = y0Var;
        } else {
            a(5);
            throw null;
        }
    }

    public static a1 a(d0 d0Var) {
        if (d0Var != null) {
            return a(u0.b.a(d0Var.I0(), d0Var.H0()));
        }
        a(4);
        throw null;
    }

    public static a1 a(y0 y0Var) {
        if (y0Var != null) {
            return new a1(y0Var);
        }
        a(0);
        throw null;
    }

    public static a1 a(y0 y0Var, y0 y0Var2) {
        if (y0Var == null) {
            a(1);
            throw null;
        } else if (y0Var2 != null) {
            return a(t.a(y0Var, y0Var2));
        } else {
            a(2);
            throw null;
        }
    }

    public static g1 a(g1 g1Var, g1 g1Var2) {
        if (g1Var == null) {
            a(28);
            throw null;
        } else if (g1Var2 != null) {
            g1 g1Var3 = g1.INVARIANT;
            if (g1Var == g1Var3) {
                if (g1Var2 != null) {
                    return g1Var2;
                }
                a(30);
                throw null;
            } else if (g1Var2 == g1Var3) {
                if (g1Var != null) {
                    return g1Var;
                }
                a(31);
                throw null;
            } else if (g1Var != g1Var2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + g1Var + "' and " + "projection kind '" + g1Var2 + "' cannot be combined");
            } else if (g1Var2 != null) {
                return g1Var2;
            } else {
                a(32);
                throw null;
            }
        } else {
            a(29);
            throw null;
        }
    }

    public static g1 a(g1 g1Var, v0 v0Var) {
        if (g1Var == null) {
            a(25);
            throw null;
        } else if (v0Var == null) {
            a(26);
            throw null;
        } else if (!v0Var.b()) {
            return a(g1Var, v0Var.a());
        } else {
            g1 g1Var2 = g1.OUT_VARIANCE;
            if (g1Var2 != null) {
                return g1Var2;
            }
            a(27);
            throw null;
        }
    }

    public static String a(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!a.a.a.a.v0.m.l1.a.a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r12) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.a1.a(int):void");
    }

    public static b b(g1 g1Var, g1 g1Var2) {
        return (g1Var == g1.IN_VARIANCE && g1Var2 == g1.OUT_VARIANCE) ? b.OUT_IN_IN_POSITION : (g1Var == g1.OUT_VARIANCE && g1Var2 == g1.IN_VARIANCE) ? b.IN_IN_OUT_POSITION : b.NO_CONFLICT;
    }

    public d0 a(d0 d0Var, g1 g1Var) {
        if (d0Var == null) {
            a(7);
            throw null;
        } else if (g1Var == null) {
            a(8);
            throw null;
        } else if (!b()) {
            try {
                d0 c2 = a(new x0(g1Var, d0Var), 0).c();
                if (c2 != null) {
                    return c2;
                }
                a(10);
                throw null;
            } catch (a e2) {
                k0 b2 = w.b(e2.getMessage());
                if (b2 != null) {
                    return b2;
                }
                a(11);
                throw null;
            }
        } else if (d0Var != null) {
            return d0Var;
        } else {
            a(9);
            throw null;
        }
    }

    public v0 a(v0 v0Var) {
        if (v0Var == null) {
            a(15);
            throw null;
        } else if (b()) {
            return v0Var;
        } else {
            try {
                return a(v0Var, 0);
            } catch (a unused) {
                return null;
            }
        }
    }

    public y0 a() {
        y0 y0Var = this.f1815a;
        if (y0Var != null) {
            return y0Var;
        }
        a(6);
        throw null;
    }

    public d0 b(d0 d0Var, g1 g1Var) {
        x0 x0Var;
        if (d0Var == null) {
            a(12);
            throw null;
        } else if (g1Var != null) {
            v0 a2 = a((v0) new x0(g1Var, a().a(d0Var, g1Var)));
            if (this.f1815a.a() || this.f1815a.b()) {
                boolean b2 = this.f1815a.b();
                if (a2 == null) {
                    a2 = null;
                } else if (!a2.b()) {
                    d0 c2 = a2.c();
                    i.a((Object) c2, "typeProjection.type");
                    if (c1.a(c2, a.a.a.a.v0.m.m1.b.f1928c)) {
                        g1 a3 = a2.a();
                        i.a((Object) a3, "typeProjection.projectionKind");
                        if (a3 == g1.OUT_VARIANCE) {
                            x0Var = new x0(a3, a.a.a.a.v0.m.l1.a.a(c2).b);
                        } else if (b2) {
                            x0Var = new x0(a3, a.a.a.a.v0.m.l1.a.a(c2).f1927a);
                        } else {
                            a1 a4 = a((y0) new c());
                            i.a((Object) a4, "TypeSubstitutor.create(o…ojection\n        }\n    })");
                            a2 = a4.a(a2);
                        }
                        a2 = x0Var;
                    }
                }
            }
            if (a2 == null) {
                return null;
            }
            return a2.c();
        } else {
            a(13);
            throw null;
        }
    }

    public boolean b() {
        return this.f1815a.d();
    }

    public final v0 a(v0 v0Var, int i) {
        d0 d0Var = null;
        if (v0Var != null) {
            y0 y0Var = this.f1815a;
            if (i > 100) {
                StringBuilder a2 = e.a.a.a.a.a("Recursion too deep. Most likely infinite loop while substituting ");
                a2.append(a((Object) v0Var));
                a2.append("; substitution: ");
                a2.append(a((Object) y0Var));
                throw new IllegalStateException(a2.toString());
            } else if (v0Var.b()) {
                return v0Var;
            } else {
                d0 c2 = v0Var.c();
                if (c2 instanceof d1) {
                    d1 d1Var = (d1) c2;
                    f1 r0 = d1Var.r0();
                    d0 w0 = d1Var.w0();
                    v0 a3 = a(new x0(v0Var.a(), r0), i + 1);
                    return new x0(a3.a(), g.b(a3.c().K0(), b(w0, v0Var.a())));
                } else if (g.e(c2) || (c2.K0() instanceof j0)) {
                    return v0Var;
                } else {
                    v0 a4 = this.f1815a.a(c2);
                    g1 a5 = v0Var.a();
                    if (a4 == null && g.g(c2)) {
                        f1 K0 = c2.K0();
                        if (!(K0 instanceof o)) {
                            K0 = null;
                        }
                        o oVar = (o) K0;
                        if (!(oVar != null ? oVar.u0() : false)) {
                            x a6 = g.a(c2);
                            int i2 = i + 1;
                            v0 a7 = a(new x0(a5, a6.f1956d), i2);
                            v0 a8 = a(new x0(a5, a6.f1957e), i2);
                            g1 a9 = a7.a();
                            if (a7.c() == a6.f1956d && a8.c() == a6.f1957e) {
                                return v0Var;
                            }
                            return new x0(a9, e0.a(g.b(a7.c()), g.b(a8.c())));
                        }
                    }
                    if (a.a.a.a.v0.a.g.d(c2) || g.f(c2)) {
                        return v0Var;
                    }
                    if (a4 != null) {
                        b b2 = b(a5, a4.a());
                        if (!g.d(c2)) {
                            int ordinal = b2.ordinal();
                            if (ordinal == 1) {
                                return new x0(g1.OUT_VARIANCE, c2.I0().m().g());
                            }
                            if (ordinal == 2) {
                                throw new a("Out-projection in in-position");
                            }
                        }
                        f1 K02 = c2.K0();
                        if (!(K02 instanceof o)) {
                            K02 = null;
                        }
                        o oVar2 = (o) K02;
                        if (oVar2 == null || !oVar2.u0()) {
                            oVar2 = null;
                        }
                        if (a4.b()) {
                            return a4;
                        }
                        d0 a10 = oVar2 != null ? oVar2.a(a4.c()) : c1.b(a4.c(), c2.J0());
                        if (!c2.y().isEmpty()) {
                            h a11 = this.f1815a.a(c2.y());
                            if (a11 != null) {
                                if (a11.b(a.a.a.a.v0.a.g.k.F)) {
                                    a11 = new l(a11, new z0());
                                }
                                a10 = a.a.a.a.v0.m.l1.a.a(a10, new k(a10.y(), a11));
                            } else {
                                a(23);
                                throw null;
                            }
                        }
                        if (b2 == b.NO_CONFLICT) {
                            a5 = a(a5, a4.a());
                        }
                        return new x0(a5, a10);
                    }
                    d0 c3 = v0Var.c();
                    g1 a12 = v0Var.a();
                    if (c3.I0().c() instanceof r0) {
                        return v0Var;
                    }
                    f1 K03 = c3.K0();
                    if (!(K03 instanceof a)) {
                        K03 = null;
                    }
                    a aVar = (a) K03;
                    k0 k0Var = aVar != null ? aVar.f1812e : null;
                    if (k0Var != null) {
                        d0Var = b(k0Var, g1.INVARIANT);
                    }
                    List<r0> d2 = c3.I0().d();
                    List<v0> H0 = c3.H0();
                    ArrayList arrayList = new ArrayList(d2.size());
                    boolean z = false;
                    for (int i3 = 0; i3 < d2.size(); i3++) {
                        r0 r0Var = d2.get(i3);
                        v0 v0Var2 = H0.get(i3);
                        v0 a13 = a(v0Var2, i + 1);
                        int ordinal2 = b(r0Var.F(), a13.a()).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1 || ordinal2 == 2) {
                                a13 = c1.a(r0Var);
                            }
                        } else if (r0Var.F() != g1.INVARIANT && !a13.b()) {
                            a13 = new x0(g1.INVARIANT, a13.c());
                        }
                        if (a13 != v0Var2) {
                            z = true;
                        }
                        arrayList.add(a13);
                    }
                    if (z) {
                        H0 = arrayList;
                    }
                    d0 a14 = g.a(c3, H0, this.f1815a.a(c3.y()));
                    if ((a14 instanceof k0) && (d0Var instanceof k0)) {
                        a14 = n0.a((k0) a14, (k0) d0Var);
                    }
                    return new x0(a12, a14);
                }
            }
        } else {
            a(16);
            throw null;
        }
    }
}

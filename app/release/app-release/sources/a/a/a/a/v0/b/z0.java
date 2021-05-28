package a.a.a.a.v0.b;

import a.a.a.a.v0.b.d1.l0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.n.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f512a = new d("private", false);
    public static final a1 b = new e("private_to_this", false);

    /* renamed from: c  reason: collision with root package name */
    public static final a1 f513c = new f("protected", true);

    /* renamed from: d  reason: collision with root package name */
    public static final a1 f514d = new g("internal", false);

    /* renamed from: e  reason: collision with root package name */
    public static final a1 f515e = new h("public", true);

    /* renamed from: f  reason: collision with root package name */
    public static final a1 f516f = new i("local", false);

    /* renamed from: g  reason: collision with root package name */
    public static final a1 f517g = new j("inherited", false);

    /* renamed from: h  reason: collision with root package name */
    public static final a1 f518h = new k("invisible_fake", false);
    public static final a1 i = new l("unknown", false);
    public static final Map<a1, Integer> j;
    public static final a1 k = f515e;
    public static final a.a.a.a.v0.j.w.o.e l = new a();
    public static final a.a.a.a.v0.j.w.o.e m = new b();
    @Deprecated
    public static final a.a.a.a.v0.j.w.o.e n = new c();
    public static final a.a.a.a.v0.n.h o;

    public static class a implements a.a.a.a.v0.j.w.o.e {
        @Override // a.a.a.a.v0.j.w.o.e
        public d0 c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class b implements a.a.a.a.v0.j.w.o.e {
        @Override // a.a.a.a.v0.j.w.o.e
        public d0 c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class c implements a.a.a.a.v0.j.w.o.e {
        @Override // a.a.a.a.v0.j.w.o.e
        public d0 c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class d extends a1 {
        public d(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0051 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0065 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.a.a.a.v0.b.o */
        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: a.a.a.a.v0.b.k */
        /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: a.a.a.a.v0.b.k */
        /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: a.a.a.a.v0.b.k */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == 0) {
                a(1);
                throw null;
            } else if (kVar != null) {
                if (a.a.a.a.v0.j.g.p(oVar)) {
                    if (kVar != null) {
                        if (a.a.a.a.v0.j.g.c(kVar) != n0.f492a) {
                            return z0.a((k) oVar, kVar);
                        }
                    } else {
                        a(0);
                        throw null;
                    }
                }
                if (oVar instanceof j) {
                    i b = ((j) oVar).b();
                    if (a.a.a.a.v0.j.g.o(b) && a.a.a.a.v0.j.g.p(b) && (kVar instanceof j) && a.a.a.a.v0.j.g.p(kVar.b()) && z0.a((k) oVar, kVar)) {
                        return true;
                    }
                }
                while (oVar != 0) {
                    oVar = oVar.b();
                    if (oVar instanceof e) {
                        if (!a.a.a.a.v0.j.g.k(oVar)) {
                            break;
                        }
                    }
                    if (oVar instanceof y) {
                        break;
                    }
                }
                if (oVar == 0) {
                    return false;
                }
                while (kVar != null) {
                    if (oVar == kVar) {
                        return true;
                    }
                    if (!(kVar instanceof y)) {
                        kVar = kVar.b();
                    } else if (!(oVar instanceof y) || !((y) oVar).e().equals(((y) kVar).e()) || !a.a.a.a.v0.j.g.a(kVar).equals(a.a.a.a.v0.j.g.a(oVar))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            } else {
                a(2);
                throw null;
            }
        }
    }

    public static class e extends a1 {
        public e(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public String a() {
            return "private/*private to this*/";
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            k a2;
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                if (z0.f512a.a(eVar, oVar, kVar)) {
                    if (eVar == z0.m) {
                        return true;
                    }
                    if (!(eVar == z0.l || (a2 = a.a.a.a.v0.j.g.a(oVar, e.class)) == null || !(eVar instanceof a.a.a.a.v0.j.w.o.g))) {
                        return ((a.a.a.a.v0.j.w.o.g) eVar).l().a().equals(a2.a());
                    }
                }
                return false;
            } else {
                a(1);
                throw null;
            }
        }
    }

    public static class f extends a1 {
        public f(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
            if (e.f.a.g.e(r0) == false) goto L_0x007c;
         */
        @Override // a.a.a.a.v0.b.a1
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(a.a.a.a.v0.j.w.o.e r7, a.a.a.a.v0.b.o r8, a.a.a.a.v0.b.k r9) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.z0.f.a(a.a.a.a.v0.j.w.o.e, a.a.a.a.v0.b.o, a.a.a.a.v0.b.k):boolean");
        }
    }

    public static class g extends a1 {
        public g(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                if (!a.a.a.a.v0.j.g.a(kVar).a(a.a.a.a.v0.j.g.a((k) oVar))) {
                    return false;
                }
                return z0.o.a(oVar, kVar);
            } else {
                a(1);
                throw null;
            }
        }
    }

    public static class h extends a1 {
        public h(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return true;
            } else {
                a(1);
                throw null;
            }
        }
    }

    public static class i extends a1 {
        public i(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar == null) {
                a(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    public static class j extends a1 {
        public j(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar == null) {
                a(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    public static class k extends a1 {
        public k(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                a(1);
                throw null;
            }
        }
    }

    public static class l extends a1 {
        public l(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return false;
            } else {
                a(1);
                throw null;
            }
        }
    }

    static {
        Collections.unmodifiableSet(e.f.a.g.i(f512a, b, f514d, f516f));
        HashMap e2 = a.a.a.a.v0.m.l1.a.e(4);
        e2.put(b, 0);
        e2.put(f512a, 0);
        e2.put(f514d, 1);
        e2.put(f513c, 1);
        e2.put(f515e, 2);
        j = Collections.unmodifiableMap(e2);
        Iterator it = ServiceLoader.load(a.a.a.a.v0.n.h.class, a.a.a.a.v0.n.h.class.getClassLoader()).iterator();
        o = it.hasNext() ? (a.a.a.a.v0.n.h) it.next() : h.a.f1972a;
    }

    public static o a(a.a.a.a.v0.j.w.o.e eVar, o oVar, k kVar) {
        o a2;
        if (oVar == null) {
            a(8);
            throw null;
        } else if (kVar != null) {
            k a3 = oVar.a();
            while (true) {
                o oVar2 = (o) a3;
                if (oVar2 != null && oVar2.g() != f516f) {
                    if (!oVar2.g().a(eVar, oVar2, kVar)) {
                        return oVar2;
                    }
                    a3 = a.a.a.a.v0.j.g.a(oVar2, o.class);
                }
            }
            if (!(oVar instanceof l0) || (a2 = a(eVar, ((l0) oVar).q0(), kVar)) == null) {
                return null;
            }
            return a2;
        } else {
            a(9);
            throw null;
        }
    }

    public static Integer a(a1 a1Var, a1 a1Var2) {
        if (a1Var == null) {
            a(12);
            throw null;
        } else if (a1Var2 != null) {
            Integer a2 = a1Var.a(a1Var2);
            if (a2 != null) {
                return a2;
            }
            Integer a3 = a1Var2.a(a1Var);
            if (a3 != null) {
                return Integer.valueOf(-a3.intValue());
            }
            return null;
        } else {
            a(13);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r4) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.z0.a(int):void");
    }

    public static boolean a(a1 a1Var) {
        if (a1Var != null) {
            return a1Var == f512a || a1Var == b;
        }
        a(14);
        throw null;
    }

    public static boolean a(k kVar, k kVar2) {
        if (kVar == null) {
            a(6);
            throw null;
        } else if (kVar2 != null) {
            n0 c2 = a.a.a.a.v0.j.g.c(kVar2);
            if (c2 != n0.f492a) {
                return c2.equals(a.a.a.a.v0.j.g.c(kVar));
            }
            return false;
        } else {
            a(7);
            throw null;
        }
    }

    public static boolean a(o oVar, k kVar) {
        if (oVar == null) {
            a(2);
            throw null;
        } else if (kVar != null) {
            return a(m, oVar, kVar) == null;
        } else {
            a(3);
            throw null;
        }
    }

    public static Integer b(a1 a1Var, a1 a1Var2) {
        int intValue;
        if (a1Var == null) {
            a(10);
            throw null;
        } else if (a1Var2 != null) {
            if (a1Var == a1Var2) {
                intValue = 0;
            } else {
                Integer num = j.get(a1Var);
                Integer num2 = j.get(a1Var2);
                if (num == null || num2 == null || num.equals(num2)) {
                    return null;
                }
                intValue = num.intValue() - num2.intValue();
            }
            return Integer.valueOf(intValue);
        } else {
            a(11);
            throw null;
        }
    }
}

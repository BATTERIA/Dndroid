package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g;
import a.w.c.f;
import a.w.c.i;
import e.f.a.g;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f1901a = new s();

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class a extends Enum<a> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f1902c;

        /* renamed from: d  reason: collision with root package name */
        public static final a f1903d;

        /* renamed from: e  reason: collision with root package name */
        public static final a f1904e;

        /* renamed from: f  reason: collision with root package name */
        public static final a f1905f;

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ a[] f1906g;

        /* renamed from: a.a.a.a.v0.m.i1.s$a$a  reason: collision with other inner class name */
        public static final class C0072a extends a {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            public C0072a(String str, int i) {
                super(str, i, null);
            }

            @Override // a.a.a.a.v0.m.i1.s.a
            public a a(f1 f1Var) {
                if (f1Var != null) {
                    return b(f1Var);
                }
                i.a("nextType");
                throw null;
            }
        }

        public static final class b extends a {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // a.a.a.a.v0.m.i1.s.a
            public a a(f1 f1Var) {
                if (f1Var != null) {
                    return this;
                }
                i.a("nextType");
                throw null;
            }
        }

        public static final class c extends a {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // a.a.a.a.v0.m.i1.s.a
            public a a(f1 f1Var) {
                if (f1Var != null) {
                    return b(f1Var);
                }
                i.a("nextType");
                throw null;
            }
        }

        public static final class d extends a {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // a.a.a.a.v0.m.i1.s.a
            public a a(f1 f1Var) {
                if (f1Var != null) {
                    a b = b(f1Var);
                    return b == a.f1903d ? this : b;
                }
                i.a("nextType");
                throw null;
            }
        }

        static {
            c cVar = new c("START", 0);
            f1902c = cVar;
            C0072a aVar = new C0072a("ACCEPT_NULL", 1);
            f1903d = aVar;
            d dVar = new d("UNKNOWN", 2);
            f1904e = dVar;
            b bVar = new b("NOT_NULL", 3);
            f1905f = bVar;
            f1906g = new a[]{cVar, aVar, dVar, bVar};
        }

        public /* synthetic */ a(String str, int i, f fVar) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1906g.clone();
        }

        public abstract a a(f1 f1Var);

        public final a b(f1 f1Var) {
            if (f1Var == null) {
                i.a("$this$resultNullability");
                throw null;
            } else if (f1Var.J0()) {
                return f1903d;
            } else {
                return a.a.a.a.v0.m.c.a(new b(false, true, false, null, 12), g.i(f1Var), g.b.C0071b.f1847a) ? f1905f : f1904e;
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x013e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x013e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [a.a.a.a.v0.m.i1.s] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15, types: [a.a.a.a.v0.m.d0, a.a.a.a.v0.m.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23, types: [a.a.a.a.v0.m.k0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.m.k0 a(java.util.List<? extends a.a.a.a.v0.m.k0> r18) {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.i1.s.a(java.util.List):a.a.a.a.v0.m.k0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:16:0x0051 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<a.a.a.a.v0.m.k0> a(java.util.Collection<? extends a.a.a.a.v0.m.k0> r8, a.w.b.p<? super a.a.a.a.v0.m.k0, ? super a.a.a.a.v0.m.k0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            a.w.c.i.a(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r8.next()
            a.a.a.a.v0.m.k0 r1 = (a.a.a.a.v0.m.k0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0024
        L_0x0022:
            r3 = 0
            goto L_0x0051
        L_0x0024:
            java.util.Iterator r2 = r0.iterator()
        L_0x0028:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r2.next()
            a.a.a.a.v0.m.k0 r5 = (a.a.a.a.v0.m.k0) r5
            if (r5 == r1) goto L_0x004e
            java.lang.String r6 = "lower"
            a.w.c.i.a(r5, r6)
            java.lang.String r6 = "upper"
            a.w.c.i.a(r1, r6)
            java.lang.Object r5 = r9.a(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0028
        L_0x0051:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.i1.s.a(java.util.Collection, a.w.b.p):java.util.Collection");
    }
}

package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final l<Integer, e> f1657a;
    public final l<Integer, h> b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, r0> f1658c;

    /* renamed from: d  reason: collision with root package name */
    public final l f1659d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f1660e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1661f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1662g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1663h;

    public static final class a extends j implements l<g0, List<? extends g0.b>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b0 f1664c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var) {
            super(1);
            this.f1664c = b0Var;
        }

        public final List<g0.b> a(g0 g0Var) {
            List<g0.b> list = null;
            if (g0Var != null) {
                List<g0.b> list2 = g0Var.f1034f;
                i.a((Object) list2, "argumentList");
                g0 a2 = g.a(g0Var, this.f1664c.f1659d.f1743f);
                if (a2 != null) {
                    list = a(a2);
                }
                if (list == null) {
                    list = a.t.l.f2119c;
                }
                return f.a((Collection) list2, (Iterable) list);
            }
            i.a("$this$collectAllArguments");
            throw null;
        }
    }

    public static final class b extends j implements a.w.b.a<List<? extends c>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b0 f1665c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g0 f1666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, g0 g0Var) {
            super(0);
            this.f1665c = b0Var;
            this.f1666d = g0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends c> a() {
            l lVar = this.f1665c.f1659d;
            return lVar.f1740c.f1735f.a(this.f1666d, lVar.f1741d);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x006d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Map<java.lang.Integer, a.a.a.a.v0.b.r0>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v15, types: [a.t.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b0(a.a.a.a.v0.k.b.l r2, a.a.a.a.v0.k.b.b0 r3, java.util.List r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.b0.<init>(a.a.a.a.v0.k.b.l, a.a.a.a.v0.k.b.b0, java.util.List, java.lang.String, java.lang.String, boolean, int):void");
    }

    public final k0 a(int i) {
        if (g.a(this.f1659d.f1741d, i).f1342c) {
            return this.f1659d.f1740c.f1737h.a();
        }
        return null;
    }

    public final k0 a(d0 d0Var, d0 d0Var2) {
        a.a.a.a.v0.a.g c2 = a.a.a.a.v0.m.l1.a.c(d0Var);
        a.a.a.a.v0.b.b1.h y = d0Var.y();
        d0 b2 = a.a.a.a.v0.a.f.b(d0Var);
        List<v0> a2 = f.a((List) a.a.a.a.v0.a.f.d(d0Var), 1);
        ArrayList arrayList = new ArrayList(g.a((Iterable) a2, 10));
        for (v0 v0Var : a2) {
            arrayList.add(v0Var.c());
        }
        return a.a.a.a.v0.a.f.a(c2, y, b2, arrayList, null, d0Var2, true).a(d0Var.J0());
    }

    public final List<r0> a() {
        return f.g(this.f1658c.values());
    }

    public final d0 b(g0 g0Var) {
        g0 g0Var2;
        if (g0Var != null) {
            boolean z = false;
            if (!((g0Var.f1033e & 2) == 2)) {
                return a(g0Var);
            }
            String a2 = this.f1659d.f1741d.a(g0Var.f1036h);
            k0 a3 = a(g0Var);
            a.a.a.a.v0.e.x0.e eVar = this.f1659d.f1743f;
            if (eVar != null) {
                if (g0Var.n()) {
                    g0Var2 = g0Var.i;
                } else {
                    if ((g0Var.f1033e & 8) == 8) {
                        z = true;
                    }
                    g0Var2 = z ? eVar.a(g0Var.j) : null;
                }
                if (g0Var2 != null) {
                    return this.f1659d.f1740c.k.a(g0Var, a2, a3, a(g0Var2));
                }
                i.a();
                throw null;
            }
            i.a("typeTable");
            throw null;
        }
        i.a("proto");
        throw null;
    }

    public final s0 b(int i) {
        s0 n;
        r0 r0Var = this.f1658c.get(Integer.valueOf(i));
        if (r0Var != null && (n = r0Var.n()) != null) {
            return n;
        }
        b0 b0Var = this.f1660e;
        if (b0Var != null) {
            return b0Var.b(i);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1661f);
        if (this.f1660e == null) {
            str = "";
        } else {
            StringBuilder a2 = e.a.a.a.a.a(". Child of ");
            a2.append(this.f1660e.f1661f);
            str = a2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.m.k0 a(a.a.a.a.v0.e.g0 r14) {
        /*
        // Method dump skipped, instructions count: 911
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.b0.a(a.a.a.a.v0.e.g0):a.a.a.a.v0.m.k0");
    }
}

package a.a.a.a.v0.i;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b0;
import a.a.a.a.v0.b.e0;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.g0;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.p;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.u;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.y0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.j.s.u;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e1;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.h;
import a.n;
import a.q;
import a.s;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d extends c implements j {

    /* renamed from: d  reason: collision with root package name */
    public final a.e f1489d;

    /* renamed from: e  reason: collision with root package name */
    public final a.e f1490e;

    /* renamed from: f  reason: collision with root package name */
    public final k f1491f;

    public static final class b extends j implements l<v0, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f1493c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f1493c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public CharSequence a(v0 v0Var) {
            v0 v0Var2 = v0Var;
            if (v0Var2 == null) {
                i.a("it");
                throw null;
            } else if (v0Var2.b()) {
                return "*";
            } else {
                d dVar = this.f1493c;
                d0 c2 = v0Var2.c();
                i.a((Object) c2, "it.type");
                String a2 = dVar.a(c2);
                if (v0Var2.a() == g1.INVARIANT) {
                    return a2;
                }
                return v0Var2.a() + ' ' + a2;
            }
        }
    }

    public static final class c extends j implements a.w.b.a<d> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f1494c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f1494c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public d a() {
            return (d) this.f1494c.a(e.f1497c);
        }
    }

    /* renamed from: a.a.a.a.v0.i.d$d  reason: collision with other inner class name */
    public static final class C0060d extends j implements a.w.b.a<c> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f1495c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0060d(d dVar) {
            super(0);
            this.f1495c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public c a() {
            return this.f1495c.a(f.f1498c);
        }
    }

    public static final class e extends j implements l<g<?>, String> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f1496c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(1);
            this.f1496c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public String a(g<?> gVar) {
            g<?> gVar2 = gVar;
            if (gVar2 != null) {
                return this.f1496c.a(gVar2);
            }
            i.a("it");
            throw null;
        }
    }

    public d(k kVar) {
        if (kVar != null) {
            this.f1491f = kVar;
            boolean z = kVar.f1507a;
            if (!s.f2103a || z) {
                this.f1489d = e.f.a.g.m92a((a.w.b.a) new c(this));
                this.f1490e = e.f.a.g.m92a((a.w.b.a) new C0060d(this));
                return;
            }
            throw new AssertionError("Assertion failed");
        }
        i.a("options");
        throw null;
    }

    public static final /* synthetic */ void a(d dVar, f0 f0Var, StringBuilder sb) {
        if (!dVar.l()) {
            if (!dVar.k()) {
                if (dVar.i().contains(i.ANNOTATIONS)) {
                    dVar.a(sb, f0Var, (a.a.a.a.v0.b.b1.e) null);
                    p v0 = f0Var.v0();
                    if (v0 != null) {
                        i.a((Object) v0, "it");
                        dVar.a(sb, v0, a.a.a.a.v0.b.b1.e.FIELD);
                    }
                    p l0 = f0Var.l0();
                    if (l0 != null) {
                        i.a((Object) l0, "it");
                        dVar.a(sb, l0, a.a.a.a.v0.b.b1.e.PROPERTY_DELEGATE_FIELD);
                    }
                    k kVar = dVar.f1491f;
                    if (((q) kVar.G.a(kVar, k.W[31])) == q.NONE) {
                        g0 w = f0Var.w();
                        if (w != null) {
                            i.a((Object) w, "it");
                            dVar.a(sb, w, a.a.a.a.v0.b.b1.e.PROPERTY_GETTER);
                        }
                        h0 i = f0Var.i();
                        if (i != null) {
                            i.a((Object) i, "it");
                            dVar.a(sb, i, a.a.a.a.v0.b.b1.e.PROPERTY_SETTER);
                            i.a((Object) i, "setter");
                            List<w0> j = i.j();
                            i.a((Object) j, "setter.valueParameters");
                            w0 w0Var = (w0) f.e((List) j);
                            i.a((Object) w0Var, "it");
                            dVar.a(sb, w0Var, a.a.a.a.v0.b.b1.e.SETTER_PARAMETER);
                        }
                    }
                }
                a1 g2 = f0Var.g();
                i.a((Object) g2, "property.visibility");
                dVar.a(g2, sb);
                dVar.a(sb, dVar.i().contains(i.CONST) && f0Var.R(), "const");
                dVar.a((u) f0Var, sb);
                dVar.b((a.a.a.a.v0.b.b) f0Var, sb);
                dVar.c(f0Var, sb);
                dVar.a(sb, dVar.i().contains(i.LATEINIT) && f0Var.C0(), "lateinit");
                dVar.a((a.a.a.a.v0.b.b) f0Var, sb);
            }
            dVar.a((y0) f0Var, sb, false);
            List<r0> k = f0Var.k();
            i.a((Object) k, "property.typeParameters");
            dVar.a((List<? extends r0>) k, sb, true);
            dVar.a((a.a.a.a.v0.b.a) f0Var, sb);
        }
        dVar.a((k) f0Var, sb, true);
        sb.append(": ");
        d0 c2 = f0Var.c();
        i.a((Object) c2, "property.type");
        sb.append(dVar.a(c2));
        dVar.b((a.a.a.a.v0.b.a) f0Var, sb);
        dVar.a((y0) f0Var, sb);
        List<r0> k2 = f0Var.k();
        i.a((Object) k2, "property.typeParameters");
        dVar.a(k2, sb);
    }

    public static /* synthetic */ void a(d dVar, StringBuilder sb, a.a.a.a.v0.b.b1.a aVar, a.a.a.a.v0.b.b1.e eVar, int i) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        dVar.a(sb, aVar, eVar);
    }

    public final v a(u uVar) {
        if (uVar instanceof a.a.a.a.v0.b.e) {
            return ((a.a.a.a.v0.b.e) uVar).t() == a.a.a.a.v0.b.f.INTERFACE ? v.ABSTRACT : v.FINAL;
        }
        k b2 = uVar.b();
        if (!(b2 instanceof a.a.a.a.v0.b.e)) {
            b2 = null;
        }
        a.a.a.a.v0.b.e eVar = (a.a.a.a.v0.b.e) b2;
        if (eVar == null) {
            return v.FINAL;
        }
        if (!(uVar instanceof a.a.a.a.v0.b.b)) {
            return v.FINAL;
        }
        a.a.a.a.v0.b.b bVar = (a.a.a.a.v0.b.b) uVar;
        Collection<? extends a.a.a.a.v0.b.b> f2 = bVar.f();
        i.a((Object) f2, "this.overriddenDescriptors");
        if ((!f2.isEmpty()) && eVar.o() != v.FINAL) {
            return v.OPEN;
        }
        if (eVar.t() != a.a.a.a.v0.b.f.INTERFACE || !(!i.a(bVar.g(), z0.f512a))) {
            return v.FINAL;
        }
        v o = bVar.o();
        v vVar = v.ABSTRACT;
        return o == vVar ? vVar : v.OPEN;
    }

    public final String a(String str) {
        return m().a(str);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        if (!a.a.a.a.v0.m.l1.a.a(str, str2, false, 2) || !a.a.a.a.v0.m.l1.a.a(str3, str4, false, 2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        i.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        i.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        String str6 = str5 + substring;
        if (i.a((Object) substring, (Object) substring2)) {
            return str6;
        }
        if (!a(substring, substring2)) {
            return null;
        }
        return str6 + '!';
    }

    public final void a(a.a.a.a.v0.b.a aVar, StringBuilder sb) {
        i0 g0 = aVar.g0();
        if (g0 != null) {
            a(sb, g0, a.a.a.a.v0.b.b1.e.RECEIVER);
            d0 c2 = g0.c();
            i.a((Object) c2, "receiver.type");
            String a2 = a(c2);
            if (b(c2) && !c1.c(c2)) {
                a2 = '(' + a2 + ')';
            }
            sb.append(a2);
            sb.append(".");
        }
    }

    public final void a(a.a.a.a.v0.b.b bVar, StringBuilder sb) {
        if (i().contains(i.MEMBER_KIND) && o() && bVar.t() != b.a.DECLARATION) {
            sb.append("/*");
            String name = bVar.t().name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                i.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                sb.append("*/ ");
                return;
            }
            throw new n("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final void a(a.a.a.a.v0.b.i iVar, StringBuilder sb) {
        List<r0> x = iVar.x();
        i.a((Object) x, "classifier.declaredTypeParameters");
        s0 n = iVar.n();
        i.a((Object) n, "classifier.typeConstructor");
        List<r0> d2 = n.d();
        i.a((Object) d2, "classifier.typeConstructor.parameters");
        if (o() && iVar.E() && d2.size() > x.size()) {
            sb.append(" /*captured type parameters: ");
            b(sb, d2.subList(x.size(), d2.size()));
            sb.append("*/");
        }
    }

    public final void a(k kVar, StringBuilder sb, boolean z) {
        a.a.a.a.v0.f.d d2 = kVar.d();
        i.a((Object) d2, "descriptor.name");
        sb.append(a(d2, z));
    }

    public final void a(u uVar, StringBuilder sb) {
        a(sb, uVar.H(), "external");
        boolean z = true;
        a(sb, i().contains(i.EXPECT) && uVar.D(), "expect");
        if (!i().contains(i.ACTUAL) || !uVar.m0()) {
            z = false;
        }
        a(sb, z, "actual");
    }

    public final void a(y0 y0Var, StringBuilder sb, boolean z) {
        if (z || !(y0Var instanceof w0)) {
            sb.append(b(y0Var.V() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public final void a(a.a.a.a.v0.f.b bVar, String str, StringBuilder sb) {
        sb.append(b(str));
        a.a.a.a.v0.f.c f2 = bVar.f();
        i.a((Object) f2, "fqName.toUnsafe()");
        String a2 = a(f2);
        if (a2.length() > 0) {
            sb.append(" ");
            sb.append(a2);
        }
    }

    public final void a(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public final void a(StringBuilder sb, List<? extends v0> list) {
        f.a(list, sb, ", ", null, null, 0, null, new b(this), 60);
    }

    public final void a(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(b(str));
            sb.append(" ");
        }
    }

    public final void a(List<? extends r0> list, StringBuilder sb) {
        if (!p()) {
            ArrayList arrayList = new ArrayList(0);
            for (r0 r0Var : list) {
                List<d0> upperBounds = r0Var.getUpperBounds();
                i.a((Object) upperBounds, "typeParameter.upperBounds");
                for (d0 d0Var : f.a((Iterable) upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    a.a.a.a.v0.f.d d2 = r0Var.d();
                    i.a((Object) d2, "typeParameter.name");
                    sb2.append(a(d2, false));
                    sb2.append(" : ");
                    i.a((Object) d0Var, "it");
                    sb2.append(a(d0Var));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(b("where"));
                sb.append(" ");
                f.a(arrayList, sb, ", ", null, null, 0, null, null, 124);
            }
        }
    }

    public final void a(List<? extends r0> list, StringBuilder sb, boolean z) {
        if (!p() && (!list.isEmpty())) {
            sb.append(r());
            b(sb, list);
            sb.append(q());
            if (z) {
                sb.append(" ");
            }
        }
    }

    public final String b(String str) {
        int ordinal = m().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return f() ? str : e.a.a.a.a.a("<b>", str, "</b>");
        }
        throw new h();
    }

    @Override // a.a.a.a.v0.i.j
    public Set<a.a.a.a.v0.f.b> b() {
        return this.f1491f.b();
    }

    public final void b(a.a.a.a.v0.b.b bVar, StringBuilder sb) {
        if (!a.a.a.a.v0.j.g.p(bVar) || bVar.o() != v.FINAL) {
            k kVar = this.f1491f;
            if (((o) kVar.A.a(kVar, k.W[25])) != o.f1519c || bVar.o() != v.OPEN || !(!bVar.f().isEmpty())) {
                v o = bVar.o();
                i.a((Object) o, "callable.modality");
                a(o, sb, a((u) bVar));
            }
        }
    }

    public final void b(StringBuilder sb, List<? extends r0> list) {
        Iterator<? extends r0> it = list.iterator();
        while (it.hasNext()) {
            a((r0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void b(boolean z) {
        this.f1491f.b(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(a.a.a.a.v0.m.d0 r4) {
        /*
            r3 = this;
            boolean r0 = a.a.a.a.v0.a.f.e(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.H0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = 1
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            a.a.a.a.v0.m.v0 r0 = (a.a.a.a.v0.m.v0) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.b(a.a.a.a.v0.m.d0):boolean");
    }

    public String c(String str) {
        if (str != null) {
            int ordinal = m().ordinal();
            if (ordinal == 0) {
                return str;
            }
            if (ordinal == 1) {
                return e.a.a.a.a.a("<i>", str, "</i>");
            }
            throw new h();
        }
        i.a("message");
        throw null;
    }

    @Override // a.a.a.a.v0.i.j
    public boolean c() {
        return this.f1491f.c();
    }

    @Override // a.a.a.a.v0.i.j
    public a d() {
        return this.f1491f.d();
    }

    @Override // a.a.a.a.v0.i.j
    public void d(boolean z) {
        k kVar = this.f1491f;
        kVar.E.a(kVar, k.W[29], Boolean.valueOf(z));
    }

    public boolean e() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.N.a(kVar, k.W[38])).booleanValue();
    }

    public boolean f() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.U.a(kVar, k.W[46])).booleanValue();
    }

    public b g() {
        k kVar = this.f1491f;
        return (b) kVar.b.a(kVar, k.W[0]);
    }

    @Override // a.a.a.a.v0.i.j
    public void g(boolean z) {
        this.f1491f.g(z);
    }

    public boolean h() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.R.a(kVar, k.W[42])).booleanValue();
    }

    public Set<i> i() {
        k kVar = this.f1491f;
        return (Set) kVar.f1510e.a(kVar, k.W[3]);
    }

    public boolean j() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.z.a(kVar, k.W[24])).booleanValue();
    }

    public boolean k() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.f1512g.a(kVar, k.W[5])).booleanValue();
    }

    public boolean l() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.f1511f.a(kVar, k.W[4])).booleanValue();
    }

    public r m() {
        k kVar = this.f1491f;
        return (r) kVar.C.a(kVar, k.W[27]);
    }

    public c.l n() {
        k kVar = this.f1491f;
        return (c.l) kVar.B.a(kVar, k.W[26]);
    }

    public boolean o() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.j.a(kVar, k.W[8])).booleanValue();
    }

    public boolean p() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.v.a(kVar, k.W[20])).booleanValue();
    }

    public final String q() {
        return m().a(">");
    }

    public final String r() {
        return m().a("<");
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.StringBuilder r14, a.a.a.a.v0.m.d0 r15) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.c(java.lang.StringBuilder, a.a.a.a.v0.m.d0):void");
    }

    @Override // a.a.a.a.v0.i.j
    public void e(boolean z) {
        k kVar = this.f1491f;
        kVar.f1511f.a(kVar, k.W[4], Boolean.valueOf(z));
    }

    @Override // a.a.a.a.v0.i.j
    public void f(boolean z) {
        k kVar = this.f1491f;
        kVar.v.a(kVar, k.W[20], Boolean.valueOf(z));
    }

    public final void b(StringBuilder sb, d0 d0Var) {
        f1 K0 = d0Var.K0();
        if (!(K0 instanceof a.a.a.a.v0.m.a)) {
            K0 = null;
        }
        a.a.a.a.v0.m.a aVar = (a.a.a.a.v0.m.a) K0;
        if (aVar != null) {
            k kVar = this.f1491f;
            if (((Boolean) kVar.Q.a(kVar, k.W[41])).booleanValue()) {
                c(sb, aVar.f1811d);
                return;
            }
            c(sb, aVar.f1812e);
            k kVar2 = this.f1491f;
            if (((Boolean) kVar2.P.a(kVar2, k.W[40])).booleanValue()) {
                if (m() == r.f1531d) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                c(sb, aVar.f1811d);
                sb.append(" */");
                if (m() == r.f1531d) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        c(sb, d0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (a.w.c.i.a((java.lang.Object) (r5 + '?'), (java.lang.Object) r6) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 4
            java.lang.String r2 = a.a.a.a.v0.m.l1.a.a(r6, r1, r2, r0, r3)
            boolean r2 = a.w.c.i.a(r5, r2)
            if (r2 != 0) goto L_0x0049
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L_0x002d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r2 = 63
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = a.w.c.i.a(r1, r6)
            if (r1 != 0) goto L_0x0049
        L_0x002d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 40
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ")?"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            boolean r5 = a.w.c.i.a(r5, r6)
            if (r5 == 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.a(java.lang.String, java.lang.String):boolean");
    }

    @Override // a.a.a.a.v0.i.j
    public boolean a() {
        k kVar = this.f1491f;
        return ((Boolean) kVar.m.a(kVar, k.W[11])).booleanValue();
    }

    @Override // a.a.a.a.v0.i.c
    public String a(k kVar) {
        if (kVar != null) {
            StringBuilder sb = new StringBuilder();
            kVar.a(new a(), sb);
            k kVar2 = this.f1491f;
            if (((Boolean) kVar2.f1508c.a(kVar2, k.W[1])).booleanValue() && !(kVar instanceof y) && !(kVar instanceof b0)) {
                if (kVar instanceof w) {
                    sb.append(" is a module");
                } else {
                    k b2 = kVar.b();
                    if (b2 != null && !(b2 instanceof w)) {
                        sb.append(" ");
                        sb.append(c("defined in"));
                        sb.append(" ");
                        a.a.a.a.v0.f.c e2 = a.a.a.a.v0.j.g.e(b2);
                        i.a((Object) e2, "DescriptorUtils.getFqName(containingDeclaration)");
                        sb.append(e2.c() ? "root package" : a(e2));
                        k kVar3 = this.f1491f;
                        if (((Boolean) kVar3.f1509d.a(kVar3, k.W[2])).booleanValue() && (b2 instanceof y) && (kVar instanceof a.a.a.a.v0.b.n)) {
                            m0 r = ((a.a.a.a.v0.b.n) kVar).r();
                            i.a((Object) r, "descriptor.source");
                            i.a((Object) r.a(), "descriptor.source.containingFile");
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        i.a("declarationDescriptor");
        throw null;
    }

    public final void b(a.a.a.a.v0.b.a aVar, StringBuilder sb) {
        i0 g0;
        k kVar = this.f1491f;
        if (((Boolean) kVar.E.a(kVar, k.W[29])).booleanValue() && (g0 = aVar.g0()) != null) {
            sb.append(" on ");
            d0 c2 = g0.c();
            i.a((Object) c2, "receiver.type");
            sb.append(a(c2));
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void b(Set<? extends i> set) {
        if (set != null) {
            this.f1491f.b(set);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v29, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.a.a.a.v0.i.c
    public String a(a.a.a.a.v0.b.b1.c cVar, a.a.a.a.v0.b.b1.e eVar) {
        List a2;
        a.a.a.a.v0.b.d Y;
        List<w0> j;
        a.t.l lVar = null;
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            if (eVar != null) {
                sb.append(eVar.f315c + ":");
            }
            d0 c2 = cVar.c();
            sb.append(a(c2));
            if (this.f1491f.d().f1471c) {
                Map<a.a.a.a.v0.f.d, g<?>> a3 = cVar.a();
                k kVar = this.f1491f;
                a.a.a.a.v0.b.e b2 = ((Boolean) kVar.H.a(kVar, k.W[32])).booleanValue() ? a.a.a.a.v0.j.u.a.b(cVar) : null;
                if (!(b2 == null || (Y = b2.Y()) == null || (j = Y.j()) == null)) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : j) {
                        if (t.B()) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(e.f.a.g.a((Iterable) arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w0 w0Var = (w0) it.next();
                        i.a((Object) w0Var, "it");
                        arrayList2.add(w0Var.d());
                    }
                    lVar = arrayList2;
                }
                if (lVar == null) {
                    lVar = a.t.l.f2119c;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : lVar) {
                    if (true ^ a3.containsKey((a.a.a.a.v0.f.d) obj)) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(e.f.a.g.a((Iterable) arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((a.a.a.a.v0.f.d) it2.next()).a() + " = ...");
                }
                Set<Map.Entry<a.a.a.a.v0.f.d, g<?>>> entrySet = a3.entrySet();
                ArrayList arrayList5 = new ArrayList(e.f.a.g.a(entrySet, 10));
                for (T t2 : entrySet) {
                    a.a.a.a.v0.f.d dVar = (a.a.a.a.v0.f.d) t2.getKey();
                    g<?> gVar = (g) t2.getValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVar.a());
                    sb2.append(" = ");
                    sb2.append(!lVar.contains(dVar) ? a(gVar) : "...");
                    arrayList5.add(sb2.toString());
                }
                List a4 = f.a((Collection) arrayList4, (Iterable) arrayList5);
                if (a4.size() <= 1) {
                    a2 = f.g(a4);
                } else {
                    Object[] array = a4.toArray(new Comparable[0]);
                    if (array != null) {
                        Comparable[] comparableArr = (Comparable[]) array;
                        if (comparableArr.length > 1) {
                            Arrays.sort(comparableArr);
                        }
                        a2 = f.a(comparableArr);
                    } else {
                        throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                if (this.f1491f.d().f1472d || (!a2.isEmpty())) {
                    f.a(a2, sb, ", ", "(", ")", 0, null, null, d.b.j.AppCompatTheme_windowActionBarOverlay);
                }
            }
            if (o() && (e.f.a.g.f(c2) || (c2.I0().c() instanceof x.b))) {
                sb.append(" /* annotation class not found */");
            }
            String sb3 = sb.toString();
            i.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        i.a("annotation");
        throw null;
    }

    public final class a implements m<q, StringBuilder> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.e, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(a.a.a.a.v0.b.e eVar, StringBuilder sb) {
            a.a.a.a.v0.b.d Y;
            String str;
            StringBuilder sb2 = sb;
            if (eVar == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d dVar = d.this;
                if (dVar != null) {
                    boolean z = eVar.t() == a.a.a.a.v0.b.f.ENUM_ENTRY;
                    if (!dVar.l()) {
                        dVar.a(sb2, eVar, (a.a.a.a.v0.b.b1.e) null);
                        if (!z) {
                            a1 g2 = eVar.g();
                            i.a((Object) g2, "klass.visibility");
                            dVar.a(g2, sb2);
                        }
                        if (!(eVar.t() == a.a.a.a.v0.b.f.INTERFACE && eVar.o() == v.ABSTRACT)) {
                            a.a.a.a.v0.b.f t = eVar.t();
                            i.a((Object) t, "klass.kind");
                            if (!t.a() || eVar.o() != v.FINAL) {
                                v o = eVar.o();
                                i.a((Object) o, "klass.modality");
                                dVar.a(o, sb2, dVar.a((u) eVar));
                            }
                        }
                        dVar.a((u) eVar, sb2);
                        dVar.a(sb2, dVar.i().contains(i.INNER) && eVar.E(), "inner");
                        dVar.a(sb2, dVar.i().contains(i.DATA) && eVar.D0(), "data");
                        dVar.a(sb2, dVar.i().contains(i.INLINE) && eVar.p(), "inline");
                        if (eVar instanceof q0) {
                            str = "typealias";
                        } else if (eVar.P()) {
                            str = "companion object";
                        } else {
                            int ordinal = eVar.t().ordinal();
                            if (ordinal == 0) {
                                str = "class";
                            } else if (ordinal == 1) {
                                str = "interface";
                            } else if (ordinal == 2) {
                                str = "enum class";
                            } else if (ordinal == 3) {
                                str = "enum entry";
                            } else if (ordinal == 4) {
                                str = "annotation class";
                            } else if (ordinal == 5) {
                                str = "object";
                            } else {
                                throw new h();
                            }
                        }
                        sb2.append(dVar.b(str));
                    }
                    if (!a.a.a.a.v0.j.g.k(eVar)) {
                        if (!dVar.l()) {
                            dVar.a(sb2);
                        }
                        dVar.a((k) eVar, sb2, true);
                    } else {
                        k kVar = dVar.f1491f;
                        if (((Boolean) kVar.F.a(kVar, k.W[30])).booleanValue()) {
                            if (dVar.l()) {
                                sb2.append("companion object");
                            }
                            dVar.a(sb2);
                            k b = eVar.b();
                            if (b != null) {
                                sb2.append("of ");
                                a.a.a.a.v0.f.d d2 = b.d();
                                i.a((Object) d2, "containingDeclaration.name");
                                sb2.append(dVar.a(d2, false));
                            }
                        }
                        if (dVar.o() || (!i.a(eVar.d(), a.a.a.a.v0.f.f.b))) {
                            if (!dVar.l()) {
                                dVar.a(sb2);
                            }
                            a.a.a.a.v0.f.d d3 = eVar.d();
                            i.a((Object) d3, "descriptor.name");
                            sb2.append(dVar.a(d3, true));
                        }
                    }
                    if (!z) {
                        List<r0> x = eVar.x();
                        i.a((Object) x, "klass.declaredTypeParameters");
                        dVar.a((List<? extends r0>) x, sb2, false);
                        dVar.a((a.a.a.a.v0.b.i) eVar, sb2);
                        a.a.a.a.v0.b.f t2 = eVar.t();
                        i.a((Object) t2, "klass.kind");
                        if (!t2.a()) {
                            k kVar2 = dVar.f1491f;
                            if (((Boolean) kVar2.i.a(kVar2, k.W[7])).booleanValue() && (Y = eVar.Y()) != null) {
                                sb2.append(" ");
                                dVar.a(sb2, Y, (a.a.a.a.v0.b.b1.e) null);
                                a1 g3 = Y.g();
                                i.a((Object) g3, "primaryConstructor.visibility");
                                dVar.a(g3, sb2);
                                sb2.append(dVar.b("constructor"));
                                List<w0> j = Y.j();
                                i.a((Object) j, "primaryConstructor.valueParameters");
                                dVar.a(j, Y.s0(), sb2);
                            }
                        }
                        k kVar3 = dVar.f1491f;
                        if (!((Boolean) kVar3.w.a(kVar3, k.W[21])).booleanValue() && !a.a.a.a.v0.a.g.d(eVar.v())) {
                            s0 n = eVar.n();
                            i.a((Object) n, "klass.typeConstructor");
                            Collection<d0> b2 = n.b();
                            i.a((Object) b2, "klass.typeConstructor.supertypes");
                            if (!b2.isEmpty() && (b2.size() != 1 || !a.a.a.a.v0.a.g.b(b2.iterator().next()))) {
                                dVar.a(sb2);
                                sb2.append(": ");
                                f.a(b2, sb2, ", ", null, null, 0, null, new h(dVar), 60);
                            }
                        }
                        dVar.a(x, sb2);
                    }
                    return q.f2100a;
                }
                throw null;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.s, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public /* bridge */ /* synthetic */ q a(a.a.a.a.v0.b.s sVar, StringBuilder sb) {
            a(sVar, sb);
            return q.f2100a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.j, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            if (r2.o() != a.a.a.a.v0.b.v.SEALED) goto L_0x003b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x013c  */
        @Override // a.a.a.a.v0.b.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a.q a(a.a.a.a.v0.b.j r19, java.lang.StringBuilder r20) {
            /*
            // Method dump skipped, instructions count: 347
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.a.a(a.a.a.a.v0.b.j, java.lang.Object):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(a.a.a.a.v0.b.s r10, java.lang.StringBuilder r11) {
            /*
            // Method dump skipped, instructions count: 402
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.a.a(a.a.a.a.v0.b.s, java.lang.StringBuilder):void");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.w, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(w wVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (wVar == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d.this.a((k) wVar, sb2, true);
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.y, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(y yVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (yVar == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d dVar = d.this;
                if (dVar != null) {
                    dVar.a(yVar.e(), "package-fragment", sb2);
                    if (dVar.c()) {
                        sb2.append(" in ");
                        dVar.a((k) yVar.b(), sb2, false);
                    }
                    return q.f2100a;
                }
                throw null;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.b0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(b0 b0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (b0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d dVar = d.this;
                if (dVar != null) {
                    dVar.a(b0Var.e(), "package", sb2);
                    if (dVar.c()) {
                        sb2.append(" in context of ");
                        dVar.a((k) b0Var.I(), sb2, false);
                    }
                    return q.f2100a;
                }
                throw null;
            } else {
                i.a("builder");
                throw null;
            }
        }

        public final void a(e0 e0Var, StringBuilder sb, String str) {
            k kVar = d.this.f1491f;
            int ordinal = ((q) kVar.G.a(kVar, k.W[31])).ordinal();
            if (ordinal == 0) {
                d.this.a((u) e0Var, sb);
                sb.append(str + " for ");
                d dVar = d.this;
                f0 a0 = e0Var.a0();
                i.a((Object) a0, "descriptor.correspondingProperty");
                d.a(dVar, a0, sb);
            } else if (ordinal == 1) {
                a((a.a.a.a.v0.b.s) e0Var, sb);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.f0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(f0 f0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (f0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d.a(d.this, f0Var, sb2);
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.g0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(g0 g0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (g0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                a(g0Var, sb2, "getter");
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.h0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(h0 h0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (h0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                a(h0Var, sb2, "setter");
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.i0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(i0 i0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (i0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                sb2.append(i0Var.d());
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.q0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(q0 q0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (q0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d dVar = d.this;
                dVar.a(sb2, q0Var, (a.a.a.a.v0.b.b1.e) null);
                a1 g2 = q0Var.g();
                i.a((Object) g2, "typeAlias.visibility");
                dVar.a(g2, sb2);
                dVar.a((u) q0Var, sb2);
                sb2.append(dVar.b("typealias"));
                sb2.append(" ");
                dVar.a((k) q0Var, sb2, true);
                List<r0> x = q0Var.x();
                i.a((Object) x, "typeAlias.declaredTypeParameters");
                dVar.a((List<? extends r0>) x, sb2, false);
                dVar.a((a.a.a.a.v0.b.i) q0Var, sb2);
                sb2.append(" = ");
                sb2.append(dVar.a(q0Var.N()));
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.r0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(r0 r0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (r0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d.this.a(r0Var, sb2, true);
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.b.w0, java.lang.Object] */
        @Override // a.a.a.a.v0.b.m
        public q a(w0 w0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            if (w0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (sb2 != null) {
                d.this.a(w0Var, true, sb2, true);
                return q.f2100a;
            } else {
                i.a("builder");
                throw null;
            }
        }
    }

    public final void c(a.a.a.a.v0.b.b bVar, StringBuilder sb) {
        if (i().contains(i.OVERRIDE) && (!bVar.f().isEmpty())) {
            k kVar = this.f1491f;
            if (((o) kVar.A.a(kVar, k.W[25])) != o.f1520d) {
                a(sb, true, "override");
                if (o()) {
                    sb.append("/*");
                    sb.append(bVar.f().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void c(boolean z) {
        k kVar = this.f1491f;
        kVar.F.a(kVar, k.W[30], Boolean.valueOf(z));
    }

    public final void a(StringBuilder sb, a.a.a.a.v0.b.b1.a aVar, a.a.a.a.v0.b.b1.e eVar) {
        Set<a.a.a.a.v0.f.b> set;
        if (i().contains(i.ANNOTATIONS)) {
            if (aVar instanceof d0) {
                set = b();
            } else {
                k kVar = this.f1491f;
                set = (Set) kVar.J.a(kVar, k.W[34]);
            }
            k kVar2 = this.f1491f;
            l lVar = (l) kVar2.L.a(kVar2, k.W[36]);
            for (a.a.a.a.v0.b.b1.c cVar : aVar.y()) {
                if (!f.a((Iterable) set, (Object) cVar.e()) && (lVar == null || ((Boolean) lVar.a(cVar)).booleanValue())) {
                    sb.append(a(cVar, eVar));
                    k kVar3 = this.f1491f;
                    if (((Boolean) kVar3.I.a(kVar3, k.W[33])).booleanValue()) {
                        sb.append(a.a0.n.f2078a);
                        i.a((Object) sb, "append(SystemProperties.LINE_SEPARATOR)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final String a(g<?> gVar) {
        if (gVar instanceof a.a.a.a.v0.j.s.b) {
            return f.a(((a.a.a.a.v0.j.s.b) gVar).f1578a, ", ", "{", "}", 0, (CharSequence) null, new e(this), 24);
        }
        if (gVar instanceof a.a.a.a.v0.j.s.a) {
            return a.a0.i.a(c.a(this, ((a.a.a.a.v0.j.s.a) gVar).f1578a, null, 2, null), "@");
        }
        if (!(gVar instanceof a.a.a.a.v0.j.s.u)) {
            return gVar.toString();
        }
        T t = ((a.a.a.a.v0.j.s.u) gVar).f1578a;
        if (t instanceof u.a.C0061a) {
            return t.f1591a + "::class";
        } else if (t instanceof u.a.b) {
            T t2 = t;
            String a2 = t2.f1592a.f1577a.a().a();
            i.a((Object) a2, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < t2.f1592a.b; i++) {
                a2 = "kotlin.Array<" + a2 + '>';
            }
            return e.a.a.a.a.b(a2, "::class");
        } else {
            throw new h();
        }
    }

    public final void a(StringBuilder sb, d0 d0Var) {
        String str;
        a.a.a.a.v0.b.i iVar = null;
        a(this, sb, d0Var, (a.a.a.a.v0.b.b1.e) null, 2);
        if (e.f.a.g.f(d0Var)) {
            if (d0Var instanceof e1) {
                k kVar = this.f1491f;
                if (((Boolean) kVar.T.a(kVar, k.W[45])).booleanValue()) {
                    str = ((e1) d0Var).i;
                    sb.append(str);
                    sb.append(a(d0Var.H0()));
                }
            }
            if (d0Var instanceof a.a.a.a.v0.m.v) {
                k kVar2 = this.f1491f;
                if (!((Boolean) kVar2.V.a(kVar2, k.W[47])).booleanValue()) {
                    str = ((a.a.a.a.v0.m.v) d0Var).L0();
                    sb.append(str);
                    sb.append(a(d0Var.H0()));
                }
            }
            str = d0Var.I0().toString();
            sb.append(str);
            sb.append(a(d0Var.H0()));
        } else {
            s0 I0 = d0Var.I0();
            a.a.a.a.v0.b.h c2 = d0Var.I0().c();
            if (c2 instanceof a.a.a.a.v0.b.i) {
                iVar = c2;
            }
            a.a.a.a.v0.b.d0 a2 = e.f.a.g.a(d0Var, iVar, 0);
            if (a2 == null) {
                sb.append(a(I0));
                sb.append(a(d0Var.H0()));
            } else {
                a(sb, a2);
            }
        }
        if (d0Var.J0()) {
            sb.append("?");
        }
        if (d0Var.K0() instanceof a.a.a.a.v0.m.p) {
            sb.append("!!");
        }
    }

    @Override // a.a.a.a.v0.i.c
    public String a(String str, String str2, a.a.a.a.v0.a.g gVar) {
        StringBuilder sb;
        if (str == null) {
            i.a("lowerRendered");
            throw null;
        } else if (str2 == null) {
            i.a("upperRendered");
            throw null;
        } else if (gVar != null) {
            if (!a(str, str2)) {
                b g2 = g();
                a.a.a.a.v0.b.e a2 = gVar.a(a.a.a.a.v0.a.g.k.I);
                if (a2 != null) {
                    i.a((Object) a2, "builtIns.collection");
                    String a3 = a.a0.i.a(g2.a(a2, this), "Collection", (String) null, 2);
                    String b2 = e.a.a.a.a.b(a3, "Mutable");
                    String a4 = a(str, b2, str2, a3, a3 + '(' + "Mutable" + ')');
                    if (a4 != null) {
                        return a4;
                    }
                    String a5 = a(str, e.a.a.a.a.b(a3, "MutableMap.MutableEntry"), str2, e.a.a.a.a.b(a3, "Map.Entry"), e.a.a.a.a.b(a3, "(Mutable)Map.(Mutable)Entry"));
                    if (a5 != null) {
                        return a5;
                    }
                    b g3 = g();
                    a.a.a.a.v0.b.e a6 = gVar.a("Array");
                    i.a((Object) a6, "builtIns.array");
                    String a7 = a.a0.i.a(g3.a(a6, this), "Array", (String) null, 2);
                    StringBuilder a8 = e.a.a.a.a.a(a7);
                    a8.append(m().a("Array<"));
                    String sb2 = a8.toString();
                    StringBuilder a9 = e.a.a.a.a.a(a7);
                    a9.append(m().a("Array<out "));
                    String sb3 = a9.toString();
                    StringBuilder a10 = e.a.a.a.a.a(a7);
                    a10.append(m().a("Array<(out) "));
                    String a11 = a(str, sb2, str2, sb3, a10.toString());
                    if (a11 != null) {
                        return a11;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('(');
                    sb4.append(str);
                    sb4.append("..");
                    sb4.append(str2);
                    sb4.append(')');
                    sb = sb4;
                } else {
                    a.a.a.a.v0.a.g.b(33);
                    throw null;
                }
            } else if (a.a.a.a.v0.m.l1.a.a(str2, "(", false, 2)) {
                sb = new StringBuilder();
                sb.append('(');
                sb.append(str);
                sb.append(")!");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append('!');
            }
            return sb.toString();
        } else {
            i.a("builtIns");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.i.c
    public String a(a.a.a.a.v0.f.c cVar) {
        if (cVar != null) {
            List<a.a.a.a.v0.f.d> e2 = cVar.e();
            i.a((Object) e2, "fqName.pathSegments()");
            return a(e.f.a.g.d(e2));
        }
        i.a("fqName");
        throw null;
    }

    public final void a(y0 y0Var, StringBuilder sb) {
        g<?> j0;
        k kVar = this.f1491f;
        if (((Boolean) kVar.u.a(kVar, k.W[19])).booleanValue() && (j0 = y0Var.j0()) != null) {
            sb.append(" = ");
            i.a((Object) j0, "constant");
            sb.append(a(a(j0)));
        }
    }

    public final void a(v vVar, StringBuilder sb, v vVar2) {
        k kVar = this.f1491f;
        if (((Boolean) kVar.p.a(kVar, k.W[14])).booleanValue() || vVar != vVar2) {
            boolean contains = i().contains(i.MODALITY);
            String name = vVar.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                i.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                a(sb, contains, lowerCase);
                return;
            }
            throw new n("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Override // a.a.a.a.v0.i.c
    public String a(a.a.a.a.v0.f.d dVar, boolean z) {
        if (dVar != null) {
            String a2 = a(e.f.a.g.a(dVar));
            return (!f() || m() != r.f1531d || !z) ? a2 : e.a.a.a.a.a("<b>", a2, "</b>");
        }
        i.a("name");
        throw null;
    }

    public final void a(StringBuilder sb, a.a.a.a.v0.b.d0 d0Var) {
        String str;
        a.a.a.a.v0.b.d0 d0Var2 = d0Var.f351c;
        if (d0Var2 != null) {
            a(sb, d0Var2);
            sb.append('.');
            a.a.a.a.v0.f.d d2 = d0Var.f350a.d();
            i.a((Object) d2, "possiblyInnerType.classifierDescriptor.name");
            str = a(d2, false);
        } else {
            s0 n = d0Var.f350a.n();
            i.a((Object) n, "possiblyInnerType.classi…escriptor.typeConstructor");
            str = a(n);
        }
        sb.append(str);
        sb.append(a(d0Var.b));
    }

    @Override // a.a.a.a.v0.i.c
    public String a(d0 d0Var) {
        if (d0Var != null) {
            StringBuilder sb = new StringBuilder();
            k kVar = this.f1491f;
            b(sb, (d0) ((l) kVar.x.a(kVar, k.W[22])).a(d0Var));
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        i.a("type");
        throw null;
    }

    public String a(List<? extends v0> list) {
        if (list == null) {
            i.a("typeArguments");
            throw null;
        } else if (list.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r());
            a(sb, list);
            sb.append(q());
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    public String a(s0 s0Var) {
        if (s0Var != null) {
            a.a.a.a.v0.b.h c2 = s0Var.c();
            if (!(c2 instanceof r0) && !(c2 instanceof a.a.a.a.v0.b.e) && !(c2 instanceof q0)) {
                if (c2 == null) {
                    return s0Var.toString();
                }
                StringBuilder a2 = e.a.a.a.a.a("Unexpected classifier: ");
                a2.append(c2.getClass());
                throw new IllegalStateException(a2.toString().toString());
            } else if (c2 != null) {
                return a.a.a.a.v0.m.w.a(c2) ? c2.n().toString() : g().a(c2, this);
            } else {
                i.a("klass");
                throw null;
            }
        } else {
            i.a("typeConstructor");
            throw null;
        }
    }

    public final void a(r0 r0Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(r());
        }
        if (o()) {
            sb.append("/*");
            sb.append(r0Var.z());
            sb.append("*/ ");
        }
        a(sb, r0Var.p0(), "reified");
        String str = r0Var.F().f1857c;
        boolean z2 = true;
        a(sb, str.length() > 0, str);
        a(sb, r0Var, (a.a.a.a.v0.b.b1.e) null);
        a((k) r0Var, sb, z);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            d0 next = r0Var.getUpperBounds().iterator().next();
            if (next == null) {
                a.a.a.a.v0.a.g.b(132);
                throw null;
            } else if (!a.a.a.a.v0.a.g.e(next)) {
                sb.append(" : ");
                i.a((Object) next, "upperBound");
                sb.append(a(next));
            }
        } else if (z) {
            for (d0 d0Var : r0Var.getUpperBounds()) {
                if (d0Var == null) {
                    a.a.a.a.v0.a.g.b(132);
                    throw null;
                } else if (!a.a.a.a.v0.a.g.e(d0Var)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    i.a((Object) d0Var, "upperBound");
                    sb.append(a(d0Var));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(q());
        }
    }

    @Override // a.a.a.a.v0.i.c
    public String a(v0 v0Var) {
        if (v0Var != null) {
            StringBuilder sb = new StringBuilder();
            a(sb, e.f.a.g.c(v0Var));
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        i.a("typeProjection");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(a.a.a.a.v0.b.w0 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.a(a.a.a.a.v0.b.w0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r8 == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:11:0x003a->B:13:0x0040, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection<? extends a.a.a.a.v0.b.w0> r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            a.a.a.a.v0.i.k r0 = r6.f1491f
            a.x.b r1 = r0.D
            a.a.l[] r2 = a.a.a.a.v0.i.k.W
            r3 = 28
            r2 = r2[r3]
            java.lang.Object r0 = r1.a(r0, r2)
            a.a.a.a.v0.i.p r0 = (a.a.a.a.v0.i.p) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            if (r0 == r1) goto L_0x0024
            r8 = 2
            if (r0 != r8) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            a.h r7 = new a.h
            r7.<init>()
            throw r7
        L_0x0024:
            if (r8 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r8 = 0
            goto L_0x002a
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r0 = r7.size()
            a.a.a.a.v0.i.c$l r3 = r6.n()
            r3.a(r0, r9)
            java.util.Iterator r7 = r7.iterator()
            r3 = 0
        L_0x003a:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r7.next()
            a.a.a.a.v0.b.w0 r4 = (a.a.a.a.v0.b.w0) r4
            a.a.a.a.v0.i.c$l r5 = r6.n()
            r5.a(r4, r3, r0, r9)
            r6.a(r4, r8, r9, r2)
            a.a.a.a.v0.i.c$l r5 = r6.n()
            r5.b(r4, r3, r0, r9)
            int r3 = r3 + r1
            goto L_0x003a
        L_0x0059:
            a.a.a.a.v0.i.c$l r7 = r6.n()
            r7.b(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.i.d.a(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    public final boolean a(a1 a1Var, StringBuilder sb) {
        if (!i().contains(i.VISIBILITY)) {
            return false;
        }
        k kVar = this.f1491f;
        if (((Boolean) kVar.n.a(kVar, k.W[12])).booleanValue()) {
            a1Var = a1Var.b();
        }
        k kVar2 = this.f1491f;
        if (!((Boolean) kVar2.o.a(kVar2, k.W[13])).booleanValue() && i.a(a1Var, z0.k)) {
            return false;
        }
        sb.append(b(a1Var.a()));
        sb.append(" ");
        return true;
    }

    @Override // a.a.a.a.v0.i.j
    public void a(a aVar) {
        if (aVar != null) {
            this.f1491f.a(aVar);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void a(b bVar) {
        if (bVar != null) {
            this.f1491f.a(bVar);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void a(boolean z) {
        k kVar = this.f1491f;
        kVar.f1513h.a(kVar, k.W[6], Boolean.valueOf(z));
    }

    @Override // a.a.a.a.v0.i.j
    public void a(Set<a.a.a.a.v0.f.b> set) {
        if (set != null) {
            this.f1491f.a(set);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void a(p pVar) {
        if (pVar != null) {
            this.f1491f.a(pVar);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.i.j
    public void a(r rVar) {
        if (rVar != null) {
            this.f1491f.a(rVar);
        } else {
            i.a("<set-?>");
            throw null;
        }
    }
}

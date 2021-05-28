package a.a.a.a.v0.n;

import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.n.g;
import a.a.a.a.v0.n.l;
import a.a.a.a.v0.n.m;
import a.a0.d;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import java.util.Arrays;
import java.util.List;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<d> f1974a;
    public static final j b = new j();

    public static final class a extends a.w.c.j implements l<s, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f1975c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public String a(s sVar) {
            s sVar2 = sVar;
            if (sVar2 != null) {
                List<w0> j = sVar2.j();
                i.a((Object) j, "valueParameters");
                w0 w0Var = (w0) f.d((List) j);
                boolean z = false;
                if (w0Var != null) {
                    if (!a.a.a.a.v0.j.u.a.a(w0Var) && w0Var.W() == null) {
                        z = true;
                    }
                }
                j jVar = j.b;
                if (!z) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            }
            i.a("$receiver");
            throw null;
        }
    }

    public static final class b extends a.w.c.j implements l<s, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f1976c = new b();

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            if (r6 != false) goto L_0x006f;
         */
        @Override // a.w.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String a(a.a.a.a.v0.b.s r6) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.n.j.b.a(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends a.w.c.j implements l<s, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f1977c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public String a(s sVar) {
            boolean z;
            s sVar2 = sVar;
            if (sVar2 != null) {
                i0 J = sVar2.J();
                if (J == null) {
                    J = sVar2.g0();
                }
                j jVar = j.b;
                boolean z2 = false;
                if (J != null) {
                    d0 h2 = sVar2.h();
                    if (h2 != null) {
                        d0 c2 = J.c();
                        i.a((Object) c2, "receiver.type");
                        z = a.a.a.a.v0.m.l1.a.a(h2, c2);
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    return "receiver must be a supertype of the return type";
                }
                return null;
            }
            i.a("$receiver");
            throw null;
        }
    }

    static {
        d[] dVarArr = new d[18];
        dVarArr[0] = new d(k.i, new b[]{g.b.b, new m.a(1)}, (l) null, 4);
        dVarArr[1] = new d(k.j, new b[]{g.b.b, new m.a(2)}, a.f1975c);
        dVarArr[2] = new d(k.f1978a, new b[]{g.b.b, i.f1973a, new m.a(2), f.f1970a}, (l) null, 4);
        dVarArr[3] = new d(k.b, new b[]{g.b.b, i.f1973a, new m.a(3), f.f1970a}, (l) null, 4);
        dVarArr[4] = new d(k.f1979c, new b[]{g.b.b, i.f1973a, new m.b(2), f.f1970a}, (l) null, 4);
        dVarArr[5] = new d(k.f1983g, new b[]{g.b.b}, (l) null, 4);
        dVarArr[6] = new d(k.f1982f, new b[]{g.b.b, m.d.b, i.f1973a, l.a.f1987d}, (a.w.b.l) null, 4);
        dVarArr[7] = new d(k.f1984h, new b[]{g.b.b, m.c.b}, (a.w.b.l) null, 4);
        dVarArr[8] = new d(k.k, new b[]{g.b.b, m.c.b}, (a.w.b.l) null, 4);
        dVarArr[9] = new d(k.l, new b[]{g.b.b, m.c.b, l.a.f1987d}, (a.w.b.l) null, 4);
        dVarArr[10] = new d(k.y, new b[]{g.b.b, m.d.b, i.f1973a}, (a.w.b.l) null, 4);
        dVarArr[11] = new d(k.f1980d, new b[]{g.a.b}, b.f1976c);
        dVarArr[12] = new d(k.f1981e, new b[]{g.b.b, l.b.f1989d, m.d.b, i.f1973a}, (a.w.b.l) null, 4);
        dVarArr[13] = new d(k.G, new b[]{g.b.b, m.d.b, i.f1973a}, (a.w.b.l) null, 4);
        dVarArr[14] = new d(k.F, new b[]{g.b.b, m.c.b}, (a.w.b.l) null, 4);
        dVarArr[15] = new d(e.f.a.g.g(k.n, k.o), new b[]{g.b.b}, c.f1977c);
        dVarArr[16] = new d(k.H, new b[]{g.b.b, l.c.f1991d, m.d.b, i.f1973a}, (a.w.b.l) null, 4);
        d dVar = k.m;
        b[] bVarArr = {g.b.b, m.c.b};
        e eVar = e.f1969c;
        if (dVar == null) {
            i.a("regex");
            throw null;
        } else if (eVar != null) {
            dVarArr[17] = new d(null, dVar, null, eVar, (b[]) Arrays.copyOf(bVarArr, 2));
            f1974a = e.f.a.g.g(dVarArr);
        } else {
            i.a("additionalChecks");
            throw null;
        }
    }
}

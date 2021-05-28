package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.y;
import a.a.a.a.v0.d.b.v.a;
import a.a.a.a.v0.e.v;
import a.a.a.a.v0.e.y0.g.f;
import a.a.a.a.v0.e.y0.g.h;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.k.b.j;
import a.a.a.a.v0.k.b.r;
import a.t.l;
import e.f.a.g;
import java.util.List;
import java.util.Set;

public final class d {
    public static final Set<a.EnumC0036a> b = g.e(a.EnumC0036a.CLASS);

    /* renamed from: c  reason: collision with root package name */
    public static final Set<a.EnumC0036a> f901c = g.i(a.EnumC0036a.FILE_FACADE, a.EnumC0036a.MULTIFILE_CLASS_PART);

    /* renamed from: d  reason: collision with root package name */
    public static final f f902d = new f(1, 1, 2);

    /* renamed from: e  reason: collision with root package name */
    public static final f f903e = new f(1, 1, 11);

    /* renamed from: f  reason: collision with root package name */
    public static final f f904f = new f(1, 1, 13);

    /* renamed from: g  reason: collision with root package name */
    public static final a f905g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public j f906a;

    public static final class a {
        public /* synthetic */ a(a.w.c.f fVar) {
        }
    }

    public static final class b extends a.w.c.j implements a.w.b.a<List<? extends a.a.a.a.v0.f.d>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f907c = new b();

        public b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends a.a.a.a.v0.f.d> a() {
            return l.f2119c;
        }
    }

    public final i a(y yVar, l lVar) {
        String[] strArr;
        a.j<a.a.a.a.v0.e.y0.g.g, v> jVar;
        if (yVar == null) {
            a.w.c.i.a("descriptor");
            throw null;
        } else if (lVar != null) {
            String[] a2 = a(lVar, f901c);
            if (a2 == null || (strArr = lVar.c().f933e) == null) {
                return null;
            }
            try {
                jVar = h.c(a2, strArr);
            } catch (k e2) {
                throw new IllegalStateException("Could not read data from " + lVar.b(), e2);
            } catch (Throwable th) {
                j jVar2 = this.f906a;
                if (jVar2 == null) {
                    a.w.c.i.b("components");
                    throw null;
                } else if (jVar2.f1733d.c() || lVar.c().b.a()) {
                    throw th;
                } else {
                    jVar = null;
                }
            }
            if (jVar == null) {
                return null;
            }
            A a3 = jVar.f2088c;
            B b2 = jVar.f2089d;
            g gVar = new g(lVar, b2, a3, a(lVar), b(lVar));
            f fVar = lVar.c().b;
            j jVar3 = this.f906a;
            if (jVar3 != null) {
                return new a.a.a.a.v0.k.b.f0.j(yVar, b2, a3, fVar, gVar, jVar3, b.f907c);
            }
            a.w.c.i.b("components");
            throw null;
        } else {
            a.w.c.i.a("kotlinClass");
            throw null;
        }
    }

    public final j a() {
        j jVar = this.f906a;
        if (jVar != null) {
            return jVar;
        }
        a.w.c.i.b("components");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(a.a.a.a.v0.d.b.l r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.b.d.b(a.a.a.a.v0.d.b.l):boolean");
    }

    public final a.a.a.a.v0.k.b.f c(l lVar) {
        String[] strArr;
        a.j<a.a.a.a.v0.e.y0.g.g, a.a.a.a.v0.e.f> jVar;
        if (lVar != null) {
            String[] a2 = a(lVar, b);
            if (a2 == null || (strArr = lVar.c().f933e) == null) {
                return null;
            }
            try {
                jVar = h.a(a2, strArr);
            } catch (k e2) {
                throw new IllegalStateException("Could not read data from " + lVar.b(), e2);
            } catch (Throwable th) {
                j jVar2 = this.f906a;
                if (jVar2 == null) {
                    a.w.c.i.b("components");
                    throw null;
                } else if (jVar2.f1733d.c() || lVar.c().b.a()) {
                    throw th;
                } else {
                    jVar = null;
                }
            }
            if (jVar != null) {
                return new a.a.a.a.v0.k.b.f(jVar.f2088c, jVar.f2089d, lVar.c().b, new n(lVar, a(lVar), b(lVar)));
            }
            return null;
        }
        a.w.c.i.a("kotlinClass");
        throw null;
    }

    public final r<f> a(l lVar) {
        j jVar = this.f906a;
        if (jVar == null) {
            a.w.c.i.b("components");
            throw null;
        } else if (jVar.f1733d.c() || lVar.c().b.a()) {
            return null;
        } else {
            return new r<>(lVar.c().b, f.f1326g, lVar.b(), lVar.a());
        }
    }

    public final String[] a(l lVar, Set<? extends a.EnumC0036a> set) {
        a.a.a.a.v0.d.b.v.a c2 = lVar.c();
        String[] strArr = c2.f931c;
        if (strArr == null) {
            strArr = c2.f932d;
        }
        if (strArr == null || !set.contains(c2.f930a)) {
            return null;
        }
        return strArr;
    }
}

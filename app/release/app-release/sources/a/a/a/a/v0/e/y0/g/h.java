package a.a.a.a.v0.e.y0.g;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.p0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.e.v;
import a.a.a.a.v0.e.x0.b;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.e;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.h.b;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.q;
import a.j;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1332a;
    public static final h b = new h();

    static {
        g gVar = new g();
        gVar.a(a.f1259a);
        gVar.a(a.b);
        gVar.a(a.f1260c);
        gVar.a(a.f1261d);
        gVar.a(a.f1262e);
        gVar.a(a.f1263f);
        gVar.a(a.f1264g);
        gVar.a(a.f1265h);
        gVar.a(a.i);
        gVar.a(a.j);
        gVar.a(a.k);
        gVar.a(a.l);
        gVar.a(a.m);
        i.a((Object) gVar, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        f1332a = gVar;
    }

    public static final j<g, r> b(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            i.a("data");
            throw null;
        } else if (strArr2 != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
            g a2 = b.a(byteArrayInputStream, strArr2);
            g gVar = f1332a;
            b bVar = (b) r.u;
            q b2 = bVar.b(byteArrayInputStream, gVar);
            bVar.a(b2);
            return new j<>(a2, (r) b2);
        } else {
            i.a("strings");
            throw null;
        }
    }

    public static final j<g, v> c(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            i.a("data");
            throw null;
        } else if (strArr2 != null) {
            byte[] a2 = a.a(strArr);
            i.a((Object) a2, "BitEncoding.decodeBytes(data)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2);
            g a3 = b.a(byteArrayInputStream, strArr2);
            g gVar = f1332a;
            b bVar = (b) v.n;
            q b2 = bVar.b(byteArrayInputStream, gVar);
            bVar.a(b2);
            return new j<>(a3, (v) b2);
        } else {
            i.a("strings");
            throw null;
        }
    }

    public final e.b a(a.a.a.a.v0.e.h hVar, c cVar, a.a.a.a.v0.e.x0.e eVar) {
        String str;
        if (hVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (eVar != null) {
            i.g<a.a.a.a.v0.e.h, a.c> gVar = a.f1259a;
            a.w.c.i.a((Object) gVar, "JvmProtoBuf.constructorSignature");
            a.c cVar2 = (a.c) e.f.a.g.a(hVar, gVar);
            String a2 = (cVar2 == null || !cVar2.i()) ? "<init>" : cVar.a(cVar2.f1277e);
            if (cVar2 == null || !cVar2.h()) {
                List<p0> list = hVar.f1059g;
                a.w.c.i.a((Object) list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) list, 10));
                for (T t : list) {
                    h hVar2 = b;
                    a.w.c.i.a((Object) t, "it");
                    String a3 = hVar2.a(e.f.a.g.a((p0) t, eVar), cVar);
                    if (a3 == null) {
                        return null;
                    }
                    arrayList.add(a3);
                }
                str = f.a(arrayList, "", "(", ")V", 0, (CharSequence) null, (l) null, 56);
            } else {
                str = cVar.a(cVar2.f1278f);
            }
            return new e.b(a2, str);
        } else {
            a.w.c.i.a("typeTable");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r7 == null) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.e.y0.g.e.a a(a.a.a.a.v0.e.z r7, a.a.a.a.v0.e.x0.c r8, a.a.a.a.v0.e.x0.e r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.e.y0.g.h.a(a.a.a.a.v0.e.z, a.a.a.a.v0.e.x0.c, a.a.a.a.v0.e.x0.e, boolean):a.a.a.a.v0.e.y0.g.e$a");
    }

    public final e.b a(r rVar, c cVar, a.a.a.a.v0.e.x0.e eVar) {
        int i;
        String str;
        if (rVar == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar == null) {
            a.w.c.i.a("nameResolver");
            throw null;
        } else if (eVar != null) {
            i.g<r, a.c> gVar = a.b;
            a.w.c.i.a((Object) gVar, "JvmProtoBuf.methodSignature");
            a.c cVar2 = (a.c) e.f.a.g.a(rVar, gVar);
            if (cVar2 == null || !cVar2.i()) {
                i = rVar.f1158h;
            } else {
                i = cVar2.f1277e;
            }
            if (cVar2 == null || !cVar2.h()) {
                List d2 = e.f.a.g.d(e.f.a.g.a(rVar, eVar));
                List<p0> list = rVar.n;
                a.w.c.i.a((Object) list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) list, 10));
                for (T t : list) {
                    a.w.c.i.a((Object) t, "it");
                    arrayList.add(e.f.a.g.a((p0) t, eVar));
                }
                List a2 = f.a((Collection) d2, (Iterable) arrayList);
                ArrayList arrayList2 = new ArrayList(e.f.a.g.a((Iterable) a2, 10));
                Iterator it = ((ArrayList) a2).iterator();
                while (it.hasNext()) {
                    String a3 = b.a((g0) it.next(), cVar);
                    if (a3 == null) {
                        return null;
                    }
                    arrayList2.add(a3);
                }
                String a4 = a(e.f.a.g.b(rVar, eVar), cVar);
                if (a4 == null) {
                    return null;
                }
                str = e.a.a.a.a.a(new StringBuilder(), f.a(arrayList2, "", "(", ")", 0, (CharSequence) null, (l) null, 56), a4);
            } else {
                str = cVar.a(cVar2.f1278f);
            }
            return new e.b(cVar.a(i), str);
        } else {
            a.w.c.i.a("typeTable");
            throw null;
        }
    }

    public static final boolean a(z zVar) {
        if (zVar != null) {
            d dVar = d.b;
            b.C0045b bVar = d.f1323a;
            Object a2 = zVar.a(a.f1262e);
            a.w.c.i.a(a2, "proto.getExtension(JvmProtoBuf.flags)");
            Boolean a3 = bVar.a(((Number) a2).intValue());
            a.w.c.i.a((Object) a3, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
            return a3.booleanValue();
        }
        a.w.c.i.a("proto");
        throw null;
    }

    public final String a(g0 g0Var, c cVar) {
        if (g0Var.m()) {
            return b.a(cVar.c(g0Var.k));
        }
        return null;
    }

    public static final j<g, a.a.a.a.v0.e.f> a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            a.w.c.i.a("data");
            throw null;
        } else if (strArr2 != null) {
            byte[] a2 = a.a(strArr);
            a.w.c.i.a((Object) a2, "BitEncoding.decodeBytes(data)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2);
            g a3 = b.a(byteArrayInputStream, strArr2);
            g gVar = f1332a;
            a.a.a.a.v0.h.b bVar = (a.a.a.a.v0.h.b) a.a.a.a.v0.e.f.B;
            q b2 = bVar.b(byteArrayInputStream, gVar);
            bVar.a(b2);
            return new j<>(a3, (a.a.a.a.v0.e.f) b2);
        } else {
            a.w.c.i.a("strings");
            throw null;
        }
    }

    public final g a(InputStream inputStream, String[] strArr) {
        a.e eVar = (a.e) ((a.a.a.a.v0.h.b) a.e.j).a(inputStream, f1332a);
        a.w.c.i.a((Object) eVar, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new g(eVar, strArr);
    }
}

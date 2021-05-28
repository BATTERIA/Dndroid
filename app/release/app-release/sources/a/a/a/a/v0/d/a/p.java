package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.z.f;
import a.a.a.a.v0.d.b.h;
import a.a.a.a.v0.j.h;
import a.j;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class p implements h {
    public static final boolean a(a aVar, a aVar2) {
        if (aVar == null) {
            i.a("superDescriptor");
            throw null;
        } else if (aVar2 != null) {
            if ((aVar2 instanceof f) && (aVar instanceof s)) {
                f fVar = (f) aVar2;
                s sVar = (s) aVar;
                boolean z = fVar.j().size() == sVar.j().size();
                if (!a.s.f2103a || z) {
                    l0 a2 = fVar.a();
                    i.a((Object) a2, "subDescriptor.original");
                    List<w0> j = a2.j();
                    i.a((Object) j, "subDescriptor.original.valueParameters");
                    s a3 = sVar.a();
                    i.a((Object) a3, "superDescriptor.original");
                    List<w0> j2 = a3.j();
                    i.a((Object) j2, "superDescriptor.original.valueParameters");
                    Iterator it = ((ArrayList) a.t.f.a((Iterable) j, (Iterable) j2)).iterator();
                    while (it.hasNext()) {
                        j jVar = (j) it.next();
                        A a4 = jVar.f2088c;
                        B b = jVar.f2089d;
                        i.a((Object) a4, "subParameter");
                        boolean z2 = a((s) aVar2, (w0) a4) instanceof h.c;
                        i.a((Object) b, "superParameter");
                        if (z2 != (a(sVar, (w0) b) instanceof h.c)) {
                            return true;
                        }
                    }
                } else {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
            }
            return false;
        } else {
            i.a("subDescriptor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.h
    public h.a a() {
        return h.a.CONFLICTS_ONLY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (a.a.a.a.v0.d.a.d.f687d.contains(r1) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (a.w.c.i.a((java.lang.Object) r0, (java.lang.Object) e.f.a.g.a(r1, false, false, 2)) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    @Override // a.a.a.a.v0.j.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.a.a.v0.j.h.b a(a.a.a.a.v0.b.a r8, a.a.a.a.v0.b.a r9, a.a.a.a.v0.b.e r10) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.p.a(a.a.a.a.v0.b.a, a.a.a.a.v0.b.a, a.a.a.a.v0.b.e):a.a.a.a.v0.j.h$b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.d.b.h a(a.a.a.a.v0.b.s r6, a.a.a.a.v0.b.w0 r7) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.p.a(a.a.a.a.v0.b.s, a.a.a.a.v0.b.w0):a.a.a.a.v0.d.b.h");
    }
}

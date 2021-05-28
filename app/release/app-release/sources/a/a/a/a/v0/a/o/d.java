package a.a.a.a.v0.a.o;

import a.a.a.a.v0.a.f;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.j0;
import a.a.a.a.v0.b.d1.s;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.d0;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends j0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(k kVar, d dVar, b.a aVar, boolean z) {
        super(kVar, dVar, h.a.f321a, a.a.a.a.v0.n.k.f1983g, aVar, m0.f491a);
        if (h.b != null) {
            this.n = true;
            this.w = z;
            this.x = false;
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac A[LOOP:1: B:12:0x0056->B:27:0x00ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.a.o.d a(a.a.a.a.v0.a.o.b r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.a.o.d.a(a.a.a.a.v0.a.o.b, boolean):a.a.a.a.v0.a.o.d");
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.d1.s
    public boolean H() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s
    public boolean Q() {
        return false;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.b.d1.j0, a.a.a.a.v0.b.d1.s
    public s a(k kVar, a.a.a.a.v0.b.s sVar, b.a aVar, a.a.a.a.v0.f.d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            i.a("newOwner");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (m0Var != null) {
            return new d(kVar, (d) sVar, aVar, this.w);
        } else {
            i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.s
    public a.a.a.a.v0.b.s a(s.c cVar) {
        boolean z;
        boolean z2;
        a.a.a.a.v0.f.d dVar;
        boolean z3;
        if (cVar != null) {
            d dVar2 = (d) super.a(cVar);
            if (dVar2 == null) {
                return null;
            }
            List<w0> j = dVar2.j();
            i.a((Object) j, "substituted.valueParameters");
            boolean z4 = false;
            if (!j.isEmpty()) {
                Iterator<T> it = j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    i.a((Object) next, "it");
                    d0 c2 = next.c();
                    i.a((Object) c2, "it.type");
                    if (f.a(c2) != null) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return dVar2;
            }
            List<w0> j2 = dVar2.j();
            i.a((Object) j2, "substituted.valueParameters");
            ArrayList arrayList = new ArrayList(g.a((Iterable) j2, 10));
            for (T t : j2) {
                i.a((Object) t, "it");
                d0 c3 = t.c();
                i.a((Object) c3, "it.type");
                arrayList.add(f.a(c3));
            }
            int size = dVar2.j().size() - arrayList.size();
            boolean z5 = size == 0 || size == 1;
            if (!a.s.f2103a || z5) {
                List<w0> j3 = dVar2.j();
                i.a((Object) j3, "valueParameters");
                ArrayList arrayList2 = new ArrayList(g.a((Iterable) j3, 10));
                for (T t2 : j3) {
                    i.a((Object) t2, "it");
                    a.a.a.a.v0.f.d d2 = t2.d();
                    i.a((Object) d2, "it.name");
                    int z6 = t2.z();
                    int i = z6 - size;
                    if (i >= 0 && (dVar = (a.a.a.a.v0.f.d) arrayList.get(i)) != null) {
                        d2 = dVar;
                    }
                    arrayList2.add(t2.a(dVar2, d2, z6));
                }
                s.c b = dVar2.b(a1.b);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((a.a.a.a.v0.f.d) it2.next()) == null) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z4 = true;
                            break;
                        }
                    }
                }
                b.u = Boolean.valueOf(z4);
                b.f423g = arrayList2;
                b.f421e = dVar2.a();
                i.a((Object) b, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
                a.a.a.a.v0.b.s a2 = super.a(b);
                if (a2 != null) {
                    return a2;
                }
                i.a();
                throw null;
            }
            throw new AssertionError("Assertion failed");
        }
        i.a("configuration");
        throw null;
    }
}

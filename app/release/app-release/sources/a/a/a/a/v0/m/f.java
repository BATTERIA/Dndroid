package a.a.a.a.v0.m;

import a.a.a.a.v0.m.g;
import a.a.a.a.v0.m.i1.a;
import a.a.a.a.v0.m.i1.b;
import a.a.a.a.v0.m.k1.h;
import a.a.a.a.v0.m.k1.j;
import a.a.a.a.v0.m.k1.k;
import a.a.a.a.v0.m.k1.n;
import a.a.a.a.v0.m.k1.q;
import a.s;
import a.t.l;
import a.w.c.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class f {
    public static final List<h> a(g gVar, h hVar, k kVar) {
        g.b bVar;
        if (((b) gVar) == null) {
            throw null;
        } else if (hVar == null) {
            i.a("$this$fastCorrespondingSupertypes");
            throw null;
        } else if (kVar == null) {
            i.a("constructor");
            throw null;
        } else if (!gVar.j(kVar) && gVar.i(hVar)) {
            return l.f2119c;
        } else {
            if (!gVar.l(kVar)) {
                a.a.a.a.v0.o.l lVar = new a.a.a.a.v0.o.l();
                gVar.b();
                ArrayDeque<h> arrayDeque = gVar.f1841c;
                if (arrayDeque != null) {
                    Set<h> set = gVar.f1842d;
                    if (set != null) {
                        arrayDeque.push(hVar);
                        while (!arrayDeque.isEmpty()) {
                            if (set.size() <= 1000) {
                                h pop = arrayDeque.pop();
                                i.a((Object) pop, "current");
                                if (set.add(pop)) {
                                    h a2 = gVar.a(pop, a.a.a.a.v0.m.k1.b.f1911c);
                                    if (a2 == null) {
                                        a2 = pop;
                                    }
                                    if (gVar.b(gVar.a(a2), kVar)) {
                                        lVar.add(a2);
                                        bVar = g.b.c.f1848a;
                                    } else if (gVar.d((a.a.a.a.v0.m.k1.g) a2) == 0) {
                                        bVar = g.b.C0071b.f1847a;
                                    } else {
                                        b bVar2 = (b) gVar;
                                        if (a2 instanceof k0) {
                                            bVar = new a(bVar2, u0.b.a((d0) a2).c());
                                        } else {
                                            throw new IllegalArgumentException(e.f.a.g.a(a2).toString());
                                        }
                                    }
                                    if (!(!i.a(bVar, g.b.c.f1848a))) {
                                        bVar = null;
                                    }
                                    if (bVar != null) {
                                        for (a.a.a.a.v0.m.k1.g gVar2 : gVar.a(gVar.a(pop))) {
                                            arrayDeque.add(bVar.a(gVar, gVar2));
                                        }
                                    }
                                }
                            } else {
                                StringBuilder a3 = e.a.a.a.a.a("Too many supertypes for type: ", hVar, ". Supertypes = ");
                                a3.append(a.t.f.a(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (a.w.b.l) null, 63));
                                throw new IllegalStateException(a3.toString().toString());
                            }
                        }
                        gVar.a();
                        return lVar;
                    }
                    i.a();
                    throw null;
                }
                i.a();
                throw null;
            } else if (!gVar.b(gVar.a(hVar), kVar)) {
                return l.f2119c;
            } else {
                h a4 = gVar.a(hVar, a.a.a.a.v0.m.k1.b.f1911c);
                if (a4 != null) {
                    hVar = a4;
                }
                return e.f.a.g.c(hVar);
            }
        }
    }

    public static final List<h> b(g gVar, h hVar, k kVar) {
        List<h> a2 = a(gVar, hVar, kVar);
        if (a2.size() < 2) {
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            a.a.a.a.v0.m.k1.i g2 = gVar.g((h) next);
            int a3 = gVar.a(g2);
            int i = 0;
            while (true) {
                if (i >= a3) {
                    break;
                }
                if (!(gVar.i(gVar.c(gVar.a(g2, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (b(r21, r7, r12) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0205 A[LOOP:2: B:108:0x01ca->B:125:0x0205, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0200 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(a.a.a.a.v0.m.g r21, a.a.a.a.v0.m.k1.g r22, a.a.a.a.v0.m.k1.g r23) {
        /*
        // Method dump skipped, instructions count: 1392
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.f.b(a.a.a.a.v0.m.g, a.a.a.a.v0.m.k1.g, a.a.a.a.v0.m.k1.g):boolean");
    }

    public static final boolean a(g gVar, a.a.a.a.v0.m.k1.g gVar2, a.a.a.a.v0.m.k1.g gVar3) {
        if (gVar == null) {
            i.a("context");
            throw null;
        } else if (gVar2 == null) {
            i.a("a");
            throw null;
        } else if (gVar3 == null) {
            i.a("b");
            throw null;
        } else if (gVar2 == gVar3) {
            return true;
        } else {
            if (gVar.c(gVar.c(gVar2)) && !e.f.a.g.c((b) gVar, gVar2) && !gVar.m(gVar2) && i.a(gVar.a(gVar.b(gVar2)), gVar.a(gVar.e(gVar2)))) {
                if (gVar.c(gVar.c(gVar3)) && !e.f.a.g.c((b) gVar, gVar3) && !gVar.m(gVar3) && i.a(gVar.a(gVar.b(gVar3)), gVar.a(gVar.e(gVar3)))) {
                    a.a.a.a.v0.m.k1.g o = gVar.o(gVar2);
                    a.a.a.a.v0.m.k1.g o2 = gVar.o(gVar3);
                    h b = gVar.b(o);
                    if (!gVar.b(gVar.c(o), gVar.c(o2))) {
                        return false;
                    }
                    if (gVar.d((a.a.a.a.v0.m.k1.g) b) == 0) {
                        b bVar = (b) gVar;
                        if (e.f.a.g.a((n) bVar, o) || e.f.a.g.a((n) bVar, o2) || gVar.d(b) == gVar.d(gVar.b(o2))) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (!b(gVar, gVar2, gVar3) || !b(gVar, gVar3, gVar2)) {
                return false;
            }
            return true;
        }
    }

    public static final boolean a(g gVar, a.a.a.a.v0.m.k1.i iVar, h hVar) {
        boolean z;
        if (gVar == null) {
            i.a("$this$isSubtypeForSameConstructor");
            throw null;
        } else if (iVar == null) {
            i.a("capturedSubArguments");
            throw null;
        } else if (hVar != null) {
            k a2 = gVar.a(hVar);
            int b = gVar.b(a2);
            for (int i = 0; i < b; i++) {
                j a3 = gVar.a(hVar, i);
                if (!gVar.b(a3)) {
                    a.a.a.a.v0.m.k1.g c2 = gVar.c(a3);
                    b bVar = (b) gVar;
                    j a4 = e.f.a.g.a(bVar, iVar, i);
                    boolean z2 = gVar.a(a4) == q.INV;
                    if (!s.f2103a || z2) {
                        a.a.a.a.v0.m.k1.g c3 = gVar.c(a4);
                        q a5 = gVar.a(gVar.a(a2, i));
                        q a6 = gVar.a(a3);
                        if (a5 == null) {
                            i.a("declared");
                            throw null;
                        } else if (a6 != null) {
                            q qVar = q.INV;
                            if (a5 == qVar) {
                                a5 = a6;
                            } else if (!(a6 == qVar || a5 == a6)) {
                                a5 = null;
                            }
                            if (a5 == null) {
                                return bVar.f1866e;
                            }
                            int i2 = gVar.f1840a;
                            if (i2 <= 100) {
                                gVar.f1840a = i2 + 1;
                                int ordinal = a5.ordinal();
                                if (ordinal == 0) {
                                    z = b(gVar, c2, c3);
                                } else if (ordinal == 1) {
                                    z = b(gVar, c3, c2);
                                } else if (ordinal == 2) {
                                    z = a(gVar, c3, c2);
                                } else {
                                    throw new a.h();
                                }
                                gVar.f1840a--;
                                if (!z) {
                                    return false;
                                }
                            } else {
                                throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + c3).toString());
                            }
                        } else {
                            i.a("useSite");
                            throw null;
                        }
                    } else {
                        throw new AssertionError("Incorrect sub argument: " + a4);
                    }
                }
            }
            return true;
        } else {
            i.a("superType");
            throw null;
        }
    }
}

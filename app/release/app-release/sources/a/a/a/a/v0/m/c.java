package a.a.a.a.v0.m;

import a.a.a.a.v0.m.g;
import a.a.a.a.v0.m.k1.h;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import e.a.a.a.a;
import java.util.ArrayDeque;
import java.util.Set;

public final class c {
    public static final boolean a(g gVar, h hVar, g.b bVar) {
        if (gVar == null) {
            i.a("$this$hasNotNullSupertype");
            throw null;
        } else if (hVar == null) {
            i.a("type");
            throw null;
        } else if (bVar != null) {
            if (!((gVar.i(hVar) && !gVar.d(hVar)) || gVar.m(hVar))) {
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
                                    g.b bVar2 = gVar.d(pop) ? g.b.c.f1848a : bVar;
                                    if (!(!i.a(bVar2, g.b.c.f1848a))) {
                                        bVar2 = null;
                                    }
                                    if (bVar2 != null) {
                                        for (a.a.a.a.v0.m.k1.g gVar2 : gVar.a(gVar.a(pop))) {
                                            h a2 = bVar2.a(gVar, gVar2);
                                            if ((gVar.i(a2) && !gVar.d(a2)) || gVar.m(a2)) {
                                                gVar.a();
                                            } else {
                                                arrayDeque.add(a2);
                                            }
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                StringBuilder a3 = a.a("Too many supertypes for type: ", hVar, ". Supertypes = ");
                                a3.append(f.a(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
                                throw new IllegalStateException(a3.toString().toString());
                            }
                        }
                        gVar.a();
                        return false;
                    }
                    i.a();
                    throw null;
                }
                i.a();
                throw null;
            }
            return true;
        } else {
            i.a("supertypesPolicy");
            throw null;
        }
    }
}

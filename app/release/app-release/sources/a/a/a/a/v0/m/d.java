package a.a.a.a.v0.m;

import a.a.a.a.v0.m.k1.f;
import a.a.a.a.v0.m.k1.g;
import a.a.a.a.v0.m.k1.h;
import a.a.a.a.v0.m.k1.j;
import a.a.a.a.v0.m.k1.n;
import a.w.c.i;

public final class d {
    public static final boolean a(n nVar, g gVar, g gVar2) {
        if (nVar == null) {
            i.a("context");
            throw null;
        } else if (gVar == null) {
            i.a("a");
            throw null;
        } else if (gVar2 != null) {
            return b(nVar, gVar, gVar2);
        } else {
            i.a("b");
            throw null;
        }
    }

    public static final boolean a(n nVar, h hVar, h hVar2) {
        if (nVar.d((g) hVar) == nVar.d((g) hVar2) && nVar.d(hVar) == nVar.d(hVar2)) {
            if ((nVar.e(hVar) == null) == (nVar.e(hVar2) == null) && nVar.a(nVar.a(hVar), nVar.a(hVar2))) {
                if (nVar.a(hVar, hVar2)) {
                    return true;
                }
                int d2 = nVar.d((g) hVar);
                for (int i = 0; i < d2; i++) {
                    j a2 = nVar.a(hVar, i);
                    j a3 = nVar.a(hVar2, i);
                    if (nVar.b(a2) != nVar.b(a3)) {
                        return false;
                    }
                    if (!(nVar.b(a2) || (nVar.a(a2) == nVar.a(a3) && b(nVar, nVar.c(a2), nVar.c(a3))))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean b(n nVar, g gVar, g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        h a2 = nVar.a(gVar);
        h a3 = nVar.a(gVar2);
        if (a2 != null && a3 != null) {
            return a(nVar, a2, a3);
        }
        f i = nVar.i(gVar);
        f i2 = nVar.i(gVar2);
        return i != null && i2 != null && a(nVar, nVar.c(i), nVar.c(i2)) && a(nVar, nVar.b(i), nVar.b(i2));
    }
}

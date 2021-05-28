package a.a.a.a.v0.d.b;

import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.e;
import a.h;
import a.w.c.f;
import a.w.c.i;
import e.a.a.a.a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f918a;

    public /* synthetic */ o(String str, f fVar) {
        this.f918a = str;
    }

    public static final o a(String str, String str2) {
        if (str == null) {
            i.a("name");
            throw null;
        } else if (str2 != null) {
            return new o(str + '#' + str2, null);
        } else {
            i.a("desc");
            throw null;
        }
    }

    public static final o b(String str, String str2) {
        if (str == null) {
            i.a("name");
            throw null;
        } else if (str2 != null) {
            return new o(a.b(str, str2), null);
        } else {
            i.a("desc");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o) && i.a(this.f918a, ((o) obj).f918a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f918a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.a(a.a("MemberSignature(signature="), this.f918a, ")");
    }

    public static final o a(e eVar) {
        if (eVar == null) {
            i.a("signature");
            throw null;
        } else if (eVar instanceof e.b) {
            return b(eVar.c(), eVar.b());
        } else {
            if (eVar instanceof e.a) {
                return a(eVar.c(), eVar.b());
            }
            throw new h();
        }
    }

    public static final o a(c cVar, a.c cVar2) {
        if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (cVar2 != null) {
            return b(cVar.a(cVar2.f1277e), cVar.a(cVar2.f1278f));
        } else {
            i.a("signature");
            throw null;
        }
    }

    public static final o a(o oVar, int i) {
        if (oVar != null) {
            return new o(oVar.f918a + '@' + i, null);
        }
        i.a("signature");
        throw null;
    }
}

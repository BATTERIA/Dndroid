package a.a.a.a.v0.d.a;

import a.a.a.a.v0.f.d;
import a.w.c.i;
import e.a.a.a.a;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final d f825a;
    public final String b;

    public u(d dVar, String str) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (str != null) {
            this.f825a = dVar;
            this.b = str;
        } else {
            i.a("signature");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i.a(this.f825a, uVar.f825a) && i.a(this.b, uVar.b);
    }

    public int hashCode() {
        d dVar = this.f825a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = a.a("NameAndSignature(name=");
        a2.append(this.f825a);
        a2.append(", signature=");
        return a.a(a2, this.b, ")");
    }
}

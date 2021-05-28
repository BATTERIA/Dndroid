package a.a.a.a.v0.d.a.d0;

import a.w.c.i;
import e.a.a.a.a;

public final class h {

    /* renamed from: a */
    public final g f706a;
    public final boolean b;

    public h(g gVar, boolean z) {
        if (gVar != null) {
            this.f706a = gVar;
            this.b = z;
            return;
        }
        i.a("qualifier");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(g gVar, boolean z, int i) {
        this(gVar, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ h a(h hVar, g gVar, boolean z, int i) {
        if ((i & 1) != 0) {
            gVar = hVar.f706a;
        }
        if ((i & 2) != 0) {
            z = hVar.b;
        }
        if (hVar == null) {
            throw null;
        } else if (gVar != null) {
            return new h(gVar, z);
        } else {
            i.a("qualifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.f706a, hVar.f706a) && this.b == hVar.b;
    }

    public int hashCode() {
        g gVar = this.f706a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = a.a("NullabilityQualifierWithMigrationStatus(qualifier=");
        a2.append(this.f706a);
        a2.append(", isForWarningOnly=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

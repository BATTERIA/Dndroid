package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.m.d0;
import a.w.c.i;
import e.a.a.a.a;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f772a;
    public final d b;

    public u(d0 d0Var, d dVar) {
        if (d0Var != null) {
            this.f772a = d0Var;
            this.b = dVar;
            return;
        }
        i.a("type");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i.a(this.f772a, uVar.f772a) && i.a(this.b, uVar.b);
    }

    public int hashCode() {
        d0 d0Var = this.f772a;
        int i = 0;
        int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        d dVar = this.b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = a.a("TypeAndDefaultQualifiers(type=");
        a2.append(this.f772a);
        a2.append(", defaultQualifiers=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

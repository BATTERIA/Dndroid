package a.a.a.a.v0.d.a.a0;

import a.a.a.a.v0.d.a.a;
import a.a.a.a.v0.d.a.d0.h;
import a.w.c.i;
import java.util.Collection;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final h f570a;
    public final Collection<a.EnumC0022a> b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.d.a.a$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(h hVar, Collection<? extends a.EnumC0022a> collection) {
        if (hVar == null) {
            i.a("nullabilityQualifier");
            throw null;
        } else if (collection != 0) {
            this.f570a = hVar;
            this.b = collection;
        } else {
            i.a("qualifierApplicabilityTypes");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.f570a, kVar.f570a) && i.a(this.b, kVar.b);
    }

    public int hashCode() {
        h hVar = this.f570a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Collection<a.EnumC0022a> collection = this.b;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        a2.append(this.f570a);
        a2.append(", qualifierApplicabilityTypes=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

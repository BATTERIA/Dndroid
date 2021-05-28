package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.y.l;
import a.w.c.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final l f654a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f655c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f656d;

    public a(l lVar, b bVar, boolean z, r0 r0Var) {
        if (lVar == null) {
            i.a("howThisTypeIsUsed");
            throw null;
        } else if (bVar != null) {
            this.f654a = lVar;
            this.b = bVar;
            this.f655c = z;
            this.f656d = r0Var;
        } else {
            i.a("flexibility");
            throw null;
        }
    }

    public final a a(b bVar) {
        if (bVar != null) {
            l lVar = this.f654a;
            boolean z = this.f655c;
            r0 r0Var = this.f656d;
            if (lVar == null) {
                i.a("howThisTypeIsUsed");
                throw null;
            } else if (bVar != null) {
                return new a(lVar, bVar, z, r0Var);
            } else {
                i.a("flexibility");
                throw null;
            }
        } else {
            i.a("flexibility");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f654a, aVar.f654a) && i.a(this.b, aVar.b) && this.f655c == aVar.f655c && i.a(this.f656d, aVar.f656d);
    }

    public int hashCode() {
        l lVar = this.f654a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z = this.f655c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        r0 r0Var = this.f656d;
        if (r0Var != null) {
            i = r0Var.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("JavaTypeAttributes(howThisTypeIsUsed=");
        a2.append(this.f654a);
        a2.append(", flexibility=");
        a2.append(this.b);
        a2.append(", isForAnnotationParameter=");
        a2.append(this.f655c);
        a2.append(", upperBoundOfTypeParameter=");
        a2.append(this.f656d);
        a2.append(")");
        return a2.toString();
    }
}

package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.e.x0.a;
import a.a.a.a.v0.e.x0.c;
import a.w.c.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f1675a;
    public final a.a.a.a.v0.e.f b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1676c;

    /* renamed from: d  reason: collision with root package name */
    public final m0 f1677d;

    public f(c cVar, a.a.a.a.v0.e.f fVar, a aVar, m0 m0Var) {
        if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (fVar == null) {
            i.a("classProto");
            throw null;
        } else if (aVar == null) {
            i.a("metadataVersion");
            throw null;
        } else if (m0Var != null) {
            this.f1675a = cVar;
            this.b = fVar;
            this.f1676c = aVar;
            this.f1677d = m0Var;
        } else {
            i.a("sourceElement");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.f1675a, fVar.f1675a) && i.a(this.b, fVar.b) && i.a(this.f1676c, fVar.f1676c) && i.a(this.f1677d, fVar.f1677d);
    }

    public int hashCode() {
        c cVar = this.f1675a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        a.a.a.a.v0.e.f fVar = this.b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        a aVar = this.f1676c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        m0 m0Var = this.f1677d;
        if (m0Var != null) {
            i = m0Var.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("ClassData(nameResolver=");
        a2.append(this.f1675a);
        a2.append(", classProto=");
        a2.append(this.b);
        a2.append(", metadataVersion=");
        a2.append(this.f1676c);
        a2.append(", sourceElement=");
        a2.append(this.f1677d);
        a2.append(")");
        return a2.toString();
    }
}

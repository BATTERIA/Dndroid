package a.a.a.a.v0.k.b;

import a.a.a.a.v0.e.x0.a;
import a.w.c.i;

public final class r<T extends a> {

    /* renamed from: a  reason: collision with root package name */
    public final T f1752a;
    public final T b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1753c;

    /* renamed from: d  reason: collision with root package name */
    public final a.a.a.a.v0.f.a f1754d;

    public r(T t, T t2, String str, a.a.a.a.v0.f.a aVar) {
        if (t == null) {
            i.a("actualVersion");
            throw null;
        } else if (t2 == null) {
            i.a("expectedVersion");
            throw null;
        } else if (str == null) {
            i.a("filePath");
            throw null;
        } else if (aVar != null) {
            this.f1752a = t;
            this.b = t2;
            this.f1753c = str;
            this.f1754d = aVar;
        } else {
            i.a("classId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.f1752a, rVar.f1752a) && i.a(this.b, rVar.b) && i.a(this.f1753c, rVar.f1753c) && i.a(this.f1754d, rVar.f1754d);
    }

    public int hashCode() {
        T t = this.f1752a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.f1753c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        a.a.a.a.v0.f.a aVar = this.f1754d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("IncompatibleVersionErrorData(actualVersion=");
        a2.append(this.f1752a);
        a2.append(", expectedVersion=");
        a2.append(this.b);
        a2.append(", filePath=");
        a2.append(this.f1753c);
        a2.append(", classId=");
        a2.append(this.f1754d);
        a2.append(")");
        return a2.toString();
    }
}

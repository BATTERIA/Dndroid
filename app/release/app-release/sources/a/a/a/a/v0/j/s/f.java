package a.a.a.a.v0.j.s;

import a.a.a.a.v0.f.a;
import a.w.c.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a f1577a;
    public final int b;

    public f(a aVar, int i) {
        if (aVar != null) {
            this.f1577a = aVar;
            this.b = i;
            return;
        }
        i.a("classId");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.f1577a, fVar.f1577a) && this.b == fVar.b;
    }

    public int hashCode() {
        a aVar = this.f1577a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f1577a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

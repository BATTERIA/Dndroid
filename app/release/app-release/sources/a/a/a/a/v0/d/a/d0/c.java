package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b1.h;
import a.w.c.i;
import e.a.a.a.a;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f692a;
    public final h b;

    public c(T t, h hVar) {
        this.f692a = t;
        this.b = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f692a, cVar.f692a) && i.a(this.b, cVar.b);
    }

    public int hashCode() {
        T t = this.f692a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        h hVar = this.b;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = a.a("EnhancementResult(result=");
        a2.append((Object) this.f692a);
        a2.append(", enhancementAnnotations=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}

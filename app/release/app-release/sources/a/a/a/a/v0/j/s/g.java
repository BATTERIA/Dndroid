package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.w.c.i;

public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f1578a;

    public g(T t) {
        this.f1578a = t;
    }

    public abstract d0 a(w wVar);

    public T a() {
        return this.f1578a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T a2 = a();
            Object obj2 = null;
            if (!(obj instanceof g)) {
                obj = null;
            }
            g gVar = (g) obj;
            if (gVar != null) {
                obj2 = gVar.a();
            }
            return i.a(a2, obj2);
        }
    }

    public int hashCode() {
        T a2 = a();
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(a());
    }
}

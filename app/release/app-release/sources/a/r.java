package a;

import a.w.b.a;
import a.w.c.i;
import java.io.Serializable;

public final class r<T> implements e<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public a<? extends T> f2101c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2102d;

    public r(a<? extends T> aVar) {
        if (aVar != null) {
            this.f2101c = aVar;
            this.f2102d = o.f2099a;
            return;
        }
        i.a("initializer");
        throw null;
    }

    @Override // a.e
    public T getValue() {
        if (this.f2102d == o.f2099a) {
            a<? extends T> aVar = this.f2101c;
            if (aVar != null) {
                this.f2102d = aVar.a();
                this.f2101c = null;
            } else {
                i.a();
                throw null;
            }
        }
        return (T) this.f2102d;
    }

    public String toString() {
        return this.f2102d != o.f2099a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

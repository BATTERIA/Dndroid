package a;

import a.w.b.a;
import a.w.c.i;
import java.io.Serializable;

public final class l<T> implements e<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public a<? extends T> f2093c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f2094d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2095e;

    public /* synthetic */ l(a aVar, Object obj, int i) {
        obj = (i & 2) != 0 ? null : obj;
        if (aVar != null) {
            this.f2093c = aVar;
            this.f2094d = o.f2099a;
            this.f2095e = obj == null ? this : obj;
            return;
        }
        i.a("initializer");
        throw null;
    }

    @Override // a.e
    public T getValue() {
        T t;
        T t2 = (T) this.f2094d;
        if (t2 != o.f2099a) {
            return t2;
        }
        synchronized (this.f2095e) {
            t = (T) this.f2094d;
            if (t == o.f2099a) {
                a<? extends T> aVar = this.f2093c;
                if (aVar != null) {
                    t = (T) aVar.a();
                    this.f2094d = t;
                    this.f2093c = null;
                } else {
                    i.a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return this.f2094d != o.f2099a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

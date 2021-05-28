package a;

import a.w.b.a;
import a.w.c.i;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k<T> implements e<T>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<k<?>, Object> f2090e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "d");

    /* renamed from: c  reason: collision with root package name */
    public volatile a<? extends T> f2091c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f2092d;

    public k(a<? extends T> aVar) {
        if (aVar != null) {
            this.f2091c = aVar;
            this.f2092d = o.f2099a;
            return;
        }
        i.a("initializer");
        throw null;
    }

    @Override // a.e
    public T getValue() {
        T t = (T) this.f2092d;
        if (t != o.f2099a) {
            return t;
        }
        a<? extends T> aVar = this.f2091c;
        if (aVar != null) {
            T t2 = (T) aVar.a();
            if (f2090e.compareAndSet(this, o.f2099a, t2)) {
                this.f2091c = null;
                return t2;
            }
        }
        return (T) this.f2092d;
    }

    public String toString() {
        return this.f2092d != o.f2099a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

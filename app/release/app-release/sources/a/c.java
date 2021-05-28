package a;

import java.io.Serializable;

public final class c<T> implements e<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public final T f2083c;

    public c(T t) {
        this.f2083c = t;
    }

    @Override // a.e
    public T getValue() {
        return this.f2083c;
    }

    public String toString() {
        return String.valueOf(this.f2083c);
    }
}

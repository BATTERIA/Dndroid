package e.h.a.g0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f4806a;
    public final Type b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4807c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a2 = e.h.a.f0.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a2;
            this.f4806a = (Class<? super T>) e.h.a.f0.a.c(a2);
            this.f4807c = this.b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && e.h.a.f0.a.a(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.f4807c;
    }

    public final String toString() {
        return e.h.a.f0.a.d(this.b);
    }

    public a(Type type) {
        if (type != null) {
            Type a2 = e.h.a.f0.a.a(type);
            this.b = a2;
            this.f4806a = (Class<? super T>) e.h.a.f0.a.c(a2);
            this.f4807c = this.b.hashCode();
            return;
        }
        throw null;
    }
}

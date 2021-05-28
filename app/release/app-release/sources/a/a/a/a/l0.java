package a.a.a.a;

import a.w.b.a;

public class l0<T> extends m0<T> {
    public final a<T> b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f98c;

    public l0(a<T> aVar) {
        if (aVar != null) {
            this.f98c = null;
            this.b = aVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
    }

    @Override // a.a.a.a.m0
    public T a() {
        T t = (T) this.f98c;
        if (t == null) {
            T a2 = this.b.a();
            this.f98c = a2 == null ? m0.f100a : a2;
            return a2;
        } else if (t == m0.f100a) {
            return null;
        } else {
            return t;
        }
    }
}

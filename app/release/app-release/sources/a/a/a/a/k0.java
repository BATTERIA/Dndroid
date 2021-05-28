package a.a.a.a;

import a.w.b.a;
import java.lang.ref.SoftReference;

public class k0<T> extends m0<T> {
    public final a<T> b;

    /* renamed from: c  reason: collision with root package name */
    public volatile SoftReference<Object> f95c;

    public k0(T t, a<T> aVar) {
        if (aVar != null) {
            this.f95c = null;
            this.b = aVar;
            if (t != null) {
                this.f95c = new SoftReference<>(t);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
    }

    @Override // a.a.a.a.m0
    public T a() {
        T t;
        SoftReference<Object> softReference = this.f95c;
        if (softReference == null || (t = (T) softReference.get()) == null) {
            T a2 = this.b.a();
            this.f95c = new SoftReference<>(a2 == null ? m0.f100a : a2);
            return a2;
        } else if (t == m0.f100a) {
            return null;
        } else {
            return t;
        }
    }
}

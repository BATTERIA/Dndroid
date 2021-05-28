package a.a.a.a;

import a.w.c.i;
import java.lang.ref.WeakReference;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ClassLoader> f123a;
    public final int b;

    public t0(ClassLoader classLoader) {
        if (classLoader != null) {
            this.f123a = new WeakReference<>(classLoader);
            this.b = System.identityHashCode(classLoader);
            return;
        }
        i.a("classLoader");
        throw null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t0) && this.f123a.get() == ((t0) obj).f123a.get();
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        String classLoader;
        ClassLoader classLoader2 = this.f123a.get();
        return (classLoader2 == null || (classLoader = classLoader2.toString()) == null) ? "<null>" : classLoader;
    }
}

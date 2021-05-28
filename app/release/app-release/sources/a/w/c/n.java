package a.w.c;

public final class n implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f2144a;

    public n(Class<?> cls, String str) {
        if (cls == null) {
            i.a("jClass");
            throw null;
        } else if (str != null) {
            this.f2144a = cls;
        } else {
            i.a("moduleName");
            throw null;
        }
    }

    @Override // a.w.c.c
    public Class<?> b() {
        return this.f2144a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && i.a(this.f2144a, ((n) obj).f2144a);
    }

    public int hashCode() {
        return this.f2144a.hashCode();
    }

    public String toString() {
        return this.f2144a.toString() + " (Kotlin reflection is not available)";
    }
}

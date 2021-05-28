package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.u;
import a.a.a.a.v0.j.v.c;
import a.w.c.i;
import java.lang.reflect.Type;

public final class c0 extends d0 implements u {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f458a;

    public c0(Class<?> cls) {
        if (cls != null) {
            this.f458a = cls;
        } else {
            i.a("reflectType");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e1.b.d0
    public Type S() {
        return this.f458a;
    }

    @Override // a.a.a.a.v0.d.a.c0.u
    public a.a.a.a.v0.a.i c() {
        if (i.a(this.f458a, Void.TYPE)) {
            return null;
        }
        c a2 = c.a(this.f458a.getName());
        i.a((Object) a2, "JvmPrimitiveType.get(reflectType.name)");
        return a2.b();
    }
}

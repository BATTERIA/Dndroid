package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.h;
import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.f.d;
import a.w.c.i;

public final class r extends d implements h {
    public final Class<?> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(d dVar, Class<?> cls) {
        super(dVar);
        if (cls != null) {
            this.b = cls;
            return;
        }
        i.a("klass");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.h
    public v f() {
        return d0.a(this.b);
    }
}

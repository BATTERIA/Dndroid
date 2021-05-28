package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.m;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.d;
import a.w.c.i;

public final class v extends d implements m {
    public final Enum<?> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(d dVar, Enum<?> r2) {
        super(dVar);
        if (r2 != null) {
            this.b = r2;
            return;
        }
        i.a("value");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.m
    public d a() {
        return d.b(this.b.name());
    }

    @Override // a.a.a.a.v0.d.a.c0.m
    public a c() {
        Class<?> cls = this.b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        i.a((Object) cls, "enumClass");
        return b.b(cls);
    }
}

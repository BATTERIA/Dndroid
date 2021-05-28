package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.o;
import a.a.a.a.v0.f.d;
import a.w.c.i;

public final class x extends d implements o {
    public final Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(d dVar, Object obj) {
        super(dVar);
        if (obj != null) {
            this.b = obj;
            return;
        }
        i.a("value");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.o
    public Object getValue() {
        return this.b;
    }
}

package a.a.a.a.v0.j.w;

import a.a.a.a.v0.l.g;
import a.w.c.i;

public final class h extends a {
    public final g<i> b;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.v0.l.g<? extends a.a.a.a.v0.j.w.i> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(g<? extends i> gVar) {
        if (gVar != 0) {
            this.b = gVar;
        } else {
            i.a("scope");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.a
    public i c() {
        return (i) this.b.a();
    }
}

package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.d1.d0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.l.j;
import a.w.c.i;

public abstract class n extends d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(b bVar, j jVar, w wVar) {
        super(wVar, bVar);
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (wVar != null) {
        } else {
            i.a("module");
            throw null;
        }
    }

    public abstract void a(j jVar);
}

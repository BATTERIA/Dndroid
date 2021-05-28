package a.a.a.a.v0.j;

import a.a.a.a.v0.b.b;
import a.w.c.i;
import java.util.Collection;

public abstract class k {
    public abstract void a(b bVar);

    public void a(b bVar, Collection<? extends b> collection) {
        if (bVar == null) {
            i.a("member");
            throw null;
        } else if (collection != null) {
            bVar.a(collection);
        } else {
            i.a("overridden");
            throw null;
        }
    }
}

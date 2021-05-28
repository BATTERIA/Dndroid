package a.z;

import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.Iterator;

public final class o extends j implements l<h<? extends R>, Iterator<? extends R>> {

    /* renamed from: c  reason: collision with root package name */
    public static final o f2187c = new o();

    public o() {
        super(1);
    }

    @Override // a.w.b.l
    public Object a(Object obj) {
        h hVar = (h) obj;
        if (hVar != null) {
            return hVar.iterator();
        }
        i.a("it");
        throw null;
    }
}

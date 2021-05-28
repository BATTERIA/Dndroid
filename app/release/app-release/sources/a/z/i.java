package a.z;

import a.w.b.l;
import a.w.c.j;
import java.util.Iterator;

public final class i extends j implements l<h<? extends T>, Iterator<? extends T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final i f2181c = new i();

    public i() {
        super(1);
    }

    @Override // a.w.b.l
    public Object a(Object obj) {
        h hVar = (h) obj;
        if (hVar != null) {
            return hVar.iterator();
        }
        a.w.c.i.a("it");
        throw null;
    }
}

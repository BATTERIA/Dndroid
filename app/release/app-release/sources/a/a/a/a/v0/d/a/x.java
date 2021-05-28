package a.a.a.a.v0.d.a;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.b;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class x extends j implements l<b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final x f828c = new x();

    public x() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            return Boolean.valueOf(g.c(bVar2) && e.a(bVar2) != null);
        }
        i.a("it");
        throw null;
    }
}

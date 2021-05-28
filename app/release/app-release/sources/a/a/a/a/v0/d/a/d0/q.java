package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class q extends j implements l<b, d0> {

    /* renamed from: c  reason: collision with root package name */
    public static final q f764c = new q();

    public q() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public d0 a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            d0 h2 = bVar2.h();
            if (h2 != null) {
                return h2;
            }
            i.a();
            throw null;
        }
        i.a("it");
        throw null;
    }
}

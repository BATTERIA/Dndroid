package a.a.a.a.v0.d.a;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.j.u.a;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class w extends j implements l<b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final w f827c = new w();

    public w() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            d dVar = d.f689f;
            l0 l0Var = (l0) bVar2;
            boolean z = true;
            if (!g.c(l0Var) || a.a(l0Var, false, new c(l0Var), 1) == null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        i.a("it");
        throw null;
    }
}

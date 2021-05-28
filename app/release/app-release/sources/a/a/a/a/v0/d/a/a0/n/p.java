package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.l1.a;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.o.c;
import a.t.f;
import a.w.c.i;
import a.z.h;
import a.z.m;
import java.util.Collection;

public final class p<N> implements c<N> {

    /* renamed from: a  reason: collision with root package name */
    public static final p f651a = new p();

    @Override // a.a.a.a.v0.o.c
    public Iterable a(Object obj) {
        e eVar = (e) obj;
        i.a((Object) eVar, "it");
        s0 n = eVar.n();
        i.a((Object) n, "it.typeConstructor");
        Collection<d0> b = n.b();
        i.a((Object) b, "it.typeConstructor.supertypes");
        h e2 = a.e(f.a(b), o.f650c);
        if (e2 != null) {
            return new m(e2);
        }
        i.a("$this$asIterable");
        throw null;
    }
}

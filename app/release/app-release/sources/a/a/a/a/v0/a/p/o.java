package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.o.c;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class o<N> implements c<N> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f294a;

    public o(k kVar) {
        this.f294a = kVar;
    }

    @Override // a.a.a.a.v0.o.c
    public Iterable a(Object obj) {
        e eVar = (e) obj;
        i.a((Object) eVar, "it");
        s0 n = eVar.n();
        i.a((Object) n, "it.typeConstructor");
        Collection<d0> b = n.b();
        i.a((Object) b, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            h c2 = it.next().I0().c();
            a.a.a.a.v0.d.a.a0.n.e eVar2 = null;
            h a2 = c2 != null ? c2.a() : null;
            if (!(a2 instanceof e)) {
                a2 = null;
            }
            e eVar3 = (e) a2;
            if (eVar3 != null) {
                eVar2 = this.f294a.d(eVar3);
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }
}

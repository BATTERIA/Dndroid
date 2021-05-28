package a.a.a.a.v0.j.u;

import a.a.a.a.v0.o.c;
import a.t.l;
import java.util.Collection;

public final class b<N> implements c<N> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1598a;

    public b(boolean z) {
        this.f1598a = z;
    }

    @Override // a.a.a.a.v0.o.c
    public Iterable a(Object obj) {
        Collection<? extends a.a.a.a.v0.b.b> f2;
        a.a.a.a.v0.b.b bVar = (a.a.a.a.v0.b.b) obj;
        if (this.f1598a) {
            bVar = bVar != null ? bVar.a() : null;
        }
        return (bVar == null || (f2 = bVar.f()) == null) ? l.f2119c : f2;
    }
}

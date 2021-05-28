package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.o.b;
import a.w.b.l;
import a.w.c.i;
import java.util.Collection;
import java.util.Set;

public final class q extends b<e, a.q> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f652a;
    public final /* synthetic */ Set b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f653c;

    public q(e eVar, Set set, l lVar) {
        this.f652a = eVar;
        this.b = set;
        this.f653c = lVar;
    }

    @Override // a.a.a.a.v0.o.d
    public Object a() {
        return a.q.f2100a;
    }

    @Override // a.a.a.a.v0.o.d
    public boolean b(Object obj) {
        e eVar = (e) obj;
        if (eVar == null) {
            i.a("current");
            throw null;
        } else if (eVar == this.f652a) {
            return true;
        } else {
            a.a.a.a.v0.j.w.i Z = eVar.Z();
            i.a((Object) Z, "current.staticScope");
            if (!(Z instanceof r)) {
                return true;
            }
            this.b.addAll((Collection) this.f653c.a(Z));
            return false;
        }
    }
}

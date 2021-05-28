package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;

public final class c extends j implements a<d0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f661c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f661c = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public d0 a() {
        h c2 = this.f661c.f664e.c();
        if (c2 != null) {
            i.a((Object) c2, "constructor.declarationDescriptor!!");
            k0 v = c2.v();
            i.a((Object) v, "constructor.declarationDescriptor!!.defaultType");
            return a.a.a.a.v0.m.l1.a.e(v);
        }
        i.a();
        throw null;
    }
}

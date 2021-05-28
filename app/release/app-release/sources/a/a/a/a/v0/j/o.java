package a.a.a.a.v0.j;

import a.a.a.a.v0.b.b;
import a.q;
import a.w.b.l;
import a.w.c.i;

public final class o implements l<b, q> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f1566c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f1567d;

    public o(k kVar, b bVar) {
        this.f1566c = kVar;
        this.f1567d = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public q a(b bVar) {
        b bVar2 = bVar;
        k kVar = this.f1566c;
        b bVar3 = this.f1567d;
        j jVar = (j) kVar;
        if (bVar3 == null) {
            i.a("first");
            throw null;
        } else if (bVar2 != null) {
            jVar.a(bVar3, bVar2);
            return q.f2100a;
        } else {
            i.a("second");
            throw null;
        }
    }
}

package a.a.a.a.v0.j;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.z0;
import a.w.b.l;

public final class m implements l<b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f1565c;

    public m(e eVar) {
        this.f1565c = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        b bVar2 = bVar;
        return Boolean.valueOf(!z0.a(bVar2.g()) && z0.a(bVar2, this.f1565c));
    }
}

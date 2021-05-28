package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.k;
import a.n;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class r extends j implements l<b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f297c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(k kVar) {
        super(1);
        this.f297c = kVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        boolean z;
        b bVar2 = bVar;
        i.a((Object) bVar2, "overridden");
        if (bVar2.t() == b.a.DECLARATION) {
            c cVar = this.f297c.f276a;
            k b = bVar2.b();
            if (b == null) {
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            } else if (cVar.b((e) b)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

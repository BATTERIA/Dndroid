package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class r extends j implements l<b, d0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w0 f765c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(w0 w0Var) {
        super(1);
        this.f765c = w0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public d0 a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            w0 w0Var = bVar2.j().get(this.f765c.z());
            i.a((Object) w0Var, "it.valueParameters[p.index]");
            d0 c2 = w0Var.c();
            i.a((Object) c2, "it.valueParameters[p.index].type");
            return c2;
        }
        i.a("it");
        throw null;
    }
}

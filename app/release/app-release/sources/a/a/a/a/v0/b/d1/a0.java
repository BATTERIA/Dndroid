package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.f.b;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class a0 extends j implements l<b, u> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f353c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(1);
        this.f353c = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public u a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            b0 b0Var = this.f353c;
            return new u(b0Var, bVar2, b0Var.k);
        }
        i.a("fqName");
        throw null;
    }
}

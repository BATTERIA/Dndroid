package a.a.a.a.v0.a.p;

import a.a.a.a.v0.a.p.g;
import a.w.b.a;
import a.w.c.j;

public final class i extends j implements a<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.b f275c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(g.b bVar) {
        super(0);
        this.f275c = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Boolean a() {
        g gVar = this.f275c.f272c;
        if (gVar.m != null) {
            return Boolean.valueOf(gVar.n);
        }
        throw new AssertionError("JvmBuiltins has not been initialized properly");
    }
}

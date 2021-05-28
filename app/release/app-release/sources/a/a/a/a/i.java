package a.a.a.a;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.w0;
import a.w.b.a;
import a.w.c.j;

public final class i extends j implements a<w0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f90c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f91d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(b bVar, int i) {
        super(0);
        this.f90c = bVar;
        this.f91d = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public w0 a() {
        w0 w0Var = this.f90c.j().get(this.f91d);
        a.w.c.i.a((Object) w0Var, "descriptor.valueParameters[i]");
        return w0Var;
    }
}

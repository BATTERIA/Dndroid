package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.w;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;

public final class f extends j implements a<k0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r0 f666c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(r0 r0Var) {
        super(0);
        this.f666c = r0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public k0 a() {
        StringBuilder a2 = e.a.a.a.a.a("Can't compute erased upper bound of type parameter `");
        a2.append(this.f666c);
        a2.append('`');
        k0 b = w.b(a2.toString());
        i.a((Object) b, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return b;
    }
}

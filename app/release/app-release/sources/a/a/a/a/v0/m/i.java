package a.a.a.a.v0.m;

import a.a.a.a.v0.m.h;
import a.w.b.l;
import a.w.c.j;
import java.util.Collection;

public final class i extends j implements l<s0, Collection<? extends d0>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h.d f1864c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h.d dVar) {
        super(1);
        this.f1864c = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Collection<? extends d0> a(s0 s0Var) {
        s0 s0Var2 = s0Var;
        if (s0Var2 != null) {
            return h.a(this.f1864c.f1863c, s0Var2, true);
        }
        a.w.c.i.a("it");
        throw null;
    }
}

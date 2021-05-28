package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.a;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;

public final class c0 extends j implements l<Integer, h> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f1667c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var) {
        super(1);
        this.f1667c = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public h a(Integer num) {
        int intValue = num.intValue();
        b0 b0Var = this.f1667c;
        a a2 = g.a(b0Var.f1659d.f1741d, intValue);
        q0 q0Var = null;
        if (a2.f1342c) {
            return null;
        }
        w wVar = b0Var.f1659d.f1740c.f1732c;
        if (wVar != null) {
            h b = g.b(wVar, a2);
            if (b instanceof q0) {
                q0Var = b;
            }
            return q0Var;
        }
        i.a("$this$findTypeAliasAcrossModuleDependencies");
        throw null;
    }
}

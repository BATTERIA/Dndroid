package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.f.a;
import a.w.b.l;
import a.w.c.j;
import e.f.a.g;

public final class a0 extends j implements l<Integer, e> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f1651c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(1);
        this.f1651c = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public e a(Integer num) {
        int intValue = num.intValue();
        b0 b0Var = this.f1651c;
        a a2 = g.a(b0Var.f1659d.f1741d, intValue);
        if (a2.f1342c) {
            return b0Var.f1659d.f1740c.a(a2);
        }
        return g.a(b0Var.f1659d.f1740c.f1732c, a2);
    }
}

package a.a.a.a.v0.a;

import a.a.a.a.v0.b.d1.b0;
import a.w.b.a;

public class h implements a<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f206c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f207d;

    public h(g gVar, b0 b0Var) {
        this.f207d = gVar;
        this.f206c = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Void a() {
        g gVar = this.f207d;
        if (gVar.f192a == null) {
            gVar.f192a = this.f206c;
            return null;
        }
        StringBuilder a2 = e.a.a.a.a.a("Built-ins module is already set: ");
        a2.append(this.f207d.f192a);
        a2.append(" (attempting to reset to ");
        a2.append(this.f206c);
        a2.append(")");
        throw new AssertionError(a2.toString());
    }
}

package a.a.a.a.v0.j;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.i1.d;
import a.a.a.a.v0.m.s0;
import a.w.c.i;

public final class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1535a;
    public final /* synthetic */ a b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f1536c;

    public c(boolean z, a aVar, a aVar2) {
        this.f1535a = z;
        this.b = aVar;
        this.f1536c = aVar2;
    }

    @Override // a.a.a.a.v0.m.i1.d.a
    public boolean a(s0 s0Var, s0 s0Var2) {
        if (s0Var == null) {
            i.a("c1");
            throw null;
        } else if (s0Var2 == null) {
            i.a("c2");
            throw null;
        } else if (i.a(s0Var, s0Var2)) {
            return true;
        } else {
            h c2 = s0Var.c();
            h c3 = s0Var2.c();
            if (!(c2 instanceof r0) || !(c3 instanceof r0)) {
                return false;
            }
            return e.f1538a.a((r0) c2, (r0) c3, this.f1535a, new b(this));
        }
    }
}

package a.a.a.a.v0.m;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.m.i1.f;
import a.w.c.i;

public final class o0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f1935a;

    public o0(g gVar) {
        if (gVar != null) {
            k0 g2 = gVar.g();
            i.a((Object) g2, "kotlinBuiltIns.nullableAnyType");
            this.f1935a = g2;
            return;
        }
        i.a("kotlinBuiltIns");
        throw null;
    }

    @Override // a.a.a.a.v0.m.v0
    public g1 a() {
        return g1.OUT_VARIANCE;
    }

    @Override // a.a.a.a.v0.m.v0
    public v0 a(f fVar) {
        if (fVar != null) {
            return this;
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.v0
    public boolean b() {
        return true;
    }

    @Override // a.a.a.a.v0.m.v0
    public d0 c() {
        return this.f1935a;
    }
}

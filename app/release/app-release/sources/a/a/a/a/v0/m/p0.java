package a.a.a.a.v0.m;

import a.a.a.a.v0.b.r0;
import a.e;
import a.f;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;

public final class p0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f1937a;
    public final r0 b;

    public static final class a extends j implements a.w.b.a<d0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p0 f1938c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p0 p0Var) {
            super(0);
            this.f1938c = p0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public d0 a() {
            return g.a(this.f1938c.b);
        }
    }

    public p0(r0 r0Var) {
        if (r0Var != null) {
            this.b = r0Var;
            this.f1937a = g.a(f.PUBLICATION, (a.w.b.a) new a(this));
            return;
        }
        i.a("typeParameter");
        throw null;
    }

    @Override // a.a.a.a.v0.m.v0
    public g1 a() {
        return g1.OUT_VARIANCE;
    }

    @Override // a.a.a.a.v0.m.v0
    public v0 a(a.a.a.a.v0.m.i1.f fVar) {
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
        return (d0) this.f1937a.getValue();
    }
}

package a.a.a.a.v0.m.m1;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.d0;
import a.w.c.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f1930a;
    public final d0 b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1931c;

    public e(r0 r0Var, d0 d0Var, d0 d0Var2) {
        if (r0Var == null) {
            i.a("typeParameter");
            throw null;
        } else if (d0Var == null) {
            i.a("inProjection");
            throw null;
        } else if (d0Var2 != null) {
            this.f1930a = r0Var;
            this.b = d0Var;
            this.f1931c = d0Var2;
        } else {
            i.a("outProjection");
            throw null;
        }
    }
}

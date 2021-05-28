package a.a.a.a.v0.m;

import a.w.c.i;
import java.util.Map;

public final class t0 extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f1942c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1943d;

    public t0(Map map, boolean z) {
        this.f1942c = map;
        this.f1943d = z;
    }

    @Override // a.a.a.a.v0.m.u0
    public v0 a(s0 s0Var) {
        if (s0Var != null) {
            return (v0) this.f1942c.get(s0Var);
        }
        i.a("key");
        throw null;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean a() {
        return this.f1943d;
    }

    @Override // a.a.a.a.v0.m.y0
    public boolean d() {
        return this.f1942c.isEmpty();
    }
}

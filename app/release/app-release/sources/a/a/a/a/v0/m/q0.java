package a.a.a.a.v0.m;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.n;
import a.w.c.i;
import java.util.List;

public final class q0 extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f1939c;

    public q0(List list) {
        this.f1939c = list;
    }

    @Override // a.a.a.a.v0.m.u0
    public v0 a(s0 s0Var) {
        if (s0Var == null) {
            i.a("key");
            throw null;
        } else if (!this.f1939c.contains(s0Var)) {
            return null;
        } else {
            h c2 = s0Var.c();
            if (c2 != null) {
                return c1.a((r0) c2);
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }
}

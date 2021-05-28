package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.i.j;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.k1.e;
import a.a.a.a.v0.m.l1.a;
import a.w.c.i;

public final class u extends x implements e {

    /* renamed from: f  reason: collision with root package name */
    public final h f1944f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(a.a.a.a.v0.a.g r3, a.a.a.a.v0.b.b1.h r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x001d
            a.a.a.a.v0.m.k0 r0 = r3.f()
            java.lang.String r1 = "builtIns.nothingType"
            a.w.c.i.a(r0, r1)
            a.a.a.a.v0.m.k0 r3 = r3.g()
            java.lang.String r1 = "builtIns.nullableAnyType"
            a.w.c.i.a(r3, r1)
            r2.<init>(r0, r3)
            r2.f1944f = r4
            return
        L_0x001d:
            java.lang.String r3 = "annotations"
            a.w.c.i.a(r3)
            throw r0
        L_0x0023:
            java.lang.String r3 = "builtIns"
            a.w.c.i.a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.u.<init>(a.a.a.a.v0.a.g, a.a.a.a.v0.b.b1.h):void");
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.x
    public boolean J0() {
        return false;
    }

    @Override // a.a.a.a.v0.m.x
    public k0 L0() {
        return this.f1957e;
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public d0 a(f fVar) {
        if (fVar != null) {
            return this;
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(boolean z) {
        return this;
    }

    @Override // a.a.a.a.v0.b.b1.a, a.a.a.a.v0.m.x
    public h y() {
        return this.f1944f;
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    /* renamed from: a  reason: collision with other method in class */
    public f1 m81a(f fVar) {
        if (fVar != null) {
            return this;
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.x
    public String a(c cVar, j jVar) {
        if (cVar == null) {
            i.a("renderer");
            throw null;
        } else if (jVar != null) {
            return "dynamic";
        } else {
            i.a("options");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.f1
    public u a(h hVar) {
        if (hVar != null) {
            return new u(a.c(this.f1957e), hVar);
        }
        i.a("newAnnotations");
        throw null;
    }
}

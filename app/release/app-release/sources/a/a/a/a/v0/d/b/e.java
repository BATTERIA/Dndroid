package a.a.a.a.v0.d.b;

import a.a.a.a.v0.f.a;
import a.a.a.a.v0.k.b.f;
import a.a.a.a.v0.k.b.g;
import a.s;
import a.w.c.i;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final k f908a;
    public final d b;

    public e(k kVar, d dVar) {
        if (kVar == null) {
            i.a("kotlinClassFinder");
            throw null;
        } else if (dVar != null) {
            this.f908a = kVar;
            this.b = dVar;
        } else {
            i.a("deserializedDescriptorResolver");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.g
    public f a(a aVar) {
        if (aVar != null) {
            l a2 = e.f.a.g.a(this.f908a, aVar);
            if (a2 == null) {
                return null;
            }
            boolean a3 = i.a(a2.a(), aVar);
            if (!s.f2103a || a3) {
                return this.b.c(a2);
            }
            throw new AssertionError("Class with incorrect id found: expected " + aVar + ", actual " + a2.a());
        }
        i.a("classId");
        throw null;
    }
}

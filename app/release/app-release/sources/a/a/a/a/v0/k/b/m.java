package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.w.c.i;

public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public final z f1746a;

    public m(z zVar) {
        if (zVar != null) {
            this.f1746a = zVar;
        } else {
            i.a("packageFragmentProvider");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.g
    public f a(a aVar) {
        f a2;
        if (aVar != null) {
            z zVar = this.f1746a;
            b d2 = aVar.d();
            i.a((Object) d2, "classId.packageFqName");
            for (y yVar : zVar.a(d2)) {
                if ((yVar instanceof n) && (a2 = ((o) ((n) yVar)).i.a(aVar)) != null) {
                    return a2;
                }
            }
            return null;
        }
        i.a("classId");
        throw null;
    }
}

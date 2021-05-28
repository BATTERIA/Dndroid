package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.j;
import a.w.c.i;
import e.f.a.g;

public final class k extends g<j<? extends a, ? extends d>> {
    public final a b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1581c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar, d dVar) {
        super(new j(aVar, dVar));
        if (aVar == null) {
            i.a("enumClassId");
            throw null;
        } else if (dVar != null) {
            this.b = aVar;
            this.f1581c = dVar;
        } else {
            i.a("enumEntryName");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        k0 v;
        e eVar = null;
        if (wVar != null) {
            e a2 = g.a(wVar, this.b);
            if (a2 != null) {
                if (a.a.a.a.v0.j.g.l(a2)) {
                    eVar = a2;
                }
                if (!(eVar == null || (v = eVar.v()) == null)) {
                    return v;
                }
            }
            StringBuilder a3 = e.a.a.a.a.a("Containing class for error-class based enum entry ");
            a3.append(this.b);
            a3.append('.');
            a3.append(this.f1581c);
            k0 b2 = a.a.a.a.v0.m.w.b(a3.toString());
            i.a((Object) b2, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
            return b2;
        }
        i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.f1581c);
        return sb.toString();
    }
}

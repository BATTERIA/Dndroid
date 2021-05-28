package a.a.a.a.v0.d.a.a0;

import a.e;
import a.w.c.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final e f561a;
    public final a.a.a.a.v0.d.a.a0.o.e b;

    /* renamed from: c  reason: collision with root package name */
    public final c f562c;

    /* renamed from: d  reason: collision with root package name */
    public final m f563d;

    /* renamed from: e  reason: collision with root package name */
    public final e<e> f564e;

    public h(c cVar, m mVar, e<e> eVar) {
        if (cVar == null) {
            i.a("components");
            throw null;
        } else if (mVar == null) {
            i.a("typeParameterResolver");
            throw null;
        } else if (eVar != null) {
            this.f562c = cVar;
            this.f563d = mVar;
            this.f564e = eVar;
            this.f561a = eVar;
            this.b = new a.a.a.a.v0.d.a.a0.o.e(this, mVar);
        } else {
            i.a("delegateForDefaultTypeQualifiers");
            throw null;
        }
    }

    public final e a() {
        return (e) this.f561a.getValue();
    }
}

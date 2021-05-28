package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.h.q;
import a.t.l;
import a.w.b.a;
import a.w.c.j;
import java.util.List;

public final class w extends j implements a<List<? extends c>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f1773c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f1774d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f1775e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(v vVar, q qVar, b bVar) {
        super(0);
        this.f1773c = vVar;
        this.f1774d = qVar;
        this.f1775e = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public List<? extends c> a() {
        v vVar = this.f1773c;
        y a2 = vVar.a(vVar.b.f1742e);
        List<c> b = a2 != null ? this.f1773c.b.f1740c.f1735f.b(a2, this.f1774d, this.f1775e) : null;
        return b != null ? b : l.f2119c;
    }
}

package a.a.a.a.v0.j.u;

import a.a.a.a.v0.o.b;
import a.w.b.l;
import a.w.c.i;
import a.w.c.r;

public final class c extends b<a.a.a.a.v0.b.b, a.a.a.a.v0.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f1599a;
    public final /* synthetic */ l b;

    public c(r rVar, l lVar) {
        this.f1599a = rVar;
        this.b = lVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.a.a.a.v0.o.b, a.a.a.a.v0.o.d
    public void a(a.a.a.a.v0.b.b bVar) {
        T t = (T) bVar;
        if (t == null) {
            i.a("current");
            throw null;
        } else if (this.f1599a.f2148c == null && ((Boolean) this.b.a(t)).booleanValue()) {
            this.f1599a.f2148c = t;
        }
    }

    @Override // a.a.a.a.v0.o.d
    public boolean b(Object obj) {
        if (((a.a.a.a.v0.b.b) obj) != null) {
            return this.f1599a.f2148c == null;
        }
        i.a("current");
        throw null;
    }

    @Override // a.a.a.a.v0.o.d
    public Object a() {
        return this.f1599a.f2148c;
    }
}

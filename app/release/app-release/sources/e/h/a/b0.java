package e.h.a;

import e.h.a.h0.a;
import e.h.a.h0.b;
import e.h.a.h0.c;

public class b0 extends c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f4684a;

    public b0(c0 c0Var) {
        this.f4684a = c0Var;
    }

    @Override // e.h.a.c0
    public T a(a aVar) {
        if (aVar.A() != b.NULL) {
            return (T) this.f4684a.a(aVar);
        }
        aVar.x();
        return null;
    }

    @Override // e.h.a.c0
    public void a(c cVar, T t) {
        if (t == null) {
            cVar.p();
        } else {
            this.f4684a.a(cVar, t);
        }
    }
}

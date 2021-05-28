package e.e.a.q.d;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.h0.b;
import e.h.a.k;

public class c implements d0 {

    public class a extends c0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f4499a;

        public a(c cVar, c0 c0Var) {
            this.f4499a = c0Var;
        }

        @Override // e.h.a.c0
        public T a(e.h.a.h0.a aVar) {
            try {
                return (T) this.f4499a.a(aVar);
            } catch (Throwable unused) {
                b(aVar);
                return null;
            }
        }

        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, T t) {
            this.f4499a.a(cVar, t);
        }

        public final void b(e.h.a.h0.a aVar) {
            if (aVar.q()) {
                b A = aVar.A();
                if (A != b.STRING) {
                    if (A == b.BEGIN_ARRAY) {
                        aVar.a();
                        b(aVar);
                    } else {
                        if (A == b.BEGIN_OBJECT) {
                            aVar.k();
                            b(aVar);
                        } else if (A != b.END_ARRAY) {
                            if (A != b.END_OBJECT) {
                                if (A != b.NUMBER) {
                                    if (A == b.BOOLEAN) {
                                        aVar.s();
                                        return;
                                    } else if (A == b.NAME) {
                                        aVar.w();
                                        b(aVar);
                                        return;
                                    } else if (A == b.NULL) {
                                        aVar.x();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        aVar.o();
                        return;
                    }
                    aVar.n();
                    return;
                }
                aVar.y();
            }
        }
    }

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
        return new a(this, kVar.a(this, aVar));
    }
}

package e.h.a;

import e.h.a.h0.a;
import e.h.a.h0.b;
import e.h.a.h0.c;

public class f extends c0<Number> {
    public f(k kVar) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.h.a.c0
    public Number a(a aVar) {
        if (aVar.A() != b.NULL) {
            return Double.valueOf(aVar.t());
        }
        aVar.x();
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
    @Override // e.h.a.c0
    public void a(c cVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            cVar.p();
            return;
        }
        k.a(number2.doubleValue());
        cVar.a(number2);
    }
}

package e.e.a.q.d;

import e.h.a.a0;
import e.h.a.c0;
import e.h.a.d;
import e.h.a.f0.o;
import e.h.a.f0.s;
import e.h.a.h0.c;
import e.h.a.k;
import java.util.ArrayList;
import java.util.Collections;

public class a extends c0<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final c0<Object> f4497a = new k(o.f4708h, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, a0.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList()).a(Object.class);

    @Override // e.h.a.c0
    public Object a(e.h.a.h0.a aVar) {
        int ordinal = aVar.A().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.q()) {
                arrayList.add(a(aVar));
            }
            aVar.n();
            return arrayList;
        } else if (ordinal == 2) {
            s sVar = new s();
            aVar.k();
            while (aVar.q()) {
                sVar.put(aVar.w(), a(aVar));
            }
            aVar.o();
            return sVar;
        } else if (ordinal == 5) {
            return aVar.y();
        } else {
            if (ordinal == 6) {
                String y = aVar.y();
                return y.indexOf(46) != -1 ? Double.valueOf(Double.parseDouble(y)) : Long.valueOf(Long.parseLong(y));
            } else if (ordinal == 7) {
                return Boolean.valueOf(aVar.s());
            } else {
                if (ordinal == 8) {
                    aVar.x();
                    return null;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // e.h.a.c0
    public void a(c cVar, Object obj) {
        this.f4497a.a(cVar, obj);
    }
}

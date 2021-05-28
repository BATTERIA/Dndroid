package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.f0.s;
import e.h.a.h0.c;
import e.h.a.k;
import java.util.ArrayList;

public final class h extends c0<Object> {
    public static final d0 b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final k f4754a;

    public class a implements d0 {
        @Override // e.h.a.d0
        public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a == Object.class) {
                return new h(kVar);
            }
            return null;
        }
    }

    public h(k kVar) {
        this.f4754a = kVar;
    }

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
                return Double.valueOf(aVar.t());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.s());
            }
            if (ordinal == 8) {
                aVar.x();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    @Override // e.h.a.c0
    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.p();
            return;
        }
        c0 a2 = this.f4754a.a((Class) obj.getClass());
        if (a2 instanceof h) {
            cVar.l();
            cVar.n();
            return;
        }
        a2.a(cVar, obj);
    }
}

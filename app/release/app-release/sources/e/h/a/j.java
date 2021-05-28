package e.h.a;

import e.h.a.h0.a;
import e.h.a.h0.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class j extends c0<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f4827a;

    public j(c0 c0Var) {
        this.f4827a = c0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.h.a.c0
    public AtomicLongArray a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.q()) {
            arrayList.add(Long.valueOf(((Number) this.f4827a.a(aVar)).longValue()));
        }
        aVar.n();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
    @Override // e.h.a.c0
    public void a(c cVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        cVar.k();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f4827a.a(cVar, Long.valueOf(atomicLongArray2.get(i)));
        }
        cVar.m();
    }
}

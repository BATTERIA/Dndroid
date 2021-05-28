package e.h.a;

import e.h.a.h0.a;
import e.h.a.h0.c;
import java.util.concurrent.atomic.AtomicLong;

public class i extends c0<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f4826a;

    public i(c0 c0Var) {
        this.f4826a = c0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.h.a.c0
    public AtomicLong a(a aVar) {
        return new AtomicLong(((Number) this.f4826a.a(aVar)).longValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
    @Override // e.h.a.c0
    public void a(c cVar, AtomicLong atomicLong) {
        this.f4826a.a(cVar, Long.valueOf(atomicLong.get()));
    }
}

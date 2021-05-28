package a.a.a.a.v0.b;

import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import a.z.h;
import java.util.List;

public final class u0 extends j implements l<k, h<? extends r0>> {

    /* renamed from: c  reason: collision with root package name */
    public static final u0 f498c = new u0();

    public u0() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public h<? extends r0> a(k kVar) {
        k kVar2 = kVar;
        if (kVar2 != null) {
            List<r0> k = ((a) kVar2).k();
            i.a((Object) k, "(it as CallableDescriptor).typeParameters");
            return f.a((Iterable) k);
        }
        i.a("it");
        throw null;
    }
}

package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class p extends j implements l<b, d0> {

    /* renamed from: c  reason: collision with root package name */
    public static final p f763c = new p();

    public p() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public d0 a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            i0 g0 = bVar2.g0();
            if (g0 != null) {
                i.a((Object) g0, "it.extensionReceiverParameter!!");
                d0 c2 = g0.c();
                i.a((Object) c2, "it.extensionReceiverParameter!!.type");
                return c2;
            }
            i.a();
            throw null;
        }
        i.a("it");
        throw null;
    }
}

package e.d.a.m.k.g;

import android.graphics.Bitmap;
import e.d.a.m.g;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.m.k.d.c;
import e.d.a.m.k.g.b;

public class e implements g<b> {

    /* renamed from: a  reason: collision with root package name */
    public final g<Bitmap> f4156a;
    public final b b;

    public e(g<Bitmap> gVar, b bVar) {
        this.f4156a = gVar;
        this.b = bVar;
    }

    @Override // e.d.a.m.g
    public k<b> a(k<b> kVar, int i, int i2) {
        b bVar = kVar.get();
        Bitmap bitmap = kVar.get().f4141e.i;
        Bitmap bitmap2 = this.f4156a.a(new c(bitmap, this.b), i, i2).get();
        if (bitmap2.equals(bitmap)) {
            return kVar;
        }
        g<Bitmap> gVar = this.f4156a;
        b.a aVar = bVar.f4141e;
        return new d(new b(new b.a(aVar.f4145a, aVar.b, aVar.f4146c, gVar, aVar.f4148e, aVar.f4149f, aVar.f4150g, aVar.f4151h, bitmap2)));
    }

    @Override // e.d.a.m.g
    public String a() {
        return this.f4156a.a();
    }
}

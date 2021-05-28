package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.g;
import e.d.a.m.i.k;
import e.d.a.m.k.g.b;
import e.d.a.m.k.g.e;

public class f implements g<a> {

    /* renamed from: a  reason: collision with root package name */
    public final g<Bitmap> f4195a;
    public final g<b> b;

    public f(e.d.a.m.i.m.b bVar, g<Bitmap> gVar) {
        e eVar = new e(gVar, bVar);
        this.f4195a = gVar;
        this.b = eVar;
    }

    @Override // e.d.a.m.g
    public k<a> a(k<a> kVar, int i, int i2) {
        g<b> gVar;
        g<Bitmap> gVar2;
        k<Bitmap> kVar2 = kVar.get().b;
        k<b> kVar3 = kVar.get().f4183a;
        if (kVar2 != null && (gVar2 = this.f4195a) != null) {
            k<Bitmap> a2 = gVar2.a(kVar2, i, i2);
            if (!kVar2.equals(a2)) {
                return new b(new a(a2, kVar.get().f4183a));
            }
            return kVar;
        } else if (kVar3 == null || (gVar = this.b) == null) {
            return kVar;
        } else {
            k<b> a3 = gVar.a(kVar3, i, i2);
            return !kVar3.equals(a3) ? new b(new a(kVar.get().b, a3)) : kVar;
        }
    }

    @Override // e.d.a.m.g
    public String a() {
        return this.f4195a.a();
    }
}

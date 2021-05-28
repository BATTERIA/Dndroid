package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.i.k;

public class b implements k<a> {

    /* renamed from: a  reason: collision with root package name */
    public final a f4184a;

    public b(a aVar) {
        if (aVar != null) {
            this.f4184a = aVar;
            return;
        }
        throw new NullPointerException("Data must not be null");
    }

    @Override // e.d.a.m.i.k
    public void a() {
        k<Bitmap> kVar = this.f4184a.b;
        if (kVar != null) {
            kVar.a();
        }
        k<e.d.a.m.k.g.b> kVar2 = this.f4184a.f4183a;
        if (kVar2 != null) {
            kVar2.a();
        }
    }

    @Override // e.d.a.m.i.k
    public int b() {
        a aVar = this.f4184a;
        k<Bitmap> kVar = aVar.b;
        return kVar != null ? kVar.b() : aVar.f4183a.b();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.i.k
    public a get() {
        return this.f4184a;
    }
}

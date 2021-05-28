package e.d.a.m.k.d;

import android.graphics.Bitmap;
import e.d.a.m.g;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.s.h;

public abstract class d implements g<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public b f4085a;

    public d(b bVar) {
        this.f4085a = bVar;
    }

    public abstract Bitmap a(b bVar, Bitmap bitmap, int i, int i2);

    @Override // e.d.a.m.g
    public final k<Bitmap> a(k<Bitmap> kVar, int i, int i2) {
        if (h.a(i, i2)) {
            Bitmap bitmap = kVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a2 = a(this.f4085a, bitmap, i, i2);
            return bitmap.equals(a2) ? kVar : c.a(a2, this.f4085a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}

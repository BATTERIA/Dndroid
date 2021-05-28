package e.d.a.m.k.d;

import android.graphics.Bitmap;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.s.h;

public class c implements k<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f4084a;
    public final b b;

    public c(Bitmap bitmap, b bVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bVar != null) {
            this.f4084a = bitmap;
            this.b = bVar;
        } else {
            throw new NullPointerException("BitmapPool must not be null");
        }
    }

    public static c a(Bitmap bitmap, b bVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, bVar);
    }

    @Override // e.d.a.m.i.k
    public void a() {
        if (!this.b.a(this.f4084a)) {
            this.f4084a.recycle();
        }
    }

    @Override // e.d.a.m.i.k
    public int b() {
        return h.a(this.f4084a);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.i.k
    public Bitmap get() {
        return this.f4084a;
    }
}

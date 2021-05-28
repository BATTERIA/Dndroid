package e.d.a.m.k.i;

import android.graphics.Bitmap;
import e.d.a.m.i.k;
import e.d.a.m.k.d.j;
import e.d.a.m.k.e.b;

public class a implements c<e.d.a.m.k.h.a, b> {

    /* renamed from: a  reason: collision with root package name */
    public final c<Bitmap, j> f4200a;

    public a(c<Bitmap, j> cVar) {
        this.f4200a = cVar;
    }

    @Override // e.d.a.m.k.i.c
    public k<b> a(k<e.d.a.m.k.h.a> kVar) {
        e.d.a.m.k.h.a aVar = kVar.get();
        k<Bitmap> kVar2 = aVar.b;
        if (kVar2 != null) {
            return this.f4200a.a(kVar2);
        }
        return aVar.f4183a;
    }

    @Override // e.d.a.m.k.i.c
    public String a() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}

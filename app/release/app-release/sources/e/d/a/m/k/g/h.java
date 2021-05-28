package e.d.a.m.k.g;

import android.graphics.Bitmap;
import e.d.a.k.a;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.m.k.d.c;

public class h implements e<a, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final b f4171a;

    public h(b bVar) {
        this.f4171a = bVar;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<Bitmap> a(a aVar, int i, int i2) {
        return c.a(aVar.c(), this.f4171a);
    }

    @Override // e.d.a.m.e
    public String a() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }
}

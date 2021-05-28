package e.d.a.m.k.i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import e.d.a.m.i.k;
import e.d.a.m.k.d.j;

public class b implements c<Bitmap, j> {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f4201a;
    public final e.d.a.m.i.m.b b;

    public b(Resources resources, e.d.a.m.i.m.b bVar) {
        this.f4201a = resources;
        this.b = bVar;
    }

    @Override // e.d.a.m.k.i.c
    public k<j> a(k<Bitmap> kVar) {
        return new e.d.a.m.k.d.k(new j(this.f4201a, new j.a(kVar.get())), this.b);
    }

    @Override // e.d.a.m.k.i.c
    public String a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}

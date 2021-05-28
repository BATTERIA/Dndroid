package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import e.d.a.m.e;
import e.d.a.m.j.f;
import e.d.a.m.j.g;
import e.d.a.p.b;
import java.io.File;
import java.io.InputStream;

public class n implements b<f, Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public final m f4113c;

    /* renamed from: d  reason: collision with root package name */
    public final e<File, Bitmap> f4114d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.a.m.f<Bitmap> f4115e;

    /* renamed from: f  reason: collision with root package name */
    public final g f4116f;

    public n(b<InputStream, Bitmap> bVar, b<ParcelFileDescriptor, Bitmap> bVar2) {
        this.f4115e = bVar.d();
        this.f4116f = new g(bVar.e(), bVar2.e());
        this.f4114d = bVar.b();
        this.f4113c = new m(bVar.g(), bVar2.g());
    }

    @Override // e.d.a.p.b
    public e<File, Bitmap> b() {
        return this.f4114d;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.f<Bitmap> d() {
        return this.f4115e;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<f> e() {
        return this.f4116f;
    }

    @Override // e.d.a.p.b
    public e<f, Bitmap> g() {
        return this.f4113c;
    }
}

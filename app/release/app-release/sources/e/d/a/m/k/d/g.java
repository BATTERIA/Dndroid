package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import e.d.a.m.e;
import e.d.a.m.f;
import e.d.a.m.k.a;
import e.d.a.m.k.f.c;
import e.d.a.p.b;
import java.io.File;

public class g implements b<ParcelFileDescriptor, Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public final e<File, Bitmap> f4088c;

    /* renamed from: d  reason: collision with root package name */
    public final h f4089d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4090e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final e.d.a.m.b<ParcelFileDescriptor> f4091f = a.f4080a;

    public g(e.d.a.m.i.m.b bVar, e.d.a.m.a aVar) {
        this.f4088c = new c(new q(bVar, aVar));
        this.f4089d = new h(bVar, aVar);
    }

    @Override // e.d.a.p.b
    public e<File, Bitmap> b() {
        return this.f4088c;
    }

    @Override // e.d.a.p.b
    public f<Bitmap> d() {
        return this.f4090e;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<ParcelFileDescriptor> e() {
        return this.f4091f;
    }

    @Override // e.d.a.p.b
    public e<ParcelFileDescriptor, Bitmap> g() {
        return this.f4089d;
    }
}

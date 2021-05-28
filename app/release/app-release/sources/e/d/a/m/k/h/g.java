package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.e;
import e.d.a.m.j.f;
import e.d.a.m.k.f.c;
import e.d.a.p.b;
import java.io.File;
import java.io.InputStream;

public class g implements b<f, a> {

    /* renamed from: c  reason: collision with root package name */
    public final e<File, a> f4196c;

    /* renamed from: d  reason: collision with root package name */
    public final e<f, a> f4197d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.a.m.f<a> f4198e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.a.m.b<f> f4199f;

    public g(b<f, Bitmap> bVar, b<InputStream, e.d.a.m.k.g.b> bVar2, e.d.a.m.i.m.b bVar3) {
        c cVar = new c(bVar.g(), bVar2.g(), bVar3);
        this.f4196c = new c(new e(cVar));
        this.f4197d = cVar;
        this.f4198e = new d(bVar.d(), bVar2.d());
        this.f4199f = bVar.e();
    }

    @Override // e.d.a.p.b
    public e<File, a> b() {
        return this.f4196c;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.f<a> d() {
        return this.f4198e;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<f> e() {
        return this.f4199f;
    }

    @Override // e.d.a.p.b
    public e<f, a> g() {
        return this.f4197d;
    }
}

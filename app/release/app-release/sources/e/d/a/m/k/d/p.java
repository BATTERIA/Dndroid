package e.d.a.m.k.d;

import android.graphics.Bitmap;
import e.d.a.m.a;
import e.d.a.m.e;
import e.d.a.m.f;
import e.d.a.m.j.n;
import e.d.a.m.k.f.c;
import e.d.a.p.b;
import java.io.File;
import java.io.InputStream;

public class p implements b<InputStream, Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public final q f4122c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4123d;

    /* renamed from: e  reason: collision with root package name */
    public final n f4124e = new n();

    /* renamed from: f  reason: collision with root package name */
    public final c<Bitmap> f4125f;

    public p(e.d.a.m.i.m.b bVar, a aVar) {
        this.f4122c = new q(bVar, aVar);
        this.f4123d = new b();
        this.f4125f = new c<>(this.f4122c);
    }

    @Override // e.d.a.p.b
    public e<File, Bitmap> b() {
        return this.f4125f;
    }

    @Override // e.d.a.p.b
    public f<Bitmap> d() {
        return this.f4123d;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<InputStream> e() {
        return this.f4124e;
    }

    @Override // e.d.a.p.b
    public e<InputStream, Bitmap> g() {
        return this.f4122c;
    }
}

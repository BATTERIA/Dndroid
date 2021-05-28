package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.j.f;
import e.d.a.m.k.d.l;
import e.d.a.m.k.d.o;
import java.io.InputStream;

public class c implements e<f, a> {

    /* renamed from: g  reason: collision with root package name */
    public static final b f4185g = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final a f4186h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final e<f, Bitmap> f4187a;
    public final e<InputStream, e.d.a.m.k.g.b> b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.a.m.i.m.b f4188c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4189d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4190e;

    /* renamed from: f  reason: collision with root package name */
    public String f4191f;

    public static class a {
    }

    public static class b {
    }

    public c(e<f, Bitmap> eVar, e<InputStream, e.d.a.m.k.g.b> eVar2, e.d.a.m.i.m.b bVar) {
        b bVar2 = f4185g;
        a aVar = f4186h;
        this.f4187a = eVar;
        this.b = eVar2;
        this.f4188c = bVar;
        this.f4189d = bVar2;
        this.f4190e = aVar;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<a> a(f fVar, int i, int i2) {
        f fVar2 = fVar;
        e.d.a.s.a aVar = e.d.a.s.a.b;
        byte[] a2 = aVar.a();
        try {
            a a3 = a(fVar2, i, i2, a2);
            if (a3 != null) {
                return new b(a3);
            }
            return null;
        } finally {
            aVar.a(a2);
        }
    }

    @Override // e.d.a.m.e
    public String a() {
        if (this.f4191f == null) {
            this.f4191f = this.b.a() + this.f4187a.a();
        }
        return this.f4191f;
    }

    public final a a(f fVar, int i, int i2, byte[] bArr) {
        a aVar;
        a aVar2;
        k<e.d.a.m.k.g.b> a2;
        InputStream inputStream = fVar.f4062a;
        a aVar3 = null;
        if (inputStream == null) {
            k<Bitmap> a3 = this.f4187a.a(fVar, i, i2);
            if (a3 != null) {
                aVar = new a(a3, null);
            }
            return aVar3;
        } else if (this.f4190e != null) {
            o oVar = new o(inputStream, bArr);
            oVar.mark(2048);
            if (this.f4189d != null) {
                l.a b2 = new l(oVar).b();
                oVar.reset();
                if (b2 != l.a.GIF || (a2 = this.b.a(oVar, i, i2)) == null) {
                    aVar2 = null;
                } else {
                    e.d.a.m.k.g.b bVar = a2.get();
                    aVar2 = bVar.f4142f.j.f3912c > 1 ? new a(null, a2) : new a(new e.d.a.m.k.d.c(bVar.f4141e.i, this.f4188c), null);
                }
                if (aVar2 != null) {
                    return aVar2;
                }
                k<Bitmap> a4 = this.f4187a.a(new f(oVar, fVar.b), i, i2);
                if (a4 != null) {
                    aVar = new a(a4, null);
                }
                return aVar3;
            }
            throw null;
        } else {
            throw null;
        }
        aVar3 = aVar;
        return aVar3;
    }
}

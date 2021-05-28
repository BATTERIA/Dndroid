package e.d.a.m.k.g;

import android.graphics.Bitmap;
import android.util.Log;
import e.d.a.k.a;
import e.d.a.m.f;
import e.d.a.m.g;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.m.k.c;
import e.d.a.m.k.g.b;
import e.d.a.s.d;
import java.io.IOException;
import java.io.OutputStream;

public class j implements f<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4180d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC0119a f4181a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4182c;

    public static class a {
    }

    public j(b bVar) {
        a aVar = f4180d;
        this.b = bVar;
        this.f4181a = new a(bVar);
        this.f4182c = aVar;
    }

    @Override // e.d.a.m.b
    public String a() {
        return "";
    }

    /* JADX INFO: finally extract failed */
    @Override // e.d.a.m.b
    public boolean a(Object obj, OutputStream outputStream) {
        boolean z;
        boolean z2;
        long a2 = d.a();
        b bVar = (b) ((k) obj).get();
        b.a aVar = bVar.f4141e;
        g<Bitmap> gVar = aVar.f4147d;
        boolean z3 = true;
        boolean z4 = false;
        if (gVar instanceof c) {
            try {
                outputStream.write(aVar.b);
            } catch (IOException e2) {
                if (Log.isLoggable("GifEncoder", 3)) {
                    Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", e2);
                }
                z3 = false;
            }
            return z3;
        }
        byte[] bArr = aVar.b;
        if (this.f4182c != null) {
            e.d.a.k.d dVar = new e.d.a.k.d();
            dVar.a(bArr);
            e.d.a.k.c b2 = dVar.b();
            a aVar2 = this.f4182c;
            a.AbstractC0119a aVar3 = this.f4181a;
            if (aVar2 != null) {
                e.d.a.k.a aVar4 = new e.d.a.k.a(aVar3);
                aVar4.a(b2, bArr);
                aVar4.a();
                if (this.f4182c != null) {
                    e.d.a.l.a aVar5 = new e.d.a.l.a();
                    if (outputStream == null) {
                        z = false;
                    } else {
                        aVar5.q = false;
                        aVar5.f3927h = outputStream;
                        try {
                            aVar5.a("GIF89a");
                            z = true;
                        } catch (IOException unused) {
                            z = false;
                        }
                        aVar5.f3926g = z;
                    }
                    if (!z) {
                        return false;
                    }
                    for (int i = 0; i < aVar4.j.f3912c; i++) {
                        Bitmap c2 = aVar4.c();
                        a aVar6 = this.f4182c;
                        e.d.a.m.i.m.b bVar2 = this.b;
                        if (aVar6 != null) {
                            e.d.a.m.k.d.c cVar = new e.d.a.m.k.d.c(c2, bVar2);
                            k<Bitmap> a3 = gVar.a(cVar, bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
                            if (!cVar.equals(a3)) {
                                cVar.a();
                            }
                            try {
                                if (!aVar5.a(a3.get())) {
                                    a3.a();
                                    return false;
                                }
                                aVar5.f3925f = Math.round(((float) aVar4.a(aVar4.i)) / 10.0f);
                                aVar4.a();
                                a3.a();
                            } catch (Throwable th) {
                                a3.a();
                                throw th;
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (aVar5.f3926g) {
                        aVar5.f3926g = false;
                        try {
                            aVar5.f3927h.write(59);
                            aVar5.f3927h.flush();
                            if (aVar5.q) {
                                aVar5.f3927h.close();
                            }
                            z2 = true;
                        } catch (IOException unused2) {
                            z2 = false;
                        }
                        aVar5.f3923d = 0;
                        aVar5.f3927h = null;
                        aVar5.i = null;
                        aVar5.j = null;
                        aVar5.k = null;
                        aVar5.m = null;
                        aVar5.q = false;
                        aVar5.r = true;
                        z4 = z2;
                    }
                    if (!Log.isLoggable("GifEncoder", 2)) {
                        return z4;
                    }
                    StringBuilder a4 = e.a.a.a.a.a("Encoded gif with ");
                    a4.append(aVar4.j.f3912c);
                    a4.append(" frames and ");
                    a4.append(bVar.f4141e.b.length);
                    a4.append(" bytes in ");
                    a4.append(d.a(a2));
                    a4.append(" ms");
                    Log.v("GifEncoder", a4.toString());
                    return z4;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}

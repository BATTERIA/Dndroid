package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import e.c.a.b.l;
import e.d.a.m.a;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;
import e.d.a.s.c;
import e.d.a.s.f;
import java.io.IOException;
import java.io.InputStream;

public class q implements e<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final f f4126a = f.f4087c;
    public b b;

    /* renamed from: c  reason: collision with root package name */
    public a f4127c;

    /* renamed from: d  reason: collision with root package name */
    public String f4128d;

    public q(b bVar, a aVar) {
        this.b = bVar;
        this.f4127c = aVar;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<Bitmap> a(InputStream inputStream, int i, int i2) {
        BitmapFactory.Options options;
        c cVar;
        Throwable th;
        int i3;
        char c2;
        int i4;
        Bitmap bitmap;
        c cVar2;
        Throwable th2;
        InputStream inputStream2 = inputStream;
        f fVar = this.f4126a;
        b bVar = this.b;
        a aVar = this.f4127c;
        if (fVar != null) {
            e.d.a.s.a aVar2 = e.d.a.s.a.b;
            byte[] a2 = aVar2.a();
            byte[] a3 = aVar2.a();
            BitmapFactory.Options b2 = f.b();
            o oVar = new o(inputStream2, a3);
            c a4 = c.a(oVar);
            f fVar2 = new f(a4);
            try {
                a4.f4271c.mark(5242880);
                try {
                    int a5 = new l(a4).a();
                    try {
                        a4.reset();
                    } catch (IOException e2) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e2);
                        }
                    }
                    i3 = a5;
                } catch (IOException e3) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot determine the image orientation from header", e3);
                    }
                    try {
                        a4.reset();
                    } catch (IOException e4) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e4);
                        }
                    }
                    i3 = 0;
                } catch (Throwable th3) {
                    th2 = th3;
                    cVar2 = a4;
                }
                b2.inTempStorage = a2;
                b2.inJustDecodeBounds = true;
                f.a(fVar2, oVar, b2);
                b2.inJustDecodeBounds = false;
                int[] iArr = {b2.outWidth, b2.outHeight};
                int i5 = iArr[0];
                int i6 = iArr[1];
                switch (i3) {
                    case 3:
                    case 4:
                        c2 = 180;
                        break;
                    case 5:
                    case 6:
                        c2 = 'Z';
                        break;
                    case 7:
                    case 8:
                        c2 = 270;
                        break;
                    default:
                        c2 = 0;
                        break;
                }
                int i7 = i2;
                int i8 = i;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = i6;
                }
                if (i8 == Integer.MIN_VALUE) {
                    i8 = i5;
                }
                if (c2 == 'Z' || c2 == 270) {
                    i4 = fVar.a(i6, i5, i8, i7);
                } else {
                    try {
                        i4 = fVar.a(i5, i6, i8, i7);
                    } catch (Throwable th4) {
                        th = th4;
                        options = b2;
                        cVar = a4;
                        aVar2.a(a2);
                        aVar2.a(a3);
                        cVar.a();
                        f.a(options);
                        throw th;
                    }
                }
                cVar = a4;
                options = b2;
                try {
                    Bitmap a6 = fVar.a(fVar2, oVar, b2, bVar, i5, i6, Math.max(1, i4 == 0 ? 0 : Integer.highestOneBit(i4)), aVar);
                    IOException iOException = cVar.f4272d;
                    if (iOException == null) {
                        if (a6 != null) {
                            bitmap = l.f.a(a6, bVar, i3);
                            if (!a6.equals(bitmap) && !bVar.a(a6)) {
                                a6.recycle();
                            }
                        } else {
                            bitmap = null;
                        }
                        aVar2.a(a2);
                        aVar2.a(a3);
                        cVar.a();
                        f.a(options);
                        return c.a(bitmap, this.b);
                    }
                    try {
                        throw new RuntimeException(iOException);
                    } catch (Throwable th5) {
                        th = th5;
                        aVar2.a(a2);
                        aVar2.a(a3);
                        cVar.a();
                        f.a(options);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    aVar2.a(a2);
                    aVar2.a(a3);
                    cVar.a();
                    f.a(options);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                cVar = a4;
                options = b2;
                aVar2.a(a2);
                aVar2.a(a3);
                cVar.a();
                f.a(options);
                throw th;
            }
        } else {
            throw null;
        }
        try {
            cVar2.reset();
        } catch (IOException e5) {
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot reset the input stream", e5);
            }
        }
        throw th2;
    }

    @Override // e.d.a.m.e
    public String a() {
        if (this.f4128d == null) {
            StringBuilder a2 = e.a.a.a.a.a("StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap");
            a2.append(this.f4126a.a());
            a2.append(this.f4127c.name());
            this.f4128d = a2.toString();
        }
        return this.f4128d;
    }
}

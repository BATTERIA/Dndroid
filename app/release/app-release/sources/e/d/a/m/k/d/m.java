package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.j.f;
import java.io.IOException;
import java.io.InputStream;

public class m implements e<f, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final e<InputStream, Bitmap> f4112a;
    public final e<ParcelFileDescriptor, Bitmap> b;

    public m(e<InputStream, Bitmap> eVar, e<ParcelFileDescriptor, Bitmap> eVar2) {
        this.f4112a = eVar;
        this.b = eVar2;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<Bitmap> a(f fVar, int i, int i2) {
        k<Bitmap> kVar;
        ParcelFileDescriptor parcelFileDescriptor;
        f fVar2 = fVar;
        InputStream inputStream = fVar2.f4062a;
        if (inputStream != null) {
            try {
                kVar = this.f4112a.a(inputStream, i, i2);
            } catch (IOException e2) {
                if (Log.isLoggable("ImageVideoDecoder", 2)) {
                    Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", e2);
                }
            }
            return (kVar != null || (parcelFileDescriptor = fVar2.b) == null) ? kVar : this.b.a(parcelFileDescriptor, i, i2);
        }
        kVar = null;
        if (kVar != null) {
            return kVar;
        }
    }

    @Override // e.d.a.m.e
    public String a() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}

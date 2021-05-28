package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.util.Log;
import e.d.a.m.f;
import e.d.a.m.i.k;
import e.d.a.s.d;
import e.d.a.s.h;
import java.io.OutputStream;

public class b implements f<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap.CompressFormat f4083a = null;
    public int b = 90;

    @Override // e.d.a.m.b
    public String a() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    @Override // e.d.a.m.b
    public boolean a(Object obj, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) ((k) obj).get();
        long a2 = d.a();
        Bitmap.CompressFormat compressFormat = this.f4083a;
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.compress(compressFormat, this.b, outputStream);
        if (!Log.isLoggable("BitmapEncoder", 2)) {
            return true;
        }
        Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + h.a(bitmap) + " in " + d.a(a2));
        return true;
    }
}

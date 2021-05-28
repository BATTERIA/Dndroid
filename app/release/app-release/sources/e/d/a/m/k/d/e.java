package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import e.c.a.b.l;
import e.d.a.m.i.m.b;

public class e extends d {
    public e(b bVar) {
        super(bVar);
    }

    @Override // e.d.a.m.k.d.d
    public Bitmap a(b bVar, Bitmap bitmap, int i, int i2) {
        float f2;
        float f3;
        Bitmap a2 = bVar.a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            Matrix matrix = new Matrix();
            float f4 = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                f3 = ((float) i2) / ((float) bitmap.getHeight());
                f4 = (((float) i) - (((float) bitmap.getWidth()) * f3)) * 0.5f;
                f2 = 0.0f;
            } else {
                f3 = ((float) i) / ((float) bitmap.getWidth());
                f2 = (((float) i2) - (((float) bitmap.getHeight()) * f3)) * 0.5f;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f4 + 0.5f)), (float) ((int) (f2 + 0.5f)));
            Bitmap createBitmap = a2 != null ? a2 : Bitmap.createBitmap(i, i2, l.f.a(bitmap));
            if (createBitmap != null) {
                createBitmap.setHasAlpha(bitmap.hasAlpha());
            }
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
            bitmap = createBitmap;
        }
        if (!(a2 == null || a2 == bitmap || bVar.a(a2))) {
            a2.recycle();
        }
        return bitmap;
    }

    @Override // e.d.a.m.g
    public String a() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}

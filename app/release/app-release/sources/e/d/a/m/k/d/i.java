package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import e.c.a.b.l;
import e.d.a.m.i.m.b;

public class i extends d {
    public i(b bVar) {
        super(bVar);
    }

    @Override // e.d.a.m.k.d.d
    public Bitmap a(b bVar, Bitmap bitmap, int i, int i2) {
        String str;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
            int width = (int) (((float) bitmap.getWidth()) * min);
            int height = (int) (((float) bitmap.getHeight()) * min);
            if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
                Bitmap.Config a2 = l.f.a(bitmap);
                Bitmap a3 = bVar.a(width, height, a2);
                if (a3 == null) {
                    a3 = Bitmap.createBitmap(width, height, a2);
                }
                if (a3 != null) {
                    a3.setHasAlpha(bitmap.hasAlpha());
                }
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i + "x" + i2);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + a3.getWidth() + "x" + a3.getHeight());
                    StringBuilder sb = new StringBuilder();
                    sb.append("minPct:   ");
                    sb.append(min);
                    Log.v("TransformationUtils", sb.toString());
                }
                Canvas canvas = new Canvas(a3);
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                canvas.drawBitmap(bitmap, matrix, new Paint(6));
                return a3;
            } else if (!Log.isLoggable("TransformationUtils", 2)) {
                return bitmap;
            } else {
                str = "adjusted target size matches input, returning input";
            }
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            str = "requested target size matches input, returning input";
        }
        Log.v("TransformationUtils", str);
        return bitmap;
    }

    @Override // e.d.a.m.g
    public String a() {
        return "FitCenter.com.bumptech.glide.load.resource.bitmap";
    }
}

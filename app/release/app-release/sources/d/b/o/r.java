package d.b.o;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

public class r extends RatingBar {

    /* renamed from: c  reason: collision with root package name */
    public final p f2975c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = d.b.a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            d.b.o.p r2 = new d.b.o.p
            r2.<init>(r1)
            r1.f2975c = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f2975c.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}

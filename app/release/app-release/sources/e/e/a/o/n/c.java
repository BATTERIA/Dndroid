package e.e.a.o.n;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

public class c extends ImageSpan {

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Drawable> f4418c;

    public c(Drawable drawable, int i) {
        super(drawable, i);
    }

    public final Drawable a() {
        WeakReference<Drawable> weakReference = this.f4418c;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f4418c = new WeakReference<>(drawable2);
        return drawable2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        int i6 = ((ImageSpan) this).mVerticalAlignment;
        if (i6 == 1 || i6 == 0) {
            super.draw(canvas, charSequence, i, i2, f2, i3, i4, i5, paint);
            return;
        }
        Drawable a2 = a();
        canvas.save();
        int i7 = ((ImageSpan) this).mVerticalAlignment;
        if (i7 != 2) {
            i3 = i7 == 3 ? i3 + (((i5 - i3) - a2.getBounds().height()) / 2) : 0;
        }
        canvas.translate(f2, (float) i3);
        a2.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = ((ImageSpan) this).mVerticalAlignment;
        if (i3 == 1 || i3 == 0) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Rect bounds = a().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i4 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int height = bounds.height();
            if (((ImageSpan) this).mVerticalAlignment == 2) {
                int i5 = -height;
                fontMetricsInt.top = i5;
                fontMetricsInt.ascent = i5;
                int i6 = i4 - height;
                fontMetricsInt.descent = i6;
                fontMetricsInt.bottom = i6;
            } else {
                int i7 = height / 2;
                int i8 = i4 / 2;
                int i9 = i7 - i8;
                int i10 = -(i7 + i8);
                fontMetricsInt.top = i10;
                fontMetricsInt.ascent = i10;
                fontMetricsInt.descent = i9;
                fontMetricsInt.bottom = i9;
            }
        }
        return bounds.right;
    }
}

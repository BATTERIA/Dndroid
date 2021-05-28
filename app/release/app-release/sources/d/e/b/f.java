package d.e.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class f extends View {

    /* renamed from: c  reason: collision with root package name */
    public int f3220c;

    /* renamed from: d  reason: collision with root package name */
    public View f3221d;

    /* renamed from: e  reason: collision with root package name */
    public int f3222e;

    public View getContent() {
        return this.f3221d;
    }

    public int getEmptyVisibility() {
        return this.f3222e;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f3220c != i) {
            View view = this.f3221d;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f3221d.getLayoutParams()).Z = false;
                this.f3221d = null;
            }
            this.f3220c = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3222e = i;
    }
}

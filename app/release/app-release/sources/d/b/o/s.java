package d.b.o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

public class s extends SeekBar {

    /* renamed from: c  reason: collision with root package name */
    public final t f2979c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = d.b.a.seekBarStyle
            r1.<init>(r2, r3, r0)
            d.b.o.t r2 = new d.b.o.t
            r2.<init>(r1)
            r1.f2979c = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f2979c;
        Drawable drawable = tVar.f2981e;
        if (drawable != null && drawable.isStateful() && drawable.setState(tVar.f2980d.getDrawableState())) {
            tVar.f2980d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2979c.f2981e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2979c.a(canvas);
    }
}

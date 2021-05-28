package d.b.o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import c.a.a.a.a;
import d.b.j;
import d.g.l.p;

public class t extends p {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f2980d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2981e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f2982f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2983g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2984h = false;
    public boolean i = false;

    public t(SeekBar seekBar) {
        super(seekBar);
        this.f2980d = seekBar;
    }

    public final void a() {
        if (this.f2981e == null) {
            return;
        }
        if (this.f2984h || this.i) {
            Drawable a2 = a.a(this.f2981e.mutate());
            this.f2981e = a2;
            if (this.f2984h) {
                a.a(a2, this.f2982f);
            }
            if (this.i) {
                a.a(this.f2981e, this.f2983g);
            }
            if (this.f2981e.isStateful()) {
                this.f2981e.setState(this.f2980d.getDrawableState());
            }
        }
    }

    public void a(Canvas canvas) {
        if (this.f2981e != null) {
            int max = this.f2980d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2981e.getIntrinsicWidth();
                int intrinsicHeight = this.f2981e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f2981e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f2980d.getWidth() - this.f2980d.getPaddingLeft()) - this.f2980d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2980d.getPaddingLeft(), (float) (this.f2980d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f2981e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // d.b.o.p
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        t0 a2 = t0.a(this.f2980d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        Drawable c2 = a2.c(j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.f2980d.setThumb(c2);
        }
        Drawable b = a2.b(j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f2981e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2981e = b;
        if (b != null) {
            b.setCallback(this.f2980d);
            a.a(b, p.h(this.f2980d));
            if (b.isStateful()) {
                b.setState(this.f2980d.getDrawableState());
            }
            a();
        }
        this.f2980d.invalidate();
        if (a2.e(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2983g = b0.a(a2.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f2983g);
            this.i = true;
        }
        if (a2.e(j.AppCompatSeekBar_tickMarkTint)) {
            this.f2982f = a2.a(j.AppCompatSeekBar_tickMarkTint);
            this.f2984h = true;
        }
        a2.b.recycle();
        a();
    }
}

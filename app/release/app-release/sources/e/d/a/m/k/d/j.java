package e.d.a.m.k.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e.d.a.m.k.e.b;

public class j extends b {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4094c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public int f4095d;

    /* renamed from: e  reason: collision with root package name */
    public int f4096e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4097f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4098g;

    /* renamed from: h  reason: collision with root package name */
    public a f4099h;

    public static class a extends Drawable.ConstantState {

        /* renamed from: d  reason: collision with root package name */
        public static final Paint f4100d = new Paint(6);

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f4101a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Paint f4102c = f4100d;

        public a(Bitmap bitmap) {
            this.f4101a = bitmap;
        }

        public a(a aVar) {
            Bitmap bitmap = aVar.f4101a;
            this.f4101a = bitmap;
            this.b = aVar.b;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new j(null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new j(resources, this);
        }
    }

    public j(Resources resources, a aVar) {
        int i;
        if (aVar != null) {
            this.f4099h = aVar;
            if (resources != null) {
                i = resources.getDisplayMetrics().densityDpi;
                i = i == 0 ? 160 : i;
                aVar.b = i;
            } else {
                i = aVar.b;
            }
            this.f4095d = aVar.f4101a.getScaledWidth(i);
            this.f4096e = aVar.f4101a.getScaledHeight(i);
            return;
        }
        throw new NullPointerException("BitmapState must not be null");
    }

    @Override // e.d.a.m.k.e.b
    public void a(int i) {
    }

    @Override // e.d.a.m.k.e.b
    public boolean a() {
        return false;
    }

    public void draw(Canvas canvas) {
        if (this.f4097f) {
            Gravity.apply(d.b.j.AppCompatTheme_windowMinWidthMinor, this.f4095d, this.f4096e, getBounds(), this.f4094c);
            this.f4097f = false;
        }
        a aVar = this.f4099h;
        canvas.drawBitmap(aVar.f4101a, (Rect) null, this.f4094c, aVar.f4102c);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4099h;
    }

    public int getIntrinsicHeight() {
        return this.f4096e;
    }

    public int getIntrinsicWidth() {
        return this.f4095d;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f4099h.f4101a;
        return (bitmap == null || bitmap.hasAlpha() || this.f4099h.f4102c.getAlpha() < 255) ? -3 : -1;
    }

    public boolean isRunning() {
        return false;
    }

    public Drawable mutate() {
        if (!this.f4098g && super.mutate() == this) {
            this.f4099h = new a(this.f4099h);
            this.f4098g = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4097f = true;
    }

    public void setAlpha(int i) {
        if (this.f4099h.f4102c.getAlpha() != i) {
            a aVar = this.f4099h;
            if (a.f4100d == aVar.f4102c) {
                aVar.f4102c = new Paint(6);
            }
            aVar.f4102c.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.f4099h;
        if (a.f4100d == aVar.f4102c) {
            aVar.f4102c = new Paint(6);
        }
        aVar.f4102c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void start() {
    }

    public void stop() {
    }
}

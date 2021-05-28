package e.d.a.m.k.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import d.b.j;
import e.d.a.k.a;
import e.d.a.k.c;
import e.d.a.m.g;
import e.d.a.m.k.g.f;

public class b extends e.d.a.m.k.e.b implements f.c {

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4139c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4140d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final a f4141e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.a.k.a f4142f;

    /* renamed from: g  reason: collision with root package name */
    public final f f4143g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4144h;
    public boolean i;
    public boolean j;
    public boolean k = true;
    public int l;
    public int m = -1;
    public boolean n;

    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public c f4145a;
        public byte[] b;

        /* renamed from: c  reason: collision with root package name */
        public Context f4146c;

        /* renamed from: d  reason: collision with root package name */
        public g<Bitmap> f4147d;

        /* renamed from: e  reason: collision with root package name */
        public int f4148e;

        /* renamed from: f  reason: collision with root package name */
        public int f4149f;

        /* renamed from: g  reason: collision with root package name */
        public a.AbstractC0119a f4150g;

        /* renamed from: h  reason: collision with root package name */
        public e.d.a.m.i.m.b f4151h;
        public Bitmap i;

        public a(c cVar, byte[] bArr, Context context, g<Bitmap> gVar, int i2, int i3, a.AbstractC0119a aVar, e.d.a.m.i.m.b bVar, Bitmap bitmap) {
            if (bitmap != null) {
                this.f4145a = cVar;
                this.b = bArr;
                this.f4151h = bVar;
                this.i = bitmap;
                this.f4146c = context.getApplicationContext();
                this.f4147d = gVar;
                this.f4148e = i2;
                this.f4149f = i3;
                this.f4150g = aVar;
                return;
            }
            throw new NullPointerException("The first frame of the GIF must not be null");
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new b(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new b(this);
        }
    }

    public b(a aVar) {
        if (aVar != null) {
            this.f4141e = aVar;
            this.f4142f = new e.d.a.k.a(aVar.f4150g);
            this.f4139c = new Paint();
            this.f4142f.a(aVar.f4145a, aVar.b);
            f fVar = new f(aVar.f4146c, this, this.f4142f, aVar.f4148e, aVar.f4149f);
            this.f4143g = fVar;
            g<Bitmap> gVar = aVar.f4147d;
            if (fVar == null) {
                throw null;
            } else if (gVar != null) {
                fVar.f4161f = fVar.f4161f.a(gVar);
            } else {
                throw new NullPointerException("Transformation must not be null");
            }
        } else {
            throw new NullPointerException("GifState must not be null");
        }
    }

    @Override // e.d.a.m.k.e.b
    public void a(int i2) {
        if (i2 > 0 || i2 == -1 || i2 == 0) {
            if (i2 == 0) {
                i2 = this.f4142f.j.m;
            }
            this.m = i2;
            return;
        }
        throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
    }

    @Override // e.d.a.m.k.e.b
    public boolean a() {
        return true;
    }

    public final void b() {
        if (this.f4142f.j.f3912c != 1) {
            if (!this.f4144h) {
                this.f4144h = true;
                f fVar = this.f4143g;
                if (!fVar.f4159d) {
                    fVar.f4159d = true;
                    fVar.f4163h = false;
                    fVar.b();
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!this.j) {
            if (this.n) {
                Gravity.apply(j.AppCompatTheme_windowMinWidthMinor, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f4140d);
                this.n = false;
            }
            f.b bVar = this.f4143g.f4162g;
            Bitmap bitmap = bVar != null ? bVar.f4167g : null;
            if (bitmap == null) {
                bitmap = this.f4141e.i;
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f4140d, this.f4139c);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4141e;
    }

    public int getIntrinsicHeight() {
        return this.f4141e.i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4141e.i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f4144h;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    public void setAlpha(int i2) {
        this.f4139c.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4139c.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.k = z;
        if (!z) {
            this.f4144h = false;
            this.f4143g.f4159d = false;
        } else if (this.i) {
            b();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.i = true;
        this.l = 0;
        if (this.k) {
            b();
        }
    }

    public void stop() {
        this.i = false;
        this.f4144h = false;
        this.f4143g.f4159d = false;
    }
}

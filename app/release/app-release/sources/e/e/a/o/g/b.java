package e.e.a.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import d.b.o.m;

public class b extends m {
    public static final Bitmap.Config z = Bitmap.Config.ARGB_8888;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4372e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f4373f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f4374g = new Matrix();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4375h = new Paint();
    public final Paint i = new Paint();
    public final Path j = new Path();
    public int k = 0;
    public float l = 0.0f;
    public int m = 0;
    public Bitmap n;
    public BitmapShader o;
    public int p;
    public int q;
    public float r;
    public float s;
    public RectF t = new RectF();
    public Path u = new Path();
    public float[] v;
    public float w;
    public boolean x = true;
    public boolean y;

    public b(Context context) {
        super(context, null, 0);
        if (this.y) {
            c();
            this.y = false;
        }
    }

    public final Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(1, 1, z) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), z);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final void c() {
        DashPathEffect dashPathEffect;
        float f2;
        float f3;
        if (!this.x) {
            this.y = true;
        } else if (this.n != null) {
            Bitmap bitmap = this.n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.o = new BitmapShader(bitmap, tileMode, tileMode);
            this.f4375h.setAntiAlias(true);
            this.f4375h.setShader(this.o);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setAntiAlias(true);
            this.i.setColor(this.k);
            this.i.setStrokeWidth(this.l);
            Paint paint = this.i;
            int i2 = this.m;
            float f4 = this.l;
            float f5 = 0.0f;
            if (i2 == 2) {
                float f6 = f4 * 3.0f;
                dashPathEffect = new DashPathEffect(new float[]{f6, f6, f6, f6}, 0.0f);
            } else if (i2 != 3) {
                dashPathEffect = null;
            } else {
                dashPathEffect = new DashPathEffect(new float[]{f4, f4, f4, f4}, 0.0f);
            }
            paint.setPathEffect(dashPathEffect);
            this.q = this.n.getHeight();
            this.p = this.n.getWidth();
            RectF rectF = this.f4373f;
            float f7 = this.l;
            rectF.set(f7 / 2.0f, f7 / 2.0f, ((float) getWidth()) - (this.l / 2.0f), ((float) getHeight()) - (this.l / 2.0f));
            RectF rectF2 = this.f4372e;
            float f8 = this.l;
            rectF2.set(f8 / 2.0f, f8 / 2.0f, ((float) getWidth()) - (this.l / 2.0f), ((float) getHeight()) - (this.l / 2.0f));
            this.r = Math.min(this.f4372e.height() / 2.0f, this.f4372e.width() / 2.0f);
            this.f4374g.set(null);
            if (this.f4372e.height() * ((float) this.p) > this.f4372e.width() * ((float) this.q)) {
                f3 = this.f4372e.height() / ((float) this.q);
                f5 = (this.f4372e.width() - (((float) this.p) * f3)) * 0.5f;
                f2 = 0.0f;
            } else {
                f3 = this.f4372e.width() / ((float) this.p);
                f2 = (this.f4372e.height() - (((float) this.q) * f3)) * 0.5f;
            }
            this.f4374g.setScale(f3, f3);
            Matrix matrix = this.f4374g;
            float f9 = this.l;
            matrix.postTranslate(((float) ((int) (f5 + 0.5f))) + f9, ((float) ((int) (f2 + 0.5f))) + f9);
            this.o.setLocalMatrix(this.f4374g);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.k;
    }

    public float getBorderWidth() {
        return this.l;
    }

    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            if (this.v != null) {
                this.t.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                this.u.reset();
                this.u.addRoundRect(this.t, this.v, Path.Direction.CW);
                canvas.clipPath(this.u);
            }
            if (this.s <= 0.0f && this.w > 0.0f) {
                this.s = ((float) Math.min(getWidth(), getHeight())) * this.w;
            }
            float f2 = this.s;
            if (f2 <= 0.0f) {
                super.onDraw(canvas);
            } else if (f2 >= Math.min(this.f4372e.height() / 2.0f, this.f4372e.width() / 2.0f)) {
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.r, this.f4375h);
            } else {
                this.j.reset();
                Path path = this.j;
                RectF rectF = this.f4372e;
                float f3 = this.s;
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                canvas.drawPath(this.j, this.f4375h);
            }
            if (this.l > 0.0f) {
                float f4 = this.s;
                if (f4 <= 0.0f) {
                    canvas.drawRect(this.f4373f, this.i);
                } else if (f4 >= Math.min(this.f4372e.height() / 2.0f, this.f4372e.width() / 2.0f)) {
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.r, this.i);
                } else {
                    this.j.reset();
                    Path path2 = this.j;
                    RectF rectF2 = this.f4373f;
                    float f5 = this.s;
                    path2.addRoundRect(rectF2, f5, f5, Path.Direction.CW);
                    canvas.drawPath(this.j, this.i);
                }
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        c();
    }

    public void setBorderColor(int i2) {
        if (i2 != this.k) {
            this.k = i2;
            this.i.setColor(i2);
            invalidate();
        }
    }

    public void setBorderRadius(float f2) {
        if (((double) Math.abs(this.s - f2)) >= 1.0E-8d) {
            this.s = f2;
            this.w = 0.0f;
            c();
        }
    }

    public void setBorderRadiusPercent(float f2) {
        if (((double) Math.abs(this.w - f2)) >= 1.0E-8d) {
            this.w = f2;
            this.s = 0.0f;
            c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBorderStyle(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            r1 = 1
            goto L_0x004a
        L_0x000b:
            java.lang.String r7 = r7.toUpperCase()
            r0 = -1
            int r4 = r7.hashCode()
            r5 = 79081099(0x4b6ae8b, float:4.2948287E-36)
            if (r4 == r5) goto L_0x0038
            r5 = 2009355185(0x77c453b1, float:7.963966E33)
            if (r4 == r5) goto L_0x002e
            r5 = 2022325802(0x788a3e2a, float:2.2431181E34)
            if (r4 == r5) goto L_0x0024
            goto L_0x0041
        L_0x0024:
            java.lang.String r4 = "DOTTED"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0041
            r0 = 2
            goto L_0x0041
        L_0x002e:
            java.lang.String r4 = "DASHED"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0041
        L_0x0038:
            java.lang.String r4 = "SOLID"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0041
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0009
            if (r0 == r3) goto L_0x004a
            if (r0 == r1) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x0049:
            r1 = 3
        L_0x004a:
            int r7 = r6.m
            if (r7 != r1) goto L_0x004f
            return
        L_0x004f:
            r6.m = r1
            r6.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.o.g.b.setBorderStyle(java.lang.String):void");
    }

    public void setBorderWidth(float f2) {
        if (((double) Math.abs(this.l - f2)) >= 1.0E-8d) {
            this.l = f2;
            c();
        }
    }

    public void setCornerRadii(float[] fArr) {
        this.v = fArr;
    }

    @Override // d.b.o.m
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.n = bitmap;
        c();
    }

    @Override // d.b.o.m
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.n = a(drawable);
        c();
    }

    @Override // d.b.o.m
    public void setImageResource(int i2) {
        super.setImageResource(i2);
        this.n = a(getDrawable());
        c();
    }
}

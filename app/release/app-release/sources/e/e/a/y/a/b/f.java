package e.e.a.y.a.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f4563a;
    public GradientDrawable b;

    /* renamed from: c  reason: collision with root package name */
    public int f4564c = 0;

    /* renamed from: d  reason: collision with root package name */
    public a f4565d = new a();

    /* renamed from: e  reason: collision with root package name */
    public c f4566e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f4567f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public RectF f4568g = new RectF();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4569h = new Paint(1);
    public final Paint i = new Paint(1);
    public final Paint j = new Paint(1);
    public final Path k = new Path();
    public final Path l = new Path();
    public final Path m = new Path();
    public final Path n = new Path();
    public final RectF o = new RectF();
    public final RectF p = new RectF();
    public final RectF q = new RectF();
    public final RectF r = new RectF();
    public final float[] s = new float[8];
    public final float[] t = new float[8];
    public final float[] u = new float[8];

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Rect f4570a = new Rect(1, 1, 1, 1);
        public RectF b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        public Rect f4571c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public b f4572d = new b();

        public static int a(String str) {
            if (TextUtils.isEmpty(str)) {
                return 1;
            }
            String upperCase = str.toUpperCase();
            char c2 = 65535;
            int hashCode = upperCase.hashCode();
            if (hashCode != 79081099) {
                if (hashCode != 2009355185) {
                    if (hashCode == 2022325802 && upperCase.equals("DOTTED")) {
                        c2 = 2;
                    }
                } else if (upperCase.equals("DASHED")) {
                    c2 = 1;
                }
            } else if (upperCase.equals("SOLID")) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 1;
            }
            if (c2 != 1) {
                return c2 != 2 ? 0 : 3;
            }
            return 2;
        }

        public boolean a() {
            b bVar = this.f4572d;
            if (bVar != null) {
                if (bVar.f4573a > 0.0f || bVar.b > 0.0f || bVar.f4574c > 0.0f || bVar.f4575d > 0.0f || bVar.f4576e > 0.0f || bVar.f4577f > 0.0f || bVar.f4578g > 0.0f || bVar.f4579h > 0.0f || bVar.i > 0.0f || bVar.j > 0.0f || bVar.k > 0.0f || bVar.l > 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public boolean b() {
            Rect rect = this.f4570a;
            if ((rect == null || (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0)) ? false : true) {
                RectF rectF = this.b;
                if (rectF != null && (rectF.left > 0.0f || rectF.top > 0.0f || rectF.right > 0.0f || rectF.bottom > 0.0f)) {
                    Rect rect2 = this.f4571c;
                    if ((rect2 == null || (rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0)) ? false : true) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f4573a;
        public float b;

        /* renamed from: c  reason: collision with root package name */
        public float f4574c;

        /* renamed from: d  reason: collision with root package name */
        public float f4575d;

        /* renamed from: e  reason: collision with root package name */
        public float f4576e;

        /* renamed from: f  reason: collision with root package name */
        public float f4577f;

        /* renamed from: g  reason: collision with root package name */
        public float f4578g;

        /* renamed from: h  reason: collision with root package name */
        public float f4579h;
        public float i;
        public float j;
        public float k;
        public float l;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float f4580a;
        public float b;

        /* renamed from: c  reason: collision with root package name */
        public float f4581c;

        /* renamed from: d  reason: collision with root package name */
        public int f4582d;

        public c(float f2, float f3, float f4, int i) {
            this.f4580a = f2;
            this.b = f3;
            this.f4581c = f4;
            this.f4582d = i;
        }
    }

    public void a(float f2) {
        b bVar = this.f4565d.f4572d;
        bVar.f4573a = f2;
        bVar.b = f2;
        bVar.f4574c = f2;
        bVar.f4575d = f2;
        bVar.f4576e = f2;
        bVar.f4577f = f2;
        bVar.f4578g = f2;
        bVar.f4579h = f2;
        invalidateSelf();
    }

    public final void a(Canvas canvas) {
        this.k.reset();
        this.k.addRoundRect(this.o, this.s, Path.Direction.CW);
        canvas.clipPath(this.k);
    }

    public final void a(Canvas canvas, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.i.reset();
        this.i.setStyle(Paint.Style.FILL);
        this.i.setColor(i2);
        this.n.reset();
        this.n.moveTo(f2, f3);
        this.n.lineTo(f4, f5);
        this.n.lineTo(f6, f7);
        this.n.lineTo(f8, f9);
        this.n.lineTo(f2, f3);
        canvas.drawPath(this.n, this.i);
    }

    public final void b(Canvas canvas) {
        c cVar = this.f4566e;
        if (cVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.j.setColor(-1);
                this.j.setStyle(Paint.Style.FILL);
                Paint paint = this.j;
                c cVar2 = this.f4566e;
                paint.setShadowLayer(cVar2.f4580a, cVar2.b, cVar2.f4581c, cVar2.f4582d);
                if (this.f4565d.a()) {
                    this.k.reset();
                    this.k.addRoundRect(this.o, this.s, Path.Direction.CW);
                    canvas.drawPath(this.k, this.j);
                    return;
                }
                canvas.drawRect(getBounds(), this.j);
                return;
            }
            int i2 = (int) (cVar.f4580a * 2.4f);
            this.f4567f.set(getBounds());
            int i3 = -i2;
            this.f4567f.inset(i3, i3);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(this.f4567f.width(), this.f4567f.height(), Bitmap.Config.ARGB_4444);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (float) i2;
                canvas2.translate(f2, f2);
                this.j.setColor(-1);
                this.j.setStyle(Paint.Style.FILL);
                Paint paint2 = this.j;
                c cVar3 = this.f4566e;
                paint2.setShadowLayer(cVar3.f4580a, cVar3.b, cVar3.f4581c, cVar3.f4582d);
                if (this.f4565d.a()) {
                    this.f4568g.set(this.o);
                    this.f4568g.inset(1.0f, 1.0f);
                    this.k.reset();
                    this.k.addRoundRect(this.f4568g, this.s, Path.Direction.CW);
                    canvas2.drawPath(this.k, this.j);
                } else {
                    this.f4568g.set(getBounds());
                    this.f4568g.inset(1.0f, 1.0f);
                    canvas2.drawRect(this.f4568g, this.j);
                }
                float f3 = (float) i3;
                canvas.drawBitmap(createBitmap, f3, f3, (Paint) null);
                if (!createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x046c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19) {
        /*
        // Method dump skipped, instructions count: 1593
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.f.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void a(Object obj) {
        if (obj instanceof Integer) {
            this.f4564c = ((Integer) obj).intValue();
            this.b = null;
            this.f4563a = null;
            invalidateSelf();
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i2 = iArr[0];
            int[] copyOfRange = Arrays.copyOfRange(iArr, 1, iArr.length);
            if (copyOfRange != null && copyOfRange.length > 0) {
                int i3 = i2 % 360;
                this.b = new GradientDrawable(i3 != 45 ? i3 != 90 ? i3 != 135 ? i3 != 180 ? i3 != 225 ? i3 != 270 ? i3 != 315 ? GradientDrawable.Orientation.BOTTOM_TOP : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BL_TR, copyOfRange);
                this.f4564c = 0;
                this.f4563a = null;
                invalidateSelf();
            }
        }
    }
}

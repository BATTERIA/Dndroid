package d.q.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class h extends g {
    public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;

    /* renamed from: d  reason: collision with root package name */
    public C0116h f3699d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuffColorFilter f3700e;

    /* renamed from: f  reason: collision with root package name */
    public ColorFilter f3701f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3702g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3703h;
    public final float[] i;
    public final Matrix j;
    public final Rect k;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // d.q.a.a.h.f
        public boolean b() {
            return true;
        }
    }

    public static class c extends f {

        /* renamed from: d  reason: collision with root package name */
        public int[] f3704d;

        /* renamed from: e  reason: collision with root package name */
        public d.g.e.c.a f3705e;

        /* renamed from: f  reason: collision with root package name */
        public float f3706f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        public d.g.e.c.a f3707g;

        /* renamed from: h  reason: collision with root package name */
        public float f3708h = 1.0f;
        public int i = 0;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public c(c cVar) {
            super(cVar);
            this.f3704d = cVar.f3704d;
            this.f3705e = cVar.f3705e;
            this.f3706f = cVar.f3706f;
            this.f3708h = cVar.f3708h;
            this.f3707g = cVar.f3707g;
            this.i = cVar.i;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        @Override // d.q.a.a.h.e
        public boolean a() {
            return this.f3707g.b() || this.f3705e.b();
        }

        @Override // d.q.a.a.h.e
        public boolean a(int[] iArr) {
            return this.f3705e.a(iArr) | this.f3707g.a(iArr);
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.f3707g.f3247c;
        }

        public float getStrokeAlpha() {
            return this.f3708h;
        }

        public int getStrokeColor() {
            return this.f3705e.f3247c;
        }

        public float getStrokeWidth() {
            return this.f3706f;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        public void setFillColor(int i2) {
            this.f3707g.f3247c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f3708h = f2;
        }

        public void setStrokeColor(int i2) {
            this.f3705e.f3247c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f3706f = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f3709a = new Matrix();
        public final ArrayList<e> b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public float f3710c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f3711d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3712e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3713f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3714g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f3715h = 0.0f;
        public float i = 0.0f;
        public final Matrix j = new Matrix();
        public int k;
        public int[] l;
        public String m = null;

        public d() {
            super(null);
        }

        public d(d dVar, d.d.a<String, Object> aVar) {
            super(null);
            f fVar;
            this.f3710c = dVar.f3710c;
            this.f3711d = dVar.f3711d;
            this.f3712e = dVar.f3712e;
            this.f3713f = dVar.f3713f;
            this.f3714g = dVar.f3714g;
            this.f3715h = dVar.f3715h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        @Override // d.q.a.a.h.e
        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // d.q.a.a.h.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).a(iArr);
            }
            return z;
        }

        public final void b() {
            this.j.reset();
            this.j.postTranslate(-this.f3711d, -this.f3712e);
            this.j.postScale(this.f3713f, this.f3714g);
            this.j.postRotate(this.f3710c, 0.0f, 0.0f);
            this.j.postTranslate(this.f3715h + this.f3711d, this.i + this.f3712e);
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f3711d;
        }

        public float getPivotY() {
            return this.f3712e;
        }

        public float getRotation() {
            return this.f3710c;
        }

        public float getScaleX() {
            return this.f3713f;
        }

        public float getScaleY() {
            return this.f3714g;
        }

        public float getTranslateX() {
            return this.f3715h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f3711d) {
                this.f3711d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f3712e) {
                this.f3712e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f3710c) {
                this.f3710c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f3713f) {
                this.f3713f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f3714g) {
                this.f3714g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f3715h) {
                this.f3715h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public d.g.f.b[] f3716a = null;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public int f3717c;

        public f() {
            super(null);
        }

        public f(f fVar) {
            super(null);
            this.b = fVar.b;
            this.f3717c = fVar.f3717c;
            this.f3716a = c.a.a.a.a.a(fVar.f3716a);
        }

        public boolean b() {
            return false;
        }

        public d.g.f.b[] getPathData() {
            return this.f3716a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(d.g.f.b[] bVarArr) {
            if (!c.a.a.a.a.a(this.f3716a, bVarArr)) {
                this.f3716a = c.a.a.a.a.a(bVarArr);
                return;
            }
            d.g.f.b[] bVarArr2 = this.f3716a;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f3261a = bVarArr[i].f3261a;
                for (int i2 = 0; i2 < bVarArr[i].b.length; i2++) {
                    bVarArr2[i].b[i2] = bVarArr[i].b[i2];
                }
            }
        }
    }

    public static class g {
        public static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f3718a;
        public final Path b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f3719c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f3720d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f3721e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f3722f;

        /* renamed from: g  reason: collision with root package name */
        public int f3723g;

        /* renamed from: h  reason: collision with root package name */
        public final d f3724h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final d.d.a<String, Object> p;

        public g() {
            this.f3719c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new d.d.a<>();
            this.f3724h = new d();
            this.f3718a = new Path();
            this.b = new Path();
        }

        public g(g gVar) {
            this.f3719c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            d.d.a<String, Object> aVar = new d.d.a<>();
            this.p = aVar;
            this.f3724h = new d(gVar.f3724h, aVar);
            this.f3718a = new Path(gVar.f3718a);
            this.b = new Path(gVar.b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.f3723g = gVar.f3723g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: android.graphics.PathMeasure */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(d.q.a.a.h.d r18, android.graphics.Matrix r19, android.graphics.Canvas r20, int r21, int r22, android.graphics.ColorFilter r23) {
            /*
            // Method dump skipped, instructions count: 558
            */
            throw new UnsupportedOperationException("Method not decompiled: d.q.a.a.h.g.a(d.q.a.a.h$d, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }
    }

    /* renamed from: d.q.a.a.h$h  reason: collision with other inner class name */
    public static class C0116h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f3725a;
        public g b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f3726c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f3727d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3728e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f3729f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f3730g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f3731h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public C0116h() {
            this.f3726c = null;
            this.f3727d = h.l;
            this.b = new g();
        }

        public C0116h(C0116h hVar) {
            this.f3726c = null;
            this.f3727d = h.l;
            if (hVar != null) {
                this.f3725a = hVar.f3725a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f3721e != null) {
                    gVar.f3721e = new Paint(hVar.b.f3721e);
                }
                if (hVar.b.f3720d != null) {
                    this.b.f3720d = new Paint(hVar.b.f3720d);
                }
                this.f3726c = hVar.f3726c;
                this.f3727d = hVar.f3727d;
                this.f3728e = hVar.f3728e;
            }
        }

        public boolean a() {
            g gVar = this.b;
            if (gVar.o == null) {
                gVar.o = Boolean.valueOf(gVar.f3724h.a());
            }
            return gVar.o.booleanValue();
        }

        public int getChangingConfigurations() {
            return this.f3725a;
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public void a(int i2, int i3) {
            this.f3729f.eraseColor(0);
            Canvas canvas = new Canvas(this.f3729f);
            g gVar = this.b;
            gVar.a(gVar.f3724h, g.q, canvas, i2, i3, null);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f3732a;

        public i(Drawable.ConstantState constantState) {
            this.f3732a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3732a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3732a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f3698c = (VectorDrawable) this.f3732a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f3698c = (VectorDrawable) this.f3732a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f3698c = (VectorDrawable) this.f3732a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public h() {
        this.f3703h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f3699d = new C0116h();
    }

    public h(C0116h hVar) {
        this.f3703h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f3699d = hVar;
        this.f3700e = a(hVar.f3726c, hVar.f3727d);
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ IOException | XmlPullParserException -> 0x004a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d.q.a.a.h a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x0028
            d.q.a.a.h r0 = new d.q.a.a.h
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0016
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r6)
            goto L_0x001a
        L_0x0016:
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
        L_0x001a:
            r0.f3698c = r4
            d.q.a.a.h$i r4 = new d.q.a.a.h$i
            android.graphics.drawable.Drawable r5 = r0.f3698c
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            return r0
        L_0x0028:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x0030:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r2 = 2
            if (r1 == r2) goto L_0x003b
            r3 = 1
            if (r1 == r3) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            if (r1 != r2) goto L_0x0042
            d.q.a.a.h r4 = createFromXmlInner(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            return r4
        L_0x0042:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            throw r4     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x004a:
            r4 = move-exception
            goto L_0x004d
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            java.lang.String r5 = "parser error"
            java.lang.String r6 = "VectorDrawableCompat"
            android.util.Log.e(r6, r5, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.a.a.h.a(android.content.res.Resources, int, android.content.res.Resources$Theme):d.q.a.a.h");
    }

    public static h createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3698c;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f3729f.getHeight()) == false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r14) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.a.a.h.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f3699d.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3699d.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3698c != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3698c.getConstantState());
        }
        this.f3699d.f3725a = getChangingConfigurations();
        return this.f3699d;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3699d.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3699d.b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        ArrayDeque arrayDeque;
        g gVar;
        C0116h hVar;
        g gVar2;
        ArrayDeque arrayDeque2;
        TypedArray typedArray;
        c cVar;
        Drawable drawable = this.f3698c;
        if (drawable == null) {
            C0116h hVar2 = this.f3699d;
            hVar2.b = new g();
            TypedArray a2 = c.a.a.a.a.a(resources, theme, attributeSet, a.f3678a);
            C0116h hVar3 = this.f3699d;
            g gVar3 = hVar3.b;
            int b2 = c.a.a.a.a.b(a2, xmlPullParser, "tintMode", 6, -1);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i3 = 3;
            if (b2 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (b2 != 5) {
                if (b2 != 9) {
                    switch (b2) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
            hVar3.f3727d = mode;
            int i4 = 1;
            ColorStateList colorStateList = a2.getColorStateList(1);
            if (colorStateList != null) {
                hVar3.f3726c = colorStateList;
            }
            boolean z = hVar3.f3728e;
            if (c.a.a.a.a.a(xmlPullParser, "autoMirrored")) {
                z = a2.getBoolean(5, z);
            }
            hVar3.f3728e = z;
            gVar3.k = c.a.a.a.a.a(a2, xmlPullParser, "viewportWidth", 7, gVar3.k);
            float a3 = c.a.a.a.a.a(a2, xmlPullParser, "viewportHeight", 8, gVar3.l);
            gVar3.l = a3;
            if (gVar3.k <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (a3 > 0.0f) {
                gVar3.i = a2.getDimension(3, gVar3.i);
                int i5 = 2;
                float dimension = a2.getDimension(2, gVar3.j);
                gVar3.j = dimension;
                if (gVar3.i <= 0.0f) {
                    throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    gVar3.setAlpha(c.a.a.a.a.a(a2, xmlPullParser, "alpha", 4, gVar3.getAlpha()));
                    String string = a2.getString(0);
                    if (string != null) {
                        gVar3.n = string;
                        gVar3.p.put(string, gVar3);
                    }
                    a2.recycle();
                    hVar2.f3725a = getChangingConfigurations();
                    hVar2.k = true;
                    C0116h hVar4 = this.f3699d;
                    g gVar4 = hVar4.b;
                    ArrayDeque arrayDeque3 = new ArrayDeque();
                    arrayDeque3.push(gVar4.f3724h);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                        if (eventType == i5) {
                            String name = xmlPullParser.getName();
                            d dVar = (d) arrayDeque3.peek();
                            if ("path".equals(name)) {
                                c cVar2 = new c();
                                TypedArray a4 = c.a.a.a.a.a(resources, theme, attributeSet, a.f3679c);
                                cVar2.f3704d = null;
                                if (!c.a.a.a.a.a(xmlPullParser, "pathData")) {
                                    arrayDeque2 = arrayDeque3;
                                    gVar2 = gVar4;
                                    hVar = hVar4;
                                    cVar = cVar2;
                                    i2 = depth;
                                    typedArray = a4;
                                } else {
                                    String string2 = a4.getString(0);
                                    if (string2 != null) {
                                        cVar2.b = string2;
                                    }
                                    String string3 = a4.getString(2);
                                    if (string3 != null) {
                                        cVar2.f3716a = c.a.a.a.a.a(string3);
                                    }
                                    arrayDeque2 = arrayDeque3;
                                    gVar2 = gVar4;
                                    hVar = hVar4;
                                    i2 = depth;
                                    typedArray = a4;
                                    cVar = cVar2;
                                    cVar.f3707g = c.a.a.a.a.a(a4, xmlPullParser, theme, "fillColor", 1, 0);
                                    cVar.j = c.a.a.a.a.a(typedArray, xmlPullParser, "fillAlpha", 12, cVar.j);
                                    int b3 = c.a.a.a.a.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = cVar.n;
                                    if (b3 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (b3 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (b3 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    cVar.n = cap;
                                    int b4 = c.a.a.a.a.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = cVar.o;
                                    if (b4 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (b4 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (b4 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    cVar.o = join;
                                    cVar.p = c.a.a.a.a.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, cVar.p);
                                    cVar.f3705e = c.a.a.a.a.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                                    cVar.f3708h = c.a.a.a.a.a(typedArray, xmlPullParser, "strokeAlpha", 11, cVar.f3708h);
                                    cVar.f3706f = c.a.a.a.a.a(typedArray, xmlPullParser, "strokeWidth", 4, cVar.f3706f);
                                    cVar.l = c.a.a.a.a.a(typedArray, xmlPullParser, "trimPathEnd", 6, cVar.l);
                                    cVar.m = c.a.a.a.a.a(typedArray, xmlPullParser, "trimPathOffset", 7, cVar.m);
                                    cVar.k = c.a.a.a.a.a(typedArray, xmlPullParser, "trimPathStart", 5, cVar.k);
                                    cVar.i = c.a.a.a.a.b(typedArray, xmlPullParser, "fillType", 13, cVar.i);
                                }
                                typedArray.recycle();
                                dVar.b.add(cVar);
                                gVar = gVar2;
                                if (cVar.getPathName() != null) {
                                    gVar.p.put(cVar.getPathName(), cVar);
                                }
                                hVar4 = hVar;
                                hVar4.f3725a |= cVar.f3717c;
                                arrayDeque = arrayDeque2;
                                i3 = 3;
                                z2 = false;
                            } else {
                                gVar = gVar4;
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    b bVar = new b();
                                    if (c.a.a.a.a.a(xmlPullParser, "pathData")) {
                                        TypedArray a5 = c.a.a.a.a.a(resources, theme, attributeSet, a.f3680d);
                                        String string4 = a5.getString(0);
                                        if (string4 != null) {
                                            bVar.b = string4;
                                        }
                                        String string5 = a5.getString(1);
                                        if (string5 != null) {
                                            bVar.f3716a = c.a.a.a.a.a(string5);
                                        }
                                        a5.recycle();
                                    }
                                    dVar.b.add(bVar);
                                    if (bVar.getPathName() != null) {
                                        gVar.p.put(bVar.getPathName(), bVar);
                                    }
                                    hVar4.f3725a = bVar.f3717c | hVar4.f3725a;
                                } else if ("group".equals(name)) {
                                    d dVar2 = new d();
                                    TypedArray a6 = c.a.a.a.a.a(resources, theme, attributeSet, a.b);
                                    dVar2.l = null;
                                    dVar2.f3710c = c.a.a.a.a.a(a6, xmlPullParser, "rotation", 5, dVar2.f3710c);
                                    dVar2.f3711d = a6.getFloat(1, dVar2.f3711d);
                                    dVar2.f3712e = a6.getFloat(2, dVar2.f3712e);
                                    i3 = 3;
                                    dVar2.f3713f = c.a.a.a.a.a(a6, xmlPullParser, "scaleX", 3, dVar2.f3713f);
                                    dVar2.f3714g = c.a.a.a.a.a(a6, xmlPullParser, "scaleY", 4, dVar2.f3714g);
                                    dVar2.f3715h = c.a.a.a.a.a(a6, xmlPullParser, "translateX", 6, dVar2.f3715h);
                                    dVar2.i = c.a.a.a.a.a(a6, xmlPullParser, "translateY", 7, dVar2.i);
                                    String string6 = a6.getString(0);
                                    if (string6 != null) {
                                        dVar2.m = string6;
                                    }
                                    dVar2.b();
                                    a6.recycle();
                                    dVar.b.add(dVar2);
                                    arrayDeque = arrayDeque3;
                                    arrayDeque.push(dVar2);
                                    if (dVar2.getGroupName() != null) {
                                        gVar.p.put(dVar2.getGroupName(), dVar2);
                                    }
                                    hVar4.f3725a = dVar2.k | hVar4.f3725a;
                                }
                                arrayDeque = arrayDeque3;
                                i3 = 3;
                            }
                        } else {
                            arrayDeque = arrayDeque3;
                            gVar = gVar4;
                            i2 = depth;
                            if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        eventType = xmlPullParser.next();
                        gVar4 = gVar;
                        arrayDeque3 = arrayDeque;
                        depth = i2;
                        i4 = 1;
                        i5 = 2;
                    }
                    if (!z2) {
                        this.f3700e = a(hVar2.f3726c, hVar2.f3727d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
                }
            } else {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f3699d.f3728e;
    }

    public boolean isStateful() {
        C0116h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f3699d) != null && (hVar.a() || ((colorStateList = this.f3699d.f3726c) != null && colorStateList.isStateful())));
    }

    public Drawable mutate() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3702g && super.mutate() == this) {
            this.f3699d = new C0116h(this.f3699d);
            this.f3702g = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0116h hVar = this.f3699d;
        ColorStateList colorStateList = hVar.f3726c;
        if (!(colorStateList == null || (mode = hVar.f3727d) == null)) {
            this.f3700e = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean a2 = hVar.b.f3724h.a(iArr);
            hVar.k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f3699d.b.getRootAlpha() != i2) {
            this.f3699d.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f3699d.f3728e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3701f = colorFilter;
        invalidateSelf();
    }

    @Override // d.g.f.i.a
    public void setTint(int i2) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // d.g.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, colorStateList);
            return;
        }
        C0116h hVar = this.f3699d;
        if (hVar.f3726c != colorStateList) {
            hVar.f3726c = colorStateList;
            this.f3700e = a(colorStateList, hVar.f3727d);
            invalidateSelf();
        }
    }

    @Override // d.g.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, mode);
            return;
        }
        C0116h hVar = this.f3699d;
        if (hVar.f3727d != mode) {
            hVar.f3727d = mode;
            this.f3700e = a(hVar.f3726c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

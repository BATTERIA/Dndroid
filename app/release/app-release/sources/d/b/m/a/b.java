package d.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import d.b.m.a.d;

public class b extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: collision with root package name */
    public c f2723c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f2724d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2725e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2726f;

    /* renamed from: g  reason: collision with root package name */
    public int f2727g = 255;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2728h;
    public int i = -1;
    public boolean j;
    public Runnable k;
    public long l;
    public long m;
    public C0089b n;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: d.b.m.a.b$b  reason: collision with other inner class name */
    public static class C0089b implements Drawable.Callback {

        /* renamed from: c  reason: collision with root package name */
        public Drawable.Callback f2730c;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2730c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2730c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    public c a() {
        throw null;
    }

    public final void a(Drawable drawable) {
        if (this.n == null) {
            this.n = new C0089b();
        }
        C0089b bVar = this.n;
        bVar.f2730c = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f2723c.A <= 0 && this.f2728h) {
                drawable.setAlpha(this.f2727g);
            }
            if (this.f2723c.E) {
                drawable.setColorFilter(this.f2723c.D);
            } else {
                if (this.f2723c.H) {
                    c.a.a.a.a.a(drawable, this.f2723c.F);
                }
                if (this.f2723c.I) {
                    c.a.a.a.a.a(drawable, this.f2723c.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2723c.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f2723c.C);
            Rect rect = this.f2724d;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0089b bVar2 = this.n;
            Drawable.Callback callback = bVar2.f2730c;
            bVar2.f2730c = null;
            drawable.setCallback(callback);
        }
    }

    public void a(c cVar) {
        this.f2723c = cVar;
        int i2 = this.i;
        if (i2 >= 0) {
            Drawable a2 = cVar.a(i2);
            this.f2725e = a2;
            if (a2 != null) {
                a(a2);
            }
        }
        this.f2726f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.m.a.b.a(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.m.a.b.a(int):boolean");
    }

    public boolean canApplyTheme() {
        return this.f2723c.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2726f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f2727g;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2723c.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f2723c.a()) {
            return null;
        }
        this.f2723c.f2733d = getChangingConfigurations();
        return this.f2723c;
    }

    public Drawable getCurrent() {
        return this.f2725e;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2724d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        c cVar = this.f2723c;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        c cVar = this.f2723c;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        c cVar = this.f2723c;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        c cVar = this.f2723c;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2725e;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f2723c;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i3 = cVar.f2737h;
        Drawable[] drawableArr = cVar.f2736g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        cVar.s = i2;
        cVar.r = true;
        return i2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        c cVar = this.f2723c;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.i) {
            if (cVar.k != null || cVar.j) {
                rect2 = cVar.k;
            } else {
                cVar.c();
                Rect rect3 = new Rect();
                int i2 = cVar.f2737h;
                Drawable[] drawableArr = cVar.f2736g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect3.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect3.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect3.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect3.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.j = true;
                cVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f2725e;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.f2723c.C || getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f2723c;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable == this.f2725e && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2723c.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2726f;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2726f = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2725e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2728h) {
                this.f2725e.setAlpha(this.f2727g);
            }
        }
        if (this.m != 0) {
            this.m = 0;
            z = true;
        }
        if (this.l != 0) {
            this.l = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.j && super.mutate() == this) {
            c a2 = a();
            a2.d();
            a(a2);
            this.j = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2726f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2725e;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        c cVar = this.f2723c;
        int i3 = this.i;
        int i4 = cVar.f2737h;
        Drawable[] drawableArr = cVar.f2736g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z = layoutDirection;
                }
            }
        }
        cVar.z = i2;
        return z;
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f2726f;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2725e;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f2725e && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f2728h || this.f2727g != i2) {
            this.f2728h = true;
            this.f2727g = i2;
            Drawable drawable = this.f2725e;
            if (drawable == null) {
                return;
            }
            if (this.l == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.f2723c;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f2725e;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f2723c;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f2725e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.f2723c;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f2725e;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2724d;
        if (rect == null) {
            this.f2724d = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2725e;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f2723c;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            c.a.a.a.a.a(this.f2725e, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2723c;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            c.a.a.a.a.a(this.f2725e, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2726f;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2725e;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2725e && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f2731a;
        public Resources b;

        /* renamed from: c  reason: collision with root package name */
        public int f2732c = 160;

        /* renamed from: d  reason: collision with root package name */
        public int f2733d;

        /* renamed from: e  reason: collision with root package name */
        public int f2734e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f2735f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f2736g;

        /* renamed from: h  reason: collision with root package name */
        public int f2737h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public c(c cVar, b bVar, Resources resources) {
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f2731a = bVar;
            this.b = resources != null ? resources : cVar != null ? cVar.b : null;
            int a2 = b.a(resources, cVar != null ? cVar.f2732c : 0);
            this.f2732c = a2;
            if (cVar != null) {
                this.f2733d = cVar.f2733d;
                this.f2734e = cVar.f2734e;
                this.v = true;
                this.w = true;
                this.i = cVar.i;
                this.l = cVar.l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f2732c == a2) {
                    if (cVar.j) {
                        this.k = new Rect(cVar.k);
                        this.j = true;
                    }
                    if (cVar.m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.f2736g;
                this.f2736g = new Drawable[drawableArr.length];
                this.f2737h = cVar.f2737h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f2735f;
                this.f2735f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2737h);
                int i2 = this.f2737h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f2735f.put(i3, constantState);
                        } else {
                            this.f2736g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f2736g = new Drawable[10];
            this.f2737h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2737h;
            if (i2 >= this.f2736g.length) {
                int i3 = i2 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                System.arraycopy(aVar.f2736g, 0, drawableArr, 0, i2);
                aVar.f2736g = drawableArr;
                int[][] iArr = new int[i3][];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2731a);
            this.f2736g[i2] = drawable;
            this.f2737h++;
            this.f2734e = drawable.getChangingConfigurations() | this.f2734e;
            this.r = false;
            this.t = false;
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        public final void a(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int a2 = b.a(resources, this.f2732c);
                int i2 = this.f2732c;
                this.f2732c = a2;
                if (i2 != a2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            c();
            this.v = true;
            int i2 = this.f2737h;
            Drawable[] drawableArr = this.f2736g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        public void b() {
            this.m = true;
            c();
            int i2 = this.f2737h;
            Drawable[] drawableArr = this.f2736g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2735f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f2735f.keyAt(i2);
                    Drawable[] drawableArr = this.f2736g;
                    Drawable newDrawable = this.f2735f.valueAt(i2).newDrawable(this.b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f2731a);
                    drawableArr[keyAt] = mutate;
                }
                this.f2735f = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.f2737h;
            Drawable[] drawableArr = this.f2736g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2735f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public abstract void d();

        public int getChangingConfigurations() {
            return this.f2733d | this.f2734e;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.f2736g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2735f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f2735f.valueAt(indexOfKey).newDrawable(this.b);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f2731a);
            this.f2736g[i2] = mutate;
            this.f2735f.removeAt(indexOfKey);
            if (this.f2735f.size() == 0) {
                this.f2735f = null;
            }
            return mutate;
        }
    }
}

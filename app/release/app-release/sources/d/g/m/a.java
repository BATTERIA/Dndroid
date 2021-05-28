package d.g.m;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import d.g.l.p;

public abstract class a implements View.OnTouchListener {
    public static final int s = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: collision with root package name */
    public final C0107a f3373c = new C0107a();

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f3374d = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    public final View f3375e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f3376f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3377g = {0.0f, 0.0f};

    /* renamed from: h  reason: collision with root package name */
    public float[] f3378h = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int i;
    public int j;
    public float[] k = {0.0f, 0.0f};
    public float[] l = {0.0f, 0.0f};
    public float[] m = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* renamed from: d.g.m.a$a  reason: collision with other inner class name */
    public static class C0107a {

        /* renamed from: a  reason: collision with root package name */
        public int f3379a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public float f3380c;

        /* renamed from: d  reason: collision with root package name */
        public float f3381d;

        /* renamed from: e  reason: collision with root package name */
        public long f3382e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f3383f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f3384g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3385h = 0;
        public long i = -1;
        public float j;
        public int k;

        public final float a(long j2) {
            if (j2 < this.f3382e) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return a.a(((float) (j2 - this.f3382e)) / ((float) this.f3379a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.j;
            return (a.a(((float) j4) / ((float) this.k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.q) {
                if (aVar.o) {
                    aVar.o = false;
                    C0107a aVar2 = aVar.f3373c;
                    if (aVar2 != null) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f3382e = currentAnimationTimeMillis;
                        aVar2.i = -1;
                        aVar2.f3383f = currentAnimationTimeMillis;
                        aVar2.j = 0.5f;
                        aVar2.f3384g = 0;
                        aVar2.f3385h = 0;
                    } else {
                        throw null;
                    }
                }
                C0107a aVar3 = a.this.f3373c;
                if ((aVar3.i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.i + ((long) aVar3.k)) || !a.this.b()) {
                    a.this.q = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.p) {
                    aVar4.p = false;
                    if (aVar4 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar4.f3375e.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        throw null;
                    }
                }
                if (aVar3.f3383f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f3383f = currentAnimationTimeMillis2;
                    float f2 = ((float) (currentAnimationTimeMillis2 - aVar3.f3383f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2));
                    aVar3.f3384g = (int) (aVar3.f3380c * f2);
                    int i = (int) (f2 * aVar3.f3381d);
                    aVar3.f3385h = i;
                    ((c) a.this).t.scrollListBy(i);
                    p.a(a.this.f3375e, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        this.f3375e = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.m;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.l;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.i = 1;
        float[] fArr3 = this.f3378h;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3377g;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.k;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.j = s;
        C0107a aVar = this.f3373c;
        aVar.f3379a = 500;
        aVar.b = 500;
    }

    public static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public final float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.i;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.q || this.i != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3377g
            r0 = r0[r4]
            float[] r1 = r3.f3378h
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r1 = r3.a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f3374d
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f3374d
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.k
            r6 = r6[r4]
            float[] r0 = r3.l
            r0 = r0[r4]
            float[] r1 = r3.m
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.m.a.a(int, float, float, float):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r9 = this;
            d.g.m.a$a r0 = r9.f3373c
            float r1 = r0.f3381d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f3380c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            d.g.m.c r4 = (d.g.m.c) r4
            android.widget.ListView r4 = r4.t
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.m.a.b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.m.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a() {
        int i2 = 0;
        if (this.o) {
            this.q = false;
            return;
        }
        C0107a aVar = this.f3373c;
        if (aVar != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i3 = (int) (currentAnimationTimeMillis - aVar.f3382e);
            int i4 = aVar.b;
            if (i3 > i4) {
                i2 = i4;
            } else if (i3 >= 0) {
                i2 = i3;
            }
            aVar.k = i2;
            aVar.j = aVar.a(currentAnimationTimeMillis);
            aVar.i = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }
}

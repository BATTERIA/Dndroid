package e.i.a.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.Scroller;
import android.widget.TextView;
import d.g.l.p;

@SuppressLint({"RestrictedApi"})
public class a extends ViewGroup implements e.i.a.a.a.b.f, d.g.l.j {
    public static e.i.a.a.a.e.b P0;
    public static e.i.a.a.a.e.c Q0;
    public static e.i.a.a.a.e.d R0;
    public static ViewGroup.MarginLayoutParams S0 = new ViewGroup.MarginLayoutParams(-1, -1);
    public VelocityTracker A;
    public Handler A0;
    public Interpolator B;
    public e.i.a.a.a.b.e B0;
    public int[] C;
    public e.i.a.a.a.c.b C0;
    public boolean D = true;
    public e.i.a.a.a.c.b D0;
    public boolean E = false;
    public long E0;
    public boolean F = true;
    public int F0;
    public boolean G = true;
    public int G0;
    public boolean H = true;
    public boolean H0;
    public boolean I = true;
    public boolean I0;
    public boolean J = false;
    public boolean J0;
    public boolean K = true;
    public boolean K0;
    public boolean L = true;
    public boolean L0;
    public boolean M = false;
    public MotionEvent M0;
    public boolean N = true;
    public Runnable N0;
    public boolean O = false;
    public ValueAnimator O0;
    public boolean P = true;
    public boolean Q = true;
    public boolean R = true;
    public boolean S = true;
    public boolean T = false;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public boolean a0 = false;
    public boolean b0 = false;

    /* renamed from: c  reason: collision with root package name */
    public int f4847c;
    public boolean c0 = false;

    /* renamed from: d  reason: collision with root package name */
    public int f4848d;
    public e.i.a.a.a.e.f d0;

    /* renamed from: e  reason: collision with root package name */
    public int f4849e;
    public e.i.a.a.a.e.f e0;

    /* renamed from: f  reason: collision with root package name */
    public int f4850f;
    public e.i.a.a.a.e.e f0;

    /* renamed from: g  reason: collision with root package name */
    public int f4851g = 300;
    public int g0;

    /* renamed from: h  reason: collision with root package name */
    public int f4852h = 300;
    public boolean h0;
    public int i;
    public int[] i0 = new int[2];
    public float j;
    public d.g.l.g j0 = new d.g.l.g(this);
    public float k;
    public d.g.l.k k0 = new d.g.l.k();
    public float l;
    public int l0;
    public float m;
    public e.i.a.a.a.c.a m0;
    public float n = 0.5f;
    public int n0;
    public char o = 'n';
    public e.i.a.a.a.c.a o0;
    public boolean p;
    public int p0;
    public boolean q;
    public int q0;
    public boolean r;
    public float r0;
    public int s = -1;
    public float s0;
    public int t = -1;
    public float t0;
    public int u = -1;
    public float u0;
    public int v = -1;
    public float v0;
    public int w;
    public e.i.a.a.a.b.a w0;
    public int x;
    public e.i.a.a.a.b.a x0;
    public int y;
    public e.i.a.a.a.b.b y0;
    public Scroller z;
    public Paint z0;

    /* renamed from: e.i.a.a.a.a$a  reason: collision with other inner class name */
    public class C0146a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4853a;

        public C0146a(boolean z) {
            this.f4853a = z;
        }

        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                a.this.setStateDirectLoading(this.f4853a);
            }
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4854a;

        public b(boolean z) {
            this.f4854a = z;
        }

        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                a.this.E0 = System.currentTimeMillis();
                a.this.a(e.i.a.a.a.c.b.Refreshing);
                a aVar = a.this;
                e.i.a.a.a.e.f fVar = aVar.d0;
                if (fVar != null) {
                    if (this.f4854a) {
                        fVar.b(aVar);
                    }
                } else if (aVar.f0 == null) {
                    aVar.a(3000);
                }
                a aVar2 = a.this;
                e.i.a.a.a.b.a aVar3 = aVar2.w0;
                if (aVar3 != null) {
                    int i = aVar2.l0;
                    aVar3.b(aVar2, i, (int) (aVar2.r0 * ((float) i)));
                }
                a aVar4 = a.this;
                e.i.a.a.a.e.e eVar = aVar4.f0;
                if (eVar != null && (aVar4.w0 instanceof e.i.a.a.a.b.d)) {
                    if (this.f4854a) {
                        eVar.b(aVar4);
                    }
                    a aVar5 = a.this;
                    int i2 = aVar5.l0;
                    aVar5.f0.a((e.i.a.a.a.b.d) aVar5.w0, i2, (int) (aVar5.r0 * ((float) i2)));
                }
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            e.i.a.a.a.c.b bVar;
            e.i.a.a.a.c.b bVar2;
            if (animator == null || animator.getDuration() != 0) {
                a aVar = a.this;
                aVar.O0 = null;
                if (aVar.f4848d != 0 || (bVar = aVar.C0) == (bVar2 = e.i.a.a.a.c.b.None) || bVar.f4896g || bVar.f4895f) {
                    a aVar2 = a.this;
                    e.i.a.a.a.c.b bVar3 = aVar2.C0;
                    if (bVar3 != aVar2.D0) {
                        aVar2.setViceState(bVar3);
                        return;
                    }
                    return;
                }
                aVar.a(bVar2);
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((k) a.this.B0).a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            a aVar = a.this;
            e.i.a.a.a.e.f fVar = aVar.e0;
            if (fVar != null) {
                fVar.a(aVar);
            } else if (aVar.f0 == null) {
                aVar.a(2000, true, false);
            }
            a aVar2 = a.this;
            e.i.a.a.a.e.e eVar = aVar2.f0;
            if (eVar != null) {
                eVar.a(aVar2);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f4858c = 0;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f4859d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Boolean f4860e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f4861f;

        public f(int i, Boolean bool, boolean z) {
            this.f4859d = i;
            this.f4860e = bool;
            this.f4861f = z;
        }

        public void run() {
            e.i.a.a.a.c.b bVar;
            a aVar;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (this.f4858c == 0) {
                a aVar2 = a.this;
                if (aVar2.C0 == e.i.a.a.a.c.b.None && aVar2.D0 == e.i.a.a.a.c.b.Refreshing) {
                    aVar2.D0 = e.i.a.a.a.c.b.None;
                } else {
                    a aVar3 = a.this;
                    if (aVar3.O0 != null) {
                        e.i.a.a.a.c.b bVar2 = aVar3.C0;
                        if (bVar2.f4892c && (bVar2.f4895f || bVar2 == e.i.a.a.a.c.b.RefreshReleased)) {
                            a.this.O0.setDuration(0L);
                            a.this.O0.cancel();
                            a aVar4 = a.this;
                            aVar4.O0 = null;
                            if (((k) aVar4.B0).a(0) == null) {
                                aVar = a.this;
                                bVar = e.i.a.a.a.c.b.None;
                            } else {
                                aVar = a.this;
                                bVar = e.i.a.a.a.c.b.PullDownCanceled;
                            }
                            aVar.a(bVar);
                        }
                    }
                    a aVar5 = a.this;
                    if (!(aVar5.C0 != e.i.a.a.a.c.b.Refreshing || aVar5.w0 == null || aVar5.y0 == null)) {
                        this.f4858c++;
                        aVar5.A0.postDelayed(this, (long) this.f4859d);
                        a.this.a(e.i.a.a.a.c.b.RefreshFinish);
                        if (this.f4860e == Boolean.FALSE) {
                            a.this.d(false);
                        }
                    }
                }
                if (this.f4860e == Boolean.TRUE) {
                    a.this.d(true);
                    return;
                }
                return;
            }
            a aVar6 = a.this;
            int a2 = aVar6.w0.a(aVar6, this.f4861f);
            a aVar7 = a.this;
            e.i.a.a.a.e.e eVar = aVar7.f0;
            if (eVar != null) {
                e.i.a.a.a.b.a aVar8 = aVar7.w0;
                if (aVar8 instanceof e.i.a.a.a.b.d) {
                    eVar.a((e.i.a.a.a.b.d) aVar8, this.f4861f);
                }
            }
            if (a2 < Integer.MAX_VALUE) {
                a aVar9 = a.this;
                if (aVar9.p || aVar9.h0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a aVar10 = a.this;
                    if (aVar10.p) {
                        float f2 = aVar10.m;
                        aVar10.k = f2;
                        aVar10.f4850f = 0;
                        aVar10.p = false;
                        a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, aVar10.l, (f2 + ((float) aVar10.f4848d)) - ((float) (aVar10.f4847c * 2)), 0));
                        a aVar11 = a.this;
                        a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, aVar11.l, aVar11.m + ((float) aVar11.f4848d), 0));
                    }
                    a aVar12 = a.this;
                    if (aVar12.h0) {
                        aVar12.g0 = 0;
                        a.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, aVar12.l, aVar12.m, 0));
                        a aVar13 = a.this;
                        aVar13.h0 = false;
                        aVar13.f4850f = 0;
                    }
                }
                a aVar14 = a.this;
                int i = aVar14.f4848d;
                if (i > 0) {
                    ValueAnimator a3 = aVar14.a(0, a2, aVar14.B, aVar14.f4852h);
                    a aVar15 = a.this;
                    if (aVar15.Q) {
                        animatorUpdateListener = ((e.i.a.a.a.h.a) aVar15.y0).a(aVar15.f4848d);
                    }
                    if (a3 != null && animatorUpdateListener != null) {
                        a3.addUpdateListener(animatorUpdateListener);
                    }
                } else if (i < 0) {
                    aVar14.a(0, a2, aVar14.B, aVar14.f4852h);
                } else {
                    ((k) aVar14.B0).a(0, false);
                    ((k) a.this.B0).a(e.i.a.a.a.c.b.None);
                }
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f4863c = 0;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f4864d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f4865e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f4866f;

        /* renamed from: e.i.a.a.a.a$g$a  reason: collision with other inner class name */
        public class RunnableC0147a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f4868c;

            /* renamed from: e.i.a.a.a.a$g$a$a  reason: collision with other inner class name */
            public class C0148a extends AnimatorListenerAdapter {
                public C0148a() {
                }

                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        g gVar = g.this;
                        a aVar = a.this;
                        aVar.K0 = false;
                        if (gVar.f4865e) {
                            aVar.d(true);
                        }
                        a aVar2 = a.this;
                        if (aVar2.C0 == e.i.a.a.a.c.b.LoadFinish) {
                            aVar2.a(e.i.a.a.a.c.b.None);
                        }
                    }
                }
            }

            public RunnableC0147a(int i) {
                this.f4868c = i;
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 176
                */
                throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.g.RunnableC0147a.run():void");
            }
        }

        public g(int i, boolean z, boolean z2) {
            this.f4864d = i;
            this.f4865e = z;
            this.f4866f = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
            if (((e.i.a.a.a.h.a) r6.y0).a() != false) goto L_0x00c9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 352
            */
            throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.g.run():void");
        }
    }

    public class h implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f4871c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4872d = 10;

        /* renamed from: e  reason: collision with root package name */
        public int f4873e;

        /* renamed from: f  reason: collision with root package name */
        public long f4874f;

        /* renamed from: g  reason: collision with root package name */
        public float f4875g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f4876h;

        public h(float f2, int i2) {
            this.f4876h = f2;
            this.f4873e = i2;
            this.f4874f = AnimationUtils.currentAnimationTimeMillis();
            a.this.A0.postDelayed(this, (long) this.f4872d);
            int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            ((k) a.this.B0).a(i3 > 0 ? e.i.a.a.a.c.b.PullDownToRefresh : e.i.a.a.a.c.b.PullUpToLoad);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.h.run():void");
        }
    }

    public class i implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f4877c;

        /* renamed from: d  reason: collision with root package name */
        public int f4878d = 10;

        /* renamed from: e  reason: collision with root package name */
        public float f4879e;

        /* renamed from: f  reason: collision with root package name */
        public float f4880f = 0.98f;

        /* renamed from: g  reason: collision with root package name */
        public long f4881g = 0;

        /* renamed from: h  reason: collision with root package name */
        public long f4882h = AnimationUtils.currentAnimationTimeMillis();

        public i(float f2) {
            this.f4879e = f2;
            this.f4877c = a.this.f4848d;
        }

        public void run() {
            a aVar = a.this;
            if (aVar.N0 == this && !aVar.C0.f4897h) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                double d2 = (double) this.f4879e;
                double pow = Math.pow((double) this.f4880f, (double) (((float) (currentAnimationTimeMillis - this.f4881g)) / (1000.0f / ((float) this.f4878d))));
                Double.isNaN(d2);
                Double.isNaN(d2);
                float f2 = (float) (pow * d2);
                this.f4879e = f2;
                float f3 = ((((float) (currentAnimationTimeMillis - this.f4882h)) * 1.0f) / 1000.0f) * f2;
                if (Math.abs(f3) > 1.0f) {
                    this.f4882h = currentAnimationTimeMillis;
                    int i2 = (int) (((float) this.f4877c) + f3);
                    this.f4877c = i2;
                    a aVar2 = a.this;
                    if (aVar2.f4848d * i2 > 0) {
                        ((k) aVar2.B0).a(i2, true);
                        a.this.A0.postDelayed(this, (long) this.f4878d);
                        return;
                    }
                    aVar2.N0 = null;
                    ((k) aVar2.B0).a(0, true);
                    e.i.a.a.a.g.b.a(((e.i.a.a.a.h.a) a.this.y0).f4915c, (int) (-this.f4879e));
                    a aVar3 = a.this;
                    if (aVar3.K0 && f3 > 0.0f) {
                        aVar3.K0 = false;
                        return;
                    }
                    return;
                }
                a.this.N0 = null;
            }
        }
    }

    public static class j extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4883a = 0;
        public e.i.a.a.a.c.c b = null;

        public j(int i, int i2) {
            super(i, i2);
        }

        public j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.a.a.d.c.SmartRefreshLayout_Layout);
            this.f4883a = obtainStyledAttributes.getColor(e.i.a.a.a.d.c.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f4883a);
            if (obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_Layout_layout_srlSpinnerStyle)) {
                this.b = e.i.a.a.a.c.c.i[obtainStyledAttributes.getInt(e.i.a.a.a.d.c.SmartRefreshLayout_Layout_layout_srlSpinnerStyle, e.i.a.a.a.c.c.f4898d.f4903a)];
            }
            obtainStyledAttributes.recycle();
        }
    }

    public class k implements e.i.a.a.a.b.e {
        public k() {
        }

        public ValueAnimator a(int i) {
            a aVar = a.this;
            return aVar.a(i, 0, aVar.B, aVar.f4852h);
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e.i.a.a.a.b.e a(int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 909
            */
            throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.k.a(int, boolean):e.i.a.a.a.b.e");
        }

        public e.i.a.a.a.b.e a(e.i.a.a.a.c.b bVar) {
            a aVar;
            e.i.a.a.a.c.b bVar2;
            a aVar2;
            e.i.a.a.a.c.b bVar3;
            a aVar3;
            e.i.a.a.a.c.b bVar4;
            switch (bVar.ordinal()) {
                case 0:
                    a aVar4 = a.this;
                    e.i.a.a.a.c.b bVar5 = aVar4.C0;
                    e.i.a.a.a.c.b bVar6 = e.i.a.a.a.c.b.None;
                    if (bVar5 != bVar6 && aVar4.f4848d == 0) {
                        aVar4.a(bVar6);
                        return null;
                    } else if (a.this.f4848d == 0) {
                        return null;
                    } else {
                        a(0);
                        return null;
                    }
                case 1:
                    a aVar5 = a.this;
                    if (aVar5.C0.f4896g || !aVar5.b(aVar5.D)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.PullDownToRefresh;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar2 = a.this;
                    bVar3 = e.i.a.a.a.c.b.PullDownToRefresh;
                    aVar2.a(bVar3);
                    return null;
                case 2:
                    a aVar6 = a.this;
                    if (aVar6.b(aVar6.E)) {
                        a aVar7 = a.this;
                        e.i.a.a.a.c.b bVar7 = aVar7.C0;
                        if (!bVar7.f4896g && !bVar7.f4897h && (!aVar7.V || !aVar7.J || !aVar7.W)) {
                            aVar2 = a.this;
                            bVar3 = e.i.a.a.a.c.b.PullUpToLoad;
                            aVar2.a(bVar3);
                            return null;
                        }
                    }
                    aVar = a.this;
                    bVar2 = e.i.a.a.a.c.b.PullUpToLoad;
                    aVar.setViceState(bVar2);
                    return null;
                case 3:
                    a aVar8 = a.this;
                    if (aVar8.C0.f4896g || !aVar8.b(aVar8.D)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.PullDownCanceled;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar3 = a.this;
                    bVar4 = e.i.a.a.a.c.b.PullDownCanceled;
                    aVar3.a(bVar4);
                    a(e.i.a.a.a.c.b.None);
                    return null;
                case 4:
                    a aVar9 = a.this;
                    if (aVar9.b(aVar9.E)) {
                        a aVar10 = a.this;
                        if (!aVar10.C0.f4896g && (!aVar10.V || !aVar10.J || !aVar10.W)) {
                            aVar3 = a.this;
                            bVar4 = e.i.a.a.a.c.b.PullUpCanceled;
                            aVar3.a(bVar4);
                            a(e.i.a.a.a.c.b.None);
                            return null;
                        }
                    }
                    aVar = a.this;
                    bVar2 = e.i.a.a.a.c.b.PullUpCanceled;
                    aVar.setViceState(bVar2);
                    return null;
                case 5:
                    a aVar11 = a.this;
                    if (aVar11.C0.f4896g || !aVar11.b(aVar11.D)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.ReleaseToRefresh;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar2 = a.this;
                    bVar3 = e.i.a.a.a.c.b.ReleaseToRefresh;
                    aVar2.a(bVar3);
                    return null;
                case 6:
                    a aVar12 = a.this;
                    if (aVar12.b(aVar12.E)) {
                        a aVar13 = a.this;
                        e.i.a.a.a.c.b bVar8 = aVar13.C0;
                        if (!bVar8.f4896g && !bVar8.f4897h && (!aVar13.V || !aVar13.J || !aVar13.W)) {
                            aVar2 = a.this;
                            bVar3 = e.i.a.a.a.c.b.ReleaseToLoad;
                            aVar2.a(bVar3);
                            return null;
                        }
                    }
                    aVar = a.this;
                    bVar2 = e.i.a.a.a.c.b.ReleaseToLoad;
                    aVar.setViceState(bVar2);
                    return null;
                case 7:
                    a aVar14 = a.this;
                    if (aVar14.C0.f4896g || !aVar14.b(aVar14.D)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.ReleaseToTwoLevel;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar2 = a.this;
                    bVar3 = e.i.a.a.a.c.b.ReleaseToTwoLevel;
                    aVar2.a(bVar3);
                    return null;
                case 8:
                default:
                    a.this.a(bVar);
                    return null;
                case 9:
                    a aVar15 = a.this;
                    if (aVar15.C0.f4896g || !aVar15.b(aVar15.D)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.RefreshReleased;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar2 = a.this;
                    bVar3 = e.i.a.a.a.c.b.RefreshReleased;
                    aVar2.a(bVar3);
                    return null;
                case 10:
                    a aVar16 = a.this;
                    if (aVar16.C0.f4896g || !aVar16.b(aVar16.E)) {
                        aVar = a.this;
                        bVar2 = e.i.a.a.a.c.b.LoadReleased;
                        aVar.setViceState(bVar2);
                        return null;
                    }
                    aVar2 = a.this;
                    bVar3 = e.i.a.a.a.c.b.LoadReleased;
                    aVar2.a(bVar3);
                    return null;
                case 11:
                    a.this.setStateRefreshing(true);
                    return null;
                case 12:
                    a.this.setStateLoading(true);
                    return null;
            }
        }
    }

    public a(Context context) {
        super(context, null);
        e.i.a.a.a.c.a aVar = e.i.a.a.a.c.a.f4885c;
        this.m0 = aVar;
        this.o0 = aVar;
        this.r0 = 2.5f;
        this.s0 = 2.5f;
        this.t0 = 1.0f;
        this.u0 = 1.0f;
        this.v0 = 0.16666667f;
        this.B0 = new k();
        e.i.a.a.a.c.b bVar = e.i.a.a.a.c.b.None;
        this.C0 = bVar;
        this.D0 = bVar;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.K0 = false;
        this.L0 = false;
        this.M0 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0 = new Handler(Looper.getMainLooper());
        this.z = new Scroller(context);
        this.A = VelocityTracker.obtain();
        this.i = context.getResources().getDisplayMetrics().heightPixels;
        this.B = new e.i.a.a.a.g.b(e.i.a.a.a.g.b.b);
        this.f4847c = viewConfiguration.getScaledTouchSlop();
        this.w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.x = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n0 = e.i.a.a.a.g.b.a(60.0f);
        this.l0 = e.i.a.a.a.g.b.a(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e.i.a.a.a.d.c.SmartRefreshLayout);
        if (!obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        e.i.a.a.a.e.d dVar = R0;
        if (dVar != null) {
            dVar.a(context, this);
        }
        this.n = obtainStyledAttributes.getFloat(e.i.a.a.a.d.c.SmartRefreshLayout_srlDragRate, this.n);
        this.r0 = obtainStyledAttributes.getFloat(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderMaxDragRate, this.r0);
        this.s0 = obtainStyledAttributes.getFloat(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterMaxDragRate, this.s0);
        this.t0 = obtainStyledAttributes.getFloat(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderTriggerRate, this.t0);
        this.u0 = obtainStyledAttributes.getFloat(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterTriggerRate, this.u0);
        this.D = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableRefresh, this.D);
        this.f4852h = obtainStyledAttributes.getInt(e.i.a.a.a.d.c.SmartRefreshLayout_srlReboundDuration, this.f4852h);
        this.E = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableLoadMore, this.E);
        this.l0 = obtainStyledAttributes.getDimensionPixelOffset(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderHeight, this.l0);
        this.n0 = obtainStyledAttributes.getDimensionPixelOffset(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterHeight, this.n0);
        this.p0 = obtainStyledAttributes.getDimensionPixelOffset(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderInsetStart, this.p0);
        this.q0 = obtainStyledAttributes.getDimensionPixelOffset(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterInsetStart, this.q0);
        this.T = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlDisableContentWhenRefresh, this.T);
        this.U = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlDisableContentWhenLoading, this.U);
        this.H = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableHeaderTranslationContent, this.H);
        this.I = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableFooterTranslationContent, this.I);
        this.K = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnablePreviewInEditMode, this.K);
        this.N = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableAutoLoadMore, this.N);
        this.L = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableOverScrollBounce, this.L);
        this.O = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnablePureScrollMode, this.O);
        this.P = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.P);
        this.Q = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.Q);
        this.R = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.R);
        boolean z2 = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.J);
        this.J = z2;
        this.J = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z2);
        this.F = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.F);
        this.G = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.G);
        this.M = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableOverScrollDrag, this.M);
        this.s = obtainStyledAttributes.getResourceId(e.i.a.a.a.d.c.SmartRefreshLayout_srlFixedHeaderViewId, this.s);
        this.t = obtainStyledAttributes.getResourceId(e.i.a.a.a.d.c.SmartRefreshLayout_srlFixedFooterViewId, this.t);
        this.u = obtainStyledAttributes.getResourceId(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderTranslationViewId, this.u);
        this.v = obtainStyledAttributes.getResourceId(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterTranslationViewId, this.v);
        boolean z3 = obtainStyledAttributes.getBoolean(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableNestedScrolling, this.S);
        this.S = z3;
        this.j0.a(z3);
        this.a0 = this.a0 || obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableLoadMore);
        this.b0 = this.b0 || obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableHeaderTranslationContent);
        this.c0 = this.c0 || obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_srlEnableFooterTranslationContent);
        this.m0 = obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_srlHeaderHeight) ? e.i.a.a.a.c.a.i : this.m0;
        this.o0 = obtainStyledAttributes.hasValue(e.i.a.a.a.d.c.SmartRefreshLayout_srlFooterHeight) ? e.i.a.a.a.c.a.i : this.o0;
        int color = obtainStyledAttributes.getColor(e.i.a.a.a.d.c.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = obtainStyledAttributes.getColor(e.i.a.a.a.d.c.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.C = new int[]{color2, color};
            } else {
                this.C = new int[]{color2};
            }
        } else if (color != 0) {
            this.C = new int[]{0, color};
        }
        if (this.O && !this.a0 && !this.E) {
            this.E = true;
        }
        obtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(e.i.a.a.a.e.b bVar) {
        P0 = bVar;
    }

    public static void setDefaultRefreshHeaderCreator(e.i.a.a.a.e.c cVar) {
        Q0 = cVar;
    }

    public static void setDefaultRefreshInitializer(e.i.a.a.a.e.d dVar) {
        R0 = dVar;
    }

    public ValueAnimator a(int i2, int i3, Interpolator interpolator, int i4) {
        if (this.f4848d == i2) {
            return null;
        }
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        this.N0 = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f4848d, i2);
        this.O0 = ofInt;
        ofInt.setDuration((long) i4);
        this.O0.setInterpolator(interpolator);
        this.O0.addListener(new c());
        this.O0.addUpdateListener(new d());
        this.O0.setStartDelay((long) i3);
        this.O0.start();
        return this.O0;
    }

    public e.i.a.a.a.b.f a() {
        a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, false);
        return this;
    }

    public e.i.a.a.a.b.f a(int i2) {
        a(i2, true, Boolean.FALSE);
        return this;
    }

    public e.i.a.a.a.b.f a(int i2, boolean z2, Boolean bool) {
        int i3 = i2 >> 16;
        int i4 = (i2 << 16) >> 16;
        f fVar = new f(i3, bool, z2);
        if (i4 > 0) {
            this.A0.postDelayed(fVar, (long) i4);
        } else {
            fVar.run();
        }
        return this;
    }

    public e.i.a.a.a.b.f a(int i2, boolean z2, boolean z3) {
        int i3 = i2 >> 16;
        int i4 = (i2 << 16) >> 16;
        g gVar = new g(i3, z3, z2);
        if (i4 > 0) {
            this.A0.postDelayed(gVar, (long) i4);
        } else {
            gVar.run();
        }
        return this;
    }

    @Override // e.i.a.a.a.b.f
    public e.i.a.a.a.b.f a(boolean z2) {
        setNestedScrollingEnabled(z2);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(float r18) {
        /*
        // Method dump skipped, instructions count: 553
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.a(float):void");
    }

    public void a(e.i.a.a.a.c.b bVar) {
        e.i.a.a.a.c.b bVar2 = this.C0;
        if (bVar2 != bVar) {
            this.C0 = bVar;
            this.D0 = bVar;
            e.i.a.a.a.b.a aVar = this.w0;
            e.i.a.a.a.b.a aVar2 = this.x0;
            if (aVar != null) {
                aVar.a(this, bVar2, bVar);
            }
            if (aVar2 != null) {
                aVar2.a(this, bVar2, bVar);
            }
            if (bVar == e.i.a.a.a.c.b.LoadFinish) {
                this.K0 = false;
            }
        } else if (this.D0 != bVar2) {
            this.D0 = bVar2;
        }
    }

    public boolean a(boolean z2, e.i.a.a.a.b.a aVar) {
        return z2 || this.O || aVar == null || aVar.getSpinnerStyle() == e.i.a.a.a.c.c.f4900f;
    }

    public e.i.a.a.a.b.f b() {
        a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, true);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ac, code lost:
        if (r14.f4848d >= (-r14.n0)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        if (r14.f4848d > r14.l0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0111, code lost:
        if (r2 < (-r14.n0)) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(float r14) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.b(float):boolean");
    }

    public boolean b(int i2) {
        e.i.a.a.a.b.e eVar;
        e.i.a.a.a.c.b bVar;
        if (i2 == 0) {
            if (this.O0 != null) {
                e.i.a.a.a.c.b bVar2 = this.C0;
                if (bVar2.f4897h || bVar2 == e.i.a.a.a.c.b.TwoLevelReleased || bVar2 == e.i.a.a.a.c.b.RefreshReleased || bVar2 == e.i.a.a.a.c.b.LoadReleased) {
                    return true;
                }
                if (bVar2 == e.i.a.a.a.c.b.PullDownCanceled) {
                    eVar = this.B0;
                    bVar = e.i.a.a.a.c.b.PullDownToRefresh;
                } else {
                    if (bVar2 == e.i.a.a.a.c.b.PullUpCanceled) {
                        eVar = this.B0;
                        bVar = e.i.a.a.a.c.b.PullUpToLoad;
                    }
                    this.O0.setDuration(0L);
                    this.O0.cancel();
                    this.O0 = null;
                }
                ((k) eVar).a(bVar);
                this.O0.setDuration(0L);
                this.O0.cancel();
                this.O0 = null;
            }
            this.N0 = null;
        }
        return this.O0 != null;
    }

    public boolean b(boolean z2) {
        return z2 && !this.O;
    }

    public e.i.a.a.a.b.f c(boolean z2) {
        this.a0 = true;
        this.E = z2;
        return this;
    }

    public void c() {
        int i2;
        e.i.a.a.a.b.e eVar;
        int i3;
        e.i.a.a.a.b.e eVar2;
        e.i.a.a.a.c.b bVar;
        e.i.a.a.a.c.b bVar2 = this.C0;
        if (bVar2 != e.i.a.a.a.c.b.TwoLevel) {
            if (bVar2 == e.i.a.a.a.c.b.Loading || (this.J && this.V && this.W && this.f4848d < 0 && b(this.E))) {
                int i4 = this.f4848d;
                i3 = this.n0;
                if (i4 < (-i3)) {
                    eVar = this.B0;
                } else {
                    if (i4 <= 0) {
                        return;
                    }
                    ((k) this.B0).a(0);
                    return;
                }
            } else {
                e.i.a.a.a.c.b bVar3 = this.C0;
                if (bVar3 == e.i.a.a.a.c.b.Refreshing) {
                    int i5 = this.f4848d;
                    i2 = this.l0;
                    if (i5 > i2) {
                        eVar = this.B0;
                        ((k) eVar).a(i2);
                    }
                    if (i5 >= 0) {
                        return;
                    }
                    ((k) this.B0).a(0);
                    return;
                }
                if (bVar3 == e.i.a.a.a.c.b.PullDownToRefresh) {
                    eVar2 = this.B0;
                    bVar = e.i.a.a.a.c.b.PullDownCanceled;
                } else if (bVar3 == e.i.a.a.a.c.b.PullUpToLoad) {
                    eVar2 = this.B0;
                    bVar = e.i.a.a.a.c.b.PullUpCanceled;
                } else if (bVar3 == e.i.a.a.a.c.b.ReleaseToRefresh) {
                    eVar2 = this.B0;
                    bVar = e.i.a.a.a.c.b.Refreshing;
                } else if (bVar3 == e.i.a.a.a.c.b.ReleaseToLoad) {
                    eVar2 = this.B0;
                    bVar = e.i.a.a.a.c.b.Loading;
                } else if (bVar3 == e.i.a.a.a.c.b.ReleaseToTwoLevel) {
                    eVar2 = this.B0;
                    bVar = e.i.a.a.a.c.b.TwoLevelReleased;
                } else if (bVar3 == e.i.a.a.a.c.b.RefreshReleased) {
                    if (this.O0 == null) {
                        eVar = this.B0;
                        i2 = this.l0;
                        ((k) eVar).a(i2);
                    }
                    return;
                } else if (bVar3 != e.i.a.a.a.c.b.LoadReleased) {
                    if (bVar3 == e.i.a.a.a.c.b.LoadFinish || this.f4848d == 0) {
                        return;
                    }
                    ((k) this.B0).a(0);
                    return;
                } else if (this.O0 == null) {
                    eVar = this.B0;
                    i3 = this.n0;
                } else {
                    return;
                }
                ((k) eVar2).a(bVar);
                return;
            }
            i2 = -i3;
            ((k) eVar).a(i2);
        } else if (this.y > -1000 && this.f4848d > getHeight() / 2) {
            ValueAnimator a2 = ((k) this.B0).a(getHeight());
            if (a2 != null) {
                a2.setDuration((long) this.f4851g);
            }
        } else if (this.p) {
            k kVar = (k) this.B0;
            a aVar = a.this;
            if (aVar.C0 == e.i.a.a.a.c.b.TwoLevel) {
                ((k) aVar.B0).a(e.i.a.a.a.c.b.TwoLevelFinish);
                if (a.this.f4848d == 0) {
                    kVar.a(0, false);
                    a.this.a(e.i.a.a.a.c.b.None);
                    return;
                }
                kVar.a(0).setDuration((long) a.this.f4851g);
            }
        }
    }

    public void computeScroll() {
        h hVar;
        e.i.a.a.a.c.b bVar;
        this.z.getCurrY();
        if (this.z.computeScrollOffset()) {
            int finalY = this.z.getFinalY();
            if ((finalY >= 0 || ((!this.D && !this.M) || !((e.i.a.a.a.h.a) this.y0).b())) && (finalY <= 0 || ((!this.E && !this.M) || !((e.i.a.a.a.h.a) this.y0).a()))) {
                this.L0 = true;
                invalidate();
                return;
            }
            if (this.L0) {
                float currVelocity = finalY > 0 ? -this.z.getCurrVelocity() : this.z.getCurrVelocity();
                if (this.O0 == null) {
                    if (currVelocity > 0.0f && ((bVar = this.C0) == e.i.a.a.a.c.b.Refreshing || bVar == e.i.a.a.a.c.b.TwoLevel)) {
                        hVar = new h(currVelocity, this.l0);
                    } else if (currVelocity < 0.0f && (this.C0 == e.i.a.a.a.c.b.Loading || ((this.J && this.V && this.W && b(this.E)) || (this.N && !this.V && b(this.E) && this.C0 != e.i.a.a.a.c.b.Refreshing)))) {
                        hVar = new h(currVelocity, -this.n0);
                    } else if (this.f4848d == 0 && this.L) {
                        hVar = new h(currVelocity, 0);
                    }
                    this.N0 = hVar;
                }
            }
            this.z.forceFinished(true);
        }
    }

    public e.i.a.a.a.b.f d(boolean z2) {
        if (this.C0 == e.i.a.a.a.c.b.Refreshing && z2) {
            a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E0))), 300) << 16, true, Boolean.TRUE);
        } else if (this.C0 == e.i.a.a.a.c.b.Loading && z2) {
            b();
        } else if (this.V != z2) {
            this.V = z2;
            e.i.a.a.a.b.a aVar = this.x0;
            if (aVar instanceof e.i.a.a.a.b.c) {
                if (((e.i.a.a.a.b.c) aVar).a(z2)) {
                    this.W = true;
                    if (this.V && this.J && this.f4848d > 0 && this.x0.getSpinnerStyle() == e.i.a.a.a.c.c.f4898d && b(this.E) && a(this.D, this.w0)) {
                        this.x0.getView().setTranslationY((float) this.f4848d);
                    }
                } else {
                    this.W = false;
                    StringBuilder a2 = e.a.a.a.a.a("Footer:");
                    a2.append(this.x0);
                    a2.append(" NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])");
                    new RuntimeException(a2.toString()).printStackTrace();
                }
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        if (r2.f4897h == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
        if (r22.C0.f4892c == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d8, code lost:
        if (r2.f4897h == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00de, code lost:
        if (r22.C0.f4893d == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010c, code lost:
        if (r6 != 3) goto L_0x0326;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 947
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        Paint paint;
        Paint paint2;
        e.i.a.a.a.b.b bVar = this.y0;
        View view2 = bVar != null ? ((e.i.a.a.a.h.a) bVar).f4914a : null;
        e.i.a.a.a.b.a aVar = this.w0;
        if (aVar != null && aVar.getView() == view) {
            if (!b(this.D) || (!this.K && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getPaddingTop() + view2.getTop() + this.f4848d, view.getTop());
                int i2 = this.F0;
                if (!(i2 == 0 || (paint2 = this.z0) == null)) {
                    paint2.setColor(i2);
                    if (this.w0.getSpinnerStyle().f4904c) {
                        max = view.getBottom();
                    } else if (this.w0.getSpinnerStyle() == e.i.a.a.a.c.c.f4898d) {
                        max = view.getBottom() + this.f4848d;
                    }
                    canvas.drawRect(0.0f, (float) view.getTop(), (float) getWidth(), (float) max, this.z0);
                }
                if ((this.F && this.w0.getSpinnerStyle() == e.i.a.a.a.c.c.f4900f) || this.w0.getSpinnerStyle().f4904c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        e.i.a.a.a.b.a aVar2 = this.x0;
        if (aVar2 != null && aVar2.getView() == view) {
            if (!b(this.E) || (!this.K && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f4848d, view.getBottom());
                int i3 = this.G0;
                if (!(i3 == 0 || (paint = this.z0) == null)) {
                    paint.setColor(i3);
                    if (this.x0.getSpinnerStyle().f4904c) {
                        min = view.getTop();
                    } else if (this.x0.getSpinnerStyle() == e.i.a.a.a.c.c.f4898d) {
                        min = view.getTop() + this.f4848d;
                    }
                    canvas.drawRect(0.0f, (float) min, (float) getWidth(), (float) view.getBottom(), this.z0);
                }
                if ((this.G && this.x0.getSpinnerStyle() == e.i.a.a.a.c.c.f4900f) || this.x0.getSpinnerStyle().f4904c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j(getContext(), attributeSet);
    }

    @Override // e.i.a.a.a.b.f
    public ViewGroup getLayout() {
        return this;
    }

    public int getNestedScrollAxes() {
        return this.k0.a();
    }

    public e.i.a.a.a.b.c getRefreshFooter() {
        e.i.a.a.a.b.a aVar = this.x0;
        if (aVar instanceof e.i.a.a.a.b.c) {
            return (e.i.a.a.a.b.c) aVar;
        }
        return null;
    }

    public e.i.a.a.a.b.d getRefreshHeader() {
        e.i.a.a.a.b.a aVar = this.w0;
        if (aVar instanceof e.i.a.a.a.b.d) {
            return (e.i.a.a.a.b.d) aVar;
        }
        return null;
    }

    public e.i.a.a.a.c.b getState() {
        return this.C0;
    }

    public boolean isNestedScrollingEnabled() {
        return this.S && (this.M || this.D || this.E);
    }

    public void onAttachedToWindow() {
        e.i.a.a.a.b.a aVar;
        e.i.a.a.a.e.c cVar;
        super.onAttachedToWindow();
        boolean z2 = true;
        this.J0 = true;
        if (!isInEditMode()) {
            if (this.w0 == null && (cVar = Q0) != null) {
                e.i.a.a.a.b.d a2 = cVar.a(getContext(), this);
                if (a2 != null) {
                    a(a2);
                } else {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
            }
            if (this.x0 == null) {
                e.i.a.a.a.e.b bVar = P0;
                if (bVar != null) {
                    e.i.a.a.a.b.c a3 = bVar.a(getContext(), this);
                    if (a3 != null) {
                        a(a3);
                    } else {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                }
            } else {
                if (!this.E && this.a0) {
                    z2 = false;
                }
                this.E = z2;
            }
            if (this.y0 == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    e.i.a.a.a.b.a aVar2 = this.w0;
                    if ((aVar2 == null || childAt != aVar2.getView()) && ((aVar = this.x0) == null || childAt != aVar.getView())) {
                        this.y0 = new e.i.a.a.a.h.a(childAt);
                    }
                }
            }
            if (this.y0 == null) {
                int a4 = e.i.a.a.a.g.b.a(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(e.i.a.a.a.d.b.srl_content_empty);
                super.addView(textView, 0, new j(-1, -1));
                e.i.a.a.a.h.a aVar3 = new e.i.a.a.a.h.a(textView);
                this.y0 = aVar3;
                aVar3.f4914a.setPadding(a4, a4, a4, a4);
            }
            View findViewById = findViewById(this.s);
            View findViewById2 = findViewById(this.t);
            e.i.a.a.a.h.a aVar4 = (e.i.a.a.a.h.a) this.y0;
            if (aVar4 != null) {
                e.i.a.a.a.f.a aVar5 = aVar4.i;
                aVar5.b = null;
                aVar5.f4906c = this.R;
                aVar4.a(this.B0, findViewById, findViewById2);
                if (this.f4848d != 0) {
                    a(e.i.a.a.a.c.b.None);
                    e.i.a.a.a.b.b bVar2 = this.y0;
                    this.f4848d = 0;
                    ((e.i.a.a.a.h.a) bVar2).a(0, this.u, this.v);
                }
            } else {
                throw null;
            }
        }
        int[] iArr = this.C;
        if (iArr != null) {
            e.i.a.a.a.b.a aVar6 = this.w0;
            if (aVar6 != null) {
                aVar6.setPrimaryColors(iArr);
            }
            e.i.a.a.a.b.a aVar7 = this.x0;
            if (aVar7 != null) {
                aVar7.setPrimaryColors(this.C);
            }
        }
        e.i.a.a.a.b.b bVar3 = this.y0;
        if (bVar3 != null) {
            super.bringChildToFront(((e.i.a.a.a.h.a) bVar3).f4914a);
        }
        e.i.a.a.a.b.a aVar8 = this.w0;
        if (aVar8 != null && aVar8.getSpinnerStyle().b) {
            super.bringChildToFront(this.w0.getView());
        }
        e.i.a.a.a.b.a aVar9 = this.x0;
        if (aVar9 != null && aVar9.getSpinnerStyle().b) {
            super.bringChildToFront(this.x0.getView());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
        this.a0 = true;
        this.N0 = null;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O0.removeAllUpdateListeners();
            this.O0.setDuration(0L);
            this.O0.cancel();
            this.O0 = null;
        }
        e.i.a.a.a.b.a aVar = this.w0;
        if (aVar != null && this.C0 == e.i.a.a.a.c.b.Refreshing) {
            aVar.a(this, false);
        }
        e.i.a.a.a.b.a aVar2 = this.x0;
        if (aVar2 != null && this.C0 == e.i.a.a.a.c.b.Loading) {
            aVar2.a(this, false);
        }
        if (this.f4848d != 0) {
            ((k) this.B0).a(0, true);
        }
        e.i.a.a.a.c.b bVar = this.C0;
        e.i.a.a.a.c.b bVar2 = e.i.a.a.a.c.b.None;
        if (bVar != bVar2) {
            a(bVar2);
        }
        Handler handler = this.A0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.K0 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.onFinishInflate():void");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(e.i.a.a.a.d.a.srl_tag))) {
                e.i.a.a.a.b.b bVar = this.y0;
                boolean z3 = true;
                if (bVar != null && ((e.i.a.a.a.h.a) bVar).f4914a == childAt) {
                    boolean z4 = isInEditMode() && this.K && b(this.D) && this.w0 != null;
                    View view = ((e.i.a.a.a.h.a) this.y0).f4914a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : S0;
                    int i8 = marginLayoutParams.leftMargin + paddingLeft;
                    int i9 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i8;
                    int measuredHeight = view.getMeasuredHeight() + i9;
                    if (z4 && a(this.H, this.w0)) {
                        int i10 = this.l0;
                        i9 += i10;
                        measuredHeight += i10;
                    }
                    view.layout(i8, i9, measuredWidth, measuredHeight);
                }
                e.i.a.a.a.b.a aVar = this.w0;
                if (aVar != null && aVar.getView() == childAt) {
                    boolean z5 = isInEditMode() && this.K && b(this.D);
                    View view2 = this.w0.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : S0;
                    int i11 = marginLayoutParams2.leftMargin;
                    int i12 = marginLayoutParams2.topMargin + this.p0;
                    int measuredWidth2 = view2.getMeasuredWidth() + i11;
                    int measuredHeight2 = view2.getMeasuredHeight() + i12;
                    if (!z5 && this.w0.getSpinnerStyle() == e.i.a.a.a.c.c.f4898d) {
                        int i13 = this.l0;
                        i12 -= i13;
                        measuredHeight2 -= i13;
                    }
                    view2.layout(i11, i12, measuredWidth2, measuredHeight2);
                }
                e.i.a.a.a.b.a aVar2 = this.x0;
                if (aVar2 != null && aVar2.getView() == childAt) {
                    if (!isInEditMode() || !this.K || !b(this.E)) {
                        z3 = false;
                    }
                    View view3 = this.x0.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : S0;
                    e.i.a.a.a.c.c spinnerStyle = this.x0.getSpinnerStyle();
                    int i14 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (getMeasuredHeight() + marginLayoutParams3.topMargin) - this.q0;
                    if (this.V && this.W && this.J && this.y0 != null && this.x0.getSpinnerStyle() == e.i.a.a.a.c.c.f4898d && b(this.E)) {
                        View view4 = ((e.i.a.a.a.h.a) this.y0).f4914a;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == e.i.a.a.a.c.c.f4902h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.q0;
                    } else {
                        if (z3 || spinnerStyle == e.i.a.a.a.c.c.f4901g || spinnerStyle == e.i.a.a.a.c.c.f4900f) {
                            i6 = this.n0;
                        } else if (spinnerStyle.f4904c && this.f4848d < 0) {
                            i6 = Math.max(b(this.E) ? -this.f4848d : 0, 0);
                        }
                        measuredHeight3 -= i6;
                    }
                    view3.layout(i14, measuredHeight3, view3.getMeasuredWidth() + i14, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.a.onMeasure(int, int):void");
    }

    @Override // d.g.l.j
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return this.j0.a(f2, f3, z2);
    }

    @Override // d.g.l.j
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return (this.K0 && f3 > 0.0f) || b(-f3) || this.j0.a(f2, f3);
    }

    @Override // d.g.l.j
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = this.g0;
        int i5 = 0;
        if (i3 * i4 > 0) {
            if (Math.abs(i3) > Math.abs(this.g0)) {
                int i6 = this.g0;
                this.g0 = 0;
                i5 = i6;
            } else {
                this.g0 -= i3;
                i5 = i3;
            }
            a((float) this.g0);
        } else if (i3 > 0 && this.K0) {
            int i7 = i4 - i3;
            this.g0 = i7;
            a((float) i7);
            i5 = i3;
        }
        this.j0.a(i2, i3 - i5, iArr, (int[]) null, 0);
        iArr[1] = iArr[1] + i5;
    }

    @Override // d.g.l.j
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        ViewParent parent;
        boolean a2 = this.j0.a(i2, i3, i4, i5, this.i0);
        int i6 = i5 + this.i0[1];
        if ((i6 < 0 && (this.D || this.M)) || (i6 > 0 && (this.E || this.M))) {
            int i7 = this.g0;
            e.i.a.a.a.c.b bVar = this.D0;
            if (bVar == e.i.a.a.a.c.b.None || bVar.f4896g) {
                ((k) this.B0).a(i6 > 0 ? e.i.a.a.a.c.b.PullUpToLoad : e.i.a.a.a.c.b.PullDownToRefresh);
                if (!a2 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i8 = this.g0 - i6;
            this.g0 = i8;
            a((float) i8);
        }
        if (this.K0 && i3 < 0) {
            this.K0 = false;
        }
    }

    @Override // d.g.l.j
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.k0.f3341a = i2;
        this.j0.a(i2 & 2, 0);
        this.g0 = this.f4848d;
        this.h0 = true;
        b(0);
    }

    @Override // d.g.l.j
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (isEnabled() && isNestedScrollingEnabled() && (i2 & 2) != 0) && (this.M || this.D || this.E);
    }

    @Override // d.g.l.j
    public void onStopNestedScroll(View view) {
        this.k0.a(0);
        this.h0 = false;
        this.g0 = 0;
        c();
        this.j0.c(0);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = ((e.i.a.a.a.h.a) this.y0).f4915c;
        if ((Build.VERSION.SDK_INT >= 21 || !(view instanceof AbsListView)) && p.r(view)) {
            this.r = z2;
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.S = z2;
        d.g.l.g gVar = this.j0;
        if (gVar.f3339d) {
            p.v(gVar.f3338c);
        }
        gVar.f3339d = z2;
    }

    public void setStateDirectLoading(boolean z2) {
        if (this.C0 != e.i.a.a.a.c.b.Loading) {
            this.E0 = System.currentTimeMillis();
            this.K0 = true;
            a(e.i.a.a.a.c.b.Loading);
            a(2000, true, false);
            e.i.a.a.a.b.a aVar = this.x0;
            if (aVar != null) {
                int i2 = this.n0;
                aVar.b(this, i2, (int) (this.s0 * ((float) i2)));
            }
        }
    }

    public void setStateLoading(boolean z2) {
        C0146a aVar = new C0146a(z2);
        a(e.i.a.a.a.c.b.LoadReleased);
        ValueAnimator a2 = ((k) this.B0).a(-this.n0);
        if (a2 != null) {
            a2.addListener(aVar);
        }
        e.i.a.a.a.b.a aVar2 = this.x0;
        if (aVar2 != null) {
            int i2 = this.n0;
            aVar2.a(this, i2, (int) (this.s0 * ((float) i2)));
        }
        if (a2 == null) {
            aVar.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z2) {
        b bVar = new b(z2);
        a(e.i.a.a.a.c.b.RefreshReleased);
        ValueAnimator a2 = ((k) this.B0).a(this.l0);
        if (a2 != null) {
            a2.addListener(bVar);
        }
        e.i.a.a.a.b.a aVar = this.w0;
        if (aVar != null) {
            int i2 = this.l0;
            aVar.a(this, i2, (int) (this.r0 * ((float) i2)));
        }
        if (a2 == null) {
            bVar.onAnimationEnd(null);
        }
    }

    public void setViceState(e.i.a.a.a.c.b bVar) {
        e.i.a.a.a.c.b bVar2 = this.C0;
        if (bVar2.f4895f && bVar2.f4892c != bVar.f4892c) {
            a(e.i.a.a.a.c.b.None);
        }
        if (this.D0 != bVar) {
            this.D0 = bVar;
        }
    }

    public e.i.a.a.a.b.f a(View view) {
        e.i.a.a.a.b.b bVar = this.y0;
        if (bVar != null) {
            super.removeView(((e.i.a.a.a.h.a) bVar).f4914a);
        }
        j jVar = new j(-1, -1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof j) {
            jVar = (j) layoutParams;
        }
        super.addView(view, getChildCount(), jVar);
        this.y0 = new e.i.a.a.a.h.a(view);
        if (this.J0) {
            View findViewById = findViewById(this.s);
            View findViewById2 = findViewById(this.t);
            e.i.a.a.a.h.a aVar = (e.i.a.a.a.h.a) this.y0;
            if (aVar != null) {
                e.i.a.a.a.f.a aVar2 = aVar.i;
                aVar2.b = null;
                aVar2.f4906c = this.R;
                aVar.a(this.B0, findViewById, findViewById2);
            } else {
                throw null;
            }
        }
        e.i.a.a.a.b.a aVar3 = this.w0;
        if (aVar3 != null && aVar3.getSpinnerStyle().b) {
            super.bringChildToFront(this.w0.getView());
        }
        e.i.a.a.a.b.a aVar4 = this.x0;
        if (aVar4 != null && aVar4.getSpinnerStyle().b) {
            super.bringChildToFront(this.x0.getView());
        }
        return this;
    }

    public e.i.a.a.a.b.f a(e.i.a.a.a.b.c cVar) {
        View view;
        e.i.a.a.a.b.a aVar;
        e.i.a.a.a.b.a aVar2 = this.x0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.x0 = cVar;
        int i2 = 0;
        this.K0 = false;
        this.G0 = 0;
        this.W = false;
        this.I0 = false;
        this.o0 = e.i.a.a.a.c.a.f4885c;
        this.E = !this.a0 || this.E;
        j jVar = new j(-1, -2);
        ViewGroup.LayoutParams layoutParams = cVar.getView().getLayoutParams();
        if (layoutParams instanceof j) {
            jVar = (j) layoutParams;
        }
        if (this.x0.getSpinnerStyle().b) {
            view = this.x0.getView();
            i2 = getChildCount();
        } else {
            view = this.x0.getView();
        }
        super.addView(view, i2, jVar);
        int[] iArr = this.C;
        if (!(iArr == null || (aVar = this.x0) == null)) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    public e.i.a.a.a.b.f a(e.i.a.a.a.b.d dVar) {
        View view;
        e.i.a.a.a.b.a aVar;
        e.i.a.a.a.b.a aVar2 = this.w0;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.w0 = dVar;
        int i2 = 0;
        this.F0 = 0;
        this.H0 = false;
        this.m0 = e.i.a.a.a.c.a.f4885c;
        j jVar = new j(-1, -2);
        ViewGroup.LayoutParams layoutParams = dVar.getView().getLayoutParams();
        if (layoutParams instanceof j) {
            jVar = (j) layoutParams;
        }
        if (this.w0.getSpinnerStyle().b) {
            view = this.w0.getView();
            i2 = getChildCount();
        } else {
            view = this.w0.getView();
        }
        super.addView(view, i2, jVar);
        int[] iArr = this.C;
        if (!(iArr == null || (aVar = this.w0) == null)) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }
}

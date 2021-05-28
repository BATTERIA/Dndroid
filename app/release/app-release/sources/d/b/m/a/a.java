package d.b.m.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import d.b.m.a.b;
import d.b.m.a.d;
import d.d.i;

public class a extends d {
    public c q;
    public g r;
    public int s;
    public int t;
    public boolean u;

    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f2718a;

        public b(Animatable animatable) {
            super(null);
            this.f2718a = animatable;
        }

        @Override // d.b.m.a.a.g
        public void c() {
            this.f2718a.start();
        }

        @Override // d.b.m.a.a.g
        public void d() {
            this.f2718a.stop();
        }
    }

    public static class c extends d.a {
        public d.d.e<Long> K;
        public i<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            i<Integer> iVar;
            if (cVar != null) {
                this.K = cVar.K;
                iVar = cVar.L;
            } else {
                this.K = new d.d.e<>();
                iVar = new i<>(10);
            }
            this.L = iVar;
        }

        public static long a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public int a(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long a3 = a(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a2;
            this.K.a(a3, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        public int b(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.b(i, 0).intValue();
        }

        public int b(int[] iArr) {
            int a2 = super.a(iArr);
            return a2 >= 0 ? a2 : super.a(StateSet.WILD_CARD);
        }

        @Override // d.b.m.a.d.a, d.b.m.a.b.c
        public void d() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // d.b.m.a.d.a
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // d.b.m.a.d.a
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final d.q.a.a.c f2719a;

        public d(d.q.a.a.c cVar) {
            super(null);
            this.f2719a = cVar;
        }

        @Override // d.b.m.a.a.g
        public void c() {
            this.f2719a.start();
        }

        @Override // d.b.m.a.a.g
        public void d() {
            this.f2719a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f2720a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.f2722c);
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.f2720a = ofInt;
        }

        @Override // d.b.m.a.a.g
        public boolean a() {
            return this.b;
        }

        @Override // d.b.m.a.a.g
        public void b() {
            this.f2720a.reverse();
        }

        @Override // d.b.m.a.a.g
        public void c() {
            this.f2720a.start();
        }

        @Override // d.b.m.a.a.g
        public void d() {
            this.f2720a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2721a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2722c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.f2721a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2721a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2721a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2722c = i;
        }

        public float getInterpolation(float f2) {
            int i = (int) ((f2 * ((float) this.f2722c)) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.f2721a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2722c) : 0.0f);
        }
    }

    public static abstract class g {
        public /* synthetic */ g(C0088a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.s = -1;
        this.t = -1;
        c cVar2 = new c(cVar, this, resources);
        super.a(cVar2);
        this.q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // d.b.m.a.b, d.b.m.a.d, d.b.m.a.d
    public b.c a() {
        return new c(this.q, this, null);
    }

    @Override // d.b.m.a.b, d.b.m.a.d
    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof c) {
            this.q = (c) cVar;
        }
    }

    @Override // d.b.m.a.d
    public boolean isStateful() {
        return true;
    }

    @Override // d.b.m.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.r;
        if (gVar != null) {
            gVar.d();
            this.r = null;
            a(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    @Override // d.b.m.a.b, d.b.m.a.d
    public Drawable mutate() {
        if (!this.u) {
            super.mutate();
            if (this == this) {
                this.q.d();
                this.u = true;
            }
        }
        return this;
    }

    @Override // d.b.m.a.d
    public boolean onStateChange(int[] iArr) {
        boolean z;
        g gVar;
        int b2 = this.q.b(iArr);
        int i = this.i;
        boolean z2 = false;
        if (b2 != i) {
            g gVar2 = this.r;
            if (gVar2 != null) {
                if (b2 != this.s) {
                    if (b2 != this.t || !gVar2.a()) {
                        i = this.s;
                        gVar2.d();
                    } else {
                        gVar2.b();
                        this.s = this.t;
                        this.t = b2;
                    }
                }
                z = true;
                if (z || a(b2)) {
                    z2 = true;
                }
            }
            this.r = null;
            this.t = -1;
            this.s = -1;
            c cVar = this.q;
            int b3 = cVar.b(i);
            int b4 = cVar.b(b2);
            if (!(b4 == 0 || b3 == 0)) {
                int longValue = (int) cVar.K.b(c.a(b3, b4), -1L).longValue();
                if (longValue >= 0) {
                    boolean z3 = (cVar.K.b(c.a(b3, b4), -1L).longValue() & 8589934592L) != 0;
                    a(longValue);
                    Drawable drawable = this.f2725e;
                    if (drawable instanceof AnimationDrawable) {
                        gVar = new e((AnimationDrawable) drawable, (cVar.K.b(c.a(b3, b4), -1L).longValue() & 4294967296L) != 0, z3);
                    } else if (drawable instanceof d.q.a.a.c) {
                        gVar = new d((d.q.a.a.c) drawable);
                    } else if (drawable instanceof Animatable) {
                        gVar = new b((Animatable) drawable);
                    }
                    gVar.c();
                    this.r = gVar;
                    this.t = i;
                    this.s = b2;
                    z = true;
                    z2 = true;
                }
            }
            z = false;
            z2 = true;
        }
        Drawable drawable2 = this.f2725e;
        return drawable2 != null ? z2 | drawable2.setState(iArr) : z2;
    }

    @Override // d.b.m.a.b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.r != null && (visible || z2)) {
            if (z) {
                this.r.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // d.b.m.a.b, d.b.m.a.d, d.b.m.a.d
    /* renamed from: a  reason: collision with other method in class */
    public d.a m85a() {
        return new c(this.q, this, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0207, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ed A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d.b.m.a.a a(android.content.Context r18, android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.m.a.a.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):d.b.m.a.a");
    }
}

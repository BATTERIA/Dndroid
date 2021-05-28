package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.p;
import java.util.List;

public class l extends RecyclerView.l implements RecyclerView.p {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A = 0;
    public final Runnable B = new a();
    public final RecyclerView.q C = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f3629a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3630c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3631d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3632e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3633f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3634g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3635h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q = 0;
    public int r = 0;
    public RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];
    public final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l lVar = l.this;
            int i = lVar.A;
            if (i == 1) {
                lVar.z.cancel();
            } else if (i != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            lVar.z.setDuration((long) 500);
            lVar.z.start();
        }
    }

    public class b extends RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i, int i2) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i3 = lVar.r;
            lVar.t = computeVerticalScrollRange - i3 > 0 && i3 >= lVar.f3629a;
            int computeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i4 = lVar.q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= lVar.f3629a;
            lVar.u = z;
            if (lVar.t || z) {
                if (lVar.t) {
                    float f2 = (float) i3;
                    lVar.l = (int) ((((f2 / 2.0f) + ((float) computeVerticalScrollOffset)) * f2) / ((float) computeVerticalScrollRange));
                    lVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (lVar.u) {
                    float f3 = (float) computeHorizontalScrollOffset;
                    float f4 = (float) i4;
                    lVar.o = (int) ((((f4 / 2.0f) + f3) * f4) / ((float) computeHorizontalScrollRange));
                    lVar.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = lVar.v;
                if (i5 == 0 || i5 == 1) {
                    lVar.a(1);
                }
            } else if (lVar.v != 0) {
                lVar.a(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3638a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3638a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3638a) {
                this.f3638a = false;
            } else if (((Float) l.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.a(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f3630c.setAlpha(floatValue);
            l.this.f3631d.setAlpha(floatValue);
            l.this.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        this.f3630c = stateListDrawable;
        this.f3631d = drawable;
        this.f3634g = stateListDrawable2;
        this.f3635h = drawable2;
        this.f3632e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3633f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3629a = i3;
        this.b = i4;
        this.f3630c.setAlpha(255);
        this.f3631d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.m mVar = recyclerView2.o;
                if (mVar != null) {
                    mVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.q.remove(this);
                if (recyclerView2.q.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.o();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.s;
                recyclerView3.r.remove(this);
                if (recyclerView3.s == this) {
                    recyclerView3.s = null;
                }
                RecyclerView recyclerView4 = this.s;
                RecyclerView.q qVar = this.C;
                List<RecyclerView.q> list = recyclerView4.k0;
                if (list != null) {
                    list.remove(qVar);
                }
                a();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.a(this);
                this.s.r.add(this);
                this.s.a(this.C);
            }
        }
    }

    public final int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final void a() {
        this.s.removeCallbacks(this.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            a(0);
        } else if (this.A != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.f3632e;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                int i7 = i5 - (i6 / 2);
                this.f3630c.setBounds(0, 0, i3, i6);
                this.f3631d.setBounds(0, 0, this.f3633f, this.r);
                boolean z2 = true;
                if (p.h(this.s) != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.f3631d.draw(canvas);
                    canvas.translate((float) this.f3632e, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3630c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i4 = this.f3632e;
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.f3631d.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.f3630c.draw(canvas);
                }
                canvas.translate((float) (-i4), (float) (-i7));
            }
            if (this.u) {
                int i8 = this.r;
                int i9 = this.i;
                int i10 = i8 - i9;
                int i11 = this.o;
                int i12 = this.n;
                int i13 = i11 - (i12 / 2);
                this.f3634g.setBounds(0, 0, i12, i9);
                this.f3635h.setBounds(0, 0, this.q, this.j);
                canvas.translate(0.0f, (float) i10);
                this.f3635h.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.f3634g.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(boolean z2) {
    }

    public boolean a(float f2, float f3) {
        if (f3 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b2 && !a2) {
            return false;
        }
        if (a2) {
            this.w = 1;
            this.p = (float) ((int) motionEvent.getX());
        } else if (b2) {
            this.w = 2;
            this.m = (float) ((int) motionEvent.getY());
        }
        a(2);
    }

    public void b() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }

    public boolean b(float f2, float f3) {
        if (p.h(this.s) == 1) {
            if (f2 > ((float) (this.f3632e / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.q - this.f3632e))) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        if (f3 < ((float) (i2 - i3)) || f3 > ((float) (i3 + i2))) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                if (b2 || a2) {
                    if (a2) {
                        this.w = 1;
                        this.p = (float) ((int) motionEvent.getX());
                    } else if (b2) {
                        this.w = 2;
                        this.m = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                a(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                b();
                if (this.w == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.y;
                    int i2 = this.b;
                    iArr[0] = i2;
                    iArr[1] = this.q - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.o) - max) >= 2.0f) {
                        int a3 = a(this.p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                        if (a3 != 0) {
                            this.s.scrollBy(a3, 0);
                        }
                        this.p = max;
                    }
                }
                if (this.w == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.x;
                    int i3 = this.b;
                    iArr2[0] = i3;
                    iArr2[1] = this.r - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.l) - max2) >= 2.0f) {
                        int a4 = a(this.m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                        if (a4 != 0) {
                            this.s.scrollBy(0, a4);
                        }
                        this.m = max2;
                    }
                }
            }
        }
    }

    public void a(int i2) {
        int i3;
        if (i2 == 2 && this.v != 2) {
            this.f3630c.setState(D);
            a();
        }
        if (i2 == 0) {
            this.s.invalidate();
        } else {
            b();
        }
        if (this.v != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.v = i2;
        }
        this.f3630c.setState(E);
        i3 = 1200;
        a();
        this.s.postDelayed(this.B, (long) i3);
        this.v = i2;
    }
}

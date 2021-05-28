package d.b.o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import d.b.n.i.r;

public abstract class e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final float f2887c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2888d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2889e;

    /* renamed from: f  reason: collision with root package name */
    public final View f2890f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f2891g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f2892h;
    public boolean i;
    public int j;
    public final int[] k = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = e0.this.f2890f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e0 e0Var = e0.this;
            e0Var.a();
            View view = e0Var.f2890f;
            if (view.isEnabled() && !view.isLongClickable() && e0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                e0Var.i = true;
            }
        }
    }

    public e0(View view) {
        this.f2890f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2887c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2888d = tapTimeout;
        this.f2889e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f2892h;
        if (runnable != null) {
            this.f2890f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2891g;
        if (runnable2 != null) {
            this.f2890f.removeCallbacks(runnable2);
        }
    }

    public abstract r b();

    public abstract boolean c();

    public boolean d() {
        r b2 = b();
        if (b2 == null || !b2.c()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.e0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.i = false;
        this.j = -1;
        Runnable runnable = this.f2891g;
        if (runnable != null) {
            this.f2890f.removeCallbacks(runnable);
        }
    }
}

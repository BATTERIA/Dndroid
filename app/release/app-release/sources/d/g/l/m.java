package d.g.l;

import android.view.View;
import android.view.ViewTreeObserver;

public final class m implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final View f3342c;

    /* renamed from: d  reason: collision with root package name */
    public ViewTreeObserver f3343d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f3344e;

    public m(View view, Runnable runnable) {
        this.f3342c = view;
        this.f3343d = view.getViewTreeObserver();
        this.f3344e = runnable;
    }

    public static m a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            m mVar = new m(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(mVar);
            view.addOnAttachStateChangeListener(mVar);
            return mVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void a() {
        (this.f3343d.isAlive() ? this.f3343d : this.f3342c.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3342c.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.f3344e.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3343d = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}

package d.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f3355a;
    public Runnable b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f3356c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f3357d = -1;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f3358a;
        public final /* synthetic */ View b;

        public a(u uVar, v vVar, View view) {
            this.f3358a = vVar;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3358a.c(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3358a.a(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3358a.b(this.b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x f3359a;
        public final /* synthetic */ View b;

        public b(u uVar, x xVar, View view) {
            this.f3359a = xVar;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) d.b.k.u.this.f2703d.getParent()).invalidate();
        }
    }

    public u(View view) {
        this.f3355a = new WeakReference<>(view);
    }

    public u a(float f2) {
        View view = this.f3355a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public u a(long j) {
        View view = this.f3355a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public u a(v vVar) {
        View view = this.f3355a.get();
        if (view != null) {
            a(view, vVar);
        }
        return this;
    }

    public u a(x xVar) {
        View view = this.f3355a.get();
        if (view != null) {
            b bVar = null;
            if (xVar != null) {
                bVar = new b(this, xVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void a() {
        View view = this.f3355a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void a(View view, v vVar) {
        if (vVar != null) {
            view.animate().setListener(new a(this, vVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public u b(float f2) {
        View view = this.f3355a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}

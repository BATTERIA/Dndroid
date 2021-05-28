package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3602a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3603c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3604d;

    public f(k kVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3604d = kVar;
        this.f3602a = a0Var;
        this.b = viewPropertyAnimator;
        this.f3603c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f3603c.setAlpha(1.0f);
        this.f3604d.a(this.f3602a);
        this.f3604d.q.remove(this.f3602a);
        this.f3604d.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f3604d == null) {
            throw null;
        }
    }
}

package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3605a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3606c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3607d;

    public g(k kVar, RecyclerView.a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3607d = kVar;
        this.f3605a = a0Var;
        this.b = view;
        this.f3606c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f3606c.setListener(null);
        this.f3607d.a(this.f3605a);
        this.f3607d.o.remove(this.f3605a);
        this.f3607d.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f3607d == null) {
            throw null;
        }
    }
}

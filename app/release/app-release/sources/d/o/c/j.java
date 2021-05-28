package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.k;

public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f3616a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3617c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3618d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3618d = kVar;
        this.f3616a = aVar;
        this.b = viewPropertyAnimator;
        this.f3617c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f3617c.setAlpha(1.0f);
        this.f3617c.setTranslationX(0.0f);
        this.f3617c.setTranslationY(0.0f);
        this.f3618d.a(this.f3616a.b);
        this.f3618d.r.remove(this.f3616a.b);
        this.f3618d.d();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.f3618d;
        RecyclerView.a0 a0Var = this.f3616a.b;
        if (kVar == null) {
            throw null;
        }
    }
}

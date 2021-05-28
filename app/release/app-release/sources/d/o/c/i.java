package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.k;

public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f3613a;
    public final /* synthetic */ ViewPropertyAnimator b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3614c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3615d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3615d = kVar;
        this.f3613a = aVar;
        this.b = viewPropertyAnimator;
        this.f3614c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.f3614c.setAlpha(1.0f);
        this.f3614c.setTranslationX(0.0f);
        this.f3614c.setTranslationY(0.0f);
        this.f3615d.a(this.f3613a.f3620a);
        this.f3615d.r.remove(this.f3613a.f3620a);
        this.f3615d.d();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.f3615d;
        RecyclerView.a0 a0Var = this.f3613a.f3620a;
        if (kVar == null) {
            throw null;
        }
    }
}

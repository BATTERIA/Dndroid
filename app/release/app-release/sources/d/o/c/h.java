package d.o.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f3608a;
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3609c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3610d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3611e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f3612f;

    public h(k kVar, RecyclerView.a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3612f = kVar;
        this.f3608a = a0Var;
        this.b = i;
        this.f3609c = view;
        this.f3610d = i2;
        this.f3611e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.f3609c.setTranslationX(0.0f);
        }
        if (this.f3610d != 0) {
            this.f3609c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f3611e.setListener(null);
        this.f3612f.a(this.f3608a);
        this.f3612f.p.remove(this.f3608a);
        this.f3612f.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f3612f == null) {
            throw null;
        }
    }
}

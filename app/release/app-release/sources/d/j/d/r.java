package d.j.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3504a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f3505c;

    public r(q qVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f3504a = viewGroup;
        this.b = view;
        this.f3505c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3504a.endViewTransition(this.b);
        animator.removeListener(this);
        Fragment fragment = this.f3505c;
        View view = fragment.I;
        if (view != null && fragment.A) {
            view.setVisibility(8);
        }
    }
}

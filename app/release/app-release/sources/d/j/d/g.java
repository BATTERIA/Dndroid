package d.j.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import d.g.h.a;
import d.j.d.g0;
import d.j.d.q;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3443a;
    public final /* synthetic */ View b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f3444c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0.a f3445d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f3446e;

    public g(ViewGroup viewGroup, View view, Fragment fragment, g0.a aVar, a aVar2) {
        this.f3443a = viewGroup;
        this.b = view;
        this.f3444c = fragment;
        this.f3445d = aVar;
        this.f3446e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3443a.endViewTransition(this.b);
        Fragment.b bVar = this.f3444c.L;
        Animator animator2 = bVar == null ? null : bVar.b;
        this.f3444c.a((Animator) null);
        if (animator2 != null && this.f3443a.indexOfChild(this.b) < 0) {
            ((q.b) this.f3445d).a(this.f3444c, this.f3446e);
        }
    }
}

package d.j.d;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.g.h.a;

public final class e implements a.AbstractC0100a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f3426a;

    public e(Fragment fragment) {
        this.f3426a = fragment;
    }

    public void a() {
        if (this.f3426a.g() != null) {
            View g2 = this.f3426a.g();
            this.f3426a.a((View) null);
            g2.clearAnimation();
        }
        this.f3426a.a((Animator) null);
    }
}

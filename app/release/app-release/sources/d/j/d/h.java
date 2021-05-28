package d.j.d;

import android.animation.Animator;
import android.view.animation.Animation;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f3454a;
    public final Animator b;

    public h(Animator animator) {
        this.f3454a = null;
        this.b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }

    public h(Animation animation) {
        this.f3454a = animation;
        this.b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}

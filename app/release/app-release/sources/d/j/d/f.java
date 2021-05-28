package d.j.d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import d.j.d.g0;
import d.j.d.q;

public final class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3433a;
    public final /* synthetic */ Fragment b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0.a f3434c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d.g.h.a f3435d;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (f.this.b.g() != null) {
                f.this.b.a((View) null);
                f fVar = f.this;
                ((q.b) fVar.f3434c).a(fVar.b, fVar.f3435d);
            }
        }
    }

    public f(ViewGroup viewGroup, Fragment fragment, g0.a aVar, d.g.h.a aVar2) {
        this.f3433a = viewGroup;
        this.b = fragment;
        this.f3434c = aVar;
        this.f3435d = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.f3433a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}

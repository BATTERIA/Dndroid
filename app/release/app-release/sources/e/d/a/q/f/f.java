package e.d.a.q.f;

import android.view.animation.AlphaAnimation;
import e.d.a.q.f.a;
import e.d.a.q.f.c;
import e.d.a.q.g.j;

public class f<R> implements c<R> {

    /* renamed from: a  reason: collision with root package name */
    public final a f4249a;

    public interface a {
    }

    public f(a aVar) {
        this.f4249a = aVar;
    }

    @Override // e.d.a.q.f.c
    public boolean a(R r, c.a aVar) {
        T t = ((j) aVar).b;
        if (t == null) {
            return false;
        }
        t.clearAnimation();
        a.C0130a aVar2 = (a.C0130a) this.f4249a;
        if (aVar2 != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) aVar2.f4246a);
            t.startAnimation(alphaAnimation);
            return false;
        }
        throw null;
    }
}

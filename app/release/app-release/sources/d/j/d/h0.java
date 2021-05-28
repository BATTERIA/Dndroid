package d.j.d;

import android.graphics.Rect;
import android.transition.Transition;

public class h0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f3455a;

    public h0(j0 j0Var, Rect rect) {
        this.f3455a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f3455a;
    }
}

package d.j.d;

import android.graphics.Rect;
import android.transition.Transition;

public class l0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f3473a;

    public l0(j0 j0Var, Rect rect) {
        this.f3473a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f3473a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f3473a;
    }
}

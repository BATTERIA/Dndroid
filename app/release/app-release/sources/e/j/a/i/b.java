package e.j.a.i;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

@TargetApi(21)
public class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public float f4964a;

    public b(float f2) {
        this.f4964a = f2;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f4964a);
    }
}

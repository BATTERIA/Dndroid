package e.e.a.o.q;

import android.view.View;
import e.j.a.j.a;

public class f extends a {
    public float b;

    public f(float f2, float f3) {
        super(f2);
        this.b = f3;
    }

    @Override // e.j.a.j.a, androidx.viewpager.widget.ViewPager.j
    public void a(View view, float f2) {
        super.a(view, f2);
        if (f2 < -1.0f || f2 > 1.0f) {
            view.setAlpha(this.b);
            return;
        }
        float f3 = f2 < 0.0f ? f2 + 1.0f : 1.0f - f2;
        float f4 = this.b;
        view.setAlpha(((1.0f - f4) * f3) + f4);
    }
}

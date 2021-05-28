package e.j.a.j;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class a implements ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    public float f4965a;

    public a(float f2) {
        this.f4965a = f2;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void a(View view, float f2) {
        float f3;
        float f4;
        float f5;
        int width = view.getWidth();
        view.setPivotY((float) (view.getHeight() / 2));
        view.setPivotX((float) (width / 2));
        if (f2 < -1.0f) {
            view.setScaleX(this.f4965a);
            view.setScaleY(this.f4965a);
            f5 = (float) width;
        } else if (f2 <= 1.0f) {
            if (f2 < 0.0f) {
                float f6 = this.f4965a;
                float f7 = ((1.0f - f6) * (f2 + 1.0f)) + f6;
                view.setScaleX(f7);
                view.setScaleY(f7);
                f4 = (float) width;
                f3 = ((-f2) * 0.5f) + 0.5f;
            } else {
                float f8 = 1.0f - f2;
                float f9 = this.f4965a;
                float f10 = ((1.0f - f9) * f8) + f9;
                view.setScaleX(f10);
                view.setScaleY(f10);
                f4 = (float) width;
                f3 = f8 * 0.5f;
            }
            f5 = f3 * f4;
        } else {
            view.setPivotX(0.0f);
            view.setScaleX(this.f4965a);
            view.setScaleY(this.f4965a);
            return;
        }
        view.setPivotX(f5);
    }
}

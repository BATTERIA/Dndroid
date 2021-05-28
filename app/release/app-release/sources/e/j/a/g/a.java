package e.j.a.g;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import e.j.a.h.d;
import java.util.ArrayList;
import java.util.List;

public class a extends View implements b {

    /* renamed from: c  reason: collision with root package name */
    public d f4935c = new d();

    /* renamed from: d  reason: collision with root package name */
    public Paint f4936d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager f4937e;

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f4936d = paint;
        paint.setAntiAlias(true);
    }

    private void setCurrentPosition(int i) {
        this.f4935c.j = i;
    }

    private void setPageSize(int i) {
        this.f4935c.f4957c = i;
    }

    private void setSlideProgress(float f2) {
        this.f4935c.k = f2;
    }

    @Override // e.j.a.g.b
    public void a() {
        ViewPager viewPager = this.f4937e;
        if (viewPager != null) {
            List<ViewPager.i> list = viewPager.T;
            if (list != null) {
                list.remove(this);
            }
            ViewPager viewPager2 = this.f4937e;
            if (viewPager2.T == null) {
                viewPager2.T = new ArrayList();
            }
            viewPager2.T.add(this);
            if (this.f4937e.getAdapter() != null) {
                setPageSize(this.f4937e.getAdapter().a());
            }
        }
        requestLayout();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void b(int i) {
        if (getSlideMode() == 0) {
            setCurrentPosition(i);
            setSlideProgress(0.0f);
            invalidate();
        }
    }

    public int getCheckedColor() {
        return this.f4935c.f4959e;
    }

    public float getCheckedSliderWidth() {
        return this.f4935c.i;
    }

    public int getCurrentPosition() {
        return this.f4935c.j;
    }

    public float getIndicatorGap() {
        return this.f4935c.f4960f;
    }

    public d getIndicatorOptions() {
        return this.f4935c;
    }

    public int getNormalColor() {
        return this.f4935c.f4958d;
    }

    public float getNormalSliderWidth() {
        return this.f4935c.f4962h;
    }

    public int getPageSize() {
        return this.f4935c.f4957c;
    }

    public int getSlideMode() {
        return this.f4935c.b;
    }

    public float getSlideProgress() {
        return this.f4935c.k;
    }

    @Override // e.j.a.g.b
    public void setIndicatorOptions(d dVar) {
        this.f4935c = dVar;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        this.f4937e = viewPager;
        a();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i, float f2, int i2) {
        if (getSlideMode() != 0 && getPageSize() > 1) {
            if (i % getPageSize() == getPageSize() - 1) {
                if (((double) f2) >= 0.5d) {
                    i = 0;
                }
                f2 = 0.0f;
            }
            setCurrentPosition(i);
            setSlideProgress(f2);
            invalidate();
        }
    }
}

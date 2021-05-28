package e.j.a.g;

import android.content.Context;
import android.graphics.Canvas;
import e.j.a.g.d.a;
import e.j.a.g.d.d;

public class c extends a implements b {

    /* renamed from: f  reason: collision with root package name */
    public d f4938f = new d(getIndicatorOptions());

    public c(Context context) {
        super(context, null, 0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4938f.f4946a.a(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4938f == null) {
            throw null;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a.C0150a a2 = this.f4938f.f4946a.a(i, i2);
        setMeasuredDimension(a2.f4944a, a2.b);
    }

    @Override // e.j.a.g.a, e.j.a.g.b
    public void setIndicatorOptions(e.j.a.h.d dVar) {
        super.setIndicatorOptions(dVar);
        this.f4938f.a(dVar);
    }
}

package d.o.c;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.w {
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public PointF k;
    public final float l;
    public int m = 0;
    public int n = 0;

    public o(Context context) {
        this.l = a(context.getResources().getDisplayMetrics());
    }

    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void a(int i2, int i3, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        if (this.b.o.d() == 0) {
            c();
            return;
        }
        int i4 = this.m;
        int i5 = i4 - i2;
        int i6 = 0;
        if (i4 * i5 <= 0) {
            i5 = 0;
        }
        this.m = i5;
        int i7 = this.n;
        int i8 = i7 - i3;
        if (i7 * i8 > 0) {
            i6 = i8;
        }
        this.n = i6;
        if (this.m == 0 && i6 == 0) {
            PointF a2 = a(this.f2497a);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                aVar.f2506d = this.f2497a;
                c();
                return;
            }
            a(a2);
            this.k = a2;
            this.m = (int) (a2.x * 10000.0f);
            this.n = (int) (a2.y * 10000.0f);
            aVar.a((int) (((float) this.m) * 1.2f), (int) (((float) this.n) * 1.2f), (int) (((float) b(10000)) * 1.2f), this.i);
        }
    }

    public int b(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * this.l));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void b() {
        this.n = 0;
        this.m = 0;
        this.k = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r11, androidx.recyclerview.widget.RecyclerView.x r12, androidx.recyclerview.widget.RecyclerView.w.a r13) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: d.o.c.o.a(android.view.View, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }
}

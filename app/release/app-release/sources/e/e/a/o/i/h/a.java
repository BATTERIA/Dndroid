package e.e.a.o.i.h;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class a extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public int f4392a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f4393c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4394d;

    public a(int i, int i2, int i3, boolean z) {
        this.f4392a = i;
        this.b = i2;
        this.f4393c = i3;
        this.f4394d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (recyclerView != null) {
            RecyclerView.a0 g2 = RecyclerView.g(view);
            int c2 = g2 != null ? g2.c() : -1;
            int i = this.f4392a;
            int i2 = c2 % i;
            if (this.f4394d) {
                int i3 = this.f4393c;
                rect.left = i3 - ((i2 * i3) / i);
                rect.right = ((i2 + 1) * i3) / i;
                if (c2 < i) {
                    rect.top = this.b;
                }
                rect.bottom = this.b;
                return;
            }
            int i4 = this.f4393c;
            rect.left = (i2 * i4) / i;
            rect.right = i4 - (((i2 + 1) * i4) / i);
            if (c2 >= i) {
                rect.top = this.b;
                return;
            }
            return;
        }
        throw null;
    }
}

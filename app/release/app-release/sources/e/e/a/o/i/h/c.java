package e.e.a.o.i.h;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class c extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public int f4396a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f4397c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4398d;

    public c(int i, int i2, int i3, boolean z) {
        this.f4396a = i;
        this.b = i2;
        this.f4397c = i3;
        this.f4398d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        int d2 = ((StaggeredGridLayoutManager.c) view.getLayoutParams()).d();
        if (recyclerView != null) {
            RecyclerView.a0 g2 = RecyclerView.g(view);
            int c2 = g2 != null ? g2.c() : -1;
            if (this.f4398d) {
                int i = this.f4397c;
                int i2 = this.f4396a;
                rect.left = i - ((d2 * i) / i2);
                rect.right = ((d2 + 1) * i) / i2;
                if (c2 < i2) {
                    rect.top = this.b;
                }
                rect.bottom = this.b;
                return;
            }
            int i3 = this.f4397c;
            int i4 = this.f4396a;
            rect.left = (d2 * i3) / i4;
            rect.right = i3 - (((d2 + 1) * i3) / i4);
            if (c2 >= i4) {
                rect.top = this.b;
                return;
            }
            return;
        }
        throw null;
    }
}

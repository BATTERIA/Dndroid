package e.e.a.o.i.h;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class b extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public int f4395a;
    public boolean b;

    public b(int i, boolean z) {
        this.f4395a = i;
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        int i;
        if (this.b) {
            int i2 = this.f4395a;
            rect.left = i2;
            rect.right = i2;
            rect.bottom = i2;
            if (recyclerView.c(view) != 0) {
                i = 0;
                rect.top = i;
            }
        } else if (recyclerView.c(view) <= 0) {
            return;
        }
        i = this.f4395a;
        rect.top = i;
    }
}

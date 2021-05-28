package d.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.b;

public class v implements b.AbstractC0113b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3665a;

    public v(RecyclerView recyclerView) {
        this.f3665a = recyclerView;
    }

    public int a() {
        return this.f3665a.getChildCount();
    }

    public View a(int i) {
        return this.f3665a.getChildAt(i);
    }

    public void b(int i) {
        View childAt = this.f3665a.getChildAt(i);
        if (childAt != null) {
            this.f3665a.a(childAt);
            childAt.clearAnimation();
        }
        this.f3665a.removeViewAt(i);
    }
}

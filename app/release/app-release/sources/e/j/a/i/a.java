package e.j.a.i;

import android.content.Context;
import android.widget.Scroller;

public class a extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    public int f4963a = 1000;

    public a(Context context) {
        super(context);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f4963a);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f4963a);
    }
}

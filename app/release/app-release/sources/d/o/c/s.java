package d.o.c;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.m f3661a;
    public int b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3662c = new Rect();

    public /* synthetic */ s(RecyclerView.m mVar, q qVar) {
        this.f3661a = mVar;
    }

    public static s a(RecyclerView.m mVar, int i) {
        if (i == 0) {
            return new q(mVar);
        }
        if (i == 1) {
            return new r(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return g() - this.b;
    }
}

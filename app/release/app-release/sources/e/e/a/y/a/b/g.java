package e.e.a.y.a.b;

import android.content.Context;
import android.view.View;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public Context f4583a;
    public View b;

    /* renamed from: c  reason: collision with root package name */
    public f f4584c;

    public g(Context context, View view) {
        this.f4583a = context;
        this.b = view;
    }

    public final f a() {
        if (this.f4584c == null) {
            f fVar = new f();
            this.f4584c = fVar;
            View view = this.b;
            if (view != null) {
                view.setBackground(fVar);
            }
        }
        return this.f4584c;
    }

    public float[] b() {
        return a().s;
    }
}

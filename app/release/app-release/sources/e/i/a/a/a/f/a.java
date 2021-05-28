package e.i.a.a.a.f;

import android.graphics.PointF;
import android.view.View;
import e.i.a.a.a.g.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public PointF f4905a;
    public a b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4906c = true;

    public boolean a(View view) {
        a aVar = this.b;
        return aVar != null ? aVar.a(view) : b.a(view, this.f4905a, this.f4906c);
    }

    public boolean b(View view) {
        a aVar = this.b;
        return aVar != null ? aVar.b(view) : b.a(view, this.f4905a);
    }
}

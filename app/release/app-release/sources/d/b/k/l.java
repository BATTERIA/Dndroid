package d.b.k;

import android.view.View;
import d.g.l.p;
import d.g.l.y;

public class l implements d.g.l.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2684a;

    public l(k kVar) {
        this.f2684a = kVar;
    }

    @Override // d.g.l.l
    public y a(View view, y yVar) {
        int d2 = yVar.d();
        int f2 = this.f2684a.f(d2);
        if (d2 != f2) {
            yVar = yVar.a(yVar.b(), f2, yVar.c(), yVar.a());
        }
        return p.a(view, yVar);
    }
}

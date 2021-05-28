package d.b.k;

import android.view.View;
import d.g.l.v;
import d.g.l.w;

public class p extends w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2689a;

    public p(k kVar) {
        this.f2689a = kVar;
    }

    @Override // d.g.l.v
    public void a(View view) {
        this.f2689a.o.setAlpha(1.0f);
        this.f2689a.r.a((v) null);
        this.f2689a.r = null;
    }

    @Override // d.g.l.v, d.g.l.w
    public void b(View view) {
        this.f2689a.o.setVisibility(0);
        this.f2689a.o.sendAccessibilityEvent(32);
        if (this.f2689a.o.getParent() instanceof View) {
            d.g.l.p.u((View) this.f2689a.o.getParent());
        }
    }
}

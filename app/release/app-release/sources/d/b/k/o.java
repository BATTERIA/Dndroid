package d.b.k;

import android.view.View;
import d.g.l.p;
import d.g.l.u;
import d.g.l.v;
import d.g.l.w;

public class o implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2687c;

    public class a extends w {
        public a() {
        }

        @Override // d.g.l.v
        public void a(View view) {
            o.this.f2687c.o.setAlpha(1.0f);
            o.this.f2687c.r.a((v) null);
            o.this.f2687c.r = null;
        }

        @Override // d.g.l.v, d.g.l.w
        public void b(View view) {
            o.this.f2687c.o.setVisibility(0);
        }
    }

    public o(k kVar) {
        this.f2687c = kVar;
    }

    public void run() {
        k kVar = this.f2687c;
        kVar.p.showAtLocation(kVar.o, 55, 0, 0);
        this.f2687c.d();
        if (this.f2687c.i()) {
            this.f2687c.o.setAlpha(0.0f);
            k kVar2 = this.f2687c;
            u a2 = p.a(kVar2.o);
            a2.a(1.0f);
            kVar2.r = a2;
            u uVar = this.f2687c.r;
            a aVar = new a();
            View view = uVar.f3355a.get();
            if (view != null) {
                uVar.a(view, aVar);
                return;
            }
            return;
        }
        this.f2687c.o.setAlpha(1.0f);
        this.f2687c.o.setVisibility(0);
    }
}

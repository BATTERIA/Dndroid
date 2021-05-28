package d.b.n;

import android.view.View;
import android.view.animation.Interpolator;
import d.g.l.u;
import d.g.l.v;
import d.g.l.w;
import java.util.ArrayList;
import java.util.Iterator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<u> f2766a = new ArrayList<>();
    public long b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f2767c;

    /* renamed from: d  reason: collision with root package name */
    public v f2768d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2769e;

    /* renamed from: f  reason: collision with root package name */
    public final w f2770f = new a();

    public class a extends w {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2771a = false;
        public int b = 0;

        public a() {
        }

        @Override // d.g.l.v
        public void a(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == g.this.f2766a.size()) {
                v vVar = g.this.f2768d;
                if (vVar != null) {
                    vVar.a(null);
                }
                this.b = 0;
                this.f2771a = false;
                g.this.f2769e = false;
            }
        }

        @Override // d.g.l.v, d.g.l.w
        public void b(View view) {
            if (!this.f2771a) {
                this.f2771a = true;
                v vVar = g.this.f2768d;
                if (vVar != null) {
                    vVar.b(null);
                }
            }
        }
    }

    public void a() {
        if (this.f2769e) {
            Iterator<u> it = this.f2766a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f2769e = false;
        }
    }

    public void b() {
        View view;
        if (!this.f2769e) {
            Iterator<u> it = this.f2766a.iterator();
            while (it.hasNext()) {
                u next = it.next();
                long j = this.b;
                if (j >= 0) {
                    next.a(j);
                }
                Interpolator interpolator = this.f2767c;
                if (!(interpolator == null || (view = next.f3355a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f2768d != null) {
                    next.a(this.f2770f);
                }
                View view2 = next.f3355a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f2769e = true;
        }
    }
}

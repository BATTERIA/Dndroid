package d.b.o;

import android.view.View;
import d.b.n.i.r;
import d.b.o.v;

public class u extends e0 {
    public final /* synthetic */ v.b l;
    public final /* synthetic */ v m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(v vVar, View view, v.b bVar) {
        super(view);
        this.m = vVar;
        this.l = bVar;
    }

    @Override // d.b.o.e0
    public r b() {
        return this.l;
    }

    @Override // d.b.o.e0
    public boolean c() {
        if (this.m.f2993h.c()) {
            return true;
        }
        this.m.f2993h.a();
        return true;
    }
}

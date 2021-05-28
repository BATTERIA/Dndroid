package d.j.d;

import androidx.fragment.app.Fragment;
import d.g.h.a;
import d.j.d.g0;
import d.j.d.q;

public final class a0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0.a f3404c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Fragment f3405d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f3406e;

    public a0(g0.a aVar, Fragment fragment, a aVar2) {
        this.f3404c = aVar;
        this.f3405d = fragment;
        this.f3406e = aVar2;
    }

    public void run() {
        ((q.b) this.f3404c).a(this.f3405d, this.f3406e);
    }
}

package d.j.d;

import androidx.fragment.app.Fragment;
import d.g.h.a;
import d.j.d.g0;
import d.j.d.q;

public final class c0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0.a f3415c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Fragment f3416d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f3417e;

    public c0(g0.a aVar, Fragment fragment, a aVar2) {
        this.f3415c = aVar;
        this.f3416d = fragment;
        this.f3417e = aVar2;
    }

    public void run() {
        ((q.b) this.f3415c).a(this.f3416d, this.f3417e);
    }
}

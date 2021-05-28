package d.j.d;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.d.a;

public final class e0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f3427c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Fragment f3428d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3429e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f3430f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f3431g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p0 f3432h;
    public final /* synthetic */ Rect i;

    public e0(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, p0 p0Var, Rect rect) {
        this.f3427c = fragment;
        this.f3428d = fragment2;
        this.f3429e = z;
        this.f3430f = aVar;
        this.f3431g = view;
        this.f3432h = p0Var;
        this.i = rect;
    }

    public void run() {
        g0.a(this.f3427c, this.f3428d, this.f3429e, (a<String, View>) this.f3430f, false);
        View view = this.f3431g;
        if (view != null) {
            this.f3432h.a(view, this.i);
        }
    }
}

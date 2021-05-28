package d.j.d;

import android.view.View;
import d.g.l.p;
import java.util.ArrayList;

public class m0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3475c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3476d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3477e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3478f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3479g;

    public m0(p0 p0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3475c = i;
        this.f3476d = arrayList;
        this.f3477e = arrayList2;
        this.f3478f = arrayList3;
        this.f3479g = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f3475c; i++) {
            p.a((View) this.f3476d.get(i), (String) this.f3477e.get(i));
            p.a((View) this.f3478f.get(i), (String) this.f3479g.get(i));
        }
    }
}

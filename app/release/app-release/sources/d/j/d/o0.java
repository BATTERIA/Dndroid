package d.j.d;

import android.view.View;
import d.g.l.p;
import java.util.ArrayList;
import java.util.Map;

public class o0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3487c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f3488d;

    public o0(p0 p0Var, ArrayList arrayList, Map map) {
        this.f3487c = arrayList;
        this.f3488d = map;
    }

    public void run() {
        int size = this.f3487c.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f3487c.get(i);
            p.a(view, (String) this.f3488d.get(p.k(view)));
        }
    }
}

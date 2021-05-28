package d.o.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.k;
import java.util.ArrayList;
import java.util.Iterator;

public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3598c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3599d;

    public d(k kVar, ArrayList arrayList) {
        this.f3599d = kVar;
        this.f3598c = arrayList;
    }

    public void run() {
        Iterator it = this.f3598c.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f3599d;
            View view = null;
            if (kVar != null) {
                RecyclerView.a0 a0Var = aVar.f3620a;
                View view2 = a0Var == null ? null : a0Var.f2452a;
                RecyclerView.a0 a0Var2 = aVar.b;
                if (a0Var2 != null) {
                    view = a0Var2.f2452a;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f2466f);
                    kVar.r.add(aVar.f3620a);
                    duration.translationX((float) (aVar.f3623e - aVar.f3621c));
                    duration.translationY((float) (aVar.f3624f - aVar.f3622d));
                    duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    kVar.r.add(aVar.b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f2466f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
                }
            } else {
                throw null;
            }
        }
        this.f3598c.clear();
        this.f3599d.n.remove(this.f3598c);
    }
}

package d.o.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3600c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3601d;

    public e(k kVar, ArrayList arrayList) {
        this.f3601d = kVar;
        this.f3600c = arrayList;
    }

    public void run() {
        Iterator it = this.f3600c.iterator();
        while (it.hasNext()) {
            RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
            k kVar = this.f3601d;
            if (kVar != null) {
                View view = a0Var.f2452a;
                ViewPropertyAnimator animate = view.animate();
                kVar.o.add(a0Var);
                animate.alpha(1.0f).setDuration(kVar.f2463c).setListener(new g(kVar, a0Var, view, animate)).start();
            } else {
                throw null;
            }
        }
        this.f3600c.clear();
        this.f3601d.l.remove(this.f3600c);
    }
}

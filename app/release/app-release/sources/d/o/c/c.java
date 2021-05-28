package d.o.c;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.k;
import java.util.ArrayList;
import java.util.Iterator;

public class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3596c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f3597d;

    public c(k kVar, ArrayList arrayList) {
        this.f3597d = kVar;
        this.f3596c = arrayList;
    }

    public void run() {
        Iterator it = this.f3596c.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f3597d;
            RecyclerView.a0 a0Var = bVar.f3625a;
            int i = bVar.b;
            int i2 = bVar.f3626c;
            int i3 = bVar.f3627d;
            int i4 = bVar.f3628e;
            if (kVar != null) {
                View view = a0Var.f2452a;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.p.add(a0Var);
                animate.setDuration(kVar.f2465e).setListener(new h(kVar, a0Var, i5, view, i6, animate)).start();
            } else {
                throw null;
            }
        }
        this.f3596c.clear();
        this.f3597d.m.remove(this.f3596c);
    }
}

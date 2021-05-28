package d.b.o;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import d.b.n.i.j;

public class u0 implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Toolbar f2987c;

    public u0(Toolbar toolbar) {
        this.f2987c = toolbar;
    }

    public void onClick(View view) {
        Toolbar.c cVar = this.f2987c.M;
        j jVar = cVar == null ? null : cVar.f2349d;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }
}

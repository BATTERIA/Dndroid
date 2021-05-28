package e.j.a.e;

import android.view.View;
import e.j.a.a;
import e.j.a.e.b;

public class a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4929c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f4930d;

    public a(b bVar, int i) {
        this.f4930d = bVar;
        this.f4929c = i;
    }

    public void onClick(View view) {
        b.a aVar = this.f4930d.f4934f;
        if (aVar != null) {
            int i = this.f4929c;
            a.b bVar = ((e.j.a.b) aVar).f4928a.f4922d;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }
}

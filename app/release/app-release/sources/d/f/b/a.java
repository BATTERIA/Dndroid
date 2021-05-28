package d.f.b;

import android.view.View;
import d.f.b.b;
import d.g.l.l;
import d.g.l.p;
import d.g.l.y;
import java.util.Objects;

public class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f3223a;

    public a(b bVar) {
        this.f3223a = bVar;
    }

    @Override // d.g.l.l
    public y a(View view, y yVar) {
        b.AbstractC0097b bVar;
        b bVar2 = this.f3223a;
        if (!Objects.equals(bVar2.j, yVar)) {
            bVar2.j = yVar;
            boolean z = true;
            boolean z2 = yVar != null && yVar.d() > 0;
            bVar2.k = z2;
            if (z2 || bVar2.getBackground() != null) {
                z = false;
            }
            bVar2.setWillNotDraw(z);
            if (!yVar.e()) {
                int childCount = bVar2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = bVar2.getChildAt(i);
                    if (p.e(childAt) && (bVar = ((b.d) childAt.getLayoutParams()).f3230a) != null) {
                        yVar = bVar.a(yVar);
                        if (yVar.e()) {
                            break;
                        }
                    }
                }
            }
            bVar2.requestLayout();
        }
        return yVar;
    }
}

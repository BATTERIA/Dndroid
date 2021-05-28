package e.e.a.o.k;

import android.content.Context;
import android.widget.RelativeLayout;
import com.didi.hummer.render.style.HummerLayout;
import e.e.a.y.a.b.j;
import e.i.a.a.a.b.d;
import e.i.a.a.a.b.f;

public class b extends e.i.a.a.a.f.b implements d {

    /* renamed from: f  reason: collision with root package name */
    public a f4400f;

    public interface a {
        void a();

        void b();

        void c();
    }

    public b(Context context) {
        super(context, null, 0);
    }

    public void a(j jVar) {
        HummerLayout hummerLayout = new HummerLayout(jVar.getContext());
        hummerLayout.a(jVar, -1);
        addView(hummerLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    @Override // e.i.a.a.a.e.g, e.i.a.a.a.f.b
    public void a(f fVar, e.i.a.a.a.c.b bVar, e.i.a.a.a.c.b bVar2) {
        a aVar;
        super.a(fVar, bVar, bVar2);
        int ordinal = bVar2.ordinal();
        if (ordinal == 1) {
            a aVar2 = this.f4400f;
            if (aVar2 != null) {
                aVar2.c();
            }
        } else if (ordinal == 9) {
            a aVar3 = this.f4400f;
            if (aVar3 != null) {
                aVar3.a();
            }
        } else if (ordinal == 14 && (aVar = this.f4400f) != null) {
            aVar.b();
        }
    }

    public void setOnRefreshListener(a aVar) {
        this.f4400f = aVar;
    }
}

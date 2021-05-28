package e.e.a.o.k;

import android.content.Context;
import android.widget.RelativeLayout;
import com.didi.hummer.render.style.HummerLayout;
import e.e.a.y.a.b.j;
import e.i.a.a.a.b.c;
import e.i.a.a.a.b.f;
import e.i.a.a.a.f.b;

public class a extends b implements c {

    /* renamed from: f  reason: collision with root package name */
    public AbstractC0135a f4399f;

    /* renamed from: e.e.a.o.k.a$a  reason: collision with other inner class name */
    public interface AbstractC0135a {
        void a();

        void b();

        void c();
    }

    public a(Context context) {
        super(context, null, 0);
    }

    public void a(j jVar) {
        HummerLayout hummerLayout = new HummerLayout(jVar.getContext());
        hummerLayout.a(jVar, -1);
        addView(hummerLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    @Override // e.i.a.a.a.e.g, e.i.a.a.a.f.b
    public void a(f fVar, e.i.a.a.a.c.b bVar, e.i.a.a.a.c.b bVar2) {
        AbstractC0135a aVar;
        int ordinal = bVar2.ordinal();
        if (ordinal == 2) {
            AbstractC0135a aVar2 = this.f4399f;
            if (aVar2 != null) {
                aVar2.c();
            }
        } else if (ordinal == 12) {
            AbstractC0135a aVar3 = this.f4399f;
            if (aVar3 != null) {
                aVar3.a();
            }
        } else if (ordinal == 15 && (aVar = this.f4399f) != null) {
            aVar.b();
        }
    }

    public void setOnLoadListener(AbstractC0135a aVar) {
        this.f4399f = aVar;
    }
}

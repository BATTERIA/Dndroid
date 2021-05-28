package e.e.a.o.q;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import e.c.a.b.l;
import e.e.a.o.q.e;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;
import java.util.ArrayList;
import java.util.List;

public class d extends e<b> {

    /* renamed from: d  reason: collision with root package name */
    public Context f4431d;

    /* renamed from: e  reason: collision with root package name */
    public e.e.a.x.b f4432e;

    /* renamed from: f  reason: collision with root package name */
    public List<Object> f4433f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f4434g;

    /* renamed from: h  reason: collision with root package name */
    public a f4435h;
    public e.e.a.q.b.a i;

    public interface a {
        void a(int i);
    }

    public class b extends e.a {
        public boolean b = true;

        /* renamed from: c  reason: collision with root package name */
        public c f4436c;

        /* renamed from: d  reason: collision with root package name */
        public int f4437d;

        public b(View view, c cVar) {
            super(view);
            this.f4436c = cVar;
            this.f4440a.setOnClickListener(new a(this));
        }

        public /* synthetic */ void a(View view) {
            a aVar = d.this.f4435h;
            if (aVar != null) {
                aVar.a(this.f4437d);
            }
        }
    }

    public d(Context context, e.e.a.x.b bVar) {
        this.f4431d = context;
        this.f4432e = bVar;
    }

    public int a(int i2) {
        return e.j.a.k.a.a(this.f4434g, i2, this.f4433f.size());
    }

    public final View b(int i2) {
        Object obj = this.f4433f.get(i2);
        if (obj == null) {
            return new View(this.f4431d);
        }
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return new View(this.f4431d);
        }
        ImageView imageView = new ImageView(this.f4431d);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((e.e.a.n.b.c.a) l.f.b(((e.e.a.p.b) this.f4431d).f4442c)).a(obj2, imageView);
        return imageView;
    }

    @Override // e.e.a.o.q.e
    public int d() {
        if (!this.f4434g || this.f4433f.size() <= 1) {
            return this.f4433f.size();
        }
        return 100000;
    }

    /* Return type fixed from 'e.e.a.o.q.e$a' to match base method */
    @Override // e.e.a.o.q.e
    public b b(ViewGroup viewGroup, int i2) {
        int a2 = e.j.a.k.a.a(this.f4434g, i2, this.f4433f.size());
        e.e.a.q.b.a aVar = this.i;
        if (aVar == null) {
            return new b(b(a2), null);
        }
        c cVar = (c) aVar.a(Integer.valueOf(a2));
        if (cVar == null) {
            return new b(b(a2), null);
        }
        cVar.l();
        j jVar = (j) ((e.e.a.x.a) this.f4432e).a(cVar.a("objID"));
        return (jVar == null || jVar.getView() == null) ? new b(b(a2), null) : new b(jVar.getView(), cVar);
    }
}

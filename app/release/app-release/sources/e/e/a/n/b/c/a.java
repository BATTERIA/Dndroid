package e.e.a.n.b.c;

import android.widget.ImageView;
import e.d.a.e;
import e.d.a.q.f.c;
import e.d.a.q.g.d;
import e.d.a.q.g.g;
import e.e.a.k;
import e.e.a.n.b.b;

public class a implements b {

    /* renamed from: e.e.a.n.b.c.a$a  reason: collision with other inner class name */
    public class C0132a extends g<e.d.a.m.k.e.b> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.e.a.n.b.a f4335d;

        public C0132a(a aVar, e.e.a.n.b.a aVar2) {
            this.f4335d = aVar2;
        }

        @Override // e.d.a.q.g.a
        public void a(Object obj, c cVar) {
            e.d.a.m.k.e.b bVar = (e.d.a.m.k.e.b) obj;
            e.e.a.n.b.a aVar = this.f4335d;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, e.e.a.n.b.a aVar) {
        try {
            e.d.a.b a2 = e.b(k.f4312a).a(String.class);
            a2.i = str;
            a2.k = true;
            a2.a(new C0132a(this, aVar));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, int i, ImageView imageView) {
        if (i == 0) {
            i = -1;
        }
        try {
            e.d.a.b a2 = e.b(imageView.getContext()).a(String.class);
            a2.i = str;
            a2.k = true;
            a2.r = e.d.a.m.i.b.SOURCE;
            a2.a(new d(imageView, i));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, ImageView imageView) {
        try {
            e.d.a.b a2 = e.b(imageView.getContext()).a(String.class);
            a2.i = str;
            a2.k = true;
            a2.a(imageView);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

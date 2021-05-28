package e.e.a.o.q;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import e.c.a.b.l;
import e.e.a.o.b;
import e.e.a.o.q.d;
import e.e.a.o.q.e.a;
import java.util.LinkedList;

public abstract class e<VH extends a> extends d.s.a.a {

    /* renamed from: c  reason: collision with root package name */
    public LinkedList<VH> f4439c = new LinkedList<>();

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public View f4440a;

        public a(View view) {
            if (view != null) {
                this.f4440a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }
    }

    @Override // d.s.a.a
    public int a() {
        return d();
    }

    @Override // d.s.a.a
    public Object a(ViewGroup viewGroup, int i) {
        VH vh;
        LinkedList<VH> linkedList = this.f4439c;
        if (linkedList == null || (vh = linkedList.pollLast()) == null) {
            vh = b(viewGroup, i);
            vh.f4440a.setTag(b.holder_id, vh);
        }
        d dVar = (d) this;
        d.b bVar = (d.b) vh;
        int a2 = e.j.a.k.a.a(dVar.f4434g, i, dVar.f4433f.size());
        bVar.f4437d = a2;
        if (bVar.b) {
            bVar.b = false;
        } else {
            e.e.a.q.b.a aVar = d.this.i;
            if (aVar != null && bVar.f4436c != null) {
                aVar.a(Integer.valueOf(a2), bVar.f4436c);
            } else if (bVar.f4440a instanceof ImageView) {
                String obj = d.this.f4433f.get(a2).toString();
                if (!TextUtils.isEmpty(obj)) {
                    ((e.e.a.n.b.c.a) l.f.b(((e.e.a.p.b) d.this.f4431d).f4442c)).a(obj, (ImageView) bVar.f4440a);
                }
            }
        }
        viewGroup.addView(vh.f4440a);
        return vh.f4440a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.LinkedList<VH extends e.e.a.o.q.e$a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.s.a.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        this.f4439c.push((a) view.getTag(b.holder_id));
    }

    @Override // d.s.a.a
    public boolean a(View view, Object obj) {
        return view == obj;
    }

    public abstract VH b(ViewGroup viewGroup, int i);

    public abstract int d();
}

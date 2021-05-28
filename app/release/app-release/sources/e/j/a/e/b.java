package e.j.a.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.didi.hummer.component.viewpager.ViewPager;
import e.e.a.o.c;
import e.j.a.f.b;
import java.util.ArrayList;
import java.util.List;

public class b<T, VH extends e.j.a.f.b> extends d.s.a.a {

    /* renamed from: c  reason: collision with root package name */
    public List<T> f4931c;

    /* renamed from: d  reason: collision with root package name */
    public e.j.a.f.a f4932d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4933e;

    /* renamed from: f  reason: collision with root package name */
    public a f4934f;

    public interface a {
    }

    public b(List<T> list, e.j.a.f.a<VH> aVar) {
        ArrayList arrayList = new ArrayList();
        this.f4931c = arrayList;
        arrayList.addAll(list);
        this.f4932d = aVar;
    }

    @Override // d.s.a.a
    public int a() {
        if (!this.f4933e || this.f4931c.size() <= 1) {
            return this.f4931c.size();
        }
        return 500;
    }

    @Override // d.s.a.a
    public Object a(ViewGroup viewGroup, int i) {
        int a2 = e.j.a.k.a.a(this.f4933e, i, this.f4931c.size());
        e.j.a.f.b a3 = this.f4932d.a();
        if (a3 != null) {
            ViewPager.c cVar = (ViewPager.c) a3;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(c.viewpager_empty_view, viewGroup, false);
            List<T> list = this.f4931c;
            if (list != null && list.size() > 0) {
                if (inflate != null) {
                    inflate.setOnClickListener(new a(this, a2));
                }
                this.f4931c.get(a2);
                this.f4931c.size();
            }
            viewGroup.addView(inflate);
            return inflate;
        }
        throw new NullPointerException("Can not return a null holder");
    }

    @Override // d.s.a.a
    public void a(ViewGroup viewGroup) {
    }

    @Override // d.s.a.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // d.s.a.a
    public boolean a(View view, Object obj) {
        return view == obj;
    }

    public int d() {
        return this.f4931c.size();
    }
}

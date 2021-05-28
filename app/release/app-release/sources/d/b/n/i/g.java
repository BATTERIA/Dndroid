package d.b.n.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import d.b.n.i.p;
import java.util.ArrayList;

public class g extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    public h f2812c;

    /* renamed from: d  reason: collision with root package name */
    public int f2813d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2814e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2815f;

    /* renamed from: g  reason: collision with root package name */
    public final LayoutInflater f2816g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2817h;

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2815f = z;
        this.f2816g = layoutInflater;
        this.f2812c = hVar;
        this.f2817h = i;
        a();
    }

    public void a() {
        h hVar = this.f2812c;
        j jVar = hVar.w;
        if (jVar != null) {
            hVar.a();
            ArrayList<j> arrayList = hVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == jVar) {
                    this.f2813d = i;
                    return;
                }
            }
        }
        this.f2813d = -1;
    }

    public int getCount() {
        ArrayList<j> arrayList;
        if (this.f2815f) {
            h hVar = this.f2812c;
            hVar.a();
            arrayList = hVar.j;
        } else {
            arrayList = this.f2812c.d();
        }
        int i = this.f2813d;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    public j getItem(int i) {
        ArrayList<j> arrayList;
        if (this.f2815f) {
            h hVar = this.f2812c;
            hVar.a();
            arrayList = hVar.j;
        } else {
            arrayList = this.f2812c.d();
        }
        int i2 = this.f2813d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2816g.inflate(this.f2817h, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2812c.e() && i2 != (i3 >= 0 ? getItem(i3).b : i2));
        p.a aVar = (p.a) view;
        if (this.f2814e) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

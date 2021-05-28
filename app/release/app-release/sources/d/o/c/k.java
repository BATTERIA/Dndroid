package d.o.c;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class k extends y {
    public static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f3619h = new ArrayList<>();
    public ArrayList<RecyclerView.a0> i = new ArrayList<>();
    public ArrayList<b> j = new ArrayList<>();
    public ArrayList<a> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.a0>> l = new ArrayList<>();
    public ArrayList<ArrayList<b>> m = new ArrayList<>();
    public ArrayList<ArrayList<a>> n = new ArrayList<>();
    public ArrayList<RecyclerView.a0> o = new ArrayList<>();
    public ArrayList<RecyclerView.a0> p = new ArrayList<>();
    public ArrayList<RecyclerView.a0> q = new ArrayList<>();
    public ArrayList<RecyclerView.a0> r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3620a;
        public RecyclerView.a0 b;

        /* renamed from: c  reason: collision with root package name */
        public int f3621c;

        /* renamed from: d  reason: collision with root package name */
        public int f3622d;

        /* renamed from: e  reason: collision with root package name */
        public int f3623e;

        /* renamed from: f  reason: collision with root package name */
        public int f3624f;

        public a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i, int i2, int i3, int i4) {
            this.f3620a = a0Var;
            this.b = a0Var2;
            this.f3621c = i;
            this.f3622d = i2;
            this.f3623e = i3;
            this.f3624f = i4;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("ChangeInfo{oldHolder=");
            a2.append(this.f3620a);
            a2.append(", newHolder=");
            a2.append(this.b);
            a2.append(", fromX=");
            a2.append(this.f3621c);
            a2.append(", fromY=");
            a2.append(this.f3622d);
            a2.append(", toX=");
            a2.append(this.f3623e);
            a2.append(", toY=");
            a2.append(this.f3624f);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f3625a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f3626c;

        /* renamed from: d  reason: collision with root package name */
        public int f3627d;

        /* renamed from: e  reason: collision with root package name */
        public int f3628e;

        public b(RecyclerView.a0 a0Var, int i, int i2, int i3, int i4) {
            this.f3625a = a0Var;
            this.b = i;
            this.f3626c = i2;
            this.f3627d = i3;
            this.f3628e = i4;
        }
    }

    public void a(List<RecyclerView.a0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2452a.animate().cancel();
        }
    }

    public final void a(List<a> list, RecyclerView.a0 a0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (a(aVar, a0Var) && aVar.f3620a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    @Override // d.o.c.y
    public boolean a(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5) {
        View view = a0Var.f2452a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) a0Var.f2452a.getTranslationY());
        e(a0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            a(a0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new b(a0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.a0 a0Var, List<Object> list) {
        return !list.isEmpty() || super.a(a0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void b(RecyclerView.a0 a0Var) {
        View view = a0Var.f2452a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f3625a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(a0Var);
                this.j.remove(size);
            }
        }
        a(this.k, a0Var);
        if (this.f3619h.remove(a0Var)) {
            view.setAlpha(1.0f);
            a(a0Var);
        }
        if (this.i.remove(a0Var)) {
            view.setAlpha(1.0f);
            a(a0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.n.get(size2);
            a(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3625a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.a0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(a0Var)) {
                view.setAlpha(1.0f);
                a(a0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(a0Var);
        this.o.remove(a0Var);
        this.r.remove(a0Var);
        this.p.remove(a0Var);
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean c() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.f3619h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public void d() {
        if (!c()) {
            a();
        }
    }

    public final void e(RecyclerView.a0 a0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        a0Var.f2452a.animate().setInterpolator(s);
        b(a0Var);
    }

    public final boolean a(a aVar, RecyclerView.a0 a0Var) {
        if (aVar.b == a0Var) {
            aVar.b = null;
        } else if (aVar.f3620a != a0Var) {
            return false;
        } else {
            aVar.f3620a = null;
        }
        a0Var.f2452a.setAlpha(1.0f);
        a0Var.f2452a.setTranslationX(0.0f);
        a0Var.f2452a.setTranslationY(0.0f);
        a(a0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void b() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.j.get(size);
            View view = bVar.f3625a.f2452a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(bVar.f3625a);
            this.j.remove(size);
        }
        int size2 = this.f3619h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a(this.f3619h.get(size2));
            this.f3619h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.i.get(size3);
            a0Var.f2452a.setAlpha(1.0f);
            a(a0Var);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.k.get(size4);
            RecyclerView.a0 a0Var2 = aVar.f3620a;
            if (a0Var2 != null) {
                a(aVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = aVar.b;
            if (a0Var3 != null) {
                a(aVar, a0Var3);
            }
        }
        this.k.clear();
        if (c()) {
            int size5 = this.m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<b> arrayList = this.m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = arrayList.get(size6);
                        View view2 = bVar2.f3625a.f2452a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        a(bVar2.f3625a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.a0> arrayList2 = this.l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.a0 a0Var4 = arrayList2.get(size8);
                        a0Var4.f2452a.setAlpha(1.0f);
                        a(a0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList<a> arrayList3 = this.n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = arrayList3.get(size10);
                            RecyclerView.a0 a0Var5 = aVar2.f3620a;
                            if (a0Var5 != null) {
                                a(aVar2, a0Var5);
                            }
                            RecyclerView.a0 a0Var6 = aVar2.b;
                            if (a0Var6 != null) {
                                a(aVar2, a0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    a(this.q);
                    a(this.p);
                    a(this.o);
                    a(this.r);
                    a();
                    return;
                }
            }
        }
    }
}

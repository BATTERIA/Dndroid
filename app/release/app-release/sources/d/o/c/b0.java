package d.o.c;

import androidx.recyclerview.widget.RecyclerView;
import d.d.e;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final d.d.a<RecyclerView.a0, a> f3592a = new d.d.a<>();
    public final e<RecyclerView.a0> b = new e<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static d.g.k.b<a> f3593d = new d.g.k.b<>(20);

        /* renamed from: a  reason: collision with root package name */
        public int f3594a;
        public RecyclerView.j.c b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f3595c;

        public static a a() {
            a a2 = f3593d.a();
            return a2 == null ? new a() : a2;
        }

        public static void a(a aVar) {
            aVar.f3594a = 0;
            aVar.b = null;
            aVar.f3595c = null;
            f3593d.a(aVar);
        }
    }

    public interface b {
    }

    public final RecyclerView.j.c a(RecyclerView.a0 a0Var, int i) {
        a d2;
        RecyclerView.j.c cVar;
        int b2 = this.f3592a.b(a0Var);
        if (b2 >= 0 && (d2 = this.f3592a.d(b2)) != null) {
            int i2 = d2.f3594a;
            if ((i2 & i) != 0) {
                d2.f3594a = (i ^ -1) & i2;
                if (i == 4) {
                    cVar = d2.b;
                } else if (i == 8) {
                    cVar = d2.f3595c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d2.f3594a & 12) == 0) {
                    this.f3592a.c(b2);
                    a.a(d2);
                }
                return cVar;
            }
        }
        return null;
    }

    public void a(RecyclerView.a0 a0Var) {
        a orDefault = this.f3592a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3592a.put(a0Var, orDefault);
        }
        orDefault.f3594a |= 1;
    }

    public void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3592a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3592a.put(a0Var, orDefault);
        }
        orDefault.b = cVar;
        orDefault.f3594a |= 4;
    }

    public void c(RecyclerView.a0 a0Var) {
        a orDefault = this.f3592a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f3594a &= -2;
        }
    }

    public void d(RecyclerView.a0 a0Var) {
        int d2 = this.b.d() - 1;
        while (true) {
            if (d2 < 0) {
                break;
            } else if (a0Var == this.b.a(d2)) {
                e<RecyclerView.a0> eVar = this.b;
                Object[] objArr = eVar.f3074e;
                Object obj = objArr[d2];
                Object obj2 = e.f3071g;
                if (obj != obj2) {
                    objArr[d2] = obj2;
                    eVar.f3072c = true;
                }
            } else {
                d2--;
            }
        }
        a remove = this.f3592a.remove(a0Var);
        if (remove != null) {
            a.a(remove);
        }
    }

    public void a(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3592a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3592a.put(a0Var, orDefault);
        }
        orDefault.f3595c = cVar;
        orDefault.f3594a |= 8;
    }

    public boolean b(RecyclerView.a0 a0Var) {
        a orDefault = this.f3592a.getOrDefault(a0Var, null);
        return (orDefault == null || (orDefault.f3594a & 1) == 0) ? false : true;
    }
}

package d.e.a.h;

import d.e.a.h.c;
import java.util.ArrayList;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f3196a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3197c;

    /* renamed from: d  reason: collision with root package name */
    public int f3198d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f3199e = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f3200a;
        public c b;

        /* renamed from: c  reason: collision with root package name */
        public int f3201c;

        /* renamed from: d  reason: collision with root package name */
        public c.b f3202d;

        /* renamed from: e  reason: collision with root package name */
        public int f3203e;

        public a(c cVar) {
            this.f3200a = cVar;
            this.b = cVar.f3150d;
            this.f3201c = cVar.a();
            this.f3202d = cVar.f3153g;
            this.f3203e = cVar.f3154h;
        }
    }

    public m(d dVar) {
        this.f3196a = dVar.I;
        this.b = dVar.J;
        this.f3197c = dVar.j();
        this.f3198d = dVar.d();
        ArrayList<c> b2 = dVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.f3199e.add(new a(b2.get(i)));
        }
    }
}

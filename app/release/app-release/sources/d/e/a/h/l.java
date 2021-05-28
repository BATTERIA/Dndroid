package d.e.a.h;

import java.util.HashSet;
import java.util.Iterator;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<l> f3195a = new HashSet<>(2);
    public int b = 0;

    public void a() {
        this.b = 1;
        Iterator<l> it = this.f3195a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void b() {
        this.b = 0;
        Iterator<l> it = this.f3195a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.b == 1;
    }

    public void d() {
    }
}

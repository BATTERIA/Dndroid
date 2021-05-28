package e.d.a.m.i.m;

import e.d.a.m.i.m.f;
import e.d.a.s.h;
import java.util.Queue;

public abstract class a<T extends f> {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f4008a = h.a(20);

    public void a(T t) {
        if (this.f4008a.size() < 20) {
            this.f4008a.offer(t);
        }
    }
}

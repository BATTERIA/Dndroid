package e.d.a.m.i;

import android.os.Looper;
import e.d.a.m.c;

public class h<Z> implements k<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final k<Z> f3993a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public a f3994c;

    /* renamed from: d  reason: collision with root package name */
    public c f3995d;

    /* renamed from: e  reason: collision with root package name */
    public int f3996e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3997f;

    public interface a {
    }

    public h(k<Z> kVar, boolean z) {
        if (kVar != null) {
            this.f3993a = kVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Wrapped resource must not be null");
    }

    @Override // e.d.a.m.i.k
    public void a() {
        if (this.f3996e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f3997f) {
            this.f3997f = true;
            this.f3993a.a();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    @Override // e.d.a.m.i.k
    public int b() {
        return this.f3993a.b();
    }

    public void c() {
        if (this.f3997f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f3996e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    public void d() {
        if (this.f3996e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f3996e - 1;
            this.f3996e = i;
            if (i == 0) {
                a aVar = this.f3994c;
                c cVar = this.f3995d;
                c cVar2 = (c) aVar;
                if (cVar2 != null) {
                    e.d.a.s.h.a();
                    cVar2.f3969e.remove(cVar);
                    if (this.b) {
                        ((e.d.a.m.i.n.h) cVar2.f3967c).a(cVar, (k) this);
                    } else {
                        cVar2.f3970f.a(this);
                    }
                } else {
                    throw null;
                }
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    @Override // e.d.a.m.i.k
    public Z get() {
        return this.f3993a.get();
    }
}

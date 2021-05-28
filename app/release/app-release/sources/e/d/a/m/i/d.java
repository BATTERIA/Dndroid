package e.d.a.m.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e.d.a.m.i.i;
import e.d.a.s.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class d implements i.a {
    public static final b q = new b();
    public static final Handler r = new Handler(Looper.getMainLooper(), new c(null));

    /* renamed from: a  reason: collision with root package name */
    public final List<e.d.a.q.d> f3979a = new ArrayList();
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3980c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.a.m.c f3981d;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f3982e;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f3983f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3984g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3985h;
    public k<?> i;
    public boolean j;
    public Exception k;
    public boolean l;
    public Set<e.d.a.q.d> m;
    public i n;
    public h<?> o;
    public volatile Future<?> p;

    public static class b {
    }

    public static class c implements Handler.Callback {
        public /* synthetic */ c(a aVar) {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (!(1 == i || 2 == i)) {
                return false;
            }
            d dVar = (d) message.obj;
            if (1 == message.what) {
                if (dVar.f3985h) {
                    dVar.i.a();
                } else if (!dVar.f3979a.isEmpty()) {
                    b bVar = dVar.b;
                    k<?> kVar = dVar.i;
                    boolean z = dVar.f3984g;
                    if (bVar != null) {
                        h<?> hVar = new h<>(kVar, z);
                        dVar.o = hVar;
                        dVar.j = true;
                        hVar.c();
                        ((c) dVar.f3980c).a(dVar.f3981d, dVar.o);
                        for (e.d.a.q.d dVar2 : dVar.f3979a) {
                            Set<e.d.a.q.d> set = dVar.m;
                            if (!(set != null && set.contains(dVar2))) {
                                dVar.o.c();
                                dVar2.a(dVar.o);
                            }
                        }
                        dVar.o.d();
                    } else {
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            } else if (!dVar.f3985h) {
                if (!dVar.f3979a.isEmpty()) {
                    dVar.l = true;
                    ((c) dVar.f3980c).a(dVar.f3981d, null);
                    for (e.d.a.q.d dVar3 : dVar.f3979a) {
                        Set<e.d.a.q.d> set2 = dVar.m;
                        if (!(set2 != null && set2.contains(dVar3))) {
                            dVar3.a(dVar.k);
                        }
                    }
                } else {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
            }
            return true;
        }
    }

    public d(e.d.a.m.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, e eVar) {
        b bVar = q;
        this.f3981d = cVar;
        this.f3982e = executorService;
        this.f3983f = executorService2;
        this.f3984g = z;
        this.f3980c = eVar;
        this.b = bVar;
    }

    @Override // e.d.a.q.d
    public void a(k<?> kVar) {
        this.i = kVar;
        r.obtainMessage(1, this).sendToTarget();
    }

    public void a(e.d.a.q.d dVar) {
        h.a();
        if (this.j) {
            dVar.a(this.o);
        } else if (this.l) {
            dVar.a(this.k);
        } else {
            this.f3979a.add(dVar);
        }
    }

    @Override // e.d.a.q.d
    public void a(Exception exc) {
        this.k = exc;
        r.obtainMessage(2, this).sendToTarget();
    }
}

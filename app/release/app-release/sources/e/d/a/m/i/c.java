package e.d.a.m.i;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import e.d.a.m.i.a;
import e.d.a.m.i.h;
import e.d.a.m.i.n.a;
import e.d.a.m.i.n.f;
import e.d.a.m.i.n.i;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class c implements e, i.a, h.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<e.d.a.m.c, d> f3966a = new HashMap();
    public final g b = new g();

    /* renamed from: c  reason: collision with root package name */
    public final i f3967c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3968d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<e.d.a.m.c, WeakReference<h<?>>> f3969e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final l f3970f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3971g;

    /* renamed from: h  reason: collision with root package name */
    public ReferenceQueue<h<?>> f3972h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f3973a;
        public final ExecutorService b;

        /* renamed from: c  reason: collision with root package name */
        public final e f3974c;

        public a(ExecutorService executorService, ExecutorService executorService2, e eVar) {
            this.f3973a = executorService;
            this.b = executorService2;
            this.f3974c = eVar;
        }
    }

    public static class b implements a.AbstractC0120a {

        /* renamed from: a  reason: collision with root package name */
        public final a.AbstractC0122a f3975a;
        public volatile e.d.a.m.i.n.a b;

        public b(a.AbstractC0122a aVar) {
            this.f3975a = aVar;
        }

        public e.d.a.m.i.n.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        e.d.a.m.i.n.d dVar = (e.d.a.m.i.n.d) this.f3975a;
                        f fVar = (f) dVar.b;
                        File cacheDir = fVar.f4038a.getCacheDir();
                        e.d.a.m.i.n.a aVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.b != null) {
                            cacheDir = new File(cacheDir, fVar.b);
                        }
                        if (cacheDir != null) {
                            if (!cacheDir.mkdirs()) {
                                if (cacheDir.exists()) {
                                    if (!cacheDir.isDirectory()) {
                                    }
                                }
                            }
                            aVar = e.d.a.m.i.n.e.a(cacheDir, dVar.f4032a);
                        }
                        this.b = aVar;
                    }
                    if (this.b == null) {
                        this.b = new e.d.a.m.i.n.b();
                    }
                }
            }
            return this.b;
        }
    }

    /* renamed from: e.d.a.m.i.c$c  reason: collision with other inner class name */
    public static class C0121c {

        /* renamed from: a  reason: collision with root package name */
        public final d f3976a;
        public final e.d.a.q.d b;

        public C0121c(e.d.a.q.d dVar, d dVar2) {
            this.b = dVar;
            this.f3976a = dVar2;
        }
    }

    public static class d implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Map<e.d.a.m.c, WeakReference<h<?>>> f3977a;
        public final ReferenceQueue<h<?>> b;

        public d(Map<e.d.a.m.c, WeakReference<h<?>>> map, ReferenceQueue<h<?>> referenceQueue) {
            this.f3977a = map;
            this.b = referenceQueue;
        }

        public boolean queueIdle() {
            e eVar = (e) this.b.poll();
            if (eVar == null) {
                return true;
            }
            this.f3977a.remove(eVar.f3978a);
            return true;
        }
    }

    public static class e extends WeakReference<h<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final e.d.a.m.c f3978a;

        public e(e.d.a.m.c cVar, h<?> hVar, ReferenceQueue<? super h<?>> referenceQueue) {
            super(hVar, referenceQueue);
            this.f3978a = cVar;
        }
    }

    public c(i iVar, a.AbstractC0122a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this.f3967c = iVar;
        this.f3971g = new b(aVar);
        this.f3968d = new a(executorService, executorService2, this);
        this.f3970f = new l();
        ((e.d.a.m.i.n.h) iVar).f4039d = this;
    }

    public static void a(String str, long j, e.d.a.m.c cVar) {
        StringBuilder a2 = e.a.a.a.a.a(str, " in ");
        a2.append(e.d.a.s.d.a(j));
        a2.append("ms, key: ");
        a2.append(cVar);
        Log.v("Engine", a2.toString());
    }

    public final ReferenceQueue<h<?>> a() {
        if (this.f3972h == null) {
            this.f3972h = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new d(this.f3969e, this.f3972h));
        }
        return this.f3972h;
    }

    public void a(e.d.a.m.c cVar, h<?> hVar) {
        e.d.a.s.h.a();
        if (hVar != null) {
            hVar.f3995d = cVar;
            hVar.f3994c = this;
            if (hVar.b) {
                this.f3969e.put(cVar, new e(cVar, hVar, a()));
            }
        }
        this.f3966a.remove(cVar);
    }
}

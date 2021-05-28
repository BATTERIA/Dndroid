package e.d.a.m.i;

import android.util.Log;
import e.d.a.g;
import e.d.a.q.d;
import e.e.a.q.d.c;

public class i implements Runnable, e.d.a.m.i.o.b {

    /* renamed from: c  reason: collision with root package name */
    public final g f3998c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3999d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, ?, ?> f4000e;

    /* renamed from: f  reason: collision with root package name */
    public b f4001f = b.CACHE;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f4002g;

    public interface a extends d {
    }

    public enum b {
        CACHE,
        SOURCE
    }

    public i(a aVar, a<?, ?, ?> aVar2, g gVar) {
        this.f3999d = aVar;
        this.f4000e = aVar2;
        this.f3998c = gVar;
    }

    @Override // e.d.a.m.i.o.b
    public int a() {
        return this.f3998c.ordinal();
    }

    /* JADX INFO: finally extract failed */
    public final k<?> b() {
        k<?> kVar;
        k<?> kVar2 = null;
        if (this.f4001f == b.CACHE) {
            try {
                kVar = this.f4000e.a();
            } catch (Exception e2) {
                if (Log.isLoggable("EngineRunnable", 3)) {
                    Log.d("EngineRunnable", "Exception decoding result from cache: " + e2);
                }
                kVar = null;
            }
            if (kVar != null) {
                return kVar;
            }
            a<?, ?, ?> aVar = this.f4000e;
            if (aVar.i.f3964c) {
                long a2 = e.d.a.s.d.a();
                k<?> a3 = aVar.a(aVar.f3951a.a());
                if (Log.isLoggable("DecodeJob", 2)) {
                    aVar.a("Decoded source from cache", a2);
                }
                kVar2 = aVar.a(a3);
            }
            return kVar2;
        }
        a<?, ?, ?> aVar2 = this.f4000e;
        if (aVar2 != null) {
            try {
                long a4 = e.d.a.s.d.a();
                c.a aVar3 = (A) aVar2.f3953d.a(aVar2.j);
                if (Log.isLoggable("DecodeJob", 2)) {
                    aVar2.a("Fetched data", a4);
                }
                if (!aVar2.l) {
                    kVar2 = aVar2.a(aVar3);
                }
                aVar2.f3953d.b();
                return aVar2.a(kVar2);
            } catch (Throwable th) {
                aVar2.f3953d.b();
                throw th;
            }
        } else {
            throw null;
        }
    }

    public void run() {
        Exception e2;
        if (!this.f4002g) {
            k<?> kVar = null;
            try {
                e2 = null;
                kVar = b();
            } catch (Exception e3) {
                e2 = e3;
                if (Log.isLoggable("EngineRunnable", 2)) {
                    Log.v("EngineRunnable", "Exception decoding", e2);
                }
            }
            if (this.f4002g) {
                if (kVar != null) {
                    kVar.a();
                }
            } else if (kVar == null) {
                if (this.f4001f == b.CACHE) {
                    this.f4001f = b.SOURCE;
                    d dVar = (d) this.f3999d;
                    dVar.p = dVar.f3983f.submit(this);
                    return;
                }
                this.f3999d.a(e2);
            } else {
                this.f3999d.a(kVar);
            }
        }
    }
}

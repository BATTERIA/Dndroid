package com.didi.hummer.module;

import android.content.Context;
import android.location.Location;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.c.a.b.l;
import e.e.a.g;
import e.e.a.k;
import e.e.a.n.c.c.d;
import e.e.a.n.c.c.e;
import e.e.a.n.c.c.i;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class HMLocation implements e.e.a.u.b {
    public static final int ONE_MINUTE = 60000;
    public Context context;
    public AtomicBoolean isDestroyed = new AtomicBoolean(false);
    public e.e.a.q.b.c jsValue;
    public e.e.a.n.c.a locationAdapter;
    public e.e.a.q.b.a onErrorCallback;
    public e.e.a.q.b.a onLocationCallback;

    public class a implements e.e.a.n.c.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.e.a.q.b.a f2636a;

        public a(e.e.a.q.b.a aVar) {
            this.f2636a = aVar;
        }

        @Override // e.e.a.n.c.b
        public void a(int i, String str) {
            if (!HMLocation.this.isDestroyed.get()) {
                if (HMLocation.this.onErrorCallback != null) {
                    HMLocation.this.onErrorCallback.a(Integer.valueOf(i), str);
                }
                HMLocation.this.jsValue.k();
            }
        }

        @Override // e.e.a.n.c.b
        public void onLocationChanged(Location location) {
            if (!HMLocation.this.isDestroyed.get()) {
                e.e.a.q.b.a aVar = this.f2636a;
                if (aVar != null) {
                    aVar.a(new c(HMLocation.this, location));
                    this.f2636a.d();
                }
                HMLocation.this.jsValue.k();
            }
        }
    }

    public class b implements e.e.a.n.c.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.e.a.q.b.a f2637a;

        public b(e.e.a.q.b.a aVar) {
            this.f2637a = aVar;
        }

        @Override // e.e.a.n.c.b
        public void a(int i, String str) {
            if (!HMLocation.this.isDestroyed.get()) {
                if (HMLocation.this.onErrorCallback != null) {
                    HMLocation.this.onErrorCallback.a(Integer.valueOf(i), str);
                }
                HMLocation.this.jsValue.k();
            }
        }

        @Override // e.e.a.n.c.b
        public void onLocationChanged(Location location) {
            e.e.a.q.b.a aVar;
            if (!HMLocation.this.isDestroyed.get() && (aVar = this.f2637a) != null) {
                aVar.a(new c(HMLocation.this, location));
            }
        }
    }

    public class c implements Serializable {
        public c(HMLocation hMLocation, Location location) {
            location.getLatitude();
            location.getLongitude();
            location.getAltitude();
            location.getAccuracy();
            location.getSpeed();
            location.getBearing();
            location.getTime();
        }
    }

    public HMLocation(e.e.a.p.b bVar, e.e.a.q.b.c cVar) {
        this.context = bVar;
        this.jsValue = cVar;
        g a2 = k.a(bVar.f4442c);
        if (a2.i == null) {
            a2.i = new i();
        }
        this.locationAdapter = a2.i;
    }

    @JsMethod
    public void getLastLocation(e.e.a.q.b.a aVar) {
        this.jsValue.l();
        e.e.a.n.c.a aVar2 = this.locationAdapter;
        Context context2 = this.context;
        a aVar3 = new a(aVar);
        i iVar = (i) aVar2;
        if (iVar != null) {
            iVar.a(new e.e.a.n.c.c.a(iVar, aVar3, context2), new e.e.a.n.c.c.c(context2, aVar3));
            return;
        }
        throw null;
    }

    @Override // e.e.a.u.b
    public void onCreate() {
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        this.isDestroyed.set(true);
        stopLocation();
    }

    @JsMethod
    public void onError(e.e.a.q.b.a aVar) {
        this.onErrorCallback = aVar;
    }

    @JsMethod
    public void startLocation(e.e.a.q.b.a aVar, long j, long j2) {
        this.jsValue.l();
        if (j <= 0) {
            j = 60000;
        }
        this.onLocationCallback = aVar;
        e.e.a.n.c.a aVar2 = this.locationAdapter;
        Context context2 = this.context;
        b bVar = new b(aVar);
        i iVar = (i) aVar2;
        if (iVar != null) {
            iVar.a(new e(iVar, j, j2, bVar, context2), new d(context2, bVar));
            return;
        }
        throw null;
    }

    @JsMethod
    public void stopLocation() {
        if (((i) this.locationAdapter) != null) {
            l.f.c();
            e.e.a.q.b.a aVar = this.onLocationCallback;
            if (aVar != null) {
                aVar.d();
                this.onLocationCallback = null;
            }
            this.jsValue.k();
            return;
        }
        throw null;
    }
}

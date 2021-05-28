package e.d.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import e.d.a.n.c;
import e.d.a.n.d;
import e.d.a.n.f;
import e.d.a.n.g;
import e.d.a.n.h;
import e.d.a.n.k;
import e.d.a.n.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3865a;
    public final f b;

    /* renamed from: c  reason: collision with root package name */
    public final l f3866c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3867d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3868e = new b();

    /* renamed from: f  reason: collision with root package name */
    public a f3869f;

    public interface a {
        <T> void a(c<T, ?, ?, ?> cVar);
    }

    public class b {
        public b() {
        }
    }

    public static class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final l f3871a;

        public c(l lVar) {
            this.f3871a = lVar;
        }
    }

    public i(Context context, f fVar, k kVar) {
        l lVar = new l();
        this.f3865a = context.getApplicationContext();
        this.b = fVar;
        this.f3866c = lVar;
        this.f3867d = e.a(context);
        g dVar = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new d(context, new c(lVar)) : new h();
        if (e.d.a.s.h.b()) {
            new Handler(Looper.getMainLooper()).post(new h(this, fVar));
        } else {
            fVar.a(this);
        }
        fVar.a(dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    public b<Integer> a(Integer num) {
        b<Integer> a2 = a(Integer.class);
        e.d.a.m.c a3 = e.d.a.r.a.a(this.f3865a);
        if (a3 != null) {
            a2.j = a3;
            a2.i = num;
            a2.k = true;
            return a2;
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // e.d.a.n.g
    public void b() {
        e.d.a.s.h.a();
        l lVar = this.f3866c;
        lVar.f4221c = true;
        Iterator it = ((ArrayList) e.d.a.s.h.a(lVar.f4220a)).iterator();
        while (it.hasNext()) {
            e.d.a.q.b bVar = (e.d.a.q.b) it.next();
            if (bVar.isRunning()) {
                bVar.b();
                lVar.b.add(bVar);
            }
        }
    }

    @Override // e.d.a.n.g
    public void onDestroy() {
        l lVar = this.f3866c;
        Iterator it = ((ArrayList) e.d.a.s.h.a(lVar.f4220a)).iterator();
        while (it.hasNext()) {
            ((e.d.a.q.b) it.next()).clear();
        }
        lVar.b.clear();
    }

    public final <T> b<T> a(Class<T> cls) {
        e.d.a.m.j.k a2 = e.a(cls, InputStream.class, this.f3865a);
        e.d.a.m.j.k a3 = e.a(cls, ParcelFileDescriptor.class, this.f3865a);
        if (cls != null && a2 == null && a3 == null) {
            throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for" + " which there is a registered ModelLoader, if you are using a custom model, you must first call" + " Glide#register with a ModelLoaderFactory for your custom model class");
        }
        b bVar = this.f3868e;
        b<T> bVar2 = new b<>(cls, a2, a3, this.f3865a, this.f3867d, this.f3866c, this.b, bVar);
        a aVar = i.this.f3869f;
        if (aVar != null) {
            aVar.a(bVar2);
        }
        return bVar2;
    }

    @Override // e.d.a.n.g
    public void a() {
        e.d.a.s.h.a();
        l lVar = this.f3866c;
        lVar.f4221c = false;
        Iterator it = ((ArrayList) e.d.a.s.h.a(lVar.f4220a)).iterator();
        while (it.hasNext()) {
            e.d.a.q.b bVar = (e.d.a.q.b) it.next();
            if (!bVar.d() && !bVar.isCancelled() && !bVar.isRunning()) {
                bVar.c();
            }
        }
        lVar.b.clear();
    }
}

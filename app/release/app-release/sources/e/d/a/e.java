package e.d.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e.d.a.m.a;
import e.d.a.m.i.c;
import e.d.a.m.i.n.i;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.r.a;
import e.d.a.m.j.r.c;
import e.d.a.m.j.r.d;
import e.d.a.m.j.r.e;
import e.d.a.m.j.s.a;
import e.d.a.m.j.s.b;
import e.d.a.m.j.s.c;
import e.d.a.m.j.s.e;
import e.d.a.m.j.s.f;
import e.d.a.m.j.s.g;
import e.d.a.m.j.s.h;
import e.d.a.m.k.d.j;
import e.d.a.m.k.d.n;
import e.d.a.m.k.d.p;
import e.d.a.m.k.i.d;
import e.d.a.q.g.f;
import e.d.a.s.g;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class e {
    public static volatile e l;

    /* renamed from: a  reason: collision with root package name */
    public final b f3843a;
    public final c b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.a.m.i.m.b f3844c;

    /* renamed from: d  reason: collision with root package name */
    public final i f3845d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3846e = new f();

    /* renamed from: f  reason: collision with root package name */
    public final d f3847f = new d();

    /* renamed from: g  reason: collision with root package name */
    public final e.d.a.p.c f3848g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.a.m.k.d.e f3849h;
    public final e.d.a.m.k.h.f i;
    public final e.d.a.m.k.d.i j;
    public final e.d.a.m.k.h.f k;

    public e(c cVar, i iVar, e.d.a.m.i.m.b bVar, Context context, a aVar) {
        this.b = cVar;
        this.f3844c = bVar;
        this.f3845d = iVar;
        this.f3843a = new b(context);
        new Handler(Looper.getMainLooper());
        new Handler(Looper.getMainLooper());
        this.f3848g = new e.d.a.p.c();
        p pVar = new p(bVar, aVar);
        this.f3848g.f4225a.put(new g(InputStream.class, Bitmap.class), pVar);
        e.d.a.m.k.d.g gVar = new e.d.a.m.k.d.g(bVar, aVar);
        this.f3848g.f4225a.put(new g(ParcelFileDescriptor.class, Bitmap.class), gVar);
        n nVar = new n(pVar, gVar);
        this.f3848g.f4225a.put(new g(e.d.a.m.j.f.class, Bitmap.class), nVar);
        e.d.a.m.k.g.c cVar2 = new e.d.a.m.k.g.c(context, bVar);
        this.f3848g.f4225a.put(new g(InputStream.class, e.d.a.m.k.g.b.class), cVar2);
        e.d.a.p.c cVar3 = this.f3848g;
        cVar3.f4225a.put(new g(e.d.a.m.j.f.class, e.d.a.m.k.h.a.class), new e.d.a.m.k.h.g(nVar, cVar2, bVar));
        e.d.a.p.c cVar4 = this.f3848g;
        cVar4.f4225a.put(new g(InputStream.class, File.class), new e.d.a.m.k.f.d());
        l a2 = this.f3843a.a(File.class, ParcelFileDescriptor.class, new a.C0127a());
        if (a2 != null) {
            a2.a();
        }
        l a3 = this.f3843a.a(File.class, InputStream.class, new c.a());
        if (a3 != null) {
            a3.a();
        }
        a(Integer.TYPE, ParcelFileDescriptor.class, new c.a());
        a(Integer.TYPE, InputStream.class, new e.a());
        l a4 = this.f3843a.a(Integer.class, ParcelFileDescriptor.class, new c.a());
        if (a4 != null) {
            a4.a();
        }
        l a5 = this.f3843a.a(Integer.class, InputStream.class, new e.a());
        if (a5 != null) {
            a5.a();
        }
        l a6 = this.f3843a.a(String.class, ParcelFileDescriptor.class, new d.a());
        if (a6 != null) {
            a6.a();
        }
        l a7 = this.f3843a.a(String.class, InputStream.class, new f.a());
        if (a7 != null) {
            a7.a();
        }
        l a8 = this.f3843a.a(Uri.class, ParcelFileDescriptor.class, new e.a());
        if (a8 != null) {
            a8.a();
        }
        l a9 = this.f3843a.a(Uri.class, InputStream.class, new g.a());
        if (a9 != null) {
            a9.a();
        }
        l a10 = this.f3843a.a(URL.class, InputStream.class, new h.a());
        if (a10 != null) {
            a10.a();
        }
        l a11 = this.f3843a.a(e.d.a.m.j.c.class, InputStream.class, new a.C0128a());
        if (a11 != null) {
            a11.a();
        }
        l a12 = this.f3843a.a(byte[].class, InputStream.class, new b.a());
        if (a12 != null) {
            a12.a();
        }
        e.d.a.m.k.i.d dVar = this.f3847f;
        dVar.f4202a.put(new e.d.a.s.g(Bitmap.class, j.class), new e.d.a.m.k.i.b(context.getResources(), bVar));
        e.d.a.m.k.i.d dVar2 = this.f3847f;
        dVar2.f4202a.put(new e.d.a.s.g(e.d.a.m.k.h.a.class, e.d.a.m.k.e.b.class), new e.d.a.m.k.i.a(new e.d.a.m.k.i.b(context.getResources(), bVar)));
        e.d.a.m.k.d.e eVar = new e.d.a.m.k.d.e(bVar);
        this.f3849h = eVar;
        this.i = new e.d.a.m.k.h.f(bVar, eVar);
        e.d.a.m.k.d.i iVar2 = new e.d.a.m.k.d.i(bVar);
        this.j = iVar2;
        this.k = new e.d.a.m.k.h.f(bVar, iVar2);
    }

    public static <T, Y> k<T, Y> a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return a(context).f3843a.a(cls, cls2);
        }
        if (!Log.isLoggable("Glide", 3)) {
            return null;
        }
        Log.d("Glide", "Unable to load null model, setting placeholder only");
        return null;
    }

    public static i b(Context context) {
        return e.d.a.n.j.f4216e.a(context);
    }

    public <T, Y> void a(Class<T> cls, Class<Y> cls2, l<T, Y> lVar) {
        l<T, Y> a2 = this.f3843a.a(cls, cls2, lVar);
        if (a2 != null) {
            a2.a();
        }
    }

    public static e a(Context context) {
        if (l == null) {
            synchronized (e.class) {
                if (l == null) {
                    Context applicationContext = context.getApplicationContext();
                    ArrayList arrayList = new ArrayList();
                    try {
                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                        if (applicationInfo.metaData != null) {
                            for (String str : applicationInfo.metaData.keySet()) {
                                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                    arrayList.add(e.d.a.o.b.a(str));
                                }
                            }
                        }
                        f fVar = new f(applicationContext);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((e.d.a.o.a) it.next()).a(applicationContext, fVar);
                        }
                        l = fVar.a();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((e.d.a.o.a) it2.next()).a(applicationContext, l);
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
                    }
                }
            }
        }
        return l;
    }
}

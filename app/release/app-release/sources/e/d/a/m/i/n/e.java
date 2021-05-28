package e.d.a.m.i.n;

import android.util.Log;
import e.d.a.j.a;
import e.d.a.m.c;
import e.d.a.m.i.a;
import e.d.a.m.i.n.a;
import java.io.File;
import java.io.IOException;

public class e implements a {

    /* renamed from: f  reason: collision with root package name */
    public static e f4033f;

    /* renamed from: a  reason: collision with root package name */
    public final c f4034a = new c();
    public final k b;

    /* renamed from: c  reason: collision with root package name */
    public final File f4035c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4036d;

    /* renamed from: e  reason: collision with root package name */
    public a f4037e;

    public e(File file, int i) {
        this.f4035c = file;
        this.f4036d = i;
        this.b = new k();
    }

    public static synchronized a a(File file, int i) {
        e eVar;
        synchronized (e.class) {
            if (f4033f == null) {
                f4033f = new e(file, i);
            }
            eVar = f4033f;
        }
        return eVar;
    }

    public final synchronized a a() {
        if (this.f4037e == null) {
            this.f4037e = a.a(this.f4035c, 1, 1, (long) this.f4036d);
        }
        return this.f4037e;
    }

    @Override // e.d.a.m.i.n.a
    public void a(c cVar) {
        try {
            a().d(this.b.a(cVar));
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e2);
            }
        }
    }

    @Override // e.d.a.m.i.n.a
    public void a(c cVar, a.b bVar) {
        String a2 = this.b.a(cVar);
        this.f4034a.a(cVar);
        try {
            a.b a3 = a().a(a2, -1);
            if (a3 != null) {
                try {
                    if (((a.c) bVar).a(a3.a(0))) {
                        e.d.a.j.a.this.a(a3, true);
                        a3.f3880c = true;
                    }
                } finally {
                    if (!a3.f3880c) {
                        try {
                            a3.a();
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
            }
        } catch (Throwable th) {
            this.f4034a.b(cVar);
            throw th;
        }
        this.f4034a.b(cVar);
    }

    @Override // e.d.a.m.i.n.a
    public File b(c cVar) {
        try {
            a.d b2 = a().b(this.b.a(cVar));
            if (b2 != null) {
                return b2.f3889a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}

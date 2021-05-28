package e.d.a.m.k.g;

import android.content.Context;
import e.d.a.m.e;
import e.d.a.m.f;
import e.d.a.m.j.n;
import e.d.a.p.b;
import java.io.File;
import java.io.InputStream;

public class c implements b<InputStream, b> {

    /* renamed from: c  reason: collision with root package name */
    public final i f4152c;

    /* renamed from: d  reason: collision with root package name */
    public final j f4153d;

    /* renamed from: e  reason: collision with root package name */
    public final n f4154e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.a.m.k.f.c<b> f4155f = new e.d.a.m.k.f.c<>(this.f4152c);

    public c(Context context, e.d.a.m.i.m.b bVar) {
        this.f4152c = new i(context, bVar);
        this.f4153d = new j(bVar);
        this.f4154e = new n();
    }

    @Override // e.d.a.p.b
    public e<File, b> b() {
        return this.f4155f;
    }

    @Override // e.d.a.p.b
    public f<b> d() {
        return this.f4153d;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<InputStream> e() {
        return this.f4154e;
    }

    @Override // e.d.a.p.b
    public e<InputStream, b> g() {
        return this.f4152c;
    }
}

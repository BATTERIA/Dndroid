package e.d.a.p;

import e.d.a.m.b;
import e.d.a.m.f;
import e.d.a.m.j.k;
import e.d.a.m.k.i.c;
import java.io.File;

public class e<A, T, Z, R> implements f<A, T, Z, R> {

    /* renamed from: c  reason: collision with root package name */
    public final k<A, T> f4227c;

    /* renamed from: d  reason: collision with root package name */
    public final c<Z, R> f4228d;

    /* renamed from: e  reason: collision with root package name */
    public final b<T, Z> f4229e;

    public e(k<A, T> kVar, c<Z, R> cVar, b<T, Z> bVar) {
        if (kVar != null) {
            this.f4227c = kVar;
            if (cVar != null) {
                this.f4228d = cVar;
                if (bVar != null) {
                    this.f4229e = bVar;
                    return;
                }
                throw new NullPointerException("DataLoadProvider must not be null");
            }
            throw new NullPointerException("Transcoder must not be null");
        }
        throw new NullPointerException("ModelLoader must not be null");
    }

    @Override // e.d.a.p.b
    public e.d.a.m.e<File, Z> b() {
        return this.f4229e.b();
    }

    @Override // e.d.a.p.f
    public k<A, T> c() {
        return this.f4227c;
    }

    @Override // e.d.a.p.b
    public f<Z> d() {
        return this.f4229e.d();
    }

    @Override // e.d.a.p.b
    public b<T> e() {
        return this.f4229e.e();
    }

    @Override // e.d.a.p.f
    public c<Z, R> f() {
        return this.f4228d;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.e<T, Z> g() {
        return this.f4229e.g();
    }
}

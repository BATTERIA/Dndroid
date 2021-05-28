package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.d.b.d;
import a.a.a.a.v0.j.w.i;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<a.a.a.a.v0.f.a, i> f442a;
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public final f f443c;

    public a(d dVar, f fVar) {
        if (dVar == null) {
            a.w.c.i.a("resolver");
            throw null;
        } else if (fVar != null) {
            this.b = dVar;
            this.f443c = fVar;
            this.f442a = new ConcurrentHashMap<>();
        } else {
            a.w.c.i.a("kotlinClassFinder");
            throw null;
        }
    }
}

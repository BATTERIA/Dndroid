package f.o0.g;

import f.o0.n.c;
import g.g;

public class f extends c.e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f5123f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, boolean z, g gVar2, g.f fVar, d dVar) {
        super(z, gVar2, fVar);
        this.f5123f = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5123f.a(-1, true, true, null);
    }
}

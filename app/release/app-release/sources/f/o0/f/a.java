package f.o0.f;

import g.e;
import g.f;
import g.g;
import g.x;
import g.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class a implements x {

    /* renamed from: c  reason: collision with root package name */
    public boolean f5090c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f5091d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c f5092e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f5093f;

    public a(b bVar, g gVar, c cVar, f fVar) {
        this.f5091d = gVar;
        this.f5092e = cVar;
        this.f5093f = fVar;
    }

    @Override // g.x
    public long c(e eVar, long j) {
        try {
            long c2 = this.f5091d.c(eVar, j);
            if (c2 == -1) {
                if (!this.f5090c) {
                    this.f5090c = true;
                    this.f5093f.close();
                }
                return -1;
            }
            eVar.a(this.f5093f.b(), eVar.f5428d - c2, c2);
            this.f5093f.e();
            return c2;
        } catch (IOException e2) {
            if (!this.f5090c) {
                this.f5090c = true;
                this.f5092e.a();
            }
            throw e2;
        }
    }

    @Override // g.x
    public y c() {
        return this.f5091d.c();
    }

    @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f5090c && !f.o0.e.a(this, 100, TimeUnit.MILLISECONDS)) {
            this.f5090c = true;
            this.f5092e.a();
        }
        this.f5091d.close();
    }
}

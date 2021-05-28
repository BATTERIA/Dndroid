package g;

import e.a.a.a.a;
import java.io.IOException;

public class b implements x {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f5419c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f5420d;

    public b(c cVar, x xVar) {
        this.f5420d = cVar;
        this.f5419c = xVar;
    }

    @Override // g.x
    public long c(e eVar, long j) {
        this.f5420d.g();
        try {
            long c2 = this.f5419c.c(eVar, j);
            this.f5420d.a(true);
            return c2;
        } catch (IOException e2) {
            c cVar = this.f5420d;
            if (!cVar.h()) {
                throw e2;
            }
            throw cVar.a(e2);
        } catch (Throwable th) {
            this.f5420d.a(false);
            throw th;
        }
    }

    @Override // g.x
    public y c() {
        return this.f5420d;
    }

    @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5420d.g();
        try {
            this.f5419c.close();
            this.f5420d.a(true);
        } catch (IOException e2) {
            c cVar = this.f5420d;
            if (!cVar.h()) {
                throw e2;
            }
            throw cVar.a(e2);
        } catch (Throwable th) {
            this.f5420d.a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a2 = a.a("AsyncTimeout.source(");
        a2.append(this.f5419c);
        a2.append(")");
        return a2.toString();
    }
}

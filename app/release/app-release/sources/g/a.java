package g;

import java.io.IOException;

public class a implements w {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f5417c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f5418d;

    public a(c cVar, w wVar) {
        this.f5418d = cVar;
        this.f5417c = wVar;
    }

    @Override // g.w
    public void a(e eVar, long j) {
        z.a(eVar.f5428d, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                t tVar = eVar.f5427c;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (tVar.f5466c - tVar.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    tVar = tVar.f5469f;
                }
                this.f5418d.g();
                try {
                    this.f5417c.a(eVar, j2);
                    j -= j2;
                    this.f5418d.a(true);
                } catch (IOException e2) {
                    c cVar = this.f5418d;
                    if (!cVar.h()) {
                        throw e2;
                    }
                    throw cVar.a(e2);
                } catch (Throwable th) {
                    this.f5418d.a(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    @Override // g.w
    public y c() {
        return this.f5418d;
    }

    @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5418d.g();
        try {
            this.f5417c.close();
            this.f5418d.a(true);
        } catch (IOException e2) {
            c cVar = this.f5418d;
            if (!cVar.h()) {
                throw e2;
            }
            throw cVar.a(e2);
        } catch (Throwable th) {
            this.f5418d.a(false);
            throw th;
        }
    }

    @Override // g.w, java.io.Flushable
    public void flush() {
        this.f5418d.g();
        try {
            this.f5417c.flush();
            this.f5418d.a(true);
        } catch (IOException e2) {
            c cVar = this.f5418d;
            if (!cVar.h()) {
                throw e2;
            }
            throw cVar.a(e2);
        } catch (Throwable th) {
            this.f5418d.a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("AsyncTimeout.sink(");
        a2.append(this.f5417c);
        a2.append(")");
        return a2.toString();
    }
}

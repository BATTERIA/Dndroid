package g;

import e.a.a.a.a;
import java.io.OutputStream;

public final class n implements w {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f5452c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ OutputStream f5453d;

    public n(y yVar, OutputStream outputStream) {
        this.f5452c = yVar;
        this.f5453d = outputStream;
    }

    @Override // g.w
    public void a(e eVar, long j) {
        z.a(eVar.f5428d, 0, j);
        while (j > 0) {
            this.f5452c.e();
            t tVar = eVar.f5427c;
            int min = (int) Math.min(j, (long) (tVar.f5466c - tVar.b));
            this.f5453d.write(tVar.f5465a, tVar.b, min);
            int i = tVar.b + min;
            tVar.b = i;
            long j2 = (long) min;
            j -= j2;
            eVar.f5428d -= j2;
            if (i == tVar.f5466c) {
                eVar.f5427c = tVar.a();
                u.a(tVar);
            }
        }
    }

    @Override // g.w
    public y c() {
        return this.f5452c;
    }

    @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5453d.close();
    }

    @Override // g.w, java.io.Flushable
    public void flush() {
        this.f5453d.flush();
    }

    public String toString() {
        StringBuilder a2 = a.a("sink(");
        a2.append(this.f5453d);
        a2.append(")");
        return a2.toString();
    }
}

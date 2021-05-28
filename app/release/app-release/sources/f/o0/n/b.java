package f.o0.n;

import e.e.a.n.f.d.a;
import f.b0;
import f.e0;
import f.h0;
import f.j;
import f.k;
import f.o0.c;
import f.o0.e;
import f.o0.g.d;
import f.o0.n.c;
import java.io.IOException;

public class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0 f5346a;
    public final /* synthetic */ c b;

    public b(c cVar, e0 e0Var) {
        this.b = cVar;
        this.f5346a = e0Var;
    }

    @Override // f.k
    public void a(j jVar, h0 h0Var) {
        if (((b0.a) c.f5081a) != null) {
            d dVar = h0Var.o;
            try {
                this.b.a(h0Var, dVar);
                c.e c2 = dVar.c();
                try {
                    this.b.a("OkHttp WebSocket " + this.f5346a.f5005a.f(), c2);
                    a.C0134a aVar = (a.C0134a) this.b.b;
                    a.this.f4367c = this.b;
                    e.e.a.n.f.b bVar = aVar.f4368a;
                    if (bVar != null) {
                        bVar.a();
                    }
                    this.b.b();
                } catch (Exception e2) {
                    this.b.a(e2, (h0) null);
                }
            } catch (IOException e3) {
                if (dVar != null) {
                    dVar.a(-1, true, true, null);
                }
                this.b.a(e3, h0Var);
                e.a(h0Var);
            }
        } else {
            throw null;
        }
    }

    @Override // f.k
    public void a(j jVar, IOException iOException) {
        this.b.a(iOException, (h0) null);
    }
}

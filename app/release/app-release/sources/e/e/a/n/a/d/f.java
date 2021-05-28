package e.e.a.n.a.d;

import e.e.a.b0.d;
import e.e.a.n.a.a;
import f.h0;
import f.j;
import f.k;
import java.io.IOException;
import java.lang.reflect.Type;

public class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f4331a;
    public final /* synthetic */ a b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f4332c;

    public f(g gVar, Type type, a aVar) {
        this.f4332c = gVar;
        this.f4331a = type;
        this.b = aVar;
    }

    public /* synthetic */ void a(a aVar, IOException iOException) {
        if (aVar != null) {
            aVar.a(g.a(this.f4332c, iOException));
        }
    }

    @Override // f.k
    public void a(j jVar, h0 h0Var) {
        d.a(new c(this.b, g.a(this.f4332c, h0Var, this.f4331a)));
    }

    @Override // f.k
    public void a(j jVar, IOException iOException) {
        d.a(new d(this, this.b, iOException));
    }
}

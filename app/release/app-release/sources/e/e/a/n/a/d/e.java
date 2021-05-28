package e.e.a.n.a.d;

import e.e.a.b0.d;
import e.e.a.n.a.a;
import f.h0;
import f.j;
import f.k;
import java.io.IOException;
import java.lang.reflect.Type;

public class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f4329a;
    public final /* synthetic */ a b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f4330c;

    public e(g gVar, Type type, a aVar) {
        this.f4330c = gVar;
        this.f4329a = type;
        this.b = aVar;
    }

    public /* synthetic */ void a(a aVar, IOException iOException) {
        if (aVar != null) {
            aVar.a(g.a(this.f4330c, iOException));
        }
    }

    @Override // f.k
    public void a(j jVar, h0 h0Var) {
        d.a(new a(this.b, g.a(this.f4330c, h0Var, this.f4329a)));
    }

    @Override // f.k
    public void a(j jVar, IOException iOException) {
        d.a(new b(this, this.b, iOException));
    }
}

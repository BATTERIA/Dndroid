package a.a.a.a;

import a.a.t.b;
import a.w.b.a;
import a.w.c.j;
import e.f.a.g;
import java.lang.reflect.Field;

public final class z extends j implements a<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f2045c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(x xVar) {
        super(0);
        this.f2045c = xVar;
    }

    @Override // a.w.b.a
    public final Object a() {
        x xVar = this.f2045c;
        Field h2 = xVar.h();
        x xVar2 = this.f2045c;
        Object a2 = g.a(xVar2.i, xVar2.e());
        try {
            if (a2 == c0.j) {
                if (xVar.e().g0() == null) {
                    throw new RuntimeException('\'' + xVar + "' is not an extension property and thus getExtensionDelegate() " + "is not going to work, use getDelegate() instead");
                }
            }
            if (h2 != null) {
                return h2.get(a2);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new b(e2);
        }
    }
}

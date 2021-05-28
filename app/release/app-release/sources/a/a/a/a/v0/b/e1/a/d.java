package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.b.e1.b.b0;
import a.a.a.a.v0.b.e1.b.q;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.d.a.m;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.w.c.i;
import java.util.Set;

public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f444a;

    public d(ClassLoader classLoader) {
        if (classLoader != null) {
            this.f444a = classLoader;
        } else {
            i.a("classLoader");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.m
    public g a(m.a aVar) {
        if (aVar != null) {
            a aVar2 = aVar.f805a;
            b d2 = aVar2.d();
            i.a((Object) d2, "classId.packageFqName");
            String a2 = aVar2.e().a();
            i.a((Object) a2, "classId.relativeClassName.asString()");
            String a3 = a.a.a.a.v0.m.l1.a.a(a2, '.', '$', false, 4);
            if (!d2.b()) {
                a3 = d2.a() + "." + a3;
            }
            Class<?> a4 = e.f.a.g.a(this.f444a, a3);
            if (a4 != null) {
                return new q(a4);
            }
            return null;
        }
        i.a("request");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.m
    public Set<String> b(b bVar) {
        if (bVar != null) {
            return null;
        }
        i.a("packageFqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.m
    public t a(b bVar) {
        if (bVar != null) {
            return new b0(bVar);
        }
        i.a("fqName");
        throw null;
    }
}

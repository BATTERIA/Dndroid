package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.d.b.k;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.k.b.e0.a;
import a.w.c.i;
import e.f.a.g;
import java.io.InputStream;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f446a;

    public f(ClassLoader classLoader) {
        if (classLoader != null) {
            this.f446a = classLoader;
        } else {
            i.a("classLoader");
            throw null;
        }
    }

    public final k.a a(String str) {
        e a2;
        Class<?> a3 = g.a(this.f446a, str);
        if (a3 == null || (a2 = e.a(a3)) == null) {
            return null;
        }
        return new k.a.b(a2);
    }

    @Override // a.a.a.a.v0.k.b.s
    public InputStream a(b bVar) {
        if (bVar == null) {
            i.a("packageFqName");
            throw null;
        } else if (!bVar.b(a.a.a.a.v0.a.g.f188e)) {
            return null;
        } else {
            return this.f446a.getResourceAsStream(a.m.a(bVar));
        }
    }

    @Override // a.a.a.a.v0.d.b.k
    public k.a a(a.a.a.a.v0.d.a.c0.g gVar) {
        String a2;
        if (gVar != null) {
            b e2 = gVar.e();
            if (e2 == null || (a2 = e2.a()) == null) {
                return null;
            }
            return a(a2);
        }
        i.a("javaClass");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.k
    public k.a a(a.a.a.a.v0.f.a aVar) {
        if (aVar != null) {
            String a2 = aVar.e().a();
            i.a((Object) a2, "relativeClassName.asString()");
            String a3 = a.a.a.a.v0.m.l1.a.a(a2, '.', '$', false, 4);
            b d2 = aVar.d();
            i.a((Object) d2, "packageFqName");
            if (!d2.b()) {
                a3 = aVar.d() + '.' + a3;
            }
            return a(a3);
        }
        i.a("classId");
        throw null;
    }
}

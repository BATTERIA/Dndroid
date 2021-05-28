package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.b;
import a.w.c.i;
import java.lang.annotation.Annotation;

public abstract class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final a.a.a.a.v0.f.d f459a;

    public d(a.a.a.a.v0.f.d dVar) {
        this.f459a = dVar;
    }

    public static final d a(Object obj, a.a.a.a.v0.f.d dVar) {
        if (obj == null) {
            i.a("value");
            throw null;
        } else if (b.g(obj.getClass())) {
            return new v(dVar, (Enum) obj);
        } else {
            if (obj instanceof Annotation) {
                return new e(dVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new g(dVar, (Object[]) obj);
            }
            return obj instanceof Class ? new r(dVar, (Class) obj) : new x(dVar, obj);
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.b
    public a.a.a.a.v0.f.d d() {
        return this.f459a;
    }
}

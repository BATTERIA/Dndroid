package e.d.a.m.k.i;

import e.d.a.s.g;
import java.util.HashMap;
import java.util.Map;

public class d {
    public static final g b = new g();

    /* renamed from: a  reason: collision with root package name */
    public final Map<g, c<?, ?>> f4202a = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Class<Z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    public <Z, R> c<Z, R> a(Class<Z> cls, Class<R> cls2) {
        c<Z, R> cVar;
        if (cls.equals(cls2)) {
            return e.f4203a;
        }
        synchronized (b) {
            g gVar = b;
            gVar.f4277a = cls;
            gVar.b = cls2;
            cVar = (c<Z, R>) this.f4202a.get(b);
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }
}

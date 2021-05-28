package e.d.a.p;

import e.d.a.s.g;
import java.util.HashMap;
import java.util.Map;

public class c {
    public static final g b = new g();

    /* renamed from: a  reason: collision with root package name */
    public final Map<g, b<?, ?>> f4225a = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Class<Z> */
    /* JADX WARN: Multi-variable type inference failed */
    public <T, Z> b<T, Z> a(Class<T> cls, Class<Z> cls2) {
        b<T, Z> bVar;
        synchronized (b) {
            g gVar = b;
            gVar.f4277a = cls;
            gVar.b = cls2;
            bVar = (b<T, Z>) this.f4225a.get(b);
        }
        return bVar == null ? (b<T, Z>) d.f4226c : bVar;
    }
}

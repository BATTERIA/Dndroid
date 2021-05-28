package a.w.c;

import a.a.c;
import a.a.i;
import a.a.n;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final t f2149a;

    static {
        t tVar;
        try {
            tVar = (t) Class.forName("a.a.a.a.n0").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            tVar = null;
        }
        if (tVar == null) {
            tVar = new t();
        }
        f2149a = tVar;
    }

    public static c a(Class cls) {
        return f2149a.a(cls);
    }

    public static i a(k kVar) {
        return f2149a.a(kVar);
    }

    public static n a(o oVar) {
        return f2149a.a(oVar);
    }
}

package a.w.c;

import a.a.c;
import a.a.e;
import a.a.f;
import a.a.i;
import a.a.n;

public class t {
    public c a(Class cls) {
        return new d(cls);
    }

    public e a(Class cls, String str) {
        return new n(cls, str);
    }

    public f a(h hVar) {
        return hVar;
    }

    public i a(k kVar) {
        return kVar;
    }

    public n a(o oVar) {
        return oVar;
    }

    public String a(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String a(j jVar) {
        return a((g) jVar);
    }
}

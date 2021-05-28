package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.f.d;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class n extends j implements l<Class<?>, d> {

    /* renamed from: c  reason: collision with root package name */
    public static final n f471c = new n();

    public n() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public d a(Class<?> cls) {
        Class<?> cls2 = cls;
        i.a((Object) cls2, "it");
        String simpleName = cls2.getSimpleName();
        if (!d.c(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return d.b(simpleName);
        }
        return null;
    }
}

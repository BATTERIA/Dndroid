package a.a.a.a.v0.b.e1.b;

import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class m extends j implements l<Class<?>, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final m f470c = new m();

    public m() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(Class<?> cls) {
        Class<?> cls2 = cls;
        i.a((Object) cls2, "it");
        String simpleName = cls2.getSimpleName();
        i.a((Object) simpleName, "it.simpleName");
        return Boolean.valueOf(simpleName.length() == 0);
    }
}

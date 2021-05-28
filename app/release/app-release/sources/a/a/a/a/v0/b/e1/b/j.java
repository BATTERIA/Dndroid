package a.a.a.a.v0.b.e1.b;

import a.a.e;
import a.w.b.l;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;
import java.lang.reflect.Constructor;

public final /* synthetic */ class j extends h implements l<Constructor<?>, t> {

    /* renamed from: f  reason: collision with root package name */
    public static final j f467f = new j();

    public j() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public t a(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        if (constructor2 != null) {
            return new t(constructor2);
        }
        i.a("p1");
        throw null;
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(t.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "<init>";
    }

    @Override // a.w.c.b
    public final String f() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }
}

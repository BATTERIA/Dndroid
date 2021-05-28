package a.a.a.a.v0.b.e1.b;

import a.a.e;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;
import java.lang.reflect.Field;

public final /* synthetic */ class l extends h implements a.w.b.l<Field, w> {

    /* renamed from: f  reason: collision with root package name */
    public static final l f469f = new l();

    public l() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public w a(Field field) {
        Field field2 = field;
        if (field2 != null) {
            return new w(field2);
        }
        i.a("p1");
        throw null;
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(w.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "<init>";
    }

    @Override // a.w.c.b
    public final String f() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }
}

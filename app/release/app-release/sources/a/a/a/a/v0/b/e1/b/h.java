package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.f;
import a.a.a.a.v0.d.a.c0.v;
import a.w.c.i;
import e.a.a.a.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class h extends d0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f465a;
    public final Type b;

    public h(Type type) {
        Type type2;
        String str;
        if (type != null) {
            this.b = type;
            if (type instanceof GenericArrayType) {
                type2 = ((GenericArrayType) type).getGenericComponentType();
                str = "genericComponentType";
            } else {
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        type2 = cls.getComponentType();
                        str = "getComponentType()";
                    }
                }
                StringBuilder a2 = a.a("Not an array type (");
                a2.append(this.b.getClass());
                a2.append("): ");
                a2.append(this.b);
                throw new IllegalArgumentException(a2.toString());
            }
            i.a((Object) type2, str);
            this.f465a = d0.a(type2);
            return;
        }
        i.a("reflectType");
        throw null;
    }

    @Override // a.a.a.a.v0.b.e1.b.d0
    public Type S() {
        return this.b;
    }

    @Override // a.a.a.a.v0.d.a.c0.f
    public v u() {
        return this.f465a;
    }
}

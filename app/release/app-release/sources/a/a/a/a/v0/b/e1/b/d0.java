package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.v;
import a.w.c.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public abstract class d0 implements v {
    public static final d0 a(Type type) {
        if (type != null) {
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new c0(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new h(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
        }
        i.a("type");
        throw null;
    }

    public abstract Type S();

    public boolean equals(Object obj) {
        return (obj instanceof d0) && i.a(S(), ((d0) obj).S());
    }

    public int hashCode() {
        return S().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + S();
    }
}

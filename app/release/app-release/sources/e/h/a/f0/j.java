package e.h.a.f0;

import e.a.a.a.a;
import e.h.a.r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public class j implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f4707a;

    public j(g gVar, Type type) {
        this.f4707a = type;
    }

    @Override // e.h.a.f0.t
    public T a() {
        Type type = this.f4707a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            StringBuilder a2 = a.a("Invalid EnumSet type: ");
            a2.append(this.f4707a.toString());
            throw new r(a2.toString());
        }
        StringBuilder a3 = a.a("Invalid EnumSet type: ");
        a3.append(this.f4707a.toString());
        throw new r(a3.toString());
    }
}

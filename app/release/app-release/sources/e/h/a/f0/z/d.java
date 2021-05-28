package e.h.a.f0.z;

import e.h.a.b0;
import e.h.a.c0;
import e.h.a.d0;
import e.h.a.f0.g;
import e.h.a.g0.a;
import e.h.a.k;
import e.h.a.p;
import e.h.a.y;

public final class d implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final g f4748c;

    public d(g gVar) {
        this.f4748c = gVar;
    }

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, a<T> aVar) {
        e.h.a.e0.a aVar2 = (e.h.a.e0.a) aVar.f4806a.getAnnotation(e.h.a.e0.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (c0<T>) a(this.f4748c, kVar, aVar, aVar2);
    }

    public c0<?> a(g gVar, k kVar, a<?> aVar, e.h.a.e0.a aVar2) {
        c0<?> c0Var;
        Object a2 = gVar.a(new a(aVar2.value())).a();
        if (a2 instanceof c0) {
            c0Var = (c0) a2;
        } else if (a2 instanceof d0) {
            c0Var = ((d0) a2).a(kVar, aVar);
        } else {
            boolean z = a2 instanceof y;
            if (z || (a2 instanceof p)) {
                p pVar = null;
                y yVar = z ? (y) a2 : null;
                if (a2 instanceof p) {
                    pVar = (p) a2;
                }
                c0Var = new m<>(yVar, pVar, kVar, aVar, null);
            } else {
                StringBuilder a3 = e.a.a.a.a.a("Invalid attempt to bind an instance of ");
                a3.append(a2.getClass().getName());
                a3.append(" as a @JsonAdapter for ");
                a3.append(aVar.toString());
                a3.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(a3.toString());
            }
        }
        return (c0Var == null || !aVar2.nullSafe()) ? c0Var : new b0(c0Var);
    }
}

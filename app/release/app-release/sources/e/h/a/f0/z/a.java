package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.h0.b;
import e.h.a.h0.c;
import e.h.a.k;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends c0<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f4743c = new C0143a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f4744a;
    public final c0<E> b;

    /* renamed from: e.h.a.f0.z.a$a  reason: collision with other inner class name */
    public class C0143a implements d0 {
        @Override // e.h.a.d0
        public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
            Type type = aVar.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(kVar, kVar.a((e.h.a.g0.a) new e.h.a.g0.a<>(genericComponentType)), e.h.a.f0.a.c(genericComponentType));
        }
    }

    public a(k kVar, c0<E> c0Var, Class<E> cls) {
        this.b = new n(kVar, c0Var, cls);
        this.f4744a = cls;
    }

    @Override // e.h.a.c0
    public Object a(e.h.a.h0.a aVar) {
        if (aVar.A() == b.NULL) {
            aVar.x();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.q()) {
            arrayList.add(this.b.a(aVar));
        }
        aVar.n();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f4744a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: e.h.a.c0<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.h.a.c0
    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.p();
            return;
        }
        cVar.k();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.a(cVar, Array.get(obj, i));
        }
        cVar.m();
    }
}

package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.f0.g;
import e.h.a.f0.t;
import e.h.a.h0.c;
import e.h.a.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class b implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final g f4745c;

    public static final class a<E> extends c0<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final c0<E> f4746a;
        public final t<? extends Collection<E>> b;

        public a(k kVar, Type type, c0<E> c0Var, t<? extends Collection<E>> tVar) {
            this.f4746a = new n(kVar, c0Var, type);
            this.b = tVar;
        }

        @Override // e.h.a.c0
        public Object a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            aVar.a();
            while (aVar.q()) {
                collection.add(this.f4746a.a(aVar));
            }
            aVar.n();
            return collection;
        }

        @Override // e.h.a.c0
        public void a(c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.p();
                return;
            }
            cVar.k();
            for (E e2 : collection) {
                this.f4746a.a(cVar, e2);
            }
            cVar.m();
        }
    }

    public b(g gVar) {
        this.f4745c = gVar;
    }

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
        Type type = aVar.b;
        Class<? super T> cls = aVar.f4806a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type b = e.h.a.f0.a.b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        Class cls2 = b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments()[0] : Object.class;
        return new a(kVar, cls2, kVar.a((e.h.a.g0.a) new e.h.a.g0.a<>(cls2)), this.f4745c.a(aVar));
    }
}

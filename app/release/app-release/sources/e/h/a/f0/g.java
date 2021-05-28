package e.h.a.f0;

import e.h.a.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, m<?>> f4703a;
    public final e.h.a.f0.a0.b b = e.h.a.f0.a0.b.f4698a;

    public class a implements t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f4704a;
        public final /* synthetic */ Type b;

        public a(g gVar, m mVar, Type type) {
            this.f4704a = mVar;
            this.b = type;
        }

        @Override // e.h.a.f0.t
        public T a() {
            return (T) this.f4704a.a(this.b);
        }
    }

    public class b implements t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f4705a;
        public final /* synthetic */ Type b;

        public b(g gVar, m mVar, Type type) {
            this.f4705a = mVar;
            this.b = type;
        }

        @Override // e.h.a.f0.t
        public T a() {
            return (T) this.f4705a.a(this.b);
        }
    }

    public g(Map<Type, m<?>> map) {
        this.f4703a = map;
    }

    public <T> t<T> a(e.h.a.g0.a<T> aVar) {
        h hVar;
        Type type = aVar.b;
        Class<? super T> cls = aVar.f4806a;
        m<?> mVar = this.f4703a.get(type);
        if (mVar != null) {
            return new a(this, mVar, type);
        }
        m<?> mVar2 = this.f4703a.get(cls);
        if (mVar2 != null) {
            return new b(this, mVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            tVar = SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new c(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 != null) {
                        Type a2 = a.a(type2);
                        Class<?> c2 = a.c(a2);
                        a2.hashCode();
                        if (!String.class.isAssignableFrom(c2)) {
                            tVar = new d(this);
                        }
                    } else {
                        throw null;
                    }
                }
                tVar = new e(this);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        return new f(this, cls, type);
    }

    public String toString() {
        return this.f4703a.toString();
    }
}

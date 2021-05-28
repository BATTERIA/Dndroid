package a.a.a.a.v0.b.e1.b;

import a.a.c;
import a.t.f;
import a.w.b.d;
import a.w.b.e;
import a.w.b.k;
import a.w.b.l;
import a.w.b.m;
import a.w.b.n;
import a.w.b.o;
import a.w.b.p;
import a.w.b.q;
import a.w.b.r;
import a.w.b.t;
import a.w.b.u;
import a.w.b.v;
import a.w.b.w;
import a.w.c.i;
import a.w.c.j;
import a.w.c.s;
import a.z.h;
import e.f.a.g;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final List<c<? extends Object>> f452a;
    public static final Map<Class<? extends Object>, Class<? extends Object>> b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f453c;

    public static final class a extends j implements l<ParameterizedType, ParameterizedType> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f454c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public ParameterizedType a(ParameterizedType parameterizedType) {
            ParameterizedType parameterizedType2 = parameterizedType;
            ParameterizedType parameterizedType3 = null;
            if (parameterizedType2 != null) {
                Type ownerType = parameterizedType2.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    parameterizedType3 = ownerType;
                }
                return parameterizedType3;
            }
            i.a("it");
            throw null;
        }
    }

    /* renamed from: a.a.a.a.v0.b.e1.b.b$b  reason: collision with other inner class name */
    public static final class C0021b extends j implements l<ParameterizedType, h<? extends Type>> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0021b f455c = new C0021b();

        public C0021b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public h<? extends Type> a(ParameterizedType parameterizedType) {
            ParameterizedType parameterizedType2 = parameterizedType;
            if (parameterizedType2 != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                i.a((Object) actualTypeArguments, "it.actualTypeArguments");
                return g.a((Object[]) actualTypeArguments);
            }
            i.a("it");
            throw null;
        }
    }

    static {
        int i = 0;
        List<c<? extends Object>> g2 = g.g(s.a(Boolean.TYPE), s.a(Byte.TYPE), s.a(Character.TYPE), s.a(Double.TYPE), s.a(Float.TYPE), s.a(Integer.TYPE), s.a(Long.TYPE), s.a(Short.TYPE));
        f452a = g2;
        ArrayList arrayList = new ArrayList(g.a((Iterable) g2, 10));
        for (T t : g2) {
            arrayList.add(new a.j(g.b((c) t), g.c((c) t)));
        }
        b = f.h(arrayList);
        List<c<? extends Object>> list = f452a;
        ArrayList arrayList2 = new ArrayList(g.a((Iterable) list, 10));
        for (T t2 : list) {
            arrayList2.add(new a.j(g.c((c) t2), g.b((c) t2)));
        }
        f453c = f.h(arrayList2);
        List g3 = g.g(a.w.b.a.class, l.class, p.class, q.class, r.class, a.w.b.s.class, t.class, u.class, v.class, w.class, a.w.b.b.class, a.w.b.c.class, d.class, e.class, a.w.b.f.class, a.w.b.g.class, a.w.b.h.class, a.w.b.i.class, a.w.b.j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(g.a((Iterable) g3, 10));
        for (Object obj : g3) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new a.j((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                g.d();
                throw null;
            }
        }
        f.h(arrayList3);
    }

    public static final Class<?> a(Class<?> cls) {
        if (cls != null) {
            return Array.newInstance(cls, 0).getClass();
        }
        i.a("$this$createArrayType");
        throw null;
    }

    public static final a.a.a.a.v0.f.a b(Class<?> cls) {
        a.a.a.a.v0.f.a b2;
        if (cls == null) {
            i.a("$this$classId");
            throw null;
        } else if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                i.a((Object) simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null && (b2 = b(declaringClass)) != null) {
                        return b2.a(a.a.a.a.v0.f.d.b(cls.getSimpleName()));
                    }
                    a.a.a.a.v0.f.a a2 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(cls.getName()));
                    i.a((Object) a2, "ClassId.topLevel(FqName(name))");
                    return a2;
                }
            }
            a.a.a.a.v0.f.b bVar = new a.a.a.a.v0.f.b(cls.getName());
            return new a.a.a.a.v0.f.a(bVar.c(), a.a.a.a.v0.f.b.c(bVar.d()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    public static final String c(Class<?> cls) {
        if (cls == null) {
            i.a("$this$desc");
            throw null;
        } else if (i.a(cls, Void.TYPE)) {
            return "V";
        } else {
            String name = a(cls).getName();
            i.a((Object) name, "createArrayType().name");
            String substring = name.substring(1);
            i.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return a.a.a.a.v0.m.l1.a.a(substring, '.', '/', false, 4);
        }
    }

    public static final Class<?> d(Class<?> cls) {
        if (cls != null) {
            return b.get(cls);
        }
        i.a("$this$primitiveByWrapper");
        throw null;
    }

    public static final ClassLoader e(Class<?> cls) {
        if (cls != null) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader;
            }
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            i.a((Object) systemClassLoader, "ClassLoader.getSystemClassLoader()");
            return systemClassLoader;
        }
        i.a("$this$safeClassLoader");
        throw null;
    }

    public static final Class<?> f(Class<?> cls) {
        if (cls != null) {
            return f453c.get(cls);
        }
        i.a("$this$wrapperByPrimitive");
        throw null;
    }

    public static final boolean g(Class<?> cls) {
        if (cls != null) {
            return Enum.class.isAssignableFrom(cls);
        }
        i.a("$this$isEnumClassOrSpecializedEnumEntryClass");
        throw null;
    }

    public static final List<Type> a(Type type) {
        if (type == null) {
            i.a("$this$parameterizedTypeArguments");
            throw null;
        } else if (!(type instanceof ParameterizedType)) {
            return a.t.l.f2119c;
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getOwnerType() != null) {
                return a.a.a.a.v0.m.l1.a.b(a.a.a.a.v0.m.l1.a.c(a.a.a.a.v0.m.l1.a.a(type, a.f454c), C0021b.f455c));
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            i.a((Object) actualTypeArguments, "actualTypeArguments");
            return g.k(actualTypeArguments);
        }
    }
}

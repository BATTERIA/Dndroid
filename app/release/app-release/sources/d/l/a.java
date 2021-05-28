package d.l;

import d.l.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f3548c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, C0110a> f3549a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    /* renamed from: d.l.a$a  reason: collision with other inner class name */
    public static class C0110a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<e.a, List<b>> f3550a = new HashMap();
        public final Map<b, e.a> b;

        public C0110a(Map<b, e.a> map) {
            this.b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f3550a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3550a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    if (bVar != null) {
                        try {
                            int i = bVar.f3551a;
                            if (i == 0) {
                                bVar.b.invoke(obj, new Object[0]);
                            } else if (i == 1) {
                                bVar.b.invoke(obj, hVar);
                            } else if (i == 2) {
                                bVar.b.invoke(obj, hVar, aVar);
                            }
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException("Failed to call observer method", e2.getCause());
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3551a;
        public final Method b;

        public b(int i, Method method) {
            this.f3551a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3551a == bVar.f3551a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.f3551a * 31);
        }
    }

    public C0110a a(Class<?> cls) {
        C0110a aVar = this.f3549a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final C0110a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0110a a2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : a(cls2).b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0110a aVar = new C0110a(hashMap);
        this.f3549a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final void a(Map<b, e.a> map, b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            StringBuilder a2 = e.a.a.a.a.a("Method ");
            a2.append(method.getName());
            a2.append(" in ");
            a2.append(cls.getName());
            a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a2.append(aVar2);
            a2.append(", new value ");
            a2.append(aVar);
            throw new IllegalArgumentException(a2.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}

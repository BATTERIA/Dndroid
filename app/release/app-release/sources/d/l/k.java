package d.l;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class<?>, Integer> f3565a = new HashMap();
    public static Map<Class<?>, List<Constructor<? extends c>>> b = new HashMap();

    public static int a(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, List<Constructor<? extends c>>> map;
        boolean z;
        Integer num = f3565a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List<Constructor<? extends c>> list = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String a2 = a(canonicalName);
                if (!name.isEmpty()) {
                    a2 = name + "." + a2;
                }
                constructor = Class.forName(a2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor != null) {
                map = b;
                list = Collections.singletonList(constructor);
            } else {
                a aVar = a.f3548c;
                Boolean bool = aVar.b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar.b.put(cls, false);
                                z = false;
                                break;
                            } else if (((o) declaredMethods[i2].getAnnotation(o.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && g.class.isAssignableFrom(superclass)) {
                        if (a((Class<?>) superclass) != 1) {
                            list = new ArrayList<>(b.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && g.class.isAssignableFrom(cls2)) {
                                if (a(cls2) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll(b.get(cls2));
                            }
                            i3++;
                        } else if (list != null) {
                            map = b;
                        }
                    }
                }
            }
            map.put(cls, list);
            i = 2;
        }
        f3565a.put(cls, Integer.valueOf(i));
        return i;
    }

    public static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return (c) constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static f a(Object obj) {
        boolean z = obj instanceof f;
        boolean z2 = obj instanceof b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((b) obj, (f) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((b) obj, null);
        }
        if (z) {
            return (f) obj;
        }
        Class<?> cls = obj.getClass();
        if (a(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends c>> list = b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    public static String a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}

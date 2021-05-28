package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.e1.b.b;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.f;
import a.n;
import a.w.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class c {
    public static final f a(Class<?> cls) {
        f fVar;
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            i.a((Object) cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            a b = b.b(cls);
            a.a.a.a.v0.a.p.c cVar = a.a.a.a.v0.a.p.c.m;
            a.a.a.a.v0.f.b a2 = b.a();
            i.a((Object) a2, "javaClassId.asSingleFqName()");
            a a3 = cVar.a(a2);
            if (a3 != null) {
                b = a3;
            }
            return new f(b, i);
        } else if (i.a(cls, Void.TYPE)) {
            a a4 = a.a(g.k.f200d.g());
            i.a((Object) a4, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new f(a4, i);
        } else {
            a.a.a.a.v0.j.v.c a5 = a.a.a.a.v0.j.v.c.a(cls.getName());
            i.a((Object) a5, "JvmPrimitiveType.get(currentClass.name)");
            a.a.a.a.v0.a.i b2 = a5.b();
            i.a((Object) b2, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                a.a.a.a.v0.f.b bVar = b2.f213f;
                if (bVar == null) {
                    bVar = g.f189f.a(b2.f211d);
                    b2.f213f = bVar;
                }
                i.a((Object) a.a(bVar), "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                int i2 = i - 1;
                return fVar;
            }
            a.a.a.a.v0.f.b bVar2 = b2.f212e;
            if (bVar2 == null) {
                bVar2 = g.f189f.a(b2.f210c);
                b2.f212e = bVar2;
            }
            a a6 = a.a(bVar2);
            i.a((Object) a6, "ClassId.topLevel(primitiveType.typeFqName)");
            fVar = new f(a6, i);
            return fVar;
        }
    }

    public static final void a(l.c cVar, Annotation annotation) {
        Class a2 = e.f.a.g.a(e.f.a.g.a(annotation));
        l.a a3 = cVar.a(b.b(a2), new b(annotation));
        if (a3 != null) {
            a(a3, annotation, a2);
        }
    }

    public static final void a(Class<?> cls, l.c cVar) {
        if (cls == null) {
            i.a("klass");
            throw null;
        } else if (cVar != null) {
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations) {
                i.a((Object) annotation, "annotation");
                a(cVar, annotation);
            }
            cVar.a();
        } else {
            i.a("visitor");
            throw null;
        }
    }

    public static final void a(l.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke != null) {
                    i.a((Object) method, "method");
                    d b = d.b(method.getName());
                    i.a((Object) b, "Name.identifier(method.name)");
                    Class<?> cls2 = invoke.getClass();
                    if (i.a(cls2, Class.class)) {
                        aVar.a(b, a((Class) invoke));
                    } else if (g.f447a.contains(cls2)) {
                        aVar.a(b, invoke);
                    } else if (b.g(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        i.a((Object) cls2, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
                        a b2 = b.b(cls2);
                        d b3 = d.b(((Enum) invoke).name());
                        i.a((Object) b3, "Name.identifier((value as Enum<*>).name)");
                        aVar.a(b, b2, b3);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        i.a((Object) interfaces, "clazz.interfaces");
                        Class cls3 = (Class) e.f.a.g.j(interfaces);
                        i.a((Object) cls3, "annotationClass");
                        l.a a2 = aVar.a(b, b.b(cls3));
                        if (a2 != null) {
                            a(a2, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        l.b a3 = aVar.a(b);
                        if (a3 != null) {
                            Class<?> componentType = cls2.getComponentType();
                            i.a((Object) componentType, "componentType");
                            if (componentType.isEnum()) {
                                a b4 = b.b(componentType);
                                Object[] objArr = (Object[]) invoke;
                                for (Object obj : objArr) {
                                    if (obj != null) {
                                        d b5 = d.b(((Enum) obj).name());
                                        i.a((Object) b5, "Name.identifier((element as Enum<*>).name)");
                                        a3.a(b4, b5);
                                    } else {
                                        throw new n("null cannot be cast to non-null type kotlin.Enum<*>");
                                    }
                                }
                            } else {
                                Object[] objArr2 = (Object[]) invoke;
                                if (i.a(componentType, Class.class)) {
                                    for (Object obj2 : objArr2) {
                                        if (obj2 != null) {
                                            a3.a(a((Class) obj2));
                                        } else {
                                            throw new n("null cannot be cast to non-null type java.lang.Class<*>");
                                        }
                                    }
                                } else {
                                    for (Object obj3 : objArr2) {
                                        a3.a(obj3);
                                    }
                                }
                            }
                            a3.a();
                        } else {
                            continue;
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                } else {
                    i.a();
                    throw null;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}

package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.e1.b.a;
import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.p;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.f.f;
import a.n;
import a.w.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class y extends u implements f, a0, p {
    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean C() {
        return Modifier.isFinal(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.p
    public g L() {
        Class<?> declaringClass = l().getDeclaringClass();
        i.a((Object) declaringClass, "member.declaringClass");
        return new q(declaringClass);
    }

    @Override // a.a.a.a.v0.b.e1.b.f
    public AnnotatedElement M() {
        Member l = l();
        if (l != null) {
            return (AnnotatedElement) l;
        }
        throw new n("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean O() {
        return Modifier.isAbstract(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean R() {
        return Modifier.isStatic(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a a(b bVar) {
        if (bVar != null) {
            return e.f.a.g.a(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.s
    public d d() {
        String name = l().getName();
        if (name != null) {
            return d.b(name);
        }
        d dVar = f.f1354a;
        i.a((Object) dVar, "SpecialNames.NO_NAME_PROVIDED");
        return dVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && i.a(l(), ((y) obj).l());
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public a1 g() {
        return e.f.a.g.a((a0) this);
    }

    public int hashCode() {
        return l().hashCode();
    }

    public abstract Member l();

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + l();
    }

    @Override // a.a.a.a.v0.b.e1.b.a0
    public int w() {
        return l().getModifiers();
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection y() {
        return e.f.a.g.a((f) this);
    }

    public final List<a.a.a.a.v0.d.a.c0.y> a(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        ArrayList arrayList;
        String str;
        Method method;
        if (typeArr == null) {
            i.a("parameterTypes");
            throw null;
        } else if (annotationArr != null) {
            ArrayList arrayList2 = new ArrayList(typeArr.length);
            Member l = l();
            if (l != null) {
                a.C0020a aVar = a.f450a;
                if (aVar == null) {
                    Class<?> cls = l.getClass();
                    try {
                        aVar = new a.C0020a(cls.getMethod("getParameters", new Class[0]), b.e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
                    } catch (NoSuchMethodException unused) {
                        aVar = new a.C0020a(null, null);
                    }
                    a.f450a = aVar;
                }
                Method method2 = aVar.f451a;
                if (method2 == null || (method = aVar.b) == null) {
                    arrayList = null;
                } else {
                    Object invoke = method2.invoke(l, new Object[0]);
                    if (invoke != null) {
                        Object[] objArr = (Object[]) invoke;
                        arrayList = new ArrayList(objArr.length);
                        for (Object obj : objArr) {
                            Object invoke2 = method.invoke(obj, new Object[0]);
                            if (invoke2 != null) {
                                arrayList.add((String) invoke2);
                            } else {
                                throw new n("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    } else {
                        throw new n("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                }
                int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
                int length = typeArr.length;
                int i = 0;
                while (i < length) {
                    d0 a2 = d0.a(typeArr[i]);
                    if (arrayList != null) {
                        str = (String) a.t.f.b(arrayList, i + size);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + d() + " type=" + a2 + ") in " + arrayList + "@ReflectJavaMember").toString());
                        }
                    } else {
                        str = null;
                    }
                    arrayList2.add(new f0(a2, annotationArr[i], str, z && i == e.f.a.g.d(typeArr)));
                    i++;
                }
                return arrayList2;
            }
            i.a("member");
            throw null;
        } else {
            i.a("parameterAnnotations");
            throw null;
        }
    }
}

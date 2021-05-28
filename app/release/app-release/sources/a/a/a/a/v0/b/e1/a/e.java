package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.b.e1.b.b;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.d.b.v.a;
import a.a.a.a.v0.f.d;
import a.w.c.f;
import a.w.c.i;
import e.f.a.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f445a;
    public final a b;

    public /* synthetic */ e(Class cls, a aVar, f fVar) {
        this.f445a = cls;
        this.b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.f946f == null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.b.e1.a.e a(java.lang.Class<?> r14) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.e1.a.e.a(java.lang.Class):a.a.a.a.v0.b.e1.a.e");
    }

    @Override // a.a.a.a.v0.d.b.l
    public a.a.a.a.v0.f.a a() {
        return b.b(this.f445a);
    }

    @Override // a.a.a.a.v0.d.b.l
    public String b() {
        StringBuilder sb = new StringBuilder();
        String name = this.f445a.getName();
        i.a((Object) name, "klass.name");
        sb.append(a.a.a.a.v0.m.l1.a.a(name, '.', '/', false, 4));
        sb.append(".class");
        return sb.toString();
    }

    @Override // a.a.a.a.v0.d.b.l
    public a c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && i.a(this.f445a, ((e) obj).f445a);
    }

    public int hashCode() {
        return this.f445a.hashCode();
    }

    public String toString() {
        return e.class.getName() + ": " + this.f445a;
    }

    @Override // a.a.a.a.v0.d.b.l
    public void a(l.c cVar, byte[] bArr) {
        if (cVar != null) {
            c.a(this.f445a, cVar);
        } else {
            i.a("visitor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.b.l
    public void a(l.d dVar, byte[] bArr) {
        String str;
        Constructor<?>[] constructorArr;
        String str2;
        int i;
        Method[] methodArr;
        if (dVar != null) {
            Class<?> cls = this.f445a;
            if (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    str = "parameterType";
                    if (i2 >= length) {
                        break;
                    }
                    Method method = declaredMethods[i2];
                    i.a((Object) method, "method");
                    d b2 = d.b(method.getName());
                    i.a((Object) b2, "Name.identifier(method.name)");
                    StringBuilder a2 = e.a.a.a.a.a("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    for (Class<?> cls2 : parameterTypes) {
                        i.a((Object) cls2, str);
                        a2.append(b.c(cls2));
                    }
                    a2.append(")");
                    Class<?> returnType = method.getReturnType();
                    i.a((Object) returnType, "method.returnType");
                    a2.append(b.c(returnType));
                    String sb = a2.toString();
                    i.a((Object) sb, "sb.toString()");
                    l.e a3 = dVar.a(b2, sb);
                    if (a3 != null) {
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        for (Annotation annotation : declaredAnnotations) {
                            i.a((Object) annotation, "annotation");
                            Class a4 = g.a(g.a(annotation));
                            l.a a5 = a3.a(b.b(a4), new b(annotation));
                            if (a5 != null) {
                                c.a(a5, annotation, a4);
                            }
                        }
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        i.a((Object) parameterAnnotations, "method.parameterAnnotations");
                        int length2 = parameterAnnotations.length;
                        for (int i3 = 0; i3 < length2; i3++) {
                            Annotation[] annotationArr = parameterAnnotations[i3];
                            int length3 = annotationArr.length;
                            int i4 = 0;
                            while (i4 < length3) {
                                Annotation annotation2 = annotationArr[i4];
                                Class a6 = g.a(g.a(annotation2));
                                a.a.a.a.v0.f.a b3 = b.b(a6);
                                i.a((Object) annotation2, "annotation");
                                l.a a7 = a3.a(i3, b3, new b(annotation2));
                                if (a7 != null) {
                                    c.a(a7, annotation2, a6);
                                }
                                i4++;
                                declaredMethods = declaredMethods;
                            }
                        }
                        methodArr = declaredMethods;
                        a3.a();
                    } else {
                        methodArr = declaredMethods;
                    }
                    i2++;
                    declaredMethods = methodArr;
                }
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                int length4 = declaredConstructors.length;
                int i5 = 0;
                while (i5 < length4) {
                    Constructor<?> constructor = declaredConstructors[i5];
                    d d2 = d.d("<init>");
                    i.a((Object) d2, "Name.special(\"<init>\")");
                    i.a((Object) constructor, "constructor");
                    StringBuilder a8 = e.a.a.a.a.a("(");
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    for (Class<?> cls3 : parameterTypes2) {
                        i.a((Object) cls3, str);
                        a8.append(b.c(cls3));
                    }
                    a8.append(")V");
                    String sb2 = a8.toString();
                    i.a((Object) sb2, "sb.toString()");
                    l.e a9 = dVar.a(d2, sb2);
                    if (a9 != null) {
                        Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                        int length5 = declaredAnnotations2.length;
                        int i6 = 0;
                        while (i6 < length5) {
                            Annotation annotation3 = declaredAnnotations2[i6];
                            i.a((Object) annotation3, "annotation");
                            Class a10 = g.a(g.a(annotation3));
                            l.a a11 = a9.a(b.b(a10), new b(annotation3));
                            if (a11 != null) {
                                c.a(a11, annotation3, a10);
                            }
                            i6++;
                            declaredConstructors = declaredConstructors;
                            length4 = length4;
                        }
                        constructorArr = declaredConstructors;
                        i = length4;
                        Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                        i.a((Object) parameterAnnotations2, "parameterAnnotations");
                        if (!(parameterAnnotations2.length == 0)) {
                            int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                            int length7 = parameterAnnotations2.length;
                            for (int i7 = 0; i7 < length7; i7++) {
                                Annotation[] annotationArr2 = parameterAnnotations2[i7];
                                int length8 = annotationArr2.length;
                                int i8 = 0;
                                while (i8 < length8) {
                                    Annotation annotation4 = annotationArr2[i8];
                                    Class a12 = g.a(g.a(annotation4));
                                    int i9 = i7 + length6;
                                    a.a.a.a.v0.f.a b4 = b.b(a12);
                                    i.a((Object) annotation4, "annotation");
                                    l.a a13 = a9.a(i9, b4, new b(annotation4));
                                    if (a13 != null) {
                                        c.a(a13, annotation4, a12);
                                    }
                                    i8++;
                                    length7 = length7;
                                    parameterAnnotations2 = parameterAnnotations2;
                                    length6 = length6;
                                    str = str;
                                }
                            }
                        }
                        str2 = str;
                        a9.a();
                    } else {
                        constructorArr = declaredConstructors;
                        i = length4;
                        str2 = str;
                    }
                    i5++;
                    declaredConstructors = constructorArr;
                    length4 = i;
                    str = str2;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                for (Field field : declaredFields) {
                    i.a((Object) field, "field");
                    d b5 = d.b(field.getName());
                    i.a((Object) b5, "Name.identifier(field.name)");
                    Class<?> type = field.getType();
                    i.a((Object) type, "field.type");
                    l.c a14 = dVar.a(b5, b.c(type), null);
                    if (a14 != null) {
                        Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                        for (Annotation annotation5 : declaredAnnotations3) {
                            i.a((Object) annotation5, "annotation");
                            Class a15 = g.a(g.a(annotation5));
                            l.a a16 = a14.a(b.b(a15), new b(annotation5));
                            if (a16 != null) {
                                c.a(a16, annotation5, a15);
                            }
                        }
                        a14.a();
                    }
                }
                return;
            }
            i.a("klass");
            throw null;
        }
        i.a("visitor");
        throw null;
    }
}

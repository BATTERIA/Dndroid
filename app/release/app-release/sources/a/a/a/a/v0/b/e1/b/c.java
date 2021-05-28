package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.b;
import a.a.a.a.v0.f.d;
import a.w.c.i;
import e.f.a.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public final class c extends u implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Annotation f457a;

    public c(Annotation annotation) {
        if (annotation != null) {
            this.f457a = annotation;
        } else {
            i.a("annotation");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.a
    public Collection<b> J() {
        Method[] declaredMethods = g.a(g.a(this.f457a)).getDeclaredMethods();
        i.a((Object) declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(this.f457a, new Object[0]);
            i.a(invoke, "method.invoke(annotation)");
            i.a((Object) method, "method");
            arrayList.add(d.a(invoke, d.b(method.getName())));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.d.a.c0.a
    public a.a.a.a.v0.f.a a() {
        return b.b(g.a(g.a(this.f457a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(this.f457a, ((c) obj).f457a);
    }

    @Override // a.a.a.a.v0.d.a.c0.a
    public boolean f() {
        return false;
    }

    public int hashCode() {
        return this.f457a.hashCode();
    }

    @Override // a.a.a.a.v0.d.a.c0.a
    public a.a.a.a.v0.d.a.c0.g m() {
        return new q(g.a(g.a(this.f457a)));
    }

    public String toString() {
        return c.class.getName() + ": " + this.f457a;
    }
}

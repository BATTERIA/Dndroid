package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.d.a.c0.a0;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.j;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.l1.a;
import a.w.b.l;
import a.w.c.i;
import a.w.c.u;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class q extends u implements f, a0, g {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f474a;

    public q(Class<?> cls) {
        if (cls != null) {
            this.f474a = cls;
        } else {
            i.a("klass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public Collection B() {
        Method[] declaredMethods = this.f474a.getDeclaredMethods();
        i.a((Object) declaredMethods, "klass.declaredMethods");
        return a.b(a.d(a.a(e.f.a.g.a((Object[]) declaredMethods), (l) new o(this)), p.f473f));
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean C() {
        return Modifier.isFinal(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public boolean D() {
        return false;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public boolean H() {
        return this.f474a.isAnnotation();
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public boolean K() {
        return this.f474a.isInterface();
    }

    @Override // a.a.a.a.v0.b.e1.b.f
    public AnnotatedElement M() {
        return this.f474a;
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean O() {
        return Modifier.isAbstract(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public a0 Q() {
        return null;
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public boolean R() {
        return Modifier.isStatic(w());
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a.a.a.a.v0.d.a.c0.a a(b bVar) {
        if (bVar != null) {
            return e.f.a.g.a(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public Collection<j> b() {
        Object obj = Object.class;
        if (i.a(this.f474a, obj)) {
            return a.t.l.f2119c;
        }
        u uVar = new u(2);
        Object genericSuperclass = this.f474a.getGenericSuperclass();
        if (genericSuperclass != null) {
            obj = genericSuperclass;
        }
        uVar.f2150a.add(obj);
        Type[] genericInterfaces = this.f474a.getGenericInterfaces();
        i.a((Object) genericInterfaces, "klass.genericInterfaces");
        uVar.a(genericInterfaces);
        List<Type> g2 = e.f.a.g.g((Type[]) uVar.f2150a.toArray(new Type[uVar.a()]));
        ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) g2, 10));
        for (Type type : g2) {
            arrayList.add(new s(type));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.d.a.c0.s
    public d d() {
        d b = d.b(this.f474a.getSimpleName());
        i.a((Object) b, "Name.identifier(klass.simpleName)");
        return b;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public b e() {
        b a2 = b.b(this.f474a).a();
        i.a((Object) a2, "klass.classId.asSingleFqName()");
        return a2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && i.a(this.f474a, ((q) obj).f474a);
    }

    @Override // a.a.a.a.v0.d.a.c0.r
    public a1 g() {
        return e.f.a.g.a((a0) this);
    }

    public int hashCode() {
        return this.f474a.hashCode();
    }

    @Override // a.a.a.a.v0.d.a.c0.x
    public List<e0> k() {
        TypeVariable<Class<?>>[] typeParameters = this.f474a.getTypeParameters();
        i.a((Object) typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public g n() {
        Class<?> declaringClass = this.f474a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public boolean p() {
        return this.f474a.isEnum();
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public Collection q() {
        Constructor<?>[] declaredConstructors = this.f474a.getDeclaredConstructors();
        i.a((Object) declaredConstructors, "klass.declaredConstructors");
        return a.b(a.d(a.b(e.f.a.g.a((Object[]) declaredConstructors), i.f466f), j.f467f));
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public Collection s() {
        Class<?>[] declaredClasses = this.f474a.getDeclaredClasses();
        i.a((Object) declaredClasses, "klass.declaredClasses");
        return a.b(a.e(a.b(e.f.a.g.a((Object[]) declaredClasses), m.f470c), n.f471c));
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f474a;
    }

    @Override // a.a.a.a.v0.d.a.c0.g
    public Collection v() {
        Field[] declaredFields = this.f474a.getDeclaredFields();
        i.a((Object) declaredFields, "klass.declaredFields");
        return a.b(a.d(a.b(e.f.a.g.a((Object[]) declaredFields), k.f468f), l.f469f));
    }

    @Override // a.a.a.a.v0.b.e1.b.a0
    public int w() {
        return this.f474a.getModifiers();
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection y() {
        return e.f.a.g.a((f) this);
    }
}

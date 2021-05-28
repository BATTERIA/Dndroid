package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.i;
import a.a.a.a.v0.d.a.c0.j;
import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.f.b;
import a.n;
import a.t.l;
import e.a.a.a.a;
import e.f.a.g;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s extends d0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final i f475a;
    public final Type b;

    public s(Type type) {
        i iVar;
        if (type != null) {
            this.b = type;
            if (type instanceof Class) {
                iVar = new q((Class) type);
            } else if (type instanceof TypeVariable) {
                iVar = new e0((TypeVariable) type);
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType != null) {
                    iVar = new q((Class) rawType);
                } else {
                    throw new n("null cannot be cast to non-null type java.lang.Class<*>");
                }
            } else {
                StringBuilder a2 = a.a("Not a classifier type (");
                a2.append(type.getClass());
                a2.append("): ");
                a2.append(type);
                throw new IllegalStateException(a2.toString());
            }
            this.f475a = iVar;
            return;
        }
        a.w.c.i.a("reflectType");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.j
    public String F() {
        return this.b.toString();
    }

    @Override // a.a.a.a.v0.d.a.c0.j
    public boolean N() {
        Type type = this.b;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        a.w.c.i.a((Object) typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // a.a.a.a.v0.d.a.c0.j
    public String P() {
        StringBuilder a2 = a.a("Type not found: ");
        a2.append(this.b);
        throw new UnsupportedOperationException(a2.toString());
    }

    @Override // a.a.a.a.v0.b.e1.b.d0
    public Type S() {
        return this.b;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a.a.a.a.v0.d.a.c0.a a(b bVar) {
        if (bVar != null) {
            return null;
        }
        a.w.c.i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.j
    public i i() {
        return this.f475a;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    @Override // a.a.a.a.v0.d.a.c0.j
    public List<v> x() {
        List<Type> a2 = b.a(this.b);
        ArrayList arrayList = new ArrayList(g.a((Iterable) a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(d0.a(it.next()));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection<a.a.a.a.v0.d.a.c0.a> y() {
        return l.f2119c;
    }
}

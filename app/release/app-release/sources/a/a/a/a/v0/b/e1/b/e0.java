package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.w;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.t.f;
import a.t.l;
import a.w.c.i;
import e.f.a.g;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e0 extends u implements f, w {

    /* renamed from: a  reason: collision with root package name */
    public final TypeVariable<?> f460a;

    public e0(TypeVariable<?> typeVariable) {
        if (typeVariable != null) {
            this.f460a = typeVariable;
        } else {
            i.a("typeVariable");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e1.b.f
    public AnnotatedElement M() {
        TypeVariable<?> typeVariable = this.f460a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a a(b bVar) {
        if (bVar != null) {
            return g.a(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.s
    public d d() {
        d b = d.b(this.f460a.getName());
        i.a((Object) b, "Name.identifier(typeVariable.name)");
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && i.a(this.f460a, ((e0) obj).f460a);
    }

    @Override // a.a.a.a.v0.d.a.c0.w
    public Collection getUpperBounds() {
        Type[] bounds = this.f460a.getBounds();
        i.a((Object) bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) f.f((List) arrayList);
        return i.a(sVar != null ? sVar.b : null, Object.class) ? l.f2119c : arrayList;
    }

    public int hashCode() {
        return this.f460a.hashCode();
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    public String toString() {
        return e0.class.getName() + ": " + this.f460a;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection y() {
        return g.a((f) this);
    }
}

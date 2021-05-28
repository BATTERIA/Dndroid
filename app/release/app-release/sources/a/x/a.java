package a.x;

import a.a.l;
import a.w.c.i;

public abstract class a<T> implements b<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    public T f2151a;

    public a(T t) {
        this.f2151a = t;
    }

    @Override // a.x.b
    public T a(Object obj, l<?> lVar) {
        if (lVar != null) {
            return this.f2151a;
        }
        i.a("property");
        throw null;
    }

    @Override // a.x.b
    public void a(Object obj, l<?> lVar, T t) {
        if (lVar == null) {
            i.a("property");
            throw null;
        } else if (!((a.a.a.a.v0.i.l) this).f1516c.f1507a) {
            this.f2151a = t;
        } else {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}

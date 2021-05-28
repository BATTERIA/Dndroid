package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.h0.c;
import e.h.a.k;
import e.h.a.z;

public class r implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f4802c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f4803d;

    public class a extends c0<T1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f4804a;

        public a(Class cls) {
            this.f4804a = cls;
        }

        @Override // e.h.a.c0
        public T1 a(e.h.a.h0.a aVar) {
            T1 t1 = (T1) r.this.f4803d.a(aVar);
            if (t1 == null || this.f4804a.isInstance(t1)) {
                return t1;
            }
            StringBuilder a2 = e.a.a.a.a.a("Expected a ");
            a2.append(this.f4804a.getName());
            a2.append(" but was ");
            a2.append(t1.getClass().getName());
            throw new z(a2.toString());
        }

        @Override // e.h.a.c0
        public void a(c cVar, T1 t1) {
            r.this.f4803d.a(cVar, t1);
        }
    }

    public r(Class cls, c0 c0Var) {
        this.f4802c = cls;
        this.f4803d = c0Var;
    }

    @Override // e.h.a.d0
    public <T2> c0<T2> a(k kVar, e.h.a.g0.a<T2> aVar) {
        Class<? super T> cls = aVar.f4806a;
        if (!this.f4802c.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Factory[typeHierarchy=");
        a2.append(this.f4802c.getName());
        a2.append(",adapter=");
        a2.append(this.f4803d);
        a2.append("]");
        return a2.toString();
    }
}

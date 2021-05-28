package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.g0.a;
import e.h.a.k;

public class q implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f4799c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Class f4800d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c0 f4801e;

    public q(Class cls, Class cls2, c0 c0Var) {
        this.f4799c = cls;
        this.f4800d = cls2;
        this.f4801e = c0Var;
    }

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, a<T> aVar) {
        Class<? super T> cls = aVar.f4806a;
        if (cls == this.f4799c || cls == this.f4800d) {
            return this.f4801e;
        }
        return null;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Factory[type=");
        a2.append(this.f4799c.getName());
        a2.append("+");
        a2.append(this.f4800d.getName());
        a2.append(",adapter=");
        a2.append(this.f4801e);
        a2.append("]");
        return a2.toString();
    }
}

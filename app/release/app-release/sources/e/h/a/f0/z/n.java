package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.f0.z.j;
import e.h.a.h0.a;
import e.h.a.h0.c;
import e.h.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class n<T> extends c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final k f4781a;
    public final c0<T> b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f4782c;

    public n(k kVar, c0<T> c0Var, Type type) {
        this.f4781a = kVar;
        this.b = c0Var;
        this.f4782c = type;
    }

    @Override // e.h.a.c0
    public T a(a aVar) {
        return this.b.a(aVar);
    }

    @Override // e.h.a.c0
    public void a(c cVar, T t) {
        c0<T> c0Var = this.b;
        Type type = this.f4782c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f4782c) {
            c0Var = this.f4781a.a((e.h.a.g0.a) new e.h.a.g0.a<>(type));
            if (c0Var instanceof j.a) {
                c0<T> c0Var2 = this.b;
                if (!(c0Var2 instanceof j.a)) {
                    c0Var = c0Var2;
                }
            }
        }
        c0Var.a(cVar, t);
    }
}

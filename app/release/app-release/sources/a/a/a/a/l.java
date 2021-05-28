package a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.m.d0;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.lang.reflect.Type;

public final class l extends j implements a<Type> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d0 f96c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0000a.j f97d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, a.C0000a.j jVar) {
        super(0);
        this.f96c = d0Var;
        this.f97d = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Type a() {
        String str;
        Type type;
        h c2 = this.f96c.I0().c();
        if (c2 instanceof e) {
            Class<?> a2 = s0.a((e) c2);
            if (a2 != null) {
                if (i.a(a.this.f1e.getSuperclass(), a2)) {
                    type = a.this.f1e.getGenericSuperclass();
                    str = "jClass.genericSuperclass";
                } else {
                    Class<?>[] interfaces = a.this.f1e.getInterfaces();
                    i.a((Object) interfaces, "jClass.interfaces");
                    int b = g.b(interfaces, a2);
                    if (b >= 0) {
                        type = a.this.f1e.getGenericInterfaces()[b];
                        str = "jClass.genericInterfaces[index]";
                    } else {
                        StringBuilder a3 = e.a.a.a.a.a("No superclass of ");
                        a3.append(this.f97d.f19c);
                        a3.append(" in Java reflection for ");
                        a3.append(c2);
                        throw new i0(a3.toString());
                    }
                }
                i.a((Object) type, str);
                return type;
            }
            StringBuilder a4 = e.a.a.a.a.a("Unsupported superclass of ");
            a4.append(this.f97d.f19c);
            a4.append(": ");
            a4.append(c2);
            throw new i0(a4.toString());
        }
        throw new i0("Supertype not a class: " + c2);
    }
}

package e.h.a.f0;

import java.lang.reflect.Method;

public class u extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f4740a;
    public final /* synthetic */ Object b;

    public u(Method method, Object obj) {
        this.f4740a = method;
        this.b = obj;
    }

    @Override // e.h.a.f0.y
    public <T> T a(Class<T> cls) {
        y.b(cls);
        return (T) this.f4740a.invoke(this.b, cls);
    }
}

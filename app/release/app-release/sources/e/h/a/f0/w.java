package e.h.a.f0;

import java.lang.reflect.Method;

public class w extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f4742a;

    public w(Method method) {
        this.f4742a = method;
    }

    @Override // e.h.a.f0.y
    public <T> T a(Class<T> cls) {
        y.b(cls);
        return (T) this.f4742a.invoke(null, cls, Object.class);
    }
}

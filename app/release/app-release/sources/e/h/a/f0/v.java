package e.h.a.f0;

import java.lang.reflect.Method;

public class v extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Method f4741a;
    public final /* synthetic */ int b;

    public v(Method method, int i) {
        this.f4741a = method;
        this.b = i;
    }

    @Override // e.h.a.f0.y
    public <T> T a(Class<T> cls) {
        y.b(cls);
        return (T) this.f4741a.invoke(null, cls, Integer.valueOf(this.b));
    }
}

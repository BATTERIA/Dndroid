package e.h.a.f0;

import e.a.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class h implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Constructor f4706a;

    public h(g gVar, Constructor constructor) {
        this.f4706a = constructor;
    }

    @Override // e.h.a.f0.t
    public T a() {
        try {
            return (T) this.f4706a.newInstance(null);
        } catch (InstantiationException e2) {
            StringBuilder a2 = a.a("Failed to invoke ");
            a2.append(this.f4706a);
            a2.append(" with no args");
            throw new RuntimeException(a2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder a3 = a.a("Failed to invoke ");
            a3.append(this.f4706a);
            a3.append(" with no args");
            throw new RuntimeException(a3.toString(), e3.getTargetException());
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }
}

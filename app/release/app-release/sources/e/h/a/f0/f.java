package e.h.a.f0;

import e.a.a.a.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class f implements t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y f4701a;
    public final /* synthetic */ Class b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f4702c;

    public f(g gVar, Class cls, Type type) {
        y yVar;
        this.b = cls;
        this.f4702c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                yVar = new v(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    yVar = new w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new x();
                }
            }
        }
        this.f4701a = yVar;
    }

    @Override // e.h.a.f0.t
    public T a() {
        try {
            return (T) this.f4701a.a(this.b);
        } catch (Exception e2) {
            StringBuilder a2 = a.a("Unable to invoke no-args constructor for ");
            a2.append(this.f4702c);
            a2.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(a2.toString(), e2);
        }
    }
}

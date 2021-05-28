package d.j.d;

import androidx.fragment.app.Fragment;
import d.d.h;
import e.a.a.a.a;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final h<String, Class<?>> f3474a = new h<>();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str) {
        Class<?> orDefault = f3474a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        f3474a.put(str, cls);
        return cls;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.Fragment> */
    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.c(a.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        } catch (ClassCastException e3) {
            throw new Fragment.c(a.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}

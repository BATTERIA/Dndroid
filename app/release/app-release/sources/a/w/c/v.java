package a.w.c;

import a.w.c.w.a;
import java.util.Set;

public class v {
    public static Set a(Object obj) {
        if (obj instanceof a) {
            a(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            a(e2);
            throw null;
        }
    }

    public static ClassCastException a(ClassCastException classCastException) {
        i.a((Throwable) classCastException, v.class.getName());
        throw classCastException;
    }

    public static void a(Object obj, String str) {
        a(new ClassCastException(e.a.a.a.a.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str)));
        throw null;
    }
}

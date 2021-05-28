package a.w.c;

import a.d;
import a.p;
import e.a.a.a.a;
import java.util.Arrays;

public class i {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static <T extends Throwable> T a(T t) {
        a((Throwable) t, i.class.getName());
        return t;
    }

    public static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void a() {
        d dVar = new d();
        a(dVar);
        throw dVar;
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a.b(str, " must not be null"));
            a(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        a(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(String str) {
        p pVar = new p(a.a("lateinit property ", str, " has not been initialized"));
        a(pVar);
        throw pVar;
    }
}

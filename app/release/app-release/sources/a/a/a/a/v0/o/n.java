package a.a.a.a.v0.o;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2021a = new a();

    public static class a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f2022a;

        public /* synthetic */ b(Throwable th, a aVar) {
            if (th != null) {
                this.f2022a = th;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 1) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public String toString() {
            return this.f2022a.toString();
        }
    }

    public static <V> Object a(V v) {
        return v == null ? f2021a : v;
    }

    public static Object a(Throwable th) {
        if (th != null) {
            return new b(th, null);
        }
        a(3);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V b(Object obj) {
        if (obj != 0) {
            c(obj);
            if (obj == 0) {
                a(0);
                throw null;
            } else if (obj == f2021a) {
                return null;
            } else {
                return obj;
            }
        } else {
            a(4);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V c(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable th = ((b) obj).f2022a;
        if (th != null) {
            throw th;
        }
        b.a(1);
        throw null;
    }
}

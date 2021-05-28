package a.a.a.a.v0.f;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f1354a = d.d("<no name provided>");
    public static final d b = d.b("Companion");

    /* renamed from: c  reason: collision with root package name */
    public static final d f1355c = d.b("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");

    static {
        d.d("<root package>");
        d.d("<anonymous>");
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 1 ? 2 : 3)];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        if (i != 1) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static boolean a(d dVar) {
        if (dVar != null) {
            return !dVar.a().isEmpty() && !dVar.f1352d;
        }
        a(1);
        throw null;
    }

    public static d b(d dVar) {
        if (dVar == null || dVar.f1352d) {
            dVar = f1355c;
        }
        if (dVar != null) {
            return dVar;
        }
        a(0);
        throw null;
    }
}

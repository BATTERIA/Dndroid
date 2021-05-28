package a.a.a.a.v0.b.b1;

public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public final h f307c;

    public b(h hVar) {
        if (hVar != null) {
            this.f307c = hVar;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
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

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        h hVar = this.f307c;
        if (hVar != null) {
            return hVar;
        }
        a(1);
        throw null;
    }
}

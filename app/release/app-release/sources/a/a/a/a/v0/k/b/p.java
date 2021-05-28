package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import java.util.List;

public interface p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f1750a = new a();

    public static class a implements p {
        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.k.b.p
        public void a(b bVar) {
            if (bVar == null) {
                a(2);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.k.b.p
        public void a(e eVar, List<String> list) {
            if (eVar == null) {
                a(0);
                throw null;
            } else if (list == null) {
                a(1);
                throw null;
            }
        }
    }

    void a(b bVar);

    void a(e eVar, List<String> list);
}

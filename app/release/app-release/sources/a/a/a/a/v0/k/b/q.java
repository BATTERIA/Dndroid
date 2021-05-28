package a.a.a.a.v0.k.b;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;

public interface q {

    public static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1751a = new a();

        @Override // a.a.a.a.v0.k.b.q
        public d0 a(g0 g0Var, String str, k0 k0Var, k0 k0Var2) {
            if (g0Var == null) {
                i.a("proto");
                throw null;
            } else if (str == null) {
                i.a("flexibleId");
                throw null;
            } else if (k0Var == null) {
                i.a("lowerBound");
                throw null;
            } else if (k0Var2 != null) {
                throw new IllegalArgumentException("This method should not be used.");
            } else {
                i.a("upperBound");
                throw null;
            }
        }
    }

    d0 a(g0 g0Var, String str, k0 k0Var, k0 k0Var2);
}

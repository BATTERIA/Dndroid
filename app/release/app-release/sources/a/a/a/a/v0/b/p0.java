package a.a.a.a.v0.b;

import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.s0;
import a.q;
import a.w.b.l;
import a.w.c.i;
import java.util.Collection;

public interface p0 {

    public static final class a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f493a = new a();

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.m.d0> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // a.a.a.a.v0.b.p0
        public Collection<d0> a(s0 s0Var, Collection<? extends d0> collection, l<? super s0, ? extends Iterable<? extends d0>> lVar, l<? super d0, q> lVar2) {
            if (s0Var == null) {
                i.a("currentTypeConstructor");
                throw null;
            } else if (collection == 0) {
                i.a("superTypes");
                throw null;
            } else if (lVar == null) {
                i.a("neighbors");
                throw null;
            } else if (lVar2 != null) {
                return collection;
            } else {
                i.a("reportLoop");
                throw null;
            }
        }
    }

    Collection<d0> a(s0 s0Var, Collection<? extends d0> collection, l<? super s0, ? extends Iterable<? extends d0>> lVar, l<? super d0, q> lVar2);
}

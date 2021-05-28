package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.f.b;
import a.t.k;
import a.w.c.i;
import e.f.a.g;
import java.util.Iterator;
import java.util.List;

public interface h extends Iterable<c>, a.w.c.w.a {
    public static final a b = a.b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f321a = new C0015a();
        public static final /* synthetic */ a b = new a();

        /* renamed from: a.a.a.a.v0.b.b1.h$a$a  reason: collision with other inner class name */
        public static final class C0015a implements h {
            @Override // a.a.a.a.v0.b.b1.h
            public c a(b bVar) {
                if (bVar != null) {
                    return null;
                }
                i.a("fqName");
                throw null;
            }

            @Override // a.a.a.a.v0.b.b1.h
            public boolean b(b bVar) {
                if (bVar != null) {
                    return g.b(this, bVar);
                }
                i.a("fqName");
                throw null;
            }

            @Override // a.a.a.a.v0.b.b1.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                return k.f2118c;
            }

            public String toString() {
                return "EMPTY";
            }
        }

        public final h a(List<? extends c> list) {
            if (list != null) {
                return list.isEmpty() ? f321a : new i(list);
            }
            i.a("annotations");
            throw null;
        }
    }

    c a(b bVar);

    boolean b(b bVar);

    boolean isEmpty();
}

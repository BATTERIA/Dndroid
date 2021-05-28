package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.f.d;
import a.t.n;
import a.w.b.l;
import a.w.c.j;
import java.util.Collection;
import java.util.Set;

public interface i extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1624a = a.b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l<d, Boolean> f1625a = C0065a.f1626c;
        public static final /* synthetic */ a b = new a();

        /* renamed from: a.a.a.a.v0.j.w.i$a$a  reason: collision with other inner class name */
        public static final class C0065a extends j implements l<d, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0065a f1626c = new C0065a();

            public C0065a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public Boolean a(d dVar) {
                if (dVar != null) {
                    return true;
                }
                a.w.c.i.a("it");
                throw null;
            }
        }
    }

    public static final class b extends j {
        public static final b b = new b();

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Set<d> a() {
            return n.f2121c;
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Set<d> b() {
            return n.f2121c;
        }
    }

    Collection<? extends l0> a(d dVar, a.a.a.a.v0.c.a.b bVar);

    Set<d> a();

    Set<d> b();

    Collection<? extends f0> c(d dVar, a.a.a.a.v0.c.a.b bVar);
}

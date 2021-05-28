package a.a.a.a.v0.b;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.w.b.l;
import a.w.c.i;
import java.util.Collection;
import java.util.List;

public interface w extends k {

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f505a;

        public a(String str) {
            if (str != null) {
                this.f505a = str;
            } else {
                i.a("name");
                throw null;
            }
        }

        public String toString() {
            return this.f505a;
        }
    }

    List<w> E0();

    b0 a(b bVar);

    <T> T a(a<T> aVar);

    Collection<b> a(b bVar, l<? super d, Boolean> lVar);

    boolean a(w wVar);

    g m();
}

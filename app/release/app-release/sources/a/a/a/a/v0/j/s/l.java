package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.q;
import a.w.c.i;

public abstract class l extends g<q> {

    public static final class a extends l {
        public final String b;

        public a(String str) {
            if (str != null) {
                this.b = str;
            } else {
                i.a("message");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.s.g
        public d0 a(w wVar) {
            if (wVar != null) {
                k0 b2 = a.a.a.a.v0.m.w.b(this.b);
                i.a((Object) b2, "ErrorUtils.createErrorType(message)");
                return b2;
            }
            i.a("module");
            throw null;
        }

        @Override // a.a.a.a.v0.j.s.g
        public String toString() {
            return this.b;
        }
    }

    public l() {
        super(q.f2100a);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.a.a.a.v0.j.s.g
    public q a() {
        throw new UnsupportedOperationException();
    }
}

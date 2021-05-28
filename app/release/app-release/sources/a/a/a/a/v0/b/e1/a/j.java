package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.b.e1.b.u;
import a.a.a.a.v0.b.n0;
import a.a.a.a.v0.d.a.b0.b;
import a.a.a.a.v0.d.a.c0.l;
import a.w.c.i;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final j f449a = new j();

    public static final class a implements a.a.a.a.v0.d.a.b0.a {
        public final u b;

        public a(u uVar) {
            if (uVar != null) {
                this.b = uVar;
            } else {
                i.a("javaElement");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.m0
        public n0 a() {
            n0 n0Var = n0.f492a;
            i.a((Object) n0Var, "SourceFile.NO_SOURCE_FILE");
            return n0Var;
        }

        @Override // a.a.a.a.v0.d.a.b0.a
        public l b() {
            return this.b;
        }

        public String toString() {
            return a.class.getName() + ": " + this.b.toString();
        }
    }

    @Override // a.a.a.a.v0.d.a.b0.b
    public a.a.a.a.v0.d.a.b0.a a(l lVar) {
        if (lVar != null) {
            return new a((u) lVar);
        }
        i.a("javaElement");
        throw null;
    }
}

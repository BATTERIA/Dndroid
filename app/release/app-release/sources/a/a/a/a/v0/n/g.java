package a.a.a.a.v0.n;

import a.a.a.a.v0.b.s;
import a.w.c.f;
import a.w.c.i;

public abstract class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1971a;

    public static final class a extends g {
        public static final a b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return sVar.J() != null;
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public static final class b extends g {
        public static final b b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return (sVar.J() == null && sVar.g0() == null) ? false : true;
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public /* synthetic */ g(String str, f fVar) {
        this.f1971a = str;
    }

    @Override // a.a.a.a.v0.n.b
    public String a() {
        return this.f1971a;
    }

    @Override // a.a.a.a.v0.n.b
    public String a(s sVar) {
        if (sVar == null) {
            i.a("functionDescriptor");
            throw null;
        } else if (!b(sVar)) {
            return a();
        } else {
            return null;
        }
    }
}

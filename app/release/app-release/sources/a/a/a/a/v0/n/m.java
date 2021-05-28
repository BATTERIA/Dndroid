package a.a.a.a.v0.n;

import a.a.a.a.v0.b.s;
import a.w.c.f;
import a.w.c.i;

public abstract class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1993a;

    public static final class a extends m {
        public final int b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = e.a.a.a.a.a(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L_0x000e
                java.lang.String r1 = "s"
                goto L_0x0010
            L_0x000e:
                java.lang.String r1 = ""
            L_0x0010:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.n.m.a.<init>(int):void");
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return sVar.j().size() >= this.b;
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public static final class b extends m {
        public final int b;

        public b(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.b = i;
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return sVar.j().size() == this.b;
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public static final class c extends m {
        public static final c b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return sVar.j().isEmpty();
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public static final class d extends m {
        public static final d b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // a.a.a.a.v0.n.b
        public boolean b(s sVar) {
            if (sVar != null) {
                return sVar.j().size() == 1;
            }
            i.a("functionDescriptor");
            throw null;
        }
    }

    public /* synthetic */ m(String str, f fVar) {
        this.f1993a = str;
    }

    @Override // a.a.a.a.v0.n.b
    public String a() {
        return this.f1993a;
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

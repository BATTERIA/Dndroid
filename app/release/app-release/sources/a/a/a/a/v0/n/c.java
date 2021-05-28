package a.a.a.a.v0.n;

import a.w.c.f;
import a.w.c.i;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1962a;

    public static final class a extends c {
        public static final a b = new a();

        public a() {
            super(false, null);
        }
    }

    public static final class b extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            if (str != null) {
            } else {
                i.a("error");
                throw null;
            }
        }
    }

    /* renamed from: a.a.a.a.v0.n.c$c  reason: collision with other inner class name */
    public static final class C0074c extends c {
        public static final C0074c b = new C0074c();

        public C0074c() {
            super(true, null);
        }
    }

    public /* synthetic */ c(boolean z, f fVar) {
        this.f1962a = z;
    }
}

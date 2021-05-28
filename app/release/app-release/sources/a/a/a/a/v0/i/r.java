package a.a.a.a.v0.i;

import a.w.c.f;
import a.w.c.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class r extends Enum<r> {

    /* renamed from: c  reason: collision with root package name */
    public static final r f1530c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f1531d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ r[] f1532e;

    public static final class a extends r {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // a.a.a.a.v0.i.r
        public String a(String str) {
            if (str != null) {
                return a.a.a.a.v0.m.l1.a.a(a.a.a.a.v0.m.l1.a.a(str, "<", "&lt;", false, 4), ">", "&gt;", false, 4);
            }
            i.a("string");
            throw null;
        }
    }

    public static final class b extends r {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(String str, int i) {
            super(str, i, null);
        }

        @Override // a.a.a.a.v0.i.r
        public String a(String str) {
            if (str != null) {
                return str;
            }
            i.a("string");
            throw null;
        }
    }

    static {
        b bVar = new b("PLAIN", 0);
        f1530c = bVar;
        a aVar = new a("HTML", 1);
        f1531d = aVar;
        f1532e = new r[]{bVar, aVar};
    }

    public /* synthetic */ r(String str, int i, f fVar) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f1532e.clone();
    }

    public abstract String a(String str);
}

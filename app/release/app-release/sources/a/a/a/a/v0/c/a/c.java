package a.a.a.a.v0.c.a;

import a.w.c.i;

public interface c {

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f519a = new a();

        @Override // a.a.a.a.v0.c.a.c
        public void a(String str, e eVar, String str2, f fVar, String str3) {
            if (str == null) {
                i.a("filePath");
                throw null;
            } else if (eVar == null) {
                i.a("position");
                throw null;
            } else if (str2 == null) {
                i.a("scopeFqName");
                throw null;
            } else if (fVar == null) {
                i.a("scopeKind");
                throw null;
            } else if (str3 == null) {
                i.a("name");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.c.a.c
        public boolean a() {
            return false;
        }
    }

    void a(String str, e eVar, String str2, f fVar, String str3);

    boolean a();
}

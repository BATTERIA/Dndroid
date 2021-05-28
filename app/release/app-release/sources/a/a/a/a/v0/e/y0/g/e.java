package a.a.a.a.v0.e.y0.g;

import a.w.c.f;
import a.w.c.i;

public abstract class e {

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final String f1324a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            if (str == null) {
                i.a("name");
                throw null;
            } else if (str2 != null) {
                this.f1324a = str;
                this.b = str2;
            } else {
                i.a("desc");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String a() {
            return this.f1324a + ':' + this.b;
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String b() {
            return this.b;
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String c() {
            return this.f1324a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f1324a, aVar.f1324a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            String str = this.f1324a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final String f1325a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            if (str == null) {
                i.a("name");
                throw null;
            } else if (str2 != null) {
                this.f1325a = str;
                this.b = str2;
            } else {
                i.a("desc");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String a() {
            return this.f1325a + this.b;
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String b() {
            return this.b;
        }

        @Override // a.a.a.a.v0.e.y0.g.e
        public String c() {
            return this.f1325a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.f1325a, bVar.f1325a) && i.a(this.b, bVar.b);
        }

        public int hashCode() {
            String str = this.f1325a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    public /* synthetic */ e(f fVar) {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}

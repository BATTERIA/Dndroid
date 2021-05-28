package a.a.a.a.v0.e.x0;

import a.a.a.a.v0.e.r0;
import a.b;
import a.w.c.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a f1249a;
    public final r0.d b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1250c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1251d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1252e;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final a f1253d = new a(256, 256, 256);

        /* renamed from: e  reason: collision with root package name */
        public static final C0046a f1254e = new C0046a(null);

        /* renamed from: a  reason: collision with root package name */
        public final int f1255a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1256c;

        /* renamed from: a.a.a.a.v0.e.x0.f$a$a  reason: collision with other inner class name */
        public static final class C0046a {
            public /* synthetic */ C0046a(a.w.c.f fVar) {
            }
        }

        public a(int i, int i2, int i3) {
            this.f1255a = i;
            this.b = i2;
            this.f1256c = i3;
        }

        public /* synthetic */ a(int i, int i2, int i3, int i4) {
            i3 = (i4 & 4) != 0 ? 0 : i3;
            this.f1255a = i;
            this.b = i2;
            this.f1256c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1255a == aVar.f1255a && this.b == aVar.b && this.f1256c == aVar.f1256c;
        }

        public int hashCode() {
            return (((this.f1255a * 31) + this.b) * 31) + this.f1256c;
        }

        public String toString() {
            int i;
            StringBuilder sb;
            if (this.f1256c == 0) {
                sb = new StringBuilder();
                sb.append(this.f1255a);
                sb.append('.');
                i = this.b;
            } else {
                sb = new StringBuilder();
                sb.append(this.f1255a);
                sb.append('.');
                sb.append(this.b);
                sb.append('.');
                i = this.f1256c;
            }
            sb.append(i);
            return sb.toString();
        }
    }

    public f(a aVar, r0.d dVar, b bVar, Integer num, String str) {
        if (aVar == null) {
            i.a("version");
            throw null;
        } else if (dVar == null) {
            i.a("kind");
            throw null;
        } else if (bVar != null) {
            this.f1249a = aVar;
            this.b = dVar;
            this.f1250c = bVar;
            this.f1251d = num;
            this.f1252e = str;
        } else {
            i.a("level");
            throw null;
        }
    }

    public String toString() {
        String str;
        StringBuilder a2 = e.a.a.a.a.a("since ");
        a2.append(this.f1249a);
        a2.append(' ');
        a2.append(this.f1250c);
        String str2 = "";
        if (this.f1251d != null) {
            StringBuilder a3 = e.a.a.a.a.a(" error ");
            a3.append(this.f1251d);
            str = a3.toString();
        } else {
            str = str2;
        }
        a2.append(str);
        if (this.f1252e != null) {
            StringBuilder a4 = e.a.a.a.a.a(": ");
            a4.append(this.f1252e);
            str2 = a4.toString();
        }
        a2.append(str2);
        return a2.toString();
    }
}

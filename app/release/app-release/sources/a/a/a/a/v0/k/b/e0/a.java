package a.a.a.a.v0.k.b.e0;

import a.a.a.a.v0.f.b;
import a.w.c.i;

public final class a extends a.a.a.a.v0.k.a {
    public static final a m = new a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a() {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.e0.a.<init>():void");
    }

    public final String a(b bVar) {
        String str;
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            String a2 = bVar.a();
            i.a((Object) a2, "fqName.asString()");
            sb.append(a.a.a.a.v0.m.l1.a.a(a2, '.', '/', false, 4));
            sb.append("/");
            StringBuilder sb2 = new StringBuilder();
            if (bVar.b()) {
                str = "default-package";
            } else {
                str = bVar.d().a();
                i.a((Object) str, "fqName.shortName().asString()");
            }
            sb2.append(str);
            sb2.append(".");
            sb2.append("kotlin_builtins");
            sb.append(sb2.toString());
            return sb.toString();
        }
        i.a("fqName");
        throw null;
    }
}

package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.j.s.y;
import a.j;
import a.t.f;
import a.t.l;
import a.w.c.i;

public final class g {

    /* renamed from: a */
    public static final d f317a;
    public static final d b;

    /* renamed from: c */
    public static final d f318c;

    /* renamed from: d */
    public static final d f319d;

    /* renamed from: e */
    public static final d f320e;

    static {
        d b2 = d.b("message");
        i.a((Object) b2, "Name.identifier(\"message\")");
        f317a = b2;
        d b3 = d.b("replaceWith");
        i.a((Object) b3, "Name.identifier(\"replaceWith\")");
        b = b3;
        d b4 = d.b("level");
        i.a((Object) b4, "Name.identifier(\"level\")");
        f318c = b4;
        d b5 = d.b("expression");
        i.a((Object) b5, "Name.identifier(\"expression\")");
        f319d = b5;
        d b6 = d.b("imports");
        i.a((Object) b6, "Name.identifier(\"imports\")");
        f320e = b6;
    }

    public static /* synthetic */ c a(a.a.a.a.v0.a.g gVar, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if (gVar == null) {
            i.a("$this$createDeprecatedAnnotation");
            throw null;
        } else if (str == null) {
            i.a("message");
            throw null;
        } else if (str2 == null) {
            i.a("replaceWith");
            throw null;
        } else if (str3 != null) {
            b bVar = a.a.a.a.v0.a.g.k.v;
            i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.replaceWith");
            j jVar = new j(gVar, bVar, f.a(new j(f319d, new y(str2)), new j(f320e, new a.a.a.a.v0.j.s.b(l.f2119c, new f(gVar)))));
            b bVar2 = a.a.a.a.v0.a.g.k.t;
            i.a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.deprecated");
            d dVar = f318c;
            a a2 = a.a(a.a.a.a.v0.a.g.k.u);
            i.a((Object) a2, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
            d b2 = d.b(str3);
            i.a((Object) b2, "Name.identifier(level)");
            return new j(gVar, bVar2, f.a(new j(f317a, new y(str)), new j(b, new a.a.a.a.v0.j.s.a(jVar)), new j(dVar, new k(a2, b2))));
        } else {
            i.a("level");
            throw null;
        }
    }
}

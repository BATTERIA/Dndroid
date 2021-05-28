package a.a.a.a.v0.d.a.y;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.j;
import a.t.f;
import a.w.c.i;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f839a = new b(Target.class.getCanonicalName());
    public static final b b = new b(Retention.class.getCanonicalName());

    /* renamed from: c  reason: collision with root package name */
    public static final b f840c = new b(Deprecated.class.getCanonicalName());

    /* renamed from: d  reason: collision with root package name */
    public static final b f841d = new b(Documented.class.getCanonicalName());

    /* renamed from: e  reason: collision with root package name */
    public static final b f842e = new b("java.lang.annotation.Repeatable");

    /* renamed from: f  reason: collision with root package name */
    public static final d f843f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f844g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f845h;
    public static final Map<b, b> i = f.a(new j(g.k.z, f839a), new j(g.k.C, b), new j(g.k.D, f842e), new j(g.k.E, f841d));
    public static final c j = new c();

    static {
        d b2 = d.b("message");
        i.a((Object) b2, "Name.identifier(\"message\")");
        f843f = b2;
        d b3 = d.b("allowedTargets");
        i.a((Object) b3, "Name.identifier(\"allowedTargets\")");
        f844g = b3;
        d b4 = d.b("value");
        i.a((Object) b4, "Name.identifier(\"value\")");
        f845h = b4;
        f.a(new j(f839a, g.k.z), new j(b, g.k.C), new j(f840c, g.k.t), new j(f842e, g.k.D), new j(f841d, g.k.E));
    }

    public final a.a.a.a.v0.b.b1.c a(b bVar, a.a.a.a.v0.d.a.c0.d dVar, h hVar) {
        a a2;
        a a3;
        if (bVar == null) {
            i.a("kotlinName");
            throw null;
        } else if (dVar == null) {
            i.a("annotationOwner");
            throw null;
        } else if (hVar == null) {
            i.a("c");
            throw null;
        } else if (i.a(bVar, g.k.t) && ((a3 = dVar.a(f840c)) != null || dVar.t())) {
            return new e(a3, hVar);
        } else {
            b bVar2 = i.get(bVar);
            if (bVar2 == null || (a2 = dVar.a(bVar2)) == null) {
                return null;
            }
            return j.a(a2, hVar);
        }
    }

    public final a.a.a.a.v0.b.b1.c a(a aVar, h hVar) {
        if (aVar == null) {
            i.a("annotation");
            throw null;
        } else if (hVar != null) {
            a.a.a.a.v0.f.a a2 = aVar.a();
            if (i.a(a2, a.a.a.a.v0.f.a.a(f839a))) {
                return new i(aVar, hVar);
            }
            if (i.a(a2, a.a.a.a.v0.f.a.a(b))) {
                return new h(aVar, hVar);
            }
            if (i.a(a2, a.a.a.a.v0.f.a.a(f842e))) {
                b bVar = g.k.D;
                i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.repeatable");
                return new b(hVar, aVar, bVar);
            } else if (i.a(a2, a.a.a.a.v0.f.a.a(f841d))) {
                b bVar2 = g.k.E;
                i.a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
                return new b(hVar, aVar, bVar2);
            } else if (i.a(a2, a.a.a.a.v0.f.a.a(f840c))) {
                return null;
            } else {
                return new a.a.a.a.v0.d.a.a0.n.d(hVar, aVar);
            }
        } else {
            i.a("c");
            throw null;
        }
    }
}

package a.a.a.a;

import a.a.a.a.e;
import a.a.a.a.f;
import a.a.a.a.v0.b.e1.b.t;
import a.a.a.a.v0.b.e1.b.w;
import a.a.a.a.v0.b.e1.b.z;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.g0;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.d.a.c0.l;
import a.a.a.a.v0.d.a.r;
import a.a.a.a.v0.d.a.z.f;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.e;
import a.a.a.a.v0.e.y0.g.h;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.j.v.c;
import a.w.c.i;
import e.f.a.g;
import java.lang.reflect.Method;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116a;
    public static final q0 b = null;

    static {
        a a2 = a.a(new b("java.lang.Void"));
        i.a((Object) a2, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        f116a = a2;
    }

    public static final e.C0005e a(s sVar) {
        String c2 = g.c((a.a.a.a.v0.b.b) sVar);
        if (c2 == null) {
            c2 = sVar instanceof g0 ? r.a(a.a.a.a.v0.j.u.a.a((a.a.a.a.v0.b.b) sVar).d().a()) : sVar instanceof h0 ? r.c(a.a.a.a.v0.j.u.a.a((a.a.a.a.v0.b.b) sVar).d().a()) : sVar.d().a();
            i.a((Object) c2, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return new e.C0005e(new e.b(c2, g.a(sVar, false, false, 1)));
    }

    public static final a.a.a.a.v0.a.i a(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        c a2 = c.a(cls.getSimpleName());
        i.a((Object) a2, "JvmPrimitiveType.get(simpleName)");
        return a2.b();
    }

    public static final e b(s sVar) {
        Method method;
        e.b a2;
        e.b a3;
        l lVar = null;
        if (sVar != null) {
            a.a.a.a.v0.b.b a4 = a.a.a.a.v0.j.g.a((a.a.a.a.v0.b.b) sVar);
            i.a((Object) a4, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
            s a5 = ((s) a4).a();
            i.a((Object) a5, "DescriptorUtils.unwrapFa…titutedFunction).original");
            if (a5 instanceof a.a.a.a.v0.k.b.f0.c) {
                a.a.a.a.v0.k.b.f0.c cVar = (a.a.a.a.v0.k.b.f0.c) a5;
                q n0 = cVar.n0();
                if ((n0 instanceof a.a.a.a.v0.e.r) && (a3 = h.b.a((a.a.a.a.v0.e.r) n0, cVar.B0(), cVar.c0())) != null) {
                    return new e.C0005e(a3);
                }
                if (!(n0 instanceof a.a.a.a.v0.e.h) || (a2 = h.b.a((a.a.a.a.v0.e.h) n0, cVar.B0(), cVar.c0())) == null) {
                    return a(a5);
                }
                k b2 = sVar.b();
                i.a((Object) b2, "possiblySubstitutedFunction.containingDeclaration");
                return g.a(b2) ? new e.C0005e(a2) : new e.d(a2);
            } else if (a5 instanceof f) {
                m0 r = ((f) a5).r();
                if (!(r instanceof a.a.a.a.v0.d.a.b0.a)) {
                    r = null;
                }
                a.a.a.a.v0.d.a.b0.a aVar = (a.a.a.a.v0.d.a.b0.a) r;
                l b3 = aVar != null ? aVar.b() : null;
                if (b3 instanceof z) {
                    lVar = b3;
                }
                z zVar = (z) lVar;
                if (zVar != null && (method = zVar.f478a) != null) {
                    return new e.c(method);
                }
                throw new i0("Incorrect resolution sequence for Java method " + a5);
            } else if (a5 instanceof a.a.a.a.v0.d.a.z.c) {
                m0 r2 = ((a.a.a.a.v0.d.a.z.c) a5).r();
                if (!(r2 instanceof a.a.a.a.v0.d.a.b0.a)) {
                    r2 = null;
                }
                a.a.a.a.v0.d.a.b0.a aVar2 = (a.a.a.a.v0.d.a.b0.a) r2;
                if (aVar2 != null) {
                    lVar = aVar2.b();
                }
                if (lVar instanceof t) {
                    return new e.b(((t) lVar).f476a);
                }
                if (lVar instanceof a.a.a.a.v0.b.e1.b.q) {
                    a.a.a.a.v0.b.e1.b.q qVar = (a.a.a.a.v0.b.e1.b.q) lVar;
                    if (qVar.H()) {
                        return new e.a(qVar.f474a);
                    }
                }
                throw new i0("Incorrect resolution sequence for Java constructor " + a5 + " (" + lVar + ')');
            } else {
                boolean z = true;
                if (!(a5.d().equals(a.a.a.a.v0.j.g.b) && g.a(a5))) {
                    if (!(a5.d().equals(a.a.a.a.v0.j.g.f1539a) && g.a(a5))) {
                        d d2 = a5.d();
                        a.a.a.a.v0.a.p.a aVar3 = a.a.a.a.v0.a.p.a.f248f;
                        if (!i.a(d2, a.a.a.a.v0.a.p.a.f247e) || !a5.j().isEmpty()) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    return a(a5);
                }
                throw new i0("Unknown origin of " + a5 + " (" + a5.getClass() + ')');
            }
        } else {
            i.a("possiblySubstitutedFunction");
            throw null;
        }
    }

    public static final f a(f0 f0Var) {
        e.C0005e eVar = null;
        Method method = null;
        if (f0Var != null) {
            a.a.a.a.v0.b.b a2 = a.a.a.a.v0.j.g.a((a.a.a.a.v0.b.b) f0Var);
            i.a((Object) a2, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
            f0 a3 = ((f0) a2).a();
            i.a((Object) a3, "DescriptorUtils.unwrapFa…rriddenProperty).original");
            if (a3 instanceof a.a.a.a.v0.k.b.f0.k) {
                a.a.a.a.v0.k.b.f0.k kVar = (a.a.a.a.v0.k.b.f0.k) a3;
                a.a.a.a.v0.e.z zVar = kVar.C;
                i.g<a.a.a.a.v0.e.z, a.d> gVar = a.a.a.a.v0.e.y0.a.f1261d;
                a.w.c.i.a((Object) gVar, "JvmProtoBuf.propertySignature");
                a.d dVar = (a.d) g.a(zVar, gVar);
                if (dVar != null) {
                    return new f.c(a3, zVar, dVar, kVar.D, kVar.E);
                }
            } else if (a3 instanceof a.a.a.a.v0.d.a.z.g) {
                m0 r = ((a.a.a.a.v0.d.a.z.g) a3).r();
                if (!(r instanceof a.a.a.a.v0.d.a.b0.a)) {
                    r = null;
                }
                a.a.a.a.v0.d.a.b0.a aVar = (a.a.a.a.v0.d.a.b0.a) r;
                l b2 = aVar != null ? aVar.b() : null;
                if (b2 instanceof w) {
                    return new f.a(((w) b2).f477a);
                }
                if (b2 instanceof z) {
                    Method method2 = ((z) b2).f478a;
                    h0 i = a3.i();
                    m0 r2 = i != null ? i.r() : null;
                    if (!(r2 instanceof a.a.a.a.v0.d.a.b0.a)) {
                        r2 = null;
                    }
                    a.a.a.a.v0.d.a.b0.a aVar2 = (a.a.a.a.v0.d.a.b0.a) r2;
                    l b3 = aVar2 != null ? aVar2.b() : null;
                    if (!(b3 instanceof z)) {
                        b3 = null;
                    }
                    z zVar2 = (z) b3;
                    if (zVar2 != null) {
                        method = zVar2.f478a;
                    }
                    return new f.b(method2, method);
                }
                throw new i0("Incorrect resolution sequence for Java field " + a3 + " (source = " + b2 + ')');
            }
            g0 w = a3.w();
            if (w != null) {
                e.C0005e a4 = a(w);
                h0 i2 = a3.i();
                if (i2 != null) {
                    eVar = a(i2);
                }
                return new f.d(a4, eVar);
            }
            a.w.c.i.a();
            throw null;
        }
        a.w.c.i.a("possiblyOverriddenProperty");
        throw null;
    }
}

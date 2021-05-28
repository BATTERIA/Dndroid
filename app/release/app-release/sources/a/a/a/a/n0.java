package a.a.a.a;

import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.m.d0;
import a.a.c;
import a.a.e;
import a.a.f;
import a.a.n;
import a.w.c.b;
import a.w.c.g;
import a.w.c.h;
import a.w.c.i;
import a.w.c.j;
import a.w.c.k;
import a.w.c.l;
import a.w.c.o;
import a.w.c.t;
import java.util.List;

public class n0 extends t {
    public static n a(b bVar) {
        e c2 = bVar.c();
        return c2 instanceof n ? (n) c2 : c.f38d;
    }

    @Override // a.w.c.t
    public c a(Class cls) {
        return k.a(cls);
    }

    @Override // a.w.c.t
    public e a(Class cls, String str) {
        return new v(cls, str);
    }

    @Override // a.w.c.t
    public f a(h hVar) {
        n a2 = a((b) hVar);
        String d2 = hVar.d();
        String f2 = hVar.f();
        Object obj = hVar.f2133d;
        if (a2 == null) {
            i.a("container");
            throw null;
        } else if (d2 == null) {
            i.a("name");
            throw null;
        } else if (f2 != null) {
            return new b(a2, d2, f2, null, obj);
        } else {
            i.a("signature");
            throw null;
        }
    }

    @Override // a.w.c.t
    public String a(j jVar) {
        return a((g) jVar);
    }

    @Override // a.w.c.t
    public a.a.i a(k kVar) {
        return new t(a((b) kVar), ((l) kVar).f2142g, ((l) kVar).f2143h, kVar.f2133d);
    }

    @Override // a.w.c.t
    public n a(o oVar) {
        return new a0(a((b) oVar), oVar.d(), oVar.f(), oVar.f2133d);
    }

    @Override // a.w.c.t
    public String a(g gVar) {
        b bVar;
        b a2;
        if (gVar != null) {
            a.g gVar2 = (a.g) gVar.getClass().getAnnotation(a.g.class);
            if (gVar2 != null) {
                String[] d1 = gVar2.d1();
                boolean z = true;
                if (d1.length == 0) {
                    d1 = null;
                }
                if (d1 != null) {
                    a.j<a.a.a.a.v0.e.y0.g.g, r> b = a.a.a.a.v0.e.y0.g.h.b(d1, gVar2.d2());
                    A a3 = b.f2088c;
                    B b2 = b.f2089d;
                    int[] mv = gVar2.mv();
                    if ((gVar2.xi() & 8) == 0) {
                        z = false;
                    }
                    a.a.a.a.v0.e.y0.g.f fVar = new a.a.a.a.v0.e.y0.g.f(mv, z);
                    Class<?> cls = gVar.getClass();
                    a.a.a.a.v0.e.n0 n0Var = b2.o;
                    i.a((Object) n0Var, "proto.typeTable");
                    l0 l0Var = (l0) s0.a(cls, b2, a3, new a.a.a.a.v0.e.x0.e(n0Var), fVar, a.a.a.b.f2046f);
                    if (l0Var != null) {
                        bVar = new b(c.f38d, l0Var);
                        if (bVar != null || (a2 = s0.a(bVar)) == null) {
                            return super.a(gVar);
                        }
                        o0 o0Var = o0.b;
                        s e2 = a2.e();
                        if (e2 != null) {
                            StringBuilder sb = new StringBuilder();
                            o0 o0Var2 = o0.b;
                            o0.a(sb, e2);
                            List<w0> j = e2.j();
                            i.a((Object) j, "invoke.valueParameters");
                            a.t.f.a(j, sb, ", ", "(", ")", 0, null, p0.f114c, 48);
                            sb.append(" -> ");
                            o0 o0Var3 = o0.b;
                            d0 h2 = e2.h();
                            if (h2 != null) {
                                i.a((Object) h2, "invoke.returnType!!");
                                sb.append(o0.a(h2));
                                String sb2 = sb.toString();
                                i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
                                return sb2;
                            }
                            i.a();
                            throw null;
                        }
                        i.a("invoke");
                        throw null;
                    }
                }
            }
            bVar = null;
            if (bVar != null) {
            }
            return super.a(gVar);
        }
        i.a("$this$reflect");
        throw null;
    }
}

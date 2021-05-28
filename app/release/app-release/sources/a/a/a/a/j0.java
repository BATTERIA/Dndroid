package a.a.a.a;

import a.a.a.a.v0.a.h;
import a.a.a.a.v0.a.p.g;
import a.a.a.a.v0.b.c1.a;
import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.d1.b0;
import a.a.a.a.v0.b.e1.a.f;
import a.a.a.a.v0.b.e1.a.i;
import a.a.a.a.v0.b.e1.b.b;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.c.a.c;
import a.a.a.a.v0.d.a.a0.d;
import a.a.a.a.v0.d.a.a0.l;
import a.a.a.a.v0.d.a.n;
import a.a.a.a.v0.d.a.y.f;
import a.a.a.a.v0.d.a.y.j;
import a.a.a.a.v0.d.a.y.k;
import a.a.a.a.v0.d.b.e;
import a.a.a.a.v0.d.b.p;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.k.b.i;
import a.a.a.a.v0.k.b.k;
import a.a.a.a.v0.k.b.t;
import a.a.a.a.v0.m.i1.l;
import a.a.a.a.v0.m.i1.m;
import a.q;
import a.s;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<t0, WeakReference<i>> f93a = new ConcurrentHashMap();

    public static final i a(Class<?> cls) {
        a aVar;
        c cVar;
        if (cls != null) {
            ClassLoader e2 = b.e(cls);
            t0 t0Var = new t0(e2);
            WeakReference<i> weakReference = f93a.get(t0Var);
            if (weakReference != null) {
                i iVar = weakReference.get();
                if (iVar != null) {
                    a.w.c.i.a((Object) iVar, "it");
                    return iVar;
                }
                f93a.remove(t0Var, weakReference);
            }
            a.a.a.a.v0.l.b bVar = new a.a.a.a.v0.l.b("RuntimeModuleData");
            g gVar = new g(bVar, g.a.FROM_DEPENDENCIES);
            d d2 = d.d("<runtime module for " + e2 + '>');
            a.w.c.i.a((Object) d2, "Name.special(\"<runtime module for $classLoader>\")");
            b0 b0Var = new b0(d2, bVar, gVar, null, null, null, 56);
            gVar.f194d.b(new h(gVar, b0Var));
            boolean z = gVar.m == null;
            if (!s.f2103a || z) {
                gVar.m = b0Var;
                gVar.n = true;
                f fVar = new f(e2);
                a.a.a.a.v0.d.b.d dVar = new a.a.a.a.v0.d.b.d();
                l lVar = new l();
                x xVar = new x(bVar, b0Var);
                p.a aVar2 = p.a.f919a;
                a.a.a.a.v0.d.a.a aVar3 = new a.a.a.a.v0.d.a.a(bVar, a.a.a.a.v0.o.i.f2000e);
                a.a.a.a.v0.b.e1.a.d dVar2 = new a.a.a.a.v0.b.e1.a.d(e2);
                k kVar = k.f861a;
                a.w.c.i.a((Object) kVar, "SignaturePropagator.DO_NOTHING");
                a.a.a.a.v0.b.e1.a.h hVar = a.a.a.a.v0.b.e1.a.h.b;
                a.a.a.a.v0.d.a.y.g gVar2 = a.a.a.a.v0.d.a.y.g.f853a;
                a.w.c.i.a((Object) gVar2, "JavaResolverCache.EMPTY");
                f.a aVar4 = f.a.f852a;
                j.a aVar5 = j.a.f860a;
                a.a.a.a.v0.b.e1.a.j jVar = a.a.a.a.v0.b.e1.a.j.f449a;
                p0.a aVar6 = p0.a.f493a;
                c.a aVar7 = c.a.f519a;
                a.a.a.a.v0.a.j jVar2 = new a.a.a.a.v0.a.j(b0Var, xVar);
                t0 t0Var2 = t0Var;
                a.a.a.a.v0.d.a.d0.l lVar2 = new a.a.a.a.v0.d.a.d0.l(aVar3, a.a.a.a.v0.o.i.f2000e);
                n.a aVar8 = n.a.f807a;
                d.a aVar9 = d.a.f552a;
                if (a.a.a.a.v0.m.i1.l.b != null) {
                    a.a.a.a.v0.d.a.a0.g gVar3 = new a.a.a.a.v0.d.a.a0.g(new a.a.a.a.v0.d.a.a0.c(bVar, dVar2, fVar, dVar, kVar, hVar, gVar2, aVar4, aVar5, jVar, lVar, aVar2, aVar6, aVar7, b0Var, jVar2, aVar3, lVar2, aVar8, aVar9, l.a.f1889a));
                    e eVar = new e(fVar, dVar);
                    a.a.a.a.v0.d.b.c cVar2 = new a.a.a.a.v0.d.b.c(b0Var, xVar, bVar, fVar);
                    k.a aVar10 = k.a.f1738a;
                    a.a.a.a.v0.b.e1.a.h hVar2 = a.a.a.a.v0.b.e1.a.h.b;
                    c.a aVar11 = c.a.f519a;
                    if (a.a.a.a.v0.k.b.i.f1729a != null) {
                        a.a.a.a.v0.k.b.i iVar2 = i.a.f1730a;
                        if (a.a.a.a.v0.m.i1.l.b != null) {
                            m mVar = l.a.f1889a;
                            if (iVar2 == null) {
                                a.w.c.i.a("contractDeserializer");
                                throw null;
                            } else if (mVar != null) {
                                a.a.a.a.v0.a.g m = b0Var.m();
                                if (!(m instanceof g)) {
                                    m = null;
                                }
                                g gVar4 = (g) m;
                                t.a aVar12 = t.a.f1755a;
                                a.a.a.a.v0.d.b.f fVar2 = a.a.a.a.v0.d.b.f.f909a;
                                a.t.l lVar3 = a.t.l.f2119c;
                                if (gVar4 == null || (aVar = gVar4.k()) == null) {
                                    aVar = a.C0016a.f346a;
                                }
                                if (gVar4 == null || (cVar = gVar4.k()) == null) {
                                    cVar = c.b.f348a;
                                }
                                a.a.a.a.v0.e.y0.g.h hVar3 = a.a.a.a.v0.e.y0.g.h.b;
                                a.a.a.a.v0.k.b.j jVar3 = new a.a.a.a.v0.k.b.j(bVar, b0Var, aVar10, eVar, cVar2, gVar3, aVar12, hVar2, aVar11, fVar2, lVar3, xVar, iVar2, aVar, cVar, a.a.a.a.v0.e.y0.g.h.f1332a, mVar);
                                dVar.f906a = jVar3;
                                a.a.a.a.v0.d.a.y.g gVar5 = a.a.a.a.v0.d.a.y.g.f853a;
                                a.w.c.i.a((Object) gVar5, "JavaResolverCache.EMPTY");
                                a.a.a.a.v0.j.v.a aVar13 = new a.a.a.a.v0.j.v.a(gVar3, gVar5);
                                lVar.f571a = aVar13;
                                ClassLoader classLoader = q.class.getClassLoader();
                                a.w.c.i.a((Object) classLoader, "stdlibClassLoader");
                                a.a.a.a.v0.b.e1.a.f fVar3 = new a.a.a.a.v0.b.e1.a.f(classLoader);
                                a.a.a.a.v0.a.p.k k = gVar.k();
                                a.a.a.a.v0.a.p.k k2 = gVar.k();
                                k.a aVar14 = k.a.f1738a;
                                if (a.a.a.a.v0.m.i1.l.b != null) {
                                    a.a.a.a.v0.a.p.j jVar4 = new a.a.a.a.v0.a.p.j(bVar, fVar3, b0Var, xVar, k, k2, aVar14, l.a.f1889a);
                                    b0Var.a(b0Var);
                                    b0Var.a(new a.a.a.a.v0.b.d1.l(e.f.a.g.g(aVar13.f1601a, jVar4)));
                                    a.a.a.a.v0.b.e1.a.i iVar3 = new a.a.a.a.v0.b.e1.a.i(jVar3, new a.a.a.a.v0.b.e1.a.a(dVar, fVar), null);
                                    while (true) {
                                        WeakReference<a.a.a.a.v0.b.e1.a.i> putIfAbsent = f93a.putIfAbsent(t0Var2, new WeakReference<>(iVar3));
                                        if (putIfAbsent == null) {
                                            return iVar3;
                                        }
                                        a.a.a.a.v0.b.e1.a.i iVar4 = putIfAbsent.get();
                                        if (iVar4 != null) {
                                            return iVar4;
                                        }
                                        f93a.remove(t0Var2, putIfAbsent);
                                        t0Var2 = t0Var2;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                a.w.c.i.a("kotlinTypeChecker");
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw new AssertionError("JvmBuiltins repeated initialization");
            }
        } else {
            a.w.c.i.a("$this$getOrCreateModule");
            throw null;
        }
    }
}

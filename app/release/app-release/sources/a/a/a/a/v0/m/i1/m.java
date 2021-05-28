package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.j.l;
import a.a.a.a.v0.j.r.a.c;
import a.a.a.a.v0.j.s.t;
import a.a.a.a.v0.m.b0;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.f;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.k1.b;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.x;
import a.h;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class m implements l {

    /* renamed from: c  reason: collision with root package name */
    public final l f1890c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1891d;

    public m(f fVar) {
        if (fVar != null) {
            this.f1891d = fVar;
            if (fVar != null) {
                l lVar = new l(l.f1557e, fVar);
                i.a((Object) lVar, "OverridingUtil.createWit…efiner(kotlinTypeRefiner)");
                this.f1890c = lVar;
                return;
            }
            l.a(1);
            throw null;
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.i1.l
    public l a() {
        return this.f1890c;
    }

    @Override // a.a.a.a.v0.m.i1.d
    public boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            i.a("a");
            throw null;
        } else if (d0Var2 != null) {
            b bVar = new b(false, false, false, this.f1891d, 6);
            f1 K0 = d0Var.K0();
            f1 K02 = d0Var2.K0();
            if (K0 == null) {
                i.a("a");
                throw null;
            } else if (K02 != null) {
                return f.a(bVar, K0, K02);
            } else {
                i.a("b");
                throw null;
            }
        } else {
            i.a("b");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.i1.l
    public f b() {
        return this.f1891d;
    }

    @Override // a.a.a.a.v0.m.i1.d
    public boolean b(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            i.a("subtype");
            throw null;
        } else if (d0Var2 != null) {
            b bVar = new b(true, false, false, this.f1891d, 6);
            f1 K0 = d0Var.K0();
            f1 K02 = d0Var2.K0();
            if (K0 == null) {
                i.a("subType");
                throw null;
            } else if (K02 != null) {
                return f.b(bVar, K0, K02);
            } else {
                i.a("superType");
                throw null;
            }
        } else {
            i.a("supertype");
            throw null;
        }
    }

    public final k0 a(k0 k0Var) {
        d0 c2;
        b0 b0Var = null;
        if (k0Var != null) {
            s0 I0 = k0Var.I0();
            boolean z = false;
            if (I0 instanceof c) {
                c cVar = (c) I0;
                v0 v0Var = cVar.b;
                if (v0Var.a() == g1.IN_VARIANCE) {
                    z = true;
                }
                if (!z) {
                    v0Var = null;
                }
                f1 K0 = (v0Var == null || (c2 = v0Var.c()) == null) ? null : c2.K0();
                if (cVar.f1574a == null) {
                    v0 v0Var2 = cVar.b;
                    Collection<d0> b = cVar.b();
                    ArrayList arrayList = new ArrayList(g.a(b, 10));
                    Iterator<T> it = b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().K0());
                    }
                    if (v0Var2 != null) {
                        cVar.f1574a = new j(v0Var2, new i(arrayList), null, null, 8);
                    } else {
                        i.a("projection");
                        throw null;
                    }
                }
                b bVar = b.f1911c;
                j jVar = cVar.f1574a;
                if (jVar != null) {
                    return new h(bVar, jVar, K0, k0Var.y(), k0Var.J0());
                }
                i.a();
                throw null;
            } else if (I0 instanceof t) {
                if (((t) I0) != null) {
                    throw null;
                }
                throw null;
            } else if (!(I0 instanceof b0) || !k0Var.J0()) {
                return k0Var;
            } else {
                b0 b0Var2 = (b0) I0;
                LinkedHashSet<d0> linkedHashSet = b0Var2.f1820a;
                ArrayList arrayList2 = new ArrayList(g.a(linkedHashSet, 10));
                for (T t : linkedHashSet) {
                    if (t != null) {
                        d0 f2 = c1.f(t);
                        i.a((Object) f2, "TypeUtils.makeNullable(this)");
                        arrayList2.add(f2);
                        z = true;
                    } else {
                        i.a("$this$makeNullable");
                        throw null;
                    }
                }
                if (z) {
                    b0Var = new b0(arrayList2);
                }
                if (b0Var != null) {
                    b0Var2 = b0Var;
                }
                return b0Var2.f();
            }
        } else {
            i.a("type");
            throw null;
        }
    }

    public f1 a(f1 f1Var) {
        f1 f1Var2;
        if (f1Var != null) {
            if (f1Var instanceof k0) {
                f1Var2 = a((k0) f1Var);
            } else if (f1Var instanceof x) {
                x xVar = (x) f1Var;
                k0 a2 = a(xVar.f1956d);
                k0 a3 = a(xVar.f1957e);
                if (a2 == xVar.f1956d && a3 == xVar.f1957e) {
                    f1Var2 = f1Var;
                } else {
                    f1Var2 = e0.a(a2, a3);
                }
            } else {
                throw new h();
            }
            return g.a(f1Var2, f1Var);
        }
        i.a("type");
        throw null;
    }
}

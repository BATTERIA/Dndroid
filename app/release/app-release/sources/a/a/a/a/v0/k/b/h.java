package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.e.f;
import a.a.a.a.v0.e.n0;
import a.a.a.a.v0.e.t0;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.g;
import a.a.a.a.v0.f.d;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.Iterator;
import java.util.Set;

public final class h {

    /* renamed from: c */
    public static final Set<a.a.a.a.v0.f.a> f1724c = g.e(a.a.a.a.v0.f.a.a(a.a.a.a.v0.a.g.k.f199c.g()));

    /* renamed from: d */
    public static final h f1725d;

    /* renamed from: a */
    public final l<a, e> f1726a;
    public final j b;

    public static final class a {

        /* renamed from: a */
        public final a.a.a.a.v0.f.a f1727a;
        public final f b;

        public a(a.a.a.a.v0.f.a aVar, f fVar) {
            if (aVar != null) {
                this.f1727a = aVar;
                this.b = fVar;
                return;
            }
            i.a("classId");
            throw null;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.f1727a, ((a) obj).f1727a);
        }

        public int hashCode() {
            return this.f1727a.hashCode();
        }
    }

    public static final class b extends j implements l<a, e> {

        /* renamed from: c */
        public final /* synthetic */ h f1728c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(1);
            this.f1728c = hVar;
        }

        @Override // a.w.b.l
        public e a(a aVar) {
            T t;
            l a2;
            a aVar2 = aVar;
            if (aVar2 != null) {
                h hVar = this.f1728c;
                if (hVar != null) {
                    a.a.a.a.v0.f.a aVar3 = aVar2.f1727a;
                    for (a.a.a.a.v0.b.c1.b bVar : hVar.b.l) {
                        e a3 = bVar.a(aVar3);
                        if (a3 != null) {
                            return a3;
                        }
                    }
                    if (h.f1724c.contains(aVar3)) {
                        return null;
                    }
                    f fVar = aVar2.b;
                    if (fVar == null) {
                        fVar = hVar.b.f1734e.a(aVar3);
                    }
                    if (fVar == null) {
                        return null;
                    }
                    c cVar = fVar.f1675a;
                    f fVar2 = fVar.b;
                    a.a.a.a.v0.e.x0.a aVar4 = fVar.f1676c;
                    m0 m0Var = fVar.f1677d;
                    a.a.a.a.v0.f.a c2 = aVar3.c();
                    if (c2 != null) {
                        e a4 = hVar.a(c2, null);
                        if (!(a4 instanceof a.a.a.a.v0.k.b.f0.e)) {
                            a4 = null;
                        }
                        a.a.a.a.v0.k.b.f0.e eVar = (a.a.a.a.v0.k.b.f0.e) a4;
                        if (eVar == null) {
                            return null;
                        }
                        d f2 = aVar3.f();
                        i.a((Object) f2, "classId.shortClassName");
                        if (!eVar.n.a(eVar.k.f1740c.r.b()).c().contains(f2)) {
                            return null;
                        }
                        a2 = eVar.k;
                    } else {
                        z zVar = hVar.b.f1736g;
                        a.a.a.a.v0.f.b d2 = aVar3.d();
                        i.a((Object) d2, "classId.packageFqName");
                        Iterator<T> it = zVar.a(d2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            T t2 = t;
                            boolean z = true;
                            if (t2 instanceof n) {
                                d f3 = aVar3.f();
                                i.a((Object) f3, "classId.shortClassName");
                                a.a.a.a.v0.j.w.i u = t2.u();
                                if ((u instanceof a.a.a.a.v0.k.b.f0.i) && ((a.a.a.a.v0.k.b.f0.i) u).c().contains(f3)) {
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 == null) {
                            return null;
                        }
                        j jVar = hVar.b;
                        n0 n0Var = fVar2.v;
                        i.a((Object) n0Var, "classProto.typeTable");
                        a.a.a.a.v0.e.x0.e eVar2 = new a.a.a.a.v0.e.x0.e(n0Var);
                        g.a aVar5 = a.a.a.a.v0.e.x0.g.f1257c;
                        t0 t0Var = fVar2.x;
                        i.a((Object) t0Var, "classProto.versionRequirementTable");
                        a2 = jVar.a(t3, cVar, eVar2, aVar5.a(t0Var), aVar4, null);
                    }
                    return new a.a.a.a.v0.k.b.f0.e(a2, fVar2, cVar, aVar4, m0Var);
                }
                throw null;
            }
            i.a("key");
            throw null;
        }
    }

    public h(j jVar) {
        if (jVar != null) {
            this.b = jVar;
            this.f1726a = jVar.b.b(new b(this));
            return;
        }
        i.a("components");
        throw null;
    }

    public static /* synthetic */ e a(h hVar, a.a.a.a.v0.f.a aVar, f fVar, int i) {
        if ((i & 2) != 0) {
            fVar = null;
        }
        return hVar.a(aVar, fVar);
    }

    public final e a(a.a.a.a.v0.f.a aVar, f fVar) {
        if (aVar != null) {
            return this.f1726a.a(new a(aVar, fVar));
        }
        i.a("classId");
        throw null;
    }
}

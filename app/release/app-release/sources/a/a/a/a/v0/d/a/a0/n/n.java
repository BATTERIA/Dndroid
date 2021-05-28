package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.d.a.a0.c;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.t.f;
import a.w.b.l;
import a.w.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n extends r {
    public final g m;
    public final e n;

    public static final class a extends j implements l<i, Collection<? extends f0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f648c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f648c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Collection<? extends f0> a(i iVar) {
            i iVar2 = iVar;
            if (iVar2 != null) {
                return iVar2.c(this.f648c, a.a.a.a.v0.c.a.d.f525h);
            }
            a.w.c.i.a("it");
            throw null;
        }
    }

    public static final class b extends j implements l<i, Set<? extends d>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f649c = new b();

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Set<? extends d> a(i iVar) {
            i iVar2 = iVar;
            if (iVar2 != null) {
                return iVar2.b();
            }
            a.w.c.i.a("it");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(h hVar, g gVar, e eVar) {
        super(hVar);
        if (hVar == null) {
            a.w.c.i.a("c");
            throw null;
        } else if (gVar == null) {
            a.w.c.i.a("jClass");
            throw null;
        } else if (eVar != null) {
            this.m = gVar;
            this.n = eVar;
        } else {
            a.w.c.i.a("ownerDescriptor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public void a(Collection<l0> collection, d dVar) {
        Collection collection2;
        l0 b2;
        String str;
        if (collection == null) {
            a.w.c.i.a("result");
            throw null;
        } else if (dVar != null) {
            n c2 = e.f.a.g.c((e) this.n);
            if (c2 != null) {
                collection2 = f.k(c2.a(dVar, a.a.a.a.v0.c.a.d.f525h));
            } else {
                collection2 = a.t.n.f2121c;
            }
            e eVar = this.n;
            c cVar = this.j.f562c;
            Collection<? extends l0> b3 = e.f.a.g.b(dVar, collection2, collection, eVar, cVar.f549f, cVar.u.a());
            a.w.c.i.a((Object) b3, "resolveOverridesForStati….overridingUtil\n        )");
            collection.addAll(b3);
            if (this.m.p()) {
                if (a.w.c.i.a(dVar, a.a.a.a.v0.j.g.b)) {
                    b2 = e.f.a.g.a((e) this.n);
                    str = "createEnumValueOfMethod(ownerDescriptor)";
                } else if (a.w.c.i.a(dVar, a.a.a.a.v0.j.g.f1539a)) {
                    b2 = e.f.a.g.b((e) this.n);
                    str = "createEnumValuesMethod(ownerDescriptor)";
                } else {
                    return;
                }
                a.w.c.i.a((Object) b2, str);
                collection.add(b2);
            }
        } else {
            a.w.c.i.a("name");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<d> b(a.a.a.a.v0.j.w.d dVar, l<? super d, Boolean> lVar) {
        if (dVar != null) {
            return a.t.n.f2121c;
        }
        a.w.c.i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<d> c(a.a.a.a.v0.j.w.d dVar, l<? super d, Boolean> lVar) {
        Set<d> set = null;
        if (dVar != null) {
            Set<d> j = f.j(((b) this.f623c.a()).b());
            n c2 = e.f.a.g.c((e) this.n);
            if (c2 != null) {
                set = c2.a();
            }
            if (set == null) {
                set = a.t.n.f2121c;
            }
            j.addAll(set);
            if (this.m.p()) {
                j.addAll(e.f.a.g.g(a.a.a.a.v0.j.g.b, a.a.a.a.v0.j.g.f1539a));
            }
            return j;
        }
        a.w.c.i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public Set<d> d(a.a.a.a.v0.j.w.d dVar, l<? super d, Boolean> lVar) {
        if (dVar != null) {
            Set<d> j = f.j(((b) this.f623c.a()).a());
            e eVar = this.n;
            a.a.a.a.v0.m.l1.a.a(e.f.a.g.c((Object) eVar), p.f651a, new q(eVar, j, b.f649c));
            return j;
        }
        a.w.c.i.a("kindFilter");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public k e() {
        return this.n;
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public a.a.a.a.v0.b.h b(d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar != null) {
            return null;
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.k
    public b c() {
        return new a(this.m, m.f647c);
    }

    @Override // a.a.a.a.v0.d.a.a0.n.r, a.a.a.a.v0.d.a.a0.n.k
    public void a(d dVar, Collection<f0> collection) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (collection != null) {
            e eVar = this.n;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a.a.a.a.v0.m.l1.a.a(e.f.a.g.c((Object) eVar), p.f651a, new q(eVar, linkedHashSet, new a(dVar)));
            if (!collection.isEmpty()) {
                e eVar2 = this.n;
                c cVar = this.j.f562c;
                Collection<? extends f0> b2 = e.f.a.g.b(dVar, linkedHashSet, collection, eVar2, cVar.f549f, cVar.u.a());
                a.w.c.i.a((Object) b2, "resolveOverridesForStati…ingUtil\n                )");
                collection.addAll(b2);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                f0 a2 = a((f0) next);
                Object obj = linkedHashMap.get(a2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(a2, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection collection2 = (Collection) entry.getValue();
                e eVar3 = this.n;
                c cVar2 = this.j.f562c;
                e.f.a.g.a(arrayList, e.f.a.g.b(dVar, collection2, collection, eVar3, cVar2.f549f, cVar2.u.a()));
            }
            collection.addAll(arrayList);
        } else {
            a.w.c.i.a("result");
            throw null;
        }
    }

    public final f0 a(f0 f0Var) {
        b.a t = f0Var.t();
        a.w.c.i.a((Object) t, "this.kind");
        if (t.a()) {
            return f0Var;
        }
        Collection<? extends f0> f2 = f0Var.f();
        a.w.c.i.a((Object) f2, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(e.f.a.g.a(f2, 10));
        for (T t2 : f2) {
            a.w.c.i.a((Object) t2, "it");
            arrayList.add(a((f0) t2));
        }
        return (f0) f.e(f.g(f.j(arrayList)));
    }
}

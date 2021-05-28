package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.o0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.y0;
import a.e;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m implements i {
    public final a1 b;

    /* renamed from: c  reason: collision with root package name */
    public Map<k, k> f1630c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1631d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1632e;

    public static final class a extends j implements a.w.b.a<Collection<? extends k>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m f1633c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(0);
            this.f1633c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Collection<? extends k> a() {
            m mVar = this.f1633c;
            return mVar.a(g.a(mVar.f1632e, (d) null, (l) null, 3, (Object) null));
        }
    }

    public m(i iVar, a1 a1Var) {
        if (iVar == null) {
            i.a("workerScope");
            throw null;
        } else if (a1Var != null) {
            this.f1632e = iVar;
            y0 a2 = a1Var.a();
            i.a((Object) a2, "givenSubstitutor.substitution");
            this.b = g.a(a2, false, 1).c();
            this.f1631d = g.m92a((a.w.b.a) new a(this));
        } else {
            i.a("givenSubstitutor");
            throw null;
        }
    }

    public final <D extends k> D a(D d2) {
        if (this.b.b()) {
            return d2;
        }
        if (this.f1630c == null) {
            this.f1630c = new HashMap();
        }
        Map<k, k> map = this.f1630c;
        if (map != null) {
            k kVar = map.get(d2);
            if (kVar == null) {
                if (d2 instanceof o0) {
                    kVar = ((o0) d2).a(this.b);
                    if (kVar != null) {
                        map.put(d2, kVar);
                    } else {
                        throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, " + "but " + d2 + " substitution fails");
                    }
                } else {
                    throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
                }
            }
            return (D) kVar;
        }
        i.a();
        throw null;
    }

    @Override // a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, l<? super d, Boolean> lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            return (Collection) this.f1631d.getValue();
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> a() {
        return this.f1632e.a();
    }

    @Override // a.a.a.a.v0.j.w.k
    public h b(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            h b2 = this.f1632e.b(dVar, bVar);
            if (b2 != null) {
                return (h) a(b2);
            }
            return null;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Set<d> b() {
        return this.f1632e.b();
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<? extends f0> c(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a(this.f1632e.c(dVar, bVar));
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i
    public Collection<? extends l0> a(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return a(this.f1632e.a(dVar, bVar));
        } else {
            i.a("location");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.a.a.a.v0.j.w.m */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends D extends a.a.a.a.v0.b.k> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends k> Collection<D> a(Collection<? extends D> collection) {
        if (this.b.b() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(a.a.a.a.v0.m.l1.a.b(collection.size()));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(a((k) it.next()));
        }
        return linkedHashSet;
    }
}

package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.f;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class n extends a {
    public final b b;

    public static final class a {
        public static final i a(String str, Collection<? extends d0> collection) {
            if (str == null) {
                i.a("message");
                throw null;
            } else if (collection != null) {
                ArrayList arrayList = new ArrayList(g.a(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().u());
                }
                b bVar = new b(str, arrayList);
                return collection.size() <= 1 ? bVar : new n(bVar, null);
            } else {
                i.a("types");
                throw null;
            }
        }
    }

    public static final class b extends j implements l<a.a.a.a.v0.b.a, a.a.a.a.v0.b.a> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f1634c = new b();

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a.a.a.a.v0.b.a a(a.a.a.a.v0.b.a aVar) {
            a.a.a.a.v0.b.a aVar2 = aVar;
            if (aVar2 != null) {
                return aVar2;
            }
            i.a("$receiver");
            throw null;
        }
    }

    public static final class c extends j implements l<l0, l0> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f1635c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public l0 a(l0 l0Var) {
            l0 l0Var2 = l0Var;
            if (l0Var2 != null) {
                return l0Var2;
            }
            i.a("$receiver");
            throw null;
        }
    }

    public static final class d extends j implements l<f0, f0> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f1636c = new d();

        public d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public f0 a(f0 f0Var) {
            f0 f0Var2 = f0Var;
            if (f0Var2 != null) {
                return f0Var2;
            }
            i.a("$receiver");
            throw null;
        }
    }

    public /* synthetic */ n(b bVar, f fVar) {
        this.b = bVar;
    }

    @Override // a.a.a.a.v0.j.w.a, a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            Collection<k> a2 = super.a(dVar, lVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (T t : a2) {
                if (t instanceof a.a.a.a.v0.b.a) {
                    arrayList.add(t);
                } else {
                    arrayList2.add(t);
                }
            }
            return a.t.f.a(g.a(arrayList, b.f1634c), (Iterable) arrayList2);
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i, a.a.a.a.v0.j.w.a
    public Collection<f0> c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return g.a(super.c(dVar, bVar), d.f1636c);
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.i, a.a.a.a.v0.j.w.a
    public Collection<l0> a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return g.a(super.a(dVar, bVar), c.f1635c);
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.a
    public i c() {
        return this.b;
    }
}

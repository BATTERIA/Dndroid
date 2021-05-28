package a.a.a.a.v0.b;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.n0;
import a.a.a.a.v0.b.d1.p;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.n;
import a.a.a.a.v0.m.s0;
import a.t.l;
import a.t.r;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.b, y> f506a;
    public final a.a.a.a.v0.l.d<a, e> b;

    /* renamed from: c  reason: collision with root package name */
    public final j f507c;

    /* renamed from: d  reason: collision with root package name */
    public final w f508d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.f.a f509a;
        public final List<Integer> b;

        public a(a.a.a.a.v0.f.a aVar, List<Integer> list) {
            if (aVar == null) {
                i.a("classId");
                throw null;
            } else if (list != null) {
                this.f509a = aVar;
                this.b = list;
            } else {
                i.a("typeParametersCount");
                throw null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f509a, aVar.f509a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            a.a.a.a.v0.f.a aVar = this.f509a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            List<Integer> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("ClassRequest(classId=");
            a2.append(this.f509a);
            a2.append(", typeParametersCount=");
            a2.append(this.b);
            a2.append(")");
            return a2.toString();
        }
    }

    public static final class b extends a.a.a.a.v0.b.d1.j {
        public final List<r0> j;
        public final n k;
        public final boolean l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, k kVar, a.a.a.a.v0.f.d dVar, boolean z, int i) {
            super(jVar, kVar, dVar, m0.f491a, false);
            if (jVar == null) {
                i.a("storageManager");
                throw null;
            } else if (kVar == null) {
                i.a("container");
                throw null;
            } else if (dVar != null) {
                this.l = z;
                a.y.c a2 = a.y.d.a(0, i);
                ArrayList arrayList = new ArrayList(g.a(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    int a3 = ((r) it).a();
                    if (h.b != null) {
                        h hVar = h.a.f321a;
                        g1 g1Var = g1.INVARIANT;
                        StringBuilder sb = new StringBuilder();
                        sb.append('T');
                        sb.append(a3);
                        arrayList.add(n0.a(this, hVar, false, g1Var, a.a.a.a.v0.f.d.b(sb.toString()), a3, jVar));
                    } else {
                        throw null;
                    }
                }
                this.j = arrayList;
                this.k = new n(this, arrayList, g.e((Object) a.a.a.a.v0.j.u.a.e(this).m().b()), jVar);
            } else {
                i.a("name");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.e
        public Collection<e> A0() {
            return l.f2119c;
        }

        @Override // a.a.a.a.v0.b.u
        public boolean D() {
            return false;
        }

        @Override // a.a.a.a.v0.b.e
        public boolean D0() {
            return false;
        }

        @Override // a.a.a.a.v0.b.i
        public boolean E() {
            return this.l;
        }

        @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.d1.j
        public boolean H() {
            return false;
        }

        @Override // a.a.a.a.v0.b.e
        public boolean P() {
            return false;
        }

        @Override // a.a.a.a.v0.b.e
        public d Y() {
            return null;
        }

        @Override // a.a.a.a.v0.b.e
        public a.a.a.a.v0.j.w.i Z() {
            return i.b.b;
        }

        @Override // a.a.a.a.v0.b.d1.w
        public a.a.a.a.v0.j.w.i a(f fVar) {
            if (fVar != null) {
                return i.b.b;
            }
            a.w.c.i.a("kotlinTypeRefiner");
            throw null;
        }

        @Override // a.a.a.a.v0.b.e
        public e d0() {
            return null;
        }

        @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
        public a1 g() {
            a1 a1Var = z0.f515e;
            a.w.c.i.a((Object) a1Var, "Visibilities.PUBLIC");
            return a1Var;
        }

        @Override // a.a.a.a.v0.b.u
        public boolean m0() {
            return false;
        }

        @Override // a.a.a.a.v0.b.h
        public s0 n() {
            return this.k;
        }

        @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
        public v o() {
            return v.FINAL;
        }

        @Override // a.a.a.a.v0.b.e
        public boolean p() {
            return false;
        }

        @Override // a.a.a.a.v0.b.e
        public Collection<d> q() {
            return a.t.n.f2121c;
        }

        @Override // a.a.a.a.v0.b.e
        public f t() {
            return f.CLASS;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("class ");
            a2.append(d());
            a2.append(" (not found)");
            return a2.toString();
        }

        @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
        public List<r0> x() {
            return this.j;
        }

        @Override // a.a.a.a.v0.b.b1.a
        public h y() {
            if (h.b != null) {
                return h.a.f321a;
            }
            throw null;
        }
    }

    public static final class c extends a.w.c.j implements a.w.b.l<a, b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x f510c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(x xVar) {
            super(1);
            this.f510c = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
            if (r1 != null) goto L_0x0038;
         */
        @Override // a.w.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a.a.a.a.v0.b.x.b a(a.a.a.a.v0.b.x.a r9) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.x.c.a(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends a.w.c.j implements a.w.b.l<a.a.a.a.v0.f.b, p> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x f511c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(x xVar) {
            super(1);
            this.f511c = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public p a(a.a.a.a.v0.f.b bVar) {
            a.a.a.a.v0.f.b bVar2 = bVar;
            if (bVar2 != null) {
                return new p(this.f511c.f508d, bVar2);
            }
            a.w.c.i.a("fqName");
            throw null;
        }
    }

    public x(j jVar, w wVar) {
        if (jVar == null) {
            a.w.c.i.a("storageManager");
            throw null;
        } else if (wVar != null) {
            this.f507c = jVar;
            this.f508d = wVar;
            this.f506a = jVar.a(new d(this));
            this.b = this.f507c.a(new c(this));
        } else {
            a.w.c.i.a("module");
            throw null;
        }
    }

    public final e a(a.a.a.a.v0.f.a aVar, List<Integer> list) {
        if (aVar == null) {
            a.w.c.i.a("classId");
            throw null;
        } else if (list != null) {
            return this.b.a(new a(aVar, list));
        } else {
            a.w.c.i.a("typeParametersCount");
            throw null;
        }
    }
}

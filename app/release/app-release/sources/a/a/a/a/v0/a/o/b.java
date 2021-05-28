package a.a.a.a.v0.a.o;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.k;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.n0;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.x0;
import a.q;
import a.t.f;
import a.t.l;
import a.t.r;
import a.w.b.p;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class b extends a.a.a.a.v0.b.d1.b {
    public static final a.a.a.a.v0.f.a n = new a.a.a.a.v0.f.a(g.f189f, d.b("Function"));
    public static final a.a.a.a.v0.f.a o = new a.a.a.a.v0.f.a(k.f220a, d.b(k.f222d));

    /* renamed from: g  reason: collision with root package name */
    public final C0013b f236g;

    /* renamed from: h  reason: collision with root package name */
    public final c f237h;
    public final List<r0> i;
    public final j j;
    public final y k;
    public final c l;
    public final int m;

    public static final class a extends a.w.c.j implements p<g1, String, q> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f238c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, ArrayList arrayList) {
            super(2);
            this.f238c = bVar;
            this.f239d = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // a.w.b.p
        public /* bridge */ /* synthetic */ q a(g1 g1Var, String str) {
            a(g1Var, str);
            return q.f2100a;
        }

        public final void a(g1 g1Var, String str) {
            if (g1Var == null) {
                i.a("variance");
                throw null;
            } else if (str != null) {
                ArrayList arrayList = this.f239d;
                b bVar = this.f238c;
                if (h.b != null) {
                    arrayList.add(n0.a(bVar, h.a.f321a, false, g1Var, d.b(str), this.f239d.size(), this.f238c.j));
                    return;
                }
                throw null;
            } else {
                i.a("name");
                throw null;
            }
        }
    }

    /* renamed from: a.a.a.a.v0.a.o.b$b  reason: collision with other inner class name */
    public final class C0013b extends a.a.a.a.v0.m.b {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C0013b() {
            super(b.this.j);
        }

        @Override // a.a.a.a.v0.m.s0
        public boolean a() {
            return true;
        }

        @Override // a.a.a.a.v0.m.s0, a.a.a.a.v0.m.b
        public e c() {
            return b.this;
        }

        @Override // a.a.a.a.v0.m.s0
        public List<r0> d() {
            return b.this.i;
        }

        @Override // a.a.a.a.v0.m.h
        public Collection<d0> f() {
            List<a.a.a.a.v0.f.a> list;
            Iterable<r0> iterable;
            int ordinal = b.this.l.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                list = e.f.a.g.c(b.n);
            } else if (ordinal == 2) {
                list = e.f.a.g.g(b.o, new a.a.a.a.v0.f.a(g.f189f, c.Function.a(b.this.m)));
            } else if (ordinal == 3) {
                list = e.f.a.g.g(b.o, new a.a.a.a.v0.f.a(a.a.a.a.v0.j.g.f1540c, c.SuspendFunction.a(b.this.m)));
            } else {
                throw new a.h();
            }
            w b = b.this.k.b();
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) list, 10));
            for (a.a.a.a.v0.f.a aVar : list) {
                e a2 = e.f.a.g.a(b, aVar);
                if (a2 != null) {
                    List<r0> list2 = b.this.i;
                    s0 n = a2.n();
                    i.a((Object) n, "descriptor.typeConstructor");
                    int size = n.d().size();
                    if (list2 == null) {
                        i.a("$this$takeLast");
                        throw null;
                    } else if (size >= 0) {
                        if (size == 0) {
                            iterable = l.f2119c;
                        } else {
                            int size2 = list2.size();
                            if (size >= size2) {
                                iterable = f.g(list2);
                            } else if (size == 1) {
                                iterable = e.f.a.g.c(f.c((List) list2));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list2 instanceof RandomAccess) {
                                    for (int i = size2 - size; i < size2; i++) {
                                        arrayList2.add(list2.get(i));
                                    }
                                } else {
                                    ListIterator<r0> listIterator = list2.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                iterable = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(e.f.a.g.a(iterable, 10));
                        for (r0 r0Var : iterable) {
                            arrayList3.add(new x0(r0Var.v()));
                        }
                        if (h.b != null) {
                            arrayList.add(e0.a(h.a.f321a, a2, arrayList3));
                        } else {
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + aVar + " not found").toString());
                }
            }
            return f.g(arrayList);
        }

        @Override // a.a.a.a.v0.m.h
        public p0 h() {
            return p0.a.f493a;
        }

        public String toString() {
            return b.this.toString();
        }

        @Override // a.a.a.a.v0.m.s0, a.a.a.a.v0.m.b
        /* renamed from: c  reason: collision with other method in class */
        public a.a.a.a.v0.b.h m2c() {
            return b.this;
        }
    }

    /* JADX WARN: Init of enum e can be incorrect */
    /* JADX WARN: Init of enum f can be incorrect */
    public enum c {
        Function(r2, "Function"),
        SuspendFunction(r2, "SuspendFunction"),
        f243g(k.f220a, k.f222d),
        f244h(k.f220a, k.f223e);
        
        public static final a j = new a(null);

        /* renamed from: c  reason: collision with root package name */
        public final a.a.a.a.v0.f.b f245c;

        /* renamed from: d  reason: collision with root package name */
        public final String f246d;

        public static final class a {
            public /* synthetic */ a(a.w.c.f fVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            i.a((Object) g.f189f, "BUILT_INS_PACKAGE_FQ_NAME");
            i.a((Object) a.a.a.a.v0.j.g.f1540c, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        }

        /* access modifiers changed from: public */
        c(a.a.a.a.v0.f.b bVar, String str) {
            this.f245c = bVar;
            this.f246d = str;
        }

        public final d a(int i2) {
            d b = d.b(this.f246d + i2);
            i.a((Object) b, "Name.identifier(\"$classNamePrefix$arity\")");
            return b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(j jVar, y yVar, c cVar, int i2) {
        super(jVar, cVar.a(i2));
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (yVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (cVar != null) {
            this.j = jVar;
            this.k = yVar;
            this.l = cVar;
            this.m = i2;
            this.f236g = new C0013b();
            this.f237h = new c(this.j, this);
            ArrayList arrayList = new ArrayList();
            a aVar = new a(this, arrayList);
            a.y.c cVar2 = new a.y.c(1, this.m);
            ArrayList arrayList2 = new ArrayList(e.f.a.g.a(cVar2, 10));
            Iterator it = cVar2.iterator();
            while (it.hasNext()) {
                int a2 = ((r) it).a();
                g1 g1Var = g1.IN_VARIANCE;
                StringBuilder sb = new StringBuilder();
                sb.append('P');
                sb.append(a2);
                aVar.a(g1Var, sb.toString());
                arrayList2.add(q.f2100a);
            }
            aVar.a(g1.OUT_VARIANCE, "R");
            this.i = f.g(arrayList);
        } else {
            i.a("functionKind");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e
    public Collection A0() {
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
        return false;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean P() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.d Y() {
        return null;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.j.w.i Z() {
        return i.b.b;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public a.a.a.a.v0.j.w.i a(a.a.a.a.v0.m.i1.f fVar) {
        if (fVar != null) {
            return this.f237h;
        }
        a.w.c.i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.e, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.k b() {
        return this.k;
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
        return this.f236g;
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public v o() {
        return v.ABSTRACT;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public Collection q() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        m0 m0Var = m0.f491a;
        a.w.c.i.a((Object) m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.f t() {
        return a.a.a.a.v0.b.f.INTERFACE;
    }

    public String toString() {
        String a2 = d().a();
        a.w.c.i.a((Object) a2, "name.asString()");
        return a2;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
    public List<r0> x() {
        return this.i;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        if (h.b != null) {
            return h.a.f321a;
        }
        throw null;
    }
}

package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.c0.q;
import a.a.a.a.v0.d.a.c0.w;
import a.a.a.a.v0.d.a.y.g;
import a.a.a.a.v0.d.a.y.k;
import a.a.a.a.v0.j.w.c;
import a.a.a.a.v0.j.w.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.m.d0;
import a.a.l;
import a.t.m;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class k extends a.a.a.a.v0.j.w.j {
    public static final /* synthetic */ l[] l = {s.a(new p(s.a(k.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), s.a(new p(s.a(k.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), s.a(new p(s.a(k.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    public final a.a.a.a.v0.l.g<Collection<a.a.a.a.v0.b.k>> b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.l.g<b> f623c;

    /* renamed from: d  reason: collision with root package name */
    public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, Collection<l0>> f624d;

    /* renamed from: e  reason: collision with root package name */
    public final a.a.a.a.v0.l.e<a.a.a.a.v0.f.d, f0> f625e;

    /* renamed from: f  reason: collision with root package name */
    public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, Collection<l0>> f626f;

    /* renamed from: g  reason: collision with root package name */
    public final a.a.a.a.v0.l.g f627g;

    /* renamed from: h  reason: collision with root package name */
    public final a.a.a.a.v0.l.g f628h;
    public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, List<f0>> i;
    public final a.a.a.a.v0.d.a.a0.h j;
    public final k k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f629a;
        public final d0 b;

        /* renamed from: c  reason: collision with root package name */
        public final List<w0> f630c;

        /* renamed from: d  reason: collision with root package name */
        public final List<r0> f631d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f632e;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f633f;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.w0> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.r0> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d0 d0Var, d0 d0Var2, List<? extends w0> list, List<? extends r0> list2, boolean z, List<String> list3) {
            if (d0Var == null) {
                a.w.c.i.a("returnType");
                throw null;
            } else if (list == 0) {
                a.w.c.i.a("valueParameters");
                throw null;
            } else if (list2 == 0) {
                a.w.c.i.a("typeParameters");
                throw null;
            } else if (list3 != null) {
                this.f629a = d0Var;
                this.b = d0Var2;
                this.f630c = list;
                this.f631d = list2;
                this.f632e = z;
                this.f633f = list3;
            } else {
                a.w.c.i.a("errors");
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
            return a.w.c.i.a(this.f629a, aVar.f629a) && a.w.c.i.a(this.b, aVar.b) && a.w.c.i.a(this.f630c, aVar.f630c) && a.w.c.i.a(this.f631d, aVar.f631d) && this.f632e == aVar.f632e && a.w.c.i.a(this.f633f, aVar.f633f);
        }

        public int hashCode() {
            d0 d0Var = this.f629a;
            int i = 0;
            int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
            d0 d0Var2 = this.b;
            int hashCode2 = (hashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31;
            List<w0> list = this.f630c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<r0> list2 = this.f631d;
            int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.f632e;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode4 + i2) * 31;
            List<String> list3 = this.f633f;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("MethodSignatureData(returnType=");
            a2.append(this.f629a);
            a2.append(", receiverType=");
            a2.append(this.b);
            a2.append(", valueParameters=");
            a2.append(this.f630c);
            a2.append(", typeParameters=");
            a2.append(this.f631d);
            a2.append(", hasStableParameterNames=");
            a2.append(this.f632e);
            a2.append(", errors=");
            a2.append(this.f633f);
            a2.append(")");
            return a2.toString();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<w0> f634a;
        public final boolean b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.w0> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends w0> list, boolean z) {
            if (list != 0) {
                this.f634a = list;
                this.b = z;
                return;
            }
            a.w.c.i.a("descriptors");
            throw null;
        }
    }

    public static final class c extends a.w.c.j implements a.w.b.a<List<? extends a.a.a.a.v0.b.k>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f635c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(0);
            this.f635c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends a.a.a.a.v0.b.k> a() {
            k kVar = this.f635c;
            a.a.a.a.v0.j.w.d dVar = a.a.a.a.v0.j.w.d.n;
            if (a.a.a.a.v0.j.w.i.f1624a != null) {
                a.w.b.l<a.a.a.a.v0.f.d, Boolean> lVar = i.a.f1625a;
                if (kVar == null) {
                    throw null;
                } else if (dVar == null) {
                    a.w.c.i.a("kindFilter");
                    throw null;
                } else if (lVar != null) {
                    a.a.a.a.v0.c.a.d dVar2 = a.a.a.a.v0.c.a.d.f524g;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    d.a aVar = a.a.a.a.v0.j.w.d.u;
                    if (dVar.a(a.a.a.a.v0.j.w.d.k)) {
                        for (a.a.a.a.v0.f.d dVar3 : kVar.b(dVar, lVar)) {
                            if (lVar.a(dVar3).booleanValue()) {
                                a.a.a.a.v0.m.l1.a.a(linkedHashSet, kVar.b(dVar3, dVar2));
                            }
                        }
                    }
                    d.a aVar2 = a.a.a.a.v0.j.w.d.u;
                    if (dVar.a(a.a.a.a.v0.j.w.d.f1617h) && !dVar.b.contains(c.a.b)) {
                        for (a.a.a.a.v0.f.d dVar4 : kVar.c(dVar, lVar)) {
                            if (lVar.a(dVar4).booleanValue()) {
                                linkedHashSet.addAll(kVar.a(dVar4, dVar2));
                            }
                        }
                    }
                    d.a aVar3 = a.a.a.a.v0.j.w.d.u;
                    if (dVar.a(a.a.a.a.v0.j.w.d.i) && !dVar.b.contains(c.a.b)) {
                        for (a.a.a.a.v0.f.d dVar5 : kVar.d(dVar, lVar)) {
                            if (lVar.a(dVar5).booleanValue()) {
                                linkedHashSet.addAll(kVar.c(dVar5, dVar2));
                            }
                        }
                    }
                    return a.t.f.g(linkedHashSet);
                } else {
                    a.w.c.i.a("nameFilter");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public static final class d extends a.w.c.j implements a.w.b.a<Set<? extends a.a.a.a.v0.f.d>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f636c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(0);
            this.f636c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Set<? extends a.a.a.a.v0.f.d> a() {
            return this.f636c.b(a.a.a.a.v0.j.w.d.p, (a.w.b.l<? super a.a.a.a.v0.f.d, Boolean>) null);
        }
    }

    public static final class e extends a.w.c.j implements a.w.b.l<a.a.a.a.v0.f.d, f0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f637c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(k kVar) {
            super(1);
            this.f637c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x010f, code lost:
            if (a.a.a.a.v0.a.n.f232e.a(r4) == false) goto L_0x0112;
         */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0134  */
        @Override // a.w.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a.a.a.a.v0.b.f0 a(a.a.a.a.v0.f.d r14) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.n.k.e.a(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends a.w.c.j implements a.w.b.l<a.a.a.a.v0.f.d, Collection<? extends l0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f638c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(1);
            this.f638c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Collection<? extends l0> a(a.a.a.a.v0.f.d dVar) {
            a.a.a.a.v0.f.d dVar2 = dVar;
            if (dVar2 != null) {
                k kVar = this.f638c.k;
                if (kVar != null) {
                    return kVar.f624d.a(dVar2);
                }
                ArrayList arrayList = new ArrayList();
                for (q qVar : ((b) this.f638c.f623c.a()).a(dVar2)) {
                    a.a.a.a.v0.d.a.z.f a2 = this.f638c.a(qVar);
                    if (this.f638c.a(a2)) {
                        if (((g.a) this.f638c.j.f562c.f550g) != null) {
                            arrayList.add(a2);
                        } else {
                            throw null;
                        }
                    }
                }
                return arrayList;
            }
            a.w.c.i.a("name");
            throw null;
        }
    }

    public static final class g extends a.w.c.j implements a.w.b.a<b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f639c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(k kVar) {
            super(0);
            this.f639c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public b a() {
            return this.f639c.c();
        }
    }

    public static final class h extends a.w.c.j implements a.w.b.a<Set<? extends a.a.a.a.v0.f.d>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f640c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(k kVar) {
            super(0);
            this.f640c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Set<? extends a.a.a.a.v0.f.d> a() {
            return this.f640c.c(a.a.a.a.v0.j.w.d.q, (a.w.b.l<? super a.a.a.a.v0.f.d, Boolean>) null);
        }
    }

    public static final class i extends a.w.c.j implements a.w.b.l<a.a.a.a.v0.f.d, List<? extends l0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f641c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(k kVar) {
            super(1);
            this.f641c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public List<? extends l0> a(a.a.a.a.v0.f.d dVar) {
            a.a.a.a.v0.f.d dVar2 = dVar;
            if (dVar2 != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f641c.f624d.a(dVar2));
                Collection<?> a2 = e.f.a.g.a((Collection) linkedHashSet, (a.w.b.l) a.a.a.a.v0.j.p.f1568c);
                if (linkedHashSet.size() != a2.size()) {
                    linkedHashSet.retainAll(a2);
                }
                this.f641c.a(linkedHashSet, dVar2);
                a.a.a.a.v0.d.a.a0.h hVar = this.f641c.j;
                return a.t.f.g(hVar.f562c.r.a(hVar, linkedHashSet));
            }
            a.w.c.i.a("name");
            throw null;
        }
    }

    public static final class j extends a.w.c.j implements a.w.b.l<a.a.a.a.v0.f.d, List<? extends f0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f642c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(k kVar) {
            super(1);
            this.f642c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public List<? extends f0> a(a.a.a.a.v0.f.d dVar) {
            a.a.a.a.v0.f.d dVar2 = dVar;
            if (dVar2 != null) {
                ArrayList arrayList = new ArrayList();
                a.a.a.a.v0.m.l1.a.a(arrayList, this.f642c.f625e.a(dVar2));
                this.f642c.a(dVar2, arrayList);
                if (a.a.a.a.v0.j.g.h(this.f642c.e())) {
                    return a.t.f.g(arrayList);
                }
                a.a.a.a.v0.d.a.a0.h hVar = this.f642c.j;
                return a.t.f.g(hVar.f562c.r.a(hVar, arrayList));
            }
            a.w.c.i.a("name");
            throw null;
        }
    }

    /* renamed from: a.a.a.a.v0.d.a.a0.n.k$k  reason: collision with other inner class name */
    public static final class C0027k extends a.w.c.j implements a.w.b.a<Set<? extends a.a.a.a.v0.f.d>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f643c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0027k(k kVar) {
            super(0);
            this.f643c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Set<? extends a.a.a.a.v0.f.d> a() {
            return this.f643c.d(a.a.a.a.v0.j.w.d.r, null);
        }
    }

    public k(a.a.a.a.v0.d.a.a0.h hVar, k kVar) {
        if (hVar != null) {
            this.j = hVar;
            this.k = kVar;
            this.b = hVar.f562c.f545a.a(new c(this), a.t.l.f2119c);
            this.f623c = this.j.f562c.f545a.a(new g(this));
            this.f624d = this.j.f562c.f545a.a(new f(this));
            this.f625e = this.j.f562c.f545a.b(new e(this));
            this.f626f = this.j.f562c.f545a.a(new i(this));
            this.f627g = this.j.f562c.f545a.a(new h(this));
            this.f628h = this.j.f562c.f545a.a(new C0027k(this));
            this.j.f562c.f545a.a(new d(this));
            this.i = this.j.f562c.f545a.a(new j(this));
            return;
        }
        a.w.c.i.a("c");
        throw null;
    }

    public abstract a a(q qVar, List<? extends r0> list, d0 d0Var, List<? extends w0> list2);

    public final d0 a(q qVar, a.a.a.a.v0.d.a.a0.h hVar) {
        if (qVar == null) {
            a.w.c.i.a("method");
            throw null;
        } else if (hVar != null) {
            return hVar.b.a(qVar.h(), a.a.a.a.v0.d.a.a0.o.g.a(a.a.a.a.v0.d.a.y.l.COMMON, qVar.L().H(), (r0) null, 2));
        } else {
            a.w.c.i.a("c");
            throw null;
        }
    }

    public abstract void a(a.a.a.a.v0.f.d dVar, Collection<f0> collection);

    public abstract void a(Collection<l0> collection, a.a.a.a.v0.f.d dVar);

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> b() {
        return (Set) e.f.a.g.a(this.f628h, l[1]);
    }

    public abstract Set<a.a.a.a.v0.f.d> b(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar);

    public abstract b c();

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Collection<f0> c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("location");
            throw null;
        } else if (!b().contains(dVar)) {
            return a.t.l.f2119c;
        } else {
            return this.i.a(dVar);
        }
    }

    public abstract Set<a.a.a.a.v0.f.d> c(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar);

    public abstract i0 d();

    public abstract Set<a.a.a.a.v0.f.d> d(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar);

    public abstract a.a.a.a.v0.b.k e();

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Lazy scope for ");
        a2.append(e());
        return a2.toString();
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public Collection<a.a.a.a.v0.b.k> a(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (dVar == null) {
            a.w.c.i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            return (Collection) this.b.a();
        } else {
            a.w.c.i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Collection<l0> a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("location");
            throw null;
        } else if (!a().contains(dVar)) {
            return a.t.l.f2119c;
        } else {
            return this.f626f.a(dVar);
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Set<a.a.a.a.v0.f.d> a() {
        return (Set) e.f.a.g.a(this.f627g, l[0]);
    }

    public boolean a(a.a.a.a.v0.d.a.z.f fVar) {
        if (fVar != null) {
            return true;
        }
        a.w.c.i.a("$this$isVisibleAsFunction");
        throw null;
    }

    public final a.a.a.a.v0.d.a.z.f a(q qVar) {
        i0 i0Var;
        Map<? extends a.AbstractC0014a<?>, ?> map;
        if (qVar != null) {
            a.a.a.a.v0.b.b1.h a2 = e.f.a.g.a(this.j, qVar);
            a.a.a.a.v0.b.k e2 = e();
            a.a.a.a.v0.f.d d2 = qVar.d();
            a.a.a.a.v0.d.a.b0.a a3 = this.j.f562c.j.a(qVar);
            if (e2 == null) {
                a.a.a.a.v0.d.a.z.f.a(5);
                throw null;
            } else if (d2 == null) {
                a.a.a.a.v0.d.a.z.f.a(7);
                throw null;
            } else if (a3 != null) {
                a.a.a.a.v0.d.a.z.f fVar = new a.a.a.a.v0.d.a.z.f(e2, null, a2, d2, b.a.DECLARATION, a3);
                a.w.c.i.a((Object) fVar, "JavaMethodDescriptor.cre….source(method)\n        )");
                a.a.a.a.v0.d.a.a0.h a4 = e.f.a.g.a(this.j, fVar, qVar, 0);
                List<w> k2 = qVar.k();
                ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) k2, 10));
                Iterator<T> it = k2.iterator();
                while (it.hasNext()) {
                    r0 a5 = a4.f563d.a(it.next());
                    if (a5 != null) {
                        arrayList.add(a5);
                    } else {
                        a.w.c.i.a();
                        throw null;
                    }
                }
                b a6 = a(a4, fVar, qVar.j());
                a a7 = a(qVar, arrayList, a(qVar, a4), a6.f634a);
                d0 d0Var = a7.b;
                if (d0Var == null) {
                    i0Var = null;
                } else if (a.a.a.a.v0.b.b1.h.b != null) {
                    i0Var = e.f.a.g.a(fVar, d0Var, h.a.f321a);
                } else {
                    throw null;
                }
                i0 d3 = d();
                List<r0> list = a7.f631d;
                List<w0> list2 = a7.f630c;
                d0 d0Var2 = a7.f629a;
                v.a aVar = v.f504h;
                boolean O = qVar.O();
                boolean z = !qVar.C();
                if (aVar != null) {
                    v vVar = O ? v.ABSTRACT : z ? v.OPEN : v.FINAL;
                    a1 g2 = qVar.g();
                    if (a7.b != null) {
                        map = Collections.singletonMap(a.a.a.a.v0.d.a.z.f.G, a.t.f.a((List) a6.f634a));
                        a.w.c.i.a((Object) map, "java.util.Collections.si…(pair.first, pair.second)");
                    } else {
                        map = m.f2120c;
                    }
                    fVar.a(i0Var, d3, list, list2, d0Var2, vVar, g2, map);
                    fVar.a(a7.f632e, a6.b);
                    if (!(!a7.f633f.isEmpty())) {
                        return fVar;
                    }
                    a.a.a.a.v0.d.a.y.k kVar = a4.f562c.f548e;
                    List<String> list3 = a7.f633f;
                    if (((k.a) kVar) == null) {
                        throw null;
                    } else if (list3 == null) {
                        k.a.a(6);
                        throw null;
                    } else {
                        throw new UnsupportedOperationException("Should not be called");
                    }
                } else {
                    throw null;
                }
            } else {
                a.a.a.a.v0.d.a.z.f.a(8);
                throw null;
            }
        } else {
            a.w.c.i.a("method");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.d.a.a0.n.k.b a(a.a.a.a.v0.d.a.a0.h r21, a.a.a.a.v0.b.s r22, java.util.List<? extends a.a.a.a.v0.d.a.c0.y> r23) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.n.k.a(a.a.a.a.v0.d.a.a0.h, a.a.a.a.v0.b.s, java.util.List):a.a.a.a.v0.d.a.a0.n.k$b");
    }
}

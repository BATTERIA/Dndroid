package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.d0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.d.a.c0.x;
import a.a.a.a.v0.d.b.m;
import a.a.a.a.v0.l.g;
import a.a.l;
import a.t.f;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i extends d0 {
    public static final /* synthetic */ l[] n = {s.a(new p(s.a(i.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), s.a(new p(s.a(i.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: h  reason: collision with root package name */
    public final h f611h;
    public final g i;
    public final c j;
    public final g<List<a.a.a.a.v0.f.b>> k;
    public final a.a.a.a.v0.b.b1.h l;
    public final t m;

    public static final class a extends j implements a.w.b.a<Map<String, ? extends a.a.a.a.v0.d.b.l>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(0);
            this.f612c = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Map<String, ? extends a.a.a.a.v0.d.b.l> a() {
            i iVar = this.f612c;
            a.a.a.a.v0.d.b.p pVar = iVar.f611h.f562c.l;
            String a2 = iVar.f366g.a();
            a.w.c.i.a((Object) a2, "fqName.asString()");
            List<String> a3 = pVar.a(a2);
            ArrayList arrayList = new ArrayList();
            for (T t : a3) {
                a.a.a.a.v0.j.v.b a4 = a.a.a.a.v0.j.v.b.a((String) t);
                a.w.c.i.a((Object) a4, "JvmClassName.byInternalName(partName)");
                a.a.a.a.v0.f.a a5 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(a4.f1602a.replace('/', '.')));
                a.w.c.i.a((Object) a5, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                a.a.a.a.v0.d.b.l a6 = e.f.a.g.a(this.f612c.f611h.f562c.f546c, a5);
                a.j jVar = a6 != null ? new a.j(t, a6) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return f.h(arrayList);
        }
    }

    public static final class b extends j implements a.w.b.a<HashMap<a.a.a.a.v0.j.v.b, a.a.a.a.v0.j.v.b>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f613c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(0);
            this.f613c = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public HashMap<a.a.a.a.v0.j.v.b, a.a.a.a.v0.j.v.b> a() {
            String a2;
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, a.a.a.a.v0.d.b.l> entry : this.f613c.U().entrySet()) {
                a.a.a.a.v0.j.v.b a3 = a.a.a.a.v0.j.v.b.a(entry.getKey());
                a.w.c.i.a((Object) a3, "JvmClassName.byInternalName(partInternalName)");
                a.a.a.a.v0.d.b.v.a c2 = entry.getValue().c();
                int ordinal = c2.f930a.ordinal();
                if (ordinal == 2) {
                    hashMap.put(a3, a3);
                } else if (ordinal == 5 && (a2 = c2.a()) != null) {
                    a.a.a.a.v0.j.v.b a4 = a.a.a.a.v0.j.v.b.a(a2);
                    a.w.c.i.a((Object) a4, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    hashMap.put(a3, a4);
                }
            }
            return hashMap;
        }
    }

    public static final class c extends j implements a.w.b.a<List<? extends a.a.a.a.v0.f.b>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f614c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar) {
            super(0);
            this.f614c = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends a.a.a.a.v0.f.b> a() {
            Collection<t> o = this.f614c.m.o();
            ArrayList arrayList = new ArrayList(e.f.a.g.a(o, 10));
            Iterator<T> it = o.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().e());
            }
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar, t tVar) {
        super(hVar.f562c.o, tVar.e());
        a.a.a.a.v0.b.b1.h hVar2;
        if (hVar == null) {
            a.w.c.i.a("outerContext");
            throw null;
        } else if (tVar != null) {
            this.m = tVar;
            h a2 = e.f.a.g.a(hVar, this, (x) null, 0, 6);
            this.f611h = a2;
            this.i = a2.f562c.f545a.a(new a(this));
            this.j = new c(this.f611h, this.m, this);
            this.k = this.f611h.f562c.f545a.a(new c(this), a.t.l.f2119c);
            h hVar3 = this.f611h;
            if (!hVar3.f562c.q.b) {
                hVar2 = e.f.a.g.a(hVar3, this.m);
            } else if (a.a.a.a.v0.b.b1.h.b != null) {
                hVar2 = h.a.f321a;
            } else {
                throw null;
            }
            this.l = hVar2;
            this.f611h.f562c.f545a.a(new b(this));
        } else {
            a.w.c.i.a("jPackage");
            throw null;
        }
    }

    public final Map<String, a.a.a.a.v0.d.b.l> U() {
        return (Map) e.f.a.g.a(this.i, n[0]);
    }

    @Override // a.a.a.a.v0.b.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.d0
    public m0 r() {
        return new m(this);
    }

    @Override // a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.d1.d0
    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Lazy Java package fragment: ");
        a2.append(this.f366g);
        return a2.toString();
    }

    @Override // a.a.a.a.v0.b.y
    public a.a.a.a.v0.j.w.i u() {
        return this.j;
    }

    @Override // a.a.a.a.v0.b.b1.a, a.a.a.a.v0.b.b1.b
    public a.a.a.a.v0.b.b1.h y() {
        return this.l;
    }
}

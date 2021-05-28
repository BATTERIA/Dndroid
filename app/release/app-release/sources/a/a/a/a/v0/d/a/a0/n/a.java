package a.a.a.a.v0.d.a.a0.n;

import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.n;
import a.a.a.a.v0.d.a.c0.p;
import a.a.a.a.v0.d.a.c0.q;
import a.a.a.a.v0.f.d;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import a.z.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final l<q, Boolean> f573a;
    public final Map<d, List<q>> b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<d, n> f574c;

    /* renamed from: d  reason: collision with root package name */
    public final g f575d;

    /* renamed from: e  reason: collision with root package name */
    public final l<p, Boolean> f576e;

    /* renamed from: a.a.a.a.v0.d.a.a0.n.a$a  reason: collision with other inner class name */
    public static final class C0023a extends j implements l<q, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f577c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0023a(a aVar) {
            super(1);
            this.f577c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
        @Override // a.w.b.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean a(a.a.a.a.v0.d.a.c0.q r5) {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.n.a.C0023a.a(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.w.b.l<? super a.a.a.a.v0.d.a.c0.p, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(g gVar, l<? super p, Boolean> lVar) {
        if (gVar == null) {
            i.a("jClass");
            throw null;
        } else if (lVar != 0) {
            this.f575d = gVar;
            this.f576e = lVar;
            this.f573a = new C0023a(this);
            h a2 = a.a.a.a.v0.m.l1.a.a(f.a(this.f575d.B()), (l) this.f573a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : a2) {
                d d2 = ((q) obj).d();
                Object obj2 = linkedHashMap.get(d2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(d2, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.b = linkedHashMap;
            h a3 = a.a.a.a.v0.m.l1.a.a(f.a(this.f575d.v()), (l) this.f576e);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : a3) {
                linkedHashMap2.put(((n) obj3).d(), obj3);
            }
            this.f574c = linkedHashMap2;
        } else {
            i.a("memberFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.n.b
    public Collection<q> a(d dVar) {
        if (dVar != null) {
            List<q> list = this.b.get(dVar);
            return list != null ? list : a.t.l.f2119c;
        }
        i.a("name");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.b
    public Set<d> a() {
        h<n> a2 = a.a.a.a.v0.m.l1.a.a(f.a(this.f575d.v()), (l) this.f576e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : a2) {
            linkedHashSet.add(nVar.d());
        }
        return linkedHashSet;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.b
    public n b(d dVar) {
        if (dVar != null) {
            return this.f574c.get(dVar);
        }
        i.a("name");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.a0.n.b
    public Set<d> b() {
        h<q> a2 = a.a.a.a.v0.m.l1.a.a(f.a(this.f575d.B()), (l) this.f573a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar : a2) {
            linkedHashSet.add(qVar.d());
        }
        return linkedHashSet;
    }
}

package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.g;
import a.a.l;
import a.w.c.i;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class e extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ l[] f1620d = {s.a(new p(s.a(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.b.e f1621c;

    public static final class a extends j implements a.w.b.a<List<? extends k>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e f1622c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f1622c = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x012e */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v8, types: [a.a.a.a.v0.j.l] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v7, types: [a.t.l] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // a.w.b.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<? extends a.a.a.a.v0.b.k> a() {
            /*
            // Method dump skipped, instructions count: 327
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.w.e.a.a():java.lang.Object");
        }
    }

    public e(a.a.a.a.v0.l.j jVar, a.a.a.a.v0.b.e eVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (eVar != null) {
            this.f1621c = eVar;
            this.b = jVar.a(new a(this));
        } else {
            i.a("containingClass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public Collection<k> a(d dVar, a.w.b.l<? super d, Boolean> lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar == null) {
            i.a("nameFilter");
            throw null;
        } else if (!dVar.a(d.o.f1618a)) {
            return a.t.l.f2119c;
        } else {
            return d();
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Collection<f0> c(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            List<k> d2 = d();
            ArrayList arrayList = new ArrayList();
            for (T t : d2) {
                if (t instanceof f0) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (i.a(((f0) obj).d(), dVar)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } else {
            i.a("location");
            throw null;
        }
    }

    public abstract List<a.a.a.a.v0.b.s> c();

    public final List<k> d() {
        return (List) e.f.a.g.a(this.b, f1620d[0]);
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Collection<l0> a(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            List<k> d2 = d();
            ArrayList arrayList = new ArrayList();
            for (T t : d2) {
                if (t instanceof l0) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (i.a(((l0) obj).d(), dVar)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } else {
            i.a("location");
            throw null;
        }
    }
}

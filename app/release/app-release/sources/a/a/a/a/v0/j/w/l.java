package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.c.a.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.g;
import a.w.c.i;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class l extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ a.a.l[] f1627d = {s.a(new p(s.a(l.class), "functions", "getFunctions()Ljava/util/List;"))};
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final e f1628c;

    public static final class a extends j implements a.w.b.a<List<? extends l0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l f1629c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(0);
            this.f1629c = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends l0> a() {
            return e.f.a.g.g(e.f.a.g.a(this.f1629c.f1628c), e.f.a.g.b(this.f1629c.f1628c));
        }
    }

    public l(a.a.a.a.v0.l.j jVar, e eVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (eVar != null) {
            this.f1628c = eVar;
            boolean z = eVar.t() == f.ENUM_CLASS;
            if (!a.s.f2103a || z) {
                this.b = jVar.a(new a(this));
                return;
            }
            StringBuilder a2 = e.a.a.a.a.a("Class should be an enum: ");
            a2.append(this.f1628c);
            throw new AssertionError(a2.toString());
        } else {
            i.a("containingClass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public Collection a(d dVar, a.w.b.l lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            return (List) e.f.a.g.a(this.b, f1627d[0]);
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public h b(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            return null;
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
    public Collection a(d dVar, b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            ArrayList arrayList = new ArrayList(1);
            for (Object obj : (List) e.f.a.g.a(this.b, f1627d[0])) {
                if (i.a(((l0) obj).d(), dVar)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } else {
            i.a("location");
            throw null;
        }
    }
}

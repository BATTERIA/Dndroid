package a.a.a.a.v0.b;

import a.a.a.a.v0.f.d;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a0 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<y> f298a;

    public static final class a extends j implements l<y, a.a.a.a.v0.f.b> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f299c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a.a.a.a.v0.f.b a(y yVar) {
            y yVar2 = yVar;
            if (yVar2 != null) {
                return yVar2.e();
            }
            i.a("it");
            throw null;
        }
    }

    public static final class b extends j implements l<a.a.a.a.v0.f.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.f.b f300c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a.a.a.a.v0.f.b bVar) {
            super(1);
            this.f300c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Boolean a(a.a.a.a.v0.f.b bVar) {
            a.a.a.a.v0.f.b bVar2 = bVar;
            if (bVar2 != null) {
                return Boolean.valueOf(!bVar2.b() && i.a(bVar2.c(), this.f300c));
            }
            i.a("it");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.b.y> */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(Collection<? extends y> collection) {
        if (collection != 0) {
            this.f298a = collection;
        } else {
            i.a("packageFragments");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.z
    public List<y> a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            Collection<y> collection = this.f298a;
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                if (i.a(t.e(), bVar)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.z
    public Collection<a.a.a.a.v0.f.b> a(a.a.a.a.v0.f.b bVar, l<? super d, Boolean> lVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (lVar != null) {
            return a.a.a.a.v0.m.l1.a.b(a.a.a.a.v0.m.l1.a.a(a.a.a.a.v0.m.l1.a.d(f.a(this.f298a), a.f299c), (l) new b(bVar)));
        } else {
            i.a("nameFilter");
            throw null;
        }
    }
}

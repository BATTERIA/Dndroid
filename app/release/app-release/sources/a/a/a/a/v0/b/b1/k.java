package a.a.a.a.v0.b.b1;

import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import a.z.h;
import e.f.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k implements h {

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f327c;

    public static final class a extends j implements l<h, c> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.f.b f328c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a.a.a.a.v0.f.b bVar) {
            super(1);
            this.f328c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public c a(h hVar) {
            h hVar2 = hVar;
            if (hVar2 != null) {
                return hVar2.a(this.f328c);
            }
            i.a("it");
            throw null;
        }
    }

    public static final class b extends j implements l<h, h<? extends c>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f329c = new b();

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public h<? extends c> a(h hVar) {
            h hVar2 = hVar;
            if (hVar2 != null) {
                return f.a(hVar2);
            }
            i.a("it");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.b1.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends h> list) {
        if (list != 0) {
            this.f327c = list;
        } else {
            i.a("delegates");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(a.a.a.a.v0.f.b bVar) {
        Object obj = null;
        if (bVar != null) {
            h e2 = a.a.a.a.v0.m.l1.a.e(f.a((Iterable) this.f327c), new a(bVar));
            if (e2 != null) {
                Iterator it = e2.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                }
                return (c) obj;
            }
            i.a("$this$firstOrNull");
            throw null;
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            for (h hVar : f.a((Iterable) this.f327c)) {
                if (hVar.b(bVar)) {
                    return true;
                }
            }
            return false;
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        List<h> list = this.f327c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return a.a.a.a.v0.m.l1.a.c(f.a((Iterable) this.f327c), b.f329c).iterator();
    }

    public k(h... hVarArr) {
        if (hVarArr != null) {
            List<h> k = g.k(hVarArr);
            if (k != null) {
                this.f327c = k;
            } else {
                i.a("delegates");
                throw null;
            }
        } else {
            i.a("delegates");
            throw null;
        }
    }
}

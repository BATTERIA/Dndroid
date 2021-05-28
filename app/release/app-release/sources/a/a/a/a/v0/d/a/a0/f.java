package a.a.a.a.v0.d.a.a0;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.d.a.c0.d;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.l.e;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import a.z.n;
import e.f.a.g;
import java.util.Iterator;

public final class f implements h {

    /* renamed from: c  reason: collision with root package name */
    public final e<a.a.a.a.v0.d.a.c0.a, c> f554c;

    /* renamed from: d  reason: collision with root package name */
    public final h f555d;

    /* renamed from: e  reason: collision with root package name */
    public final d f556e;

    public static final class a extends j implements l<a.a.a.a.v0.d.a.c0.a, c> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f557c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f557c = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public c a(a.a.a.a.v0.d.a.c0.a aVar) {
            a.a.a.a.v0.d.a.c0.a aVar2 = aVar;
            if (aVar2 != null) {
                return a.a.a.a.v0.d.a.y.c.j.a(aVar2, this.f557c.f555d);
            }
            i.a("annotation");
            throw null;
        }
    }

    public f(h hVar, d dVar) {
        if (hVar == null) {
            i.a("c");
            throw null;
        } else if (dVar != null) {
            this.f555d = hVar;
            this.f556e = dVar;
            this.f554c = hVar.f562c.f545a.b(new a(this));
        } else {
            i.a("annotationOwner");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(b bVar) {
        c a2;
        if (bVar != null) {
            a.a.a.a.v0.d.a.c0.a a3 = this.f556e.a(bVar);
            return (a3 == null || (a2 = this.f554c.a(a3)) == null) ? a.a.a.a.v0.d.a.y.c.j.a(bVar, this.f556e, this.f555d) : a2;
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(b bVar) {
        if (bVar != null) {
            return g.b(this, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        return this.f556e.y().isEmpty() && !this.f556e.t();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        a.z.h d2 = a.a.a.a.v0.m.l1.a.d(a.t.f.a(this.f556e.y()), this.f554c);
        a.a.a.a.v0.d.a.y.c cVar = a.a.a.a.v0.d.a.y.c.j;
        b bVar = a.a.a.a.v0.a.g.k.t;
        i.a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        a.z.h a2 = a.a.a.a.v0.m.l1.a.a(d2, cVar.a(bVar, this.f556e, this.f555d));
        if (a2 != null) {
            return a.a.a.a.v0.m.l1.a.b(a2, n.f2186c).iterator();
        }
        i.a("$this$filterNotNull");
        throw null;
    }
}

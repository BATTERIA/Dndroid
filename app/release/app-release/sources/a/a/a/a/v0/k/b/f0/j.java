package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.t.f;
import a.t.n;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class j extends i {
    public final b m;
    public final y n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(a.a.a.a.v0.b.y r16, a.a.a.a.v0.e.v r17, a.a.a.a.v0.e.x0.c r18, a.a.a.a.v0.e.x0.a r19, a.a.a.a.v0.k.b.f0.g r20, a.a.a.a.v0.k.b.j r21, a.w.b.a<? extends java.util.Collection<a.a.a.a.v0.f.d>> r22) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.f0.j.<init>(a.a.a.a.v0.b.y, a.a.a.a.v0.e.v, a.a.a.a.v0.e.x0.c, a.a.a.a.v0.e.x0.a, a.a.a.a.v0.k.b.f0.g, a.a.a.a.v0.k.b.j, a.w.b.a):void");
    }

    @Override // a.a.a.a.v0.k.b.f0.i
    public void a(Collection<k> collection, l<? super d, Boolean> lVar) {
        if (collection == null) {
            i.a("result");
            throw null;
        } else if (lVar == null) {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.k.b.f0.i, a.a.a.a.v0.j.w.k
    public h b(d dVar, a.a.a.a.v0.c.a.b bVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVar != null) {
            g.a(this.k.f1740c.j, bVar, this.n, dVar);
            return super.b(dVar, bVar);
        } else {
            i.a("location");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.i
    public Set<d> d() {
        return n.f2121c;
    }

    @Override // a.a.a.a.v0.k.b.f0.i
    public Set<d> e() {
        return n.f2121c;
    }

    @Override // a.a.a.a.v0.k.b.f0.i
    public a a(d dVar) {
        if (dVar != null) {
            return new a(this.m, dVar);
        }
        i.a("name");
        throw null;
    }

    @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
    public Collection a(a.a.a.a.v0.j.w.d dVar, l lVar) {
        if (dVar == null) {
            i.a("kindFilter");
            throw null;
        } else if (lVar != null) {
            Collection<k> a2 = a(dVar, lVar, a.a.a.a.v0.c.a.d.f524g);
            Iterable<a.a.a.a.v0.b.c1.b> iterable = this.k.f1740c.l;
            ArrayList arrayList = new ArrayList();
            for (a.a.a.a.v0.b.c1.b bVar : iterable) {
                g.a(arrayList, bVar.a(this.m));
            }
            return f.a((Collection) a2, (Iterable) arrayList);
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.f0.i
    public boolean b(d dVar) {
        boolean z;
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (c().contains(dVar)) {
            return true;
        } else {
            Iterable<a.a.a.a.v0.b.c1.b> iterable = this.k.f1740c.l;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator<a.a.a.a.v0.b.c1.b> it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().a(this.m, dVar)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }
    }
}

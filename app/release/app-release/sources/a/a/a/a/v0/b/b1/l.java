package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.f.b;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class l implements h {

    /* renamed from: c  reason: collision with root package name */
    public final h f330c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f331d;

    /* renamed from: e  reason: collision with root package name */
    public final a.w.b.l<b, Boolean> f332e;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super a.a.a.a.v0.f.b, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public l(h hVar, a.w.b.l<? super b, Boolean> lVar) {
        if (hVar == null) {
            i.a("delegate");
            throw null;
        } else if (lVar != 0) {
            this.f330c = hVar;
            this.f331d = false;
            this.f332e = lVar;
        } else {
            i.a("fqNameFilter");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public c a(b bVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (this.f332e.a(bVar).booleanValue()) {
            return this.f330c.a(bVar);
        } else {
            return null;
        }
    }

    public final boolean a(c cVar) {
        b e2 = cVar.e();
        return e2 != null && this.f332e.a(e2).booleanValue();
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean b(b bVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (this.f332e.a(bVar).booleanValue()) {
            return this.f330c.b(bVar);
        } else {
            return false;
        }
    }

    @Override // a.a.a.a.v0.b.b1.h
    public boolean isEmpty() {
        boolean z;
        h hVar = this.f330c;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (a((c) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return this.f331d ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        h hVar = this.f330c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            if (a((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}

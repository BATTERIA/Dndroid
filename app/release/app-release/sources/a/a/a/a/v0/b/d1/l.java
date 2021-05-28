package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.t.f;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public final class l implements z {

    /* renamed from: a  reason: collision with root package name */
    public final List<z> f396a;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends a.a.a.a.v0.b.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends z> list) {
        if (list != 0) {
            this.f396a = list;
        } else {
            i.a("providers");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.z
    public List<y> a(b bVar) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (z zVar : this.f396a) {
                arrayList.addAll(zVar.a(bVar));
            }
            return f.g(arrayList);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.z
    public Collection<b> a(b bVar, a.w.b.l<? super d, Boolean> lVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (lVar != null) {
            HashSet hashSet = new HashSet();
            for (z zVar : this.f396a) {
                hashSet.addAll(zVar.a(bVar, lVar));
            }
            return hashSet;
        } else {
            i.a("nameFilter");
            throw null;
        }
    }
}

package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.e;
import a.a.a.a.v0.f.d;
import a.w.c.i;
import java.util.ArrayList;
import java.util.List;

public final class g extends d implements e {
    public final Object[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, Object[] objArr) {
        super(dVar);
        if (objArr != null) {
            this.b = objArr;
            return;
        }
        i.a("values");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.e
    public List<d> b() {
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(d.a(obj, null));
            } else {
                i.a();
                throw null;
            }
        }
        return arrayList;
    }
}

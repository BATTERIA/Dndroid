package a.a.a.a.v0.a.p;

import a.a.a.a.v0.a.b;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.ArrayList;
import java.util.List;

public final class d extends j implements l<w, b> {

    /* renamed from: c  reason: collision with root package name */
    public static final d f258c = new d();

    public d() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public b a(w wVar) {
        w wVar2 = wVar;
        if (wVar2 != null) {
            a.a.a.a.v0.f.b bVar = e.f260e;
            i.a((Object) bVar, "KOTLIN_FQ_NAME");
            List<y> y0 = wVar2.a(bVar).y0();
            ArrayList arrayList = new ArrayList();
            for (T t : y0) {
                if (t instanceof b) {
                    arrayList.add(t);
                }
            }
            return (b) f.a((List) arrayList);
        }
        i.a("module");
        throw null;
    }
}

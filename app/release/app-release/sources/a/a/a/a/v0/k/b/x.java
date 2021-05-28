package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.e.f;
import a.a.a.a.v0.e.w;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.f.a;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, f> f1776a;
    public final c b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.e.x0.a f1777c;

    /* renamed from: d  reason: collision with root package name */
    public final l<a, m0> f1778d;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: a.w.b.l<? super a.a.a.a.v0.f.a, ? extends a.a.a.a.v0.b.m0> */
    /* JADX WARN: Multi-variable type inference failed */
    public x(w wVar, c cVar, a.a.a.a.v0.e.x0.a aVar, l<? super a, ? extends m0> lVar) {
        if (wVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (aVar == null) {
            i.a("metadataVersion");
            throw null;
        } else if (lVar != 0) {
            this.b = cVar;
            this.f1777c = aVar;
            this.f1778d = lVar;
            List<f> list = wVar.i;
            i.a((Object) list, "proto.class_List");
            int e2 = g.e(g.a((Iterable) list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
            for (T t : list) {
                T t2 = t;
                c cVar2 = this.b;
                i.a((Object) t2, "klass");
                linkedHashMap.put(g.a(cVar2, t2.f1021g), t);
            }
            this.f1776a = linkedHashMap;
        } else {
            i.a("classSource");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.g
    public f a(a aVar) {
        if (aVar != null) {
            f fVar = this.f1776a.get(aVar);
            if (fVar != null) {
                return new f(this.b, fVar, this.f1777c, this.f1778d.a(aVar));
            }
            return null;
        }
        i.a("classId");
        throw null;
    }
}

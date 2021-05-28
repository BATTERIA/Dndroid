package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.f.d;
import a.n;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.Map;

public final class c extends j implements l<b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l0 f681c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(l0 l0Var) {
        super(1);
        this.f681c = l0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        if (bVar != null) {
            d dVar = d.f689f;
            Map<String, d> map = d.f686c;
            String a2 = g.a((a) this.f681c);
            if (map != null) {
                return Boolean.valueOf(map.containsKey(a2));
            }
            throw new n("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        i.a("it");
        throw null;
    }
}

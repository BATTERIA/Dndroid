package a.a.a.a.v0.a;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.t.f;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet<a> f187a;
    public static final c b = null;

    static {
        Set<i> set = i.o;
        i.a((Object) set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(g.a(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(g.c((i) it.next()));
        }
        List a2 = f.a((Collection) f.a((Collection) f.a((Collection) arrayList, (Object) g.k.f202f.g()), (Object) g.k.f204h.g()), (Object) g.k.q.g());
        LinkedHashSet<a> linkedHashSet = new LinkedHashSet<>();
        Iterator it2 = ((ArrayList) a2).iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(a.a((b) it2.next()));
        }
        f187a = linkedHashSet;
    }

    public static final boolean a(e eVar) {
        a aVar = null;
        if (eVar != null) {
            if (a.a.a.a.v0.j.g.k(eVar)) {
                LinkedHashSet<a> linkedHashSet = f187a;
                a a2 = a.a.a.a.v0.j.u.a.a((h) eVar);
                if (a2 != null) {
                    aVar = a2.c();
                }
                if (f.a((Iterable) linkedHashSet, (Object) aVar)) {
                    return true;
                }
            }
            return false;
        }
        i.a("classDescriptor");
        throw null;
    }
}

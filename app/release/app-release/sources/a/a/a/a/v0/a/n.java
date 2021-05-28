package a.a.a.a.v0.a;

import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.t.f;
import a.w.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<d> f229a;
    public static final HashMap<a, a> b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<a, a> f230c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final Set<d> f231d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f232e = new n();

    static {
        m[] values = m.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (m mVar : values) {
            arrayList.add(mVar.f226c);
        }
        f229a = f.k(arrayList);
        m[] values2 = m.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (m mVar2 : values2) {
            linkedHashSet.add(mVar2.f227d.f());
        }
        f231d = linkedHashSet;
        m[] values3 = m.values();
        for (m mVar3 : values3) {
            b.put(mVar3.f227d, mVar3.f228e);
            f230c.put(mVar3.f228e, mVar3.f227d);
        }
    }

    public final boolean a(d0 d0Var) {
        h c2;
        if (d0Var == null) {
            i.a("type");
            throw null;
        } else if (c1.g(d0Var) || (c2 = d0Var.I0().c()) == null) {
            return false;
        } else {
            i.a((Object) c2, "type.constructor.declara…escriptor ?: return false");
            k b2 = c2.b();
            return (b2 instanceof y) && i.a(((y) b2).e(), g.f189f) && f229a.contains(c2.d());
        }
    }
}

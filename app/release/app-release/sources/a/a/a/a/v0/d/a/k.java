package a.a.a.a.v0.d.a;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.f.b;
import a.w.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<b, b> f804a = new HashMap<>();
    public static final k b;

    static {
        k kVar = new k();
        b = kVar;
        b bVar = g.k.R;
        i.a((Object) bVar, "FQ_NAMES.mutableList");
        kVar.a(bVar, kVar.a("java.util.ArrayList", "java.util.LinkedList"));
        b bVar2 = g.k.T;
        i.a((Object) bVar2, "FQ_NAMES.mutableSet");
        kVar.a(bVar2, kVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b bVar3 = g.k.U;
        i.a((Object) bVar3, "FQ_NAMES.mutableMap");
        kVar.a(bVar3, kVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        kVar.a(new b("java.util.function.Function"), kVar.a("java.util.function.UnaryOperator"));
        kVar.a(new b("java.util.function.BiFunction"), kVar.a("java.util.function.BinaryOperator"));
    }

    public final List<b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new b(str));
        }
        return arrayList;
    }

    public final void a(b bVar, List<b> list) {
        HashMap<b, b> hashMap = f804a;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), bVar);
        }
    }
}

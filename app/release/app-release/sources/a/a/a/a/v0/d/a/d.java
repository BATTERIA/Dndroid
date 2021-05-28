package a.a.a.a.v0.d.a;

import a.a.a.a.v0.d.b.r;
import a.a.a.a.v0.j.v.c;
import a.j;
import a.t.f;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final u f685a;
    public static final Map<u, a.a.a.a.v0.f.d> b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, a.a.a.a.v0.f.d> f686c;

    /* renamed from: d  reason: collision with root package name */
    public static final List<a.a.a.a.v0.f.d> f687d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map<a.a.a.a.v0.f.d, List<a.a.a.a.v0.f.d>> f688e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f689f = new d();

    static {
        String a2 = c.INT.a();
        i.a((Object) a2, "JvmPrimitiveType.INT.desc");
        f685a = g.a("java/util/List", "removeAt", a2, "Ljava/lang/Object;");
        r rVar = r.f921a;
        String b2 = rVar.b("Number");
        String a3 = c.BYTE.a();
        i.a((Object) a3, "JvmPrimitiveType.BYTE.desc");
        String b3 = rVar.b("Number");
        String a4 = c.SHORT.a();
        i.a((Object) a4, "JvmPrimitiveType.SHORT.desc");
        String b4 = rVar.b("Number");
        String a5 = c.INT.a();
        i.a((Object) a5, "JvmPrimitiveType.INT.desc");
        String b5 = rVar.b("Number");
        String a6 = c.LONG.a();
        i.a((Object) a6, "JvmPrimitiveType.LONG.desc");
        String b6 = rVar.b("Number");
        String a7 = c.FLOAT.a();
        i.a((Object) a7, "JvmPrimitiveType.FLOAT.desc");
        String b7 = rVar.b("Number");
        String a8 = c.DOUBLE.a();
        i.a((Object) a8, "JvmPrimitiveType.DOUBLE.desc");
        String b8 = rVar.b("CharSequence");
        String a9 = c.INT.a();
        i.a((Object) a9, "JvmPrimitiveType.INT.desc");
        String a10 = c.CHAR.a();
        i.a((Object) a10, "JvmPrimitiveType.CHAR.desc");
        Map<u, a.a.a.a.v0.f.d> a11 = f.a(new j(g.a(b2, "toByte", "", a3), a.a.a.a.v0.f.d.b("byteValue")), new j(g.a(b3, "toShort", "", a4), a.a.a.a.v0.f.d.b("shortValue")), new j(g.a(b4, "toInt", "", a5), a.a.a.a.v0.f.d.b("intValue")), new j(g.a(b5, "toLong", "", a6), a.a.a.a.v0.f.d.b("longValue")), new j(g.a(b6, "toFloat", "", a7), a.a.a.a.v0.f.d.b("floatValue")), new j(g.a(b7, "toDouble", "", a8), a.a.a.a.v0.f.d.b("doubleValue")), new j(f685a, a.a.a.a.v0.f.d.b("remove")), new j(g.a(b8, "get", a9, a10), a.a.a.a.v0.f.d.b("charAt")));
        b = a11;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(a11.size()));
        for (T t : a11.entrySet()) {
            linkedHashMap.put(((u) t.getKey()).b, t.getValue());
        }
        f686c = linkedHashMap;
        Set<u> keySet = b.keySet();
        ArrayList arrayList = new ArrayList(g.a(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f825a);
        }
        f687d = arrayList;
        Set<Map.Entry<u, a.a.a.a.v0.f.d>> entrySet = b.entrySet();
        ArrayList<j> arrayList2 = new ArrayList(g.a(entrySet, 10));
        for (T t2 : entrySet) {
            arrayList2.add(new j(((u) t2.getKey()).f825a, t2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (j jVar : arrayList2) {
            B b9 = jVar.f2089d;
            Object obj = linkedHashMap2.get(b9);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(b9, obj);
            }
            ((List) obj).add(jVar.f2088c);
        }
        f688e = linkedHashMap2;
    }
}

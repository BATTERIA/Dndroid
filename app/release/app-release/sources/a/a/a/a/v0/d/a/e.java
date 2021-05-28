package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.s;
import a.a.a.a.v0.d.b.r;
import a.w.b.l;
import a.w.c.f;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final List<u> f779a;
    public static final List<String> b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<u, b> f780c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, b> f781d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<a.a.a.a.v0.f.d> f782e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<String> f783f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f784g = new e();

    public enum a {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        /* access modifiers changed from: public */
        a(String str, boolean z) {
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class b extends Enum<b> {

        /* renamed from: d  reason: collision with root package name */
        public static final b f789d;

        /* renamed from: e  reason: collision with root package name */
        public static final b f790e;

        /* renamed from: f  reason: collision with root package name */
        public static final b f791f;

        /* renamed from: g  reason: collision with root package name */
        public static final b f792g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ b[] f793h;

        /* renamed from: c  reason: collision with root package name */
        public final Object f794c;

        public static final class a extends b {
            /* JADX WARN: Incorrect args count in method signature: ()V */
            public a(String str, int i) {
                super(str, i, null, null);
            }
        }

        static {
            b bVar = new b("NULL", 0, null);
            f789d = bVar;
            b bVar2 = new b("INDEX", 1, -1);
            f790e = bVar2;
            b bVar3 = new b("FALSE", 2, false);
            f791f = bVar3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3);
            f792g = aVar;
            f793h = new b[]{bVar, bVar2, bVar3, aVar};
        }

        public b(String str, int i, Object obj) {
            this.f794c = obj;
        }

        public /* synthetic */ b(String str, int i, Object obj, f fVar) {
            this.f794c = obj;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f793h.clone();
        }
    }

    public static final class c extends j implements l<a.a.a.a.v0.b.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f795c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Boolean a(a.a.a.a.v0.b.b bVar) {
            a.a.a.a.v0.b.b bVar2 = bVar;
            if (bVar2 != null) {
                e eVar = e.f784g;
                return Boolean.valueOf(a.t.f.a((Iterable) e.f783f, (Object) g.a((a.a.a.a.v0.b.a) bVar2)));
            }
            i.a("it");
            throw null;
        }
    }

    public static final class d extends j implements l<a.a.a.a.v0.b.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f796c = new d();

        public d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Boolean a(a.a.a.a.v0.b.b bVar) {
            boolean z;
            a.a.a.a.v0.b.b bVar2 = bVar;
            if (bVar2 != null) {
                if (bVar2 instanceof s) {
                    e eVar = e.f784g;
                    if (a.t.f.a((Iterable) e.f783f, (Object) g.a((a.a.a.a.v0.b.a) bVar2))) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
            i.a("it");
            throw null;
        }
    }

    static {
        Set<String> i = g.i("containsAll", "removeAll", "retainAll");
        ArrayList<u> arrayList = new ArrayList(g.a(i, 10));
        for (String str : i) {
            String a2 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
            i.a((Object) a2, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(g.a("java/util/Collection", str, "Ljava/util/Collection;", a2));
        }
        f779a = arrayList;
        ArrayList arrayList2 = new ArrayList(g.a((Iterable) arrayList, 10));
        for (u uVar : arrayList) {
            arrayList2.add(uVar.b);
        }
        b = arrayList2;
        List<u> list = f779a;
        ArrayList arrayList3 = new ArrayList(g.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next().f825a.a());
        }
        r rVar = r.f921a;
        String c2 = rVar.c("Collection");
        String a3 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
        i.a((Object) a3, "JvmPrimitiveType.BOOLEAN.desc");
        String c3 = rVar.c("Collection");
        String a4 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
        i.a((Object) a4, "JvmPrimitiveType.BOOLEAN.desc");
        String c4 = rVar.c("Map");
        String a5 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
        i.a((Object) a5, "JvmPrimitiveType.BOOLEAN.desc");
        String c5 = rVar.c("Map");
        String a6 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
        i.a((Object) a6, "JvmPrimitiveType.BOOLEAN.desc");
        String c6 = rVar.c("Map");
        String a7 = a.a.a.a.v0.j.v.c.BOOLEAN.a();
        i.a((Object) a7, "JvmPrimitiveType.BOOLEAN.desc");
        String c7 = rVar.c("List");
        String a8 = a.a.a.a.v0.j.v.c.INT.a();
        i.a((Object) a8, "JvmPrimitiveType.INT.desc");
        String c8 = rVar.c("List");
        String a9 = a.a.a.a.v0.j.v.c.INT.a();
        i.a((Object) a9, "JvmPrimitiveType.INT.desc");
        Map<u, b> a10 = a.t.f.a(new a.j(g.a(c2, "contains", "Ljava/lang/Object;", a3), b.f791f), new a.j(g.a(c3, "remove", "Ljava/lang/Object;", a4), b.f791f), new a.j(g.a(c4, "containsKey", "Ljava/lang/Object;", a5), b.f791f), new a.j(g.a(c5, "containsValue", "Ljava/lang/Object;", a6), b.f791f), new a.j(g.a(c6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", a7), b.f791f), new a.j(g.a(rVar.c("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), b.f792g), new a.j(g.a(rVar.c("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), b.f789d), new a.j(g.a(rVar.c("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), b.f789d), new a.j(g.a(c7, "indexOf", "Ljava/lang/Object;", a8), b.f790e), new a.j(g.a(c8, "lastIndexOf", "Ljava/lang/Object;", a9), b.f790e));
        f780c = a10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(a10.size()));
        for (T t : a10.entrySet()) {
            linkedHashMap.put(((u) t.getKey()).b, t.getValue());
        }
        f781d = linkedHashMap;
        Set<u> a11 = g.a((Set) f780c.keySet(), (Iterable) f779a);
        ArrayList arrayList4 = new ArrayList(g.a(a11, 10));
        for (u uVar2 : a11) {
            arrayList4.add(uVar2.f825a);
        }
        f782e = a.t.f.k(arrayList4);
        ArrayList arrayList5 = new ArrayList(g.a(a11, 10));
        for (u uVar3 : a11) {
            arrayList5.add(uVar3.b);
        }
        f783f = a.t.f.k(arrayList5);
    }

    public static final s a(s sVar) {
        if (sVar != null) {
            e eVar = f784g;
            a.a.a.a.v0.f.d d2 = sVar.d();
            i.a((Object) d2, "functionDescriptor.name");
            if (!eVar.a(d2)) {
                return null;
            }
            return (s) a.a.a.a.v0.j.u.a.a(sVar, false, c.f795c, 1);
        }
        i.a("functionDescriptor");
        throw null;
    }

    public final boolean a(a.a.a.a.v0.f.d dVar) {
        if (dVar != null) {
            return f782e.contains(dVar);
        }
        i.a("$this$sameAsBuiltinMethodWithErasedValueParameters");
        throw null;
    }

    public static final a a(a.a.a.a.v0.b.b bVar) {
        a.a.a.a.v0.b.b a2;
        String a3;
        Object obj;
        if (bVar == null) {
            i.a("$this$getSpecialSignatureInfo");
            throw null;
        } else if (!f782e.contains(bVar.d()) || (a2 = a.a.a.a.v0.j.u.a.a(bVar, false, d.f796c, 1)) == null || (a3 = g.a((a.a.a.a.v0.b.a) a2)) == null) {
            return null;
        } else {
            if (b.contains(a3)) {
                return a.ONE_COLLECTION_PARAMETER;
            }
            Map<String, b> map = f781d;
            if (map != null) {
                if (map instanceof a.t.s) {
                    obj = ((a.t.s) map).a(a3);
                } else {
                    b bVar2 = map.get(a3);
                    if (bVar2 != null || map.containsKey(a3)) {
                        obj = bVar2;
                    } else {
                        throw new NoSuchElementException("Key " + ((Object) a3) + " is missing in the map.");
                    }
                }
                return ((b) obj) == b.f789d ? a.OBJECT_PARAMETER_GENERIC : a.OBJECT_PARAMETER_NON_GENERIC;
            }
            i.a("$this$getValue");
            throw null;
        }
    }
}

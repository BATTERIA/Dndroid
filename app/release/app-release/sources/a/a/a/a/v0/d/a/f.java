package a.a.a.a.v0.d.a;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.c;
import a.a.a.a.v0.f.d;
import a.s;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<b, d> f797a;
    public static final Map<d, List<d>> b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<b> f798c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<d> f799d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f800e = new f();

    public static final class a extends j implements l<a.a.a.a.v0.b.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f801c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Boolean a(a.a.a.a.v0.b.b bVar) {
            a.a.a.a.v0.b.b bVar2 = bVar;
            if (bVar2 != null) {
                return Boolean.valueOf(f.f800e.b(bVar2));
            }
            i.a("it");
            throw null;
        }
    }

    static {
        c cVar = g.k.q;
        i.a((Object) cVar, "BUILTIN_NAMES._enum");
        c cVar2 = g.k.q;
        i.a((Object) cVar2, "BUILTIN_NAMES._enum");
        b bVar = g.k.I;
        i.a((Object) bVar, "BUILTIN_NAMES.collection");
        b bVar2 = g.k.M;
        i.a((Object) bVar2, "BUILTIN_NAMES.map");
        c cVar3 = g.k.f201e;
        i.a((Object) cVar3, "BUILTIN_NAMES.charSequence");
        b bVar3 = g.k.M;
        i.a((Object) bVar3, "BUILTIN_NAMES.map");
        b bVar4 = g.k.M;
        i.a((Object) bVar4, "BUILTIN_NAMES.map");
        b bVar5 = g.k.M;
        i.a((Object) bVar5, "BUILTIN_NAMES.map");
        Map<b, d> a2 = a.t.f.a(new a.j(e.f.a.g.a(cVar, "name"), d.b("name")), new a.j(e.f.a.g.a(cVar2, "ordinal"), d.b("ordinal")), new a.j(e.f.a.g.a(bVar, "size"), d.b("size")), new a.j(e.f.a.g.a(bVar2, "size"), d.b("size")), new a.j(e.f.a.g.a(cVar3, "length"), d.b("length")), new a.j(e.f.a.g.a(bVar3, "keys"), d.b("keySet")), new a.j(e.f.a.g.a(bVar4, "values"), d.b("values")), new a.j(e.f.a.g.a(bVar5, "entries"), d.b("entrySet")));
        f797a = a2;
        Set<Map.Entry<b, d>> entrySet = a2.entrySet();
        ArrayList<a.j> arrayList = new ArrayList(e.f.a.g.a(entrySet, 10));
        for (T t : entrySet) {
            arrayList.add(new a.j(((b) t.getKey()).d(), t.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a.j jVar : arrayList) {
            B b2 = jVar.f2089d;
            Object obj = linkedHashMap.get(b2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b2, obj);
            }
            ((List) obj).add(jVar.f2088c);
        }
        b = linkedHashMap;
        Set<b> keySet = f797a.keySet();
        f798c = keySet;
        ArrayList arrayList2 = new ArrayList(e.f.a.g.a(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().d());
        }
        f799d = a.t.f.k(arrayList2);
    }

    public final String a(a.a.a.a.v0.b.b bVar) {
        d dVar;
        if (bVar != null) {
            boolean c2 = g.c(bVar);
            if (!s.f2103a || c2) {
                a.a.a.a.v0.b.b a2 = a.a.a.a.v0.j.u.a.a(a.a.a.a.v0.j.u.a.a(bVar), false, a.f801c, 1);
                if (a2 == null || (dVar = f797a.get(a.a.a.a.v0.j.u.a.c(a2))) == null) {
                    return null;
                }
                return dVar.a();
            }
            throw new AssertionError("This method is defined only for builtin members, but " + bVar + " found");
        }
        i.a("$this$getBuiltinSpecialPropertyGetterName");
        throw null;
    }

    public final boolean b(a.a.a.a.v0.b.b bVar) {
        if (bVar == null) {
            i.a("callableMemberDescriptor");
            throw null;
        } else if (!f799d.contains(bVar.d())) {
            return false;
        } else {
            if (a.t.f.a((Iterable) f798c, (Object) a.a.a.a.v0.j.u.a.a((k) bVar)) && bVar.j().isEmpty()) {
                return true;
            }
            if (!g.c(bVar)) {
                return false;
            }
            Collection<? extends a.a.a.a.v0.b.b> f2 = bVar.f();
            i.a((Object) f2, "overriddenDescriptors");
            if (f2.isEmpty()) {
                return false;
            }
            for (T t : f2) {
                f fVar = f800e;
                i.a((Object) t, "it");
                if (fVar.b(t)) {
                    return true;
                }
            }
            return false;
        }
    }
}

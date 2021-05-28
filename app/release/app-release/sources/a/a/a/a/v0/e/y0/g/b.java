package a.a.a.a.v0.e.y0.g;

import a.q;
import a.w.b.p;
import a.w.c.i;
import a.w.c.j;
import a.y.c;
import e.f.a.g;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f1320a;

    public static final class a extends j implements p<String, String, q> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Map f1321c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(2);
            this.f1321c = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // a.w.b.p
        public /* bridge */ /* synthetic */ q a(String str, String str2) {
            a(str, str2);
            return q.f2100a;
        }

        public final void a(String str, String str2) {
            if (str == null) {
                i.a("kotlinSimpleName");
                throw null;
            } else if (str2 != null) {
                Map map = this.f1321c;
                String b = e.a.a.a.a.b("kotlin/", str);
                map.put(b, 'L' + str2 + ';');
            } else {
                i.a("javaInternalName");
                throw null;
            }
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List g2 = g.g("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        c a2 = g.a((Collection<?>) g2);
        int i = 2;
        if (2 != null) {
            int i2 = a2.f2152c;
            int i3 = a2.f2153d;
            if (a2.f2154e <= 0) {
                i = -2;
            }
            a.y.a aVar = new a.y.a(i2, i3, i);
            int i4 = aVar.f2152c;
            int i5 = aVar.f2153d;
            int i6 = aVar.f2154e;
            if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                while (true) {
                    StringBuilder a3 = e.a.a.a.a.a("kotlin/");
                    a3.append((String) g2.get(i4));
                    int i7 = i4 + 1;
                    linkedHashMap.put(a3.toString(), g2.get(i7));
                    StringBuilder sb = new StringBuilder();
                    sb.append("kotlin/");
                    linkedHashMap.put(e.a.a.a.a.a(sb, (String) g2.get(i4), "Array"), '[' + ((String) g2.get(i7)));
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            linkedHashMap.put("kotlin/Unit", "V");
            a aVar2 = new a(linkedHashMap);
            aVar2.a("Any", "java/lang/Object");
            aVar2.a("Nothing", "java/lang/Void");
            aVar2.a("Annotation", "java/lang/annotation/Annotation");
            for (String str : g.g("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
                aVar2.a(str, "java/lang/" + str);
            }
            for (String str2 : g.g("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
                aVar2.a(e.a.a.a.a.b("collections/", str2), "java/util/" + str2);
                aVar2.a("collections/Mutable" + str2, "java/util/" + str2);
            }
            aVar2.a("collections/Iterable", "java/lang/Iterable");
            aVar2.a("collections/MutableIterable", "java/lang/Iterable");
            aVar2.a("collections/Map.Entry", "java/util/Map$Entry");
            aVar2.a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
            for (int i8 = 0; i8 <= 22; i8++) {
                aVar2.a(e.a.a.a.a.a("Function", i8), "kotlin/jvm/functions/Function" + i8);
                aVar2.a("reflect/KFunction" + i8, "kotlin/reflect/KFunction");
            }
            for (String str3 : g.g("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
                aVar2.a(e.a.a.a.a.b(str3, ".Companion"), "kotlin/jvm/internal/" + str3 + "CompanionObject");
            }
            f1320a = linkedHashMap;
            return;
        }
        i.a("step");
        throw null;
    }

    public static final String a(String str) {
        if (str != null) {
            String str2 = f1320a.get(str);
            if (str2 != null) {
                return str2;
            }
            return 'L' + a.a.a.a.v0.m.l1.a.a(str, '.', '$', false, 4) + ';';
        }
        i.a("classId");
        throw null;
    }
}

package a.a.a.a.v0.e.y0.g;

import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.h.d;
import a.t.f;
import a.t.n;
import a.t.o;
import a.t.p;
import a.t.q;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class g implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f1328e;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f1329a;
    public final List<a.e.c> b;

    /* renamed from: c  reason: collision with root package name */
    public final a.e f1330c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f1331d;

    static {
        List<String> g2 = e.f.a.g.g("kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator");
        f1328e = g2;
        Iterable l = f.l(g2);
        int e2 = e.f.a.g.e(e.f.a.g.a(l, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it = ((p) l).iterator();
        while (true) {
            q qVar = (q) it;
            if (qVar.hasNext()) {
                o oVar = (o) qVar.next();
                linkedHashMap.put(oVar.b, Integer.valueOf(oVar.f2122a));
            } else {
                return;
            }
        }
    }

    public g(a.e eVar, String[] strArr) {
        Set<Integer> set;
        if (eVar == null) {
            i.a("types");
            throw null;
        } else if (strArr != null) {
            this.f1330c = eVar;
            this.f1331d = strArr;
            List<Integer> list = eVar.f1297e;
            if (list.isEmpty()) {
                set = n.f2121c;
            } else {
                set = f.k(list);
            }
            this.f1329a = set;
            ArrayList arrayList = new ArrayList();
            List<a.e.c> list2 = this.f1330c.f1296d;
            arrayList.ensureCapacity(list2.size());
            for (a.e.c cVar : list2) {
                i.a((Object) cVar, "record");
                int i = cVar.f1306e;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(cVar);
                }
            }
            arrayList.trimToSize();
            this.b = arrayList;
        } else {
            i.a("strings");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.e.x0.c
    public String a(int i) {
        String str;
        a.e.c cVar = this.b.get(i);
        if ((cVar.f1305d & 4) == 4) {
            Object obj = cVar.f1308g;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                d dVar = (d) obj;
                String h2 = dVar.h();
                if (dVar.d()) {
                    cVar.f1308g = h2;
                }
                str = h2;
            }
        } else {
            if ((cVar.f1305d & 2) == 2) {
                int size = f1328e.size();
                int i2 = cVar.f1307f;
                if (i2 >= 0 && size > i2) {
                    str = f1328e.get(i2);
                }
            }
            str = this.f1331d[i];
        }
        if (cVar.i.size() >= 2) {
            List<Integer> list = cVar.i;
            Integer num = list.get(0);
            Integer num2 = list.get(1);
            i.a((Object) num, "begin");
            if (i.a(0, num.intValue()) <= 0) {
                int intValue = num.intValue();
                i.a((Object) num2, "end");
                if (i.a(intValue, num2.intValue()) <= 0 && i.a(num2.intValue(), str.length()) <= 0) {
                    i.a((Object) str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    i.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        if (cVar.k.size() >= 2) {
            List<Integer> list2 = cVar.k;
            i.a((Object) str, "string");
            str = a.a.a.a.v0.m.l1.a.a(str, (char) list2.get(0).intValue(), (char) list2.get(1).intValue(), false, 4);
        }
        a.e.c.EnumC0054c cVar2 = cVar.f1309h;
        if (cVar2 == null) {
            cVar2 = a.e.c.EnumC0054c.NONE;
        }
        int ordinal = cVar2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (str.length() >= 2) {
                    i.a((Object) str, "string");
                    str = str.substring(1, str.length() - 1);
                    i.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
            i.a((Object) str, "string");
            return str;
        }
        i.a((Object) str, "string");
        str = a.a.a.a.v0.m.l1.a.a(str, '$', '.', false, 4);
        i.a((Object) str, "string");
        return str;
    }

    @Override // a.a.a.a.v0.e.x0.c
    public boolean b(int i) {
        return this.f1329a.contains(Integer.valueOf(i));
    }

    @Override // a.a.a.a.v0.e.x0.c
    public String c(int i) {
        return a(i);
    }
}

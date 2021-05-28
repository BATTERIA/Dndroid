package a.a.a.a.v0.j.w;

import a.n;
import a.w.b.l;
import a.w.c.f;
import a.w.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static int f1612c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f1613d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f1614e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f1615f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f1616g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f1617h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final d n;
    public static final d o = new d(m, null, 2);
    public static final d p = new d(k, null, 2);
    public static final d q = new d(f1617h, null, 2);
    public static final d r = new d(i, null, 2);
    public static final List<a.C0064a> s;
    public static final List<a.C0064a> t;
    public static final a u = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f1618a;
    public final List<c> b;

    public static final class a {

        /* renamed from: a.a.a.a.v0.j.w.d$a$a  reason: collision with other inner class name */
        public static final class C0064a {

            /* renamed from: a  reason: collision with root package name */
            public final int f1619a;
            public final String b;

            public C0064a(int i, String str) {
                if (str != null) {
                    this.f1619a = i;
                    this.b = str;
                    return;
                }
                i.a("name");
                throw null;
            }
        }

        public /* synthetic */ a(f fVar) {
        }
    }

    static {
        a.C0064a aVar;
        a.C0064a aVar2;
        int i2 = f1612c;
        int i3 = i2 << 1;
        f1612c = i3;
        f1613d = i2;
        int i4 = i3 << 1;
        f1612c = i4;
        f1614e = i3;
        int i5 = i4 << 1;
        f1612c = i5;
        f1615f = i4;
        int i6 = i5 << 1;
        f1612c = i6;
        f1616g = i5;
        int i7 = i6 << 1;
        f1612c = i7;
        f1617h = i6;
        int i8 = i7 << 1;
        f1612c = i8;
        i = i7;
        f1612c = i8 << 1;
        int i9 = i8 - 1;
        j = i9;
        k = i2 | i3 | i4;
        l = i3 | i6 | i7;
        m = i6 | i7;
        n = new d(i9, null, 2);
        new d(f1613d, null, 2);
        new d(f1614e, null, 2);
        new d(f1615f, null, 2);
        new d(f1616g, null, 2);
        new d(l, null, 2);
        Field[] fields = d.class.getFields();
        i.a((Object) fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            i.a((Object) field, "it");
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (!(obj instanceof d)) {
                obj = null;
            }
            d dVar = (d) obj;
            if (dVar != null) {
                int i10 = dVar.f1618a;
                i.a((Object) field2, "field");
                String name = field2.getName();
                i.a((Object) name, "field.name");
                aVar2 = new a.C0064a(i10, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        s = a.t.f.g(arrayList2);
        Field[] fields2 = d.class.getFields();
        i.a((Object) fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            i.a((Object) field3, "it");
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Field field4 = (Field) next;
            i.a((Object) field4, "it");
            if (i.a(field4.getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field5 = (Field) it3.next();
            Object obj2 = field5.get(null);
            if (obj2 != null) {
                int intValue = ((Integer) obj2).intValue();
                if (intValue == ((-intValue) & intValue)) {
                    i.a((Object) field5, "field");
                    String name2 = field5.getName();
                    i.a((Object) name2, "field.name");
                    aVar = new a.C0064a(intValue, name2);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList5.add(aVar);
                }
            } else {
                throw new n("null cannot be cast to non-null type kotlin.Int");
            }
        }
        t = a.t.f.g(arrayList5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends a.a.a.a.v0.j.w.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i2, List<? extends c> list) {
        if (list != 0) {
            this.b = list;
            for (c cVar : list) {
                i2 &= cVar.a() ^ -1;
            }
            this.f1618a = i2;
            return;
        }
        i.a("excludes");
        throw null;
    }

    public final boolean a(int i2) {
        return (i2 & this.f1618a) != 0;
    }

    public String toString() {
        T t2;
        boolean z;
        Iterator<T> it = s.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2.f1619a == this.f1618a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t3 = t2;
        String str = t3 != null ? t3.b : null;
        if (str == null) {
            List<a.C0064a> list = t;
            ArrayList arrayList = new ArrayList();
            for (T t4 : list) {
                String str2 = a(t4.f1619a) ? t4.b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = a.t.f.a(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        }
        return "DescriptorKindFilter(" + str + ", " + this.b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, List list, int i3) {
        this(i2, (i3 & 2) != 0 ? a.t.l.f2119c : list);
    }
}

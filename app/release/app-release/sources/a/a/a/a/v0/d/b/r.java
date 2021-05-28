package a.a.a.a.v0.d.b;

import a.a.a.a.v0.a.p.c;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.j.v.b;
import a.n;
import a.w.c.i;
import e.a.a.a.a;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f921a = new r();

    public final String[] a(String... strArr) {
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add("<init>(" + str + ")V");
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
        }
        i.a("signatures");
        throw null;
    }

    public final LinkedHashSet<String> b(String str, String... strArr) {
        if (str == null) {
            i.a("name");
            throw null;
        } else if (strArr != null) {
            return a(b(str), (String[]) Arrays.copyOf(strArr, strArr.length));
        } else {
            i.a("signatures");
            throw null;
        }
    }

    public final LinkedHashSet<String> c(String str, String... strArr) {
        if (str == null) {
            i.a("name");
            throw null;
        } else if (strArr != null) {
            return a(c(str), (String[]) Arrays.copyOf(strArr, strArr.length));
        } else {
            i.a("signatures");
            throw null;
        }
    }

    public final LinkedHashSet<String> a(String str, String... strArr) {
        if (str == null) {
            i.a("internalName");
            throw null;
        } else if (strArr != null) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            for (String str2 : strArr) {
                linkedHashSet.add(str + '.' + str2);
            }
            return linkedHashSet;
        } else {
            i.a("signatures");
            throw null;
        }
    }

    public final String b(String str) {
        if (str != null) {
            return a.b("java/lang/", str);
        }
        i.a("name");
        throw null;
    }

    public final String c(String str) {
        if (str != null) {
            return a.b("java/util/", str);
        }
        i.a("name");
        throw null;
    }

    public final String a(String str) {
        if (str != null) {
            return a.b("java/util/function/", str);
        }
        i.a("name");
        throw null;
    }

    public final String a(String str, String str2) {
        if (str == null) {
            i.a("internalName");
            throw null;
        } else if (str2 != null) {
            return str + '.' + str2;
        } else {
            i.a("jvmDescriptor");
            throw null;
        }
    }

    public final String a(e eVar, String str) {
        String str2;
        if (eVar == null) {
            i.a("classDescriptor");
            throw null;
        } else if (str != null) {
            c cVar = c.m;
            a.a.a.a.v0.f.c f2 = a.a.a.a.v0.j.u.a.c(eVar).f();
            i.a((Object) f2, "fqNameSafe.toUnsafe()");
            a.a.a.a.v0.f.a a2 = cVar.a(f2);
            if (a2 != null) {
                b a3 = b.a(a2);
                i.a((Object) a3, "JvmClassName.byClassId(it)");
                str2 = a3.a();
                i.a((Object) str2, "JvmClassName.byClassId(it).internalName");
            } else {
                str2 = g.a(eVar, t.f922a);
            }
            return a(str2, str);
        } else {
            i.a("jvmDescriptor");
            throw null;
        }
    }
}

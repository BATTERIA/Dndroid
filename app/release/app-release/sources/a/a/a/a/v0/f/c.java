package a.a.a.a.v0.f;

import a.w.b.l;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: e */
    public static final d f1345e = d.d("<root>");

    /* renamed from: f */
    public static final Pattern f1346f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final l<String, d> f1347g = new a();

    /* renamed from: a */
    public final String f1348a;
    public transient b b;

    /* renamed from: c */
    public transient c f1349c;

    /* renamed from: d */
    public transient d f1350d;

    public static class a implements l<String, d> {
        @Override // a.w.b.l
        public d a(String str) {
            return d.a(str);
        }
    }

    public c(String str) {
        if (str != null) {
            this.f1348a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public c(String str, b bVar) {
        if (str == null) {
            a(0);
            throw null;
        } else if (bVar != null) {
            this.f1348a = str;
            this.b = bVar;
        } else {
            a(1);
            throw null;
        }
    }

    public c(String str, c cVar, d dVar) {
        if (str != null) {
            this.f1348a = str;
            this.f1349c = cVar;
            this.f1350d = dVar;
            return;
        }
        a(3);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public c a(d dVar) {
        String str;
        if (dVar != null) {
            if (c()) {
                str = dVar.a();
            } else {
                str = this.f1348a + "." + dVar.a();
            }
            return new c(str, this, dVar);
        }
        a(9);
        throw null;
    }

    public String a() {
        String str = this.f1348a;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    public final void b() {
        int lastIndexOf = this.f1348a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f1350d = d.a(this.f1348a.substring(lastIndexOf + 1));
            this.f1349c = new c(this.f1348a.substring(0, lastIndexOf));
            return;
        }
        this.f1350d = d.a(this.f1348a);
        this.f1349c = b.f1343c.f();
    }

    public boolean c() {
        return this.f1348a.isEmpty();
    }

    public boolean d() {
        return this.b != null || a().indexOf(60) < 0;
    }

    public List<d> e() {
        List<d> list;
        if (c()) {
            list = Collections.emptyList();
        } else {
            String[] split = f1346f.split(this.f1348a);
            l<String, d> lVar = f1347g;
            if (split == null) {
                i.a("$this$map");
                throw null;
            } else if (lVar != null) {
                ArrayList arrayList = new ArrayList(split.length);
                for (String str : split) {
                    arrayList.add(lVar.a(str));
                }
                list = arrayList;
            } else {
                i.a("transform");
                throw null;
            }
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f1348a.equals(((c) obj).f1348a);
    }

    public d f() {
        d dVar = this.f1350d;
        if (dVar != null) {
            if (dVar != null) {
                return dVar;
            }
            a(10);
            throw null;
        } else if (!c()) {
            b();
            d dVar2 = this.f1350d;
            if (dVar2 != null) {
                return dVar2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public b g() {
        b bVar = this.b;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            a(6);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            a(5);
            throw null;
        }
    }

    public int hashCode() {
        return this.f1348a.hashCode();
    }

    public String toString() {
        String a2 = c() ? f1345e.a() : this.f1348a;
        if (a2 != null) {
            return a2;
        }
        a(17);
        throw null;
    }
}

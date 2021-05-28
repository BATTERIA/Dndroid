package a.a.a.a.v0.j.v;

import a.a.a.a.v0.f.a;

public class b {

    /* renamed from: a */
    public final String f1602a;

    public b(String str) {
        if (str != null) {
            this.f1602a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static b a(a aVar) {
        if (aVar != null) {
            a.a.a.a.v0.f.b d2 = aVar.d();
            String replace = aVar.e().a().replace('.', '$');
            if (d2.b()) {
                return new b(replace);
            }
            return new b(d2.a().replace('.', '/') + "/" + replace);
        }
        a(1);
        throw null;
    }

    public static b a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return new b(bVar.a().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b a(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public String a() {
        String str = this.f1602a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f1602a.equals(((b) obj).f1602a);
    }

    public int hashCode() {
        return this.f1602a.hashCode();
    }

    public String toString() {
        return this.f1602a;
    }
}

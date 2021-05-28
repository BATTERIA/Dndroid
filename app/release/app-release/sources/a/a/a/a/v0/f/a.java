package a.a.a.a.v0.f;

import a.a0.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f1341a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1342c;

    public a(b bVar, b bVar2, boolean z) {
        if (bVar == null) {
            a(1);
            throw null;
        } else if (bVar2 != null) {
            this.f1341a = bVar;
            this.b = bVar2;
            this.f1342c = z;
        } else {
            a(2);
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar) {
        this(bVar, b.c(dVar), false);
        if (bVar == null) {
            a(3);
            throw null;
        } else if (dVar != null) {
        } else {
            a(4);
            throw null;
        }
    }

    public static a a(b bVar) {
        if (bVar != null) {
            return new a(bVar.c(), bVar.d());
        }
        a(0);
        throw null;
    }

    public static a a(String str) {
        if (str != null) {
            return a(str, false);
        }
        a(11);
        throw null;
    }

    public static a a(String str, boolean z) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        } else if (str != null) {
            int b2 = i.b((CharSequence) str, '/', 0, false, 6);
            if (b2 == -1) {
                str2 = "";
            } else {
                str2 = str.substring(0, b2);
                a.w.c.i.a((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            return new a(new b(str2.replace('/', '.')), new b(i.a(str, '/', str)), z);
        } else {
            a.w.c.i.a("$this$substringBeforeLast");
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public a a(d dVar) {
        if (dVar != null) {
            return new a(d(), this.b.a(dVar), this.f1342c);
        }
        a(8);
        throw null;
    }

    public b a() {
        if (this.f1341a.b()) {
            b bVar = this.b;
            if (bVar != null) {
                return bVar;
            }
            a(9);
            throw null;
        }
        return new b(this.f1341a.a() + "." + this.b.a());
    }

    public String b() {
        if (this.f1341a.b()) {
            String a2 = this.b.a();
            if (a2 != null) {
                return a2;
            }
            a(13);
            throw null;
        }
        String str = this.f1341a.a().replace('.', '/') + "/" + this.b.a();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public a c() {
        b c2 = this.b.c();
        if (c2.b()) {
            return null;
        }
        return new a(d(), c2, this.f1342c);
    }

    public b d() {
        b bVar = this.f1341a;
        if (bVar != null) {
            return bVar;
        }
        a(5);
        throw null;
    }

    public b e() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        a(6);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1341a.equals(aVar.f1341a) && this.b.equals(aVar.b) && this.f1342c == aVar.f1342c;
    }

    public d f() {
        d d2 = this.b.d();
        if (d2 != null) {
            return d2;
        }
        a(7);
        throw null;
    }

    public boolean g() {
        return !this.b.c().b();
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.valueOf(this.f1342c).hashCode() + ((hashCode + (this.f1341a.hashCode() * 31)) * 31);
    }

    public String toString() {
        if (!this.f1341a.b()) {
            return b();
        }
        StringBuilder a2 = e.a.a.a.a.a("/");
        a2.append(b());
        return a2.toString();
    }
}

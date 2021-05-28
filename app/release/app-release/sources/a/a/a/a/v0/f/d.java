package a.a.a.a.v0.f;

import e.a.a.a.a;

public final class d implements Comparable<d> {

    /* renamed from: c  reason: collision with root package name */
    public final String f1351c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1352d;

    public d(String str, boolean z) {
        if (str != null) {
            this.f1351c = str;
            this.f1352d = z;
            return;
        }
        a(0);
        throw null;
    }

    public static d a(String str) {
        if (str != null) {
            return str.startsWith("<") ? d(str) : b(str);
        }
        a(6);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static d b(String str) {
        if (str != null) {
            return new d(str, false);
        }
        a(3);
        throw null;
    }

    public static boolean c(String str) {
        if (str == null) {
            a(4);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    public static d d(String str) {
        if (str == null) {
            a(5);
            throw null;
        } else if (str.startsWith("<")) {
            return new d(str, true);
        } else {
            throw new IllegalArgumentException(a.b("special name must start with '<': ", str));
        }
    }

    public String a() {
        String str = this.f1351c;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public String b() {
        if (!this.f1352d) {
            String a2 = a();
            if (a2 != null) {
                return a2;
            }
            a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        return this.f1351c.compareTo(dVar.f1351c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1352d == dVar.f1352d && this.f1351c.equals(dVar.f1351c);
    }

    public int hashCode() {
        return (this.f1351c.hashCode() * 31) + (this.f1352d ? 1 : 0);
    }

    public String toString() {
        return this.f1351c;
    }
}

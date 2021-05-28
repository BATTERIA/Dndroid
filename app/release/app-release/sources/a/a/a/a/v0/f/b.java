package a.a.a.a.v0.f;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f1343c = new b("");

    /* renamed from: a  reason: collision with root package name */
    public final c f1344a;
    public transient b b;

    public b(c cVar) {
        if (cVar != null) {
            this.f1344a = cVar;
        } else {
            a(2);
            throw null;
        }
    }

    public b(c cVar, b bVar) {
        if (cVar != null) {
            this.f1344a = cVar;
            this.b = bVar;
            return;
        }
        a(3);
        throw null;
    }

    public b(String str) {
        if (str != null) {
            this.f1344a = new c(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public b a(d dVar) {
        if (dVar != null) {
            return new b(this.f1344a.a(dVar), this);
        }
        a(8);
        throw null;
    }

    public String a() {
        String a2 = this.f1344a.a();
        if (a2 != null) {
            return a2;
        }
        a(4);
        throw null;
    }

    public boolean b() {
        return this.f1344a.c();
    }

    public boolean b(d dVar) {
        if (dVar != null) {
            c cVar = this.f1344a;
            if (cVar == null) {
                throw null;
            } else if (dVar == null) {
                c.a(15);
                throw null;
            } else if (cVar.c()) {
                return false;
            } else {
                int indexOf = cVar.f1348a.indexOf(46);
                String str = cVar.f1348a;
                String a2 = dVar.a();
                if (indexOf == -1) {
                    indexOf = cVar.f1348a.length();
                }
                return str.regionMatches(0, a2, 0, indexOf);
            }
        } else {
            a(12);
            throw null;
        }
    }

    public b c() {
        b bVar = this.b;
        if (bVar != null) {
            if (bVar != null) {
                return bVar;
            }
            a(6);
            throw null;
        } else if (!b()) {
            c cVar = this.f1344a;
            c cVar2 = cVar.f1349c;
            if (cVar2 == null) {
                if (!cVar.c()) {
                    cVar.b();
                    cVar2 = cVar.f1349c;
                    if (cVar2 == null) {
                        c.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            b bVar2 = new b(cVar2);
            this.b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            a(7);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public d d() {
        d f2 = this.f1344a.f();
        if (f2 != null) {
            return f2;
        }
        a(9);
        throw null;
    }

    public d e() {
        d dVar;
        c cVar = this.f1344a;
        if (cVar.c()) {
            dVar = c.f1345e;
            if (dVar == null) {
                c.a(12);
                throw null;
            }
        } else {
            dVar = cVar.f();
            if (dVar == null) {
                c.a(13);
                throw null;
            }
        }
        return dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f1344a.equals(((b) obj).f1344a);
    }

    public c f() {
        c cVar = this.f1344a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public int hashCode() {
        return this.f1344a.hashCode();
    }

    public String toString() {
        return this.f1344a.toString();
    }

    public static b c(d dVar) {
        if (dVar == null) {
            a(13);
            throw null;
        } else if (dVar != null) {
            return new b(new c(dVar.a(), f1343c.f(), dVar));
        } else {
            c.a(16);
            throw null;
        }
    }
}

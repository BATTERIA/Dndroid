package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.o;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.j.g;
import a.a.a.a.v0.j.w.o.e;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f808a = new a("package", false);
    public static final a1 b = new b("protected_static", true);

    /* renamed from: c  reason: collision with root package name */
    public static final a1 f809c = new c("protected_and_package", true);

    public static class a extends a1 {
        public a(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 5) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        objArr[0] = "classDescriptor";
                    } else if (i != 5) {
                        objArr[0] = "what";
                    }
                }
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[0] = "visibility";
            }
            if (i == 3) {
                objArr[1] = "normalize";
            } else if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[1] = "effectiveVisibility";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                if (i == 4) {
                    objArr[2] = "effectiveVisibility";
                } else if (i != 5) {
                    objArr[2] = "isVisible";
                }
            }
            String format = String.format(str, objArr);
            if (i == 3 || i == 5) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.b.a1
        public Integer a(a1 a1Var) {
            if (a1Var != null) {
                return Integer.valueOf(this == a1Var ? 0 : z0.a(a1Var) ? 1 : -1);
            }
            a(2);
            throw null;
        }

        @Override // a.a.a.a.v0.b.a1
        public String a() {
            return "public/*package*/";
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return q.a(oVar, kVar);
            } else {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.a1
        public a1 b() {
            a1 a1Var = z0.f513c;
            if (a1Var != null) {
                return a1Var;
            }
            a(3);
            throw null;
        }
    }

    public static class b extends a1 {
        public b(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i != 2) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            } else {
                objArr[1] = "normalize";
            }
            if (i != 2) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // a.a.a.a.v0.b.a1
        public String a() {
            return "protected/*protected static*/";
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return q.a(eVar, oVar, kVar);
            } else {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.a1
        public a1 b() {
            a1 a1Var = z0.f513c;
            if (a1Var != null) {
                return a1Var;
            }
            a(2);
            throw null;
        }
    }

    public static class c extends a1 {
        public c(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "visibility";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            } else {
                objArr[1] = "normalize";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // a.a.a.a.v0.b.a1
        public Integer a(a1 a1Var) {
            int i;
            if (a1Var != null) {
                if (this == a1Var) {
                    i = 0;
                } else if (a1Var == z0.f514d) {
                    return null;
                } else {
                    i = z0.a(a1Var) ? 1 : -1;
                }
                return Integer.valueOf(i);
            }
            a(2);
            throw null;
        }

        @Override // a.a.a.a.v0.b.a1
        public String a() {
            return "protected/*protected and package*/";
        }

        @Override // a.a.a.a.v0.b.a1
        public boolean a(e eVar, o oVar, k kVar) {
            if (oVar == null) {
                a(0);
                throw null;
            } else if (kVar != null) {
                return q.a(eVar, oVar, kVar);
            } else {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.a1
        public a1 b() {
            a1 a1Var = z0.f513c;
            if (a1Var != null) {
                return a1Var;
            }
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean a(k kVar, k kVar2) {
        if (kVar == null) {
            a(2);
            throw null;
        } else if (kVar2 != null) {
            y yVar = (y) g.a(kVar, y.class, false);
            y yVar2 = (y) g.a(kVar2, y.class, false);
            return (yVar2 == null || yVar == null || !yVar.e().equals(yVar2.e())) ? false : true;
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ boolean a(e eVar, o oVar, k kVar) {
        if (oVar == null) {
            a(0);
            throw null;
        } else if (kVar == null) {
            a(1);
            throw null;
        } else if (a(g.a(oVar), kVar)) {
            return true;
        } else {
            return z0.f513c.a(eVar, oVar, kVar);
        }
    }
}

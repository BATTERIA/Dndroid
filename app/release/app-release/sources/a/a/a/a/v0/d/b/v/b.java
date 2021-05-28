package a.a.a.a.v0.d.b.v;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.d.a.s;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.d.b.v.a;
import a.a.a.a.v0.j.s.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements l.c {
    public static final boolean j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final Map<a.a.a.a.v0.f.a, a.EnumC0036a> k;

    /* renamed from: a  reason: collision with root package name */
    public int[] f942a = null;
    public a.a.a.a.v0.e.y0.g.c b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f943c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f944d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f945e = null;

    /* renamed from: f  reason: collision with root package name */
    public String[] f946f = null;

    /* renamed from: g  reason: collision with root package name */
    public String[] f947g = null;

    /* renamed from: h  reason: collision with root package name */
    public String[] f948h = null;
    public a.EnumC0036a i = null;

    /* renamed from: a.a.a.a.v0.d.b.v.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0038b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f949a = new ArrayList();

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.d.b.l.b
        public void a() {
            a((String[]) this.f949a.toArray(new String[0]));
        }

        @Override // a.a.a.a.v0.d.b.l.b
        public void a(a.a.a.a.v0.f.a aVar, a.a.a.a.v0.f.d dVar) {
            if (aVar == null) {
                a(0);
                throw null;
            } else if (dVar == null) {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.b
        public void a(f fVar) {
            if (fVar == null) {
                a(2);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.b
        public void a(Object obj) {
            if (obj instanceof String) {
                this.f949a.add((String) obj);
            }
        }

        public abstract void a(String[] strArr);
    }

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put(a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.internal.KotlinClass")), a.EnumC0036a.CLASS);
        k.put(a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0036a.FILE_FACADE);
        k.put(a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0036a.MULTIFILE_CLASS);
        k.put(a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0036a.MULTIFILE_CLASS_PART);
        k.put(a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0036a.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.a.a.a.v0.d.b.l.c
    public l.a a(a.a.a.a.v0.f.a aVar, m0 m0Var) {
        a.EnumC0036a aVar2;
        if (aVar == null) {
            a(0);
            throw null;
        } else if (m0Var == null) {
            a(1);
            throw null;
        } else if (aVar.a().equals(s.f811a)) {
            return new c(null);
        } else {
            if (j || this.i != null || (aVar2 = k.get(aVar)) == null) {
                return null;
            }
            this.i = aVar2;
            return new d(null);
        }
    }

    @Override // a.a.a.a.v0.d.b.l.c
    public void a() {
    }

    public class d implements l.a {
        public /* synthetic */ d(a aVar) {
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.a a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.f.a aVar) {
            if (dVar == null) {
                a(6);
                throw null;
            } else if (aVar != null) {
                return null;
            } else {
                a(7);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a() {
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.f.a aVar, a.a.a.a.v0.f.d dVar2) {
            if (dVar == null) {
                a(3);
                throw null;
            } else if (aVar == null) {
                a(4);
                throw null;
            } else if (dVar2 == null) {
                a(5);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, f fVar) {
            if (dVar == null) {
                a(0);
                throw null;
            } else if (fVar == null) {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, Object obj) {
            if (dVar != null) {
                String a2 = dVar.a();
                if ("version".equals(a2)) {
                    if (obj instanceof int[]) {
                        b bVar = b.this;
                        int[] iArr = (int[]) obj;
                        bVar.f942a = iArr;
                        if (bVar.b == null) {
                            bVar.b = new a.a.a.a.v0.e.y0.g.c(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(a2)) {
                    b.this.f943c = obj instanceof String ? (String) obj : null;
                }
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.b a(a.a.a.a.v0.f.d dVar) {
            if (dVar != null) {
                String a2 = dVar.a();
                if ("data".equals(a2) || "filePartClassNames".equals(a2)) {
                    return new e(this);
                }
                if ("strings".equals(a2)) {
                    return new f(this);
                }
                return null;
            }
            a(2);
            throw null;
        }
    }

    public class c implements l.a {
        public /* synthetic */ c(a aVar) {
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.a a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.f.a aVar) {
            if (dVar == null) {
                a(6);
                throw null;
            } else if (aVar != null) {
                return null;
            } else {
                a(7);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a() {
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.f.a aVar, a.a.a.a.v0.f.d dVar2) {
            if (dVar == null) {
                a(3);
                throw null;
            } else if (aVar == null) {
                a(4);
                throw null;
            } else if (dVar2 == null) {
                a(5);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, f fVar) {
            if (dVar == null) {
                a(0);
                throw null;
            } else if (fVar == null) {
                a(1);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(a.a.a.a.v0.f.d dVar, Object obj) {
            if (dVar != null) {
                String a2 = dVar.a();
                if ("k".equals(a2)) {
                    if (obj instanceof Integer) {
                        b bVar = b.this;
                        int intValue = ((Integer) obj).intValue();
                        if (a.EnumC0036a.l != null) {
                            a.EnumC0036a aVar = a.EnumC0036a.k.get(Integer.valueOf(intValue));
                            if (aVar == null) {
                                aVar = a.EnumC0036a.UNKNOWN;
                            }
                            bVar.i = aVar;
                            return;
                        }
                        throw null;
                    }
                } else if ("mv".equals(a2)) {
                    if (obj instanceof int[]) {
                        b.this.f942a = (int[]) obj;
                    }
                } else if ("bv".equals(a2)) {
                    if (obj instanceof int[]) {
                        b.this.b = new a.a.a.a.v0.e.y0.g.c((int[]) obj);
                    }
                } else if ("xs".equals(a2)) {
                    if (obj instanceof String) {
                        b.this.f943c = (String) obj;
                    }
                } else if ("xi".equals(a2)) {
                    if (obj instanceof Integer) {
                        b.this.f944d = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(a2) && (obj instanceof String)) {
                    b.this.f945e = (String) obj;
                }
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.b a(a.a.a.a.v0.f.d dVar) {
            if (dVar != null) {
                String a2 = dVar.a();
                if ("d1".equals(a2)) {
                    return new c(this);
                }
                if ("d2".equals(a2)) {
                    return new d(this);
                }
                return null;
            }
            a(2);
            throw null;
        }
    }
}

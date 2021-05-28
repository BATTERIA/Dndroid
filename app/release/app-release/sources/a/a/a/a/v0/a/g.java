package a.a.a.a.v0.a;

import a.a.a.a.v0.a.a;
import a.a.a.a.v0.a.o.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.c1.a;
import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.d1.b0;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.g0;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.x0;
import a.w.b.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a.a.a.a.v0.f.d f188e;

    /* renamed from: f  reason: collision with root package name */
    public static final a.a.a.a.v0.f.b f189f;

    /* renamed from: g  reason: collision with root package name */
    public static final a.a.a.a.v0.f.b f190g;

    /* renamed from: h  reason: collision with root package name */
    public static final a.a.a.a.v0.f.b f191h = f189f.a(a.a.a.a.v0.f.d.b("collections"));
    public static final a.a.a.a.v0.f.b i = f189f.a(a.a.a.a.v0.f.d.b("ranges"));
    public static final Set<a.a.a.a.v0.f.b> j = e.f.a.g.i(f189f, f191h, i, f190g, k.f220a, f189f.a(a.a.a.a.v0.f.d.b("internal")), a.a.a.a.v0.j.g.f1540c);
    public static final d k = new d();
    public static final a.a.a.a.v0.f.d l = a.a.a.a.v0.f.d.d("<built-ins module>");

    /* renamed from: a  reason: collision with root package name */
    public b0 f192a;
    public final a.a.a.a.v0.l.g<e> b;

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, a.a.a.a.v0.b.e> f193c;

    /* renamed from: d  reason: collision with root package name */
    public final j f194d;

    public class a implements a.w.b.a<Collection<a.a.a.a.v0.b.b0>> {
        public a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Collection<a.a.a.a.v0.b.b0> a() {
            return Arrays.asList(g.this.f192a.a(g.f189f), g.this.f192a.a(g.f191h), g.this.f192a.a(g.i), g.this.f192a.a(g.f190g));
        }
    }

    public class b implements a.w.b.a<e> {
        public b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public e a() {
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            i[] values = i.values();
            for (i iVar : values) {
                k0 a2 = g.a(g.this, iVar.b().a());
                k0 a3 = g.a(g.this, iVar.a().a());
                enumMap.put((Object) iVar, (Object) a3);
                hashMap.put(a2, a3);
                hashMap2.put(a3, a2);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    public class c implements l<a.a.a.a.v0.f.d, a.a.a.a.v0.b.e> {
        public c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a.a.a.a.v0.b.e a(a.a.a.a.v0.f.d dVar) {
            a.a.a.a.v0.f.d dVar2 = dVar;
            i u = g.this.f192a.a(g.f189f).u();
            if (u != null) {
                h b = u.b(dVar2, a.a.a.a.v0.c.a.d.f521d);
                if (b == null) {
                    StringBuilder a2 = e.a.a.a.a.a("Built-in class ");
                    a2.append(g.f189f.a(dVar2));
                    a2.append(" is not found");
                    throw new AssertionError(a2.toString());
                } else if (b instanceof a.a.a.a.v0.b.e) {
                    return (a.a.a.a.v0.b.e) b;
                } else {
                    throw new AssertionError("Must be a class descriptor " + dVar2 + ", but was " + b);
                }
            } else {
                g.b(10);
                throw null;
            }
        }
    }

    public static class d {
        public final a.a.a.a.v0.f.b A;
        public final a.a.a.a.v0.f.b B;
        public final a.a.a.a.v0.f.b C;
        public final a.a.a.a.v0.f.b D;
        public final a.a.a.a.v0.f.b E;
        public final a.a.a.a.v0.f.b F;
        public final a.a.a.a.v0.f.b G;
        public final a.a.a.a.v0.f.b H;
        public final a.a.a.a.v0.f.b I;
        public final a.a.a.a.v0.f.b J;
        public final a.a.a.a.v0.f.b K;
        public final a.a.a.a.v0.f.b L;
        public final a.a.a.a.v0.f.b M;
        public final a.a.a.a.v0.f.b N;
        public final a.a.a.a.v0.f.b O;
        public final a.a.a.a.v0.f.b P;
        public final a.a.a.a.v0.f.b Q;
        public final a.a.a.a.v0.f.b R;
        public final a.a.a.a.v0.f.b S;
        public final a.a.a.a.v0.f.b T;
        public final a.a.a.a.v0.f.b U;
        public final a.a.a.a.v0.f.b V;
        public final a.a.a.a.v0.f.c W;
        public final a.a.a.a.v0.f.c X;
        public final a.a.a.a.v0.f.a Y;
        public final a.a.a.a.v0.f.b Z;

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f198a = d("Any");
        public final a.a.a.a.v0.f.b a0;
        public final a.a.a.a.v0.f.c b = d("Nothing");
        public final a.a.a.a.v0.f.b b0;

        /* renamed from: c  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f199c = d("Cloneable");
        public final a.a.a.a.v0.f.b c0;

        /* renamed from: d  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f200d;
        public final a.a.a.a.v0.f.a d0;

        /* renamed from: e  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f201e;
        public final a.a.a.a.v0.f.a e0;

        /* renamed from: f  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f202f;
        public final a.a.a.a.v0.f.a f0;

        /* renamed from: g  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f203g;
        public final a.a.a.a.v0.f.a g0;

        /* renamed from: h  reason: collision with root package name */
        public final a.a.a.a.v0.f.c f204h;
        public final Set<a.a.a.a.v0.f.d> h0;
        public final a.a.a.a.v0.f.c i;
        public final Set<a.a.a.a.v0.f.d> i0;
        public final a.a.a.a.v0.f.c j;
        public final Map<a.a.a.a.v0.f.c, i> j0;
        public final a.a.a.a.v0.f.c k;
        public final Map<a.a.a.a.v0.f.c, i> k0;
        public final a.a.a.a.v0.f.c l;
        public final a.a.a.a.v0.f.c m;
        public final a.a.a.a.v0.f.c n;
        public final a.a.a.a.v0.f.c o;
        public final a.a.a.a.v0.f.c p;
        public final a.a.a.a.v0.f.c q;
        public final a.a.a.a.v0.f.b r;
        public final a.a.a.a.v0.f.b s;
        public final a.a.a.a.v0.f.b t;
        public final a.a.a.a.v0.f.b u;
        public final a.a.a.a.v0.f.b v;
        public final a.a.a.a.v0.f.b w;
        public final a.a.a.a.v0.f.b x;
        public final a.a.a.a.v0.f.b y;
        public final a.a.a.a.v0.f.b z;

        public d() {
            c("Suppress");
            this.f200d = d("Unit");
            this.f201e = d("CharSequence");
            this.f202f = d("String");
            this.f203g = d("Array");
            this.f204h = d("Boolean");
            this.i = d("Char");
            this.j = d("Byte");
            this.k = d("Short");
            this.l = d("Int");
            this.m = d("Long");
            this.n = d("Float");
            this.o = d("Double");
            this.p = d("Number");
            this.q = d("Enum");
            d("Function");
            this.r = c("Throwable");
            this.s = c("Comparable");
            e("IntRange");
            e("LongRange");
            this.t = c("Deprecated");
            this.u = c("DeprecationLevel");
            this.v = c("ReplaceWith");
            this.w = c("ExtensionFunctionType");
            this.x = c("ParameterName");
            this.y = c("Annotation");
            this.z = a("Target");
            this.A = a("AnnotationTarget");
            this.B = a("AnnotationRetention");
            this.C = a("Retention");
            this.D = a("Repeatable");
            this.E = a("MustBeDocumented");
            this.F = c("UnsafeVariance");
            c("PublishedApi");
            this.G = b("Iterator");
            this.H = b("Iterable");
            this.I = b("Collection");
            this.J = b("List");
            this.K = b("ListIterator");
            this.L = b("Set");
            a.a.a.a.v0.f.b b2 = b("Map");
            this.M = b2;
            this.N = b2.a(a.a.a.a.v0.f.d.b("Entry"));
            this.O = b("MutableIterator");
            this.P = b("MutableIterable");
            this.Q = b("MutableCollection");
            this.R = b("MutableList");
            this.S = b("MutableListIterator");
            this.T = b("MutableSet");
            a.a.a.a.v0.f.b b3 = b("MutableMap");
            this.U = b3;
            this.V = b3.a(a.a.a.a.v0.f.d.b("MutableEntry"));
            this.W = f("KClass");
            f("KCallable");
            f("KProperty0");
            f("KProperty1");
            f("KProperty2");
            f("KMutableProperty0");
            f("KMutableProperty1");
            f("KMutableProperty2");
            this.X = f(k.b);
            f(k.f221c);
            this.Y = a.a.a.a.v0.f.a.a(this.X.g());
            f("KDeclarationContainer");
            this.Z = c("UByte");
            this.a0 = c("UShort");
            this.b0 = c("UInt");
            this.c0 = c("ULong");
            this.d0 = a.a.a.a.v0.f.a.a(this.Z);
            this.e0 = a.a.a.a.v0.f.a.a(this.a0);
            this.f0 = a.a.a.a.v0.f.a.a(this.b0);
            this.g0 = a.a.a.a.v0.f.a.a(this.c0);
            this.h0 = new HashSet(a.a.a.a.v0.m.l1.a.b(i.values().length));
            this.i0 = new HashSet(a.a.a.a.v0.m.l1.a.b(i.values().length));
            this.j0 = a.a.a.a.v0.m.l1.a.e(i.values().length);
            this.k0 = a.a.a.a.v0.m.l1.a.e(i.values().length);
            i[] values = i.values();
            for (i iVar : values) {
                this.h0.add(iVar.b());
                this.i0.add(iVar.a());
                this.j0.put(d(iVar.b().a()), iVar);
                this.k0.put(d(iVar.a().a()), iVar);
            }
        }

        public static a.a.a.a.v0.f.b a(String str) {
            if (str != null) {
                return g.f190g.a(a.a.a.a.v0.f.d.b(str));
            }
            a(10);
            throw null;
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? 2 : 3)];
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[0] = "simpleName";
            }
            if (i2 == 1) {
                objArr[1] = "fqNameUnsafe";
            } else if (i2 == 3) {
                objArr[1] = "fqName";
            } else if (i2 == 5) {
                objArr[1] = "collectionsFqName";
            } else if (i2 == 7) {
                objArr[1] = "rangesFqName";
            } else if (i2 == 9) {
                objArr[1] = "reflect";
            } else if (i2 != 11) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[1] = "annotationName";
            }
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = "fqName";
                    break;
                case 4:
                    objArr[2] = "collectionsFqName";
                    break;
                case 6:
                    objArr[2] = "rangesFqName";
                    break;
                case 8:
                    objArr[2] = "reflect";
                    break;
                case 10:
                    objArr[2] = "annotationName";
                    break;
                default:
                    objArr[2] = "fqNameUnsafe";
                    break;
            }
            String format = String.format(str, objArr);
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        public static a.a.a.a.v0.f.b b(String str) {
            if (str != null) {
                return g.f191h.a(a.a.a.a.v0.f.d.b(str));
            }
            a(4);
            throw null;
        }

        public static a.a.a.a.v0.f.b c(String str) {
            if (str != null) {
                return g.f189f.a(a.a.a.a.v0.f.d.b(str));
            }
            a(2);
            throw null;
        }

        public static a.a.a.a.v0.f.c d(String str) {
            if (str != null) {
                a.a.a.a.v0.f.c f2 = c(str).f();
                if (f2 != null) {
                    return f2;
                }
                a(1);
                throw null;
            }
            a(0);
            throw null;
        }

        public static a.a.a.a.v0.f.c e(String str) {
            if (str != null) {
                a.a.a.a.v0.f.c f2 = g.i.a(a.a.a.a.v0.f.d.b(str)).f();
                if (f2 != null) {
                    return f2;
                }
                a(7);
                throw null;
            }
            a(6);
            throw null;
        }

        public static a.a.a.a.v0.f.c f(String str) {
            if (str != null) {
                a.a.a.a.v0.f.c f2 = k.f220a.a(a.a.a.a.v0.f.d.b(str)).f();
                if (f2 != null) {
                    return f2;
                }
                a(9);
                throw null;
            }
            a(8);
            throw null;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Map<i, k0> f205a;
        public final Map<k0, k0> b;

        public /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            if (map == null) {
                a(0);
                throw null;
            } else if (map2 == null) {
                a(1);
                throw null;
            } else if (map3 != null) {
                this.f205a = map;
                this.b = map3;
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    static {
        a.a.a.a.v0.f.d b2 = a.a.a.a.v0.f.d.b("kotlin");
        f188e = b2;
        a.a.a.a.v0.f.b c2 = a.a.a.a.v0.f.b.c(b2);
        f189f = c2;
        f190g = c2.a(a.a.a.a.v0.f.d.b("annotation"));
        f189f.a(a.a.a.a.v0.f.d.b("text"));
    }

    public g(j jVar) {
        if (jVar != null) {
            this.f194d = jVar;
            jVar.a(new a());
            this.b = jVar.a(new b());
            this.f193c = jVar.a(new c());
            return;
        }
        b(0);
        throw null;
    }

    public static i a(k kVar) {
        if (kVar == null) {
            b(77);
            throw null;
        } else if (k.i0.contains(kVar.d())) {
            return k.k0.get(a.a.a.a.v0.j.g.e(kVar));
        } else {
            return null;
        }
    }

    public static /* synthetic */ k0 a(g gVar, String str) {
        if (gVar == null) {
            throw null;
        } else if (str != null) {
            k0 v = gVar.a(str).v();
            if (v != null) {
                return v;
            }
            b(46);
            throw null;
        } else {
            b(45);
            throw null;
        }
    }

    public static boolean a(a.a.a.a.v0.b.e eVar) {
        if (eVar != null) {
            return b(eVar) != null;
        }
        b(92);
        throw null;
    }

    public static boolean a(h hVar, a.a.a.a.v0.f.c cVar) {
        if (hVar == null) {
            b(99);
            throw null;
        } else if (cVar != null) {
            return hVar.d().equals(cVar.f()) && cVar.equals(a.a.a.a.v0.j.g.e(hVar));
        } else {
            b(100);
            throw null;
        }
    }

    public static boolean a(d0 d0Var, a.a.a.a.v0.f.c cVar) {
        if (d0Var == null) {
            b(93);
            throw null;
        } else if (cVar != null) {
            return a(d0Var.I0(), cVar);
        } else {
            b(94);
            throw null;
        }
    }

    public static boolean a(s0 s0Var, a.a.a.a.v0.f.c cVar) {
        if (s0Var == null) {
            b(97);
            throw null;
        } else if (cVar != null) {
            h c2 = s0Var.c();
            return (c2 instanceof a.a.a.a.v0.b.e) && a(c2, cVar);
        } else {
            b(98);
            throw null;
        }
    }

    public static i b(k kVar) {
        if (kVar == null) {
            b(76);
            throw null;
        } else if (k.h0.contains(kVar.d())) {
            return k.j0.get(a.a.a.a.v0.j.g.e(kVar));
        } else {
            return null;
        }
    }

    public static /* synthetic */ void b(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                i3 = 2;
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 71:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 8:
            case 9:
            case 76:
            case 77:
            case d.b.j.AppCompatTheme_radioButtonStyle /*{ENCODED_INT: 85}*/:
            case d.b.j.AppCompatTheme_selectableItemBackgroundBorderless /*{ENCODED_INT: 92}*/:
            case d.b.j.AppCompatTheme_textAppearanceListItemSmall /*{ENCODED_INT: 99}*/:
            case d.b.j.AppCompatTheme_textAppearanceSmallPopupMenu /*{ENCODED_INT: 103}*/:
            case d.b.j.AppCompatTheme_textColorAlertDialogListItem /*{ENCODED_INT: 104}*/:
            case 136:
            case 137:
            case 139:
            case 147:
            case 148:
            case 149:
                objArr[0] = "descriptor";
                break;
            case 11:
            case d.b.j.AppCompatTheme_spinnerStyle /*{ENCODED_INT: 94}*/:
            case d.b.j.AppCompatTheme_textAppearanceLargePopupMenu /*{ENCODED_INT: 96}*/:
            case d.b.j.AppCompatTheme_textAppearanceListItemSecondary /*{ENCODED_INT: 98}*/:
            case d.b.j.AppCompatTheme_textAppearancePopupMenuHeader /*{ENCODED_INT: 100}*/:
            case d.b.j.AppCompatTheme_textAppearanceSearchResultTitle /*{ENCODED_INT: 102}*/:
            case 126:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 52:
            case d.b.j.AppCompatTheme_popupWindowStyle /*{ENCODED_INT: 84}*/:
            case d.b.j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case d.b.j.AppCompatTheme_ratingBarStyleIndicator /*{ENCODED_INT: 87}*/:
            case d.b.j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
            case d.b.j.AppCompatTheme_searchViewStyle /*{ENCODED_INT: 89}*/:
            case d.b.j.AppCompatTheme_seekBarStyle /*{ENCODED_INT: 90}*/:
            case d.b.j.AppCompatTheme_selectableItemBackground /*{ENCODED_INT: 91}*/:
            case d.b.j.AppCompatTheme_spinnerDropDownItemStyle /*{ENCODED_INT: 93}*/:
            case d.b.j.AppCompatTheme_switchStyle /*{ENCODED_INT: 95}*/:
            case d.b.j.AppCompatTheme_textAppearanceSearchResultSubtitle /*{ENCODED_INT: 101}*/:
            case d.b.j.AppCompatTheme_textColorSearchUrl /*{ENCODED_INT: 105}*/:
            case d.b.j.AppCompatTheme_toolbarNavigationButtonStyle /*{ENCODED_INT: 106}*/:
            case d.b.j.AppCompatTheme_toolbarStyle /*{ENCODED_INT: 107}*/:
            case d.b.j.AppCompatTheme_tooltipFrameBackground /*{ENCODED_INT: 109}*/:
            case d.b.j.AppCompatTheme_viewInflaterClass /*{ENCODED_INT: 110}*/:
            case d.b.j.AppCompatTheme_windowActionBar /*{ENCODED_INT: 111}*/:
            case d.b.j.AppCompatTheme_windowActionBarOverlay /*{ENCODED_INT: 112}*/:
            case d.b.j.AppCompatTheme_windowActionModeOverlay /*{ENCODED_INT: 113}*/:
            case d.b.j.AppCompatTheme_windowFixedHeightMajor /*{ENCODED_INT: 114}*/:
            case d.b.j.AppCompatTheme_windowFixedHeightMinor /*{ENCODED_INT: 115}*/:
            case d.b.j.AppCompatTheme_windowFixedWidthMajor /*{ENCODED_INT: 116}*/:
            case d.b.j.AppCompatTheme_windowFixedWidthMinor /*{ENCODED_INT: 117}*/:
            case d.b.j.AppCompatTheme_windowMinWidthMajor /*{ENCODED_INT: 118}*/:
            case d.b.j.AppCompatTheme_windowMinWidthMinor /*{ENCODED_INT: 119}*/:
            case d.b.j.AppCompatTheme_windowNoTitle /*{ENCODED_INT: 120}*/:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 138:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 151:
                objArr[0] = "type";
                break;
            case 45:
                objArr[0] = "classSimpleName";
                break;
            case 66:
                objArr[0] = "arrayType";
                break;
            case 70:
                objArr[0] = "notNullArrayType";
                break;
            case 72:
            case 152:
                objArr[0] = "primitiveType";
                break;
            case 74:
                objArr[0] = "kotlinType";
                break;
            case 75:
                objArr[0] = "arrayFqName";
                break;
            case 78:
                objArr[0] = "projectionType";
                break;
            case 79:
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
                objArr[0] = "argument";
                break;
            case d.b.j.AppCompatTheme_textAppearanceListItem /*{ENCODED_INT: 97}*/:
                objArr[0] = "typeConstructor";
                break;
            case d.b.j.AppCompatTheme_tooltipForegroundColor /*{ENCODED_INT: 108}*/:
                objArr[0] = "classDescriptor";
                break;
            case 150:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 17:
                objArr[1] = "getFunctionName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKClass";
                break;
            case 20:
                objArr[1] = "getKDeclarationContainer";
                break;
            case 21:
                objArr[1] = "getKCallable";
                break;
            case 22:
                objArr[1] = "getKProperty";
                break;
            case 23:
                objArr[1] = "getKProperty0";
                break;
            case 24:
                objArr[1] = "getKProperty1";
                break;
            case 25:
                objArr[1] = "getKProperty2";
                break;
            case 26:
                objArr[1] = "getKMutableProperty0";
                break;
            case 27:
                objArr[1] = "getKMutableProperty1";
                break;
            case 28:
                objArr[1] = "getKMutableProperty2";
                break;
            case 29:
                objArr[1] = "getIterator";
                break;
            case 30:
                objArr[1] = "getIterable";
                break;
            case 31:
                objArr[1] = "getMutableIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterator";
                break;
            case 33:
                objArr[1] = "getCollection";
                break;
            case 34:
                objArr[1] = "getMutableCollection";
                break;
            case 35:
                objArr[1] = "getList";
                break;
            case 36:
                objArr[1] = "getMutableList";
                break;
            case 37:
                objArr[1] = "getSet";
                break;
            case 38:
                objArr[1] = "getMutableSet";
                break;
            case 39:
                objArr[1] = "getMap";
                break;
            case 40:
                objArr[1] = "getMutableMap";
                break;
            case 41:
                objArr[1] = "getMapEntry";
                break;
            case 42:
                objArr[1] = "getMutableMapEntry";
                break;
            case 43:
                objArr[1] = "getListIterator";
                break;
            case 44:
                objArr[1] = "getMutableListIterator";
                break;
            case 46:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 47:
                objArr[1] = "getNothingType";
                break;
            case 48:
                objArr[1] = "getNullableNothingType";
                break;
            case 49:
                objArr[1] = "getAnyType";
                break;
            case 50:
                objArr[1] = "getNullableAnyType";
                break;
            case 51:
                objArr[1] = "getDefaultBound";
                break;
            case 53:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 54:
                objArr[1] = "getNumberType";
                break;
            case 55:
                objArr[1] = "getByteType";
                break;
            case 56:
                objArr[1] = "getShortType";
                break;
            case 57:
                objArr[1] = "getIntType";
                break;
            case 58:
                objArr[1] = "getLongType";
                break;
            case 59:
                objArr[1] = "getFloatType";
                break;
            case 60:
                objArr[1] = "getDoubleType";
                break;
            case 61:
                objArr[1] = "getCharType";
                break;
            case 62:
                objArr[1] = "getBooleanType";
                break;
            case 63:
                objArr[1] = "getUnitType";
                break;
            case 64:
                objArr[1] = "getStringType";
                break;
            case 65:
                objArr[1] = "getIterableType";
                break;
            case 67:
            case 68:
            case 69:
                objArr[1] = "getArrayElementType";
                break;
            case 73:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
                objArr[1] = "getArrayType";
                break;
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
                objArr[1] = "getEnumType";
                break;
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 13:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 45:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 52:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 66:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
            case 71:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 72:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 75:
            case d.b.j.AppCompatTheme_ratingBarStyleIndicator /*{ENCODED_INT: 87}*/:
                objArr[2] = "isPrimitiveArray";
                break;
            case 76:
            case d.b.j.AppCompatTheme_searchViewStyle /*{ENCODED_INT: 89}*/:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
                objArr[2] = "getArrayType";
                break;
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
                objArr[2] = "getEnumType";
                break;
            case d.b.j.AppCompatTheme_popupWindowStyle /*{ENCODED_INT: 84}*/:
                objArr[2] = "isArray";
                break;
            case d.b.j.AppCompatTheme_radioButtonStyle /*{ENCODED_INT: 85}*/:
            case d.b.j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case d.b.j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case d.b.j.AppCompatTheme_seekBarStyle /*{ENCODED_INT: 90}*/:
                objArr[2] = "isPrimitiveType";
                break;
            case d.b.j.AppCompatTheme_selectableItemBackground /*{ENCODED_INT: 91}*/:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case d.b.j.AppCompatTheme_selectableItemBackgroundBorderless /*{ENCODED_INT: 92}*/:
                objArr[2] = "isPrimitiveClass";
                break;
            case d.b.j.AppCompatTheme_spinnerDropDownItemStyle /*{ENCODED_INT: 93}*/:
            case d.b.j.AppCompatTheme_spinnerStyle /*{ENCODED_INT: 94}*/:
            case d.b.j.AppCompatTheme_switchStyle /*{ENCODED_INT: 95}*/:
            case d.b.j.AppCompatTheme_textAppearanceLargePopupMenu /*{ENCODED_INT: 96}*/:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case d.b.j.AppCompatTheme_textAppearanceListItem /*{ENCODED_INT: 97}*/:
            case d.b.j.AppCompatTheme_textAppearanceListItemSecondary /*{ENCODED_INT: 98}*/:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case d.b.j.AppCompatTheme_textAppearanceListItemSmall /*{ENCODED_INT: 99}*/:
            case d.b.j.AppCompatTheme_textAppearancePopupMenuHeader /*{ENCODED_INT: 100}*/:
                objArr[2] = "classFqNameEquals";
                break;
            case d.b.j.AppCompatTheme_textAppearanceSearchResultSubtitle /*{ENCODED_INT: 101}*/:
            case d.b.j.AppCompatTheme_textAppearanceSearchResultTitle /*{ENCODED_INT: 102}*/:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case d.b.j.AppCompatTheme_textAppearanceSmallPopupMenu /*{ENCODED_INT: 103}*/:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case d.b.j.AppCompatTheme_textColorAlertDialogListItem /*{ENCODED_INT: 104}*/:
            case d.b.j.AppCompatTheme_textColorSearchUrl /*{ENCODED_INT: 105}*/:
                objArr[2] = "isAny";
                break;
            case d.b.j.AppCompatTheme_toolbarNavigationButtonStyle /*{ENCODED_INT: 106}*/:
            case d.b.j.AppCompatTheme_tooltipForegroundColor /*{ENCODED_INT: 108}*/:
                objArr[2] = "isBoolean";
                break;
            case d.b.j.AppCompatTheme_toolbarStyle /*{ENCODED_INT: 107}*/:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case d.b.j.AppCompatTheme_tooltipFrameBackground /*{ENCODED_INT: 109}*/:
                objArr[2] = "isNumber";
                break;
            case d.b.j.AppCompatTheme_viewInflaterClass /*{ENCODED_INT: 110}*/:
                objArr[2] = "isChar";
                break;
            case d.b.j.AppCompatTheme_windowActionBar /*{ENCODED_INT: 111}*/:
                objArr[2] = "isCharOrNullableChar";
                break;
            case d.b.j.AppCompatTheme_windowActionBarOverlay /*{ENCODED_INT: 112}*/:
                objArr[2] = "isInt";
                break;
            case d.b.j.AppCompatTheme_windowActionModeOverlay /*{ENCODED_INT: 113}*/:
                objArr[2] = "isByte";
                break;
            case d.b.j.AppCompatTheme_windowFixedHeightMajor /*{ENCODED_INT: 114}*/:
                objArr[2] = "isLong";
                break;
            case d.b.j.AppCompatTheme_windowFixedHeightMinor /*{ENCODED_INT: 115}*/:
                objArr[2] = "isLongOrNullableLong";
                break;
            case d.b.j.AppCompatTheme_windowFixedWidthMajor /*{ENCODED_INT: 116}*/:
                objArr[2] = "isShort";
                break;
            case d.b.j.AppCompatTheme_windowFixedWidthMinor /*{ENCODED_INT: 117}*/:
                objArr[2] = "isFloat";
                break;
            case d.b.j.AppCompatTheme_windowMinWidthMajor /*{ENCODED_INT: 118}*/:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case d.b.j.AppCompatTheme_windowMinWidthMinor /*{ENCODED_INT: 119}*/:
                objArr[2] = "isDouble";
                break;
            case d.b.j.AppCompatTheme_windowNoTitle /*{ENCODED_INT: 120}*/:
                objArr[2] = "isUByte";
                break;
            case 121:
                objArr[2] = "isUShort";
                break;
            case 122:
                objArr[2] = "isUInt";
                break;
            case 123:
                objArr[2] = "isULong";
                break;
            case 124:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 125:
            case 126:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 127:
                objArr[2] = "isNothing";
                break;
            case 128:
                objArr[2] = "isNullableNothing";
                break;
            case 129:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 130:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 131:
                objArr[2] = "isNullableAny";
                break;
            case 132:
                objArr[2] = "isDefaultBound";
                break;
            case 133:
                objArr[2] = "isUnit";
                break;
            case 134:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 135:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 136:
                objArr[2] = "isMemberOfAny";
                break;
            case 137:
            case 138:
                objArr[2] = "isEnum";
                break;
            case 139:
            case 140:
                objArr[2] = "isComparable";
                break;
            case 141:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 142:
                objArr[2] = "isListOrNullableList";
                break;
            case 143:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 144:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 145:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 146:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 147:
                objArr[2] = "isKClass";
                break;
            case 148:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 149:
                objArr[2] = "isCloneable";
                break;
            case 150:
                objArr[2] = "isDeprecated";
                break;
            case 151:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 152:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case d.b.j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                throw new IllegalStateException(format);
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case d.b.j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(a.a.a.a.v0.b.e eVar) {
        if (eVar != null) {
            return a(eVar, k.f198a) || a(eVar, k.b);
        }
        b((int) d.b.j.AppCompatTheme_textAppearanceSmallPopupMenu);
        throw null;
    }

    public static boolean b(d0 d0Var) {
        if (d0Var != null) {
            return a(d0Var, k.f198a);
        }
        b(130);
        throw null;
    }

    public static boolean b(d0 d0Var, a.a.a.a.v0.f.c cVar) {
        if (d0Var == null) {
            b(125);
            throw null;
        } else if (cVar != null) {
            return a(d0Var, cVar) && !d0Var.J0();
        } else {
            b(126);
            throw null;
        }
    }

    public static a.a.a.a.v0.f.b c(i iVar) {
        if (iVar != null) {
            return f189f.a(iVar.b());
        }
        b(152);
        throw null;
    }

    public static String c(int i2) {
        String a2 = e.a.a.a.a.a("Function", i2);
        if (a2 != null) {
            return a2;
        }
        b(17);
        throw null;
    }

    public static boolean c(k kVar) {
        if (kVar != null) {
            return a.a.a.a.v0.j.g.a(kVar, b.class, false) != null;
        }
        b(8);
        throw null;
    }

    public static boolean c(d0 d0Var) {
        if (d0Var != null) {
            return a(d0Var, k.f203g);
        }
        b(84);
        throw null;
    }

    public static boolean c(d0 d0Var, a.a.a.a.v0.f.c cVar) {
        if (d0Var == null) {
            b((int) d.b.j.AppCompatTheme_textAppearanceSearchResultSubtitle);
            throw null;
        } else if (cVar != null) {
            return !d0Var.J0() && a(d0Var, cVar);
        } else {
            b((int) d.b.j.AppCompatTheme_textAppearanceSearchResultTitle);
            throw null;
        }
    }

    public static boolean d(k kVar) {
        if (kVar == null) {
            b(150);
            throw null;
        } else if (kVar.a().y().b(k.t)) {
            return true;
        } else {
            if (!(kVar instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) kVar;
            boolean V = f0Var.V();
            g0 w = f0Var.w();
            h0 i2 = f0Var.i();
            if (w != null && d(w)) {
                if (V) {
                    return i2 != null && d(i2);
                }
                return true;
            }
        }
    }

    public static boolean d(d0 d0Var) {
        if (d0Var != null) {
            return a(d0Var, k.b) && !c1.c(d0Var);
        }
        b(127);
        throw null;
    }

    public static boolean e(k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof y) {
                    return ((y) kVar).e().b(f188e);
                }
                kVar = kVar.b();
            }
            return false;
        }
        b(9);
        throw null;
    }

    public static boolean e(d0 d0Var) {
        if (d0Var != null) {
            return b(d0Var) && d0Var.J0();
        }
        b(131);
        throw null;
    }

    public static boolean g(d0 d0Var) {
        return d0Var != null && c(d0Var, k.f202f);
    }

    public static boolean h(d0 d0Var) {
        if (d0Var != null) {
            return c(d0Var, k.f200d);
        }
        b(133);
        throw null;
    }

    public a.a.a.a.v0.b.c1.a a() {
        return a.C0016a.f346a;
    }

    public a.a.a.a.v0.b.e a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            a.a.a.a.v0.b.e a2 = e.f.a.g.a(this.f192a, bVar, a.a.a.a.v0.c.a.d.f521d);
            if (a2 != null) {
                return a2;
            }
            b(12);
            throw null;
        }
        b(11);
        throw null;
    }

    public final a.a.a.a.v0.b.e a(String str) {
        if (str != null) {
            a.a.a.a.v0.b.e a2 = this.f193c.a(a.a.a.a.v0.f.d.b(str));
            if (a2 != null) {
                return a2;
            }
            b(14);
            throw null;
        }
        b(13);
        throw null;
    }

    public k0 a(i iVar) {
        if (iVar != null) {
            k0 k0Var = ((e) this.b.a()).f205a.get(iVar);
            if (k0Var != null) {
                return k0Var;
            }
            b(73);
            throw null;
        }
        b(72);
        throw null;
    }

    public k0 b() {
        k0 v = a("Any").v();
        if (v != null) {
            return v;
        }
        b(49);
        throw null;
    }

    public Iterable<a.a.a.a.v0.b.c1.b> c() {
        List singletonList = Collections.singletonList(new a.a.a.a.v0.a.o.a(this.f194d, this.f192a));
        if (singletonList != null) {
            return singletonList;
        }
        b(4);
        throw null;
    }

    public k0 d() {
        k0 g2 = g();
        if (g2 != null) {
            return g2;
        }
        b(51);
        throw null;
    }

    public k0 e() {
        k0 b2 = b(i.INT);
        if (b2 != null) {
            return b2;
        }
        b(57);
        throw null;
    }

    public k0 f() {
        k0 v = a("Nothing").v();
        if (v != null) {
            return v;
        }
        b(47);
        throw null;
    }

    public k0 g() {
        k0 a2 = b().a(true);
        if (a2 != null) {
            return a2;
        }
        b(50);
        throw null;
    }

    public a.a.a.a.v0.b.c1.c h() {
        return c.b.f348a;
    }

    public k0 i() {
        k0 v = a("String").v();
        if (v != null) {
            return v;
        }
        b(64);
        throw null;
    }

    public k0 j() {
        k0 v = a("Unit").v();
        if (v != null) {
            return v;
        }
        b(63);
        throw null;
    }

    public void a(boolean z) {
        b0 b0Var = new b0(l, this.f194d, this, null, null, null, 48);
        this.f192a = b0Var;
        if (a.f184a != null) {
            b0Var.a(((a) a.C0010a.f185a.getValue()).a(this.f194d, this.f192a, c(), h(), a(), z));
            b0 b0Var2 = this.f192a;
            b0Var2.a(b0Var2);
            return;
        }
        throw null;
    }

    public static boolean f(d0 d0Var) {
        if (d0Var != null) {
            if (!d0Var.J0()) {
                h c2 = d0Var.I0().c();
                if ((c2 instanceof a.a.a.a.v0.b.e) && a((a.a.a.a.v0.b.e) c2)) {
                    return true;
                }
            }
            return false;
        }
        b(90);
        throw null;
    }

    public k0 b(i iVar) {
        if (iVar == null) {
            b(52);
            throw null;
        } else if (iVar != null) {
            k0 v = a(iVar.b().a()).v();
            if (v != null) {
                return v;
            }
            b(53);
            throw null;
        } else {
            b(15);
            throw null;
        }
    }

    public d0 a(d0 d0Var) {
        a.a.a.a.v0.f.a a2;
        a.a.a.a.v0.b.e a3;
        k0 k0Var = null;
        if (d0Var == null) {
            b(66);
            throw null;
        } else if (!c(d0Var)) {
            d0 e2 = c1.e(d0Var);
            k0 k0Var2 = ((e) this.b.a()).b.get(e2);
            if (k0Var2 != null) {
                return k0Var2;
            }
            if (e2 != null) {
                h c2 = e2.I0().c();
                w b2 = c2 == null ? null : a.a.a.a.v0.j.g.b(c2);
                if (b2 != null) {
                    h c3 = e2.I0().c();
                    if (c3 != null) {
                        n nVar = n.f232e;
                        a.a.a.a.v0.f.d d2 = c3.d();
                        if (d2 == null) {
                            a.w.c.i.a("name");
                            throw null;
                        } else if (n.f231d.contains(d2) && (a2 = a.a.a.a.v0.j.u.a.a(c3)) != null) {
                            n nVar2 = n.f232e;
                            a.a.a.a.v0.f.a aVar = n.b.get(a2);
                            if (!(aVar == null || (a3 = e.f.a.g.a(b2, aVar)) == null)) {
                                k0Var = a3.v();
                            }
                        }
                    }
                    if (k0Var != null) {
                        return k0Var;
                    }
                }
                throw new IllegalStateException("not array: " + d0Var);
            }
            a.a.a.a.v0.j.g.a(18);
            throw null;
        } else if (d0Var.H0().size() == 1) {
            d0 c4 = d0Var.H0().get(0).c();
            if (c4 != null) {
                return c4;
            }
            b(67);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    public k0 a(g1 g1Var, d0 d0Var) {
        if (g1Var == null) {
            b(78);
            throw null;
        } else if (d0Var != null) {
            List singletonList = Collections.singletonList(new x0(g1Var, d0Var));
            if (a.a.a.a.v0.b.b1.h.b != null) {
                k0 a2 = e0.a(h.a.f321a, a("Array"), singletonList);
                if (a2 != null) {
                    return a2;
                }
                b(80);
                throw null;
            }
            throw null;
        } else {
            b(79);
            throw null;
        }
    }

    public a.a.a.a.v0.b.e a(int i2) {
        a.a.a.a.v0.b.e a2 = a(a.a.a.a.v0.j.g.f1540c.a(a.a.a.a.v0.f.d.b(b.c.SuspendFunction.f246d + i2)));
        if (a2 != null) {
            return a2;
        }
        b(18);
        throw null;
    }
}

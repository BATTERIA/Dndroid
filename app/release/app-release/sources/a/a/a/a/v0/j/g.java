package a.a.a.a.v0.j;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b0;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.n;
import a.a.a.a.v0.b.n0;
import a.a.a.a.v0.b.o;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.c;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.s0;
import d.b.j;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class g {

    /* renamed from: a */
    public static final d f1539a = d.b("values");
    public static final d b = d.b("valueOf");

    /* renamed from: c */
    public static final b f1540c;

    /* renamed from: d */
    public static final b f1541d;

    /* renamed from: e */
    public static final b f1542e = f1541d.a(d.b("Continuation"));

    /* renamed from: f */
    public static final b f1543f = f1540c.a(d.b("Continuation"));

    /* renamed from: g */
    public static final b f1544g = new b("kotlin.Result");

    static {
        b bVar = new b("kotlin.coroutines");
        f1540c = bVar;
        b a2 = bVar.a(d.b("experimental"));
        f1541d = a2;
        a2.a(d.b("intrinsics"));
        new b("kotlin.jvm.JvmName");
    }

    public static a1 a(e eVar) {
        if (eVar != null) {
            f t = eVar.t();
            if (t == f.ENUM_CLASS || t.a() || o(eVar)) {
                a1 a1Var = z0.f512a;
                if (a1Var != null) {
                    return a1Var;
                }
                a(47);
                throw null;
            } else if (i(eVar)) {
                a1 a1Var2 = z0.k;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                a(48);
                throw null;
            } else {
                a1 a1Var3 = z0.f515e;
                if (a1Var3 != null) {
                    return a1Var3;
                }
                a(49);
                throw null;
            }
        } else {
            a(46);
            throw null;
        }
    }

    public static <D extends a.a.a.a.v0.b.b> D a(D d2) {
        if (d2 != null) {
            while (d2.t() == b.a.FAKE_OVERRIDE) {
                Collection<? extends a.a.a.a.v0.b.b> f2 = d2.f();
                if (!f2.isEmpty()) {
                    d2 = (D) ((a.a.a.a.v0.b.b) f2.iterator().next());
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d2);
                }
            }
            return d2;
        }
        a(55);
        throw null;
    }

    public static e a(d0 d0Var) {
        if (d0Var != null) {
            s0 I0 = d0Var.I0();
            if (I0 != null) {
                e eVar = (e) I0.c();
                if (eVar != null) {
                    return eVar;
                }
                a(45);
                throw null;
            }
            a(44);
            throw null;
        }
        a(43);
        throw null;
    }

    public static <D extends k> D a(k kVar, Class<D> cls) {
        if (cls != null) {
            return (D) a(kVar, cls, true);
        }
        a(16);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        if (r3 != false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = (D) r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r1 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2.isInstance(r1) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return (D) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <D extends a.a.a.a.v0.b.k> D a(a.a.a.a.v0.b.k r1, java.lang.Class<D> r2, boolean r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0016
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            if (r3 == 0) goto L_0x000c
        L_0x0008:
            a.a.a.a.v0.b.k r1 = r1.b()
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L_0x0008
            return r1
        L_0x0015:
            return r0
        L_0x0016:
            r1 = 17
            a(r1)
            goto L_0x001d
        L_0x001c:
            throw r0
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.g.a(a.a.a.a.v0.b.k, java.lang.Class, boolean):a.a.a.a.v0.b.k");
    }

    public static <D extends o> D a(D d2) {
        if (d2 == null) {
            a(57);
            throw null;
        } else if (d2 instanceof a.a.a.a.v0.b.b) {
            return a((a.a.a.a.v0.b.b) d2);
        } else {
            if (d2 != null) {
                return d2;
            }
            a(58);
            throw null;
        }
    }

    public static w a(k kVar) {
        if (kVar != null) {
            w b2 = b(kVar);
            if (b2 != null) {
                return b2;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public static <D extends a> Set<D> a(D d2) {
        if (d2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a(d2.a(), linkedHashSet);
            return linkedHashSet;
        }
        a(64);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 53:
            case 54:
            case 55:
            case 57:
            case 74:
            case j.AppCompatTheme_ratingBarStyleIndicator /*{ENCODED_INT: 87}*/:
            case j.AppCompatTheme_searchViewStyle /*{ENCODED_INT: 89}*/:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 60:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = "other";
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 50:
            case 61:
            case 62:
            case 63:
            case 70:
            case 71:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 51:
                objArr[0] = "innerClassName";
                break;
            case 52:
                objArr[0] = "location";
                break;
            case 59:
                objArr[0] = "variable";
                break;
            case 64:
                objArr[0] = "f";
                break;
            case 66:
                objArr[0] = "current";
                break;
            case 67:
                objArr[0] = "result";
                break;
            case 68:
                objArr[0] = "memberDescriptor";
                break;
            case 72:
            case 73:
                objArr[0] = "annotated";
                break;
            case 77:
            case 79:
            case j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case j.AppCompatTheme_popupWindowStyle /*{ENCODED_INT: 84}*/:
                objArr[0] = "scope";
                break;
            case j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
            case j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
            case j.AppCompatTheme_radioButtonStyle /*{ENCODED_INT: 85}*/:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 20:
                objArr[1] = "getContainingModule";
                break;
            case 38:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 40:
            case 41:
                objArr[1] = "getSuperClassType";
                break;
            case 45:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 47:
            case 48:
            case 49:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 56:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 58:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 75:
            case 76:
                objArr[1] = "getContainingSourceFile";
                break;
            case 78:
                objArr[1] = "getAllDescriptors";
                break;
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
                objArr[1] = "getFunctionByName";
                break;
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
                objArr[1] = "getPropertyByName";
                break;
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = "getContainingModule";
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 39:
                objArr[2] = "getSuperClassType";
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 46:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 50:
            case 51:
            case 52:
                objArr[2] = "getInnerClassByName";
                break;
            case 53:
                objArr[2] = "isStaticNestedClass";
                break;
            case 54:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 55:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 57:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 59:
            case 60:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 61:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 62:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 63:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 64:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 66:
            case 67:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 70:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 71:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 72:
                objArr[2] = "getJvmName";
                break;
            case 73:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 74:
                objArr[2] = "getContainingSourceFile";
                break;
            case 77:
                objArr[2] = "getAllDescriptors";
                break;
            case 79:
            case j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
                objArr[2] = "getFunctionByName";
                break;
            case j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
            case j.AppCompatTheme_popupMenuStyle /*{ENCODED_INT: 83}*/:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case j.AppCompatTheme_popupWindowStyle /*{ENCODED_INT: 84}*/:
            case j.AppCompatTheme_radioButtonStyle /*{ENCODED_INT: 85}*/:
                objArr[2] = "getPropertyByName";
                break;
            case j.AppCompatTheme_ratingBarStyleIndicator /*{ENCODED_INT: 87}*/:
                objArr[2] = "getDirectMember";
                break;
            case j.AppCompatTheme_searchViewStyle /*{ENCODED_INT: 89}*/:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case j.AppCompatTheme_panelMenuListTheme /*{ENCODED_INT: 81}*/:
            case j.AppCompatTheme_ratingBarStyle /*{ENCODED_INT: 86}*/:
            case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<D extends a.a.a.a.v0.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends a> void a(D d2, Set<D> set) {
        if (d2 == null) {
            a(66);
            throw null;
        } else if (set == 0) {
            a(67);
            throw null;
        } else if (!set.contains(d2)) {
            for (a aVar : d2.a().f()) {
                a a2 = aVar.a();
                a(a2, set);
                set.add(a2);
            }
        }
    }

    public static boolean a(e eVar, e eVar2) {
        if (eVar == null) {
            a(24);
            throw null;
        } else if (eVar2 != null) {
            for (d0 d0Var : eVar.n().b()) {
                if (a(d0Var, eVar2.a())) {
                    return true;
                }
            }
            return false;
        } else {
            a(25);
            throw null;
        }
    }

    public static boolean a(k kVar, f fVar) {
        if (fVar != null) {
            return (kVar instanceof e) && ((e) kVar).t() == fVar;
        }
        a(35);
        throw null;
    }

    public static boolean a(d0 d0Var, k kVar) {
        if (d0Var == null) {
            a(28);
            throw null;
        } else if (kVar != null) {
            h c2 = d0Var.I0().c();
            if (c2 == null) {
                return false;
            }
            k a2 = c2.a();
            return (a2 instanceof h) && (kVar instanceof h) && ((h) kVar).n().equals(((h) a2).n());
        } else {
            a(29);
            throw null;
        }
    }

    public static e b(e eVar) {
        if (eVar != null) {
            for (d0 d0Var : eVar.n().b()) {
                e a2 = a(d0Var);
                if (a2.t() != f.INTERFACE) {
                    return a2;
                }
            }
            return null;
        }
        a(42);
        throw null;
    }

    public static w b(k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof w) {
                    return (w) kVar;
                }
                if (kVar instanceof b0) {
                    return ((b0) kVar).I();
                }
                kVar = kVar.b();
            }
            return null;
        }
        a(21);
        throw null;
    }

    public static boolean b(e eVar, e eVar2) {
        if (eVar == null) {
            a(26);
            throw null;
        } else if (eVar2 != null) {
            return b(eVar.v(), eVar2.a());
        } else {
            a(27);
            throw null;
        }
    }

    public static boolean b(d0 d0Var, k kVar) {
        if (d0Var == null) {
            a(30);
            throw null;
        } else if (kVar == null) {
            a(31);
            throw null;
        } else if (a(d0Var, kVar)) {
            return true;
        } else {
            for (d0 d0Var2 : d0Var.I0().b()) {
                if (b(d0Var2, kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static n0 c(k kVar) {
        if (kVar != null) {
            if (kVar instanceof h0) {
                kVar = ((h0) kVar).a0();
            }
            if (!(kVar instanceof n)) {
                return n0.f492a;
            }
            n0 a2 = ((n) kVar).r().a();
            if (a2 != null) {
                return a2;
            }
            a(75);
            throw null;
        }
        a(74);
        throw null;
    }

    public static i0 d(k kVar) {
        if (kVar == null) {
            a(0);
            throw null;
        } else if (kVar instanceof e) {
            return ((e) kVar).G0();
        } else {
            return null;
        }
    }

    public static c e(k kVar) {
        if (kVar != null) {
            a.a.a.a.v0.f.b f2 = f(kVar);
            return f2 != null ? f2.f() : g(kVar);
        }
        a(2);
        throw null;
    }

    public static a.a.a.a.v0.f.b f(k kVar) {
        if (kVar == null) {
            a(5);
            throw null;
        } else if ((kVar instanceof w) || a.a.a.a.v0.m.w.a(kVar)) {
            return a.a.a.a.v0.f.b.f1343c;
        } else {
            if (kVar instanceof b0) {
                return ((b0) kVar).e();
            }
            if (kVar instanceof y) {
                return ((y) kVar).e();
            }
            return null;
        }
    }

    public static c g(k kVar) {
        if (kVar != null) {
            return e(kVar.b()).a(kVar.d());
        }
        a(6);
        throw null;
    }

    public static boolean h(k kVar) {
        return a(kVar, f.ANNOTATION_CLASS);
    }

    public static boolean i(k kVar) {
        if (kVar != null) {
            return a(kVar, f.CLASS) && kVar.d().equals(a.a.a.a.v0.f.f.f1354a);
        }
        a(32);
        throw null;
    }

    public static boolean j(k kVar) {
        return a(kVar, f.CLASS) || l(kVar);
    }

    public static boolean k(k kVar) {
        return a(kVar, f.OBJECT) && ((e) kVar).P();
    }

    public static boolean l(k kVar) {
        return a(kVar, f.ENUM_CLASS);
    }

    public static boolean m(k kVar) {
        if (kVar != null) {
            return a(kVar, f.ENUM_ENTRY);
        }
        a(34);
        throw null;
    }

    public static boolean n(k kVar) {
        if (kVar != null) {
            while (true) {
                boolean z = false;
                if (kVar == null) {
                    return false;
                }
                if (i(kVar)) {
                    break;
                }
                if ((kVar instanceof o) && ((o) kVar).g() == z0.f516f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                kVar = kVar.b();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean o(k kVar) {
        return a(kVar, f.CLASS) && ((e) kVar).o() == v.SEALED;
    }

    public static boolean p(k kVar) {
        return kVar != null && (kVar.b() instanceof y);
    }
}

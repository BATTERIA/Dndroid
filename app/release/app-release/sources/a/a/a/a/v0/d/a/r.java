package a.a.a.a.v0.d.a;

import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final b f810a = new b("kotlin.jvm.JvmField");

    static {
        a.a(new b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    public static String a(String str) {
        if (str != null) {
            if (!d(str)) {
                StringBuilder a2 = e.a.a.a.a.a("get");
                a2.append(a.a.a.a.v0.m.l1.a.b(str));
                str = a2.toString();
            }
            if (str != null) {
                return str;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = "name";
                break;
            case 6:
            case 8:
                objArr[0] = "propertyName";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "baseName";
                break;
        }
        if (i == 1) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedProperty";
        } else if (i == 3) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedTypeAlias";
        } else if (i == 7) {
            objArr[1] = "getterName";
        } else if (i != 9) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        } else {
            objArr[1] = "setterName";
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = "getSyntheticMethodNameForAnnotatedTypeAlias";
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = "getterName";
                break;
            case 8:
                objArr[2] = "setterName";
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = "getSyntheticMethodNameForAnnotatedProperty";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 3 || i == 7 || i == 9) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(a.a.a.a.v0.b.f0 r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.r.a(a.a.a.a.v0.b.f0):boolean");
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("get") || str.startsWith("is");
        }
        a(4);
        throw null;
    }

    public static String c(String str) {
        if (str != null) {
            StringBuilder a2 = e.a.a.a.a.a("set");
            a2.append(d(str) ? str.substring(2) : a.a.a.a.v0.m.l1.a.b(str));
            String sb = a2.toString();
            if (sb != null) {
                return sb;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(String str) {
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return 'a' > charAt || charAt > 'z';
    }
}

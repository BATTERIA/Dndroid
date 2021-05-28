package a.a.a.a.v0.e.y0.g;

import a.s;
import a.w.c.i;

public class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) ? 2 : 3)];
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i == 1) {
            objArr[1] = "encodeBytes";
        } else if (i == 3) {
            objArr[1] = "encode8to7";
        } else if (i == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i == 8) {
            objArr[1] = "decodeBytes";
        } else if (i == 10) {
            objArr[1] = "dropMarker";
        } else if (i == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static byte[] a(String[] strArr) {
        int i;
        if (strArr != null) {
            boolean z = true;
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] b = b(strArr);
                    if (b != null) {
                        int i2 = 0;
                        for (String str : b) {
                            i2 += str.length();
                        }
                        byte[] bArr = new byte[i2];
                        int i3 = 0;
                        for (String str2 : b) {
                            int length = str2.length() - 1;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    i = i3 + 1;
                                    bArr[i3] = (byte) str2.charAt(i4);
                                    if (i4 == length) {
                                        break;
                                    }
                                    i4++;
                                    i3 = i;
                                }
                                i3 = i;
                            }
                        }
                        if (i3 != i2) {
                            z = false;
                        }
                        if (!s.f2103a || z) {
                            return bArr;
                        }
                        throw new AssertionError("Should have reached the end");
                    }
                    i.a("strings");
                    throw null;
                } else if (charAt == 65535) {
                    strArr = b(strArr);
                }
            }
            if (strArr != null) {
                int i5 = 0;
                for (String str3 : strArr) {
                    i5 += str3.length();
                }
                byte[] bArr2 = new byte[i5];
                int i6 = 0;
                for (String str4 : strArr) {
                    int length2 = str4.length();
                    int i7 = 0;
                    while (i7 < length2) {
                        bArr2[i6] = (byte) str4.charAt(i7);
                        i7++;
                        i6++;
                    }
                }
                for (int i8 = 0; i8 < i5; i8++) {
                    bArr2[i8] = (byte) ((bArr2[i8] + Byte.MAX_VALUE) & 127);
                }
                int i9 = (i5 * 7) / 8;
                byte[] bArr3 = new byte[i9];
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < i9; i12++) {
                    i10++;
                    int i13 = i11 + 1;
                    bArr3[i12] = (byte) (((bArr2[i10] & 255) >>> i11) + ((bArr2[i10] & ((1 << i13) - 1)) << (7 - i11)));
                    if (i11 == 6) {
                        i10++;
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                }
                return bArr3;
            }
            a(11);
            throw null;
        }
        a(7);
        throw null;
    }

    public static String[] b(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = (String[]) strArr.clone();
            strArr2[0] = strArr2[0].substring(1);
            return strArr2;
        }
        a(9);
        throw null;
    }
}

package f.o0.j;

import e.a.a.a.a;
import g.h;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final h f5221a = h.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f5222c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f5223d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f5223d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = f.o0.e.a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f5222c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f5222c[i4 | 8] = a.a(new StringBuilder(), f5222c[i4], "|PADDED");
        }
        String[] strArr3 = f5222c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = f5222c;
                int i9 = i8 | i6;
                strArr4[i9] = f5222c[i8] + '|' + f5222c[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(f5222c[i8]);
                sb.append('|');
                f5222c[i9 | 8] = a.a(sb, f5222c[i6], "|PADDED");
            }
        }
        while (true) {
            String[] strArr5 = f5222c;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = f5223d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(f.o0.e.a(str, objArr));
    }

    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String[] strArr = b;
        String a2 = b2 < strArr.length ? strArr[b2] : f.o0.e.a("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : f5223d[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr2 = f5222c;
                    String str4 = b3 < strArr2.length ? strArr2[b3] : f5223d[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str2 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (b2 != 0 || (b3 & 32) == 0) {
                        str = str4;
                    } else {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str4.replace(str2, str3);
                }
            }
            str = f5223d[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a2;
        objArr[4] = str;
        return f.o0.e.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(f.o0.e.a(str, objArr));
    }
}

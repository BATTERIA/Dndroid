package e.h.a.f0.z.s;

import java.util.TimeZone;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f4805a = TimeZone.getTimeZone("UTC");

    public static int a(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder a2 = e.a.a.a.a.a("Invalid number: ");
                a2.append(str.substring(i, i2));
                throw new NumberFormatException(a2.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder a3 = e.a.a.a.a.a("Invalid number: ");
                a3.append(str.substring(i, i2));
                throw new NumberFormatException(a3.toString());
            }
        }
        return -i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
        // Method dump skipped, instructions count: 571
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.z.s.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }
}

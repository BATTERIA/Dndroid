package f.o0;

import e.a.a.a.a;
import f.i0;
import f.j0;
import f.o0.j.c;
import f.x;
import g.h;
import g.q;
import g.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5083a = new byte[0];
    public static final String[] b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final x f5084c;

    /* renamed from: d  reason: collision with root package name */
    public static final j0 f5085d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f5086e = q.a(h.b("efbbbf"), h.b("feff"), h.b("fffe"), h.b("0000ffff"), h.b("ffff0000"));

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f5087f = Charset.forName("UTF-32BE");

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f5088g = Charset.forName("UTF-32LE");

    /* renamed from: h  reason: collision with root package name */
    public static final TimeZone f5089h = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> i = a.f5078c;
    public static final Method j;
    public static final Pattern k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        String[] strArr = (String[]) new String[0].clone();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] != null) {
                strArr[i2] = strArr[i2].trim();
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            x.b(str);
            x.a(str2, str);
        }
        f5084c = new x(strArr);
        byte[] bArr = f5083a;
        g.e eVar = new g.e();
        eVar.write(bArr);
        Method method = null;
        f5085d = new i0(null, (long) bArr.length, eVar);
        byte[] bArr2 = f5083a;
        a((long) bArr2.length, (long) 0, (long) bArr2.length);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        j = method;
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(a.b(str, " < 0"));
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(a.b(str, " too large."));
            } else if (millis != 0 || j2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(a.b(str, " too small."));
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String a(String str) {
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        if (str.contains(":")) {
            InetAddress a2 = (!str.startsWith("[") || !str.endsWith("]")) ? a(str, 0, str.length()) : a(str, 1, str.length() - 1);
            if (a2 == null) {
                return null;
            }
            byte[] address = a2.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i2 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                g.e eVar = new g.e();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        eVar.writeByte(58);
                        i3 += i5;
                        if (i3 == 16) {
                            eVar.writeByte(58);
                        }
                    } else {
                        if (i3 > 0) {
                            eVar.writeByte(58);
                        }
                        eVar.a((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return eVar.n();
            } else if (address.length == 4) {
                return a2.getHostAddress();
            } else {
                throw new AssertionError(a.a("Invalid IPv6 address: '", str, "'"));
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= lowerCase.length()) {
                        z = false;
                        break;
                    }
                    char charAt = lowerCase.charAt(i8);
                    if (charAt <= 31) {
                        break;
                    } else if (charAt >= 127) {
                        break;
                    } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (z) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static String a(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory a(String str, boolean z) {
        return new b(str, z);
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(g.x xVar, int i2, TimeUnit timeUnit) {
        try {
            return b(xVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static x b(List<c> list) {
        x.a aVar = new x.a();
        for (c cVar : list) {
            c.f5081a.a(aVar, cVar.f5204a.k(), cVar.b.k());
        }
        return new x(aVar);
    }

    public static boolean b(g.x xVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = xVar.c().d() ? xVar.c().c() - nanoTime : Long.MAX_VALUE;
        xVar.c().a(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            g.e eVar = new g.e();
            while (xVar.c(eVar, 8192) != -1) {
                eVar.k();
            }
            int i3 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            y c3 = xVar.c();
            if (i3 == 0) {
                c3.a();
            } else {
                c3.a(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i4 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            y c4 = xVar.c();
            if (i4 == 0) {
                c4.a();
            } else {
                c4.a(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            int i5 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            y c5 = xVar.c();
            if (i5 == 0) {
                c5.a();
            } else {
                c5.a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int c(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String d(String str, int i2, int i3) {
        int b2 = b(str, i2, i3);
        return str.substring(b2, c(str, b2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress a(java.lang.String r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.e.a(java.lang.String, int, int):java.net.InetAddress");
    }

    public static String a(f.y yVar, boolean z) {
        String str;
        if (yVar.f5405d.contains(":")) {
            str = a.a(a.a("["), yVar.f5405d, "]");
        } else {
            str = yVar.f5405d;
        }
        if (!z && yVar.f5406e == f.y.a(yVar.f5403a)) {
            return str;
        }
        StringBuilder a2 = a.a(str, ":");
        a2.append(yVar.f5406e);
        return a2.toString();
    }

    public static boolean a(f.y yVar, f.y yVar2) {
        return yVar.f5405d.equals(yVar2.f5405d) && yVar.f5406e == yVar2.f5406e && yVar.f5403a.equals(yVar2.f5403a);
    }
}

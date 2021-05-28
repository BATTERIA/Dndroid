package f;

import f.o0.e;
import g.z;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class y {
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f5403a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5404c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5405d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5406e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5407f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5408g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5409h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5410a;
        public String b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f5411c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f5412d;

        /* renamed from: e  reason: collision with root package name */
        public int f5413e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f5414f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f5415g;

        /* renamed from: h  reason: collision with root package name */
        public String f5416h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5414f = arrayList;
            arrayList.add("");
        }

        public static String a(String str, int i, int i2) {
            return e.a(y.a(str, i, i2, false));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0216, code lost:
            if (r1 <= 65535) goto L_0x021e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0254  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x02a2  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x035c  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x03a2  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x01ea A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f.y.a a(f.y r22, java.lang.String r23) {
            /*
            // Method dump skipped, instructions count: 966
            */
            throw new UnsupportedOperationException("Method not decompiled: f.y.a.a(f.y, java.lang.String):f.y$a");
        }

        public a a(String str) {
            this.f5415g = str != null ? y.b(y.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public y a() {
            if (this.f5410a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f5412d != null) {
                return new y(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f5410a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.f5411c.isEmpty()) {
                sb.append(this.b);
                if (!this.f5411c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f5411c);
                }
                sb.append('@');
            }
            String str3 = this.f5412d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f5412d);
                    sb.append(']');
                } else {
                    sb.append(this.f5412d);
                }
            }
            if (!(this.f5413e == -1 && this.f5410a == null)) {
                int i = this.f5413e;
                if (i == -1) {
                    i = y.a(this.f5410a);
                }
                String str4 = this.f5410a;
                if (str4 == null || i != y.a(str4)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            List<String> list = this.f5414f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
            if (this.f5415g != null) {
                sb.append('?');
                y.a(sb, this.f5415g);
            }
            if (this.f5416h != null) {
                sb.append('#');
                sb.append(this.f5416h);
            }
            return sb.toString();
        }
    }

    public y(a aVar) {
        this.f5403a = aVar.f5410a;
        this.b = a(aVar.b, false);
        this.f5404c = a(aVar.f5411c, false);
        this.f5405d = aVar.f5412d;
        int i2 = aVar.f5413e;
        this.f5406e = i2 == -1 ? a(aVar.f5410a) : i2;
        a(aVar.f5414f, false);
        List<String> list = aVar.f5415g;
        String str = null;
        this.f5407f = list != null ? a(list, true) : null;
        String str2 = aVar.f5416h;
        this.f5408g = str2 != null ? a(str2, 0, str2.length(), false) : str;
        this.f5409h = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            int i5 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !a(str, i4, i3)))) || (codePointAt == 43 && z3)))) {
                g.e eVar = new g.e();
                eVar.a(str, i2, i4);
                g.e eVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            eVar.a(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != i5 || (codePointAt2 == 37 && (!z || (z2 && !a(str, i4, i3)))))) {
                            if (eVar2 == null) {
                                eVar2 = new g.e();
                            }
                            if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                                eVar2.b(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                if (i4 < 0) {
                                    throw new IllegalAccessError(e.a.a.a.a.a("beginIndex < 0: ", i4));
                                } else if (charCount < i4) {
                                    throw new IllegalArgumentException("endIndex < beginIndex: " + charCount + " < " + i4);
                                } else if (charCount > str.length()) {
                                    StringBuilder a2 = e.a.a.a.a.a("endIndex > string.length: ", charCount, " > ");
                                    a2.append(str.length());
                                    throw new IllegalArgumentException(a2.toString());
                                } else if (charset.equals(z.f5476a)) {
                                    eVar2.a(str, i4, charCount);
                                } else {
                                    byte[] bytes = str.substring(i4, charCount).getBytes(charset);
                                    eVar2.write(bytes, 0, bytes.length);
                                }
                            }
                            while (!eVar2.i()) {
                                int readByte = eVar2.readByte() & 255;
                                eVar.writeByte(37);
                                eVar.writeByte((int) i[(readByte >> 4) & 15]);
                                eVar.writeByte((int) i[readByte & 15]);
                            }
                        } else {
                            eVar.b(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = -1;
                }
                return eVar.n();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && e.a(str.charAt(i2 + 1)) != -1 && e.a(str.charAt(i4)) != -1;
    }

    public static List<String> b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.f5404c.isEmpty()) {
            return "";
        }
        int indexOf = this.f5409h.indexOf(64);
        return this.f5409h.substring(this.f5409h.indexOf(58, this.f5403a.length() + 3) + 1, indexOf);
    }

    public String b() {
        int indexOf = this.f5409h.indexOf(47, this.f5403a.length() + 3);
        String str = this.f5409h;
        return this.f5409h.substring(indexOf, e.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> c() {
        int indexOf = this.f5409h.indexOf(47, this.f5403a.length() + 3);
        String str = this.f5409h;
        int a2 = e.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = e.a(this.f5409h, i2, a2, '/');
            arrayList.add(this.f5409h.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String d() {
        if (this.f5407f == null) {
            return null;
        }
        int indexOf = this.f5409h.indexOf(63) + 1;
        String str = this.f5409h;
        return this.f5409h.substring(indexOf, e.a(str, indexOf, str.length(), '#'));
    }

    public String e() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.f5403a.length() + 3;
        String str = this.f5409h;
        return this.f5409h.substring(length, e.a(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).f5409h.equals(this.f5409h);
    }

    public String f() {
        a aVar;
        try {
            aVar = new a();
            aVar.a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            aVar.b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            aVar.f5411c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return aVar.a().f5409h;
        }
        throw null;
    }

    public URI g() {
        a aVar = new a();
        aVar.f5410a = this.f5403a;
        aVar.b = e();
        aVar.f5411c = a();
        aVar.f5412d = this.f5405d;
        aVar.f5413e = this.f5406e != a(this.f5403a) ? this.f5406e : -1;
        aVar.f5414f.clear();
        aVar.f5414f.addAll(c());
        aVar.a(d());
        aVar.f5416h = this.f5408g == null ? null : this.f5409h.substring(this.f5409h.indexOf(35) + 1);
        int size = aVar.f5414f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f5414f.set(i2, a(aVar.f5414f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = aVar.f5415g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = aVar.f5415g.get(i3);
                if (str != null) {
                    aVar.f5415g.set(i3, a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = aVar.f5416h;
        if (str2 != null) {
            aVar.f5416h = a(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public int hashCode() {
        return this.f5409h.hashCode();
    }

    public String toString() {
        return this.f5409h;
    }

    public static String a(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                g.e eVar = new g.e();
                eVar.a(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int a2 = e.a(str.charAt(i5 + 1));
                        int a3 = e.a(str.charAt(i4));
                        if (!(a2 == -1 || a3 == -1)) {
                            eVar.writeByte((a2 << 4) + a3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        eVar.writeByte(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    eVar.b(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.n();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public final List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

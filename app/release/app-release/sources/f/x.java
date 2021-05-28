package f;

import f.o0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f5401a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f5402a = new ArrayList(20);

        public a a(String str) {
            int i = 0;
            while (i < this.f5402a.size()) {
                if (str.equalsIgnoreCase(this.f5402a.get(i))) {
                    this.f5402a.remove(i);
                    this.f5402a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            this.f5402a.add(str);
            this.f5402a.add(str2.trim());
            return this;
        }
    }

    public x(a aVar) {
        List<String> list = aVar.f5402a;
        this.f5401a = (String[]) list.toArray(new String[list.size()]);
    }

    public x(String[] strArr) {
        this.f5401a = strArr;
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(e.a.a.a.a.a("value for name ", str2, " == null"));
    }

    public static void b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f5402a, this.f5401a);
        return aVar;
    }

    public String a(int i) {
        return this.f5401a[i * 2];
    }

    public String a(String str) {
        String[] strArr = this.f5401a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public int b() {
        return this.f5401a.length / 2;
    }

    public String b(int i) {
        return this.f5401a[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && Arrays.equals(((x) obj).f5401a, this.f5401a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5401a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}

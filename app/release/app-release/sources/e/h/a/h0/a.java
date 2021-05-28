package e.h.a.h0;

import d.b.j;
import e.h.a.f0.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a implements Closeable {
    public static final char[] r = ")]}'\n".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    public final Reader f4808c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4809d = false;

    /* renamed from: e  reason: collision with root package name */
    public final char[] f4810e = new char[1024];

    /* renamed from: f  reason: collision with root package name */
    public int f4811f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f4812g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4813h = 0;
    public int i = 0;
    public int j = 0;
    public long k;
    public int l;
    public String m;
    public int[] n;
    public int o;
    public String[] p;
    public int[] q;

    /* renamed from: e.h.a.h0.a$a  reason: collision with other inner class name */
    public class C0145a extends q {
    }

    static {
        q.f4720a = new C0145a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        this.o = 0;
        this.o = 0 + 1;
        iArr[0] = 6;
        this.p = new String[32];
        this.q = new int[32];
        if (reader != null) {
            this.f4808c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public b A() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char B() {
        int i2;
        int i3;
        if (this.f4811f != this.f4812g || a(1)) {
            char[] cArr = this.f4810e;
            int i4 = this.f4811f;
            int i5 = i4 + 1;
            this.f4811f = i5;
            char c2 = cArr[i4];
            if (c2 == '\n') {
                this.f4813h++;
                this.i = i5;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 != 'u') {
                    b("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f4812g || a(4)) {
                    char c3 = 0;
                    int i6 = this.f4811f;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c4 = this.f4810e[i6];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i3 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder a2 = e.a.a.a.a.a("\\u");
                                a2.append(new String(this.f4810e, this.f4811f, 4));
                                throw new NumberFormatException(a2.toString());
                            } else {
                                i3 = c4 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c4 - '0';
                        }
                        c3 = (char) (i2 + c5);
                        i6++;
                    }
                    this.f4811f += 4;
                    return c3;
                } else {
                    b("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        b("Unterminated escape sequence");
        throw null;
    }

    public final void C() {
        char c2;
        do {
            if (this.f4811f < this.f4812g || a(1)) {
                char[] cArr = this.f4810e;
                int i2 = this.f4811f;
                int i3 = i2 + 1;
                this.f4811f = i3;
                c2 = cArr[i2];
                if (c2 == '\n') {
                    this.f4813h++;
                    this.i = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != '\r');
    }

    public void D() {
        int i2;
        char c2;
        int i3 = 0;
        do {
            int i4 = this.j;
            if (i4 == 0) {
                i4 = m();
            }
            if (i4 == 3) {
                b(1);
            } else if (i4 == 1) {
                b(3);
            } else if (i4 == 4 || i4 == 2) {
                this.o--;
                i3--;
                this.j = 0;
            } else if (i4 == 14 || i4 == 10) {
                while (true) {
                    i2 = 0;
                    while (true) {
                        int i5 = this.f4811f + i2;
                        if (i5 < this.f4812g) {
                            char c3 = this.f4810e[i5];
                            if (!(c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ')) {
                                if (c3 != '#') {
                                    if (c3 != ',') {
                                        if (!(c3 == '/' || c3 == '=')) {
                                            if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                if (c3 != ';') {
                                                    switch (c3) {
                                                        case j.AppCompatTheme_selectableItemBackground:
                                                        case j.AppCompatTheme_spinnerDropDownItemStyle:
                                                            break;
                                                        case j.AppCompatTheme_selectableItemBackgroundBorderless:
                                                            break;
                                                        default:
                                                            i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f4811f = i5;
                            if (!a(1)) {
                            }
                        }
                    }
                }
                l();
                this.f4811f += i2;
                this.j = 0;
            } else {
                if (i4 == 8 || i4 == 12) {
                    c2 = '\'';
                } else if (i4 == 9 || i4 == 13) {
                    c2 = '\"';
                } else {
                    if (i4 == 16) {
                        this.f4811f += this.l;
                    }
                    this.j = 0;
                }
                c(c2);
                this.j = 0;
            }
            i3++;
            this.j = 0;
        } while (i3 != 0);
        int[] iArr = this.q;
        int i6 = this.o;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.p[i6 - 1] = "null";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f4811f = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f4811f = r4 - 1;
        r2 = a(2);
        r9.f4811f++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        l();
        r2 = r9.f4811f;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f4811f = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f4811f = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f4811f + 2) <= r9.f4812g) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (a(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f4810e;
        r2 = r9.f4811f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != '\n') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f4813h++;
        r9.i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f4810e[r9.f4811f + r4] == "*\/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f4811f++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        b("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f4811f = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(boolean r10) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.h0.a.a(boolean):int");
    }

    public void a() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 3) {
            b(1);
            this.q[this.o - 1] = 0;
            this.j = 0;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected BEGIN_ARRAY but was ");
        a2.append(A());
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    public final boolean a(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case j.AppCompatTheme_selectableItemBackground:
                        case j.AppCompatTheme_spinnerDropDownItemStyle:
                            return false;
                        case j.AppCompatTheme_selectableItemBackgroundBorderless:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        return false;
    }

    public final boolean a(int i2) {
        int i3;
        char[] cArr = this.f4810e;
        int i4 = this.i;
        int i5 = this.f4811f;
        this.i = i4 - i5;
        int i6 = this.f4812g;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4812g = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4812g = 0;
        }
        this.f4811f = 0;
        do {
            Reader reader = this.f4808c;
            int i8 = this.f4812g;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            int i9 = this.f4812g + read;
            this.f4812g = i9;
            if (this.f4813h == 0 && (i3 = this.i) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f4811f++;
                this.i = i3 + 1;
                i2++;
            }
        } while (this.f4812g < i2);
        return true;
    }

    public final IOException b(String str) {
        StringBuilder a2 = e.a.a.a.a.a(str);
        a2.append(r());
        throw new d(a2.toString());
    }

    public final String b(char c2) {
        char[] cArr = this.f4810e;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f4811f;
            int i3 = this.f4812g;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f4811f = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f4811f = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(B());
                    } else {
                        if (c3 == '\n') {
                            this.f4813h++;
                            this.i = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f4811f = i2;
                    if (!a(1)) {
                        b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void b(int i2) {
        int i3 = this.o;
        int[] iArr = this.n;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.n = Arrays.copyOf(iArr, i4);
            this.q = Arrays.copyOf(this.q, i4);
            this.p = (String[]) Arrays.copyOf(this.p, i4);
        }
        int[] iArr2 = this.n;
        int i5 = this.o;
        this.o = i5 + 1;
        iArr2[i5] = i2;
    }

    public final void c(char c2) {
        char[] cArr = this.f4810e;
        while (true) {
            int i2 = this.f4811f;
            int i3 = this.f4812g;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f4811f = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f4811f = i4;
                        B();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f4813h++;
                            this.i = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f4811f = i2;
                    if (!a(1)) {
                        b("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.j = 0;
        this.n[0] = 8;
        this.o = 1;
        this.f4808c.close();
    }

    public void k() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 1) {
            b(3);
            this.j = 0;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected BEGIN_OBJECT but was ");
        a2.append(A());
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    public final void l() {
        if (!this.f4809d) {
            b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0205, code lost:
        if (a(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0207, code lost:
        if (r13 != 2) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0209, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x020f, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0211, code lost:
        if (r16 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0217, code lost:
        if (r10 != 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0219, code lost:
        if (r16 != false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021b, code lost:
        if (r16 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021e, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x021f, code lost:
        r19.k = r10;
        r19.f4811f += r9;
        r6 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x022b, code lost:
        if (r13 == 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022e, code lost:
        if (r13 == 4) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0231, code lost:
        if (r13 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0233, code lost:
        r19.l = r9;
        r6 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0239, code lost:
        r19.j = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0174 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m() {
        /*
        // Method dump skipped, instructions count: 792
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.h0.a.m():int");
    }

    public void n() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 4) {
            int i3 = this.o - 1;
            this.o = i3;
            int[] iArr = this.q;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.j = 0;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected END_ARRAY but was ");
        a2.append(A());
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    public void o() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 2) {
            int i3 = this.o - 1;
            this.o = i3;
            this.p[i3] = null;
            int[] iArr = this.q;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.j = 0;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected END_OBJECT but was ");
        a2.append(A());
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    public String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.o;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.n[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.q[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.p;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean q() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public String r() {
        return " at line " + (this.f4813h + 1) + " column " + ((this.f4811f - this.i) + 1) + " path " + p();
    }

    public boolean s() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 5) {
            this.j = 0;
            int[] iArr = this.q;
            int i3 = this.o - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.j = 0;
            int[] iArr2 = this.q;
            int i4 = this.o - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder a2 = e.a.a.a.a.a("Expected a boolean but was ");
            a2.append(A());
            a2.append(r());
            throw new IllegalStateException(a2.toString());
        }
    }

    public double t() {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 15) {
            this.j = 0;
            int[] iArr = this.q;
            int i3 = this.o - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.k;
        }
        if (i2 == 16) {
            this.m = new String(this.f4810e, this.f4811f, this.l);
            this.f4811f += this.l;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = b(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = z();
            } else if (i2 != 11) {
                StringBuilder a2 = e.a.a.a.a.a("Expected a double but was ");
                a2.append(A());
                a2.append(r());
                throw new IllegalStateException(a2.toString());
            }
            this.m = str;
        }
        this.j = 11;
        double parseDouble = Double.parseDouble(this.m);
        if (this.f4809d || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.m = null;
            this.j = 0;
            int[] iArr2 = this.q;
            int i4 = this.o - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    public int u() {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 15) {
            long j2 = this.k;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.j = 0;
                int[] iArr = this.q;
                int i4 = this.o - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder a2 = e.a.a.a.a.a("Expected an int but was ");
            a2.append(this.k);
            a2.append(r());
            throw new NumberFormatException(a2.toString());
        }
        if (i2 == 16) {
            this.m = new String(this.f4810e, this.f4811f, this.l);
            this.f4811f += this.l;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = z();
            } else {
                str = b(i2 == 8 ? '\'' : '\"');
            }
            this.m = str;
            try {
                int parseInt = Integer.parseInt(this.m);
                this.j = 0;
                int[] iArr2 = this.q;
                int i5 = this.o - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a3 = e.a.a.a.a.a("Expected an int but was ");
            a3.append(A());
            a3.append(r());
            throw new IllegalStateException(a3.toString());
        }
        this.j = 11;
        double parseDouble = Double.parseDouble(this.m);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.m = null;
            this.j = 0;
            int[] iArr3 = this.q;
            int i7 = this.o - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder a4 = e.a.a.a.a.a("Expected an int but was ");
        a4.append(this.m);
        a4.append(r());
        throw new NumberFormatException(a4.toString());
    }

    public long v() {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 15) {
            this.j = 0;
            int[] iArr = this.q;
            int i3 = this.o - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.k;
        }
        if (i2 == 16) {
            this.m = new String(this.f4810e, this.f4811f, this.l);
            this.f4811f += this.l;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = z();
            } else {
                str = b(i2 == 8 ? '\'' : '\"');
            }
            this.m = str;
            try {
                long parseLong = Long.parseLong(this.m);
                this.j = 0;
                int[] iArr2 = this.q;
                int i4 = this.o - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a2 = e.a.a.a.a.a("Expected a long but was ");
            a2.append(A());
            a2.append(r());
            throw new IllegalStateException(a2.toString());
        }
        this.j = 11;
        double parseDouble = Double.parseDouble(this.m);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.m = null;
            this.j = 0;
            int[] iArr3 = this.q;
            int i5 = this.o - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder a3 = e.a.a.a.a.a("Expected a long but was ");
        a3.append(this.m);
        a3.append(r());
        throw new NumberFormatException(a3.toString());
    }

    public String w() {
        String str;
        char c2;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 14) {
            str = z();
        } else {
            if (i2 == 12) {
                c2 = '\'';
            } else if (i2 == 13) {
                c2 = '\"';
            } else {
                StringBuilder a2 = e.a.a.a.a.a("Expected a name but was ");
                a2.append(A());
                a2.append(r());
                throw new IllegalStateException(a2.toString());
            }
            str = b(c2);
        }
        this.j = 0;
        this.p[this.o - 1] = str;
        return str;
    }

    public void x() {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 7) {
            this.j = 0;
            int[] iArr = this.q;
            int i3 = this.o - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected null but was ");
        a2.append(A());
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    public String y() {
        String str;
        char c2;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = m();
        }
        if (i2 == 10) {
            str = z();
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 11) {
                str = this.m;
                this.m = null;
            } else if (i2 == 15) {
                str = Long.toString(this.k);
            } else if (i2 == 16) {
                str = new String(this.f4810e, this.f4811f, this.l);
                this.f4811f += this.l;
            } else {
                StringBuilder a2 = e.a.a.a.a.a("Expected a string but was ");
                a2.append(A());
                a2.append(r());
                throw new IllegalStateException(a2.toString());
            }
            str = b(c2);
        }
        this.j = 0;
        int[] iArr = this.q;
        int i3 = this.o - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.h0.a.z():java.lang.String");
    }
}

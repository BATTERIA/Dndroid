package e.h.a.h0;

import e.a.a.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class c implements Closeable, Flushable {
    public static final String[] l = new String[128];
    public static final String[] m;

    /* renamed from: c  reason: collision with root package name */
    public final Writer f4820c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f4821d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    public int f4822e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f4823f;

    /* renamed from: g  reason: collision with root package name */
    public String f4824g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4825h;
    public boolean i;
    public String j;
    public boolean k;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            l[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        m = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f4824g = ":";
        this.k = true;
        if (writer != null) {
            this.f4820c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final c a(int i2, int i3, char c2) {
        int q = q();
        if (q != i3 && q != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.j == null) {
            this.f4822e--;
            if (q == i3) {
                o();
            }
            this.f4820c.write(c2);
            return this;
        } else {
            StringBuilder a2 = a.a("Dangling name: ");
            a2.append(this.j);
            throw new IllegalStateException(a2.toString());
        }
    }

    public c a(Boolean bool) {
        if (bool == null) {
            return p();
        }
        r();
        a();
        this.f4820c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return p();
        }
        r();
        String obj = number.toString();
        if (this.f4825h || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.f4820c.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c a(boolean z) {
        r();
        a();
        this.f4820c.write(z ? "true" : "false");
        return this;
    }

    public final void a() {
        int q = q();
        if (q == 1) {
            b(2);
        } else if (q == 2) {
            this.f4820c.append(',');
        } else if (q != 4) {
            if (q != 6) {
                if (q != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4825h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
            return;
        } else {
            this.f4820c.append((CharSequence) this.f4824g);
            b(5);
            return;
        }
        o();
    }

    public final void a(int i2) {
        int i3 = this.f4822e;
        int[] iArr = this.f4821d;
        if (i3 == iArr.length) {
            this.f4821d = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f4821d;
        int i4 = this.f4822e;
        this.f4822e = i4 + 1;
        iArr2[i4] = i2;
    }

    public c b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.j != null) {
            throw new IllegalStateException();
        } else if (this.f4822e != 0) {
            this.j = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void b(int i2) {
        this.f4821d[this.f4822e - 1] = i2;
    }

    public final void c(String str) {
        String str2;
        String[] strArr = this.i ? m : l;
        this.f4820c.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f4820c.write(str, i2, i3 - i2);
            }
            this.f4820c.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f4820c.write(str, i2, length - i2);
        }
        this.f4820c.write(34);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4820c.close();
        int i2 = this.f4822e;
        if (i2 > 1 || (i2 == 1 && this.f4821d[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4822e = 0;
    }

    public c d(String str) {
        if (str == null) {
            return p();
        }
        r();
        a();
        c(str);
        return this;
    }

    public c f(long j2) {
        r();
        a();
        this.f4820c.write(Long.toString(j2));
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f4822e != 0) {
            this.f4820c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c k() {
        r();
        a();
        a(1);
        this.f4820c.write(91);
        return this;
    }

    public c l() {
        r();
        a();
        a(3);
        this.f4820c.write(123);
        return this;
    }

    public c m() {
        a(1, 2, ']');
        return this;
    }

    public c n() {
        a(3, 5, '}');
        return this;
    }

    public final void o() {
        if (this.f4823f != null) {
            this.f4820c.write(10);
            int i2 = this.f4822e;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f4820c.write(this.f4823f);
            }
        }
    }

    public c p() {
        if (this.j != null) {
            if (this.k) {
                r();
            } else {
                this.j = null;
                return this;
            }
        }
        a();
        this.f4820c.write("null");
        return this;
    }

    public final int q() {
        int i2 = this.f4822e;
        if (i2 != 0) {
            return this.f4821d[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void r() {
        if (this.j != null) {
            int q = q();
            if (q == 5) {
                this.f4820c.write(44);
            } else if (q != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            b(4);
            c(this.j);
            this.j = null;
        }
    }
}

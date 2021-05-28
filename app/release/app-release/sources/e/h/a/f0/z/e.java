package e.h.a.f0.z;

import e.h.a.h0.b;
import e.h.a.n;
import e.h.a.s;
import e.h.a.t;
import e.h.a.w;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class e extends e.h.a.h0.a {
    public static final Object w = new Object();
    public Object[] s;
    public int t;
    public String[] u;
    public int[] v;

    public class a extends Reader {
        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    @Override // e.h.a.h0.a
    private String r() {
        StringBuilder a2 = e.a.a.a.a.a(" at path ");
        a2.append(p());
        return a2.toString();
    }

    @Override // e.h.a.h0.a
    public b A() {
        if (this.t == 0) {
            return b.END_DOCUMENT;
        }
        Object E = E();
        if (E instanceof Iterator) {
            boolean z = this.s[this.t - 2] instanceof t;
            Iterator it = (Iterator) E;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            a(it.next());
            return A();
        } else if (E instanceof t) {
            return b.BEGIN_OBJECT;
        } else {
            if (E instanceof n) {
                return b.BEGIN_ARRAY;
            }
            if (E instanceof w) {
                Object obj = ((w) E).f4846a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (E instanceof s) {
                return b.NULL;
            } else {
                if (E == w) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // e.h.a.h0.a
    public void D() {
        if (A() == b.NAME) {
            w();
            this.u[this.t - 2] = "null";
        } else {
            F();
            int i = this.t;
            if (i > 0) {
                this.u[i - 1] = "null";
            }
        }
        int i2 = this.t;
        if (i2 > 0) {
            int[] iArr = this.v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final Object E() {
        return this.s[this.t - 1];
    }

    public final Object F() {
        Object[] objArr = this.s;
        int i = this.t - 1;
        this.t = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // e.h.a.h0.a
    public void a() {
        a(b.BEGIN_ARRAY);
        a(((n) E()).iterator());
        this.v[this.t - 1] = 0;
    }

    public final void a(b bVar) {
        if (A() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + A() + r());
        }
    }

    public final void a(Object obj) {
        int i = this.t;
        Object[] objArr = this.s;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.s = Arrays.copyOf(objArr, i2);
            this.v = Arrays.copyOf(this.v, i2);
            this.u = (String[]) Arrays.copyOf(this.u, i2);
        }
        Object[] objArr2 = this.s;
        int i3 = this.t;
        this.t = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // java.io.Closeable, e.h.a.h0.a, java.lang.AutoCloseable
    public void close() {
        this.s = new Object[]{w};
        this.t = 1;
    }

    @Override // e.h.a.h0.a
    public void k() {
        a(b.BEGIN_OBJECT);
        a(((t) E()).f4845a.entrySet().iterator());
    }

    @Override // e.h.a.h0.a
    public void n() {
        a(b.END_ARRAY);
        F();
        F();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // e.h.a.h0.a
    public void o() {
        a(b.END_OBJECT);
        F();
        F();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // e.h.a.h0.a
    public String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.t) {
            Object[] objArr = this.s;
            if (objArr[i] instanceof n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.v[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof t) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.u;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // e.h.a.h0.a
    public boolean q() {
        b A = A();
        return (A == b.END_OBJECT || A == b.END_ARRAY) ? false : true;
    }

    @Override // e.h.a.h0.a
    public boolean s() {
        a(b.BOOLEAN);
        boolean c2 = ((w) F()).c();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c2;
    }

    @Override // e.h.a.h0.a
    public double t() {
        b A = A();
        if (A == b.NUMBER || A == b.STRING) {
            w wVar = (w) E();
            double doubleValue = wVar.f4846a instanceof Number ? wVar.d().doubleValue() : Double.parseDouble(wVar.e());
            if (this.f4809d || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                F();
                int i = this.t;
                if (i > 0) {
                    int[] iArr = this.v;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected ");
        a2.append(b.NUMBER);
        a2.append(" but was ");
        a2.append(A);
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    @Override // e.h.a.h0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // e.h.a.h0.a
    public int u() {
        b A = A();
        if (A == b.NUMBER || A == b.STRING) {
            w wVar = (w) E();
            int intValue = wVar.f4846a instanceof Number ? wVar.d().intValue() : Integer.parseInt(wVar.e());
            F();
            int i = this.t;
            if (i > 0) {
                int[] iArr = this.v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected ");
        a2.append(b.NUMBER);
        a2.append(" but was ");
        a2.append(A);
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    @Override // e.h.a.h0.a
    public long v() {
        b A = A();
        if (A == b.NUMBER || A == b.STRING) {
            w wVar = (w) E();
            long longValue = wVar.f4846a instanceof Number ? wVar.d().longValue() : Long.parseLong(wVar.e());
            F();
            int i = this.t;
            if (i > 0) {
                int[] iArr = this.v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return longValue;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected ");
        a2.append(b.NUMBER);
        a2.append(" but was ");
        a2.append(A);
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }

    @Override // e.h.a.h0.a
    public String w() {
        a(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E()).next();
        String str = (String) entry.getKey();
        this.u[this.t - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // e.h.a.h0.a
    public void x() {
        a(b.NULL);
        F();
        int i = this.t;
        if (i > 0) {
            int[] iArr = this.v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // e.h.a.h0.a
    public String y() {
        b A = A();
        if (A == b.STRING || A == b.NUMBER) {
            String e2 = ((w) F()).e();
            int i = this.t;
            if (i > 0) {
                int[] iArr = this.v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e2;
        }
        StringBuilder a2 = e.a.a.a.a.a("Expected ");
        a2.append(b.STRING);
        a2.append(" but was ");
        a2.append(A);
        a2.append(r());
        throw new IllegalStateException(a2.toString());
    }
}

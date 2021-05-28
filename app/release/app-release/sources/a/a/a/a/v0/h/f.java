package a.a.a.a.v0.h;

import java.io.IOException;
import java.io.OutputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1380a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public int f1381c;

    /* renamed from: d  reason: collision with root package name */
    public int f1382d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final OutputStream f1383e;

    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public f(OutputStream outputStream, byte[] bArr) {
        this.f1383e = outputStream;
        this.f1380a = bArr;
        this.f1381c = 0;
        this.b = bArr.length;
    }

    public static f a(OutputStream outputStream, int i) {
        return new f(outputStream, new byte[i]);
    }

    public static int b(int i, q qVar) {
        int h2 = h(i);
        int b2 = qVar.b();
        return h2 + g(b2) + b2;
    }

    public static int b(q qVar) {
        int b2 = qVar.b();
        return g(b2) + b2;
    }

    public static int c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int c(d dVar) {
        return dVar.size() + g(dVar.size());
    }

    public static int d(int i, int i2) {
        return h(i) + f(i2);
    }

    public static int e(int i, int i2) {
        return f(i2) + h(i);
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int h(int i) {
        return g((i << 3) | 0);
    }

    public void a() {
        if (this.f1383e != null) {
            b();
        }
    }

    public void a(int i, int i2) {
        e((i << 3) | 0);
        if (i2 >= 0) {
            e(i2);
        } else {
            b((long) i2);
        }
    }

    public void a(long j) {
        c(((int) j) & 255);
        c(((int) (j >> 8)) & 255);
        c(((int) (j >> 16)) & 255);
        c(((int) (j >> 24)) & 255);
        c(((int) (j >> 32)) & 255);
        c(((int) (j >> 40)) & 255);
        c(((int) (j >> 48)) & 255);
        c(((int) (j >> 56)) & 255);
    }

    public void a(d dVar) {
        e(dVar.size());
        b(dVar);
    }

    public void a(q qVar) {
        e(qVar.b());
        qVar.a(this);
    }

    public final void b() {
        OutputStream outputStream = this.f1383e;
        if (outputStream != null) {
            outputStream.write(this.f1380a, 0, this.f1381c);
            this.f1381c = 0;
            return;
        }
        throw new a();
    }

    public void b(int i) {
        if (i >= 0) {
            e(i);
        } else {
            b((long) i);
        }
    }

    public void b(long j) {
        while ((-128 & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }

    public void c(int i) {
        byte b2 = (byte) i;
        if (this.f1381c == this.b) {
            b();
        }
        byte[] bArr = this.f1380a;
        int i2 = this.f1381c;
        this.f1381c = i2 + 1;
        bArr[i2] = b2;
        this.f1382d++;
    }

    public void c(int i, int i2) {
        e((i << 3) | i2);
    }

    public void d(int i) {
        c(i & 255);
        c((i >> 8) & 255);
        c((i >> 16) & 255);
        c((i >> 24) & 255);
    }

    public void e(int i) {
        while ((i & -128) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }

    public void b(int i, int i2) {
        e((i << 3) | 0);
        if (i2 >= 0) {
            e(i2);
        } else {
            b((long) i2);
        }
    }

    public void a(int i) {
        if (i >= 0) {
            e(i);
        } else {
            b((long) i);
        }
    }

    public void a(int i, q qVar) {
        e((i << 3) | 2);
        e(qVar.b());
        qVar.a(this);
    }

    public void b(d dVar) {
        int size = dVar.size();
        int i = this.b;
        int i2 = this.f1381c;
        int i3 = i - i2;
        if (i3 >= size) {
            dVar.a(this.f1380a, 0, i2, size);
            this.f1381c += size;
        } else {
            dVar.a(this.f1380a, 0, i2, i3);
            int i4 = 0 + i3;
            size -= i3;
            this.f1381c = this.b;
            this.f1382d += i3;
            b();
            if (size <= this.b) {
                dVar.a(this.f1380a, i4, 0, size);
                this.f1381c = size;
            } else {
                OutputStream outputStream = this.f1383e;
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Source offset < 0: ");
                    sb.append(i4);
                    throw new IndexOutOfBoundsException(sb.toString());
                } else if (size >= 0) {
                    int i5 = i4 + size;
                    if (i5 > dVar.size()) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Source end offset exceeded: ");
                        sb2.append(i5);
                        throw new IndexOutOfBoundsException(sb2.toString());
                    } else if (size > 0) {
                        dVar.a(outputStream, i4, size);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(23);
                    sb3.append("Length < 0: ");
                    sb3.append(size);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
            }
        }
        this.f1382d += size;
    }

    public void a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.f1381c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.f1380a, i2, length);
            this.f1381c += length;
        } else {
            System.arraycopy(bArr, 0, this.f1380a, i2, i3);
            int i4 = 0 + i3;
            length -= i3;
            this.f1381c = this.b;
            this.f1382d += i3;
            b();
            if (length <= this.b) {
                System.arraycopy(bArr, i4, this.f1380a, 0, length);
                this.f1381c = length;
            } else {
                this.f1383e.write(bArr, i4, length);
            }
        }
        this.f1382d += length;
    }
}

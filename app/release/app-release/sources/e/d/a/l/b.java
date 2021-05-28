package e.d.a.l;

import java.io.OutputStream;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f3928a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f3929c;

    /* renamed from: d  reason: collision with root package name */
    public int f3930d;

    /* renamed from: e  reason: collision with root package name */
    public int f3931e;

    /* renamed from: f  reason: collision with root package name */
    public int f3932f;

    /* renamed from: g  reason: collision with root package name */
    public int f3933g;

    /* renamed from: h  reason: collision with root package name */
    public int f3934h = 12;
    public int i;
    public int j = 4096;
    public int[] k = new int[5003];
    public int[] l = new int[5003];
    public int m = 5003;
    public int n = 0;
    public boolean o = false;
    public int p;
    public int q;
    public int r;
    public int s = 0;
    public int t = 0;
    public int[] u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public int v;
    public byte[] w = new byte[256];

    public b(int i2, int i3, byte[] bArr, int i4) {
        this.f3928a = i2;
        this.b = i3;
        this.f3929c = bArr;
        this.f3930d = Math.max(2, i4);
    }

    public final int a() {
        int i2 = this.f3931e;
        if (i2 == 0) {
            return -1;
        }
        this.f3931e = i2 - 1;
        byte[] bArr = this.f3929c;
        int i3 = this.f3932f;
        this.f3932f = i3 + 1;
        return bArr[i3] & 255;
    }

    public final int a(int i2) {
        return (1 << i2) - 1;
    }

    public void a(byte b2, OutputStream outputStream) {
        byte[] bArr = this.w;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        bArr[i2] = b2;
        if (i3 >= 254 && i3 > 0) {
            outputStream.write(i3);
            outputStream.write(this.w, 0, this.v);
            this.v = 0;
        }
    }

    public void a(int i2, OutputStream outputStream) {
        int i3 = this.s;
        int[] iArr = this.u;
        int i4 = this.t;
        int i5 = i3 & iArr[i4];
        this.s = i5;
        if (i4 > 0) {
            this.s = i5 | (i2 << i4);
        } else {
            this.s = i2;
        }
        int i6 = this.t + this.f3933g;
        while (true) {
            this.t = i6;
            if (i6 < 8) {
                break;
            }
            a((byte) (this.s & 255), outputStream);
            this.s >>= 8;
            i6 = this.t - 8;
        }
        if (this.n > this.i || this.o) {
            if (this.o) {
                int i7 = this.p;
                this.f3933g = i7;
                this.i = a(i7);
                this.o = false;
            } else {
                int i8 = this.f3933g + 1;
                this.f3933g = i8;
                this.i = i8 == this.f3934h ? this.j : a(i8);
            }
        }
        if (i2 == this.r) {
            while (this.t > 0) {
                a((byte) (this.s & 255), outputStream);
                this.s >>= 8;
                this.t -= 8;
            }
            int i9 = this.v;
            if (i9 > 0) {
                outputStream.write(i9);
                outputStream.write(this.w, 0, this.v);
                this.v = 0;
            }
        }
    }
}

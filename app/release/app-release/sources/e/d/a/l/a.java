package e.d.a.l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f3921a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f3922c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f3923d;

    /* renamed from: e  reason: collision with root package name */
    public int f3924e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f3925f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3926g = false;

    /* renamed from: h  reason: collision with root package name */
    public OutputStream f3927h;
    public Bitmap i;
    public byte[] j;
    public byte[] k;
    public int l;
    public byte[] m;
    public boolean[] n = new boolean[256];
    public int o = 7;
    public int p = -1;
    public boolean q = false;
    public boolean r = true;
    public boolean s = false;
    public int t = 10;
    public boolean u;

    public final int a(int i2) {
        if (this.m == null) {
            return -1;
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        int i3 = 16777216;
        int length = this.m.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte[] bArr = this.m;
            int i6 = i4 + 1;
            int i7 = red - (bArr[i4] & 255);
            int i8 = i6 + 1;
            int i9 = green - (bArr[i6] & 255);
            int i10 = blue - (bArr[i8] & 255);
            int i11 = i10 * i10;
            int i12 = i11 + (i9 * i9) + (i7 * i7);
            int i13 = i8 / 3;
            if (this.n[i13] && i12 < i3) {
                i5 = i13;
                i3 = i12;
            }
            i4 = i8 + 1;
        }
        return i5;
    }

    public final void a(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            this.f3927h.write((byte) str.charAt(i2));
        }
    }

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.f3926g) {
            return false;
        }
        try {
            if (!this.s) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (!this.f3926g || this.r) {
                    this.f3921a = width;
                    this.b = height;
                    if (width < 1) {
                        this.f3921a = 320;
                    }
                    if (this.b < 1) {
                        this.b = 240;
                    }
                    this.s = true;
                }
            }
            this.i = bitmap;
            b();
            a();
            if (this.r) {
                b(this.f3921a);
                b(this.b);
                this.f3927h.write(this.o | 240);
                this.f3927h.write(0);
                this.f3927h.write(0);
                e();
                if (this.f3924e >= 0) {
                    d();
                }
            }
            c();
            this.f3927h.write(44);
            b(0);
            b(0);
            b(this.f3921a);
            b(this.b);
            if (this.r) {
                this.f3927h.write(0);
            } else {
                this.f3927h.write(this.o | 128);
            }
            if (!this.r) {
                e();
            }
            f();
            this.r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b() {
        int width = this.i.getWidth();
        int height = this.i.getHeight();
        if (!(width == this.f3921a && height == this.b)) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f3921a, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.i = createBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        this.i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.j = new byte[(i2 * 3)];
        boolean z = false;
        this.u = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = iArr[i3];
            if (i6 == 0) {
                i4++;
            }
            byte[] bArr = this.j;
            int i7 = i5 + 1;
            bArr[i5] = (byte) (i6 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i6 >> 8) & 255);
            bArr[i8] = (byte) ((i6 >> 16) & 255);
            i3++;
            i5 = i8 + 1;
        }
        double d2 = (double) (i4 * 100);
        double d3 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        if (d4 > 4.0d) {
            z = true;
        }
        this.u = z;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            Log.d("AnimatedGifEncoder", "got pixels for frame with " + d4 + "% transparent pixels");
        }
    }

    public final void b(int i2) {
        this.f3927h.write(i2 & 255);
        this.f3927h.write((i2 >> 8) & 255);
    }

    public final void c() {
        int i2;
        int i3;
        this.f3927h.write(33);
        this.f3927h.write(249);
        this.f3927h.write(4);
        if (this.f3922c != null || this.u) {
            i3 = 1;
            i2 = 2;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i4 = this.p;
        if (i4 >= 0) {
            i2 = i4 & 7;
        }
        this.f3927h.write(i3 | (i2 << 2) | 0 | 0);
        b(this.f3925f);
        this.f3927h.write(this.f3923d);
        this.f3927h.write(0);
    }

    public final void d() {
        this.f3927h.write(33);
        this.f3927h.write(255);
        this.f3927h.write(11);
        a("NETSCAPE2.0");
        this.f3927h.write(3);
        this.f3927h.write(1);
        b(this.f3924e);
        this.f3927h.write(0);
    }

    public final void e() {
        OutputStream outputStream = this.f3927h;
        byte[] bArr = this.m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.m.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f3927h.write(0);
        }
    }

    public final void f() {
        b bVar = new b(this.f3921a, this.b, this.k, this.l);
        OutputStream outputStream = this.f3927h;
        outputStream.write(bVar.f3930d);
        bVar.f3931e = bVar.f3928a * bVar.b;
        bVar.f3932f = 0;
        int i2 = bVar.f3930d + 1;
        bVar.p = i2;
        bVar.o = false;
        bVar.f3933g = i2;
        bVar.i = bVar.a(i2);
        int i3 = 1 << (i2 - 1);
        bVar.q = i3;
        bVar.r = i3 + 1;
        bVar.n = i3 + 2;
        bVar.v = 0;
        int a2 = bVar.a();
        int i4 = 0;
        for (int i5 = bVar.m; i5 < 65536; i5 *= 2) {
            i4++;
        }
        int i6 = 8 - i4;
        int i7 = bVar.m;
        for (int i8 = 0; i8 < i7; i8++) {
            bVar.k[i8] = -1;
        }
        bVar.a(bVar.q, outputStream);
        while (true) {
            int a3 = bVar.a();
            if (a3 != -1) {
                int i9 = (a3 << bVar.f3934h) + a2;
                int i10 = (a3 << i6) ^ a2;
                int[] iArr = bVar.k;
                if (iArr[i10] == i9) {
                    a2 = bVar.l[i10];
                } else if (iArr[i10] >= 0) {
                    int i11 = i7 - i10;
                    if (i10 == 0) {
                        i11 = 1;
                    }
                    while (true) {
                        i10 -= i11;
                        if (i10 < 0) {
                            i10 += i7;
                        }
                        int[] iArr2 = bVar.k;
                        if (iArr2[i10] != i9) {
                            if (iArr2[i10] < 0) {
                                break;
                            }
                        } else {
                            a2 = bVar.l[i10];
                            break;
                        }
                    }
                } else {
                    bVar.a(a2, outputStream);
                    int i12 = bVar.n;
                    if (i12 < bVar.j) {
                        int[] iArr3 = bVar.l;
                        bVar.n = i12 + 1;
                        iArr3[i10] = i12;
                        bVar.k[i10] = i9;
                    } else {
                        int i13 = bVar.m;
                        for (int i14 = 0; i14 < i13; i14++) {
                            bVar.k[i14] = -1;
                        }
                        int i15 = bVar.q;
                        bVar.n = i15 + 2;
                        bVar.o = true;
                        bVar.a(i15, outputStream);
                    }
                    a2 = a3;
                }
            } else {
                bVar.a(a2, outputStream);
                bVar.a(bVar.r, outputStream);
                outputStream.write(0);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 974
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.l.a.a():void");
    }
}

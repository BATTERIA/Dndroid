package e.d.a.k;

import android.util.Log;
import e.a.a.a.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3918a = new byte[256];
    public ByteBuffer b;

    /* renamed from: c  reason: collision with root package name */
    public c f3919c;

    /* renamed from: d  reason: collision with root package name */
    public int f3920d = 0;

    public d a(byte[] bArr) {
        this.b = null;
        Arrays.fill(this.f3918a, (byte) 0);
        c cVar = new c();
        this.f3919c = cVar;
        this.f3920d = 0;
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.b = wrap;
            wrap.rewind();
            this.b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.b = null;
            cVar.b = 2;
        }
        return this;
    }

    public final boolean a() {
        return this.f3919c.b != 0;
    }

    public final int[] a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f3919c.b = 1;
        }
        return iArr;
    }

    public c b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f3919c;
        } else {
            String str = "";
            for (int i = 0; i < 6; i++) {
                StringBuilder a2 = a.a(str);
                a2.append((char) c());
                str = a2.toString();
            }
            if (!str.startsWith("GIF")) {
                this.f3919c.b = 1;
            } else {
                this.f3919c.f3915f = e();
                this.f3919c.f3916g = e();
                int c2 = c();
                this.f3919c.f3917h = (c2 & 128) != 0;
                c cVar = this.f3919c;
                cVar.i = 2 << (c2 & 7);
                cVar.j = c();
                this.f3919c.k = c();
                if (this.f3919c.f3917h && !a()) {
                    c cVar2 = this.f3919c;
                    cVar2.f3911a = a(cVar2.i);
                    c cVar3 = this.f3919c;
                    cVar3.l = cVar3.f3911a[cVar3.j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a()) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 != 249) {
                                if (c4 != 254 && c4 == 255) {
                                    d();
                                    String str2 = "";
                                    for (int i2 = 0; i2 < 11; i2++) {
                                        StringBuilder a3 = a.a(str2);
                                        a3.append((char) this.f3918a[i2]);
                                        str2 = a3.toString();
                                    }
                                    if (str2.equals("NETSCAPE2.0")) {
                                        do {
                                            d();
                                            byte[] bArr = this.f3918a;
                                            if (bArr[0] == 1) {
                                                this.f3919c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                            }
                                            if (this.f3920d <= 0) {
                                                break;
                                            }
                                        } while (!a());
                                    }
                                }
                            } else {
                                this.f3919c.f3913d = new b();
                                c();
                                int c5 = c();
                                b bVar = this.f3919c.f3913d;
                                int i3 = (c5 & 28) >> 2;
                                bVar.f3909g = i3;
                                if (i3 == 0) {
                                    bVar.f3909g = 1;
                                }
                                this.f3919c.f3913d.f3908f = (c5 & 1) != 0;
                                int e2 = e();
                                if (e2 < 3) {
                                    e2 = 10;
                                }
                                b bVar2 = this.f3919c.f3913d;
                                bVar2.i = e2 * 10;
                                bVar2.f3910h = c();
                                c();
                            }
                        }
                        f();
                    } else if (c3 == 44) {
                        c cVar4 = this.f3919c;
                        if (cVar4.f3913d == null) {
                            cVar4.f3913d = new b();
                        }
                        this.f3919c.f3913d.f3904a = e();
                        this.f3919c.f3913d.b = e();
                        this.f3919c.f3913d.f3905c = e();
                        this.f3919c.f3913d.f3906d = e();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                        this.f3919c.f3913d.f3907e = (c6 & 64) != 0;
                        b bVar3 = this.f3919c.f3913d;
                        if (z2) {
                            bVar3.k = a(pow);
                        } else {
                            bVar3.k = null;
                        }
                        this.f3919c.f3913d.j = this.b.position();
                        c();
                        f();
                        if (!a()) {
                            c cVar5 = this.f3919c;
                            cVar5.f3912c++;
                            cVar5.f3914e.add(cVar5.f3913d);
                        }
                    } else if (c3 != 59) {
                        this.f3919c.b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar6 = this.f3919c;
                if (cVar6.f3912c < 0) {
                    cVar6.b = 1;
                }
            }
            return this.f3919c;
        }
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.f3919c.b = 1;
            return 0;
        }
    }

    public final int d() {
        int c2 = c();
        this.f3920d = c2;
        int i = 0;
        if (c2 > 0) {
            int i2 = 0;
            while (i < this.f3920d) {
                try {
                    i2 = this.f3920d - i;
                    this.b.get(this.f3918a, i, i2);
                    i += i2;
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f3920d, e2);
                    }
                    this.f3919c.b = 1;
                }
            }
        }
        return i;
    }

    public final int e() {
        return this.b.getShort();
    }

    public final void f() {
        int c2;
        do {
            c2 = c();
            ByteBuffer byteBuffer = this.b;
            byteBuffer.position(byteBuffer.position() + c2);
        } while (c2 > 0);
    }
}

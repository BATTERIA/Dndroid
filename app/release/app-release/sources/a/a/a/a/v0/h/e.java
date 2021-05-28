package a.a.a.a.v0.h;

import d.b.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1373a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public int f1374c;

    /* renamed from: d  reason: collision with root package name */
    public int f1375d;

    /* renamed from: e  reason: collision with root package name */
    public int f1376e;

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f1377f;

    /* renamed from: g  reason: collision with root package name */
    public int f1378g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1379h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public a n;

    public interface a {
        void a();
    }

    public e(p pVar) {
        this.f1379h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.f1373a = pVar.f1414d;
        int j2 = pVar.j();
        this.f1376e = j2;
        this.f1374c = pVar.size() + j2;
        this.i = -this.f1376e;
        this.f1377f = null;
        this.b = true;
    }

    public e(InputStream inputStream) {
        this.f1379h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.f1373a = new byte[4096];
        this.f1374c = 0;
        this.f1376e = 0;
        this.i = 0;
        this.f1377f = inputStream;
        this.b = false;
    }

    public int a() {
        int i2 = this.j;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.i + this.f1376e);
    }

    public void a(int i2) {
        if (this.f1378g != i2) {
            throw new k("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void b(int i2) {
        this.j = i2;
        k();
    }

    public boolean b() {
        return h() != 0;
    }

    public int c(int i2) {
        if (i2 >= 0) {
            int i3 = this.i + this.f1376e + i2;
            int i4 = this.j;
            if (i3 <= i4) {
                this.j = i3;
                k();
                return i4;
            }
            throw k.c();
        }
        throw k.a();
    }

    public d c() {
        int g2 = g();
        if (g2 > this.f1374c - this.f1376e || g2 <= 0) {
            return g2 == 0 ? d.f1366c : new p(d(g2));
        }
        d a2 = (!this.b || !this.f1379h) ? d.a(this.f1373a, this.f1376e, g2) : new c(this.f1373a, this.f1376e, g2);
        this.f1376e += g2;
        return a2;
    }

    public int d() {
        return g();
    }

    public final byte[] d(int i2) {
        if (i2 > 0) {
            int i3 = this.i;
            int i4 = this.f1376e;
            int i5 = i3 + i4 + i2;
            int i6 = this.j;
            if (i5 > i6) {
                f((i6 - i3) - i4);
                throw k.c();
            } else if (i2 < 4096) {
                byte[] bArr = new byte[i2];
                int i7 = this.f1374c - i4;
                System.arraycopy(this.f1373a, i4, bArr, 0, i7);
                int i8 = this.f1374c;
                this.f1376e = i8;
                int i9 = i2 - i7;
                if (i8 - i8 >= i9 || g(i9)) {
                    System.arraycopy(this.f1373a, 0, bArr, i7, i9);
                    this.f1376e = i9;
                    return bArr;
                }
                throw k.c();
            } else {
                int i10 = this.f1374c;
                this.i = i3 + i10;
                this.f1376e = 0;
                this.f1374c = 0;
                int i11 = i10 - i4;
                int i12 = i2 - i11;
                ArrayList arrayList = new ArrayList();
                while (i12 > 0) {
                    int min = Math.min(i12, 4096);
                    byte[] bArr2 = new byte[min];
                    int i13 = 0;
                    while (i13 < min) {
                        InputStream inputStream = this.f1377f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i13, min - i13);
                        if (read != -1) {
                            this.i += read;
                            i13 += read;
                        } else {
                            throw k.c();
                        }
                    }
                    i12 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(this.f1373a, i4, bArr3, 0, i11);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
                    i11 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i2 == 0) {
            return j.f1406a;
        } else {
            throw k.a();
        }
    }

    public int e() {
        int i2 = this.f1376e;
        if (this.f1374c - i2 < 4) {
            e(4);
            i2 = this.f1376e;
        }
        byte[] bArr = this.f1373a;
        this.f1376e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final void e(int i2) {
        if (!g(i2)) {
            throw k.c();
        }
    }

    public long f() {
        int i2 = this.f1376e;
        if (this.f1374c - i2 < 8) {
            e(8);
            i2 = this.f1376e;
        }
        byte[] bArr = this.f1373a;
        this.f1376e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public void f(int i2) {
        int i3 = this.f1374c;
        int i4 = this.f1376e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.f1376e = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.i;
            int i6 = this.f1376e;
            int i7 = i5 + i6 + i2;
            int i8 = this.j;
            if (i7 <= i8) {
                int i9 = this.f1374c;
                int i10 = i9 - i6;
                this.f1376e = i9;
                while (true) {
                    e(1);
                    int i11 = i2 - i10;
                    int i12 = this.f1374c;
                    if (i11 > i12) {
                        i10 += i12;
                        this.f1376e = i12;
                    } else {
                        this.f1376e = i11;
                        return;
                    }
                }
            } else {
                f((i8 - i5) - i6);
                throw k.c();
            }
        } else {
            throw k.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r2[r3] < 0) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.e.g():int");
    }

    public final boolean g(int i2) {
        int i3 = this.f1376e;
        if (i3 + i2 <= this.f1374c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.i + i3 + i2 > this.j) {
            return false;
        } else {
            a aVar = this.n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f1377f != null) {
                int i4 = this.f1376e;
                if (i4 > 0) {
                    int i5 = this.f1374c;
                    if (i5 > i4) {
                        byte[] bArr = this.f1373a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.i += i4;
                    this.f1374c -= i4;
                    this.f1376e = 0;
                }
                InputStream inputStream = this.f1377f;
                byte[] bArr2 = this.f1373a;
                int i6 = this.f1374c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.f1373a.length) {
                    StringBuilder sb2 = new StringBuilder((int) j.AppCompatTheme_textAppearanceSearchResultTitle);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f1374c += read;
                    if ((this.i + i2) - this.m <= 0) {
                        k();
                        if (this.f1374c >= i2) {
                            return true;
                        }
                        return g(i2);
                    }
                    throw new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long h() {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.e.h():long");
    }

    public long i() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f1376e == this.f1374c) {
                e(1);
            }
            byte[] bArr = this.f1373a;
            int i3 = this.f1376e;
            this.f1376e = i3 + 1;
            byte b2 = bArr[i3];
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
            if ((b2 & 128) == 0) {
                return j2;
            }
        }
        throw new k("CodedInputStream encountered a malformed varint.");
    }

    public int j() {
        boolean z = true;
        if (this.f1376e != this.f1374c || g(1)) {
            z = false;
        }
        if (z) {
            this.f1378g = 0;
            return 0;
        }
        int g2 = g();
        this.f1378g = g2;
        if ((g2 >>> 3) != 0) {
            return g2;
        }
        throw new k("Protocol message contained an invalid tag (zero).");
    }

    public final void k() {
        int i2 = this.f1374c + this.f1375d;
        this.f1374c = i2;
        int i3 = this.i + i2;
        int i4 = this.j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f1375d = i5;
            this.f1374c = i2 - i5;
            return;
        }
        this.f1375d = 0;
    }

    public <T extends q> T a(s<T> sVar, g gVar) {
        int g2 = g();
        if (this.k < this.l) {
            int c2 = c(g2);
            this.k++;
            T a2 = sVar.a(this, gVar);
            a(0);
            this.k--;
            this.j = c2;
            k();
            return a2;
        }
        throw k.b();
    }

    public boolean a(int i2, f fVar) {
        int j2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            long h2 = h();
            fVar.e(i2);
            fVar.b(h2);
            return true;
        } else if (i3 == 1) {
            long f2 = f();
            fVar.e(i2);
            fVar.a(f2);
            return true;
        } else if (i3 == 2) {
            d c2 = c();
            fVar.e(i2);
            fVar.a(c2);
            return true;
        } else if (i3 == 3) {
            fVar.e(i2);
            do {
                j2 = j();
                if (j2 == 0) {
                    break;
                }
            } while (a(j2, fVar));
            int i4 = ((i2 >>> 3) << 3) | 4;
            a(i4);
            fVar.e(i4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                int e2 = e();
                fVar.e(i2);
                fVar.d(e2);
                return true;
            }
            throw new k("Protocol message tag had invalid wire type.");
        }
    }
}

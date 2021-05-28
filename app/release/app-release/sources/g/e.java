package g;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5426e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c  reason: collision with root package name */
    public t f5427c;

    /* renamed from: d  reason: collision with root package name */
    public long f5428d;

    public static final class a implements Closeable {

        /* renamed from: c  reason: collision with root package name */
        public e f5429c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5430d;

        /* renamed from: e  reason: collision with root package name */
        public t f5431e;

        /* renamed from: f  reason: collision with root package name */
        public long f5432f = -1;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f5433g;

        /* renamed from: h  reason: collision with root package name */
        public int f5434h = -1;
        public int i = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5429c != null) {
                this.f5429c = null;
                this.f5431e = null;
                this.f5432f = -1;
                this.f5433g = null;
                this.f5434h = -1;
                this.i = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int f(long j) {
            if (j >= -1) {
                e eVar = this.f5429c;
                long j2 = eVar.f5428d;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f5431e = null;
                        this.f5432f = j;
                        this.f5433g = null;
                        this.f5434h = -1;
                        this.i = -1;
                        return -1;
                    }
                    long j3 = 0;
                    t tVar = eVar.f5427c;
                    t tVar2 = this.f5431e;
                    if (tVar2 != null) {
                        long j4 = this.f5432f - ((long) (this.f5434h - tVar2.b));
                        if (j4 > j) {
                            j2 = j4;
                            tVar2 = tVar;
                            tVar = tVar2;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        tVar2 = tVar;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i2 = tVar2.f5466c;
                            int i3 = tVar2.b;
                            if (j < ((long) (i2 - i3)) + j3) {
                                break;
                            }
                            j3 += (long) (i2 - i3);
                            tVar2 = tVar2.f5469f;
                        }
                    } else {
                        while (j2 > j) {
                            tVar = tVar.f5470g;
                            j2 -= (long) (tVar.f5466c - tVar.b);
                        }
                        tVar2 = tVar;
                        j3 = j2;
                    }
                    if (this.f5430d && tVar2.f5467d) {
                        t tVar3 = new t((byte[]) tVar2.f5465a.clone(), tVar2.b, tVar2.f5466c, false, true);
                        e eVar2 = this.f5429c;
                        if (eVar2.f5427c == tVar2) {
                            eVar2.f5427c = tVar3;
                        }
                        tVar2.a(tVar3);
                        tVar3.f5470g.a();
                        tVar2 = tVar3;
                    }
                    this.f5431e = tVar2;
                    this.f5432f = j;
                    this.f5433g = tVar2.f5465a;
                    int i4 = tVar2.b + ((int) (j - j3));
                    this.f5434h = i4;
                    int i5 = tVar2.f5466c;
                    this.i = i5;
                    return i5 - i4;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f5429c.f5428d)));
        }
    }

    @Override // g.g
    public int a(q qVar) {
        int a2 = a(qVar, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            skip((long) qVar.f5457c[a2].h());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public int a(q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        t tVar;
        int i4;
        t tVar2 = this.f5427c;
        int i5 = -2;
        if (tVar2 != null) {
            byte[] bArr = tVar2.f5465a;
            int i6 = tVar2.b;
            int i7 = tVar2.f5466c;
            int[] iArr = qVar.f5458d;
            t tVar3 = tVar2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (tVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = (i11 * -1) + i12;
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != iArr[i12]) {
                            return i9;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 == i7) {
                            t tVar4 = tVar3.f5469f;
                            i4 = tVar4.b;
                            byte[] bArr2 = tVar4.f5465a;
                            i3 = tVar4.f5466c;
                            if (tVar4 != tVar2) {
                                tVar = tVar4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                tVar = null;
                            }
                        } else {
                            i3 = i7;
                            i4 = i15;
                            tVar = tVar3;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            tVar3 = tVar;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        tVar3 = tVar;
                    }
                } else {
                    int i17 = i6 + 1;
                    int i18 = bArr[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (i18 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                tVar3 = tVar3.f5469f;
                                i2 = tVar3.b;
                                bArr = tVar3.f5465a;
                                i7 = tVar3.f5466c;
                                if (tVar3 == tVar2) {
                                    tVar3 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            return z ? i5 : i9;
        } else if (z) {
            return -2;
        } else {
            return qVar.indexOf(h.f5436g);
        }
    }

    public int a(byte[] bArr, int i, int i2) {
        z.a((long) bArr.length, (long) i, (long) i2);
        t tVar = this.f5427c;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i2, tVar.f5466c - tVar.b);
        System.arraycopy(tVar.f5465a, tVar.b, bArr, i, min);
        int i3 = tVar.b + min;
        tVar.b = i3;
        this.f5428d -= (long) min;
        if (i3 == tVar.f5466c) {
            this.f5427c = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    @Override // g.g
    public long a(byte b) {
        return a(b, 0, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        t tVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f5428d), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f5428d;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (tVar = this.f5427c) == null) {
            return -1;
        }
        long j5 = this.f5428d;
        if (j5 - j < j) {
            while (j5 > j) {
                tVar = tVar.f5470g;
                j5 -= (long) (tVar.f5466c - tVar.b);
            }
        } else {
            while (true) {
                long j6 = ((long) (tVar.f5466c - tVar.b)) + j3;
                if (j6 >= j) {
                    break;
                }
                tVar = tVar.f5469f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = tVar.f5465a;
            int min = (int) Math.min((long) tVar.f5466c, (((long) tVar.b) + j4) - j5);
            for (int i = (int) ((((long) tVar.b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - tVar.b)) + j5;
                }
            }
            j5 += (long) (tVar.f5466c - tVar.b);
            tVar = tVar.f5469f;
            j7 = j5;
        }
        return -1;
    }

    public long a(x xVar) {
        if (xVar != null) {
            long j = 0;
            while (true) {
                long c2 = xVar.c(this, 8192);
                if (c2 == -1) {
                    return j;
                }
                j += c2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final a a(a aVar) {
        if (aVar.f5429c == null) {
            aVar.f5429c = this;
            aVar.f5430d = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // g.f
    public e a(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        t a2 = a(numberOfTrailingZeros);
        byte[] bArr = a2.f5465a;
        int i = a2.f5466c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f5426e[(int) (15 & j)];
            j >>>= 4;
        }
        a2.f5466c += numberOfTrailingZeros;
        this.f5428d += (long) numberOfTrailingZeros;
        return this;
    }

    public final e a(e eVar, long j, long j2) {
        if (eVar != null) {
            z.a(this.f5428d, j, j2);
            if (j2 == 0) {
                return this;
            }
            eVar.f5428d += j2;
            t tVar = this.f5427c;
            while (true) {
                int i = tVar.f5466c;
                int i2 = tVar.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                tVar = tVar.f5469f;
            }
            while (j2 > 0) {
                t b = tVar.b();
                int i3 = (int) (((long) b.b) + j);
                b.b = i3;
                b.f5466c = Math.min(i3 + ((int) j2), b.f5466c);
                t tVar2 = eVar.f5427c;
                if (tVar2 == null) {
                    b.f5470g = b;
                    b.f5469f = b;
                    eVar.f5427c = b;
                } else {
                    tVar2.f5470g.a(b);
                }
                j2 -= (long) (b.f5466c - b.b);
                tVar = tVar.f5469f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public e a(h hVar) {
        if (hVar != null) {
            hVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // g.f
    public e a(String str) {
        a(str, 0, str.length());
        return this;
    }

    public e a(String str, int i, int i2) {
        int i3;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException(e.a.a.a.a.a("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    t a2 = a(1);
                    byte[] bArr = a2.f5465a;
                    int i4 = a2.f5466c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt2;
                    while (true) {
                        i = i5;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i6 = a2.f5466c;
                            int i7 = (i4 + i) - i6;
                            a2.f5466c = i6 + i7;
                            this.f5428d += (long) i7;
                        } else {
                            i5 = i + 1;
                            bArr[i + i4] = (byte) charAt;
                        }
                    }
                    int i62 = a2.f5466c;
                    int i72 = (i4 + i) - i62;
                    a2.f5466c = i62 + i72;
                    this.f5428d += (long) i72;
                } else {
                    if (charAt2 < 2048) {
                        i3 = (charAt2 >> 6) | 192;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        writeByte((charAt2 >> '\f') | 224);
                        i3 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            writeByte((i9 >> 18) | 240);
                            writeByte(((i9 >> 12) & 63) | 128);
                            writeByte(((i9 >> 6) & 63) | 128);
                            writeByte((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    writeByte(i3);
                    writeByte((charAt2 & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder a3 = e.a.a.a.a.a("endIndex > string.length: ", i2, " > ");
            a3.append(str.length());
            throw new IllegalArgumentException(a3.toString());
        }
    }

    public t a(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        t tVar = this.f5427c;
        if (tVar == null) {
            t a2 = u.a();
            this.f5427c = a2;
            a2.f5470g = a2;
            a2.f5469f = a2;
            return a2;
        }
        t tVar2 = tVar.f5470g;
        if (tVar2.f5466c + i <= 8192 && tVar2.f5468e) {
            return tVar2;
        }
        t a3 = u.a();
        tVar2.a(a3);
        return a3;
    }

    public String a(long j, Charset charset) {
        z.a(this.f5428d, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            t tVar = this.f5427c;
            if (((long) tVar.b) + j > ((long) tVar.f5466c)) {
                return new String(e(j), charset);
            }
            String str = new String(tVar.f5465a, tVar.b, (int) j, charset);
            int i = (int) (((long) tVar.b) + j);
            tVar.b = i;
            this.f5428d -= j;
            if (i == tVar.f5466c) {
                this.f5427c = tVar.a();
                u.a(tVar);
            }
            return str;
        }
    }

    @Override // g.g
    public String a(Charset charset) {
        try {
            return a(this.f5428d, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // g.w
    public void a(e eVar, long j) {
        t tVar;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            z.a(eVar.f5428d, 0, j);
            while (j > 0) {
                t tVar2 = eVar.f5427c;
                int i = 0;
                if (j < ((long) (tVar2.f5466c - tVar2.b))) {
                    t tVar3 = this.f5427c;
                    t tVar4 = tVar3 != null ? tVar3.f5470g : null;
                    if (tVar4 != null && tVar4.f5468e) {
                        if ((((long) tVar4.f5466c) + j) - ((long) (tVar4.f5467d ? 0 : tVar4.b)) <= 8192) {
                            eVar.f5427c.a(tVar4, (int) j);
                            eVar.f5428d -= j;
                            this.f5428d += j;
                            return;
                        }
                    }
                    t tVar5 = eVar.f5427c;
                    int i2 = (int) j;
                    if (tVar5 == null) {
                        throw null;
                    } else if (i2 <= 0 || i2 > tVar5.f5466c - tVar5.b) {
                        throw new IllegalArgumentException();
                    } else {
                        if (i2 >= 1024) {
                            tVar = tVar5.b();
                        } else {
                            tVar = u.a();
                            System.arraycopy(tVar5.f5465a, tVar5.b, tVar.f5465a, 0, i2);
                        }
                        tVar.f5466c = tVar.b + i2;
                        tVar5.b += i2;
                        tVar5.f5470g.a(tVar);
                        eVar.f5427c = tVar;
                    }
                }
                t tVar6 = eVar.f5427c;
                long j2 = (long) (tVar6.f5466c - tVar6.b);
                eVar.f5427c = tVar6.a();
                t tVar7 = this.f5427c;
                if (tVar7 == null) {
                    this.f5427c = tVar6;
                    tVar6.f5470g = tVar6;
                    tVar6.f5469f = tVar6;
                } else {
                    tVar7.f5470g.a(tVar6);
                    t tVar8 = tVar6.f5470g;
                    if (tVar8 == tVar6) {
                        throw new IllegalStateException();
                    } else if (tVar8.f5468e) {
                        int i3 = tVar6.f5466c - tVar6.b;
                        int i4 = 8192 - tVar8.f5466c;
                        if (!tVar8.f5467d) {
                            i = tVar8.b;
                        }
                        if (i3 <= i4 + i) {
                            tVar6.a(tVar6.f5470g, i3);
                            tVar6.a();
                            u.a(tVar6);
                        }
                    }
                }
                eVar.f5428d -= j2;
                this.f5428d += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // g.g, g.f
    public e b() {
        return this;
    }

    public e b(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i2 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i3 = (i >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    writeByte((i >> 18) | 240);
                    i3 = ((i >> 12) & 63) | 128;
                } else {
                    StringBuilder a2 = e.a.a.a.a.a("Unexpected code point: ");
                    a2.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(a2.toString());
                }
                writeByte(i3);
                i2 = ((i >> 6) & 63) | 128;
            }
            writeByte(i2);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    @Override // g.g
    public h b(long j) {
        return new h(e(j));
    }

    @Override // g.g
    public void b(e eVar, long j) {
        long j2 = this.f5428d;
        if (j2 >= j) {
            eVar.a(this, j);
        } else {
            eVar.a(this, j2);
            throw new EOFException();
        }
    }

    @Override // g.x
    public long c(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f5428d;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.a(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    @Override // g.x, g.w
    public y c() {
        return y.f5473d;
    }

    @Override // g.g
    public String c(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return g(a2);
            }
            if (j2 < this.f5428d && f(j2 - 1) == 13 && f(j2) == 10) {
                return g(j2);
            }
            e eVar = new e();
            a(eVar, 0, Math.min(32L, this.f5428d));
            StringBuilder a3 = e.a.a.a.a.a("\\n not found: limit=");
            a3.append(Math.min(this.f5428d, j));
            a3.append(" content=");
            a3.append(eVar.m().b());
            a3.append((char) 8230);
            throw new EOFException(a3.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // java.lang.Object
    public Object clone() {
        e eVar = new e();
        if (this.f5428d != 0) {
            t b = this.f5427c.b();
            eVar.f5427c = b;
            b.f5470g = b;
            b.f5469f = b;
            t tVar = this.f5427c;
            while (true) {
                tVar = tVar.f5469f;
                if (tVar == this.f5427c) {
                    break;
                }
                eVar.f5427c.f5470g.a(tVar.b());
            }
            eVar.f5428d = this.f5428d;
        }
        return eVar;
    }

    @Override // java.lang.AutoCloseable, g.x, g.w, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // g.g
    public short d() {
        return z.a(readShort());
    }

    @Override // g.g
    public void d(long j) {
        if (this.f5428d < j) {
            throw new EOFException();
        }
    }

    @Override // g.f
    public f e() {
        return this;
    }

    @Override // g.g
    public byte[] e(long j) {
        z.a(this.f5428d, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j = this.f5428d;
        if (j != eVar.f5428d) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        t tVar = this.f5427c;
        t tVar2 = eVar.f5427c;
        int i = tVar.b;
        int i2 = tVar2.b;
        while (j2 < this.f5428d) {
            long min = (long) Math.min(tVar.f5466c - i, tVar2.f5466c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (tVar.f5465a[i] != tVar2.f5465a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == tVar.f5466c) {
                tVar = tVar.f5469f;
                i = tVar.b;
            }
            if (i2 == tVar2.f5466c) {
                tVar2 = tVar2.f5469f;
                i2 = tVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final byte f(long j) {
        int i;
        z.a(this.f5428d, j, 1);
        long j2 = this.f5428d;
        if (j2 - j > j) {
            t tVar = this.f5427c;
            while (true) {
                int i2 = tVar.f5466c;
                int i3 = tVar.b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return tVar.f5465a[i3 + ((int) j)];
                }
                j -= j3;
                tVar = tVar.f5469f;
            }
        } else {
            long j4 = j - j2;
            t tVar2 = this.f5427c;
            do {
                tVar2 = tVar2.f5470g;
                int i4 = tVar2.f5466c;
                i = tVar2.b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return tVar2.f5465a[i + ((int) j4)];
        }
    }

    @Override // g.f
    public f f() {
        return this;
    }

    @Override // g.w, g.f, java.io.Flushable
    public void flush() {
    }

    @Override // g.g
    public String g() {
        return c(Long.MAX_VALUE);
    }

    public String g(long j) {
        String a2;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (f(j3) == 13) {
                a2 = a(j3, z.f5476a);
                j2 = 2;
                skip(j2);
                return a2;
            }
        }
        a2 = a(j, z.f5476a);
        skip(j2);
        return a2;
    }

    @Override // g.g
    public e getBuffer() {
        return this;
    }

    @Override // g.g
    public int h() {
        return z.a(readInt());
    }

    public int hashCode() {
        t tVar = this.f5427c;
        if (tVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = tVar.f5466c;
            for (int i3 = tVar.b; i3 < i2; i3++) {
                i = (i * 31) + tVar.f5465a[i3];
            }
            tVar = tVar.f5469f;
        } while (tVar != this.f5427c);
        return i;
    }

    @Override // g.g
    public boolean i() {
        return this.f5428d == 0;
    }

    public boolean isOpen() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (r8 != r9) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r15.f5427c = r6.a();
        g.u.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r1 != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f A[SYNTHETIC] */
    @Override // g.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long j() {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.j():long");
    }

    public final void k() {
        try {
            skip(this.f5428d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final long l() {
        long j = this.f5428d;
        if (j == 0) {
            return 0;
        }
        t tVar = this.f5427c.f5470g;
        int i = tVar.f5466c;
        return (i >= 8192 || !tVar.f5468e) ? j : j - ((long) (i - tVar.b));
    }

    public h m() {
        try {
            return new h(e(this.f5428d));
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String n() {
        try {
            return a(this.f5428d, z.f5476a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        t tVar = this.f5427c;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tVar.f5466c - tVar.b);
        byteBuffer.put(tVar.f5465a, tVar.b, min);
        int i = tVar.b + min;
        tVar.b = i;
        this.f5428d -= (long) min;
        if (i == tVar.f5466c) {
            this.f5427c = tVar.a();
            u.a(tVar);
        }
        return min;
    }

    @Override // g.g
    public byte readByte() {
        long j = this.f5428d;
        if (j != 0) {
            t tVar = this.f5427c;
            int i = tVar.b;
            int i2 = tVar.f5466c;
            int i3 = i + 1;
            byte b = tVar.f5465a[i];
            this.f5428d = j - 1;
            if (i3 == i2) {
                this.f5427c = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // g.g
    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // g.g
    public int readInt() {
        long j = this.f5428d;
        if (j >= 4) {
            t tVar = this.f5427c;
            int i = tVar.b;
            int i2 = tVar.f5466c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = tVar.f5465a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f5428d = j - 4;
            if (i8 == i2) {
                this.f5427c = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i8;
            }
            return i9;
        }
        StringBuilder a2 = e.a.a.a.a.a("size < 4: ");
        a2.append(this.f5428d);
        throw new IllegalStateException(a2.toString());
    }

    @Override // g.g
    public long readLong() {
        long j = this.f5428d;
        if (j >= 8) {
            t tVar = this.f5427c;
            int i = tVar.b;
            int i2 = tVar.f5466c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = tVar.f5465a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = (((long) bArr[i9]) & 255) | ((((long) bArr[i8]) & 255) << 8) | j2;
            this.f5428d = j - 8;
            if (i10 == i2) {
                this.f5427c = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i10;
            }
            return j3;
        }
        StringBuilder a2 = e.a.a.a.a.a("size < 8: ");
        a2.append(this.f5428d);
        throw new IllegalStateException(a2.toString());
    }

    @Override // g.g
    public short readShort() {
        long j = this.f5428d;
        if (j >= 2) {
            t tVar = this.f5427c;
            int i = tVar.b;
            int i2 = tVar.f5466c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = tVar.f5465a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f5428d = j - 2;
            if (i4 == i2) {
                this.f5427c = tVar.a();
                u.a(tVar);
            } else {
                tVar.b = i4;
            }
            return (short) i5;
        }
        StringBuilder a2 = e.a.a.a.a.a("size < 2: ");
        a2.append(this.f5428d);
        throw new IllegalStateException(a2.toString());
    }

    @Override // g.g
    public void skip(long j) {
        while (j > 0) {
            t tVar = this.f5427c;
            if (tVar != null) {
                int min = (int) Math.min(j, (long) (tVar.f5466c - tVar.b));
                long j2 = (long) min;
                this.f5428d -= j2;
                j -= j2;
                t tVar2 = this.f5427c;
                int i = tVar2.b + min;
                tVar2.b = i;
                if (i == tVar2.f5466c) {
                    this.f5427c = tVar2.a();
                    u.a(tVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        long j = this.f5428d;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? h.f5436g : new v(this, i)).toString();
        }
        StringBuilder a2 = e.a.a.a.a.a("size > Integer.MAX_VALUE: ");
        a2.append(this.f5428d);
        throw new IllegalArgumentException(a2.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                t a2 = a(1);
                int min = Math.min(i, 8192 - a2.f5466c);
                byteBuffer.get(a2.f5465a, a2.f5466c, min);
                i -= min;
                a2.f5466c += min;
            }
            this.f5428d += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // g.f
    public e write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // g.f
    public e write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            z.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                t a2 = a(1);
                int min = Math.min(i3 - i, 8192 - a2.f5466c);
                System.arraycopy(bArr, i, a2.f5465a, a2.f5466c, min);
                i += min;
                a2.f5466c += min;
            }
            this.f5428d += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // g.f
    public e writeByte(int i) {
        t a2 = a(1);
        byte[] bArr = a2.f5465a;
        int i2 = a2.f5466c;
        a2.f5466c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f5428d++;
        return this;
    }

    @Override // g.f
    public e writeInt(int i) {
        t a2 = a(4);
        byte[] bArr = a2.f5465a;
        int i2 = a2.f5466c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        a2.f5466c = i5 + 1;
        this.f5428d += 4;
        return this;
    }

    @Override // g.f
    public e writeShort(int i) {
        t a2 = a(2);
        byte[] bArr = a2.f5465a;
        int i2 = a2.f5466c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        a2.f5466c = i3 + 1;
        this.f5428d += 2;
        return this;
    }
}

package f.o0.n;

import g.e;
import g.f;
import g.h;
import g.t;
import g.w;
import g.y;
import java.io.IOException;
import java.util.Random;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5369a;
    public final Random b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5370c;

    /* renamed from: d  reason: collision with root package name */
    public final g.e f5371d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5372e;

    /* renamed from: f  reason: collision with root package name */
    public final g.e f5373f = new g.e();

    /* renamed from: g  reason: collision with root package name */
    public final a f5374g = new a();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5375h;
    public final byte[] i;
    public final e.a j;

    public final class a implements w {

        /* renamed from: c  reason: collision with root package name */
        public int f5376c;

        /* renamed from: d  reason: collision with root package name */
        public long f5377d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5378e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5379f;

        public a() {
        }

        @Override // g.w
        public void a(g.e eVar, long j) {
            boolean z;
            long l;
            if (!this.f5379f) {
                e.this.f5373f.a(eVar, j);
                if (this.f5378e) {
                    long j2 = this.f5377d;
                    if (j2 != -1 && e.this.f5373f.f5428d > j2 - 8192) {
                        z = true;
                        l = e.this.f5373f.l();
                        if (l > 0 && !z) {
                            e.this.a(this.f5376c, l, this.f5378e, false);
                            this.f5378e = false;
                            return;
                        }
                        return;
                    }
                }
                z = false;
                l = e.this.f5373f.l();
                if (l > 0) {
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // g.w
        public y c() {
            return e.this.f5370c.c();
        }

        @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5379f) {
                e eVar = e.this;
                eVar.a(this.f5376c, eVar.f5373f.f5428d, this.f5378e, true);
                this.f5379f = true;
                e.this.f5375h = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // g.w, java.io.Flushable
        public void flush() {
            if (!this.f5379f) {
                e eVar = e.this;
                eVar.a(this.f5376c, eVar.f5373f.f5428d, this.f5378e, false);
                this.f5378e = false;
                return;
            }
            throw new IOException("closed");
        }
    }

    public e(boolean z, f fVar, Random random) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f5369a = z;
            this.f5370c = fVar;
            this.f5371d = fVar.b();
            this.b = random;
            e.a aVar = null;
            this.i = z ? new byte[4] : null;
            this.j = z ? new e.a() : aVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    public void a(int i2, h hVar) {
        String d2;
        h hVar2 = h.f5436g;
        if (!(i2 == 0 && hVar == null)) {
            if (i2 == 0 || (d2 = a.a.a.a.v0.m.l1.a.d(i2)) == null) {
                g.e eVar = new g.e();
                eVar.writeShort(i2);
                if (hVar != null) {
                    eVar.a(hVar);
                }
                hVar2 = eVar.m();
            } else {
                throw new IllegalArgumentException(d2);
            }
        }
        try {
            b(8, hVar2);
        } finally {
            this.f5372e = true;
        }
    }

    public final void b(int i2, h hVar) {
        if (!this.f5372e) {
            int h2 = hVar.h();
            if (((long) h2) <= 125) {
                this.f5371d.writeByte(i2 | 128);
                if (this.f5369a) {
                    this.f5371d.writeByte(h2 | 128);
                    this.b.nextBytes(this.i);
                    this.f5371d.write(this.i);
                    if (h2 > 0) {
                        g.e eVar = this.f5371d;
                        long j2 = eVar.f5428d;
                        eVar.a(hVar);
                        this.f5371d.a(this.j);
                        this.j.f(j2);
                        a.a.a.a.v0.m.l1.a.a(this.j, this.i);
                        this.j.close();
                    }
                } else {
                    this.f5371d.writeByte(h2);
                    this.f5371d.a(hVar);
                }
                this.f5370c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public void a(int i2, long j2, boolean z, boolean z2) {
        if (!this.f5372e) {
            int i3 = 0;
            if (!z) {
                i2 = 0;
            }
            if (z2) {
                i2 |= 128;
            }
            this.f5371d.writeByte(i2);
            if (this.f5369a) {
                i3 = 128;
            }
            if (j2 <= 125) {
                this.f5371d.writeByte(((int) j2) | i3);
            } else if (j2 <= 65535) {
                this.f5371d.writeByte(i3 | 126);
                this.f5371d.writeShort((int) j2);
            } else {
                this.f5371d.writeByte(i3 | 127);
                g.e eVar = this.f5371d;
                t a2 = eVar.a(8);
                byte[] bArr = a2.f5465a;
                int i4 = a2.f5466c;
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) ((j2 >>> 56) & 255));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) ((j2 >>> 48) & 255));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) ((j2 >>> 40) & 255));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) ((j2 >>> 32) & 255));
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((int) ((j2 >>> 24) & 255));
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((int) ((j2 >>> 16) & 255));
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((int) ((j2 >>> 8) & 255));
                bArr[i11] = (byte) ((int) (j2 & 255));
                a2.f5466c = i11 + 1;
                eVar.f5428d += 8;
            }
            if (this.f5369a) {
                this.b.nextBytes(this.i);
                this.f5371d.write(this.i);
                if (j2 > 0) {
                    g.e eVar2 = this.f5371d;
                    long j3 = eVar2.f5428d;
                    eVar2.a(this.f5373f, j2);
                    this.f5371d.a(this.j);
                    this.j.f(j3);
                    a.a.a.a.v0.m.l1.a.a(this.j, this.i);
                    this.j.close();
                }
            } else {
                this.f5371d.a(this.f5373f, j2);
            }
            this.f5370c.f();
            return;
        }
        throw new IOException("closed");
    }
}

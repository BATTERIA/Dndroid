package g;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements x {

    /* renamed from: c  reason: collision with root package name */
    public int f5443c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final g f5444d;

    /* renamed from: e  reason: collision with root package name */
    public final Inflater f5445e;

    /* renamed from: f  reason: collision with root package name */
    public final m f5446f;

    /* renamed from: g  reason: collision with root package name */
    public final CRC32 f5447g = new CRC32();

    public l(x xVar) {
        if (xVar != null) {
            this.f5445e = new Inflater(true);
            g a2 = o.a(xVar);
            this.f5444d = a2;
            this.f5446f = new m(a2, this.f5445e);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void a(e eVar, long j, long j2) {
        t tVar = eVar.f5427c;
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
            int i3 = (int) (((long) tVar.b) + j);
            int min = (int) Math.min((long) (tVar.f5466c - i3), j2);
            this.f5447g.update(tVar.f5465a, i3, min);
            j2 -= (long) min;
            tVar = tVar.f5469f;
            j = 0;
        }
    }

    public final void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    @Override // g.x
    public long c(e eVar, long j) {
        long j2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f5443c == 0) {
                this.f5444d.d(10);
                byte f2 = this.f5444d.b().f(3);
                boolean z = ((f2 >> 1) & 1) == 1;
                if (z) {
                    a(this.f5444d.b(), 0, 10);
                }
                a("ID1ID2", 8075, this.f5444d.readShort());
                this.f5444d.skip(8);
                if (((f2 >> 2) & 1) == 1) {
                    this.f5444d.d(2);
                    if (z) {
                        a(this.f5444d.b(), 0, 2);
                    }
                    long d2 = (long) this.f5444d.b().d();
                    this.f5444d.d(d2);
                    if (z) {
                        j2 = d2;
                        a(this.f5444d.b(), 0, d2);
                    } else {
                        j2 = d2;
                    }
                    this.f5444d.skip(j2);
                }
                if (((f2 >> 3) & 1) == 1) {
                    long a2 = this.f5444d.a((byte) 0);
                    if (a2 != -1) {
                        if (z) {
                            a(this.f5444d.b(), 0, a2 + 1);
                        }
                        this.f5444d.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((f2 >> 4) & 1) == 1) {
                    long a3 = this.f5444d.a((byte) 0);
                    if (a3 != -1) {
                        if (z) {
                            a(this.f5444d.b(), 0, a3 + 1);
                        }
                        this.f5444d.skip(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", this.f5444d.d(), (short) ((int) this.f5447g.getValue()));
                    this.f5447g.reset();
                }
                this.f5443c = 1;
            }
            if (this.f5443c == 1) {
                long j3 = eVar.f5428d;
                long c2 = this.f5446f.c(eVar, j);
                if (c2 != -1) {
                    a(eVar, j3, c2);
                    return c2;
                }
                this.f5443c = 2;
            }
            if (this.f5443c == 2) {
                a("CRC", this.f5444d.h(), (int) this.f5447g.getValue());
                a("ISIZE", this.f5444d.h(), (int) this.f5445e.getBytesWritten());
                this.f5443c = 3;
                if (!this.f5444d.i()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @Override // g.x
    public y c() {
        return this.f5444d.c();
    }

    @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5446f.close();
    }
}

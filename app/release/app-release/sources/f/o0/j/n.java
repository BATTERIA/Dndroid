package f.o0.j;

import f.o0.j.d;
import g.e;
import g.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class n implements Closeable {
    public static final Logger i = Logger.getLogger(e.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final f f5308c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5309d;

    /* renamed from: e  reason: collision with root package name */
    public final e f5310e;

    /* renamed from: f  reason: collision with root package name */
    public int f5311f = 16384;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5312g;

    /* renamed from: h  reason: collision with root package name */
    public final d.b f5313h;

    public n(f fVar, boolean z) {
        this.f5308c = fVar;
        this.f5309d = z;
        e eVar = new e();
        this.f5310e = eVar;
        this.f5313h = new d.b(eVar);
    }

    public synchronized void a() {
        if (this.f5312g) {
            throw new IOException("closed");
        } else if (this.f5309d) {
            if (i.isLoggable(Level.FINE)) {
                i.fine(f.o0.e.a(">> CONNECTION %s", e.f5221a.b()));
            }
            this.f5308c.write(e.f5221a.j());
            this.f5308c.flush();
        }
    }

    public synchronized void a(int i2, long j) {
        if (this.f5312g) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            a(i2, 4, (byte) 8, (byte) 0);
            this.f5308c.writeInt((int) j);
            this.f5308c.flush();
        }
    }

    public synchronized void a(int i2, b bVar) {
        if (this.f5312g) {
            throw new IOException("closed");
        } else if (bVar.f5198c != -1) {
            a(i2, 4, (byte) 3, (byte) 0);
            this.f5308c.writeInt(bVar.f5198c);
            this.f5308c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(int i2, b bVar, byte[] bArr) {
        if (this.f5312g) {
            throw new IOException("closed");
        } else if (bVar.f5198c != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f5308c.writeInt(i2);
            this.f5308c.writeInt(bVar.f5198c);
            if (bArr.length > 0) {
                this.f5308c.write(bArr);
            }
            this.f5308c.flush();
        } else {
            e.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void a(q qVar) {
        if (!this.f5312g) {
            int i2 = this.f5311f;
            if ((qVar.f5320a & 32) != 0) {
                i2 = qVar.b[5];
            }
            this.f5311f = i2;
            int i3 = -1;
            if (((qVar.f5320a & 2) != 0 ? qVar.b[1] : -1) != -1) {
                d.b bVar = this.f5313h;
                if ((qVar.f5320a & 2) != 0) {
                    i3 = qVar.b[1];
                }
                if (bVar != null) {
                    int min = Math.min(i3, 16384);
                    int i4 = bVar.f5217e;
                    if (i4 != min) {
                        if (min < i4) {
                            bVar.f5215c = Math.min(bVar.f5215c, min);
                        }
                        bVar.f5216d = true;
                        bVar.f5217e = min;
                        int i5 = bVar.i;
                        if (min < i5) {
                            if (min == 0) {
                                bVar.a();
                            } else {
                                bVar.a(i5 - min);
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f5308c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, int i3) {
        if (!this.f5312g) {
            a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f5308c.writeInt(i2);
            this.f5308c.writeInt(i3);
            this.f5308c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void b(int i2, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f5311f, j);
            long j2 = (long) min;
            j -= j2;
            a(i2, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f5308c.a(this.f5310e, j2);
        }
    }

    public synchronized void b(q qVar) {
        if (!this.f5312g) {
            a(0, Integer.bitCount(qVar.f5320a) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            while (i2 < 10) {
                boolean z = true;
                if (((1 << i2) & qVar.f5320a) == 0) {
                    z = false;
                }
                if (z) {
                    this.f5308c.writeShort(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f5308c.writeInt(qVar.b[i2]);
                }
                i2++;
            }
            this.f5308c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5312g = true;
        this.f5308c.close();
    }

    public synchronized void flush() {
        if (!this.f5312g) {
            this.f5308c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, e eVar, int i3) {
        if (!this.f5312g) {
            a(i2, i3, (byte) 0, z ? (byte) 1 : 0);
            if (i3 > 0) {
                this.f5308c.a(eVar, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void a(int i2, int i3, byte b, byte b2) {
        if (i.isLoggable(Level.FINE)) {
            i.fine(e.a(false, i2, i3, b, b2));
        }
        int i4 = this.f5311f;
        if (i3 > i4) {
            e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            f fVar = this.f5308c;
            fVar.writeByte((i3 >>> 16) & 255);
            fVar.writeByte((i3 >>> 8) & 255);
            fVar.writeByte(i3 & 255);
            this.f5308c.writeByte(b & 255);
            this.f5308c.writeByte(b2 & 255);
            this.f5308c.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            e.a("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void a(boolean z, int i2, List<c> list) {
        if (!this.f5312g) {
            this.f5313h.a(list);
            long j = this.f5310e.f5428d;
            int min = (int) Math.min((long) this.f5311f, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i2, min, (byte) 1, b);
            this.f5308c.a(this.f5310e, j2);
            if (j > j2) {
                b(i2, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i2, int i3, List<c> list) {
        if (!this.f5312g) {
            this.f5313h.a(list);
            long j = this.f5310e.f5428d;
            int min = (int) Math.min((long) (this.f5311f - 4), j);
            long j2 = (long) min;
            a(i2, min + 4, (byte) 5, j == j2 ? (byte) 4 : 0);
            this.f5308c.writeInt(i3 & Integer.MAX_VALUE);
            this.f5308c.a(this.f5310e, j2);
            if (j > j2) {
                b(i2, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }
}

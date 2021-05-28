package g;

import e.a.a.a.a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class s implements g {

    /* renamed from: c  reason: collision with root package name */
    public final e f5462c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final x f5463d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5464e;

    public s(x xVar) {
        if (xVar != null) {
            this.f5463d = xVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // g.g
    public int a(q qVar) {
        if (!this.f5464e) {
            do {
                int a2 = this.f5462c.a(qVar, true);
                if (a2 == -1) {
                    return -1;
                }
                if (a2 != -2) {
                    this.f5462c.skip((long) qVar.f5457c[a2].h());
                    return a2;
                }
            } while (this.f5463d.c(this.f5462c, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.g
    public long a(byte b) {
        return a(b, 0, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        if (this.f5464e) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        } else {
            while (j < j2) {
                long a2 = this.f5462c.a(b, j, j2);
                if (a2 == -1) {
                    e eVar = this.f5462c;
                    long j3 = eVar.f5428d;
                    if (j3 >= j2 || this.f5463d.c(eVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a2;
                }
            }
            return -1;
        }
    }

    @Override // g.g
    public String a(Charset charset) {
        if (charset != null) {
            this.f5462c.a(this.f5463d);
            e eVar = this.f5462c;
            if (eVar != null) {
                try {
                    return eVar.a(eVar.f5428d, charset);
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    @Override // g.g
    public e b() {
        return this.f5462c;
    }

    @Override // g.g
    public h b(long j) {
        if (f(j)) {
            return this.f5462c.b(j);
        }
        throw new EOFException();
    }

    @Override // g.x
    public long c(e eVar, long j) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f5464e) {
            e eVar2 = this.f5462c;
            if (eVar2.f5428d == 0 && this.f5463d.c(eVar2, 8192) == -1) {
                return -1;
            }
            return this.f5462c.c(eVar, Math.min(j, this.f5462c.f5428d));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // g.x
    public y c() {
        return this.f5463d.c();
    }

    @Override // g.g
    public String c(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return this.f5462c.g(a2);
            }
            if (j2 < Long.MAX_VALUE && f(j2) && this.f5462c.f(j2 - 1) == 13 && f(1 + j2) && this.f5462c.f(j2) == 10) {
                return this.f5462c.g(j2);
            }
            e eVar = new e();
            e eVar2 = this.f5462c;
            eVar2.a(eVar, 0, Math.min(32L, eVar2.f5428d));
            StringBuilder a3 = a.a("\\n not found: limit=");
            a3.append(Math.min(this.f5462c.f5428d, j));
            a3.append(" content=");
            a3.append(eVar.m().b());
            a3.append((char) 8230);
            throw new EOFException(a3.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // g.x, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f5464e) {
            this.f5464e = true;
            this.f5463d.close();
            this.f5462c.k();
        }
    }

    @Override // g.g
    public short d() {
        d(2);
        return this.f5462c.d();
    }

    @Override // g.g
    public void d(long j) {
        if (!f(j)) {
            throw new EOFException();
        }
    }

    @Override // g.g
    public byte[] e(long j) {
        if (f(j)) {
            return this.f5462c.e(j);
        }
        throw new EOFException();
    }

    public boolean f(long j) {
        e eVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f5464e) {
            do {
                eVar = this.f5462c;
                if (eVar.f5428d >= j) {
                    return true;
                }
            } while (this.f5463d.c(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // g.g
    public String g() {
        return c(Long.MAX_VALUE);
    }

    @Override // g.g
    public e getBuffer() {
        return this.f5462c;
    }

    @Override // g.g
    public int h() {
        d(4);
        return this.f5462c.h();
    }

    @Override // g.g
    public boolean i() {
        if (!this.f5464e) {
            return this.f5462c.i() && this.f5463d.c(this.f5462c, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f5464e;
    }

    @Override // g.g
    public long j() {
        d(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!f((long) i2)) {
                break;
            }
            byte f2 = this.f5462c.f((long) i);
            if ((f2 >= 48 && f2 <= 57) || ((f2 >= 97 && f2 <= 102) || (f2 >= 65 && f2 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(f2)));
            }
        }
        return this.f5462c.j();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        e eVar = this.f5462c;
        if (eVar.f5428d == 0 && this.f5463d.c(eVar, 8192) == -1) {
            return -1;
        }
        return this.f5462c.read(byteBuffer);
    }

    @Override // g.g
    public byte readByte() {
        d(1);
        return this.f5462c.readByte();
    }

    @Override // g.g
    public void readFully(byte[] bArr) {
        try {
            d((long) bArr.length);
            this.f5462c.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                e eVar = this.f5462c;
                long j = eVar.f5428d;
                if (j > 0) {
                    int a2 = eVar.a(bArr, i, (int) j);
                    if (a2 != -1) {
                        i += a2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    @Override // g.g
    public int readInt() {
        d(4);
        return this.f5462c.readInt();
    }

    @Override // g.g
    public long readLong() {
        d(8);
        return this.f5462c.readLong();
    }

    @Override // g.g
    public short readShort() {
        d(2);
        return this.f5462c.readShort();
    }

    @Override // g.g
    public void skip(long j) {
        if (!this.f5464e) {
            while (j > 0) {
                e eVar = this.f5462c;
                if (eVar.f5428d == 0 && this.f5463d.c(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f5462c.f5428d);
                this.f5462c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder a2 = a.a("buffer(");
        a2.append(this.f5463d);
        a2.append(")");
        return a2.toString();
    }

    @Override // g.g
    public void b(e eVar, long j) {
        try {
            if (f(j)) {
                e eVar2 = this.f5462c;
                long j2 = eVar2.f5428d;
                if (j2 >= j) {
                    eVar.a(eVar2, j);
                } else {
                    eVar.a(eVar2, j2);
                    throw new EOFException();
                }
            } else {
                throw new EOFException();
            }
        } catch (EOFException e2) {
            eVar.a(this.f5462c);
            throw e2;
        }
    }
}

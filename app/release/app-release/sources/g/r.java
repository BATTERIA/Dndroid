package g;

import e.a.a.a.a;
import java.nio.ByteBuffer;

public final class r implements f {

    /* renamed from: c  reason: collision with root package name */
    public final e f5459c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final w f5460d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5461e;

    public r(w wVar) {
        if (wVar != null) {
            this.f5460d = wVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // g.f
    public f a(long j) {
        if (!this.f5461e) {
            this.f5459c.a(j);
            return e();
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f a(String str) {
        if (!this.f5461e) {
            this.f5459c.a(str);
            e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.w
    public void a(e eVar, long j) {
        if (!this.f5461e) {
            this.f5459c.a(eVar, j);
            e();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public e b() {
        return this.f5459c;
    }

    @Override // g.w
    public y c() {
        return this.f5460d.c();
    }

    @Override // g.w, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        Throwable th;
        if (!this.f5461e) {
            try {
                if (this.f5459c.f5428d > 0) {
                    this.f5460d.a(this.f5459c, this.f5459c.f5428d);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f5460d.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f5461e = true;
            if (th != null) {
                z.a(th);
                throw null;
            }
        }
    }

    @Override // g.f
    public f e() {
        if (!this.f5461e) {
            long l = this.f5459c.l();
            if (l > 0) {
                this.f5460d.a(this.f5459c, l);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f f() {
        if (!this.f5461e) {
            e eVar = this.f5459c;
            long j = eVar.f5428d;
            if (j > 0) {
                this.f5460d.a(eVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.w, g.f, java.io.Flushable
    public void flush() {
        if (!this.f5461e) {
            e eVar = this.f5459c;
            long j = eVar.f5428d;
            if (j > 0) {
                this.f5460d.a(eVar, j);
            }
            this.f5460d.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f5461e;
    }

    public String toString() {
        StringBuilder a2 = a.a("buffer(");
        a2.append(this.f5460d);
        a2.append(")");
        return a2.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f5461e) {
            int write = this.f5459c.write(byteBuffer);
            e();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f write(byte[] bArr) {
        if (!this.f5461e) {
            this.f5459c.write(bArr);
            e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f write(byte[] bArr, int i, int i2) {
        if (!this.f5461e) {
            this.f5459c.write(bArr, i, i2);
            e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f writeByte(int i) {
        if (!this.f5461e) {
            this.f5459c.writeByte(i);
            return e();
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f writeInt(int i) {
        if (!this.f5461e) {
            this.f5459c.writeInt(i);
            return e();
        }
        throw new IllegalStateException("closed");
    }

    @Override // g.f
    public f writeShort(int i) {
        if (!this.f5461e) {
            this.f5459c.writeShort(i);
            e();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
